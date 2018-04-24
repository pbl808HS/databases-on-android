package com.dpc_team.pbl.myrecipes.Adapters;

import android.content.*;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dpc_team.pbl.myrecipes.Models.Recipe;
import com.dpc_team.pbl.myrecipes.R;

import java.util.List;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.ViewHolder> {

    Context context;
    List<Recipe> recipes;

    public RecipesAdapter(Context context, List<Recipe> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipeitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // asignar la informacion de recetas a cada componente del recycler view
        holder.tvName.setText(recipes.get(position).getName());
        holder.tvMaking.setText(recipes.get(position).getMaking());
        holder.tvDescription.setText(recipes.get(position).getDescription());
        holder.tvPeople.setText("Personas:" + String.valueOf(recipes.get(position).getPeople()));
    }

    @Override
    public int getItemCount() {
        // retornar el tamaño del list de recetas
        return recipes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageView;
        TextView tvName, tvPeople, tvDescription, tvMaking;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cvRItem);
            imageView = (ImageView) itemView.findViewById(R.id.ivRItem);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvPeople = (TextView) itemView.findViewById(R.id.tvPeople);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            tvMaking = (TextView) itemView.findViewById(R.id.tvMaking);
        }

    }
}
