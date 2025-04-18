package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class eT extends FrameLayout {
    private final RotateAnimation AlY;
    private final ImageView Sg;
    private final TextView YFl;
    private final YoT tN;

    public eT(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.tN.YFl.AlY(context));
        this.YFl = (TextView) findViewById(2097610742);
        this.Sg = (ImageView) findViewById(2097610745);
        this.tN = (YoT) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.AlY = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.eT.1
            @Override // java.lang.Runnable
            public void run() {
                eT.this.Sg.startAnimation(eT.this.AlY);
                eT.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.eT.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eT.this.tN.YFl(4);
                    }
                }, 100L);
                eT.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.eT.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        eT.this.tN.YFl(4);
                    }
                }, 300L);
                eT eTVar = eT.this;
                eTVar.postDelayed(eTVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.YFl;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void Sg() {
        this.AlY.cancel();
    }

    public void YFl() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
