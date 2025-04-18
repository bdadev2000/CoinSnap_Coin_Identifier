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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends Dialog implements r6 {
    private final Activity a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f3705b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f3706c;

    /* renamed from: d, reason: collision with root package name */
    private final b f3707d;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f3708f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f3709g;

    /* renamed from: h, reason: collision with root package name */
    private e f3710h;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f3710h.setClickable(true);
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
                        this.f3705b = kVar;
                        this.f3706c = kVar.L();
                        this.a = activity;
                        this.f3707d = bVar;
                        this.f3708f = aVar;
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
        this.a.runOnUiThread(new u(this, 0));
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.r6
    public void dismiss() {
        this.a.runOnUiThread(new u(this, 1));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f3707d.a("javascript:al_onBackPressed();");
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
                window.setFlags(this.a.getWindow().getAttributes().flags, this.a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f3706c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3706c.a("ExpandedAdDialog", "Setting window flags failed.", th2);
            }
        }
    }

    private void a() {
        this.f3707d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f3710h.isClickable()) {
            this.f3710h.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f3707d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.a);
        this.f3709g = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f3709g.setBackgroundColor(-1157627904);
        this.f3709g.addView(this.f3707d);
        if (!this.f3708f.k1()) {
            a(this.f3708f.d1());
            g();
        }
        setContentView(this.f3709g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f3709g.removeView(this.f3707d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f3710h == null) {
                a();
            }
            this.f3710h.setVisibility(0);
            this.f3710h.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f3710h.startAnimation(alphaAnimation);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3706c.a("ExpandedAdDialog", "Unable to fade in close button", th2);
            }
            a();
        }
    }

    public b c() {
        return this.f3707d;
    }

    private void a(e.a aVar) {
        if (this.f3710h != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3706c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e a10 = e.a(aVar, this.a);
        this.f3710h = a10;
        a10.setVisibility(8);
        final int i10 = 0;
        this.f3710h.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f3730c;

            {
                this.f3730c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                f fVar = this.f3730c;
                switch (i11) {
                    case 0:
                        fVar.a(view);
                        return;
                    default:
                        fVar.b(view);
                        return;
                }
            }
        });
        this.f3710h.setClickable(false);
        int a11 = a(((Integer) this.f3705b.a(oj.T1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a11, a11);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f3705b;
        oj ojVar = oj.W1;
        layoutParams.addRule(((Boolean) kVar.a(ojVar)).booleanValue() ? 9 : 11);
        this.f3710h.a(a11);
        int a12 = a(((Integer) this.f3705b.a(oj.V1)).intValue());
        int a13 = a(((Integer) this.f3705b.a(oj.U1)).intValue());
        layoutParams.setMargins(a13, a12, a13, 0);
        this.f3709g.addView(this.f3710h, layoutParams);
        this.f3710h.bringToFront();
        int a14 = a(((Integer) this.f3705b.a(oj.X1)).intValue());
        View view = new View(this.a);
        view.setBackgroundColor(0);
        int i11 = a11 + a14;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f3705b.a(ojVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a13 - a(5), a12 - a(5), a13 - a(5), 0);
        final int i12 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.t

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f3730c;

            {
                this.f3730c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                f fVar = this.f3730c;
                switch (i112) {
                    case 0:
                        fVar.a(view2);
                        return;
                    default:
                        fVar.b(view2);
                        return;
                }
            }
        });
        this.f3709g.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f3708f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.a, i10);
    }
}
