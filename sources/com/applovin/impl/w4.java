package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.q6;
import com.applovin.impl.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w4 implements q6.a {
    private static WeakReference m;

    /* renamed from: n */
    private static final AtomicBoolean f11893n = new AtomicBoolean();

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f11894a;
    private final Context b;

    /* renamed from: e */
    private final v4 f11897e;

    /* renamed from: g */
    private q6 f11899g;

    /* renamed from: h */
    private ho f11900h;

    /* renamed from: i */
    private int f11901i;

    /* renamed from: j */
    private boolean f11902j;

    /* renamed from: k */
    private long f11903k;
    private boolean l;

    /* renamed from: c */
    private final List f11895c = new ArrayList(10);

    /* renamed from: d */
    private final Object f11896d = new Object();

    /* renamed from: f */
    private WeakReference f11898f = new WeakReference(null);

    /* loaded from: classes.dex */
    public class a extends AbstractC0734p {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Started Creative Debugger");
                if (!w4.this.h() || w4.m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = w4.m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(w4.this.f11897e, w4.this.f11894a.e());
                }
                w4.f11893n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = w4.m = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements r.b {

        /* renamed from: a */
        final /* synthetic */ Object f11905a;

        public b(Object obj) {
            this.f11905a = obj;
        }

        @Override // com.applovin.impl.r.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new u6(this.f11905a, w4.this.f11894a.E().b()), w4.this.f11894a);
            w4.f11893n.set(false);
        }
    }

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f11894a = kVar;
        Context k6 = com.applovin.impl.sdk.k.k();
        this.b = k6;
        this.f11897e = new v4(k6);
    }

    public boolean h() {
        WeakReference weakReference = m;
        if (weakReference != null && weakReference.get() != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f11903k);
        if (this.f11903k != 0 && seconds >= 10) {
            this.f11894a.B().a(o.b.GENERIC, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
            this.f11894a.X0();
        }
    }

    public /* synthetic */ void j() {
        this.f11901i = 0;
    }

    private void m() {
        this.f11894a.e().a(new a());
    }

    public void k() {
        q6 q6Var = this.f11899g;
        if (q6Var != null) {
            q6Var.b();
        }
    }

    public void l() {
        if (!g()) {
            return;
        }
        this.f11902j = ((Boolean) this.f11894a.a(oj.f9579E1)).booleanValue();
        if (this.f11899g == null) {
            this.f11899g = new q6(this.f11894a, this);
        }
        this.f11899g.a();
    }

    public void n() {
        ArrayList arrayList;
        if (!h() && f11893n.compareAndSet(false, true)) {
            Object a6 = this.f11894a.E().a();
            if (a6 != null) {
                e(a6);
                return;
            }
            synchronized (this.f11896d) {
                arrayList = new ArrayList(this.f11895c);
            }
            this.f11897e.a(arrayList, this.f11894a);
            if (!this.l) {
                m();
                this.l = true;
            }
            com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger...");
            r.a(this.b, MaxCreativeDebuggerActivity.class);
            return;
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Creative Debugger is already showing");
    }

    public void e() {
        if (g() && this.f11898f.get() == null && !h()) {
            Activity b8 = this.f11894a.e().b();
            if (b8 == null) {
                this.f11894a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f11894a.L().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b8.findViewById(R.id.content);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a6 = a(frameLayout, b8);
                frameLayout.addView(a6);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a6.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.S2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        w4.this.a(a6, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new R2.a(this, a6, frameLayout, viewTreeObserver, onGlobalLayoutListener, 2), TimeUnit.SECONDS.toMillis(5L));
                this.f11898f = new WeakReference(a6);
            }
        }
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!ve.b(obj) || c(obj)) {
                if (ve.a(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f11896d) {
                    try {
                        this.f11895c.add(0, new u6(obj, System.currentTimeMillis()));
                        if (this.f11895c.size() > 10) {
                            this.f11895c.remove(r6.size() - 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public boolean g() {
        return ((Boolean) this.f11894a.a(oj.f9571D1)).booleanValue() && this.f11894a.g0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof be ? ((be) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    public String b(Object obj) {
        JSONObject a6;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof be)) {
            return null;
        }
        String C8 = ((be) obj).C();
        return (!ve.a(obj) || (a6 = new C0769w(C8, this.f11894a).a()) == null) ? C8 : a6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i9 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i9, i9, i9, i9);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i9, i9, i9, i9 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.f11902j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.R2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a6;
                    a6 = w4.this.a(frameLayout, view, motionEvent);
                    return a6;
                }
            });
        } else {
            button.setOnClickListener(new W0(this, 2));
        }
        if (x3.f()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    @Override // com.applovin.impl.q6.a
    public void b() {
        if (this.f11901i == 0) {
            this.f11900h = ho.a(TimeUnit.SECONDS.toMillis(3L), this.f11894a, new Q2(this, 0));
        }
        int i9 = this.f11901i;
        if (i9 % 2 == 0) {
            this.f11901i = i9 + 1;
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f11902j) {
            view.setOnTouchListener(null);
            this.f11903k = 0L;
        }
        frameLayout.removeView(view);
        this.f11898f = new WeakReference(null);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        r.a(this.b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f11894a.e(), new b(obj));
    }

    public void a(u6 u6Var, Context context, boolean z8) {
        Object a6 = u6Var.a();
        String a9 = a(u6Var);
        lc lcVar = new lc();
        if (z8) {
            lcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lcVar.b(a9);
        String b8 = this.f11894a.v().b(a6);
        if (b8 != null) {
            lcVar.a("\nBid Response:\n");
            lcVar.a(b8);
        }
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", a6 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage(null), "Share Ad Report");
        if (z8) {
            try {
                context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", a6 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
                return;
            }
        }
        context.startActivity(createChooser);
    }

    public String a(u6 u6Var) {
        String v6;
        Object a6 = u6Var.a();
        lc lcVar = new lc();
        lcVar.b("Ad Info:\n");
        if (a6 instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a6;
            lcVar.a("Network", "APPLOVIN").a(bVar).b(bVar);
        } else if (a6 instanceof be) {
            lcVar.a((be) a6);
        }
        lcVar.a(this.f11894a);
        lcVar.a("Epoch Timestamp (ms)", Long.valueOf(u6Var.b()));
        if (this.f11894a.y() != null) {
            v6 = this.f11894a.z().u();
        } else {
            v6 = this.f11894a.x().v();
        }
        lcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(v6) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f11894a.a(oj.f9685U3)).a("App Package Name", this.b.getPackageName()).a("Device", Build.BRAND + " " + Build.MODEL + " (" + Build.DEVICE + ")").a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f11894a.c0()).a("Ad Review Version", C0765v.b()).a(a(a6)).a("User ID", this.f11894a.t0().c() != null ? this.f11894a.t0().c() : "None").a("AEI", this.f11894a.a(oj.f9893z)).a("MEI", this.f11894a.a(oj.f9546A)).a("MD", this.f11894a.a(oj.f9554B));
        return lcVar.toString();
    }

    private Bundle a(Object obj) {
        this.f11894a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11894a.L().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a6 = zp.a(obj);
        Bundle a9 = this.f11894a.h().a(a6);
        this.f11894a.L();
        if (com.applovin.impl.sdk.t.a()) {
            Q7.n0.s("Serve id: ", a6, this.f11894a.L(), "CreativeDebuggerService");
        }
        this.f11894a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f11894a.L().a("CreativeDebuggerService", "Public data: " + a9);
        }
        if (a9 == null) {
            return null;
        }
        for (String str : a9.keySet()) {
            Object obj2 = a9.get(str);
            a9.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a9);
        }
        return a9;
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f11898f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f11903k > 0 && this.f11902j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11903k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Q2(this, 1), TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f11903k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    public /* synthetic */ void a(View view) {
        n();
    }

    @Override // com.applovin.impl.q6.a
    public void a() {
        int i9 = this.f11901i;
        if (i9 % 2 == 1) {
            this.f11901i = i9 + 1;
        }
        if (this.f11901i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Q2(this, 2));
            this.f11901i = 0;
            this.f11900h.a();
        }
    }
}
