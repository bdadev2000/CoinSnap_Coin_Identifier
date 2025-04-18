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
import com.applovin.impl.r;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class y4 implements s6.a {

    /* renamed from: m */
    private static WeakReference f28063m;

    /* renamed from: n */
    private static final AtomicBoolean f28064n = new AtomicBoolean();

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f28065a;

    /* renamed from: b */
    private final Context f28066b;
    private final x4 e;

    /* renamed from: g */
    private s6 f28069g;

    /* renamed from: h */
    private go f28070h;

    /* renamed from: i */
    private int f28071i;

    /* renamed from: j */
    private boolean f28072j;

    /* renamed from: k */
    private long f28073k;

    /* renamed from: l */
    private boolean f28074l;

    /* renamed from: c */
    private final List f28067c = new ArrayList(10);
    private final Object d = new Object();

    /* renamed from: f */
    private WeakReference f28068f = new WeakReference(null);

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started Creative Debugger");
                if (!y4.this.h() || y4.f28063m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = y4.f28063m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(y4.this.e, y4.this.f28065a.e());
                }
                y4.f28064n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = y4.f28063m = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements r.b {

        /* renamed from: a */
        final /* synthetic */ Object f28076a;

        public b(Object obj) {
            this.f28076a = obj;
        }

        @Override // com.applovin.impl.r.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new w6(this.f28076a, y4.this.f28065a.C().b()), y4.this.f28065a);
            y4.f28064n.set(false);
        }
    }

    public y4(com.applovin.impl.sdk.j jVar) {
        this.f28065a = jVar;
        Context l2 = com.applovin.impl.sdk.j.l();
        this.f28066b = l2;
        this.e = new x4(l2);
    }

    public boolean h() {
        WeakReference weakReference = f28063m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f28073k);
        if (this.f28073k == 0 || seconds < 10) {
            return;
        }
        this.f28065a.E().a(la.d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f28065a.U0();
    }

    public /* synthetic */ void j() {
        this.f28071i = 0;
    }

    private void m() {
        this.f28065a.e().a(new a());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public void k() {
        s6 s6Var = this.f28069g;
        if (s6Var != null) {
            s6Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f28072j = ((Boolean) this.f28065a.a(sj.G1)).booleanValue();
            if (this.f28069g == null) {
                this.f28069g = new s6(this.f28065a, this);
            }
            this.f28069g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f28064n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object a2 = this.f28065a.C().a();
        if (a2 != null) {
            e(a2);
            return;
        }
        synchronized (this.d) {
            arrayList = new ArrayList(this.f28067c);
        }
        this.e.a(arrayList, this.f28065a);
        if (!this.f28074l) {
            m();
            this.f28074l = true;
        }
        com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger...");
        r.a(this.f28066b, MaxCreativeDebuggerActivity.class);
    }

    public void e() {
        if (g() && this.f28068f.get() == null && !h()) {
            Activity b2 = this.f28065a.e().b();
            if (b2 == null) {
                this.f28065a.J();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28065a.J().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b2.findViewById(R.id.content);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = a(frameLayout, b2);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a2.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.tw
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        y4.this.a(a2, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new iu(this, a2, frameLayout, viewTreeObserver, onGlobalLayoutListener, 2), TimeUnit.SECONDS.toMillis(5L));
                this.f28068f = new WeakReference(a2);
            }
        }
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Opcodes.LXOR, Opcodes.TABLESWITCH));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public boolean g() {
        return ((Boolean) this.f28065a.a(sj.F1)).booleanValue() && this.f28065a.g0().isCreativeDebuggerEnabled();
    }

    public String b(Object obj) {
        JSONObject a2;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof ge)) {
            return null;
        }
        String D = ((ge) obj).D();
        return (!af.b(obj) || (a2 = new w(D, this.f28065a).a()) == null) ? D : a2.toString();
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!af.a(obj) || c(obj)) {
                if (af.b(obj) && c(obj)) {
                    return;
                }
                synchronized (this.d) {
                    try {
                        this.f28067c.add(0, new w6(obj, System.currentTimeMillis()));
                        if (this.f28067c.size() > 10) {
                            this.f28067c.remove(r6.size() - 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i2 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i2, i2, i2, i2);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i2, i2, i2, i2 * 2);
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
        if (this.f28072j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.sw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a2;
                    a2 = y4.this.a(frameLayout, view, motionEvent);
                    return a2;
                }
            });
        } else {
            button.setOnClickListener(new ou(this, 2));
        }
        if (z3.f()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof ge ? ((ge) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.s6.a
    public void b() {
        if (this.f28071i == 0) {
            this.f28070h = go.a(TimeUnit.SECONDS.toMillis(3L), this.f28065a, new rw(this, 1));
        }
        int i2 = this.f28071i;
        if (i2 % 2 == 0) {
            this.f28071i = i2 + 1;
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f28072j) {
            view.setOnTouchListener(null);
            this.f28073k = 0L;
        }
        frameLayout.removeView(view);
        this.f28068f = new WeakReference(null);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        r.a(this.f28066b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f28065a.e(), new b(obj));
    }

    public void a(w6 w6Var, Context context, boolean z2) {
        Object a2 = w6Var.a();
        String a3 = a(w6Var);
        qc qcVar = new qc();
        if (z2) {
            qcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        qcVar.b(a3);
        String b2 = this.f28065a.w().b(a2);
        if (b2 != null) {
            qcVar.a("\nBid Response:\n");
            qcVar.a(b2);
        }
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", a2 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", qcVar.toString()).setPackage(null), "Share Ad Report");
        if (z2) {
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", a2 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", qcVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
                return;
            }
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
    }

    public String a(w6 w6Var) {
        Object a2 = w6Var.a();
        qc qcVar = new qc();
        qcVar.b("Ad Info:\n");
        if (a2 instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a2;
            qcVar.a("Network", "APPLOVIN").a(bVar).b(bVar);
        } else if (a2 instanceof ge) {
            qcVar.a((ge) a2);
        }
        qcVar.a(this.f28065a);
        qcVar.a("Epoch Timestamp (ms)", Long.valueOf(w6Var.b()));
        qcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(this.f28065a.y().v()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f28065a.a(sj.a4)).a("App Package Name", this.f28066b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f28065a.a0()).a("Ad Review Version", v.b()).a(a(a2)).a("User ID", this.f28065a.q0().c() != null ? this.f28065a.q0().c() : "None").a("MD", this.f28065a.a(sj.f26956v));
        return qcVar.toString();
    }

    private Bundle a(Object obj) {
        this.f28065a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28065a.J().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a2 = yp.a(obj);
        Bundle a3 = this.f28065a.h().a(a2);
        this.f28065a.J();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.adview.t.v("Serve id: ", a2, this.f28065a.J(), "CreativeDebuggerService");
        }
        this.f28065a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28065a.J().a("CreativeDebuggerService", "Public data: " + a3);
        }
        if (a3 == null) {
            return null;
        }
        for (String str : a3.keySet()) {
            Object obj2 = a3.get(str);
            a3.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a3);
        }
        return a3;
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f28068f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f28073k > 0 && this.f28072j) {
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
            this.f28073k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new rw(this, 2), TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f28073k = 0L;
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

    @Override // com.applovin.impl.s6.a
    public void a() {
        int i2 = this.f28071i;
        if (i2 % 2 == 1) {
            this.f28071i = i2 + 1;
        }
        if (this.f28071i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new rw(this, 0));
            this.f28071i = 0;
            this.f28070h.a();
        }
    }
}
