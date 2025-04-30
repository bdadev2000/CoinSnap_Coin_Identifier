package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.FragmentTransaction;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.i;
import com.apm.insight.l.e;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.p;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static a f5784a = null;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f5785i = false;

    /* renamed from: j, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f5786j = new ThreadLocal<>();
    private static ArrayList<b> l = new ArrayList<>();
    private Thread.UncaughtExceptionHandler b;

    /* renamed from: c, reason: collision with root package name */
    private c f5787c;

    /* renamed from: d, reason: collision with root package name */
    private c f5788d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f5789e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f5790f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f5791g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f5792h = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f5793k;

    private a() {
        d();
    }

    private static int a(Throwable th, Thread thread) {
        int i9 = 0;
        for (int i10 = 0; i10 < l.size(); i10++) {
            try {
                try {
                    i9 |= l.get(i10).a(th, thread);
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            } catch (Throwable unused) {
            }
        }
        return i9;
    }

    private static Throwable b(Throwable th, Thread thread) {
        for (int i9 = 0; i9 < l.size(); i9++) {
            try {
                try {
                    l.get(i9).b(th, thread);
                } catch (Throwable th2) {
                    return th2;
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
        } catch (Throwable th3) {
            return th3;
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
                        com.apm.insight.entity.a a6 = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a6 != null) {
                            com.apm.insight.k.d.a().b(a6.h());
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
            this.b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f5790f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f5790f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    private void f() {
        File a6 = o.a(i.g());
        File a9 = o.a();
        if (com.apm.insight.l.i.b(a6) && com.apm.insight.l.i.b(a9)) {
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
    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }

    public static a a() {
        if (f5784a == null) {
            f5784a = new a();
        }
        return f5784a;
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || r.a(512)) {
            return;
        }
        this.b.uncaughtException(thread, th);
    }

    public void b(c cVar) {
        this.f5788d = cVar;
    }

    private String a(File file, boolean z8, Throwable th, String str, Thread thread, boolean z9) {
        String absolutePath = file.getAbsolutePath();
        this.f5792h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z9) {
            int h6 = NativeImpl.h(absolutePath);
            if (h6 > 0) {
                try {
                    NativeImpl.a(h6, com.apm.insight.l.a.c(i.g()));
                    NativeImpl.a(h6, "\n");
                    NativeImpl.a(h6, th.getMessage());
                    NativeImpl.a(h6, "\n");
                    NativeImpl.a(h6, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.a(h6, ": ");
                        NativeImpl.a(h6, th.getMessage());
                    }
                    NativeImpl.a(h6, "\n");
                    NativeImpl.a(h6, thread.getName());
                    NativeImpl.a(h6, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h6, "stack:");
                    NativeImpl.a(h6, "\n");
                } catch (Throwable unused3) {
                }
                v.a(th, h6);
                NativeImpl.b(h6);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (r.a(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.insight.l.a.c(i.g()) + "\n").getBytes());
                fileOutputStream.write((th.getMessage() + "\n").getBytes());
                fileOutputStream.write((th + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                } catch (Throwable th2) {
                    try {
                        if (r.a(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (r.a(FragmentTransaction.TRANSIT_EXIT_MASK)) {
                    throw new RuntimeException("test exception npth write stack");
                }
                str2 = v.a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1

                    /* renamed from: a, reason: collision with root package name */
                    boolean f5794a = false;

                    @Override // com.apm.insight.l.e.a
                    public boolean a(String str3) {
                        if (!this.f5794a && str3.contains("android.os.Looper.loop")) {
                            this.f5794a = true;
                        }
                        return !this.f5794a;
                    }
                } : new e.a());
                k.a(fileOutputStream);
                k.a(fileOutputStream);
            } catch (Throwable unused6) {
            }
        }
        return str2;
    }

    public static boolean b() {
        return f5785i;
    }

    public static boolean c() {
        Boolean bool = f5786j.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:7|(1:9)|10|(2:11|12)|(3:185|186|(34:188|15|16|(2:179|180)(2:18|19)|20|21|22|23|24|(20:(2:165|166)|27|28|29|31|(1:159)(4:33|(1:35)(1:157)|36|37)|38|(1:155)(3:41|42|43)|44|(1:46)|48|49|(1:51)(1:149)|52|53|(2:58|(6:60|61|62|63|64|(4:(1:74)(2:68|69)|70|71|72)(4:75|204|80|81)))|135|(3:138|139|(5:143|144|145|64|(0)(0)))|137|(0)(0))|171|28|29|31|(16:159|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(3:55|58|(0))|135|(0)|137|(0)(0))|33|(0)(0)|36|37|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(0)|135|(0)|137|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|171|28|29|31|(0)|33|(0)(0)|36|37|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(0)|135|(0)|137|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(1:9)|10|11|12|(3:185|186|(34:188|15|16|(2:179|180)(2:18|19)|20|21|22|23|24|(20:(2:165|166)|27|28|29|31|(1:159)(4:33|(1:35)(1:157)|36|37)|38|(1:155)(3:41|42|43)|44|(1:46)|48|49|(1:51)(1:149)|52|53|(2:58|(6:60|61|62|63|64|(4:(1:74)(2:68|69)|70|71|72)(4:75|204|80|81)))|135|(3:138|139|(5:143|144|145|64|(0)(0)))|137|(0)(0))|171|28|29|31|(16:159|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(3:55|58|(0))|135|(0)|137|(0)(0))|33|(0)(0)|36|37|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(0)|135|(0)|137|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|171|28|29|31|(0)|33|(0)(0)|36|37|38|(0)|155|44|(0)|48|49|(0)(0)|52|53|(0)|135|(0)|137|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024e, code lost:
    
        a(r27, r28, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0251, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0256, code lost:
    
        monitor-enter(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0257, code lost:
    
        r26.f5790f -= r2;
        r26.f5789e -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0266, code lost:
    
        return b(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x014a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00da, code lost:
    
        r4 = r5;
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00df, code lost:
    
        r21 = false;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0219, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00ab, code lost:
    
        if (com.apm.insight.i.i().isCrashIgnored(r7) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0221, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0222, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        com.apm.insight.l.q.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0244, code lost:
    
        if (r19 != false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x014d A[Catch: all -> 0x014a, TryCatch #6 {all -> 0x014a, blocks: (B:51:0x0147, B:52:0x014f, B:55:0x016d, B:58:0x0173, B:149:0x014d), top: B:49:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00e3 A[Catch: all -> 0x00d9, TryCatch #16 {all -> 0x00d9, blocks: (B:35:0x00d4, B:37:0x00e6, B:38:0x0109, B:157:0x00e3), top: B:31:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4 A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #16 {all -> 0x00d9, blocks: (B:35:0x00d4, B:37:0x00e6, B:38:0x0109, B:157:0x00e3), top: B:31:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #7 {all -> 0x012b, blocks: (B:43:0x0127, B:44:0x0138, B:46:0x013e), top: B:42:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147 A[Catch: all -> 0x014a, TRY_ENTER, TryCatch #6 {all -> 0x014a, blocks: (B:51:0x0147, B:52:0x014f, B:55:0x016d, B:58:0x0173, B:149:0x014d), top: B:49:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d A[Catch: all -> 0x014a, TryCatch #6 {all -> 0x014a, blocks: (B:51:0x0147, B:52:0x014f, B:55:0x016d, B:58:0x0173, B:149:0x014d), top: B:49:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023c A[Catch: all -> 0x0240, TRY_LEAVE, TryCatch #0 {all -> 0x0240, blocks: (B:93:0x0236, B:95:0x023c), top: B:92:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244  */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.apm.insight.a.a] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.apm.insight.g.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Throwable a(java.lang.Thread r27, java.lang.Throwable r28) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    public boolean b(String str) {
        return this.f5791g.containsKey(str);
    }

    private boolean b(Thread thread, Throwable th) {
        ICrashFilter b = i.b().b();
        if (b == null) {
            return true;
        }
        try {
            return b.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    public void a(c cVar) {
        this.f5787c = cVar;
    }

    public void a(String str) {
        this.f5791g.put(str, new Object());
    }

    private void a(Thread thread, Throwable th, boolean z8, long j7) {
        List<IOOMCallback> a6 = com.apm.insight.runtime.o.a().a();
        CrashType crashType = z8 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a6) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th, thread, j7, this.f5793k);
                } else {
                    iOOMCallback.onCrash(crashType, th, thread, j7);
                }
            } catch (Throwable th2) {
                q.b(th2);
            }
        }
    }

    public void a(Thread thread, Throwable th, boolean z8, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c9;
        CrashType crashType;
        if (z8) {
            c9 = com.apm.insight.runtime.o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c9 = com.apm.insight.runtime.o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c9) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, v.a(th), thread, this.f5793k);
                } else {
                    iCrashCallback.onCrash(crashType, v.a(th), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                q.b(th2);
                aVar.b("callback_err_".concat(iCrashCallback.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public static void a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a a6 = com.apm.insight.entity.a.a(System.currentTimeMillis(), i.g(), (Thread) null, th);
                        a6.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a9 = f.a().a(CrashType.CUSTOM_JAVA, a6);
                        if (a9 != null) {
                            com.apm.insight.k.d.a().b(a9.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j7) {
        return e.a(j7);
    }
}
