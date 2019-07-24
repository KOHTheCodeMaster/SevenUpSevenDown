package dev.koh.sevenupsevendown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.security.SecureRandom;

public class GamePlayActivity extends AppCompatActivity {

    private final String TAG_GamePlayActivity = "GamePlayActivity_#1";
    ImageView leftDiceImageView;
    ImageView rightDiceImageView;
    Button rollBtn;

    int[] diceArray = {
            R.drawable.dice_figure_1,
            R.drawable.dice_figure_2,
            R.drawable.dice_figure_3,
            R.drawable.dice_figure_4,
            R.drawable.dice_figure_5,
            R.drawable.dice_figure_6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        Log.d(TAG_GamePlayActivity, "<onCreate> App Started.");
        major();

    }

    private void major() {
        init();
    }

    private void init() {

        leftDiceImageView = findViewById(R.id.idLeftDiceImageView);
        rightDiceImageView = findViewById(R.id.idRightDiceImageView);
        rollBtn = findViewById(R.id.idRollBtn);

    }

    public void rollBtnClicked(View view) {

        SecureRandom random = new SecureRandom();
        final int MAX_DICE_VALUE = 6;
        int randomNumber;

        randomNumber = random.nextInt(MAX_DICE_VALUE);
        leftDiceImageView.setImageResource(diceArray[randomNumber]);
        Log.d(TAG_GamePlayActivity, "Random number - Left  : " + randomNumber);

        randomNumber = random.nextInt(MAX_DICE_VALUE);
        rightDiceImageView.setImageResource(diceArray[randomNumber]);
        Log.d(TAG_GamePlayActivity, "Random number - Right : " + randomNumber);

    }
}

/*
 *  Date Created  : 10th May 2K19, 01:41 PM..!!
 *  Last Modified : 24th July 2K19, 09:54 PM..!!
 *
 *  Project Name    :   Seven Up Seven Down
 *  Status          :   Work In Progress
 *  ____________________________________________________________________
 *
 *  Change Log:
 *  ____________________________________________________________________
 *
 *  3rd Commit: [Updated Launcher Icon]
 *
 *  1. GamePlayActivity - XML Optimized.
 *  2. Launcher Icon Changed.
 *  3. Replaced Hardcoded log tags with TAG_GamePlayActivity variable.
 *  ____________________________________________________________________
 *
 *  2nd Commit: [rollBtnClicked - GamePlayActivity]
 *  Description: Linked the layout of the GamePlayActivity with its Java class &
 *  handled the event when rollBtn is clicked, it generates the random number &
 *  updates both the left & right dice image view according to the random number generated.
 *
 *  Changes:
 *  1. Added the rollBtnClicked method to handle the event when button is clicked.
 *  2. Randomly updates the left & right Dice Images whenever the rollBtn is clicked.
 *  ____________________________________________________________________
 *
 *  Init Commit:
 *  1. Designed the layout for GamePlayActivity
 *  ____________________________________________________________________
 *
 *  Code Developed By,
 *  ~K.O.H..!! ^__^
 */