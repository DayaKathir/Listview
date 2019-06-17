package lk.ac.kln.listview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lk.ac.kln.listview.PizzaViewHolder;
import lk.ac.kln.listview.R;

public class PizzaListAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private String pizzaDetails[] = {"Pizza One","Pizza Two","Pizza Three"};

    @Override
    public PizzaViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item1, viewGroup, false);
        PizzaViewHolder vh = new PizzaViewHolder(listItem);
        return vh;
    }

    @Override
    public void onBindViewHolder(PizzaViewHolder holder, final int position){
        holder.textView.setText(pizzaDetails[position]);

    }

    @Override
    public int getItemCount(){
        return pizzaDetails.length;
    }
}
