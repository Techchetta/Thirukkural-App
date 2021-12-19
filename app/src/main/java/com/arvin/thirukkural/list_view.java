package com.arvin.thirukkural;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class list_view extends AppCompatActivity {

    ListView listView;

    String arrname[] = {"குறள்: 1 • கடவுள் வாழ்த்து",
            "குறள்: 2 • கடவுள் வாழ்த்து",
            "குறள்: 3 • கடவுள் வாழ்த்து",
            "குறள்: 4 • கடவுள் வாழ்த்து",
            "குறள்: 5 • கடவுள் வாழ்த்து",
            "குறள்: 6 • கடவுள் வாழ்த்து",
            "குறள்: 7 • கடவுள் வாழ்த்து",
            "குறள்: 8 • கடவுள் வாழ்த்து",
            "குறள்: 9 • கடவுள் வாழ்த்து",
            "குறள்: 10 • கடவுள் வாழ்த்து"};

    String arrmessage[] = {"அகர முதல எழுத்தெல்லாம் ஆதி\nபகவன் முதற்றே உலகு",
            "கற்றதனால் ஆய பயனென்கொல் வாலறிவன்\nநற்றாள் தொழாஅர் எனின்",
            "மலர்மிசை ஏகினான் மாணடி சேர்ந்தார்\nநிலமிசை நீடுவாழ் வார்",
            "வேண்டுதல்வேண் டாமை இலானடி சேர்ந்தார்க்கு\nயாண்டும் இடும்பை இல",
            "இருள்சேர் இருவினையும் சேரா இறைவன்\nபொருள்சேர் புகழ்புரிந்தார் மாட்டு",
            "பொறிவாயில் ஐந்தவித்தான் பொய்தீர் ஒழுக்க\nநெறிநின்றார் நீடுவாழ் வார்",
            "தனக்குவமை இல்லாதான் தாள்சேர்ந்தார்க் கல்லால்\nமனக்கவலை மாற்றல் அரிது",
            "அறவாழி அந்தணன் தாள்சேர்ந்தார்க் கல்லால்\nபிறவாழி நீந்தல் அரிது",
            "கோளில் பொறியின் குணமிலவே எண்குணத்தான்\nதாளை வணங்காத் தலை",
            "பிறவிப் பெருங்கடல் நீந்துவர் நீந்தார்\nஇறைவன் அடிசேரா தார்"};

    String arrmeaning[] = {"எழுத்துக்கள் எல்லாம் அகரத்தை அடிப்படையாக கொண்டிருக்கின்றன. அதுபோல உலகம் கடவுளை அடிப்படையாக கொண்டிருக்கிறது",
            "தூய அறிவு வடிவாக விளங்கும் இறைவனுடைய நல்ல திருவடிகளை தொழாமல் இருப்பாரானால், அவர் கற்ற கல்வியினால் ஆகிய பயன் என்ன?",
            "அன்பரின் அகமாகிய மலரில் வீற்றிருக்கும் கடவுளின் சிறந்த திருவடிகளை பொருந்தி நினைக்கின்றவர், இன்ப உலகில் நிலைத்து வாழ்வார்",
            "விருப்பு வெறுப்பு இல்லாத கடவுளின் திருவடிகளை பொருந்தி நினைக்கின்றவர்க்கு எப்போதும் எவ்விடத்திலும் துன்பம் இல்லை",
            "கடவுளின் உண்மைப் புகழை விரும்பி அன்பு செலுத்துகின்றவரிடம் அறியாமையால் விளையும் இருவகை வினையும் சேர்வதில்லை",
            "ஐம்பொறி வாயிலாக பிறக்கும் வேட்கைகளை அவித்த இறைவனுடைய பொய்யற்ற ஒழுக்க நெறியில் நின்றவர், நிலை பெற்ற நல்வாழ்க்கை வாழ்வர்",
            "தனக்கு ஒப்புமை இல்லாத தலைவனுடைய திருவடிகளைப் பொருந்தி நினைக்கின்றவர் அல்லாமல், மற்றவர்க்கு மனக்கவலையை மாற்ற முடியாது",
            "அறக்கடலாக விளங்கும் கடவுளின் திருவடிகளைப் பொருந்தி நினைக்கின்றவர் அல்லாமல், மற்றவர் பொருளும் இன்பமுமாகிய மற்ற கடல்களைக் கடக்க முடியாது",
            "கேட்காதசெவி, பார்க்காத கண் போன்ற எண் குணங்களை உடைய கடவுளின் திருவடிகளை வணங்காதவரின் தலைகள் பயனற்றவைகளாம்",
            "இறைவனுடைய திருவடிகளை பொருந்தி நினைக்கின்றவர் பிறவியாகிய பெரிய கடலைக் கடக்க முடியும். மற்றவர் கடக்க முடியாது"};

    int arrimage[] = {R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle
            , R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle, R.drawable.circle};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // Info button ///
        Button button = (Button) findViewById(R.id.buttonOne);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        listView = findViewById(R.id.listview);
        myadapter adapter = new myadapter(this, arrname, arrmessage, arrmeaning, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(list_view.this,user_profile.class);
                intent.putExtra("name",arrname[position]);
                intent.putExtra("message",arrmessage[position]);
                intent.putExtra("meaning",arrmeaning[position]);
                intent.putExtra("image",arrimage[position]);
                startActivity(intent);

            }
        });


    }
    private void openActivity2() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    class myadapter extends ArrayAdapter<String> {

        Context context;
        String rname[];
        String rmsg[];
        String rmea[];
        int rimg[];

        public myadapter( Context context, String[] rname, String[] rmsg, String[] rmea, int[] rimg) {
            super(context,R.layout.row,R.id.imageView,rname);

            this.rname = rname;
            this.rmsg = rmsg;
            this.rmea = rmea;
            this.rimg = rimg;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.row,parent,false);

            CircleImageView img=view.findViewById(R.id.imageView);
            TextView username=view.findViewById(R.id.name);
            TextView usermessage=view.findViewById(R.id.message);
            TextView usermeaning=view.findViewById(R.id.meaning);

            username.setText(rname[position]);
            usermessage.setText(rmsg[position]);
            usermeaning.setText(rmea[position]);
            img.setImageResource(rimg[position]);

            return view;
        }
    }

}