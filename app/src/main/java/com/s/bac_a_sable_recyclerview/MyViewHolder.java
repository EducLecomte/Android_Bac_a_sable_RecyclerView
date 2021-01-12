package com.s.bac_a_sable_recyclerview;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;


public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView tvview;
    private Button btnview;

    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);
        //c'est ici que l'on fait nos findView
        tvview = (TextView) itemView.findViewById(R.id.tv_card);
        btnview = (Button) itemView.findViewById(R.id.btn_card);
    }

    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(MyObject myObject){
        tvview.setText(myObject.getText());
        btnview.setText(myObject.getInteger().toString());
    }
}