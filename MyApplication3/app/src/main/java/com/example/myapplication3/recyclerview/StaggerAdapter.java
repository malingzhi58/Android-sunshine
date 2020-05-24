package com.example.myapplication3.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication3.R;


public class StaggerAdapter extends RecyclerView.Adapter<StaggerAdapter.LinearViewHolder>
{
    private Context mContext;
    private OnItemClickListener mListener;

    public StaggerAdapter(Context context, OnItemClickListener listener)
    {
        this.mContext = context;
        this.mListener = listener;
    }


    @Override
    public StaggerAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_stagger_item, parent, false));

    }

    @Override
    public void onBindViewHolder(StaggerAdapter.LinearViewHolder holder, int position) {
//        holder.textView.setText("helloHor");
        if(position%2==0){
            holder.imageView.setImageResource(R.drawable.image1);
        }else{
            holder.imageView.setImageResource(R.drawable.image2);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
//                Toast.makeText(mContext,"click"+position,Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
//        private TextView textView;
        private ImageView imageView;
        public LinearViewHolder( View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tv_title);
        }
    }
    public interface OnItemClickListener
    {
        void onClick(int pos);
    }

}
