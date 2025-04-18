package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class YI extends LinearLayout {
    private YFl AlY;
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.nc DSW;
    private com.bytedance.sdk.component.utils.aIu Sg;
    private TextView YFl;
    private TextView tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.adsdk.Sg.vc f10417vc;
    private LinearLayout wN;

    /* loaded from: classes.dex */
    public interface YFl {
    }

    public YI(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar) {
        super(context);
        this.DSW = ncVar;
        YFl(context, view);
    }

    public TextView getTopTextView() {
        return this.YFl;
    }

    public LinearLayout getWriggleLayout() {
        return this.wN;
    }

    public View getWriggleProgressIv() {
        return this.f10417vc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.Sg == null) {
                this.Sg = new com.bytedance.sdk.component.utils.aIu(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.vc.YI.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar = this.DSW;
            if (ncVar != null) {
                ncVar.tN();
                this.DSW.wN();
                this.DSW.vc();
                this.DSW.qsH();
            }
            this.Sg.onResume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.Sg.vc vcVar = this.f10417vc;
            if (vcVar != null) {
                vcVar.wN();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.component.utils.aIu aiu = this.Sg;
        if (aiu != null && z10) {
            aiu.onResume();
        }
    }

    public void setOnShakeViewListener(YFl yFl) {
        this.AlY = yFl;
    }

    public void setShakeText(String str) {
        this.tN.setText(str);
    }

    private void YFl(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.wN = (LinearLayout) findViewById(2097610722);
        this.YFl = (TextView) findViewById(2097610719);
        this.tN = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.Sg.vc vcVar = (com.bytedance.adsdk.Sg.vc) findViewById(2097610706);
        this.f10417vc = vcVar;
        vcVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f10417vc.setImageAssetsFolder("images/");
        this.f10417vc.YFl(true);
    }

    public void YFl() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.YI.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    YI.this.f10417vc.YFl();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
