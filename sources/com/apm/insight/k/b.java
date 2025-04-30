package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.o;
import com.apm.insight.l.p;
import com.apm.insight.l.w;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f5848d;

    /* renamed from: c, reason: collision with root package name */
    private Context f5850c;

    /* renamed from: f, reason: collision with root package name */
    private C0002b f5852f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, C0002b> f5853g;

    /* renamed from: a, reason: collision with root package name */
    List<File> f5849a = new ArrayList();
    List<File> b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f5851e = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f5854h = false;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f5855i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private Runnable f5856j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    };

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        File f5864a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f5865c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        CrashType f5866d;

        /* renamed from: e, reason: collision with root package name */
        String f5867e;

        public a(File file, long j7, @Nullable CrashType crashType) {
            this.f5865c = -1L;
            this.f5864a = file;
            this.b = j7;
            this.f5866d = crashType;
            this.f5867e = file.getName();
        }

        public a(File file, @Nullable CrashType crashType) {
            this.b = -1L;
            this.f5865c = -1L;
            this.f5864a = file;
            this.f5866d = crashType;
            this.f5867e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002b {

        /* renamed from: a, reason: collision with root package name */
        String f5868a;

        /* renamed from: d, reason: collision with root package name */
        a f5870d;

        /* renamed from: e, reason: collision with root package name */
        a f5871e;
        List<a> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<a> f5869c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        boolean f5872f = false;

        /* renamed from: g, reason: collision with root package name */
        int f5873g = 0;

        public C0002b(String str) {
            this.f5868a = str;
        }
    }

    private b(Context context) {
        this.f5850c = context;
    }

    @Nullable
    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j7, long j9) {
        com.apm.insight.entity.e eVar;
        com.apm.insight.entity.e eVar2;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.i.a(file);
                    return null;
                }
                boolean z8 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.i.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        eVar = null;
                        com.apm.insight.l.i.a(file);
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e a6 = com.apm.insight.l.i.a(file, crashType);
                try {
                    JSONObject b = a6.b();
                    try {
                        if (a6.b() == null) {
                            eVar2 = a6;
                            com.apm.insight.l.i.a(file);
                        } else {
                            if (crashType == CrashType.ANR) {
                                return a6;
                            }
                            b.put("crash_time", j7);
                            try {
                                b.put("app_start_time", j9);
                                JSONObject optJSONObject = b.optJSONObject("header");
                                try {
                                    if (optJSONObject == null) {
                                        optJSONObject = Header.a(this.f5850c, j7).f();
                                    } else if (z8) {
                                        b.remove("header");
                                    }
                                    String optString = optJSONObject.optString("sdk_version_name", null);
                                    if (optString == null) {
                                        optString = "1.3.8.nourl-alpha.19";
                                    }
                                    com.apm.insight.entity.a.a(b, "filters", "sdk_version", optString);
                                    if (com.apm.insight.l.i.a(b.optJSONArray("logcat"))) {
                                        b.put("logcat", com.apm.insight.runtime.k.b(str));
                                    }
                                    com.apm.insight.entity.a.a(b, "filters", "has_dump", "true");
                                    com.apm.insight.entity.a.a(b, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.l.a(b, "logcat")));
                                    com.apm.insight.entity.a.a(b, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                                    com.apm.insight.entity.a.a(b, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                                    com.apm.insight.entity.a.a(b, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                                    com.apm.insight.entity.a.a(b, "filters", "is_64_devices", String.valueOf(Header.a()));
                                    com.apm.insight.entity.a.a(b, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                                    com.apm.insight.entity.a.a(b, "filters", "is_x86_devices", String.valueOf(Header.b()));
                                    com.apm.insight.entity.a.a(b, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                                    com.apm.insight.entity.a.a(b, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.c.m()));
                                    b.put("launch_did", com.apm.insight.i.a.a(this.f5850c));
                                    b.put("crash_uuid", file.getName());
                                    b.put("jiffy", q.a.a());
                                    try {
                                        long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j7, str));
                                        com.apm.insight.entity.a.a(b, "filters", "lastAliveTime", Math.abs(parseLong - j7) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                                        b.put("lastAliveTime", String.valueOf(parseLong));
                                    } catch (Throwable unused) {
                                        b.put("lastAliveTime", AppLovinMediationProvider.UNKNOWN);
                                        com.apm.insight.entity.a.a(b, "filters", "lastAliveTime", AppLovinMediationProvider.UNKNOWN);
                                    }
                                    b.put("has_dump", "true");
                                    if (b.opt("storage") == null) {
                                        com.apm.insight.entity.a.a(b, w.a(com.apm.insight.i.g()));
                                    }
                                    if (Header.b(optJSONObject)) {
                                        com.apm.insight.entity.a.a(b, "filters", "unauthentic_version", "unauthentic_version");
                                    }
                                    com.apm.insight.entity.d.b(b);
                                    a6.b().put("upload_scene", "launch_scan");
                                    if (z8) {
                                        JSONObject jSONObject = new JSONObject();
                                        b.put("event_type", "start_crash");
                                        b.put("stack", b.remove(DataSchemeDataSource.SCHEME_DATA));
                                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONArray().put(b));
                                        jSONObject.put("header", optJSONObject);
                                        eVar2 = a6;
                                        eVar2.a(jSONObject);
                                    } else {
                                        eVar2 = a6;
                                        b.put("isJava", 1);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    eVar = a6;
                                    com.apm.insight.l.i.a(file);
                                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                                    return eVar;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                eVar2 = a6;
                                eVar = eVar2;
                                com.apm.insight.l.i.a(file);
                                com.apm.insight.c.a().a("NPTH_CATCH", th);
                                return eVar;
                            }
                        }
                        return eVar2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    eVar2 = a6;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            eVar = null;
        }
    }

    private void d() {
        if (this.f5852f != null) {
            return;
        }
        this.f5852f = new C0002b("old_uuid");
        HashMap<String, C0002b> hashMap = new HashMap<>();
        this.f5853g = hashMap;
        a(hashMap);
        b(this.f5853g, this.f5852f);
        c(this.f5853g, this.f5852f);
        a(this.f5853g, this.f5852f);
        b(this.f5852f, true, null);
        a(this.f5852f, true, null);
        this.f5852f = null;
        if (this.f5853g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f5854h || this.f5853g == null) {
            return;
        }
        if (!p.b(this.f5850c)) {
            f();
        }
        boolean h6 = h();
        com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.f5850c);
        Iterator<C0002b> it = this.f5853g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), h6, hVar);
        }
        Iterator<C0002b> it2 = this.f5853g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), h6, hVar);
        }
        Iterator<C0002b> it3 = this.f5853g.values().iterator();
        while (it3.hasNext()) {
            a(it3.next());
        }
        hVar.a();
        com.apm.insight.runtime.b.a();
        f();
    }

    private void f() {
        this.f5854h = true;
        this.f5853g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f5854h) {
            return;
        }
        if (!p.b(this.f5850c) || (System.currentTimeMillis() - com.apm.insight.i.j() <= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS && com.apm.insight.i.i().isApmExists() && !Npth.hasCrash())) {
            com.apm.insight.runtime.p.b().a(this.f5855i, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        } else {
            e();
        }
    }

    private boolean h() {
        if (this.f5851e == -1) {
            if (com.apm.insight.runtime.a.b() && com.apm.insight.runtime.a.g()) {
                this.f5851e = 1;
            } else {
                this.f5851e = 0;
            }
        }
        return this.f5851e == 1;
    }

    private void i() {
        File[] listFiles = o.i(this.f5850c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i9 = 0; i9 < listFiles.length && i9 < 5; i9++) {
            File file = listFiles[i9];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e e4 = com.apm.insight.l.i.e(file.getAbsolutePath());
                    if (e4 != null) {
                        if (e4.b() != null) {
                            e4.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), e4.e(), e4.d(), e4.f(), e4.g())) {
                            com.apm.insight.l.i.a(file);
                            com.apm.insight.l.i.a(e4.c());
                        }
                    } else {
                        com.apm.insight.l.i.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        }
    }

    public void b() {
        try {
            if (!this.f5854h && com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                com.apm.insight.runtime.p.b().a(this.f5856j);
            }
        } catch (Throwable unused) {
        }
    }

    public static b a() {
        if (f5848d == null) {
            synchronized (b.class) {
                try {
                    if (f5848d == null) {
                        f5848d = new b(com.apm.insight.i.g());
                    }
                } finally {
                }
            }
        }
        return f5848d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f0, code lost:
    
        if (r21.a("default") == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(final com.apm.insight.k.b.C0002b r19, boolean r20, @androidx.annotation.Nullable com.apm.insight.runtime.h r21) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.b(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void c(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        com.apm.insight.l.i.a(o.b(this.f5850c));
    }

    private JSONObject a(com.apm.insight.nativecrash.c cVar) {
        JSONObject d2 = cVar.d();
        if (d2 != null && d2.length() != 0) {
            return d2;
        }
        if (com.apm.insight.i.d()) {
            cVar.l();
        }
        if (!cVar.c()) {
            cVar.k();
            return null;
        }
        if (!cVar.f()) {
            cVar.k();
            return null;
        }
        if (cVar.g()) {
            cVar.k();
            return null;
        }
        cVar.e();
        return cVar.j();
    }

    public boolean c() {
        return this.f5854h;
    }

    private void a(C0002b c0002b) {
        com.apm.insight.l.i.a(o.a(this.f5850c, c0002b.f5868a));
    }

    private void b(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        File[] listFiles = o.a(this.f5850c).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        for (File file : listFiles) {
            try {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (!com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                if (!com.apm.insight.l.i.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (!file.isFile()) {
                        a(hashMap, c0002b, file, file.getName());
                    }
                }
            }
            com.apm.insight.l.i.a(file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:36|37|38|(1:40)(1:78)|41|(2:72|(3:76|77|20))(5:45|46|47|48|49)|50|51|52|53|(1:55)|56|57|58|20) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:53:0x0142, B:55:0x014e, B:57:0x0162), top: B:52:0x0142 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0002b r21, boolean r22, @androidx.annotation.Nullable com.apm.insight.runtime.h r23) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void a(File file, C0002b c0002b) {
    }

    private void a(HashMap<String, C0002b> hashMap) {
        File[] listFiles = o.f(this.f5850c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i9 = 0; i9 < listFiles.length && i9 < 5; i9++) {
            File file = listFiles[i9];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0002b c0002b = hashMap.get(name);
                    if (c0002b == null) {
                        c0002b = new C0002b(name);
                        hashMap.put(name, c0002b);
                    }
                    JSONArray a6 = com.apm.insight.nativecrash.d.a(o.l(file), o.m(file));
                    int length = a6.length();
                    c0002b.f5873g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.i.a(o.n(file), a6, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    private void a(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        File[] listFiles = o.d(this.f5850c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i9 = 0; i9 < listFiles.length && i9 < 5; i9++) {
            File file = listFiles[i9];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0002b c0002b2 = hashMap.get(name);
                    if (c0002b2 == null) {
                        c0002b2 = new C0002b(name);
                        hashMap.put(name, c0002b2);
                    }
                    c0002b2.f5869c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.i.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
                com.apm.insight.l.i.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        if (r3.equals("anr") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0002b> r12, com.apm.insight.k.b.C0002b r13, java.io.File r14, java.lang.String r15) {
        /*
            r11 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "G"
            boolean r3 = r15.endsWith(r3)
            if (r3 == 0) goto Lc1
            java.lang.String r3 = "_"
            java.lang.String[] r3 = r15.split(r3)
            int r4 = r3.length
            r5 = 5
            r6 = 0
            if (r4 >= r5) goto L21
            java.util.List<com.apm.insight.k.b$a> r12 = r13.b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r6)
            r12.add(r13)
            return
        L21:
            r4 = r3[r2]     // Catch: java.lang.Throwable -> La2
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> La2
            r7 = 4
            r7 = r3[r7]     // Catch: java.lang.Throwable -> La2
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> La2
            r13 = r3[r1]
            r3 = r3[r0]
            r3.getClass()
            r9 = -1
            int r10 = r3.hashCode()
            switch(r10) {
                case -1109843021: goto L53;
                case 96741: goto L4a;
                case 3254818: goto L3f;
                default: goto L3d;
            }
        L3d:
            r0 = r9
            goto L5d
        L3f:
            java.lang.String r0 = "java"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r0 = r1
            goto L5d
        L4a:
            java.lang.String r1 = "anr"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L5d
            goto L3d
        L53:
            java.lang.String r0 = "launch"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5c
            goto L3d
        L5c:
            r0 = r2
        L5d:
            switch(r0) {
                case 0: goto L67;
                case 1: goto L64;
                case 2: goto L61;
                default: goto L60;
            }
        L60:
            goto L69
        L61:
            com.apm.insight.CrashType r6 = com.apm.insight.CrashType.JAVA
            goto L69
        L64:
            com.apm.insight.CrashType r6 = com.apm.insight.CrashType.ANR
            goto L69
        L67:
            com.apm.insight.CrashType r6 = com.apm.insight.CrashType.LAUNCH
        L69:
            java.lang.Object r0 = r12.get(r13)
            com.apm.insight.k.b$b r0 = (com.apm.insight.k.b.C0002b) r0
            if (r0 != 0) goto L79
            com.apm.insight.k.b$b r0 = new com.apm.insight.k.b$b
            r0.<init>(r13)
            r12.put(r13, r0)
        L79:
            com.apm.insight.k.b$a r12 = new com.apm.insight.k.b$a
            r12.<init>(r14, r4, r6)
            r12.f5865c = r7
            com.apm.insight.k.b$a r13 = r0.f5870d
            if (r13 == 0) goto L8c
            long r13 = r13.b
            long r1 = r12.b
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto L9c
        L8c:
            if (r6 == 0) goto L9c
            com.apm.insight.CrashType r13 = com.apm.insight.CrashType.ANR
            if (r6 == r13) goto L9c
            java.lang.String r13 = "ignore"
            boolean r13 = r15.contains(r13)
            if (r13 != 0) goto L9c
            r0.f5870d = r12
        L9c:
            java.util.List<com.apm.insight.k.b$a> r13 = r0.b
            r13.add(r12)
            goto Lc4
        La2:
            java.util.List<com.apm.insight.k.b$a> r12 = r13.b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r6)
            r12.add(r13)
            com.apm.insight.d r12 = com.apm.insight.c.a()
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "err format crashTime:"
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            java.lang.String r14 = "NPTH_CATCH"
            r12.a(r14, r13)
            return
        Lc1:
            com.apm.insight.l.i.a(r14)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    public void a(boolean z8) {
        if (!Npth.isStopUpload() && z8) {
            d();
            i();
            com.apm.insight.c.a.a();
        }
    }

    private boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }
}
