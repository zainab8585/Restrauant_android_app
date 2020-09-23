package com.marwa.session4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ListView l1;
ArrayAdapter ad;
TextView A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.l1);
        A=(TextView)findViewById(R.id.tv);
        String s []={"ميسوط","مضغوط","زهقان","محيط","خائق","غضبان","مضايق","حزين","مريض"};
        ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,s);
        l1.setAdapter(ad);
   l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

           String [] m ={
                   "كان النبي صلى الله عليه وسلم اذا اتاه أمر يسره او يسر به خر ساجد شكرا لله تبارك وتعالى ",
                   " ولا تهنوا ولا تحزنوا وأنتم الاعلون ان كنتم مؤمنين",
                   "ولقد نعلم انك يضيق صدرك بما يقولون فسبح بحمد ربك وكن من الساجدين واعبد ربك حتى يأتيك اليقين"
                   ,"ماالدنيا الا ساعة فما الذى يغضبك قم توضئ يااخى واستعذ بالله من الشيطان الرجيم"
                   ,"اللهم اكفينهم بما شئت ,اللهم انت عضدى ونصيرى بك احول وبك اصول وبك اقاتل"
                   ,"لا اله الا أنت سبحانك إنى كنت من الظالمين "
                   ,"لا اله الا الله العظيم الحليم لا اله الا الله رب العرش العظيم لا اله الا الله رب السماوات ورب الارض ورب العرش الكريم ",
                   "اللهم رحمتك أرجو فلا تكلنى الى نفسي طرفة عين وأصلح لى شأنى كله لا اله الا أنت",
                   "ضع يدك على الذى تألم من جسدك وقل : بسم الله ثلاثا وقل أعوذ بالله وقدرته من شر ما أجد وأحاذر"
           } ;
    A.setText(m[position]);
       }
   });

    }
}
