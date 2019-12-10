package com.example.eplhead_to_headstats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {
    private Button infoButton;
    private Button imageButton;
    private TextView info;
    public List<Integer> learnt = new ArrayList<>();
    private RequestQueue myQueue;
    private int[] idArray = new int[]{ 437323,436455,437848,439844,441226,436451,437094,437519,437545,437102,438641,438640,435965,437983,437968,436205,436057,436101,435737,438849,437372,435723,436433,435969,437326,436083,436064,435909,439343,437506,435906,436229,437516,435973,437521,435877,437179,437980,437517,436594,438118,436595,436593,437586,435872,436062,438954,435622,435593,437450,437261,437526,437053,435660,436792,435810,435756,436441,435857,436832,437191,436831,437039,436081,436023,441755,437657,437760,437627,436063,436090,437549,435590,436575,437344,436616,437299,436208,435962,436830,437084,436248,436817,435809,436060,438465,437449,436061,437849,435967,436535,437078,436014,436896,437304,436795,436752,435851,436567,435641,440727,435770,435848,437079,438373,437973,438013,435614,436085,437515,441967,437518,439344,435972,436653,439346,436099,438816,436021,436114,437473,436093,437348,436492,438953,436952,436241,437057,437157,438417,435989,436987,435707,437937,435626,436192,436951,437655,435684,435991,435964,435751,437512,437914,436013,436010,435923,436638,438813,435966,437305,436833,435879,437431,437991,436525,437211,436025,435907,437042,435905,436100,437433,435584,437764,437941,438449,437436,438820,437781,437256,437040,437647,438338,437514,436558,437229,437520,436826,437097,437426,435655,436859,437628,437547,437235,436863,437093,437190,437010,436324,435885,437548,436652,435985,437300,436966,437975,436086,436632,437316,436088,436555,435874,435968,435878,437998,435970,437821,437074,437080,436827,436971,437269,437683,437685,437697,437776,436940,437347,437307,436410,437461,437923,435750,438821,435573,438510,435986,436849,438738,437827,436454,436005,436518,437994,436282,435908,438025,436435,437101,435922,437523,435765,437059,437588,436190,436104,437192,435615,437682,435976,437935,436257,437371,436568,788905,437674,435581,438635,436042,438643,437257,436003,437535,437099,436089,678013,438545,435988,435981,435975,437658,435963,436489,436516,436115,436052,436559,437156,438169,437546,438642,436570,435983,438670,437095,437098,437283,436017,438677,435813,437660,441769,435683,437481,438127,436056,436098,436325,435921,438128,435621,435898,435738,438644,436011,435984,437854,437525,435772,437231,435724,436084,436040,435980,437611,437081,435745,436521,634108,436037,438605,436671,437477,436107,437868,437639,436243,439631,437301,435990,435978,436761,435682,436448,437303,436009,435859,435647,437852,436917,435632,437349,436861,436603,438688,436647,437158,436648,438106,436577,438761,438024,436020,437468,437847,438818,437876,436177,436422,438110,436494,437652,438947,437656,438951,438590,437508,436965,437759,437589,657683,436892,435764,437654,439553,436317,437216,436180,437479,441357,671456,435600,438159,439977,435570,437820,437912,436287,436846,436480,435961,435734,435880,626692,435585,436836,435673,437686,747607,436041,437292,437430,436278,438015,435987,437260,438445,436193,437504,437096,436195,436319,436279,436692,437346,436181,442761,780292,439081,437475,435841,437585,437922,436793,435974,435640,437472,436723,435842,436173,440568,437955,436102,436685,437383,435971,435977,437863,436597,437055,436440,435664,435904,438551,437926,438011,435633,436878,437352,436199,435638,437632,436079,439118,437302,437640,437460,436286,436191,436118,435979,441364,770595,435882,437536,437054,436691,436024,436820,437587,436201,436200,440725,435871,437234,437850,435651,679844,437633,436891,436092,437770,435769,437846,435644,435766,437067,435739,437244,437826,437315,437306,436416,436449,437507,436596,435722,769294,435678,436334,437345,436022,437212,437359,436288,655744,435643,436556,435672,437444,437262,437885,436543,436120,438616,437434,438000,438010,435853,436532,438387,437153,436782,437890,782305,438139,437090,436524,435725,436336,437427,436080,438136,437329,437457,435703,435749,437193,437082,437203,436910,436615,436235,435746,436528,436175,436144,436126,437392,440368,440342,435896,437607,437680,437331,436686,437380,435701,435867,437017,437891,436183,435868,438144,437861,437342,437328,702752,436994,435665,438028,437701,437277,435729,435897,437984,437969,437358,436149,436065,437771,435775,436176,437925,436070,436560,435873,437327,436536,436557,437860,437330,437373,436485,435627,436103,436848,436702,437051,437026,435899,437970,436821,436760,436657,435917,436573,437454,435843,436687,436866,436413,436642,437936,437784,436944,436044,437202,437598,437489,436689,437230,437061,436302,437255,437509,437942,438385,436894,436604,436331,436332,436411,435642,436526,437250,436445,437972,436026,437492,436553,435838,437892,436554 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.text_view_result);
        infoButton = findViewById(R.id.button_parse);
        imageButton = findViewById(R.id.imageButton);
        myQueue = Volley.newRequestQueue(this);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jsonParse();
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openImagePage();
            }
        });
    }

    public int randomID(int[] a) {
        int randomInt = a[new Random().nextInt(a.length)];
        return randomInt;
    }

    public void openImagePage() {
        Intent intent = new Intent(this, imagePage.class);
        startActivity(intent);
    }

    public void jsonParse() {
        int learning = randomID(idArray);
        String url = "https://collectionapi.metmuseum.org/public/collection/v1/objects/" + learning;
        learnt.add(learning);
        info.setText(url);
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String date = response.getString("objectDate");
                            String artistName = response.getString("artistDisplayName");
                            String pictureName = response.getString("title");
                            info.setText("date: " + date + "\n " + "name; " + artistName + "\n" + "title; " + pictureName);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        myQueue.add(request);
    }
}