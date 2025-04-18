package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class MBSplashShakeView extends MBLinearLayout {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12724b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12725c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12726d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12727e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12728f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f12729g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f12730h;

    public MBSplashShakeView(Context context) {
        super(context);
        this.a = "浏览第三方应用";
        this.f12724b = "View";
        this.f12725c = "打开第三方应用";
        this.f12726d = "Open";
        this.f12727e = "下载第三方应用";
        this.f12728f = "Install";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0125, code lost:
    
        if (r0 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initView(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashShakeView.initView(java.lang.String):void");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12729g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f12730h = rotateAnimation;
            rotateAnimation.setDuration(100L);
            this.f12730h.setRepeatMode(2);
            this.f12730h.setRepeatCount(-1);
            this.f12729g.startAnimation(this.f12730h);
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "浏览第三方应用";
        this.f12724b = "View";
        this.f12725c = "打开第三方应用";
        this.f12726d = "Open";
        this.f12727e = "下载第三方应用";
        this.f12728f = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = "浏览第三方应用";
        this.f12724b = "View";
        this.f12725c = "打开第三方应用";
        this.f12726d = "Open";
        this.f12727e = "下载第三方应用";
        this.f12728f = "Install";
    }
}
