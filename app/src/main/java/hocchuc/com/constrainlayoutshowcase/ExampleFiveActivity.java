package hocchuc.com.constrainlayoutshowcase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ExampleFiveActivity extends AppCompatActivity {

    Button btnThing;

    ConstraintLayout constraintLayout;

    ConstraintSet applyConstraint;
    ConstraintSet resetConstraint;
    Boolean isApplied = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_five);
        setTitle("Yet Another way to animate thing");
        applyConstraint.clone(this, R.layout.activity_example_five);
        resetConstraint.clone(this, R.layout.activity_example_five_animated);
        btnThing = findViewById(R.id.button2);
        constraintLayout = findViewById(R.id.mainConstraint);

        btnThing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isApplied)
                    resetConstraint.applyTo(constraintLayout);
                else
                    applyConstraint.applyTo(constraintLayout);
                isApplied = !isApplied;
            }
        });

    }


}
