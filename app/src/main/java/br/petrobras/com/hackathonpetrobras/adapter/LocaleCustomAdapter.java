package br.petrobras.com.hackathonpetrobras.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import br.petrobras.com.hackathonpetrobras.R;
import br.petrobras.com.hackathonpetrobras.model.Locale;

/**
 * Created by matheuscatossi on 01/10/17.
 */

public class LocaleCustomAdapter extends ArrayAdapter<Locale> implements View.OnClickListener {

    private ArrayList<Locale> dataSet;
    private Context mContext;

    @Override
    public void onClick(View v) {

    }

    private static class ViewHolder {
        TextView cod_cliente;
        TextView nom_apelido;
        LinearLayout ll_line;
    }

    public LocaleCustomAdapter(ArrayList<Locale> data, Context context) {
        super(context, R.layout.row_item_locale, data);

        this.dataSet = data;
        this.mContext = context;
    }

    private int lastPosition = -1;

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        final Locale locale = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item_locale, parent, false);

            viewHolder.cod_cliente = (TextView) convertView.findViewById(R.id.cod_cliente);
            viewHolder.nom_apelido = (TextView) convertView.findViewById(R.id.nom_apelido);


            viewHolder.ll_line = (LinearLayout) convertView.findViewById(R.id.ll_line);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.cod_cliente.setText("" + locale.getCOD_CLIENTE());
        viewHolder.nom_apelido.setText("" + locale.getNOM_APELIDO());

        viewHolder.ll_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
            }
        });

        return convertView;
    }
}