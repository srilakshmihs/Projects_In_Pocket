package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Formcode extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formcode);
        text = findViewById(R.id.textView9);
        text.setText("Xml File - activity_main.xml\n"+
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Student Form\"\n" +
                "        android:textColor=\"#03A9F4\"\n" +
                "        android:textSize=\"32sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.023\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editTextTextPersonName5\"\n" +
                "        android:layout_width=\"384dp\"\n" +
                "        android:layout_height=\"45dp\"\n" +
                "        android:layout_marginStart=\"10dp\"\n" +
                "        android:layout_marginLeft=\"10dp\"\n" +
                "        android:layout_marginTop=\"70dp\"\n" +
                "        android:ems=\"10\"\n" +
                "        android:hint=\"Enter your Name\"\n" +
                "        android:inputType=\"textPersonName\"\n" +
                "        android:text=\"\"\n" +
                "        android:textColorHighlight=\"#000000\"\n" +
                "        android:textColorLink=\"#FFFFFF\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editTextTextPersonName6\"\n" +
                "        android:layout_width=\"384dp\"\n" +
                "        android:layout_height=\"45dp\"\n" +
                "        android:layout_marginStart=\"12dp\"\n" +
                "        android:layout_marginLeft=\"12dp\"\n" +
                "        android:layout_marginTop=\"112dp\"\n" +
                "        android:ems=\"10\"\n" +
                "        android:inputType=\"textPersonName\"\n" +
                "        android:text=\"\"\n" +
                "        android:hint=\"Enter your USN\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/imageView\"\n" +
                "        android:layout_width=\"145dp\"\n" +
                "        android:layout_height=\"141dp\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextTextPersonName6\"\n" +
                "        app:srcCompat=\"@drawable/image\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"12dp\"\n" +
                "        android:layout_marginLeft=\"12dp\"\n" +
                "        android:layout_marginTop=\"308dp\"\n" +
                "        android:text=\"Choose your Branch\"\n" +
                "        android:textColor=\"#000000\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"12dp\"\n" +
                "        android:layout_marginLeft=\"12dp\"\n" +
                "        android:layout_marginTop=\"472dp\"\n" +
                "        android:text=\"Choose your Open Elective\"\n" +
                "        android:textColor=\"#000000\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginLeft=\"16dp\"\n" +
                "        android:layout_marginTop=\"380dp\"\n" +
                "        android:text=\"Electronic and Communication\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginLeft=\"16dp\"\n" +
                "        android:layout_marginTop=\"340dp\"\n" +
                "        android:text=\"Computer Science\"\n" +
                "        android:textColorHighlight=\"#FFFFFF\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <CheckBox\n" +
                "        android:id=\"@+id/checkBox3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginLeft=\"16dp\"\n" +
                "        android:layout_marginTop=\"420dp\"\n" +
                "        android:text=\"Mechanical\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <RadioButton\n" +
                "        android:id=\"@+id/radioButton\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"20dp\"\n" +
                "        android:layout_marginLeft=\"20dp\"\n" +
                "        android:layout_marginTop=\"502dp\"\n" +
                "        android:text=\"Web Development\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:checked=\"False\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        tools:ignore=\"MissingConstraints\"/>\n" +
                "\n" +
                "    <RadioButton\n" +
                "        android:id=\"@+id/radioButton2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"20dp\"\n" +
                "        android:layout_marginLeft=\"20dp\"\n" +
                "        android:layout_marginTop=\"540dp\"\n" +
                "        android:text=\"Sensiors and actuators\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:checked=\"False\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        tools:ignore=\"MissingConstraints\"/>\n" +
                "\n" +
                "    <RadioButton\n" +
                "        android:id=\"@+id/radioButton3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"20dp\"\n" +
                "        android:layout_marginLeft=\"20dp\"\n" +
                "        android:layout_marginTop=\"576dp\"\n" +
                "        android:text=\"Project Management\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:checked=\"False\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        tools:ignore=\"MissingConstraints\"/>\n" +
                "\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"650dp\"\n" +
                "        android:text=\"Submit\"\n" +
                "        app:backgroundTint=\"#2196F3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>"+
        "MainActivity.java\n"+
                "package com.example.formactivity;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity {\n" +
                        "\n" +
                        "    Button explicit_btn;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "\n" +
                        "        explicit_btn = (Button)findViewById(R.id.button);\n" +
                        "\n" +
                        "        explicit_btn.setOnClickListener(new View.OnClickListener() {\n" +
                        "\n" +
                        "            @Override\n" +
                        "\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                Intent intent = new Intent(getBaseContext(), Second.class);\n" +
                        "\n" +
                        "                startActivity(intent);\n" +
                        "\n" +
                        "            }\n" +
                        "\n" +
                        "        });\n" +
                        "    }\n" +
                        "}"
        );
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(this, "" + para.length, Toast.LENGTH_SHORT).show();
    }

}