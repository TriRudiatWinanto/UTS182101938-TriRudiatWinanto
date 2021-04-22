package com.trw.uts182101938;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trw.uts182101938.Model.User;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {
    private Context context;
    private List<User> datalist;

    public Adapter(Context context,List<User> datalist){
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Adapter.AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        AdapterHolder holder = new AdapterHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.AdapterHolder holder, int position) {
        final User user = datalist.get(position);
        int Id = user.getId();
        String Name = user.getName();
        String Username = user.getUsername();
        String Email = user.getEmail();

        holder.tv_id.setText("ID : "+Id);
        holder.tv_name.setText("Name : "+ Name);
        holder.tv_username.setText("UserName : "+Username);
        holder.tv_email.setText("Email : " +Email);

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {
        TextView tv_id,tv_name,tv_username,tv_email;
        public AdapterHolder(@NonNull View itemView){
            super(itemView);

            tv_id = itemView.findViewById(R.id.tv_id);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_username = itemView.findViewById(R.id.tv_username);
            tv_email = itemView.findViewById(R.id.tv_email);
        }
    }
}
