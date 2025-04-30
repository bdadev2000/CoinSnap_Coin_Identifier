package com.applovin.impl.sdk;

import Q7.n0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.C0738q;
import com.applovin.impl.C0765v;
import com.applovin.impl.L;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: A0 */
    public static k f10832A0;

    /* renamed from: B0 */
    protected static Context f10833B0;

    /* renamed from: D0 */
    private static final boolean f10835D0;

    /* renamed from: E0 */
    private static volatile C0738q f10836E0;

    /* renamed from: a */
    private String f10863a;
    private WeakReference b;

    /* renamed from: d */
    private long f10868d;

    /* renamed from: f */
    private AppLovinSdkSettings f10872f;

    /* renamed from: g */
    private AppLovinUserSegment f10873g;

    /* renamed from: h */
    private AppLovinTargetingData f10875h;

    /* renamed from: h0 */
    private List f10876h0;

    /* renamed from: i */
    private String f10877i;

    /* renamed from: l0 */
    private boolean f10883l0;

    /* renamed from: o */
    private volatile AppLovinSdk f10887o;

    /* renamed from: r0 */
    private String f10894r0;

    /* renamed from: s0 */
    private AppLovinSdkInitializationConfiguration f10896s0;

    /* renamed from: v0 */
    private AppLovinSdk.SdkInitializationListener f10902v0;

    /* renamed from: w0 */
    private AppLovinSdk.SdkInitializationListener f10904w0;

    /* renamed from: F0 */
    private static final Object f10837F0 = new Object();

    /* renamed from: C0 */
    private static final long f10834C0 = System.currentTimeMillis();

    /* renamed from: e */
    private final AtomicBoolean f10870e = new AtomicBoolean();

    /* renamed from: j */
    private final AtomicReference f10879j = new AtomicReference();

    /* renamed from: k */
    private final AtomicReference f10881k = new AtomicReference();
    private final AtomicReference l = new AtomicReference();
    private final AtomicReference m = new AtomicReference();

    /* renamed from: n */
    private final AtomicReference f10885n = new AtomicReference();

    /* renamed from: p */
    private final t f10889p = new t(this);

    /* renamed from: q */
    private final o f10891q = new o(this);

    /* renamed from: r */
    private final AtomicReference f10893r = new AtomicReference();

    /* renamed from: s */
    private final AtomicReference f10895s = new AtomicReference();

    /* renamed from: t */
    private final AtomicReference f10897t = new AtomicReference();

    /* renamed from: u */
    private final AtomicReference f10899u = new AtomicReference();

    /* renamed from: v */
    private final AtomicReference f10901v = new AtomicReference();

    /* renamed from: w */
    private final AtomicReference f10903w = new AtomicReference();

    /* renamed from: x */
    private final AtomicReference f10905x = new AtomicReference();

    /* renamed from: y */
    private final AtomicReference f10907y = new AtomicReference();

    /* renamed from: z */
    private final AtomicReference f10909z = new AtomicReference();

    /* renamed from: A */
    private final AtomicReference f10838A = new AtomicReference();

    /* renamed from: B */
    private final AtomicReference f10839B = new AtomicReference();

    /* renamed from: C */
    private final AtomicReference f10840C = new AtomicReference();

    /* renamed from: D */
    private final AtomicReference f10841D = new AtomicReference();

    /* renamed from: E */
    private final AtomicReference f10842E = new AtomicReference();

    /* renamed from: F */
    private final AtomicReference f10843F = new AtomicReference();

    /* renamed from: G */
    private final AtomicReference f10844G = new AtomicReference();

    /* renamed from: H */
    private final AtomicReference f10845H = new AtomicReference();

    /* renamed from: I */
    private final AtomicReference f10846I = new AtomicReference();

    /* renamed from: J */
    private final AtomicReference f10847J = new AtomicReference();

    /* renamed from: K */
    private final AtomicReference f10848K = new AtomicReference();

    /* renamed from: L */
    private final AtomicReference f10849L = new AtomicReference();

    /* renamed from: M */
    private final AtomicReference f10850M = new AtomicReference();

    /* renamed from: N */
    private final AtomicReference f10851N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();

    /* renamed from: P */
    private final AtomicReference f10852P = new AtomicReference();

    /* renamed from: Q */
    private final AtomicReference f10853Q = new AtomicReference();

    /* renamed from: R */
    private final AtomicReference f10854R = new AtomicReference();

    /* renamed from: S */
    private final AtomicReference f10855S = new AtomicReference();

    /* renamed from: T */
    private final AtomicReference f10856T = new AtomicReference();

    /* renamed from: U */
    private final AtomicReference f10857U = new AtomicReference();

    /* renamed from: V */
    private final AtomicReference f10858V = new AtomicReference();

    /* renamed from: W */
    private final AtomicReference f10859W = new AtomicReference();

    /* renamed from: X */
    private final AtomicReference f10860X = new AtomicReference();

    /* renamed from: Y */
    private final AtomicReference f10861Y = new AtomicReference();

    /* renamed from: Z */
    private final AtomicReference f10862Z = new AtomicReference();

    /* renamed from: a0 */
    private final AtomicReference f10864a0 = new AtomicReference();

    /* renamed from: b0 */
    private final AtomicReference f10865b0 = new AtomicReference();

    /* renamed from: c0 */
    private final AtomicReference f10867c0 = new AtomicReference();

    /* renamed from: d0 */
    private final AtomicReference f10869d0 = new AtomicReference();

    /* renamed from: e0 */
    private final AtomicReference f10871e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();

    /* renamed from: g0 */
    private final AtomicReference f10874g0 = new AtomicReference();

    /* renamed from: i0 */
    private final Object f10878i0 = new Object();

    /* renamed from: j0 */
    private final AtomicBoolean f10880j0 = new AtomicBoolean(true);

    /* renamed from: k0 */
    private final AtomicBoolean f10882k0 = new AtomicBoolean();

    /* renamed from: m0 */
    private boolean f10884m0 = false;

    /* renamed from: n0 */
    private boolean f10886n0 = false;

    /* renamed from: o0 */
    private boolean f10888o0 = false;

    /* renamed from: p0 */
    private boolean f10890p0 = false;

    /* renamed from: q0 */
    private int f10892q0 = 0;

    /* renamed from: t0 */
    private final Object f10898t0 = new Object();

    /* renamed from: u0 */
    private AppLovinSdkConfiguration f10900u0 = new SdkConfigurationImpl(null, this);

    /* renamed from: x0 */
    private final AtomicBoolean f10906x0 = new AtomicBoolean(false);

    /* renamed from: y0 */
    private final xl f10908y0 = new kn(this, true, "scheduleAdLoadIntegrationError", new F(1, this));

    /* renamed from: z0 */
    private final xl f10910z0 = new kn(this, true, "sdkInit", new F(2, this));

    /* renamed from: c */
    private long f10866c = System.currentTimeMillis();

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
            boolean z8;
            if (jSONObject != null && jSONObject.length() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            k.this.c(jSONObject);
            C0753e.b(k.this);
            c4.a(jSONObject, z8, k.this);
            k.this.P().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k kVar = k.this;
            kVar.f10876h0 = kVar.a(jSONObject);
            if (z8) {
                List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                k kVar2 = k.this;
                kVar2.f10900u0 = new SdkConfigurationImpl(explode, kVar2);
            }
            k.this.n0().a(jSONObject);
            k.this.b(jSONObject);
            bc.b(((Boolean) k.this.a(oj.f9791j6)).booleanValue());
            bc.a(((Boolean) k.this.a(oj.k6)).booleanValue());
            if (!k.this.D0()) {
                k.this.d("Initializing SDK in non-MAX environment...");
            } else if (k.this.t().e() != g4.a.UNIFIED) {
                k.this.d("Initializing SDK in MAX environment...");
            } else {
                Activity p02 = k.this.p0();
                if (!k.this.f10882k0.compareAndSet(false, true)) {
                    k.this.d("Initializing SDK in MAX environment...");
                } else {
                    k.this.t().a();
                    k.this.t().b(p02, new a());
                }
            }
            if (!((Boolean) k.this.a(oj.f9805m3)).booleanValue() || z8 || !c4.a(k.k())) {
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
            k.this.f10870e.set(false);
            k.this.O0();
        }
    }

    /* loaded from: classes.dex */
    public class d implements wf.a {

        /* renamed from: a */
        final /* synthetic */ wf f10915a;

        public d(wf wfVar) {
            this.f10915a = wfVar;
        }

        @Override // com.applovin.impl.wf.a
        public void a() {
            k.this.L();
            if (t.a()) {
                k.this.L().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f10878i0) {
                try {
                    if (!k.this.f10883l0) {
                        k.this.S0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10915a.b(this);
        }

        @Override // com.applovin.impl.wf.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new C2.b(10));
            f10835D0 = true;
        } catch (Throwable unused) {
            f10835D0 = false;
        }
    }

    public k(Context context) {
        this.f10883l0 = false;
        this.f10872f = new AppLovinSdkSettings(context);
        this.f10883l0 = true;
        if (B0()) {
            f10833B0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.b = new WeakReference((Activity) context);
            }
            if (f10832A0 == null) {
                f10832A0 = this;
                return;
            } else {
                t.h("AppLovinSdk", "Multiple SDK instances detected");
                return;
            }
        }
        throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
    }

    public static boolean B0() {
        return f10835D0;
    }

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

    public /* synthetic */ void G0() {
        sm l02 = l0();
        int i9 = this.f10892q0 + 1;
        this.f10892q0 = i9;
        l02.a((xl) new im(i9, this, new c()), sm.b.CORE);
    }

    public /* synthetic */ void H0() {
        if (D0()) {
            r.b(this);
        }
    }

    public /* synthetic */ void I0() {
        synchronized (this.f10878i0) {
            try {
                boolean a6 = c4.a(k());
                if (!((Boolean) a(oj.f9811n3)).booleanValue() || a6) {
                    S0();
                }
                if (((Boolean) a(oj.f9805m3)).booleanValue() && !a6) {
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
                            L().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + this.f10877i);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void J0() {
        synchronized (this.f10898t0) {
            try {
                if (this.f10896s0 != null) {
                    return;
                }
                this.f10908y0.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void K0() {
        synchronized (this.f10898t0) {
            try {
                if (this.f10896s0 != null) {
                    return;
                }
                this.f10906x0.set(true);
                this.f10910z0.run();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void L0() {
        c(qj.f10360I);
    }

    private w N0() {
        if (th.f(f10833B0)) {
            try {
                return new w(this);
            } catch (Throwable th) {
                t.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
                return null;
            }
        }
        return null;
    }

    public void O0() {
        Long l = (Long) a(oj.f9870v3);
        if (l.longValue() < 0 || !this.f10870e.compareAndSet(false, true)) {
            return;
        }
        ir.a(l.longValue(), false, this, new F(4, this));
    }

    private void Q0() {
        Context context = f10833B0;
        t L8 = L();
        sj i02 = i0();
        f4 t9 = t();
        a(context);
        f0();
        h();
        l();
        X();
        N().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        if (TextUtils.isEmpty(this.f10863a)) {
            t.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            t.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.f10863a.length() != 86 && zp.c(this)) {
            t.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f10863a + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f10863a)) {
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
            this.f10872f.setVerboseLogging(true);
        }
        h0().a(oj.l, Boolean.valueOf(this.f10872f.isVerboseLoggingEnabled()));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        qj qjVar = qj.f10367c;
        if (TextUtils.isEmpty((String) i02.a(qjVar, (Object) null, defaultSharedPreferences))) {
            this.f10886n0 = true;
            i02.b(qjVar, Boolean.toString(true), defaultSharedPreferences);
        } else {
            i02.b(qjVar, Boolean.toString(false), defaultSharedPreferences);
        }
        qj qjVar2 = qj.f10368d;
        if (((Boolean) i02.a(qjVar2, Boolean.FALSE)).booleanValue()) {
            if (t.a()) {
                L8.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f10888o0 = true;
        } else {
            if (t.a()) {
                L8.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            i02.b(qjVar2, Boolean.TRUE);
            i02.b(qj.f10377o, Boolean.valueOf(t9.k()));
        }
        qj qjVar3 = qj.f10369e;
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
            return JsonUtils.toStringMap(new JSONObject((String) a(oj.f9849s4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public void R0() {
        Q0();
        if (this.f10872f.isExceptionHandlerEnabled() && ((Boolean) a(oj.f9887y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int parseInt = StringUtils.parseInt(this.f10872f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(oj.f9842r4)).intValue());
        sm l02 = l0();
        kn knVar = new kn(this, true, "scheduleAdLoadIntegrationErrorAuto", new F(5, this));
        sm.b bVar = sm.b.CORE;
        long j7 = parseInt;
        l02.a(knVar, bVar, j7);
        l0().a(new kn(this, true, "scheduleSdkInit", new F(6, this)), bVar, j7);
    }

    public void T0() {
        wf X8 = X();
        X8.a(new d(X8));
    }

    public String A() {
        return this.f10894r0;
    }

    public boolean A0() {
        boolean z8;
        synchronized (this.f10878i0) {
            z8 = this.f10883l0;
        }
        return z8;
    }

    public o B() {
        return this.f10891q;
    }

    public EventServiceImpl C() {
        Object obj = this.l.get();
        if (obj == null) {
            synchronized (this.l) {
                try {
                    obj = this.l.get();
                    if (obj == null) {
                        obj = new EventServiceImpl(this);
                        this.l.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.l) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public AtomicBoolean C0() {
        return this.f10906x0;
    }

    public p D() {
        Object obj = this.f10844G.get();
        if (obj == null) {
            synchronized (this.f10844G) {
                try {
                    obj = this.f10844G.get();
                    if (obj == null) {
                        obj = new p(this);
                        this.f10844G.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10844G) {
            obj = null;
        }
        return (p) obj;
    }

    public boolean D0() {
        return StringUtils.containsIgnoreCase(Q(), AppLovinMediationProvider.MAX);
    }

    public q E() {
        Object obj = this.f10846I.get();
        if (obj == null) {
            synchronized (this.f10846I) {
                try {
                    obj = this.f10846I.get();
                    if (obj == null) {
                        obj = new q(this);
                        this.f10846I.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10846I) {
            obj = null;
        }
        return (q) obj;
    }

    public boolean E0() {
        return zp.a("com.unity3d.player.UnityPlayerActivity");
    }

    public ba F() {
        Object obj = this.f10899u.get();
        if (obj == null) {
            synchronized (this.f10899u) {
                try {
                    obj = this.f10899u.get();
                    if (obj == null) {
                        obj = new ba(this);
                        this.f10899u.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10899u) {
            obj = null;
        }
        return (ba) obj;
    }

    public yc G() {
        Object obj = this.f10865b0.get();
        if (obj == null) {
            synchronized (this.f10865b0) {
                try {
                    obj = this.f10865b0.get();
                    if (obj == null) {
                        obj = new yc(this);
                        this.f10865b0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10865b0) {
            obj = null;
        }
        return (yc) obj;
    }

    public Activity H() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration I() {
        return this.f10896s0;
    }

    public long J() {
        return this.f10866c;
    }

    public s K() {
        Object obj = this.f10855S.get();
        if (obj == null) {
            synchronized (this.f10855S) {
                try {
                    obj = this.f10855S.get();
                    if (obj == null) {
                        obj = new s(this);
                        this.f10855S.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10855S) {
            obj = null;
        }
        return (s) obj;
    }

    public t L() {
        return this.f10889p;
    }

    public com.applovin.impl.mediation.d M() {
        Object obj = this.f0.get();
        if (obj == null) {
            synchronized (this.f0) {
                try {
                    obj = this.f0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.d(this);
                        this.f0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void M0() {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((!t().j() || t().e() != g4.a.UNIFIED) && (sdkInitializationListener = this.f10902v0) != null) {
            if (y0()) {
                this.f10902v0 = null;
                this.f10904w0 = null;
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else {
                if (this.f10904w0 == sdkInitializationListener) {
                    return;
                }
                N().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(oj.f9866v)).booleanValue()) {
                    this.f10902v0 = null;
                } else {
                    this.f10904w0 = sdkInitializationListener;
                }
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new E(this, sdkInitializationListener, 1), Math.max(0L, ((Long) a(oj.f9873w)).longValue()));
        }
    }

    public com.applovin.impl.mediation.e N() {
        Object obj = this.f10862Z.get();
        if (obj == null) {
            synchronized (this.f10862Z) {
                try {
                    obj = this.f10862Z.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.e(this);
                        this.f10862Z.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10862Z) {
            obj = null;
        }
        return (com.applovin.impl.mediation.e) obj;
    }

    public com.applovin.impl.mediation.f O() {
        Object obj = this.f10861Y.get();
        if (obj == null) {
            synchronized (this.f10861Y) {
                try {
                    obj = this.f10861Y.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.f(this);
                        this.f10861Y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10861Y) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public pe P() {
        Object obj = this.f10869d0.get();
        if (obj == null) {
            synchronized (this.f10869d0) {
                try {
                    obj = this.f10869d0.get();
                    if (obj == null) {
                        obj = new pe(this);
                        this.f10869d0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10869d0) {
            obj = null;
        }
        return (pe) obj;
    }

    public void P0() {
        o().a();
    }

    public String Q() {
        String str = (String) a(qj.f10360I);
        if (StringUtils.isValidString(str)) {
            return str;
        }
        return this.f10877i;
    }

    public MediationServiceImpl S() {
        Object obj = this.f10864a0.get();
        if (obj == null) {
            synchronized (this.f10864a0) {
                try {
                    obj = this.f10864a0.get();
                    if (obj == null) {
                        obj = new MediationServiceImpl(this);
                        this.f10864a0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10864a0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public void S0() {
        synchronized (this.f10878i0) {
            this.f10883l0 = true;
            l0().f();
            d();
        }
    }

    public te T() {
        Object obj = this.f10901v.get();
        if (obj == null) {
            synchronized (this.f10901v) {
                try {
                    obj = this.f10901v.get();
                    if (obj == null) {
                        obj = new te(this);
                        this.f10901v.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10901v) {
            obj = null;
        }
        return (te) obj;
    }

    public ue U() {
        Object obj = this.f10867c0.get();
        if (obj == null) {
            synchronized (this.f10867c0) {
                try {
                    obj = this.f10867c0.get();
                    if (obj == null) {
                        obj = new ue();
                        this.f10867c0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10867c0) {
            obj = null;
        }
        return (ue) obj;
    }

    public void U0() {
        t.h("AppLovinSdk", "Resetting SDK state...");
        ba F4 = F();
        aa aaVar = aa.l;
        long b8 = F4.b(aaVar);
        h0().a();
        h0().e();
        F().a();
        F().b(aaVar, b8 + 1);
        if (this.f10880j0.compareAndSet(true, false)) {
            S0();
        } else {
            this.f10880j0.set(true);
        }
    }

    public u V() {
        Object obj = this.f10871e0.get();
        if (obj == null) {
            synchronized (this.f10871e0) {
                try {
                    obj = this.f10871e0.get();
                    if (obj == null) {
                        obj = new u(this);
                        this.f10871e0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10871e0) {
            obj = null;
        }
        return (u) obj;
    }

    public void V0() {
        if (!StringUtils.isValidString(this.f10894r0)) {
            this.f10894r0 = AppLovinMediationProvider.MAX;
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Detected mediation provider: MAX");
            }
        }
    }

    public AppLovinNativeAdService W() {
        Object obj = this.f10881k.get();
        if (obj == null) {
            synchronized (this.f10881k) {
                try {
                    obj = this.f10881k.get();
                    if (obj == null) {
                        obj = new AppLovinNativeAdService(this);
                        this.f10881k.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10881k) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public void W0() {
        v().n();
    }

    public wf X() {
        Object obj = this.f10848K.get();
        if (obj == null) {
            synchronized (this.f10848K) {
                try {
                    obj = this.f10848K.get();
                    if (obj == null) {
                        obj = new wf(k());
                        this.f10848K.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10848K) {
            obj = null;
        }
        return (wf) obj;
    }

    public void X0() {
        a((Map) null);
    }

    public mg Y() {
        Object obj = this.f10854R.get();
        if (obj == null) {
            synchronized (this.f10854R) {
                try {
                    obj = this.f10854R.get();
                    if (obj == null) {
                        obj = new mg(this);
                        this.f10854R.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10854R) {
            obj = null;
        }
        return (mg) obj;
    }

    public com.applovin.impl.sdk.network.b Z() {
        Object obj = this.f10859W.get();
        if (obj == null) {
            synchronized (this.f10859W) {
                try {
                    obj = this.f10859W.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.network.b(this);
                        this.f10859W.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10859W) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public Object a(oj ojVar) {
        return h0().a(ojVar);
    }

    public PostbackServiceImpl a0() {
        Object obj = this.f10858V.get();
        if (obj == null) {
            synchronized (this.f10858V) {
                try {
                    obj = this.f10858V.get();
                    if (obj == null) {
                        obj = new PostbackServiceImpl(this);
                        this.f10858V.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10858V) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public List b(oj ojVar) {
        return h0().b(ojVar);
    }

    public w b0() {
        Object obj = this.f10838A.get();
        if (obj == null) {
            synchronized (this.f10838A) {
                try {
                    obj = this.f10838A.get();
                    if (obj == null) {
                        obj = N0();
                        if (obj == null) {
                            obj = this.f10838A;
                        }
                        this.f10838A.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10838A) {
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
        return this.f10863a;
    }

    public kj e0() {
        Object obj = this.f10850M.get();
        if (obj == null) {
            synchronized (this.f10850M) {
                try {
                    obj = this.f10850M.get();
                    if (obj == null) {
                        obj = new kj(this);
                        this.f10850M.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10850M) {
            obj = null;
        }
        return (kj) obj;
    }

    public SessionTracker f0() {
        Object obj = this.f10845H.get();
        if (obj == null) {
            synchronized (this.f10845H) {
                try {
                    obj = this.f10845H.get();
                    if (obj == null) {
                        obj = new SessionTracker(this);
                        this.f10845H.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10845H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings g0() {
        return this.f10872f;
    }

    public pj h0() {
        Object obj = this.f10895s.get();
        if (obj == null) {
            synchronized (this.f10895s) {
                try {
                    obj = this.f10895s.get();
                    if (obj == null) {
                        obj = new pj(this);
                        this.f10895s.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10895s) {
            obj = null;
        }
        return (pj) obj;
    }

    public sj i0() {
        Object obj = this.f10839B.get();
        if (obj == null) {
            synchronized (this.f10839B) {
                try {
                    obj = this.f10839B.get();
                    if (obj == null) {
                        obj = new sj(this);
                        this.f10839B.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10839B) {
            obj = null;
        }
        return (sj) obj;
    }

    public AppLovinTargetingDataImpl j0() {
        return (AppLovinTargetingDataImpl) this.f10875h;
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
        Object obj = this.f10893r.get();
        if (obj == null) {
            synchronized (this.f10893r) {
                try {
                    obj = this.f10893r.get();
                    if (obj == null) {
                        obj = new sm(this);
                        this.f10893r.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10893r) {
            obj = null;
        }
        return (sm) obj;
    }

    public rn m0() {
        Object obj = this.f10852P.get();
        if (obj == null) {
            synchronized (this.f10852P) {
                try {
                    obj = this.f10852P.get();
                    if (obj == null) {
                        obj = new rn(this);
                        this.f10852P.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10852P) {
            obj = null;
        }
        return (rn) obj;
    }

    public xn n0() {
        Object obj = this.f10874g0.get();
        if (obj == null) {
            synchronized (this.f10874g0) {
                try {
                    obj = this.f10874g0.get();
                    if (obj == null) {
                        obj = new xn(this);
                        this.f10874g0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10874g0) {
            obj = null;
        }
        return (xn) obj;
    }

    public long o0() {
        if (this.f10868d == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f10868d;
    }

    public Activity p0() {
        Activity b8 = a(k()).b();
        if (b8 != null) {
            return b8;
        }
        return H();
    }

    public String q0() {
        return t0().c();
    }

    public AppLovinUserSegment r0() {
        return this.f10873g;
    }

    public UserServiceImpl s0() {
        Object obj = this.m.get();
        if (obj == null) {
            synchronized (this.m) {
                try {
                    obj = this.m.get();
                    if (obj == null) {
                        obj = new UserServiceImpl(this);
                        this.m.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.m) {
            obj = null;
        }
        return (UserServiceImpl) obj;
    }

    public xp t0() {
        Object obj = this.f10841D.get();
        if (obj == null) {
            synchronized (this.f10841D) {
                try {
                    obj = this.f10841D.get();
                    if (obj == null) {
                        obj = new xp(this);
                        this.f10841D.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10841D) {
            obj = null;
        }
        return (xp) obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CoreSdk{sdkKey='");
        sb.append(this.f10863a);
        sb.append("', enabled=");
        sb.append(this.f10884m0);
        sb.append(", isFirstSession=");
        return n0.n(sb, this.f10886n0, '}');
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings u() {
        return g0().getBackingConsentFlowSettings();
    }

    public rr u0() {
        Object obj = this.f10847J.get();
        if (obj == null) {
            synchronized (this.f10847J) {
                try {
                    obj = this.f10847J.get();
                    if (obj == null) {
                        obj = new rr(this);
                        this.f10847J.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10847J) {
            obj = null;
        }
        return (rr) obj;
    }

    public w4 v() {
        Object obj = this.f10853Q.get();
        if (obj == null) {
            synchronized (this.f10853Q) {
                try {
                    obj = this.f10853Q.get();
                    if (obj == null) {
                        obj = new w4(this);
                        this.f10853Q.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10853Q) {
            obj = null;
        }
        return (w4) obj;
    }

    public AppLovinSdk v0() {
        return this.f10887o;
    }

    public b5 w() {
        Object obj = this.f10857U.get();
        if (obj == null) {
            synchronized (this.f10857U) {
                try {
                    obj = this.f10857U.get();
                    if (obj == null) {
                        obj = new b5(this);
                        this.f10857U.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10857U) {
            obj = null;
        }
        return (b5) obj;
    }

    public boolean w0() {
        return this.f10888o0;
    }

    public l x() {
        Object obj = this.f10905x.get();
        if (obj == null) {
            synchronized (this.f10905x) {
                try {
                    obj = this.f10905x.get();
                    if (obj == null) {
                        obj = new l(this);
                        this.f10905x.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10905x) {
            obj = null;
        }
        return (l) obj;
    }

    public boolean x0() {
        Object obj = this.f10909z.get();
        if (obj == null) {
            synchronized (this.f10909z) {
                try {
                    obj = this.f10909z.get();
                    if (obj == null) {
                        obj = (Boolean) a(oj.f9589F3);
                        obj.getClass();
                        this.f10909z.set(obj);
                    }
                } finally {
                }
            }
        }
        return ((Boolean) obj).booleanValue();
    }

    public m y() {
        Object obj = this.f10907y.get();
        Object obj2 = null;
        if (obj == null) {
            synchronized (this.f10907y) {
                try {
                    obj = this.f10907y.get();
                    if (obj == null) {
                        if (x0()) {
                            obj = new m(this);
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            obj = this.f10907y;
                        }
                        this.f10907y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj != this.f10907y) {
            obj2 = obj;
        }
        return (m) obj2;
    }

    public boolean y0() {
        boolean z8;
        synchronized (this.f10878i0) {
            z8 = this.f10884m0;
        }
        return z8;
    }

    public n z() {
        Object obj = this.f10903w.get();
        Object obj2 = null;
        if (obj == null) {
            synchronized (this.f10903w) {
                try {
                    obj = this.f10903w.get();
                    if (obj == null) {
                        if (x0()) {
                            obj = new n(this);
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            obj = this.f10903w;
                        }
                        this.f10903w.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj != this.f10903w) {
            obj2 = obj;
        }
        return (n) obj2;
    }

    public boolean z0() {
        return this.f10886n0;
    }

    private void d() {
        sm l02 = l0();
        int i9 = this.f10892q0 + 1;
        this.f10892q0 = i9;
        l02.a((xl) new im(i9, this, new b()), sm.b.CORE);
    }

    public static long j() {
        return f10834C0;
    }

    public static Context k() {
        return f10833B0;
    }

    public Object a(qj qjVar) {
        return a(qjVar, (Object) null);
    }

    public Object b(qj qjVar) {
        return i0().a(qjVar);
    }

    public void c(qj qjVar) {
        i0().b(qjVar);
    }

    public C0738q e() {
        return a(f10833B0);
    }

    public C0749a f() {
        Object obj = this.f10843F.get();
        if (obj == null) {
            synchronized (this.f10843F) {
                try {
                    obj = this.f10843F.get();
                    if (obj == null) {
                        obj = new C0749a(this);
                        this.f10843F.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10843F) {
            obj = null;
        }
        return (C0749a) obj;
    }

    public C0751c g() {
        Object obj = this.f10842E.get();
        if (obj == null) {
            synchronized (this.f10842E) {
                try {
                    obj = this.f10842E.get();
                    if (obj == null) {
                        obj = new C0751c(this);
                        this.f10842E.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10842E) {
            obj = null;
        }
        return (C0751c) obj;
    }

    public C0765v h() {
        Object obj = this.f10860X.get();
        if (obj == null) {
            synchronized (this.f10860X) {
                try {
                    obj = this.f10860X.get();
                    if (obj == null) {
                        obj = new C0765v(this);
                        this.f10860X.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10860X) {
            obj = null;
        }
        return (C0765v) obj;
    }

    public AppLovinAdServiceImpl i() {
        Object obj = this.f10879j.get();
        if (obj == null) {
            synchronized (this.f10879j) {
                try {
                    obj = this.f10879j.get();
                    if (obj == null) {
                        obj = new AppLovinAdServiceImpl(this);
                        this.f10879j.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10879j) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public ArrayService l() {
        Object obj = this.f10856T.get();
        if (obj == null) {
            synchronized (this.f10856T) {
                try {
                    obj = this.f10856T.get();
                    if (obj == null) {
                        obj = new ArrayService(this);
                        this.f10856T.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10856T) {
            obj = null;
        }
        return (ArrayService) obj;
    }

    public C0754f m() {
        Object obj = this.f10851N.get();
        if (obj == null) {
            synchronized (this.f10851N) {
                try {
                    obj = this.f10851N.get();
                    if (obj == null) {
                        obj = new C0754f(this);
                        this.f10851N.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10851N) {
            obj = null;
        }
        return (C0754f) obj;
    }

    public CmpServiceImpl n() {
        Object obj = this.f10885n.get();
        if (obj == null) {
            synchronized (this.f10885n) {
                try {
                    obj = this.f10885n.get();
                    if (obj == null) {
                        obj = new CmpServiceImpl(this);
                        this.f10885n.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10885n) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public C0756h o() {
        Object obj = this.f10849L.get();
        if (obj == null) {
            synchronized (this.f10849L) {
                try {
                    obj = this.f10849L.get();
                    if (obj == null) {
                        obj = new C0756h(this);
                        this.f10849L.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10849L) {
            obj = null;
        }
        return (C0756h) obj;
    }

    public String p() {
        return t0().b();
    }

    public AppLovinSdkConfiguration q() {
        return this.f10900u0;
    }

    public b4 r() {
        Object obj = this.f10897t.get();
        if (obj == null) {
            synchronized (this.f10897t) {
                try {
                    obj = this.f10897t.get();
                    if (obj == null) {
                        obj = new b4(this);
                        this.f10897t.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10897t) {
            obj = null;
        }
        return (b4) obj;
    }

    public j s() {
        Object obj = this.f10840C.get();
        if (obj == null) {
            synchronized (this.f10840C) {
                try {
                    obj = this.f10840C.get();
                    if (obj == null) {
                        obj = new j(this);
                        this.f10840C.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f10840C) {
            obj = null;
        }
        return (j) obj;
    }

    public f4 t() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                try {
                    obj = this.O.get();
                    if (obj == null) {
                        obj = new f4(this);
                        this.O.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (f4) obj;
    }

    public void d(String str) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", str);
        }
        l0().a(new rm(this));
    }

    public Object a(qj qjVar, Object obj) {
        return i0().a(qjVar, obj);
    }

    public void b(qj qjVar, Object obj) {
        i0().b(qjVar, obj);
    }

    public void e(String str) {
        L();
        if (t.a()) {
            L.v("setMediationProvider(mediationProvider=", str, ")", L(), "AppLovinSdk");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
            t.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.f10877i = str;
        if (zp.h()) {
            zp.a((Runnable) new F(7, this));
        } else {
            c(qj.f10360I);
        }
    }

    public void f(String str) {
        t.g("AppLovinSdk", "Setting plugin version: " + str);
        if (zp.h()) {
            zp.a((Runnable) new G(this, str, 0));
        } else {
            h0().a(oj.f9685U3, str);
        }
    }

    public void g(String str) {
        L();
        if (t.a()) {
            n0.s("Setting user id: ", str, L(), "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        if (zp.h()) {
            zp.a((Runnable) new G(this, str, 1));
        } else {
            t0().a(str);
        }
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return i0().a(qjVar, obj, sharedPreferences);
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        i0().b(qjVar, obj, sharedPreferences);
    }

    public void c(JSONObject jSONObject) {
        this.f10868d = System.currentTimeMillis();
        c4.c(jSONObject, this);
        c4.b(jSONObject, this);
        c4.a(jSONObject, this);
        le.f(jSONObject, this);
        le.d(jSONObject, this);
        le.e(jSONObject, this);
        le.a(jSONObject);
    }

    public boolean a(oj ojVar, MaxAdFormat maxAdFormat) {
        return b(ojVar).contains(maxAdFormat);
    }

    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f10900u0);
    }

    public void a(ke keVar) {
        if (l0().d()) {
            return;
        }
        List c9 = c(qe.f10294G6);
        if (c9.size() <= 0 || !N().a().keySet().containsAll(c9)) {
            return;
        }
        L();
        if (t.a()) {
            L().a("AppLovinSdk", "All required adapters initialized");
        }
        l0().e();
        M0();
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        f10833B0 = context.getApplicationContext();
    }

    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f10900u0);
    }

    /* renamed from: b */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        Q0();
        this.f10872f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            t.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            h0().a(oj.f9685U3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(oj.f9887y)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        sm l02 = l0();
        xl xlVar = this.f10908y0;
        sm.b bVar = sm.b.CORE;
        l02.a(xlVar, bVar);
        l0().a(this.f10910z0, bVar);
    }

    public void c() {
        synchronized (this.f10878i0) {
            try {
                if (!this.f10883l0 && !this.f10884m0) {
                    S0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f10900u0);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f10887o = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            t.h("AppLovinSdk", (String) it.next());
        }
    }

    public /* synthetic */ void c(String str) {
        t0().a(str);
    }

    public static String a(int i9) {
        return a(i9, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context k6 = k();
        return a(k6.getResources().getIdentifier(str, "string", k6.getPackageName()), list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r15.f10894r0 = (java.lang.String) r13.getValue();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (com.applovin.impl.sdk.t.a() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        L().a("AppLovinSdk", "Detected mediation provider: " + r15.f10894r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public static String a(int i9, List list) {
        String string = k().getResources().getString(i9);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static C0738q a(Context context) {
        if (f10836E0 == null) {
            synchronized (f10837F0) {
                try {
                    if (f10836E0 == null) {
                        f10836E0 = new C0738q(context);
                    }
                } finally {
                }
            }
        }
        return f10836E0;
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.f10906x0.get()) {
            t.h("AppLovinSdk", "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            B().a(o.b.INTEGRATION_ERROR, "legacy_init_already");
            if (zp.c(this)) {
                throw new IllegalStateException("Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            }
            return;
        }
        synchronized (this.f10898t0) {
            try {
                if (this.f10896s0 != null) {
                    if (!y0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new E(this, sdkInitializationListener, 0));
                    return;
                }
                this.f10896s0 = appLovinSdkInitializationConfiguration;
                this.f10902v0 = sdkInitializationListener;
                this.f10863a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f10877i = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f10875h = appLovinSdkInitializationConfiguration.getTargetingData();
                this.f10873g = appLovinSdkInitializationConfiguration.getUserSegment();
                zp.a((Runnable) new A4.d(16, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void b(String str) {
        h0().a(oj.f9685U3, str);
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        C0().set(true);
        this.f10863a = str;
        this.f10872f = appLovinSdkSettings;
        this.f10873g = new AppLovinUserSegment();
        this.f10875h = new AppLovinTargetingDataImpl();
        zp.a((Runnable) new F(0, this));
    }

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

    public void a(boolean z8) {
        synchronized (this.f10878i0) {
            this.f10883l0 = false;
            this.f10884m0 = z8;
        }
        if (z8) {
            List c9 = c(qe.f10294G6);
            if (c9.isEmpty()) {
                l0().e();
                M0();
                return;
            }
            Long l = (Long) a(qe.f10296H6);
            kn knVar = new kn(this, true, "timeoutInitAdapters", new F(3, this));
            L();
            if (t.a()) {
                L().a("AppLovinSdk", "Waiting for required adapters to init: " + c9 + " - timing out in " + l + "ms...");
            }
            l0().a(knVar, sm.b.TIMEOUT, l.longValue(), true);
        }
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f10876h0;
        return (list == null || list.size() <= 0 || this.f10876h0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) i0().a(qj.f10369e, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < zp.f(str)) {
                t.h("AppLovinSdk", n0.m(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
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

    public void a(long j7) {
        s().b(j7);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!y0()) {
            this.f10902v0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new E(this, sdkInitializationListener, 2));
        }
    }
}
