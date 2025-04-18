package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.aa;
import com.applovin.impl.b4;
import com.applovin.impl.b5;
import com.applovin.impl.ba;
import com.applovin.impl.bc;
import com.applovin.impl.c4;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.im;
import com.applovin.impl.ir;
import com.applovin.impl.ke;
import com.applovin.impl.kj;
import com.applovin.impl.kn;
import com.applovin.impl.le;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mg;
import com.applovin.impl.oj;
import com.applovin.impl.pe;
import com.applovin.impl.pj;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.qe;
import com.applovin.impl.qj;
import com.applovin.impl.rm;
import com.applovin.impl.rn;
import com.applovin.impl.rr;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sm;
import com.applovin.impl.te;
import com.applovin.impl.th;
import com.applovin.impl.ue;
import com.applovin.impl.w4;
import com.applovin.impl.wf;
import com.applovin.impl.xl;
import com.applovin.impl.xn;
import com.applovin.impl.xp;
import com.applovin.impl.yc;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import com.applovin.sdk.AppLovinUserSegment;
import h.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {
    public static k A0;
    protected static Context B0;
    private static final boolean D0;
    private static volatile com.applovin.impl.q E0;
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f7707b;

    /* renamed from: d, reason: collision with root package name */
    private long f7711d;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinSdkSettings f7715f;

    /* renamed from: g, reason: collision with root package name */
    private AppLovinUserSegment f7717g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinTargetingData f7719h;

    /* renamed from: h0, reason: collision with root package name */
    private List f7720h0;

    /* renamed from: i, reason: collision with root package name */
    private String f7721i;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f7728l0;

    /* renamed from: o, reason: collision with root package name */
    private volatile AppLovinSdk f7733o;

    /* renamed from: r0, reason: collision with root package name */
    private String f7740r0;

    /* renamed from: s0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f7742s0;

    /* renamed from: v0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f7747v0;

    /* renamed from: w0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f7749w0;
    private static final Object F0 = new Object();
    private static final long C0 = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f7713e = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f7723j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference f7725k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicReference f7727l = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicReference f7729m = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f7731n = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    private final t f7735p = new t(this);

    /* renamed from: q, reason: collision with root package name */
    private final o f7737q = new o(this);

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f7739r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f7741s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f7743t = new AtomicReference();
    private final AtomicReference u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicReference f7746v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f7748w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicReference f7750x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    private final AtomicReference f7752y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    private final AtomicReference f7754z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* renamed from: a0, reason: collision with root package name */
    private final AtomicReference f7706a0 = new AtomicReference();

    /* renamed from: b0, reason: collision with root package name */
    private final AtomicReference f7708b0 = new AtomicReference();

    /* renamed from: c0, reason: collision with root package name */
    private final AtomicReference f7710c0 = new AtomicReference();

    /* renamed from: d0, reason: collision with root package name */
    private final AtomicReference f7712d0 = new AtomicReference();

    /* renamed from: e0, reason: collision with root package name */
    private final AtomicReference f7714e0 = new AtomicReference();

    /* renamed from: f0, reason: collision with root package name */
    private final AtomicReference f7716f0 = new AtomicReference();

    /* renamed from: g0, reason: collision with root package name */
    private final AtomicReference f7718g0 = new AtomicReference();

    /* renamed from: i0, reason: collision with root package name */
    private final Object f7722i0 = new Object();

    /* renamed from: j0, reason: collision with root package name */
    private final AtomicBoolean f7724j0 = new AtomicBoolean(true);

    /* renamed from: k0, reason: collision with root package name */
    private final AtomicBoolean f7726k0 = new AtomicBoolean();

    /* renamed from: m0, reason: collision with root package name */
    private boolean f7730m0 = false;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f7732n0 = false;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f7734o0 = false;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f7736p0 = false;

    /* renamed from: q0, reason: collision with root package name */
    private int f7738q0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    private final Object f7744t0 = new Object();

    /* renamed from: u0, reason: collision with root package name */
    private AppLovinSdkConfiguration f7745u0 = new SdkConfigurationImpl(null, this);

    /* renamed from: x0, reason: collision with root package name */
    private final AtomicBoolean f7751x0 = new AtomicBoolean(false);

    /* renamed from: y0, reason: collision with root package name */
    private final xl f7753y0 = new kn(this, true, "scheduleAdLoadIntegrationError", new f0(6, this));

    /* renamed from: z0, reason: collision with root package name */
    private final xl f7755z0 = new kn(this, true, "sdkInit", new f0(7, this));

    /* renamed from: c, reason: collision with root package name */
    private long f7709c = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public class a implements f4.c {
        public a() {
        }

        @Override // com.applovin.impl.f4.c
        public void a(f4.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements im.b {

        /* loaded from: classes.dex */
        public class a implements f4.c {
            public a() {
            }

            @Override // com.applovin.impl.f4.c
            public void a(f4.b bVar) {
                k.this.L();
                if (t.a()) {
                    k.this.L().a("AppLovinSdk", "Unified flow completed with status: " + bVar);
                }
                if (!bVar.b()) {
                    k.this.d("Initializing SDK in MAX environment...");
                    return;
                }
                k.this.L();
                if (t.a()) {
                    k.this.L().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                }
                k.this.S0();
                k.this.P0();
            }
        }

        public b() {
        }

        @Override // com.applovin.impl.im.b
        public void a(JSONObject jSONObject) {
            boolean z10;
            if (jSONObject != null && jSONObject.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.this.c(jSONObject);
            e.b(k.this);
            c4.a(jSONObject, z10, k.this);
            k.this.P().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k kVar = k.this;
            kVar.f7720h0 = kVar.a(jSONObject);
            if (z10) {
                List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                k kVar2 = k.this;
                kVar2.f7745u0 = new SdkConfigurationImpl(explode, kVar2);
            }
            k.this.n0().a(jSONObject);
            k.this.b(jSONObject);
            bc.b(((Boolean) k.this.a(oj.f6686j6)).booleanValue());
            bc.a(((Boolean) k.this.a(oj.f6694k6)).booleanValue());
            if (!k.this.D0()) {
                k.this.d("Initializing SDK in non-MAX environment...");
            } else if (k.this.t().e() != g4.a.UNIFIED) {
                k.this.d("Initializing SDK in MAX environment...");
            } else {
                Activity p02 = k.this.p0();
                if (!k.this.f7726k0.compareAndSet(false, true)) {
                    k.this.d("Initializing SDK in MAX environment...");
                } else {
                    k.this.t().a();
                    k.this.t().b(p02, new a());
                }
            }
            if (!((Boolean) k.this.a(oj.f6707m3)).booleanValue() || z10 || !c4.a(k.k())) {
                k.this.O0();
                return;
            }
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.T0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements im.b {
        public c() {
        }

        @Override // com.applovin.impl.im.b
        public void a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                k.this.c(jSONObject);
            }
            k.this.f7713e.set(false);
            k.this.O0();
        }
    }

    /* loaded from: classes.dex */
    public class d implements wf.a {
        final /* synthetic */ wf a;

        public d(wf wfVar) {
            this.a = wfVar;
        }

        @Override // com.applovin.impl.wf.a
        public void a() {
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f7722i0) {
                if (!k.this.f7728l0) {
                    k.this.S0();
                }
            }
            this.a.b(this);
        }

        @Override // com.applovin.impl.wf.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new g0(0));
            D0 = true;
        } catch (Throwable unused) {
            D0 = false;
        }
    }

    public k(Context context) {
        this.f7728l0 = false;
        this.f7715f = new AppLovinSdkSettings(context);
        this.f7728l0 = true;
        if (B0()) {
            B0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.f7707b = new WeakReference((Activity) context);
            }
            if (A0 == null) {
                A0 = this;
                return;
            } else {
                t.h("AppLovinSdk", "Multiple SDK instances detected");
                return;
            }
        }
        throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
    }

    public static boolean B0() {
        return D0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        if (l0().d()) {
            return;
        }
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Timing out adapters init...");
        }
        l0().e();
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        sm l02 = l0();
        int i10 = this.f7738q0 + 1;
        this.f7738q0 = i10;
        l02.a((xl) new im(i10, this, new c()), sm.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        if (D0()) {
            r.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        synchronized (this.f7722i0) {
            boolean a10 = c4.a(k());
            if (!((Boolean) a(oj.f6715n3)).booleanValue() || a10) {
                S0();
            }
            if (((Boolean) a(oj.f6707m3)).booleanValue() && !a10) {
                L();
                if (t.a()) {
                    L().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                T0();
            }
            if (t().e() == g4.a.TERMS) {
                if (D0()) {
                    L();
                    if (t.a()) {
                        L().a("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                    }
                    t().a();
                    t().b(p0(), new a());
                } else {
                    L();
                    if (t.a()) {
                        L().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + this.f7721i);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        synchronized (this.f7744t0) {
            if (this.f7742s0 != null) {
                return;
            }
            this.f7753y0.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        synchronized (this.f7744t0) {
            if (this.f7742s0 != null) {
                return;
            }
            this.f7751x0.set(true);
            this.f7755z0.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        c(qj.I);
    }

    private w N0() {
        if (th.f(B0)) {
            try {
                return new w(this);
            } catch (Throwable th2) {
                t.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th2);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        Long l10 = (Long) a(oj.f6774v3);
        if (l10.longValue() < 0) {
            return;
        }
        int i10 = 0;
        if (!this.f7713e.compareAndSet(false, true)) {
            return;
        }
        ir.a(l10.longValue(), false, this, new f0(i10, this));
    }

    private void Q0() {
        Context context = B0;
        t L = L();
        sj i02 = i0();
        f4 t5 = t();
        a(context);
        f0();
        h();
        l();
        X();
        N().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        if (TextUtils.isEmpty(this.a)) {
            t.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            t.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.a.length() != 86 && zp.c(this)) {
            t.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.a + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.a)) {
            t.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (!zp.c(this)) {
                return;
            } else {
                throw new RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
        }
        if (zp.i()) {
            t.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!zp.b(this)) {
            t.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (zp.k(context)) {
            this.f7715f.setVerboseLogging(true);
        }
        h0().a(oj.f6695l, Boolean.valueOf(this.f7715f.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        qj qjVar = qj.f7222c;
        if (TextUtils.isEmpty((String) i02.a(qjVar, (Object) null, defaultSharedPreferences))) {
            this.f7732n0 = true;
            i02.b(qjVar, Boolean.toString(true), defaultSharedPreferences);
        } else {
            i02.b(qjVar, Boolean.toString(false), defaultSharedPreferences);
        }
        qj qjVar2 = qj.f7223d;
        if (((Boolean) i02.a(qjVar2, Boolean.FALSE)).booleanValue()) {
            if (t.a()) {
                L.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f7734o0 = true;
        } else {
            if (t.a()) {
                L.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            i02.b(qjVar2, Boolean.TRUE);
            i02.b(qj.f7234o, Boolean.valueOf(t5.k()));
        }
        qj qjVar3 = qj.f7224e;
        String str = (String) i02.a(qjVar3, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE > zp.f(str)) {
                i02.b(qjVar3, AppLovinSdk.VERSION);
                return;
            }
            return;
        }
        i02.b(qjVar3, AppLovinSdk.VERSION);
    }

    private Map R() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(oj.f6755s4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        Q0();
        if (this.f7715f.isExceptionHandlerEnabled() && ((Boolean) a(oj.f6794y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int parseInt = StringUtils.parseInt(this.f7715f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(oj.f6748r4)).intValue());
        sm l02 = l0();
        kn knVar = new kn(this, true, "scheduleAdLoadIntegrationErrorAuto", new f0(3, this));
        sm.b bVar = sm.b.CORE;
        long j3 = parseInt;
        l02.a(knVar, bVar, j3);
        l0().a(new kn(this, true, "scheduleSdkInit", new f0(4, this)), bVar, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        wf X = X();
        X.a(new d(X));
    }

    public String A() {
        return this.f7740r0;
    }

    public boolean A0() {
        boolean z10;
        synchronized (this.f7722i0) {
            z10 = this.f7728l0;
        }
        return z10;
    }

    public o B() {
        return this.f7737q;
    }

    public EventServiceImpl C() {
        Object obj = this.f7727l.get();
        if (obj == null) {
            synchronized (this.f7727l) {
                obj = this.f7727l.get();
                if (obj == null) {
                    obj = new EventServiceImpl(this);
                    this.f7727l.set(obj);
                }
            }
        }
        if (obj == this.f7727l) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public AtomicBoolean C0() {
        return this.f7751x0;
    }

    public p D() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                obj = this.G.get();
                if (obj == null) {
                    obj = new p(this);
                    this.G.set(obj);
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (p) obj;
    }

    public boolean D0() {
        return StringUtils.containsIgnoreCase(Q(), AppLovinMediationProvider.MAX);
    }

    public q E() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                obj = this.I.get();
                if (obj == null) {
                    obj = new q(this);
                    this.I.set(obj);
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (q) obj;
    }

    public boolean E0() {
        return zp.a("com.unity3d.player.UnityPlayerActivity");
    }

    public ba F() {
        Object obj = this.u.get();
        if (obj == null) {
            synchronized (this.u) {
                obj = this.u.get();
                if (obj == null) {
                    obj = new ba(this);
                    this.u.set(obj);
                }
            }
        }
        if (obj == this.u) {
            obj = null;
        }
        return (ba) obj;
    }

    public yc G() {
        Object obj = this.f7708b0.get();
        if (obj == null) {
            synchronized (this.f7708b0) {
                obj = this.f7708b0.get();
                if (obj == null) {
                    obj = new yc(this);
                    this.f7708b0.set(obj);
                }
            }
        }
        if (obj == this.f7708b0) {
            obj = null;
        }
        return (yc) obj;
    }

    public Activity H() {
        WeakReference weakReference = this.f7707b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration I() {
        return this.f7742s0;
    }

    public long J() {
        return this.f7709c;
    }

    public s K() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                obj = this.S.get();
                if (obj == null) {
                    obj = new s(this);
                    this.S.set(obj);
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (s) obj;
    }

    public t L() {
        return this.f7735p;
    }

    public com.applovin.impl.mediation.d M() {
        Object obj = this.f7716f0.get();
        if (obj == null) {
            synchronized (this.f7716f0) {
                obj = this.f7716f0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.d(this);
                    this.f7716f0.set(obj);
                }
            }
        }
        if (obj == this.f7716f0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void M0() {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((!t().j() || t().e() != g4.a.UNIFIED) && (sdkInitializationListener = this.f7747v0) != null) {
            if (y0()) {
                this.f7747v0 = null;
                this.f7749w0 = null;
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else {
                if (this.f7749w0 == sdkInitializationListener) {
                    return;
                }
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(oj.f6770v)).booleanValue()) {
                    this.f7747v0 = null;
                } else {
                    this.f7749w0 = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new e0(this, sdkInitializationListener, 0), Math.max(0L, ((Long) a(oj.f6778w)).longValue()));
        }
    }

    public com.applovin.impl.mediation.e N() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                obj = this.Z.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.e(this);
                    this.Z.set(obj);
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (com.applovin.impl.mediation.e) obj;
    }

    public com.applovin.impl.mediation.f O() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                obj = this.Y.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.f(this);
                    this.Y.set(obj);
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public pe P() {
        Object obj = this.f7712d0.get();
        if (obj == null) {
            synchronized (this.f7712d0) {
                obj = this.f7712d0.get();
                if (obj == null) {
                    obj = new pe(this);
                    this.f7712d0.set(obj);
                }
            }
        }
        if (obj == this.f7712d0) {
            obj = null;
        }
        return (pe) obj;
    }

    public void P0() {
        o().a();
    }

    public String Q() {
        String str = (String) a(qj.I);
        if (StringUtils.isValidString(str)) {
            return str;
        }
        return this.f7721i;
    }

    public MediationServiceImpl S() {
        Object obj = this.f7706a0.get();
        if (obj == null) {
            synchronized (this.f7706a0) {
                obj = this.f7706a0.get();
                if (obj == null) {
                    obj = new MediationServiceImpl(this);
                    this.f7706a0.set(obj);
                }
            }
        }
        if (obj == this.f7706a0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public void S0() {
        synchronized (this.f7722i0) {
            this.f7728l0 = true;
            l0().f();
            d();
        }
    }

    public te T() {
        Object obj = this.f7746v.get();
        if (obj == null) {
            synchronized (this.f7746v) {
                obj = this.f7746v.get();
                if (obj == null) {
                    obj = new te(this);
                    this.f7746v.set(obj);
                }
            }
        }
        if (obj == this.f7746v) {
            obj = null;
        }
        return (te) obj;
    }

    public ue U() {
        Object obj = this.f7710c0.get();
        if (obj == null) {
            synchronized (this.f7710c0) {
                obj = this.f7710c0.get();
                if (obj == null) {
                    obj = new ue();
                    this.f7710c0.set(obj);
                }
            }
        }
        if (obj == this.f7710c0) {
            obj = null;
        }
        return (ue) obj;
    }

    public void U0() {
        t.h("AppLovinSdk", "Resetting SDK state...");
        ba F = F();
        aa aaVar = aa.f3622l;
        long b3 = F.b(aaVar);
        h0().a();
        h0().e();
        F().a();
        F().b(aaVar, b3 + 1);
        if (this.f7724j0.compareAndSet(true, false)) {
            S0();
        } else {
            this.f7724j0.set(true);
        }
    }

    public u V() {
        Object obj = this.f7714e0.get();
        if (obj == null) {
            synchronized (this.f7714e0) {
                obj = this.f7714e0.get();
                if (obj == null) {
                    obj = new u(this);
                    this.f7714e0.set(obj);
                }
            }
        }
        if (obj == this.f7714e0) {
            obj = null;
        }
        return (u) obj;
    }

    public void V0() {
        if (!StringUtils.isValidString(this.f7740r0)) {
            this.f7740r0 = AppLovinMediationProvider.MAX;
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Detected mediation provider: MAX");
            }
        }
    }

    public AppLovinNativeAdService W() {
        Object obj = this.f7725k.get();
        if (obj == null) {
            synchronized (this.f7725k) {
                obj = this.f7725k.get();
                if (obj == null) {
                    obj = new AppLovinNativeAdService(this);
                    this.f7725k.set(obj);
                }
            }
        }
        if (obj == this.f7725k) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public void W0() {
        v().n();
    }

    public wf X() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                obj = this.K.get();
                if (obj == null) {
                    obj = new wf(k());
                    this.K.set(obj);
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (wf) obj;
    }

    public void X0() {
        a((Map) null);
    }

    public mg Y() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                obj = this.R.get();
                if (obj == null) {
                    obj = new mg(this);
                    this.R.set(obj);
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (mg) obj;
    }

    public com.applovin.impl.sdk.network.b Z() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                obj = this.W.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.network.b(this);
                    this.W.set(obj);
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public PostbackServiceImpl a0() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                obj = this.V.get();
                if (obj == null) {
                    obj = new PostbackServiceImpl(this);
                    this.V.set(obj);
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public List b(oj ojVar) {
        return h0().b(ojVar);
    }

    public w b0() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                obj = this.A.get();
                if (obj == null) {
                    obj = N0();
                    if (obj == null) {
                        obj = this.A;
                    }
                    this.A.set(obj);
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (w) obj;
    }

    public List c(oj ojVar) {
        return h0().c(ojVar);
    }

    public String c0() {
        return t0().a();
    }

    public String d0() {
        return this.a;
    }

    public kj e0() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                obj = this.M.get();
                if (obj == null) {
                    obj = new kj(this);
                    this.M.set(obj);
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (kj) obj;
    }

    public SessionTracker f0() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                obj = this.H.get();
                if (obj == null) {
                    obj = new SessionTracker(this);
                    this.H.set(obj);
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings g0() {
        return this.f7715f;
    }

    public pj h0() {
        Object obj = this.f7741s.get();
        if (obj == null) {
            synchronized (this.f7741s) {
                obj = this.f7741s.get();
                if (obj == null) {
                    obj = new pj(this);
                    this.f7741s.set(obj);
                }
            }
        }
        if (obj == this.f7741s) {
            obj = null;
        }
        return (pj) obj;
    }

    public sj i0() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                obj = this.B.get();
                if (obj == null) {
                    obj = new sj(this);
                    this.B.set(obj);
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (sj) obj;
    }

    public AppLovinTargetingDataImpl j0() {
        return (AppLovinTargetingDataImpl) this.f7719h;
    }

    public Map k0() {
        if (j0() == null) {
            return null;
        }
        if (C0().get()) {
            return j0().getAllData();
        }
        return j0().getJsonData();
    }

    public sm l0() {
        Object obj = this.f7739r.get();
        if (obj == null) {
            synchronized (this.f7739r) {
                obj = this.f7739r.get();
                if (obj == null) {
                    obj = new sm(this);
                    this.f7739r.set(obj);
                }
            }
        }
        if (obj == this.f7739r) {
            obj = null;
        }
        return (sm) obj;
    }

    public rn m0() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                obj = this.P.get();
                if (obj == null) {
                    obj = new rn(this);
                    this.P.set(obj);
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (rn) obj;
    }

    public xn n0() {
        Object obj = this.f7718g0.get();
        if (obj == null) {
            synchronized (this.f7718g0) {
                obj = this.f7718g0.get();
                if (obj == null) {
                    obj = new xn(this);
                    this.f7718g0.set(obj);
                }
            }
        }
        if (obj == this.f7718g0) {
            obj = null;
        }
        return (xn) obj;
    }

    public long o0() {
        if (this.f7711d == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f7711d;
    }

    public Activity p0() {
        Activity b3 = a(k()).b();
        if (b3 != null) {
            return b3;
        }
        return H();
    }

    public String q0() {
        return t0().c();
    }

    public AppLovinUserSegment r0() {
        return this.f7717g;
    }

    public UserServiceImpl s0() {
        Object obj = this.f7729m.get();
        if (obj == null) {
            synchronized (this.f7729m) {
                obj = this.f7729m.get();
                if (obj == null) {
                    obj = new UserServiceImpl(this);
                    this.f7729m.set(obj);
                }
            }
        }
        if (obj == this.f7729m) {
            obj = null;
        }
        return (UserServiceImpl) obj;
    }

    public f4 t() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                obj = this.O.get();
                if (obj == null) {
                    obj = new f4(this);
                    this.O.set(obj);
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (f4) obj;
    }

    public xp t0() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                obj = this.D.get();
                if (obj == null) {
                    obj = new xp(this);
                    this.D.set(obj);
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (xp) obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CoreSdk{sdkKey='");
        sb2.append(this.a);
        sb2.append("', enabled=");
        sb2.append(this.f7730m0);
        sb2.append(", isFirstSession=");
        return a4.j.l(sb2, this.f7732n0, AbstractJsonLexerKt.END_OBJ);
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings u() {
        return g0().getBackingConsentFlowSettings();
    }

    public rr u0() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                obj = this.J.get();
                if (obj == null) {
                    obj = new rr(this);
                    this.J.set(obj);
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (rr) obj;
    }

    public w4 v() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                obj = this.Q.get();
                if (obj == null) {
                    obj = new w4(this);
                    this.Q.set(obj);
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (w4) obj;
    }

    public AppLovinSdk v0() {
        return this.f7733o;
    }

    public b5 w() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                obj = this.U.get();
                if (obj == null) {
                    obj = new b5(this);
                    this.U.set(obj);
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (b5) obj;
    }

    public boolean w0() {
        return this.f7734o0;
    }

    public l x() {
        Object obj = this.f7750x.get();
        if (obj == null) {
            synchronized (this.f7750x) {
                obj = this.f7750x.get();
                if (obj == null) {
                    obj = new l(this);
                    this.f7750x.set(obj);
                }
            }
        }
        if (obj == this.f7750x) {
            obj = null;
        }
        return (l) obj;
    }

    public boolean x0() {
        Object obj;
        Object obj2 = this.f7754z.get();
        Object obj3 = obj2;
        if (obj2 == null) {
            synchronized (this.f7754z) {
                Object obj4 = this.f7754z.get();
                obj = obj4;
                if (obj4 == null) {
                    Boolean bool = (Boolean) a(oj.F3);
                    bool.booleanValue();
                    this.f7754z.set(bool);
                    obj = bool;
                }
            }
            obj3 = obj;
        }
        return ((Boolean) obj3).booleanValue();
    }

    public m y() {
        Object obj = this.f7752y.get();
        Object obj2 = null;
        if (obj == null) {
            synchronized (this.f7752y) {
                obj = this.f7752y.get();
                if (obj == null) {
                    if (x0()) {
                        obj = new m(this);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = this.f7752y;
                    }
                    this.f7752y.set(obj);
                }
            }
        }
        if (obj != this.f7752y) {
            obj2 = obj;
        }
        return (m) obj2;
    }

    public boolean y0() {
        boolean z10;
        synchronized (this.f7722i0) {
            z10 = this.f7730m0;
        }
        return z10;
    }

    public n z() {
        Object obj = this.f7748w.get();
        Object obj2 = null;
        if (obj == null) {
            synchronized (this.f7748w) {
                obj = this.f7748w.get();
                if (obj == null) {
                    if (x0()) {
                        obj = new n(this);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = this.f7748w;
                    }
                    this.f7748w.set(obj);
                }
            }
        }
        if (obj != this.f7748w) {
            obj2 = obj;
        }
        return (n) obj2;
    }

    public boolean z0() {
        return this.f7732n0;
    }

    private void d() {
        sm l02 = l0();
        int i10 = this.f7738q0 + 1;
        this.f7738q0 = i10;
        l02.a((xl) new im(i10, this, new b()), sm.b.CORE);
    }

    public static long j() {
        return C0;
    }

    public static Context k() {
        return B0;
    }

    public Object a(oj ojVar) {
        return h0().a(ojVar);
    }

    public Object b(qj qjVar) {
        return i0().a(qjVar);
    }

    public void c(qj qjVar) {
        i0().b(qjVar);
    }

    public com.applovin.impl.q e() {
        return a(B0);
    }

    public com.applovin.impl.sdk.a f() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                obj = this.F.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.a(this);
                    this.F.set(obj);
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public com.applovin.impl.sdk.c g() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                obj = this.E.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.c(this);
                    this.E.set(obj);
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (com.applovin.impl.sdk.c) obj;
    }

    public com.applovin.impl.v h() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                obj = this.X.get();
                if (obj == null) {
                    obj = new com.applovin.impl.v(this);
                    this.X.set(obj);
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (com.applovin.impl.v) obj;
    }

    public AppLovinAdServiceImpl i() {
        Object obj = this.f7723j.get();
        if (obj == null) {
            synchronized (this.f7723j) {
                obj = this.f7723j.get();
                if (obj == null) {
                    obj = new AppLovinAdServiceImpl(this);
                    this.f7723j.set(obj);
                }
            }
        }
        if (obj == this.f7723j) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public ArrayService l() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                obj = this.T.get();
                if (obj == null) {
                    obj = new ArrayService(this);
                    this.T.set(obj);
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (ArrayService) obj;
    }

    public f m() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                obj = this.N.get();
                if (obj == null) {
                    obj = new f(this);
                    this.N.set(obj);
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (f) obj;
    }

    public CmpServiceImpl n() {
        Object obj = this.f7731n.get();
        if (obj == null) {
            synchronized (this.f7731n) {
                obj = this.f7731n.get();
                if (obj == null) {
                    obj = new CmpServiceImpl(this);
                    this.f7731n.set(obj);
                }
            }
        }
        if (obj == this.f7731n) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public h o() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                obj = this.L.get();
                if (obj == null) {
                    obj = new h(this);
                    this.L.set(obj);
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (h) obj;
    }

    public String p() {
        return t0().b();
    }

    public AppLovinSdkConfiguration q() {
        return this.f7745u0;
    }

    public b4 r() {
        Object obj = this.f7743t.get();
        if (obj == null) {
            synchronized (this.f7743t) {
                obj = this.f7743t.get();
                if (obj == null) {
                    obj = new b4(this);
                    this.f7743t.set(obj);
                }
            }
        }
        if (obj == this.f7743t) {
            obj = null;
        }
        return (b4) obj;
    }

    public j s() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                obj = this.C.get();
                if (obj == null) {
                    obj = new j(this);
                    this.C.set(obj);
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (j) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", str);
        }
        l0().a(new rm(this));
    }

    public Object a(qj qjVar) {
        return a(qjVar, (Object) null);
    }

    public void b(qj qjVar, Object obj) {
        i0().b(qjVar, obj);
    }

    public void e(String str) {
        L();
        if (t.a()) {
            a4.j.x("setMediationProvider(mediationProvider=", str, ")", L(), "AppLovinSdk");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
            t.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.f7721i = str;
        if (zp.h()) {
            zp.a((Runnable) new f0(1, this));
        } else {
            c(qj.I);
        }
    }

    public void f(String str) {
        t.g("AppLovinSdk", "Setting plugin version: " + str);
        if (zp.h()) {
            zp.a((Runnable) new h0(this, str, 1));
        } else {
            h0().a(oj.U3, str);
        }
    }

    public void g(String str) {
        L();
        if (t.a()) {
            a4.j.v("Setting user id: ", str, L(), "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        if (zp.h()) {
            zp.a((Runnable) new h0(this, str, 0));
        } else {
            t0().a(str);
        }
    }

    public Object a(qj qjVar, Object obj) {
        return i0().a(qjVar, obj);
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        i0().b(qjVar, obj, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        this.f7711d = System.currentTimeMillis();
        c4.c(jSONObject, this);
        c4.b(jSONObject, this);
        c4.a(jSONObject, this);
        le.f(jSONObject, this);
        le.d(jSONObject, this);
        le.e(jSONObject, this);
        le.a(jSONObject);
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return i0().a(qjVar, obj, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f7745u0);
    }

    public boolean a(oj ojVar, MaxAdFormat maxAdFormat) {
        return b(ojVar).contains(maxAdFormat);
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        B0 = context.getApplicationContext();
    }

    public void a(ke keVar) {
        if (l0().d()) {
            return;
        }
        List c10 = c(qe.G6);
        if (c10.size() <= 0 || !N().a().keySet().containsAll(c10)) {
            return;
        }
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "All required adapters initialized");
        }
        l0().e();
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f7745u0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        Q0();
        this.f7715f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            t.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            h0().a(oj.U3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(oj.f6794y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        sm l02 = l0();
        xl xlVar = this.f7753y0;
        sm.b bVar = sm.b.CORE;
        l02.a(xlVar, bVar);
        l0().a(this.f7755z0, bVar);
    }

    public void c() {
        synchronized (this.f7722i0) {
            if (!this.f7728l0 && !this.f7730m0) {
                S0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f7745u0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            t.h("AppLovinSdk", (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        t0().a(str);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f7733o = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context k10 = k();
        return a(k10.getResources().getIdentifier(str, "string", k10.getPackageName()), list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r12.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r15.f7740r0 = (java.lang.String) r13.getValue();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (com.applovin.impl.sdk.t.a() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        L().a("AppLovinSdk", "Detected mediation provider: " + r15.f7740r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6.booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public static String a(int i10, List list) {
        String string = k().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static com.applovin.impl.q a(Context context) {
        if (E0 == null) {
            synchronized (F0) {
                if (E0 == null) {
                    E0 = new com.applovin.impl.q(context);
                }
            }
        }
        return E0;
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.f7751x0.get()) {
            t.h("AppLovinSdk", "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            B().a(o.b.INTEGRATION_ERROR, "legacy_init_already");
            if (zp.c(this)) {
                throw new IllegalStateException("Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            }
            return;
        }
        synchronized (this.f7744t0) {
            if (this.f7742s0 != null) {
                if (!y0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new e0(this, sdkInitializationListener, 1));
                return;
            }
            this.f7742s0 = appLovinSdkInitializationConfiguration;
            this.f7747v0 = sdkInitializationListener;
            this.a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.f7721i = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.f7719h = appLovinSdkInitializationConfiguration.getTargetingData();
            this.f7717g = appLovinSdkInitializationConfiguration.getUserSegment();
            zp.a((Runnable) new o0(17, this, appLovinSdkInitializationConfiguration));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        h0().a(oj.U3, str);
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        C0().set(true);
        this.a = str;
        this.f7715f = appLovinSdkSettings;
        this.f7717g = new AppLovinUserSegment();
        this.f7719h = new AppLovinTargetingDataImpl();
        zp.a((Runnable) new f0(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString((String) it.next());
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public void a(boolean z10) {
        synchronized (this.f7722i0) {
            this.f7728l0 = false;
            this.f7730m0 = z10;
        }
        if (z10) {
            List c10 = c(qe.G6);
            if (c10.isEmpty()) {
                l0().e();
                M0();
                return;
            }
            Long l10 = (Long) a(qe.H6);
            kn knVar = new kn(this, true, "timeoutInitAdapters", new f0(2, this));
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Waiting for required adapters to init: " + c10 + " - timing out in " + l10 + "ms...");
            }
            l0().a(knVar, sm.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f7720h0;
        return (list == null || list.size() <= 0 || this.f7720h0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) i0().a(qj.f7224e, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < zp.f(str)) {
                t.h("AppLovinSdk", a4.j.k(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    public void a(Map map) {
        P().a(map);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        i0().a(str, obj, editor);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return sj.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        i0().a(sharedPreferences);
    }

    public void a(long j3) {
        s().b(j3);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!y0()) {
            this.f7747v0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new e0(this, sdkInitializationListener, 2));
        }
    }
}
