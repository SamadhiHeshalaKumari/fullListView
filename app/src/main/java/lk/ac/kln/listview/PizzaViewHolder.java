package lk.ac.kln.listview;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PizzaViewHolder extends RecyclerView.ViewHolder{

    LinearLayout linearLayout;
    TextView name;
    TextView price;
    TextView description;
    ImageView image;


    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);

        linearLayout = itemView.findViewById(R.id.linearlayout11);
        name = itemView.findViewById(R.id.name);
        price = itemView.findViewById(R.id.price);
        description = itemView.findViewById(R.id.description);
        image = itemView.findViewById(R.id.imageView);
    }
}
