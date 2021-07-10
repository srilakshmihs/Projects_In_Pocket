package com.example.mad;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mad.R;

public class SmsCode extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_code);
        text = findViewById(R.id.textView8);
        text.setText("Xml File - activity_main.xml\n"+
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "<EditText\n" +
                "    android:id=\"@+id/editText1\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_alignParentRight=\"true\"\n" +
                "    android:layout_alignParentTop=\"true\"\n" +
                "    android:layout_marginRight=\"20dp\"\n" +
                "    android:ems=\"10\"/>\n" +
                "\n" +
                "<EditText\n" +
                "    android:id=\"@+id/editText2\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_alignLeft=\"@+id/editText1\"\n" +
                "    android:layout_below=\"@+id/editText1\"\n" +
                "    android:layout_marginTop=\"26dp\"\n" +
                "    android:ems=\"10\"\n" +
                "    android:inputType=\"textMultiLine\"/>\n" +
                "\n" +
                "<TextView\n" +
                "    android:id=\"@+id/textView1\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_alignBaseline=\"@+id/editText1\"\n" +
                "    android:layout_alignBottom=\"@+id/editText1\"\n" +
                "    android:layout_toLeftOf=\"@+id/editText1\"\n" +
                "    android:text=\"Mobile No:\"/>\n" +
                "\n" +
                "<TextView\n" +
                "    android:id=\"@+id/textView2\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_alignBaseline=\"@+id/editText2\"\n" +
                "    android:layout_alignBottom=\"@+id/editText2\"\n" +
                "    android:layout_alignLeft=\"@+id/textView1\"\n" +
                "    android:text=\"Message:\"/>\n" +
                "\n" +
                "<Button\n" +
                "    android:id=\"@+id/button1\"\n" +
                "    android:layout_width=\"wrap_content\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:layout_alignLeft=\"@+id/editText2\"\n" +
                "    android:layout_below=\"@+id/editText2\"\n" +
                "    android:layout_marginLeft=\"34dp\"\n" +
                "    android:layout_marginTop=\"48dp\"\n" +
                "    android:text=\"Send SMS\"/>\n" +
                "\n" +
                "</RelativeLayout>\n" +
                "\n" +
                "    </menu>"+
                "Main.Activity.java"+
                "package com.example.sendingsms;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.app.Activity;\n" +
                "import android.app.PendingIntent;\n" +
                "import android.content.Intent;\n" +
                "import android.telephony.SmsManager;\n" +
                "import android.view.Menu;\n" +
                "import android.view.View;\n" +
                "import android.view.View.OnClickListener;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends Activity {\n" +
                "    EditText mobileno,message;\n" +
                "    Button sendsms;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        mobileno=(EditText)findViewById(R.id.editText1);\n" +
                "        message=(EditText)findViewById(R.id.editText2);\n" +
                "        sendsms=(Button)findViewById(R.id.button1);\n" +
                "\n" +
                "        //Performing action on button click  \n" +
                "        sendsms.setOnClickListener(new OnClickListener() {\n" +
                "\n" +
                "            @Override\n" +
                "            public void onClick(View arg0) {\n" +
                "                String no=mobileno.getText().toString();\n" +
                "                String msg=message.getText().toString();\n" +
                "\n" +
                "                //Getting intent and PendingIntent instance  \n" +
                "                Intent intent=new Intent(getApplicationContext(),MainActivity.class);\n" +
                "                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);\n" +
                "\n" +
                "                //Get the SmsManager instance and call the sendTextMessage method to send message  \n" +
                "                SmsManager sms=SmsManager.getDefault();\n" +
                "                sms.sendTextMessage(no, null, msg, pi,null);\n" +
                "                Toast.makeText(getApplicationContext(), \"Message Sent successfully!\",\n" +
                "                        Toast.LENGTH_LONG).show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
                "        // Inflate the menu; this adds items to the action bar if it is present.  \n" +
                "        getMenuInflater().inflate(R.menu.activity_main, menu);\n" +
                "        return true;\n" +
                "    }\n" +
                "\n" +
                "}"+
                "AndroidManifist.xml"+
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\"com.example.sendingsms\"\n" +
                "    android:versionCode=\"1\"\n" +
                "    android:versionName=\"1.0\">\n" +
                "\n" +
                "    <uses-sdk\n" +
                "        android:minSdkVersion=\"8\"\n" +
                "        android:targetSdkVersion=\"16\"/>\n" +
                "\n" +
                "    <uses-permission android:name=\"android.permission.SEND_SMS\"/>\n" +
                "\n" +
                "    <uses-permission android:name=\"android.permission.RECEIVE_SMS\"/>\n" +
                "\n" +
                "    <application\n" +
                "        android:allowBackup=\"true\"\n" +
                "        android:icon=\"@mipmap/ic_launcher\"\n" +
                "        android:label=\"SendingSMS\"\n" +
                "        android:roundIcon=\"@mipmap/ic_launcher_round\"\n" +
                "        android:supportsRtl=\"true\"\n" +
                "        android:theme=\"@style/Theme.SendingSMS\">\n" +
                "        <activity android:name=\".MainActivity\">\n" +
                "            <intent-filter>\n" +
                "                <action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "            </intent-filter>\n" +
                "        </activity>\n" +
                "    </application>\n" +
                "\n" +
                "</manifest>"
        );
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(this, "" + para.length, Toast.LENGTH_SHORT).show();
    }

}

