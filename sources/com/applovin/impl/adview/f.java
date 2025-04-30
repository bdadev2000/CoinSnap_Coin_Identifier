package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.oj;
import com.applovin.impl.r6;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class f extends Dialog implements r6 {

    /* renamed from: a */
    private final Activity f6702a;
    private final com.applovin.impl.sdk.k b;

    /* renamed from: c */
    private final com.applovin.impl.sdk.t f6703c;

    /* renamed from: d */
    private final b f6704d;

    /* renamed from: f */
    private final com.applovin.impl.sdk.ad.a f6705f;

    /* renamed from: g */
    private RelativeLayout f6706g;

    /* renamed from: h */
    private e f6707h;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f6707h.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar != null) {
            if (bVar != null) {
                if (kVar != null) {
                    if (activity != null) {
                        this.b = kVar;
                        this.f6703c = kVar.L();
                        this.f6702a = activity;
                        this.f6704d = bVar;
                        this.f6705f = aVar;
                        requestWindowFeature(1);
                        setCancelable(false);
                        return;
                    }
                    throw new IllegalArgumentException("No activity specified");
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No main view specified");
        }
        throw new IllegalArgumentException("No ad specified");
    }

    private void g() {
        this.f6702a.runOnUiThread(new u(this, 0));
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.r6
    public void dismiss() {
        this.f6702a.runOnUiThread(new u(this, 1));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f6704d.a("javascript:al_onBackPressed();");
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6702a.getWindow().getAttributes().flags, this.f6702a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f6703c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6703c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f6704d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    public /* synthetic */ void b(View view) {
        if (this.f6707h.isClickable()) {
            this.f6707h.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6704d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6702a);
        this.f6706g = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6706g.setBackgroundColor(-1157627904);
        this.f6706g.addView(this.f6704d);
        if (!this.f6705f.k1()) {
            a(this.f6705f.d1());
            g();
        }
        setContentView(this.f6706g);
    }

    public /* synthetic */ void e() {
        this.f6706g.removeView(this.f6704d);
        super.dismiss();
    }

    public /* synthetic */ void f() {
        try {
            if (this.f6707h == null) {
                a();
            }
            this.f6707h.setVisibility(0);
            this.f6707h.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f6707h.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6703c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.f6704d;
    }

    private void a(e.a aVar) {
        if (this.f6707h != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6703c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e a6 = e.a(aVar, this.f6702a);
        this.f6707h = a6;
        a6.setVisibility(8);
        final int i9 = 0;
        this.f6707h.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f6723c;

            {
                this.f6723c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.f6723c.a(view);
                        return;
                    default:
                        this.f6723c.b(view);
                        return;
                }
            }
        });
        this.f6707h.setClickable(false);
        int a9 = a(((Integer) this.b.a(oj.f9677T1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a9, a9);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.b;
        oj ojVar = oj.f9697W1;
        layoutParams.addRule(((Boolean) kVar.a(ojVar)).booleanValue() ? 9 : 11);
        this.f6707h.a(a9);
        int a10 = a(((Integer) this.b.a(oj.f9690V1)).intValue());
        int a11 = a(((Integer) this.b.a(oj.f9683U1)).intValue());
        layoutParams.setMargins(a11, a10, a11, 0);
        this.f6706g.addView(this.f6707h, layoutParams);
        this.f6707h.bringToFront();
        int a12 = a(((Integer) this.b.a(oj.f9703X1)).intValue());
        View view = new View(this.f6702a);
        view.setBackgroundColor(0);
        int i10 = a9 + a12;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.b.a(ojVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a11 - a(5), a10 - a(5), a11 - a(5), 0);
        final int i11 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f6723c;

            {
                this.f6723c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f6723c.a(view2);
                        return;
                    default:
                        this.f6723c.b(view2);
                        return;
                }
            }
        });
        this.f6706g.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f6705f;
    }

    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i9) {
        return AppLovinSdkUtils.dpToPx(this.f6702a, i9);
    }
}
