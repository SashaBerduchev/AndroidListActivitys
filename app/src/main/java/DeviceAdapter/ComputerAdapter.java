package DeviceAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.androidlistactivitys.R;
import com.jjoe64.graphview.GraphView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import Device.Computers;


public class ComputerAdapter extends RecyclerView.Adapter<ComputerAdapter.ViewHolder> {


    private ArrayList<Computers> computersArrayList;

    public ComputerAdapter(ArrayList<Computers> list){computersArrayList = list;}

    @NonNull
    @Override
    public ComputerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.computer_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Name.setText(computersArrayList.get(position).getName());
        holder.Model.setText(computersArrayList.get(position).getModel());
        holder.Processor.setText(computersArrayList.get(position).getProcessor());
        holder.Cores.setText(computersArrayList.get(position).getCores());
        holder.Graphics.setText(computersArrayList.get(position).getGrafics());
        holder.Cost.setText(computersArrayList.get(position).getCost());

    }

    @Override
    public int getItemCount() {
        return computersArrayList.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{

        TextView Name;
        TextView Model;
        TextView Processor;
        TextView Cores;
        TextView Graphics;
        TextView Cost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.rv_computer_name);
            Model = itemView.findViewById(R.id.rv_computer_model);
            Processor = itemView.findViewById(R.id.rv_computer_proccessor);
            Cores = itemView.findViewById(R.id.rv_computer_cost);
            Graphics = itemView.findViewById(R.id.rv_computer_graphicscore);
            Cost = itemView.findViewById(R.id.rv_computer_battery);
        }
    }

}
