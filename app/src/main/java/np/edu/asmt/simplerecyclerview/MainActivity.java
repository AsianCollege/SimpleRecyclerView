package np.edu.asmt.simplerecyclerview;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements RecyclerViewAdapter.OnItemClickListener{

    private RecyclerView myRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerViewAdapter myRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        myRecyclerView = new RecyclerView(this);

        linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        /*
        linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        */

        myRecyclerViewAdapter = new RecyclerViewAdapter(this);
        myRecyclerViewAdapter.setOnItemClickListener(this);
        myRecyclerView.setAdapter(myRecyclerViewAdapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);

        setContentView(myRecyclerView);

        //insert dummy items
        myRecyclerViewAdapter.add(0, "Bibes");
        myRecyclerViewAdapter.add(1, "Sujan");
        myRecyclerViewAdapter.add(2, "Kapil");
        myRecyclerViewAdapter.add(3, "Bishwo");
        myRecyclerViewAdapter.add(4, "Manila");
        myRecyclerViewAdapter.add(5, "Ananta");
        myRecyclerViewAdapter.add(6, "Bhawana");
    }

    @Override
    public void onItemClick(RecyclerViewAdapter.ItemHolder item, int position) {
        Toast.makeText(this,
                position + " : " + item.getItemName(),
                Toast.LENGTH_SHORT).show();
    }
}
