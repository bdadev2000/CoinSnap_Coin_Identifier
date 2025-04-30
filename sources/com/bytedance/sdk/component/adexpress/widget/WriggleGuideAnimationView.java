package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.lottie.LottieAnimationView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.dT;
import com.bytedance.sdk.component.utils.FP;

/* loaded from: classes.dex */
public class WriggleGuideAnimationView extends LinearLayout {
    private LinearLayout COT;
    private LottieAnimationView HWF;
    private TextView KS;
    private dT QR;
    private zp jU;
    private FP lMd;
    private TextView zp;

    /* loaded from: classes.dex */
    public interface zp {
    }

    public WriggleGuideAnimationView(Context context, View view, dT dTVar) {
        super(context);
        this.QR = dTVar;
        zp(context, view);
    }

    public TextView getTopTextView() {
        return this.zp;
    }

    public LinearLayout getWriggleLayout() {
        return this.COT;
    }

    public View getWriggleProgressIv() {
        return this.HWF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.lMd == null) {
                this.lMd = new FP(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.2
            };
            dT dTVar = this.QR;
            if (dTVar != null) {
                dTVar.KS();
                this.QR.COT();
                this.QR.HWF();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            LottieAnimationView lottieAnimationView = this.HWF;
            if (lottieAnimationView != null) {
                lottieAnimationView.KS();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
    }

    public void setOnShakeViewListener(zp zpVar) {
        this.jU = zpVar;
    }

    public void setShakeText(String str) {
        this.KS.setText(str);
    }

    private void zp(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.COT = (LinearLayout) findViewById(2097610722);
        this.zp = (TextView) findViewById(2097610719);
        this.KS = (TextView) findViewById(2097610718);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2097610706);
        this.HWF = lottieAnimationView;
        lottieAnimationView.setAnimation("lottie_json/twist_multi_angle.json");
        this.HWF.setImageAssetsFolder("images/");
        this.HWF.lMd(true);
    }

    public void zp() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    WriggleGuideAnimationView.this.HWF.zp();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
