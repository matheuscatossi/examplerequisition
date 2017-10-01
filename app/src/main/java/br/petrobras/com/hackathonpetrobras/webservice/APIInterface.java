package br.petrobras.com.hackathonpetrobras.webservice;


import java.util.ArrayList;
import java.util.List;

import br.petrobras.com.hackathonpetrobras.model.Locale;
import br.petrobras.com.hackathonpetrobras.utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by matheuscatossi on 01/10/17.
 */

public interface APIInterface {

    @GET(Constants.GET_LOCALE)
    Call<ArrayList<Locale>> getLocale();


}