package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.af;
import com.applovin.impl.bg;
import com.applovin.impl.ca;
import com.applovin.impl.d4;
import com.applovin.impl.d5;
import com.applovin.impl.da;
import com.applovin.impl.dd;
import com.applovin.impl.e4;
import com.applovin.impl.gc;
import com.applovin.impl.h4;
import com.applovin.impl.hr;
import com.applovin.impl.i4;
import com.applovin.impl.jm;
import com.applovin.impl.jn;
import com.applovin.impl.la;
import com.applovin.impl.ma;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.oj;
import com.applovin.impl.pb;
import com.applovin.impl.pe;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.qe;
import com.applovin.impl.qg;
import com.applovin.impl.qn;
import com.applovin.impl.qr;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.sm;
import com.applovin.impl.tj;
import com.applovin.impl.tm;
import com.applovin.impl.u0;
import com.applovin.impl.ue;
import com.applovin.impl.uj;
import com.applovin.impl.ve;
import com.applovin.impl.vj;
import com.applovin.impl.wh;
import com.applovin.impl.wn;
import com.applovin.impl.wp;
import com.applovin.impl.y4;
import com.applovin.impl.ye;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.ze;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: v0 */
    public static j f26635v0;

    /* renamed from: w0 */
    protected static Context f26636w0;

    /* renamed from: y0 */
    private static final boolean f26638y0;

    /* renamed from: z0 */
    private static volatile com.applovin.impl.q f26639z0;

    /* renamed from: a */
    private String f26640a;

    /* renamed from: b */
    private WeakReference f26642b;
    private long d;

    /* renamed from: d0 */
    private List f26646d0;

    /* renamed from: f */
    private AppLovinSdkSettings f26648f;

    /* renamed from: g */
    private MaxSegmentCollection f26650g;

    /* renamed from: h */
    private String f26652h;

    /* renamed from: h0 */
    private boolean f26653h0;

    /* renamed from: m0 */
    private String f26663m0;

    /* renamed from: n */
    private volatile AppLovinSdk f26664n;

    /* renamed from: n0 */
    private AppLovinSdkInitializationConfiguration f26665n0;

    /* renamed from: q0 */
    private AppLovinSdk.SdkInitializationListener f26671q0;

    /* renamed from: r0 */
    private AppLovinSdk.SdkInitializationListener f26673r0;
    private static final Object A0 = new Object();

    /* renamed from: x0 */
    private static final long f26637x0 = System.currentTimeMillis();
    private final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: i */
    private final AtomicReference f26654i = new AtomicReference();

    /* renamed from: j */
    private final AtomicReference f26656j = new AtomicReference();

    /* renamed from: k */
    private final AtomicReference f26658k = new AtomicReference();

    /* renamed from: l */
    private final AtomicReference f26660l = new AtomicReference();

    /* renamed from: m */
    private final AtomicReference f26662m = new AtomicReference();

    /* renamed from: o */
    private final n f26666o = new n(this);

    /* renamed from: p */
    private final ma f26668p = new ma(this);

    /* renamed from: q */
    private final AtomicReference f26670q = new AtomicReference();

    /* renamed from: r */
    private final AtomicReference f26672r = new AtomicReference();

    /* renamed from: s */
    private final AtomicReference f26674s = new AtomicReference();

    /* renamed from: t */
    private final AtomicReference f26676t = new AtomicReference();

    /* renamed from: u */
    private final AtomicReference f26678u = new AtomicReference();

    /* renamed from: v */
    private final AtomicReference f26680v = new AtomicReference();
    private final AtomicReference w = new AtomicReference();
    private final AtomicReference x = new AtomicReference();

    /* renamed from: y */
    private final AtomicReference f26681y = new AtomicReference();

    /* renamed from: z */
    private final AtomicReference f26682z = new AtomicReference();
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

    /* renamed from: a0 */
    private final AtomicReference f26641a0 = new AtomicReference();

    /* renamed from: b0 */
    private final AtomicReference f26643b0 = new AtomicReference();

    /* renamed from: c0 */
    private final AtomicReference f26645c0 = new AtomicReference();

    /* renamed from: e0 */
    private final Object f26647e0 = new Object();

    /* renamed from: f0 */
    private final AtomicBoolean f26649f0 = new AtomicBoolean(true);

    /* renamed from: g0 */
    private final AtomicBoolean f26651g0 = new AtomicBoolean();

    /* renamed from: i0 */
    private boolean f26655i0 = false;

    /* renamed from: j0 */
    private boolean f26657j0 = false;

    /* renamed from: k0 */
    private boolean f26659k0 = false;

    /* renamed from: l0 */
    private int f26661l0 = 0;

    /* renamed from: o0 */
    private final Object f26667o0 = new Object();

    /* renamed from: p0 */
    private AppLovinSdkConfiguration f26669p0 = new SdkConfigurationImpl(null, this);

    /* renamed from: s0 */
    private final AtomicBoolean f26675s0 = new AtomicBoolean(false);

    /* renamed from: t0 */
    private final yl f26677t0 = new jn(this, true, "scheduleAdLoadIntegrationError", new w(3, this));

    /* renamed from: u0 */
    private final yl f26679u0 = new jn(this, true, "sdkInit", new w(4, this));

    /* renamed from: c */
    private final long f26644c = System.currentTimeMillis();

    /* loaded from: classes2.dex */
    public class a implements h4.c {
        public a() {
        }

        @Override // com.applovin.impl.h4.c
        public void a(h4.b bVar) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements jm.b {

        /* loaded from: classes2.dex */
        public class a implements h4.c {
            public a() {
            }

            @Override // com.applovin.impl.h4.c
            public void a(h4.b bVar) {
                j.this.J();
                if (n.a()) {
                    j.this.J().a("AppLovinSdk", "Unified flow completed with status: " + bVar);
                }
                if (!bVar.b()) {
                    j.this.d("Initializing SDK in MAX environment...");
                    return;
                }
                j.this.J();
                if (n.a()) {
                    j.this.J().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                }
                j.this.P0();
                j.this.M0();
            }
        }

        public b() {
        }

        @Override // com.applovin.impl.jm.b
        public void a(JSONObject jSONObject) {
            boolean z2 = jSONObject != null && jSONObject.length() > 0;
            j.this.c(jSONObject);
            u0.b(j.this);
            e4.a(jSONObject, z2, j.this);
            j.this.N().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            j.this.E().a();
            j jVar = j.this;
            jVar.f26646d0 = jVar.a(jSONObject);
            if (z2) {
                List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                j jVar2 = j.this;
                jVar2.f26669p0 = new SdkConfigurationImpl(explode, jVar2);
            }
            j.this.l0().a(jSONObject);
            j.this.b(jSONObject);
            gc.b(((Boolean) j.this.a(sj.o6)).booleanValue());
            gc.a(((Boolean) j.this.a(sj.p6)).booleanValue());
            if (!j.this.A0()) {
                j.this.d("Initializing SDK in non-MAX environment...");
            } else if (j.this.u().e() == i4.a.UNIFIED) {
                Activity n02 = j.this.n0();
                if (j.this.f26651g0.compareAndSet(false, true)) {
                    j.this.u().a();
                    j.this.u().b(n02, new a());
                } else {
                    j.this.d("Initializing SDK in MAX environment...");
                }
            } else {
                j.this.d("Initializing SDK in MAX environment...");
            }
            if (!((Boolean) j.this.a(sj.v3)).booleanValue() || z2 || !e4.a(j.l())) {
                j.this.L0();
                return;
            }
            j.this.J();
            if (n.a()) {
                j.this.J().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            j.this.Q0();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements jm.b {
        public c() {
        }

        @Override // com.applovin.impl.jm.b
        public void a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                j.this.c(jSONObject);
            }
            j.this.e.set(false);
            j.this.L0();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements bg.a {

        /* renamed from: a */
        final /* synthetic */ bg f26687a;

        public d(bg bgVar) {
            this.f26687a = bgVar;
        }

        @Override // com.applovin.impl.bg.a
        public void a() {
            j.this.J();
            if (n.a()) {
                j.this.J().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (j.this.f26647e0) {
                try {
                    if (!j.this.f26653h0) {
                        j.this.P0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f26687a.b(this);
        }

        @Override // com.applovin.impl.bg.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new z(0));
            f26638y0 = true;
        } catch (Throwable unused) {
            f26638y0 = false;
        }
    }

    public j(Context context) {
        this.f26653h0 = false;
        this.f26648f = new AppLovinSdkSettings(context);
        this.f26653h0 = true;
        if (!y0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        f26636w0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f26642b = new WeakReference((Activity) context);
        }
        if (f26635v0 == null) {
            f26635v0 = this;
        } else {
            n.h("AppLovinSdk", "Multiple SDK instances detected");
        }
    }

    public /* synthetic */ void C0() {
        if (j0().d()) {
            return;
        }
        J();
        if (n.a()) {
            J().a("AppLovinSdk", "Timing out adapters init...");
        }
        j0().e();
        J0();
    }

    public /* synthetic */ void D0() {
        tm j02 = j0();
        int i2 = this.f26661l0 + 1;
        this.f26661l0 = i2;
        j02.a((yl) new jm(i2, this, new c()), tm.b.CORE);
    }

    public /* synthetic */ void E0() {
        if (A0()) {
            pb.b(this);
        }
    }

    public /* synthetic */ void F0() {
        synchronized (this.f26647e0) {
            try {
                boolean a2 = e4.a(l());
                if (!((Boolean) a(sj.w3)).booleanValue() || a2) {
                    P0();
                }
                if (((Boolean) a(sj.v3)).booleanValue() && !a2) {
                    J();
                    if (n.a()) {
                        J().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    Q0();
                }
                if (u().e() == i4.a.TERMS) {
                    if (A0()) {
                        J();
                        if (n.a()) {
                            J().a("AppLovinSdk", "MAX mediation detected... Generating consent flow...");
                        }
                        u().a();
                        u().b(n0(), new a());
                    } else {
                        J();
                        if (n.a()) {
                            J().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + this.f26652h);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void G0() {
        if (w0()) {
            return;
        }
        this.f26677t0.run();
    }

    public /* synthetic */ void H0() {
        if (w0()) {
            return;
        }
        this.f26675s0.set(true);
        this.f26679u0.run();
    }

    public /* synthetic */ void I0() {
        c(uj.H);
    }

    private q K0() {
        if (!wh.f(f26636w0)) {
            return null;
        }
        try {
            return new q(this);
        } catch (Throwable th) {
            n.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    public void L0() {
        Long l2 = (Long) a(sj.E3);
        if (l2.longValue() >= 0 && this.e.compareAndSet(false, true)) {
            hr.a(l2.longValue(), false, this, new w(2, this));
        }
    }

    private void N0() {
        Context context = f26636w0;
        n J = J();
        vj i02 = i0();
        h4 u2 = u();
        a(context);
        f0();
        h();
        m();
        V();
        L().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        if (TextUtils.isEmpty(this.f26640a)) {
            n.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            n.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (this.f26640a.length() != 86 && yp.c(this)) {
            n.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f26640a + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f26640a)) {
            n.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (yp.c(this)) {
                throw new RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
            return;
        }
        if (yp.i()) {
            n.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!yp.b(this)) {
            n.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (yp.k(context)) {
            this.f26648f.setVerboseLogging(true);
        }
        h0().a(sj.f26932l, Boolean.valueOf(this.f26648f.isVerboseLoggingEnabled()));
        if (yp.c(this)) {
            ArrayList arrayList = new ArrayList();
            JSONArray a2 = af.a(this);
            for (int i2 = 0; i2 < a2.length(); i2++) {
                JSONObject jSONObject = JsonUtils.getJSONObject(a2, i2, (JSONObject) null);
                if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                    arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown"));
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Please update to the latest adapter versions. Incompatible adapter(s) found: " + arrayList);
            }
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        uj ujVar = uj.f27330c;
        if (TextUtils.isEmpty((String) i02.a(ujVar, (Object) null, defaultSharedPreferences))) {
            this.f26657j0 = true;
            i02.b(ujVar, Boolean.toString(true), defaultSharedPreferences);
        } else {
            i02.b(ujVar, Boolean.toString(false), defaultSharedPreferences);
        }
        uj ujVar2 = uj.d;
        if (((Boolean) i02.a(ujVar2, Boolean.FALSE)).booleanValue()) {
            if (n.a()) {
                J.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f26659k0 = true;
        } else {
            if (n.a()) {
                J.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            i02.b(ujVar2, Boolean.TRUE);
            i02.b(uj.f27340o, Boolean.valueOf(u2.k()));
        }
        uj ujVar3 = uj.e;
        String str = (String) i02.a(ujVar3, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE > yp.e(str)) {
                i02.b(ujVar3, AppLovinSdk.VERSION);
            }
        } else {
            i02.b(ujVar3, AppLovinSdk.VERSION);
        }
        E().a(la.e, (Object) null, (Map) null, 0L);
    }

    public void O0() {
        N0();
        if (this.f26648f.isExceptionHandlerEnabled() && ((Boolean) a(sj.f26954u)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int parseInt = StringUtils.parseInt(this.f26648f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(sj.x4)).intValue());
        tm j02 = j0();
        jn jnVar = new jn(this, true, "scheduleAdLoadIntegrationErrorAuto", new w(0, this));
        tm.b bVar = tm.b.CORE;
        long j2 = parseInt;
        j02.a(jnVar, bVar, j2);
        j0().a(new jn(this, true, "scheduleSdkInit", new w(1, this)), bVar, j2);
    }

    private Map P() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(sj.y4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public void Q0() {
        bg V = V();
        V.a(new d(V));
    }

    public static boolean y0() {
        return f26638y0;
    }

    public EventServiceImpl A() {
        Object obj = this.f26658k.get();
        if (obj == null) {
            synchronized (this.f26658k) {
                try {
                    obj = this.f26658k.get();
                    if (obj == null) {
                        obj = new EventServiceImpl(this);
                        this.f26658k.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26658k) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public boolean A0() {
        return StringUtils.containsIgnoreCase(O(), AppLovinMediationProvider.MAX);
    }

    public l B() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                try {
                    obj = this.C.get();
                    if (obj == null) {
                        obj = new l(this);
                        this.C.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (l) obj;
    }

    public boolean B0() {
        return yp.a("com.unity3d.player.UnityPlayerActivity");
    }

    public m C() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                try {
                    obj = this.E.get();
                    if (obj == null) {
                        obj = new m(this);
                        this.E.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (m) obj;
    }

    public da D() {
        Object obj = this.f26676t.get();
        if (obj == null) {
            synchronized (this.f26676t) {
                try {
                    obj = this.f26676t.get();
                    if (obj == null) {
                        obj = new da(this);
                        this.f26676t.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26676t) {
            obj = null;
        }
        return (da) obj;
    }

    public ma E() {
        return this.f26668p;
    }

    public dd F() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                try {
                    obj = this.X.get();
                    if (obj == null) {
                        obj = new dd(this);
                        this.X.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (dd) obj;
    }

    public Activity G() {
        WeakReference weakReference = this.f26642b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration H() {
        return this.f26665n0;
    }

    public long I() {
        return this.f26644c;
    }

    public n J() {
        return this.f26666o;
    }

    public void J0() {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if ((u().j() && u().e() == i4.a.UNIFIED) || (sdkInitializationListener = this.f26671q0) == null) {
            return;
        }
        if (u0()) {
            this.f26671q0 = null;
            this.f26673r0 = null;
            L().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f26673r0 == sdkInitializationListener) {
                return;
            }
            L().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(sj.f26948r)).booleanValue()) {
                this.f26671q0 = null;
            } else {
                this.f26673r0 = sdkInitializationListener;
            }
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new x(this, sdkInitializationListener, 1), Math.max(0L, ((Long) a(sj.f26950s)).longValue()));
    }

    public com.applovin.impl.mediation.d K() {
        Object obj = this.f26643b0.get();
        if (obj == null) {
            synchronized (this.f26643b0) {
                try {
                    obj = this.f26643b0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.d(this);
                        this.f26643b0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26643b0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public com.applovin.impl.mediation.e L() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                try {
                    obj = this.V.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.e(this);
                        this.V.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (com.applovin.impl.mediation.e) obj;
    }

    public com.applovin.impl.mediation.f M() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                try {
                    obj = this.U.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.f(this);
                        this.U.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public void M0() {
        p().a();
    }

    public ue N() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                try {
                    obj = this.Z.get();
                    if (obj == null) {
                        obj = new ue(this);
                        this.Z.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (ue) obj;
    }

    public String O() {
        String str = (String) a(uj.H);
        return StringUtils.isValidString(str) ? str : this.f26652h;
    }

    public void P0() {
        synchronized (this.f26647e0) {
            this.f26653h0 = true;
            j0().f();
            d();
        }
    }

    public MediationServiceImpl Q() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                try {
                    obj = this.W.get();
                    if (obj == null) {
                        obj = new MediationServiceImpl(this);
                        this.W.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public ye R() {
        Object obj = this.f26678u.get();
        if (obj == null) {
            synchronized (this.f26678u) {
                try {
                    obj = this.f26678u.get();
                    if (obj == null) {
                        obj = new ye(this);
                        this.f26678u.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26678u) {
            obj = null;
        }
        return (ye) obj;
    }

    public void R0() {
        n.h("AppLovinSdk", "Resetting SDK state...");
        da D = D();
        ca caVar = ca.f23248l;
        long b2 = D.b(caVar);
        h0().a();
        h0().e();
        D().a();
        D().b(caVar, b2 + 1);
        if (this.f26649f0.compareAndSet(true, false)) {
            P0();
        } else {
            this.f26649f0.set(true);
        }
    }

    public ze S() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                try {
                    obj = this.Y.get();
                    if (obj == null) {
                        obj = new ze();
                        this.Y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (ze) obj;
    }

    public void S0() {
        if (StringUtils.isValidString(this.f26663m0)) {
            return;
        }
        this.f26663m0 = AppLovinMediationProvider.MAX;
        J();
        if (n.a()) {
            J().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public o T() {
        Object obj = this.f26641a0.get();
        if (obj == null) {
            synchronized (this.f26641a0) {
                try {
                    obj = this.f26641a0.get();
                    if (obj == null) {
                        obj = new o(this);
                        this.f26641a0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26641a0) {
            obj = null;
        }
        return (o) obj;
    }

    public void T0() {
        w().n();
    }

    public AppLovinNativeAdService U() {
        Object obj = this.f26656j.get();
        if (obj == null) {
            synchronized (this.f26656j) {
                try {
                    obj = this.f26656j.get();
                    if (obj == null) {
                        obj = new AppLovinNativeAdService(this);
                        this.f26656j.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26656j) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public void U0() {
        a((Map) null);
    }

    public bg V() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                try {
                    obj = this.H.get();
                    if (obj == null) {
                        obj = new bg(l());
                        this.H.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (bg) obj;
    }

    public qg W() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                try {
                    obj = this.O.get();
                    if (obj == null) {
                        obj = new qg(this);
                        this.O.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (qg) obj;
    }

    public com.applovin.impl.sdk.network.b X() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                try {
                    obj = this.S.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.network.b(this);
                        this.S.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public PostbackServiceImpl Y() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                try {
                    obj = this.R.get();
                    if (obj == null) {
                        obj = new PostbackServiceImpl(this);
                        this.R.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public q Z() {
        Object obj = this.w.get();
        if (obj == null) {
            synchronized (this.w) {
                try {
                    obj = this.w.get();
                    if (obj == null) {
                        obj = K0();
                        if (obj == null) {
                            obj = this.w;
                        }
                        this.w.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.w) {
            obj = null;
        }
        return (q) obj;
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f26664n = appLovinSdk;
    }

    public String a0() {
        return q0().a();
    }

    public List b(sj sjVar) {
        return h0().b(sjVar);
    }

    public String b0() {
        return this.f26640a;
    }

    public List c(sj sjVar) {
        return h0().c(sjVar);
    }

    public MaxSegmentCollectionImpl c0() {
        return (MaxSegmentCollectionImpl) this.f26650g;
    }

    public Map d0() {
        MaxSegmentCollectionImpl c02 = c0();
        if (c02 == null) {
            return null;
        }
        return c02.getJsonData();
    }

    public oj e0() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                try {
                    obj = this.J.get();
                    if (obj == null) {
                        obj = new oj(this);
                        this.J.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (oj) obj;
    }

    public SessionTracker f0() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                try {
                    obj = this.D.get();
                    if (obj == null) {
                        obj = new SessionTracker(this);
                        this.D.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings g0() {
        return this.f26648f;
    }

    public tj h0() {
        Object obj = this.f26672r.get();
        if (obj == null) {
            synchronized (this.f26672r) {
                try {
                    obj = this.f26672r.get();
                    if (obj == null) {
                        obj = new tj(this);
                        this.f26672r.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26672r) {
            obj = null;
        }
        return (tj) obj;
    }

    public vj i0() {
        Object obj = this.x.get();
        if (obj == null) {
            synchronized (this.x) {
                try {
                    obj = this.x.get();
                    if (obj == null) {
                        obj = new vj(this);
                        this.x.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.x) {
            obj = null;
        }
        return (vj) obj;
    }

    public tm j0() {
        Object obj = this.f26670q.get();
        if (obj == null) {
            synchronized (this.f26670q) {
                try {
                    obj = this.f26670q.get();
                    if (obj == null) {
                        obj = new tm(this);
                        this.f26670q.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26670q) {
            obj = null;
        }
        return (tm) obj;
    }

    public qn k0() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                try {
                    obj = this.M.get();
                    if (obj == null) {
                        obj = new qn(this);
                        this.M.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (qn) obj;
    }

    public wn l0() {
        Object obj = this.f26645c0.get();
        if (obj == null) {
            synchronized (this.f26645c0) {
                try {
                    obj = this.f26645c0.get();
                    if (obj == null) {
                        obj = new wn(this);
                        this.f26645c0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26645c0) {
            obj = null;
        }
        return (wn) obj;
    }

    public long m0() {
        if (this.d == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.d;
    }

    public Activity n0() {
        Activity b2 = a(l()).b();
        return b2 != null ? b2 : G();
    }

    public String o0() {
        return q0().c();
    }

    public UserServiceImpl p0() {
        Object obj = this.f26660l.get();
        if (obj == null) {
            synchronized (this.f26660l) {
                try {
                    obj = this.f26660l.get();
                    if (obj == null) {
                        obj = new UserServiceImpl(this);
                        this.f26660l.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26660l) {
            obj = null;
        }
        return (UserServiceImpl) obj;
    }

    public wp q0() {
        Object obj = this.f26682z.get();
        if (obj == null) {
            synchronized (this.f26682z) {
                try {
                    obj = this.f26682z.get();
                    if (obj == null) {
                        obj = new wp(this);
                        this.f26682z.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26682z) {
            obj = null;
        }
        return (wp) obj;
    }

    public qr r0() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                try {
                    obj = this.G.get();
                    if (obj == null) {
                        obj = new qr(this);
                        this.G.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (qr) obj;
    }

    public AppLovinSdk s0() {
        return this.f26664n;
    }

    public boolean t0() {
        return this.f26659k0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CoreSdk{sdkKey='");
        sb.append(this.f26640a);
        sb.append("', enabled=");
        sb.append(this.f26655i0);
        sb.append(", isFirstSession=");
        return android.support.v4.media.d.s(sb, this.f26657j0, '}');
    }

    public h4 u() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                try {
                    obj = this.L.get();
                    if (obj == null) {
                        obj = new h4(this);
                        this.L.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (h4) obj;
    }

    public boolean u0() {
        boolean z2;
        synchronized (this.f26647e0) {
            z2 = this.f26655i0;
        }
        return z2;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings v() {
        return g0().getBackingConsentFlowSettings();
    }

    public boolean v0() {
        return this.f26657j0;
    }

    public y4 w() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                try {
                    obj = this.N.get();
                    if (obj == null) {
                        obj = new y4(this);
                        this.N.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (y4) obj;
    }

    public boolean w0() {
        boolean z2;
        synchronized (this.f26667o0) {
            z2 = this.f26665n0 != null;
        }
        return z2;
    }

    public d5 x() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                try {
                    obj = this.Q.get();
                    if (obj == null) {
                        obj = new d5(this);
                        this.Q.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (d5) obj;
    }

    public boolean x0() {
        boolean z2;
        synchronized (this.f26647e0) {
            z2 = this.f26653h0;
        }
        return z2;
    }

    public k y() {
        Object obj = this.f26680v.get();
        if (obj == null) {
            synchronized (this.f26680v) {
                try {
                    obj = this.f26680v.get();
                    if (obj == null) {
                        obj = new k(this);
                        this.f26680v.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26680v) {
            obj = null;
        }
        return (k) obj;
    }

    public String z() {
        return this.f26663m0;
    }

    public AtomicBoolean z0() {
        return this.f26675s0;
    }

    private void d() {
        tm j02 = j0();
        int i2 = this.f26661l0 + 1;
        this.f26661l0 = i2;
        j02.a((yl) new jm(i2, this, new b()), tm.b.CORE);
    }

    public static long k() {
        return f26637x0;
    }

    public static Context l() {
        return f26636w0;
    }

    public boolean a(sj sjVar, String str) {
        Iterator it = c(sjVar).iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public Object b(uj ujVar) {
        return i0().a(ujVar);
    }

    public void c(uj ujVar) {
        i0().b(ujVar);
    }

    public com.applovin.impl.q e() {
        return a(f26636w0);
    }

    public com.applovin.impl.sdk.a f() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                try {
                    obj = this.B.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.a(this);
                        this.B.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public com.applovin.impl.sdk.c g() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                try {
                    obj = this.A.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.c(this);
                        this.A.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (com.applovin.impl.sdk.c) obj;
    }

    public com.applovin.impl.v h() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                try {
                    obj = this.T.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.v(this);
                        this.T.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (com.applovin.impl.v) obj;
    }

    public AppLovinAdServiceImpl i() {
        Object obj = this.f26654i.get();
        if (obj == null) {
            synchronized (this.f26654i) {
                try {
                    obj = this.f26654i.get();
                    if (obj == null) {
                        obj = new AppLovinAdServiceImpl(this);
                        this.f26654i.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26654i) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public e j() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                try {
                    obj = this.F.get();
                    if (obj == null) {
                        obj = new e(this);
                        this.F.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (e) obj;
    }

    public ArrayService m() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                try {
                    obj = this.P.get();
                    if (obj == null) {
                        obj = new ArrayService(this);
                        this.P.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (ArrayService) obj;
    }

    public f n() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                try {
                    obj = this.K.get();
                    if (obj == null) {
                        obj = new f(this);
                        this.K.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (f) obj;
    }

    public CmpServiceImpl o() {
        Object obj = this.f26662m.get();
        if (obj == null) {
            synchronized (this.f26662m) {
                try {
                    obj = this.f26662m.get();
                    if (obj == null) {
                        obj = new CmpServiceImpl(this);
                        this.f26662m.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26662m) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public g p() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                try {
                    obj = this.I.get();
                    if (obj == null) {
                        obj = new g(this);
                        this.I.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (g) obj;
    }

    public String q() {
        return q0().b();
    }

    public AppLovinSdkConfiguration r() {
        return this.f26669p0;
    }

    public d4 s() {
        Object obj = this.f26674s.get();
        if (obj == null) {
            synchronized (this.f26674s) {
                try {
                    obj = this.f26674s.get();
                    if (obj == null) {
                        obj = new d4(this);
                        this.f26674s.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26674s) {
            obj = null;
        }
        return (d4) obj;
    }

    public i t() {
        Object obj = this.f26681y.get();
        if (obj == null) {
            synchronized (this.f26681y) {
                try {
                    obj = this.f26681y.get();
                    if (obj == null) {
                        obj = new i(this);
                        this.f26681y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f26681y) {
            obj = null;
        }
        return (i) obj;
    }

    public void d(String str) {
        J();
        if (n.a()) {
            J().a("AppLovinSdk", str);
        }
        j0().a(new sm(this));
    }

    public void b(uj ujVar, Object obj) {
        i0().b(ujVar, obj);
    }

    public void e(String str) {
        J();
        if (n.a()) {
            J().a("AppLovinSdk", "setMediationProvider(mediationProvider=" + str + ")");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
            n.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.f26652h = str;
        if (yp.h()) {
            yp.a((Runnable) new w(6, this));
        } else {
            c(uj.H);
        }
    }

    public void f(String str) {
        n.g("AppLovinSdk", "Setting plugin version: " + str);
        if (yp.h()) {
            yp.a((Runnable) new y(this, str, 0));
        } else {
            h0().a(sj.a4, str);
        }
    }

    public void g(String str) {
        J();
        if (n.a()) {
            com.applovin.impl.adview.t.v("Setting user id: ", str, J(), "AppLovinSdk");
        }
        if (StringUtils.isValidString(str) && str.length() > yp.b(8)) {
            n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + yp.b(8) + " maximum)");
        }
        if (yp.h()) {
            yp.a((Runnable) new y(this, str, 1));
        } else {
            q0().a(str);
        }
    }

    public void c(JSONObject jSONObject) {
        this.d = System.currentTimeMillis();
        e4.c(jSONObject, this);
        e4.b(jSONObject, this);
        e4.a(jSONObject, this);
        qe.f(jSONObject, this);
        qe.d(jSONObject, this);
        qe.e(jSONObject, this);
        qe.g(jSONObject, this);
    }

    public Object a(sj sjVar) {
        return h0().a(sjVar);
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        f26636w0 = context.getApplicationContext();
    }

    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        J();
        if (n.a()) {
            J().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f26669p0);
    }

    public Object a(uj ujVar) {
        return a(ujVar, (Object) null);
    }

    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f26669p0);
    }

    public Object a(uj ujVar, Object obj) {
        return i0().a(ujVar, obj);
    }

    /* renamed from: b */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        N0();
        this.f26648f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            n.g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            h0().a(sj.a4, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(sj.f26954u)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        tm j02 = j0();
        yl ylVar = this.f26677t0;
        tm.b bVar = tm.b.CORE;
        j02.a(ylVar, bVar);
        j0().a(this.f26679u0, bVar);
    }

    public boolean a(sj sjVar, MaxAdFormat maxAdFormat) {
        return b(sjVar).contains(maxAdFormat);
    }

    public void a(pe peVar) {
        if (j0().d()) {
            return;
        }
        List c2 = c(ve.P6);
        if (c2.size() <= 0 || !L().a().containsAll(c2)) {
            return;
        }
        J();
        if (n.a()) {
            J().a("AppLovinSdk", "All required adapters initialized");
        }
        j0().e();
        J0();
    }

    public void c() {
        synchronized (this.f26647e0) {
            try {
                if (!this.f26653h0 && !this.f26655i0) {
                    P0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f26669p0);
    }

    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            n.h("AppLovinSdk", (String) it.next());
        }
    }

    public /* synthetic */ void c(String str) {
        q0().a(str);
    }

    public static String a(String str) {
        return a(str, (List) null);
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
    
        r15.f26663m0 = (java.lang.String) r13.getValue();
        J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (com.applovin.impl.sdk.n.a() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        J().a("AppLovinSdk", "Detected mediation provider: " + r15.f26663m0);
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.j.b():java.lang.String");
    }

    public static String a(int i2) {
        return a(i2, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context l2 = l();
        return a(l2.getResources().getIdentifier(str, "string", l2.getPackageName()), list);
    }

    public static String a(int i2, List list) {
        String string = l().getResources().getString(i2);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static com.applovin.impl.q a(Context context) {
        if (f26639z0 == null) {
            synchronized (A0) {
                try {
                    if (f26639z0 == null) {
                        f26639z0 = new com.applovin.impl.q(context);
                    }
                } finally {
                }
            }
        }
        return f26639z0;
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.f26675s0.get()) {
            n.h("AppLovinSdk", "Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            E().a(la.L, "legacy_init_already");
            if (yp.c(this)) {
                throw new IllegalStateException("Invalid initialization process. Please initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or functions");
            }
            return;
        }
        synchronized (this.f26667o0) {
            try {
                if (this.f26665n0 != null) {
                    if (!u0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new x(this, sdkInitializationListener, 2));
                    return;
                }
                this.f26665n0 = appLovinSdkInitializationConfiguration;
                this.f26671q0 = sdkInitializationListener;
                this.f26640a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f26652h = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f26650g = appLovinSdkInitializationConfiguration.getSegmentCollection();
                yp.a((Runnable) new androidx.core.content.res.a(15, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void b(String str) {
        h0().a(sj.a4, str);
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        z0().set(true);
        this.f26640a = str;
        this.f26648f = appLovinSdkSettings;
        yp.a((Runnable) new w(5, this));
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

    public void a(boolean z2) {
        synchronized (this.f26647e0) {
            this.f26653h0 = false;
            this.f26655i0 = z2;
        }
        if (z2) {
            List c2 = c(ve.P6);
            if (c2.isEmpty()) {
                j0().e();
                J0();
                return;
            }
            Long l2 = (Long) a(ve.Q6);
            jn jnVar = new jn(this, true, "timeoutInitAdapters", new w(7, this));
            J();
            if (n.a()) {
                J().a("AppLovinSdk", "Waiting for required adapters to init: " + c2 + " - timing out in " + l2 + "ms...");
            }
            j0().a(jnVar, tm.b.TIMEOUT, l2.longValue(), true);
        }
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f26646d0;
        return (list == null || list.size() <= 0 || this.f26646d0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) i0().a(uj.e, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < yp.e(str)) {
                n.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void a(Map map) {
        N().a(map);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        i0().a(str, obj, editor);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return vj.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        i0().a(sharedPreferences);
    }

    public void a(long j2) {
        t().b(j2);
    }

    public void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!u0()) {
            this.f26671q0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new x(this, sdkInitializationListener, 0));
        }
    }
}
