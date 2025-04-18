package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.i;
import com.apm.insight.l.e;
import com.apm.insight.l.h;
import com.apm.insight.l.j;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {
    private static a a = null;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f3103i = false;

    /* renamed from: j, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f3104j = new ThreadLocal<>();

    /* renamed from: l, reason: collision with root package name */
    private static ArrayList<b> f3105l = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f3106b;

    /* renamed from: c, reason: collision with root package name */
    private c f3107c;

    /* renamed from: d, reason: collision with root package name */
    private c f3108d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f3109e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f3110f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f3111g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f3112h = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f3113k;

    private a() {
        d();
    }

    private static int a(Throwable th2, Thread thread) {
        int i10 = 0;
        for (int i11 = 0; i11 < f3105l.size(); i11++) {
            try {
                try {
                    i10 |= f3105l.get(i11).a(th2, thread);
                } catch (Throwable th3) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th3);
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    private static Throwable b(Throwable th2, Thread thread) {
        for (int i10 = 0; i10 < f3105l.size(); i10++) {
            try {
                try {
                    f3105l.get(i10).b(th2, thread);
                } catch (Throwable th3) {
                    return th3;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th4) {
            return th4;
        }
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a(DataSchemeDataSource.SCHEME_DATA, (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a10 = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a10 != null) {
                            com.apm.insight.k.d.a().b(a10.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f3106b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f3110f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f3110f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    private void f() {
        File a10 = n.a(i.g());
        File a11 = n.a();
        if (h.b(a10) && h.b(a11)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!com.apm.insight.k.i.a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private boolean g() {
        return com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = a(thread, th2);
        } while (th2 != null);
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    private void c(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3106b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || q.a(512)) {
            return;
        }
        this.f3106b.uncaughtException(thread, th2);
    }

    public void b(c cVar) {
        this.f3108d = cVar;
    }

    private String a(File file, boolean z10, Throwable th2, String str, Thread thread, boolean z11) {
        String absolutePath = file.getAbsolutePath();
        this.f3112h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z11) {
            int h10 = NativeImpl.h(absolutePath);
            if (h10 > 0) {
                try {
                    NativeImpl.a(h10, com.apm.insight.l.a.c(i.g()));
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th2.getMessage());
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.a(h10, ": ");
                        NativeImpl.a(h10, th2.getMessage());
                    }
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, thread.getName());
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h10, "stack:");
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused3) {
                }
                u.a(th2, h10);
                NativeImpl.b(h10);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (q.a(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.insight.l.a.c(i.g()) + "\n").getBytes());
                fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                fileOutputStream.write((th2 + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                } catch (Throwable th3) {
                    try {
                        if (q.a(JsonLexerKt.BATCH_SIZE)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (q.a(8192)) {
                    throw new RuntimeException("test exception npth write stack");
                }
                str2 = u.a(th2, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1
                    boolean a = false;

                    @Override // com.apm.insight.l.e.a
                    public boolean a(String str3) {
                        if (!this.a && str3.contains("android.os.Looper.loop")) {
                            this.a = true;
                        }
                        return !this.a;
                    }
                } : new e.a());
                j.a(fileOutputStream);
                j.a(fileOutputStream);
            } catch (Throwable unused6) {
            }
        }
        return str2;
    }

    public static boolean b() {
        return f3103i;
    }

    public static boolean c() {
        Boolean bool = f3104j.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:7|(1:9)|10|(2:11|12)|(3:182|183|(34:185|15|16|(2:176|177)(2:18|19)|20|21|22|23|24|(19:(2:162|163)|27|28|29|(1:31)(1:158)|32|(3:150|(1:152)(1:154)|153)(1:35)|36|(1:148)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:143)|50|51|(4:85|(3:88|89|(3:93|94|95))|87|(4:(1:71)(2:65|66)|67|68|69)(4:72|1ed|77|78))(3:58|59|60)|61|(0)(0))|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(1:53)|85|(0)|87|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(0)|85|(0)|87|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(1:9)|10|11|12|(3:182|183|(34:185|15|16|(2:176|177)(2:18|19)|20|21|22|23|24|(19:(2:162|163)|27|28|29|(1:31)(1:158)|32|(3:150|(1:152)(1:154)|153)(1:35)|36|(1:148)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:143)|50|51|(4:85|(3:88|89|(3:93|94|95))|87|(4:(1:71)(2:65|66)|67|68|69)(4:72|1ed|77|78))(3:58|59|60)|61|(0)(0))|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(1:53)|85|(0)|87|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(0)|85|(0)|87|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0237, code lost:
    
        com.apm.insight.l.p.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023c, code lost:
    
        if (r19 != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0246, code lost:
    
        a(r27, r28, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0249, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024e, code lost:
    
        monitor-enter(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024f, code lost:
    
        r26.f3110f -= r2;
        r26.f3109e -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025e, code lost:
    
        return b(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c3, code lost:
    
        r7 = r1;
        r9 = r3;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0201, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x020c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x020d, code lost:
    
        r4 = r5;
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x021a, code lost:
    
        r21 = false;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0213, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0214, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ab, code lost:
    
        if (com.apm.insight.i.i().isCrashIgnored(r7) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x021d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021e, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0237 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #1 {all -> 0x0262, blocks: (B:100:0x0231, B:102:0x0237), top: B:99:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013b A[Catch: all -> 0x0201, TryCatch #0 {all -> 0x0201, blocks: (B:49:0x0138, B:50:0x013d, B:53:0x015b, B:56:0x0161, B:58:0x0167, B:143:0x013b), top: B:47:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00de A[Catch: all -> 0x020c, TRY_ENTER, TryCatch #6 {all -> 0x020c, blocks: (B:36:0x0103, B:152:0x00de, B:153:0x00e3, B:154:0x00e1), top: B:32:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e1 A[Catch: all -> 0x020c, TryCatch #6 {all -> 0x020c, blocks: (B:36:0x0103, B:152:0x00de, B:153:0x00e3, B:154:0x00e1), top: B:32:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #3 {all -> 0x0204, blocks: (B:41:0x0121, B:42:0x0129, B:44:0x012f), top: B:40:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138 A[Catch: all -> 0x0201, TRY_ENTER, TryCatch #0 {all -> 0x0201, blocks: (B:49:0x0138, B:50:0x013d, B:53:0x015b, B:56:0x0161, B:58:0x0167, B:143:0x013b), top: B:47:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b A[Catch: all -> 0x0201, TryCatch #0 {all -> 0x0201, blocks: (B:49:0x0138, B:50:0x013d, B:53:0x015b, B:56:0x0161, B:58:0x0167, B:143:0x013b), top: B:47:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.apm.insight.a.a] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.apm.insight.g.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Throwable a(java.lang.Thread r27, java.lang.Throwable r28) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    public boolean b(String str) {
        return this.f3111g.containsKey(str);
    }

    private boolean b(Thread thread, Throwable th2) {
        ICrashFilter b3 = i.b().b();
        if (b3 == null) {
            return true;
        }
        try {
            return b3.onJavaCrashFilter(th2, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    public void a(c cVar) {
        this.f3107c = cVar;
    }

    public void a(String str) {
        this.f3111g.put(str, new Object());
    }

    private void a(Thread thread, Throwable th2, boolean z10, long j3) {
        List<IOOMCallback> a10 = o.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a10) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th2, thread, j3, this.f3113k);
                } else {
                    iOOMCallback.onCrash(crashType, th2, thread, j3);
                }
            } catch (Throwable th3) {
                com.apm.insight.l.p.b(th3);
            }
        }
    }

    public void a(Thread thread, Throwable th2, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c10;
        CrashType crashType;
        if (z10) {
            c10 = o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c10 = o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c10) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, u.a(th2), thread, this.f3113k);
                } else {
                    iCrashCallback.onCrash(crashType, u.a(th2), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th3) {
                com.apm.insight.l.p.b(th3);
                aVar.b("callback_err_".concat(iCrashCallback.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public static void a(final Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a a10 = com.apm.insight.entity.a.a(System.currentTimeMillis(), i.g(), (Thread) null, th2);
                        a10.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a11 = f.a().a(CrashType.CUSTOM_JAVA, a10);
                        if (a11 != null) {
                            com.apm.insight.k.d.a().b(a11.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j3) {
        return e.a(j3);
    }
}
