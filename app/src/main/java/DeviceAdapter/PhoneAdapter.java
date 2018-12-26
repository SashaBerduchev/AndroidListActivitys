package DeviceAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.androidlistactivitys.R;

import java.util.ArrayList;

import Device.Phones;


public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder> {


    private ArrayList<Phones> phonesArrayList;

    public PhoneAdapter(ArrayList<Phones> list){phonesArrayList = list;}


    @NonNull
    @Override
    public PhoneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneAdapter.ViewHolder viewHolder, int position) {
        viewHolder.Name.setText(phonesArrayList.get(position).getName());
        viewHolder.Model.setText(phonesArrayList.get(position).getModel());
        viewHolder.Processor.setText(phonesArrayList.get(position).getProcessor());
        viewHolder.Ram.setText(phonesArrayList.get(position).getRam());
        viewHolder.Graphics.setText(phonesArrayList.get(position).getGrapficscore());
        viewHolder.Battery.setText(phonesArrayList.get(position).getBattery());
        viewHolder.Cost.setText(phonesArrayList.get(position).getCost());

    }

    @Override
    public int getItemCount() {
        return phonesArrayList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {

       TextView Name;
       TextView Model;
       TextView Processor;
       TextView Ram;
       TextView Graphics;
       TextView Battery;
       TextView Cost;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           Name = itemView.findViewById(R.id.rv_computer_name);
           Model = itemView.findViewById(R.id.rv_computer_model);
           Processor = itemView.findViewById(R.id.rv_computer_proccessor);
           Ram = itemView.findViewById(R.id.rv_computer_ram);
           Graphics = itemView.findViewById(R.id.rv_computer_graphicscore);
           Battery = itemView.findViewById(R.id.rv_computer_battery);
           Cost = itemView.findViewById(R.id.rv_phone_cost);
       }
   }
}
