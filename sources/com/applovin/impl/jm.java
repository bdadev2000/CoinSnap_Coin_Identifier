package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.tm;
import com.applovin.impl.vi;
import com.google.android.gms.security.ProviderInstaller;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jm extends yl {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicBoolean f24709k = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final int f24710h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f24711i;

    /* renamed from: j, reason: collision with root package name */
    private b f24712j;

    /* loaded from: classes.dex */
    public interface b {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    public class c extends yl {
        public c(com.applovin.impl.sdk.j jVar) {
            super("TaskTimeoutFetchBasicSettings", jVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jm.this.f24712j != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Timing out fetch basic settings...");
                }
                jm.this.a(new JSONObject());
            }
        }
    }

    public jm(int i2, com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskFetchBasicSettings", jVar, true);
        this.f24711i = new Object();
        this.f24710h = i2;
        this.f24712j = bVar;
    }

    private String f() {
        return e4.a((String) this.f28216a.a(sj.K0), "5.0/i", b());
    }

    private String g() {
        return e4.a((String) this.f28216a.a(sj.J0), "5.0/i", b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:1|2|3|(33:5|(1:7)|8|(1:10)|11|(1:13)|14|(1:16)(2:72|(1:74)(1:75))|(1:20)|21|(1:23)|24|(1:26)|27|28|(1:30)|32|(1:38)|39|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:58)|59|(1:61)|62|(3:64|(1:66)|67)|69)|76|8|(0)|11|(0)|14|(0)(0)|(2:18|20)|21|(0)|24|(0)|27|28|(0)|32|(3:34|36|38)|39|(2:42|44)|45|(0)|48|(0)|51|(0)|54|(2:56|58)|59|(0)|62|(0)|69) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8 A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5 A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013d A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018b A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0216 A[Catch: JSONException -> 0x005a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0238 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #0 {all -> 0x0257, blocks: (B:28:0x0225, B:30:0x0238), top: B:27:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f0 A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x030b A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0322 A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x035f A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x036e A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148 A[Catch: JSONException -> 0x005a, TryCatch #1 {JSONException -> 0x005a, blocks: (B:3:0x0039, B:5:0x004b, B:8:0x006a, B:10:0x00a8, B:11:0x00ad, B:13:0x00b5, B:14:0x00ba, B:16:0x013d, B:18:0x015e, B:20:0x0164, B:21:0x0175, B:23:0x018b, B:24:0x0190, B:26:0x0216, B:32:0x0257, B:34:0x0293, B:36:0x029d, B:38:0x02a5, B:39:0x02ae, B:42:0x02ca, B:44:0x02d2, B:45:0x02e0, B:47:0x02f0, B:48:0x02fb, B:50:0x030b, B:51:0x0316, B:53:0x0322, B:54:0x0328, B:56:0x0334, B:58:0x033a, B:59:0x033f, B:61:0x035f, B:62:0x0369, B:64:0x036e, B:66:0x037a, B:67:0x0383, B:72:0x0148, B:74:0x0150, B:76:0x005d), top: B:2:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject e() {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jm.e():org.json.JSONObject");
    }

    public Map h() {
        HashMap hashMap = new HashMap();
        if (!((Boolean) this.f28216a.a(sj.C5)).booleanValue() && !((Boolean) this.f28216a.a(sj.B5)).booleanValue()) {
            hashMap.put(ImpressionLog.x, UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f28216a.a(sj.o5)).booleanValue()) {
            hashMap.put("sdk_key", this.f28216a.b0());
        }
        Boolean b2 = a4.b().b(a());
        if (b2 != null) {
            hashMap.put("huc", b2.toString());
        }
        Boolean b3 = a4.c().b(a());
        if (b3 != null) {
            hashMap.put("aru", b3.toString());
        }
        Boolean b4 = a4.a().b(a());
        if (b4 != null) {
            hashMap.put("dns", b4.toString());
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!z3.k() && f24709k.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.j.l());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Cannot update security provider", th);
                }
            }
        }
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.f28216a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f28216a.a(sj.N5)).booleanValue()).c(com.safedk.android.a.g.f29074c).a((Object) new JSONObject()).a(((Integer) this.f28216a.a(sj.u3)).intValue()).b(((Integer) this.f28216a.a(sj.x3)).intValue()).c(((Integer) this.f28216a.a(sj.t3)).intValue()).e(((Boolean) this.f28216a.a(sj.G3)).booleanValue()).a(vi.a.a(((Integer) this.f28216a.a(sj.t5)).intValue())).f(true).a();
        this.f28216a.j0().a(new c(this.f28216a), tm.b.TIMEOUT, ((Integer) this.f28216a.a(r3)).intValue() + 250);
        a aVar = new a(a2, this.f28216a, d());
        aVar.c(sj.J0);
        aVar.b(sj.K0);
        this.f28216a.j0().a(aVar);
    }

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z2) {
            super(aVar, jVar, z2);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            jm.this.a(jSONObject);
            this.f28216a.E().a("fetchBasicSettings", str, i2);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to fetch basic SDK settings: server returned " + i2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jm.this.a(jSONObject);
            this.f28216a.E().a("fetchBasicSettings", str, i2, CollectionUtils.hashMap("error_message", str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f24711i) {
            bVar = this.f24712j;
            this.f24712j = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
