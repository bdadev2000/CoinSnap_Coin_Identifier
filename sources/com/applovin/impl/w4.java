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

    /* renamed from: m */
    private static WeakReference f8680m;

    /* renamed from: n */
    private static final AtomicBoolean f8681n = new AtomicBoolean();
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private final Context f8682b;

    /* renamed from: e */
    private final v4 f8685e;

    /* renamed from: g */
    private q6 f8687g;

    /* renamed from: h */
    private ho f8688h;

    /* renamed from: i */
    private int f8689i;

    /* renamed from: j */
    private boolean f8690j;

    /* renamed from: k */
    private long f8691k;

    /* renamed from: l */
    private boolean f8692l;

    /* renamed from: c */
    private final List f8683c = new ArrayList(10);

    /* renamed from: d */
    private final Object f8684d = new Object();

    /* renamed from: f */
    private WeakReference f8686f = new WeakReference(null);

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Started Creative Debugger");
                if (!w4.this.h() || w4.f8680m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = w4.f8680m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(w4.this.f8685e, w4.this.a.e());
                }
                w4.f8681n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.t.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = w4.f8680m = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements r.b {
        final /* synthetic */ Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // com.applovin.impl.r.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new u6(this.a, w4.this.a.E().b()), w4.this.a);
            w4.f8681n.set(false);
        }
    }

    public w4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        Context k10 = com.applovin.impl.sdk.k.k();
        this.f8682b = k10;
        this.f8685e = new v4(k10);
    }

    private void m() {
        this.a.e().a(new a());
    }

    public void k() {
        q6 q6Var = this.f8687g;
        if (q6Var != null) {
            q6Var.b();
        }
    }

    public void l() {
        if (!g()) {
            return;
        }
        this.f8690j = ((Boolean) this.a.a(oj.E1)).booleanValue();
        if (this.f8687g == null) {
            this.f8687g = new q6(this.a, this);
        }
        this.f8687g.a();
    }

    public void n() {
        ArrayList arrayList;
        if (!h() && f8681n.compareAndSet(false, true)) {
            Object a10 = this.a.E().a();
            if (a10 != null) {
                e(a10);
                return;
            }
            synchronized (this.f8684d) {
                arrayList = new ArrayList(this.f8683c);
            }
            this.f8685e.a(arrayList, this.a);
            if (!this.f8692l) {
                m();
                this.f8692l = true;
            }
            com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger...");
            r.a(this.f8682b, MaxCreativeDebuggerActivity.class);
            return;
        }
        com.applovin.impl.sdk.t.h("AppLovinSdk", "Creative Debugger is already showing");
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

    public void e() {
        if (g() && this.f8686f.get() == null && !h()) {
            Activity b3 = this.a.e().b();
            if (b3 == null) {
                this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.a.L().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b3.findViewById(R.id.content);
            if (findViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a10 = a(frameLayout, b3);
                frameLayout.addView(a10);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a10.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.bw
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        w4.this.a(a10, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.h(this, a10, frameLayout, viewTreeObserver, onGlobalLayoutListener, 1), TimeUnit.SECONDS.toMillis(5L));
                this.f8686f = new WeakReference(a10);
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

    public boolean h() {
        WeakReference weakReference = f8680m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f8691k);
        if (this.f8691k == 0 || seconds < 10) {
            return;
        }
        this.a.B().a(o.b.GENERIC, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.a.X0();
    }

    public /* synthetic */ void j() {
        this.f8689i = 0;
    }

    public String b(Object obj) {
        JSONObject a10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            return ((com.applovin.impl.sdk.ad.b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof be)) {
            return null;
        }
        String C = ((be) obj).C();
        return (!ve.a(obj) || (a10 = new w(C, this.a).a()) == null) ? C : a10.toString();
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!ve.b(obj) || c(obj)) {
                if (ve.a(obj) && c(obj)) {
                    return;
                }
                synchronized (this.f8684d) {
                    this.f8683c.add(0, new u6(obj, System.currentTimeMillis()));
                    if (this.f8683c.size() > 10) {
                        this.f8683c.remove(r6.size() - 1);
                    }
                }
            }
        }
    }

    public boolean g() {
        return ((Boolean) this.a.a(oj.D1)).booleanValue() && this.a.g0().isCreativeDebuggerEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.widget.ImageButton, android.widget.ImageView, android.view.View] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        int i11 = 2;
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
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
        if (this.f8690j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.cw
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a10;
                    a10 = w4.this.a(frameLayout, view, motionEvent);
                    return a10;
                }
            });
        } else {
            button.setOnClickListener(new gu(this, i11));
        }
        if (x3.f()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    @Override // com.applovin.impl.q6.a
    public void b() {
        if (this.f8689i == 0) {
            this.f8688h = ho.a(TimeUnit.SECONDS.toMillis(3L), this.a, new aw(this, 2));
        }
        int i10 = this.f8689i;
        if (i10 % 2 == 0) {
            this.f8689i = i10 + 1;
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f8690j) {
            view.setOnTouchListener(null);
            this.f8691k = 0L;
        }
        frameLayout.removeView(view);
        this.f8686f = new WeakReference(null);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.t.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        r.a(this.f8682b, MaxCreativeDebuggerDisplayedAdActivity.class, this.a.e(), new b(obj));
    }

    public void a(u6 u6Var, Context context, boolean z10) {
        Object a10 = u6Var.a();
        String a11 = a(u6Var);
        lc lcVar = new lc();
        if (z10) {
            lcVar.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        lcVar.b(a11);
        String b3 = this.a.v().b(a10);
        if (b3 != null) {
            lcVar.a("\nBid Response:\n");
            lcVar.a(b3);
        }
        String str = "AppLovin Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", a10 instanceof com.applovin.impl.sdk.ad.b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                if (!(a10 instanceof com.applovin.impl.sdk.ad.b)) {
                    str = "MAX Ad Report";
                }
                context.startActivity(intent.putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", lcVar.toString()).setPackage("com.google.android.gm"));
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
                return;
            }
        }
        context.startActivity(createChooser);
    }

    public String a(u6 u6Var) {
        String v10;
        Object a10 = u6Var.a();
        lc lcVar = new lc();
        lcVar.b("Ad Info:\n");
        if (a10 instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) a10;
            lcVar.a("Network", "APPLOVIN").a(bVar).b(bVar);
        } else if (a10 instanceof be) {
            lcVar.a((be) a10);
        }
        lcVar.a(this.a);
        lcVar.a("Epoch Timestamp (ms)", Long.valueOf(u6Var.b()));
        if (this.a.y() != null) {
            v10 = this.a.z().u();
        } else {
            v10 = this.a.x().v();
        }
        lcVar.a("\nDebug Info:\n").a("Platform", "fireos".equals(v10) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(oj.U3)).a("App Package Name", this.f8682b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.a.c0()).a("Ad Review Version", v.b()).a(a(a10)).a("User ID", this.a.t0().c() != null ? this.a.t0().c() : "None").a("AEI", this.a.a(oj.f6801z)).a("MEI", this.a.a(oj.A)).a("MD", this.a.a(oj.B));
        return lcVar.toString();
    }

    private Bundle a(Object obj) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a10 = zp.a(obj);
        Bundle a11 = this.a.h().a(a10);
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.v("Serve id: ", a10, this.a.L(), "CreativeDebuggerService");
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CreativeDebuggerService", "Public data: " + a11);
        }
        if (a11 == null) {
            return null;
        }
        for (String str : a11.keySet()) {
            Object obj2 = a11.get(str);
            a11.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a11);
        }
        return a11;
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f8686f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f8691k > 0 && this.f8690j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        int i10 = 1;
        if (motionEvent.getAction() == 0) {
            this.f8691k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new aw(this, i10), TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f8691k = 0L;
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
        int i10 = this.f8689i;
        if (i10 % 2 == 1) {
            this.f8689i = i10 + 1;
        }
        if (this.f8689i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new aw(this, 0));
            this.f8689i = 0;
            this.f8688h.a();
        }
    }
}
