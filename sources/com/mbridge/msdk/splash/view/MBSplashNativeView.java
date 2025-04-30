package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.shake.b;
import com.mbridge.msdk.splash.a.d;

/* loaded from: classes3.dex */
public class MBSplashNativeView extends BaseMBSplashNativeView {
    public MBSplashNativeView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    public final void a() {
        this.b.setVisibility(8);
    }

    @Override // com.mbridge.msdk.splash.view.BaseMBSplashNativeView
    public final void b() {
        if (this.f18000j == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f18007s = mBShakeView;
            mBShakeView.initView(this.f18006r.getAdCall());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f18007s.setLayoutParams(layoutParams);
            addView(this.f18007s);
            this.f17997g.setVisibility(4);
            this.f17997g.setEnabled(false);
            this.f18007s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.splash.view.MBSplashNativeView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBSplashNativeView.this.a(0);
                }
            });
            this.f18008t = new b(this.f18001k, this.l * 1000) { // from class: com.mbridge.msdk.splash.view.MBSplashNativeView.2
                @Override // com.mbridge.msdk.shake.b
                public final void a() {
                    MBSplashNativeView mBSplashNativeView = MBSplashNativeView.this;
                    if (mBSplashNativeView.f18003o || mBSplashNativeView.f18002n) {
                        return;
                    }
                    mBSplashNativeView.a(4);
                    com.mbridge.msdk.shake.a.a().b(this);
                }
            };
        }
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBSplashNativeView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    public MBSplashNativeView(Context context, MBSplashView mBSplashView, d dVar) {
        super(context, mBSplashView, dVar);
    }
}
