package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f15048a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15049c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15050d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15051e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15052f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f15053g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f15054h;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f15048a = "浏览第三方应用";
        this.b = "View";
        this.f15049c = "打开第三方应用";
        this.f15050d = "Open";
        this.f15051e = "下载第三方应用";
        this.f15052f = "Install";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
    
        if (r11.equals("Open") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initView(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashShakeView.initView(java.lang.String):void");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15053g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f15054h = rotateAnimation;
            rotateAnimation.setDuration(100L);
            this.f15054h.setRepeatMode(2);
            this.f15054h.setRepeatCount(-1);
            this.f15053g.startAnimation(this.f15054h);
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15048a = "浏览第三方应用";
        this.b = "View";
        this.f15049c = "打开第三方应用";
        this.f15050d = "Open";
        this.f15051e = "下载第三方应用";
        this.f15052f = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15048a = "浏览第三方应用";
        this.b = "View";
        this.f15049c = "打开第三方应用";
        this.f15050d = "Open";
        this.f15051e = "下载第三方应用";
        this.f15052f = "Install";
    }
}
