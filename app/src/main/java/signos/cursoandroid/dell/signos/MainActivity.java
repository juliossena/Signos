package signos.cursoandroid.dell.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaDeSignos;
    private String[] signos = {
            "Aries", "Touro", "Gêmios", "Câncer", "Leão",
            "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio",
            "Aquário", "Peixes"
    };

    private String[] perfis = {
            "gosta de A", "Chifrudo", "Irmão igual", "Ruim", "Rei",
            "Não quer ser mais", "Advogado", "Mata", "Homem cavalo", "não sei",
            "Onde fica peixe", "fica na água"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeSignos = (ListView) findViewById(R.id.lista_signos_id);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            signos
        );

        listaDeSignos.setAdapter(adaptador);

        listaDeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), perfis[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
