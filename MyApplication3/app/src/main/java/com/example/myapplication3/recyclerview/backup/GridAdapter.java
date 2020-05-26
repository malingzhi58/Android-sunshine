package com.example.myapplication3.recyclerview.backup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication3.R;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder>
{
    private Context mContext;
    private OnItemClickListener mListener;
    private OnItemLongClickListener mLonglistener;

    public GridAdapter(Context context, OnItemClickListener listener)
    {
        this.mContext = context;
        this.mListener = listener;
    }


    @Override
    public LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item, parent, false));

    }

    @Override
    public void onBindViewHolder(LinearViewHolder holder, int position) {
        holder.textView.setText("helloHor");
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
        private TextView textView;

        public LinearViewHolder( View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }
    public interface OnItemClickListener
    {
        void onClick(int pos);
    }
    public interface OnItemLongClickListener
    {
        void onClick(int pos);
    }
}
