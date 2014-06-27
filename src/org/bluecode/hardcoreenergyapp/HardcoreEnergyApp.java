package org.bluecode.hardcoreenergyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class HardcoreEnergyApp extends Activity {
    /** Called when the activity is first created. */
	
	private Button notiredButton;
	private Button tiredButton;
	private Button exitButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.notiredButton = (Button)this.findViewById(R.id.notired);
        this.notiredButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        
        this.tiredButton = (Button)this.findViewById(R.id.tired);
        this.tiredButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		ViewFlipper vf = (ViewFlipper)findViewById(R.id.mainflip);
        		vf.setAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.push_left_in));
        		vf.showNext();
        	}
        });
        
        this.exitButton = (Button)this.findViewById(R.id.exit);
        this.exitButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
    }
}