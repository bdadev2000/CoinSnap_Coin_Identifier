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
import com.applovin.impl.sj;
import com.applovin.impl.t6;
import com.applovin.sdk.AppLovinSdkUtils;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public class f extends Dialog implements t6 {

    /* renamed from: a */
    private final Activity f22804a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.j f22805b;

    /* renamed from: c */
    private final com.applovin.impl.sdk.n f22806c;
    private final b d;

    /* renamed from: f */
    private final com.applovin.impl.sdk.ad.a f22807f;

    /* renamed from: g */
    private RelativeLayout f22808g;

    /* renamed from: h */
    private e f22809h;

    /* loaded from: classes2.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f22809h.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f22805b = jVar;
        this.f22806c = jVar.J();
        this.f22804a = activity;
        this.d = bVar;
        this.f22807f = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f22804a.runOnUiThread(new v(this, 0));
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f22807f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.t6
    public void dismiss() {
        this.f22804a.runOnUiThread(new v(this, 1));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.d.a("javascript:al_onBackPressed();");
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
                window.setFlags(this.f22804a.getWindow().getAttributes().flags, this.f22804a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f22806c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22806c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f22804a);
        this.f22808g = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f22808g.setBackgroundColor(-1157627904);
        this.f22808g.addView(this.d);
        if (!this.f22807f.p1()) {
            a(this.f22807f.i1());
            g();
        }
        setContentView(this.f22808g);
    }

    public /* synthetic */ void e() {
        this.f22808g.removeView(this.d);
        super.dismiss();
    }

    public /* synthetic */ void f() {
        try {
            if (this.f22809h == null) {
                a();
            }
            this.f22809h.setVisibility(0);
            this.f22809h.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f22809h.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22806c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.d;
    }

    public /* synthetic */ void b(View view) {
        if (this.f22809h.isClickable()) {
            this.f22809h.performClick();
        }
    }

    private void a(e.a aVar) {
        if (this.f22809h != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f22806c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e a2 = e.a(aVar, this.f22804a);
        this.f22809h = a2;
        a2.setVisibility(8);
        final int i2 = 0;
        this.f22809h.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f22829b;

            {
                this.f22829b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                f fVar = this.f22829b;
                switch (i3) {
                    case 0:
                        fVar.a(view);
                        return;
                    default:
                        fVar.b(view);
                        return;
                }
            }
        });
        this.f22809h.setClickable(false);
        int a3 = a(((Integer) this.f22805b.a(sj.V1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.j jVar = this.f22805b;
        sj sjVar = sj.Y1;
        layoutParams.addRule(((Boolean) jVar.a(sjVar)).booleanValue() ? 9 : 11);
        this.f22809h.a(a3);
        int a4 = a(((Integer) this.f22805b.a(sj.X1)).intValue());
        int a5 = a(((Integer) this.f22805b.a(sj.W1)).intValue());
        layoutParams.setMargins(a5, a4, a5, 0);
        this.f22808g.addView(this.f22809h, layoutParams);
        this.f22809h.bringToFront();
        int a6 = a(((Integer) this.f22805b.a(sj.Z1)).intValue());
        View view = new View(this.f22804a);
        view.setBackgroundColor(0);
        int i3 = a3 + a6;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f22805b.a(sjVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a5 - a(5), a4 - a(5), a5 - a(5), 0);
        final int i4 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f22829b;

            {
                this.f22829b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i4;
                f fVar = this.f22829b;
                switch (i32) {
                    case 0:
                        fVar.a(view2);
                        return;
                    default:
                        fVar.b(view2);
                        return;
                }
            }
        });
        this.f22808g.addView(view, layoutParams2);
        view.bringToFront();
    }

    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i2) {
        return AppLovinSdkUtils.dpToPx(this.f22804a, i2);
    }
}
