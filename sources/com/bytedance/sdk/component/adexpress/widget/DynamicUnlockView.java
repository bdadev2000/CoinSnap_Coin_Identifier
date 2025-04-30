package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.KS.zp;

/* loaded from: classes.dex */
public class DynamicUnlockView extends FrameLayout {
    private final FlowLightView KS;
    private final RotateAnimation jU;
    private final ImageView lMd;
    private final TextView zp;

    public DynamicUnlockView(Context context) {
        super(context);
        addView(zp.jU(context));
        this.zp = (TextView) findViewById(2097610742);
        this.lMd = (ImageView) findViewById(2097610745);
        this.KS = (FlowLightView) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.jU = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicUnlockView.this.lMd.startAnimation(DynamicUnlockView.this.jU);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.KS.zp(4);
                    }
                }, 100L);
                DynamicUnlockView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicUnlockView.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DynamicUnlockView.this.KS.zp(4);
                    }
                }, 300L);
                DynamicUnlockView dynamicUnlockView = DynamicUnlockView.this;
                dynamicUnlockView.postDelayed(dynamicUnlockView.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.zp;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void lMd() {
        this.jU.cancel();
    }

    public void zp() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
