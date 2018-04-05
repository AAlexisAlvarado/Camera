package alexis.tecsup.edu.pe.camera;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by alexi on 4/04/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    private ArrayList<Menu>listaMenu;
    private OnClickRecycler listener;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptador,parent,false);

        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Menu menu=listaMenu.get(position);
        holder.bind(menu,listener);
    }

    @Override
    public int getItemCount() {
        return listaMenu.size();
    }


    public interface OnClickRecycler{
        void OnclickItemRecyler(Menu menu);
    }

    public RecyclerAdapter(ArrayList<Menu>listaMenu,OnClickRecycler listener){

        this.listaMenu=listaMenu;
        this.listener=listener;

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imagengaleria);
        }


        public void bind(final Menu menu, final OnClickRecycler listener){

            Glide.with(imageView.getContext()).load(menu.getIdImagen()).into(imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    listener.OnclickItemRecyler(menu);
                }
            });
        }
    }
}
