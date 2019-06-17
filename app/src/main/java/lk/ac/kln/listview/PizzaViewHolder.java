package lk.ac.kln.listview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout relativeLayout;
    public TextView textView;

    public PizzaViewHolder( View itemView){
        super(itemView);
        relativeLayout = itemView.findViewById(R.id.listItem);
        textView = itemView.findViewById(R.id.textView);
    }

}
