package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.l.o;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
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
    private static volatile b f3162d;

    /* renamed from: c, reason: collision with root package name */
    private Context f3164c;

    /* renamed from: f, reason: collision with root package name */
    private C0002b f3166f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, C0002b> f3167g;
    List<File> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    List<File> f3163b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f3165e = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f3168h = false;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f3169i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private Runnable f3170j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    };

    /* loaded from: classes.dex */
    public static class a {
        File a;

        /* renamed from: b, reason: collision with root package name */
        long f3176b;

        /* renamed from: c, reason: collision with root package name */
        long f3177c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        CrashType f3178d;

        /* renamed from: e, reason: collision with root package name */
        String f3179e;

        public a(File file, long j3, @Nullable CrashType crashType) {
            this.f3177c = -1L;
            this.a = file;
            this.f3176b = j3;
            this.f3178d = crashType;
            this.f3179e = file.getName();
        }

        public a(File file, @Nullable CrashType crashType) {
            this.f3176b = -1L;
            this.f3177c = -1L;
            this.a = file;
            this.f3178d = crashType;
            this.f3179e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002b {
        String a;

        /* renamed from: d, reason: collision with root package name */
        a f3182d;

        /* renamed from: e, reason: collision with root package name */
        a f3183e;

        /* renamed from: b, reason: collision with root package name */
        List<a> f3180b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<a> f3181c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        boolean f3184f = false;

        /* renamed from: g, reason: collision with root package name */
        int f3185g = 0;

        public C0002b(String str) {
            this.a = str;
        }
    }

    private b(Context context) {
        this.f3164c = context;
    }

    @Nullable
    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j3, long j10) {
        com.apm.insight.entity.e eVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.h.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.h.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = null;
                        com.apm.insight.l.h.a(file);
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e a10 = com.apm.insight.l.h.a(file, crashType);
                try {
                    JSONObject b3 = a10.b();
                    if (a10.b() == null) {
                        com.apm.insight.l.h.a(file);
                    } else {
                        if (crashType == CrashType.ANR) {
                            return a10;
                        }
                        b3.put("crash_time", j3);
                        b3.put("app_start_time", j10);
                        JSONObject optJSONObject = b3.optJSONObject("header");
                        if (optJSONObject == null) {
                            optJSONObject = Header.a(this.f3164c, j3).f();
                        } else if (z10) {
                            b3.remove("header");
                        }
                        String optString = optJSONObject.optString("sdk_version_name", null);
                        if (optString == null) {
                            optString = "1.3.8.nourl-alpha.22";
                        }
                        com.apm.insight.entity.a.a(b3, "filters", "sdk_version", optString);
                        if (com.apm.insight.l.h.a(b3.optJSONArray("logcat"))) {
                            b3.put("logcat", com.apm.insight.runtime.k.b(str));
                        }
                        com.apm.insight.entity.a.a(b3, "filters", "has_dump", "true");
                        com.apm.insight.entity.a.a(b3, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.k.a(b3, "logcat")));
                        com.apm.insight.entity.a.a(b3, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(b3, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(b3, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                        com.apm.insight.entity.a.a(b3, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(b3, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                        com.apm.insight.entity.a.a(b3, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(b3, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(b3, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.c.m()));
                        b3.put("launch_did", com.apm.insight.i.a.a(this.f3164c));
                        b3.put("crash_uuid", file.getName());
                        b3.put("jiffy", q.a.a());
                        try {
                            long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j3, str));
                            com.apm.insight.entity.a.a(b3, "filters", "lastAliveTime", Math.abs(parseLong - j3) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                            b3.put("lastAliveTime", String.valueOf(parseLong));
                        } catch (Throwable unused) {
                            b3.put("lastAliveTime", AppLovinMediationProvider.UNKNOWN);
                            com.apm.insight.entity.a.a(b3, "filters", "lastAliveTime", AppLovinMediationProvider.UNKNOWN);
                        }
                        b3.put("has_dump", "true");
                        if (b3.opt("storage") == null) {
                            com.apm.insight.entity.a.a(b3, v.a(com.apm.insight.i.g()));
                        }
                        if (Header.b(optJSONObject)) {
                            com.apm.insight.entity.a.a(b3, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(b3);
                        a10.b().put("upload_scene", "launch_scan");
                        if (z10) {
                            JSONObject jSONObject = new JSONObject();
                            b3.put("event_type", "start_crash");
                            b3.put("stack", b3.remove(DataSchemeDataSource.SCHEME_DATA));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONArray().put(b3));
                            jSONObject.put("header", optJSONObject);
                            a10.a(jSONObject);
                        } else {
                            b3.put("isJava", 1);
                        }
                    }
                    return a10;
                } catch (Throwable th3) {
                    th = th3;
                    eVar = a10;
                    com.apm.insight.l.h.a(file);
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    return eVar;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            eVar = null;
        }
    }

    private void d() {
        if (this.f3166f != null) {
            return;
        }
        this.f3166f = new C0002b("old_uuid");
        HashMap<String, C0002b> hashMap = new HashMap<>();
        this.f3167g = hashMap;
        a(hashMap);
        b(this.f3167g, this.f3166f);
        c(this.f3167g, this.f3166f);
        a(this.f3167g, this.f3166f);
        b(this.f3166f, true, null);
        a(this.f3166f, true, null);
        this.f3166f = null;
        if (this.f3167g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f3168h || this.f3167g == null) {
            return;
        }
        if (!o.b(this.f3164c)) {
            f();
        }
        boolean h10 = h();
        com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.f3164c);
        Iterator<C0002b> it = this.f3167g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), h10, hVar);
        }
        Iterator<C0002b> it2 = this.f3167g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), h10, hVar);
        }
        Iterator<C0002b> it3 = this.f3167g.values().iterator();
        while (it3.hasNext()) {
            a(it3.next());
        }
        hVar.a();
        com.apm.insight.runtime.b.a();
        f();
    }

    private void f() {
        this.f3168h = true;
        this.f3167g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f3168h) {
            return;
        }
        if (!o.b(this.f3164c) || (System.currentTimeMillis() - com.apm.insight.i.j() <= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS && com.apm.insight.i.i().isApmExists() && !Npth.hasCrash())) {
            p.b().a(this.f3169i, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        } else {
            e();
        }
    }

    private boolean h() {
        if (this.f3165e == -1) {
            if (com.apm.insight.runtime.a.b() && com.apm.insight.runtime.a.g()) {
                this.f3165e = 1;
            } else {
                this.f3165e = 0;
            }
        }
        return this.f3165e == 1;
    }

    private void i() {
        File[] listFiles = n.i(this.f3164c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e e2 = com.apm.insight.l.h.e(file.getAbsolutePath());
                    if (e2 != null) {
                        if (e2.b() != null) {
                            e2.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), e2.e(), e2.d(), e2.f(), e2.g())) {
                            com.apm.insight.l.h.a(file);
                            com.apm.insight.l.h.a(e2.c());
                        }
                    } else {
                        com.apm.insight.l.h.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            }
        }
    }

    public void b() {
        try {
            if (!this.f3168h && com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                p.b().a(this.f3170j);
            }
        } catch (Throwable unused) {
        }
    }

    public static b a() {
        if (f3162d == null) {
            synchronized (b.class) {
                if (f3162d == null) {
                    f3162d = new b(com.apm.insight.i.g());
                }
            }
        }
        return f3162d;
    }

    private void b(final C0002b c0002b, boolean z10, @Nullable com.apm.insight.runtime.h hVar) {
        Iterator<a> it;
        boolean z11;
        JSONObject a10;
        a aVar;
        if (c0002b.f3181c.size() <= 1 && c0002b.f3181c.isEmpty()) {
            c0002b.f3183e = c0002b.f3182d;
            return;
        }
        boolean b3 = o.b(this.f3164c);
        c0002b.f3183e = c0002b.f3182d;
        com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(this.f3164c);
        Iterator<a> it2 = c0002b.f3181c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            final File file = next.a;
            try {
                cVar.a(file);
                a10 = a(cVar);
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            if (a10 != null && a10.length() != 0) {
                if (a10.length() != 0) {
                    if (z10) {
                        it = it2;
                        z11 = b3;
                        if (hVar != null && !hVar.a("default")) {
                            cVar.k();
                        }
                    } else {
                        long optLong = a10.optLong("crash_time");
                        try {
                            aVar = c0002b.f3183e;
                        } catch (Throwable th3) {
                            th = th3;
                            it = it2;
                            z11 = b3;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.h.a(file);
                            b3 = z11;
                            it2 = it;
                        }
                        if (aVar == null) {
                            c0002b.f3183e = next;
                            c0002b.f3184f = true;
                            if (hVar == null || hVar.a("default")) {
                                it = it2;
                                z11 = b3;
                            } else {
                                cVar.k();
                            }
                        } else {
                            it = it2;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                z11 = b3;
                            }
                            if (c0002b.f3184f) {
                                z11 = b3;
                            } else {
                                z11 = b3;
                                try {
                                } catch (Throwable th5) {
                                    th = th5;
                                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                                    com.apm.insight.l.h.a(file);
                                    b3 = z11;
                                    it2 = it;
                                }
                                if (optLong < aVar.f3176b) {
                                    c0002b.f3183e = next;
                                    if (hVar == null || hVar.a("default")) {
                                        if (!a(file)) {
                                            a(file, c0002b);
                                        }
                                        c0002b.f3184f = true;
                                    } else {
                                        cVar.k();
                                        b3 = z11;
                                        it2 = it;
                                    }
                                }
                            }
                            com.apm.insight.entity.a.a(a10, "filters", "aid", String.valueOf(a10.optJSONObject("header").opt("aid")));
                            a10.optJSONObject("header").put("aid", 2010);
                        }
                    }
                    com.apm.insight.entity.a.a(a10, "filters", "start_uuid", c0002b.a);
                    com.apm.insight.entity.a.a(a10, "filters", "crash_thread_name", a10.optString("crash_thread_name", AppLovinMediationProvider.UNKNOWN));
                    if (z11) {
                        try {
                            c.a aVar2 = new c.a(a10, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(a10, com.apm.insight.entity.b.a(aVar2.c(), aVar2.a(), s.a().b(aVar2.b() == -1 ? System.currentTimeMillis() : aVar2.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public void a(JSONObject jSONObject) {
                                    d.a().a(jSONObject, file, n.a(b.this.f3164c, c0002b.a));
                                }
                            });
                            if (!cVar.k()) {
                                cVar.h();
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.h.a(file);
                            b3 = z11;
                            it2 = it;
                        }
                    }
                    c.a(CrashType.NATIVE, a10);
                } else {
                    it = it2;
                    z11 = b3;
                }
                b3 = z11;
                it2 = it;
            }
            it = it2;
            z11 = b3;
            cVar.k();
            b3 = z11;
            it2 = it;
        }
    }

    private void c(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        com.apm.insight.l.h.a(n.b(this.f3164c));
    }

    private JSONObject a(com.apm.insight.nativecrash.c cVar) {
        JSONObject d10 = cVar.d();
        if (d10 != null && d10.length() != 0) {
            return d10;
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
        return this.f3168h;
    }

    private void a(C0002b c0002b) {
        com.apm.insight.l.h.a(n.a(this.f3164c, c0002b.a));
    }

    private void b(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        File[] listFiles = n.a(this.f3164c).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        for (File file : listFiles) {
            try {
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            if (!com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                if (!com.apm.insight.l.h.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (!file.isFile()) {
                        a(hashMap, c0002b, file, file.getName());
                    }
                }
            }
            com.apm.insight.l.h.a(file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:36|37|38|(1:40)(1:76)|41|(2:70|(3:74|75|20))(5:45|46|47|48|49)|50|51|52|53|(1:55)|56|57|20) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148 A[Catch: all -> 0x015d, TryCatch #4 {all -> 0x015d, blocks: (B:53:0x013c, B:55:0x0148, B:56:0x0157), top: B:52:0x013c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0002b r21, boolean r22, @androidx.annotation.Nullable com.apm.insight.runtime.h r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void a(File file, C0002b c0002b) {
    }

    private void a(HashMap<String, C0002b> hashMap) {
        File[] listFiles = n.f(this.f3164c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0002b c0002b = hashMap.get(name);
                    if (c0002b == null) {
                        c0002b = new C0002b(name);
                        hashMap.put(name, c0002b);
                    }
                    JSONArray a10 = com.apm.insight.nativecrash.d.a(n.l(file), n.m(file));
                    int length = a10.length();
                    c0002b.f3185g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.h.a(n.n(file), a10, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.h.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
                com.apm.insight.l.h.a(file);
            }
        }
    }

    private void a(HashMap<String, C0002b> hashMap, C0002b c0002b) {
        File[] listFiles = n.d(this.f3164c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0002b c0002b2 = hashMap.get(name);
                    if (c0002b2 == null) {
                        c0002b2 = new C0002b(name);
                        hashMap.put(name, c0002b2);
                    }
                    c0002b2.f3181c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.h.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
                com.apm.insight.l.h.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
    
        if (r0.equals("launch") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0002b> r12, com.apm.insight.k.b.C0002b r13, java.io.File r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "G"
            boolean r0 = r15.endsWith(r0)
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r15.split(r0)
            int r1 = r0.length
            r2 = 5
            r3 = 0
            if (r1 >= r2) goto L1e
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f3180b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            return
        L1e:
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> La3
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r2 = 4
            r2 = r0[r2]     // Catch: java.lang.Throwable -> La3
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r13 = 2
            r2 = r0[r13]
            r8 = 1
            r0 = r0[r8]
            r0.getClass()
            int r9 = r0.hashCode()
            r10 = -1
            switch(r9) {
                case -1109843021: goto L55;
                case 96741: goto L4a;
                case 3254818: goto L3f;
                default: goto L3d;
            }
        L3d:
            r1 = r10
            goto L5e
        L3f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r1 = r13
            goto L5e
        L4a:
            java.lang.String r13 = "anr"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L53
            goto L3d
        L53:
            r1 = r8
            goto L5e
        L55:
            java.lang.String r13 = "launch"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L5e
            goto L3d
        L5e:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L65;
                case 2: goto L62;
                default: goto L61;
            }
        L61:
            goto L6a
        L62:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.JAVA
            goto L6a
        L65:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR
            goto L6a
        L68:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.LAUNCH
        L6a:
            java.lang.Object r13 = r12.get(r2)
            com.apm.insight.k.b$b r13 = (com.apm.insight.k.b.C0002b) r13
            if (r13 != 0) goto L7a
            com.apm.insight.k.b$b r13 = new com.apm.insight.k.b$b
            r13.<init>(r2)
            r12.put(r2, r13)
        L7a:
            com.apm.insight.k.b$a r12 = new com.apm.insight.k.b$a
            r12.<init>(r14, r4, r3)
            r12.f3177c = r6
            com.apm.insight.k.b$a r14 = r13.f3182d
            if (r14 == 0) goto L8d
            long r0 = r14.f3176b
            long r4 = r12.f3176b
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 <= 0) goto L9d
        L8d:
            if (r3 == 0) goto L9d
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.ANR
            if (r3 == r14) goto L9d
            java.lang.String r14 = "ignore"
            boolean r14 = r15.contains(r14)
            if (r14 != 0) goto L9d
            r13.f3182d = r12
        L9d:
            java.util.List<com.apm.insight.k.b$a> r13 = r13.f3180b
            r13.add(r12)
            goto Lc5
        La3:
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f3180b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            com.apm.insight.d r12 = com.apm.insight.c.a()
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "err format crashTime:"
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            java.lang.String r14 = "NPTH_CATCH"
            r12.a(r14, r13)
            return
        Lc2:
            com.apm.insight.l.h.a(r14)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    public void a(boolean z10) {
        if (!Npth.isStopUpload() && z10) {
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
