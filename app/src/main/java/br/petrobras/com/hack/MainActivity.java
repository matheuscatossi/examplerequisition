package br.petrobras.com.hackathonpetrobras;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import br.petrobras.com.hackathonpetrobras.adapter.LocaleCustomAdapter;
import br.petrobras.com.hackathonpetrobras.model.Locale;
import br.petrobras.com.hackathonpetrobras.webservice.APIClient;
import br.petrobras.com.hackathonpetrobras.webservice.APIInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private Call<ArrayList<Locale>> callLocale;
    //private Call<Locale> callMania;
    private APIInterface apiService;
    private ArrayList<Locale> l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ListView listViewLocale;
        listViewLocale = (ListView) findViewById(R.id.listLocale);

        l = new ArrayList<Locale>();

        apiService = APIClient.getService().create(APIInterface.class);
        callLocale = apiService.getLocale();
        //callMania = apiService.getBrMania();


        final Context context = this.getApplicationContext();

        Log.e("request", "" + callLocale.request().toString());

        callLocale.enqueue(new Callback<ArrayList<Locale>>() {
            @Override
            public void onResponse(Call<ArrayList<Locale>> call, Response<ArrayList<Locale>> response) {

                ArrayList<Locale> locales = response.body();

                for (Locale locale : locales) {
                    l.add(locale);
                }

                LocaleCustomAdapter localeCustomAdapter;
                localeCustomAdapter = new LocaleCustomAdapter(l, context);

                listViewLocale.setAdapter(localeCustomAdapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Locale>> call, Throwable t) {
                Log.e("Networking", t.toString());

            }
        });

//        callMain.enqueue(new Callback<Locale>() {
//            @Override
//            public void onResponse(Call<ArrayList<Locale>> call, Response<ArrayList<Locale>> response) {
//
//                Locale locales = response.body();
//
//                tv_nome_cliente = locales.getNomeCliente();
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Locale>> call, Throwable t) {
//                Log.e("Networking", t.toString());
//
//            }
//        });


    }
}
