package com.example.nidhi.wholesomewave.Controller;

        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextSwitcher;
        import android.widget.TextView;
        import android.widget.ViewSwitcher;

        import org.w3c.dom.Text;

public class welcome extends AppCompatActivity {
    Typeface tfc1;
    int nowText = -1;
    String myText[] = {"Wholesome Wave aims to decrease the rising dietary problems within the U.S.", "How do we do this?", "With this simple yet powerful app, we are revolutionizing the contact between physician and client.", "Not only has this never been done before, but this ability will help people meet their dietary needs better."




    };
    int textNow = myText.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.nidhi.wholesomewave.R.layout.activity_afterwel);
        Button showNext = (Button) findViewById(com.example.nidhi.wholesomewave.R.id.mybutton);
        final TextSwitcher text = (TextSwitcher) findViewById(com.example.nidhi.wholesomewave.R.id.switchtext);

        text.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView myText2 = new TextView(welcome.this);
                myText2.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText2.setTextSize(35);
                myText2.setTextColor(Color.BLACK);
                tfc1 = Typeface.createFromAsset(getAssets(), "fonts/AlanisHand.ttf");
                myText2.setTypeface(tfc1);
                return myText2;
            }

        });
        showNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                nowText++;
                if (nowText == textNow) {
                    nowText = 0;
                    Intent i = new Intent(welcome.this, LoginActivity.class);
                    startActivity(i);
                }
                text.setText(myText[nowText]);
            }
        });
    }
}
