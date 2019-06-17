package lk.ac.kln.listview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PizzaAdapter  extends RecyclerView.Adapter<PizzaViewHolder> {

    String PizzaDetails[] = {"Pizza One", "Pizza Two", "Pizza Three"};

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item, null);
        PizzaViewHolder vh = new PizzaViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder pizzaViewHolder, int i) {
        pizzaViewHolder.name.setText(PizzaDetails[i]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
