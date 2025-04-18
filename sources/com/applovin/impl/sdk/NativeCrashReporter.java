package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.zp;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class NativeCrashReporter {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f7568b;

    /* renamed from: c, reason: collision with root package name */
    private static final NativeCrashReporter f7569c = new NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar == null) {
            return;
        }
        if (!((Boolean) kVar.a(oj.A4)).booleanValue() && !zp.i(k.k())) {
            if (f7568b) {
                try {
                    f7569c.disable();
                    return;
                } catch (Throwable th2) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    kVar.B().a("NativeCrashReporter", "disableInstance", th2);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List c10 = kVar.c(oj.B4);
            int[] iArr = new int[c10.size()];
            for (int i10 = 0; i10 < c10.size(); i10++) {
                try {
                    iArr[i10] = Integer.parseInt((String) c10.get(i10));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(k.k().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, kVar);
            } else if (!file.mkdir()) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                f7569c.enable(file.getAbsolutePath(), iArr);
            } catch (Throwable th3) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("NativeCrashReporter", "Failed to enable native crash reporter", th3);
                }
                kVar.B().a("NativeCrashReporter", "enableInstance", th3);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr);

    private static native String symbolicateSource(String str);

    private static boolean a() {
        if (!a) {
            a = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f7568b = true;
            } catch (Throwable th2) {
                t.b("NativeCrashReporter", "Failed to load native crash reporter library", th2);
            }
        }
        return f7568b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:9|(7:11|12|13|14|15|(2:17|(2:19|20)(1:22))(1:23)|21))|36|(1:38)|14|15|(0)(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r11.L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (com.applovin.impl.sdk.t.a() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        r11.L().a("NativeCrashReporter", "Failed to delete native crash report: " + r4.getAbsolutePath(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:15:0x0085, B:17:0x008b, B:19:0x0094), top: B:14:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.io.File r10, com.applovin.impl.sdk.k r11) {
        /*
            java.lang.String r0 = "Failed to delete native crash report: "
            java.io.File[] r10 = r10.listFiles()
            if (r10 != 0) goto L9
            return
        L9:
            int r1 = r10.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto Ld4
            r4 = r10[r3]
            com.applovin.impl.sdk.p r5 = r11.D()
            java.lang.String r5 = r5.e(r4)
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            java.lang.String r7 = "NativeCrashReporter"
            if (r6 == 0) goto L63
            java.lang.String r6 = "@@@@@"
            r8 = 3
            java.lang.String[] r5 = r5.split(r6, r8)
            int r6 = r5.length
            if (r6 != r8) goto L63
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r8 = r5[r2]
            java.lang.String r9 = "error_message"
            r6.put(r9, r8)
            r8 = 1
            r8 = r5[r8]
            java.lang.String r9 = "details"
            r6.put(r9, r8)
            r8 = 2
            r5 = r5[r8]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = symbolicateSource(r5)     // Catch: java.lang.Throwable -> L4f
            com.applovin.impl.sdk.o r8 = r11.B()     // Catch: java.lang.Throwable -> L4f
            com.applovin.impl.sdk.o$b r9 = com.applovin.impl.sdk.o.b.NATIVE_ERROR     // Catch: java.lang.Throwable -> L4f
            r8.a(r9, r5, r6)     // Catch: java.lang.Throwable -> L4f
            goto L85
        L4f:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto L85
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.String r8 = "Failed to symbolicate native crash report"
            r6.a(r7, r8, r5)
            goto L85
        L63:
            r11.L()
            boolean r5 = com.applovin.impl.sdk.t.a()
            if (r5 == 0) goto L85
            com.applovin.impl.sdk.t r5 = r11.L()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to read native crash error report: "
            r6.<init>(r8)
            java.lang.String r8 = r4.getAbsolutePath()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.b(r7, r6)
        L85:
            boolean r5 = r4.delete()     // Catch: java.lang.Throwable -> Laf
            if (r5 != 0) goto Ld0
            r11.L()     // Catch: java.lang.Throwable -> Laf
            boolean r5 = com.applovin.impl.sdk.t.a()     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto Ld0
            com.applovin.impl.sdk.t r5 = r11.L()     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r6.<init>()     // Catch: java.lang.Throwable -> Laf
            r6.append(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Laf
            r6.append(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Laf
            r5.b(r7, r6)     // Catch: java.lang.Throwable -> Laf
            goto Ld0
        Laf:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto Ld0
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r6.a(r7, r4, r5)
        Ld0:
            int r3 = r3 + 1
            goto Lc
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }
}
