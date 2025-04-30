package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.b.f;
import com.apm.insight.b.g;
import com.apm.insight.i;
import com.apm.insight.l.o;
import com.apm.insight.l.u;
import com.apm.insight.l.x;
import java.io.File;

/* loaded from: classes.dex */
public class NativeImpl {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f5945a = false;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5946c = true;

    public static int a(int i9) {
        if (f5945a && i9 >= 0) {
            try {
                return doLock("", i9);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static int b() {
        if (f5945a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static int c(String str) {
        if (f5945a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void d(String str) {
        if (f5945a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static native boolean doCheckNativeCrash();

    @Keep
    private static native void doCloseFile(int i9);

    @Keep
    private static native int doCreateCallbackThread();

    @Keep
    private static native void doDump(String str);

    @Keep
    private static native void doDumpFds(String str);

    @Keep
    private static native void doDumpHprof(String str);

    @Keep
    private static native void doDumpLogcat(String str, String str2, String str3);

    @Keep
    private static native void doDumpMaps(String str);

    @Keep
    private static native void doDumpMemInfo(String str);

    @Keep
    private static native void doDumpThreads(String str);

    @Keep
    private static native long doGetAppCpuTime();

    @Keep
    private static native long doGetChildCpuTime();

    @Keep
    private static native String doGetCrashHeader(String str);

    @Keep
    private static native long doGetDeviceCpuTime();

    @Keep
    private static native int doGetFDCount();

    @Keep
    private static native String[] doGetFdDump(int i9, int i10, int[] iArr, String[] strArr);

    @Keep
    private static native long doGetFreeMemory();

    @Keep
    private static native long doGetThreadCpuTime(int i9);

    @Keep
    private static native int doGetThreadsCount();

    @Keep
    private static native long doGetTotalMemory();

    @Keep
    private static native long doGetVMSize();

    @Keep
    private static native void doInitThreadDump();

    @Keep
    private static native int doLock(String str, int i9);

    @Keep
    private static native int doOpenFile(String str);

    @Keep
    private static native void doRebuildTombstone(String str, String str2, String str3);

    @Keep
    private static native void doSetAlogConfigPath(String str);

    @Keep
    private static native void doSetAlogFlushAddr(long j7);

    @Keep
    private static native void doSetAlogLogDirAddr(long j7);

    @Keep
    private static native void doSetResendSigQuit(int i9);

    @Keep
    private static native void doSetUploadEnd();

    @Keep
    private static native void doSignalMainThread();

    @Keep
    private static native int doStart(int i9, String str, String str2, String str3, int i10);

    @Keep
    private static native void doStartAnrMonitor(int i9);

    @Keep
    private static native void doWriteFile(int i9, String str, int i10);

    public static void e(String str) {
        if (f5945a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void f() {
        x.a(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    NativeImpl.l();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.c.a(th, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor");
    }

    public static void g(String str) {
        if (f5945a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static int h(String str) {
        if (!f5945a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Keep
    private static void handleNativeCrash(String str) {
        b.onNativeCrash(str);
    }

    public static void i() {
        if (f5945a) {
            doSetUploadEnd();
        }
    }

    @Keep
    private static native boolean is64Bit();

    public static void j() {
        if (f5945a) {
            doInitThreadDump();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        if (f5945a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            i.j();
            f.b(true);
            com.apm.insight.b.d.b();
            g.a(i.g()).a().e();
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (f5945a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void b(int i9) {
        if (f5945a) {
            try {
                doCloseFile(i9);
            } catch (Throwable unused) {
            }
        }
    }

    public static long c(int i9) {
        if (f5945a) {
            return doGetThreadCpuTime(i9);
        }
        return 0L;
    }

    public static boolean d() {
        if (!f5945a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean e() {
        if (!f5945a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void f(String str) {
        if (f5945a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean g() {
        return f5946c;
    }

    public static void h() {
        if (f5945a) {
            doSignalMainThread();
        }
    }

    public static void i(String str) {
        if (f5945a) {
            doDump(str);
        }
    }

    public static void a(int i9, String str) {
        if (f5945a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i9, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j7) {
        if (f5945a) {
            try {
                doSetAlogFlushAddr(j7);
            } catch (Throwable unused) {
            }
        }
    }

    public static void c() {
    }

    public static void a(long j7) {
    }

    public static void b(String str) {
        if (f5945a) {
            doDumpHprof(str);
        }
    }

    public static void c(long j7) {
        if (f5945a) {
            try {
                doSetAlogLogDirAddr(j7);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(File file) {
        if (f5945a) {
            doRebuildTombstone(o.c(file).getAbsolutePath(), o.b(file).getAbsolutePath(), o.d(file).getAbsolutePath());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (f5945a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(boolean z8) {
        f5946c = z8;
        if (f5945a) {
            doSetResendSigQuit(z8 ? 1 : 0);
        }
    }

    public static boolean a() {
        if (b) {
            return f5945a;
        }
        b = true;
        if (!f5945a) {
            f5945a = u.a("apminsighta");
        }
        return f5945a;
    }

    public static boolean a(@NonNull Context context) {
        String a6;
        boolean a9 = a();
        if (a9) {
            String str = o.j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                a6 = context.getApplicationInfo().nativeLibraryDir;
            } else {
                a6 = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, a6, str, i.f(), i.l());
        }
        return a9;
    }
}
