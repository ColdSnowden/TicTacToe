package com.example.bulldozer.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;



import static com.example.bulldozer.tictactoe.R.drawable.yellow;

public class MainActivity extends AppCompatActivity {

//yellowPiece=0
    // redPiece=1;

    boolean yellowTurn = true;
   int numTurn = 1;
    int[] position = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12};


    public void placePiece(View view) {


        ImageView gamePiece = (ImageView) view;
        gamePiece.setClickable(false);
        gamePiece.setTranslationY(-2000f);

        if (yellowTurn) {
            gamePiece.setImageResource(yellow);
            yellowTurn = false;
            position[Integer.parseInt(gamePiece.getTag().toString())] = 0;

        } else {
            gamePiece.setImageResource(R.drawable.red);
            yellowTurn = true;
            position[Integer.parseInt(gamePiece.getTag().toString())] = 1;
        }
        gamePiece.animate().translationYBy(2000f);
        numTurn++;
       // if (numTurn > 5) {
            if (((position[0] == position[1]) && (position[1] == position[2])) || ((position[3] == position[4]) && (position[4] == position[5]))
                    || ((position[6] == position[7]) && (position[7] == position[8])) || ((position[0] == position[3]) && (position[3] == position[6]))
                    || ((position[1] == position[4]) && (position[4] == position[7])) || ((position[2] == position[5]) && (position[5] == position[8]))
                    || ((position[0] == position[4]) &&(position[4] == position[8])) || ((position[2] == position[4]) && (position[4] == position[6]))) {
                if (yellowTurn) {
                   // Toast.makeText(MainActivity.this, "Red Wins!", Toast.LENGTH_LONG).show();
                    TextView msg= (TextView)findViewById(R.id.msg);
                    msg.setText("Red Wins!");

                    numTurn = 0;


                } else {
                    //Toast.makeText(MainActivity.this, "Yellow Wins!", Toast.LENGTH_LONG).show();
                    TextView msg= (TextView)findViewById(R.id.msg);
                    msg.setText("Yellow Wins!");
                    numTurn = 0;

                }

            }

        if (numTurn>9)
        {
            //Toast.makeText(MainActivity.this, "It's a Tie!", Toast.LENGTH_LONG).show();
            TextView msg= (TextView)findViewById(R.id.msg);
            msg.setText("It's a Tie!");
            numTurn=0;
        }

        if (numTurn==0){

            ImageView Piece1 = (ImageView) findViewById(R.id.Piece1);

            Piece1.setClickable(false);
            ImageView yellow2 = (ImageView) findViewById(R.id.yellow2);

            yellow2.setClickable(false);
            ImageView yellow3 = (ImageView) findViewById(R.id.yellow3);

            yellow3.setClickable(false);
            ImageView yellow4 = (ImageView) findViewById(R.id.yellow4);

            yellow4.setClickable(false);
            ImageView yellow5 = (ImageView) findViewById(R.id.yellow5);

            yellow5.setClickable(false);
            ImageView yellow6 = (ImageView) findViewById(R.id.yellow6);

            yellow6.setClickable(false);
            ImageView yellow7 = (ImageView) findViewById(R.id.yellow7);

            yellow7.setClickable(false);
            ImageView yellow8 = (ImageView) findViewById(R.id.yellow8);

            yellow8.setClickable(false);
            ImageView yellow9 = (ImageView) findViewById(R.id.yellow9);

            yellow9.setClickable(false);
            View playAgain = findViewById(R.id.playAgain);
            playAgain.setVisibility(view.VISIBLE);
        }

        }

    public void playAgain(View view){
        TextView msg= (TextView)findViewById(R.id.msg);
        msg.setText("");
        yellowTurn = true;
        numTurn=1;
        for (int i=0; i<position.length; i++)
        {
        position[i] = (i+4);
            Log.d("Value", String.valueOf(position[i]));
    }
        ImageView Piece1 = (ImageView) findViewById(R.id.Piece1);
        Piece1.setImageResource(0);
        Piece1.setClickable(true);
        ImageView yellow2 = (ImageView) findViewById(R.id.yellow2);
        yellow2.setImageResource(0);
        yellow2.setClickable(true);
        ImageView yellow3 = (ImageView) findViewById(R.id.yellow3);
        yellow3.setImageResource(0);
        yellow3.setClickable(true);
        ImageView yellow4 = (ImageView) findViewById(R.id.yellow4);
        yellow4.setImageResource(0);
        yellow4.setClickable(true);
        ImageView yellow5 = (ImageView) findViewById(R.id.yellow5);
        yellow5.setImageResource(0);
        yellow5.setClickable(true);
        ImageView yellow6 = (ImageView) findViewById(R.id.yellow6);
        yellow6.setImageResource(0);
        yellow6.setClickable(true);
        ImageView yellow7 = (ImageView) findViewById(R.id.yellow7);
        yellow7.setImageResource(0);
        yellow7.setClickable(true);
        ImageView yellow8 = (ImageView) findViewById(R.id.yellow8);
        yellow8.setImageResource(0);
        yellow8.setClickable(true);
        ImageView yellow9 = (ImageView) findViewById(R.id.yellow9);
        yellow9.setImageResource(0);
        yellow9.setClickable(true);
        View playAgain = findViewById(R.id.playAgain);
        playAgain.setVisibility(view.INVISIBLE);
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        // Make sure to call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save our own state now

    }
    */
