package com.example.mystdapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StdAdapter extends RecyclerView.Adapter<StdAdapter.StdVh> {

    Context context ;
    List<Student> stud ;

    public StdAdapter(Context context  ,  List<Student> stud) {
        this.context = context;
        this.stud = stud;
    }

    @NonNull
    @Override
    public StdVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_std ,parent , false );
        return new StdVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StdVh holder, int position) {
        holder.setData(stud.get(position));
    }

    @Override
    public int getItemCount() {
        return stud.size();
    }


    class StdVh extends RecyclerView.ViewHolder{

        TextView std_name , std_id  , std_email ,std_address ,std_phone ,std_type ,std_birthdate;
        public StdVh(@NonNull View itemView) {
            super(itemView);
            std_name = itemView.findViewById(R.id.std_name);
            std_id = itemView.findViewById(R.id.std_id);
            std_email = itemView.findViewById(R.id.std_email);
            std_address = itemView.findViewById(R.id.std_address);
            std_phone = itemView.findViewById(R.id.std_phone);
            std_type = itemView.findViewById(R.id.std_type);
            std_birthdate = itemView.findViewById(R.id.std_birthdate);


        }

        public void setData(final Student std) {
            std_name.setText(std.getName());
            std_id.setText(std.getId());
            std_email.setText(std.getEmail());
            std_address.setText(std.getAddress());
            std_phone.setText(std.getPhone());
            std_type.setText(std.getType());
            std_birthdate.setText(std.getBirthdate());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, std.getName(), Toast.LENGTH_SHORT).show();
                    Intent  intent = new Intent(itemView.getContext() ,StdActivity.class);
                    intent.putExtra("id",std.getId());
                    intent.putExtra("Name",std.getName());
                    intent.putExtra("type",std.getType());
                    intent.putExtra("email",std.getEmail());
                    intent.putExtra("phone",std.getPhone());
                    intent.putExtra("address",std.getAddress());
                    intent.putExtra("birthdate",std.getBirthdate());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
