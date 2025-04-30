package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f15996a = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    static String b = "";

    /* renamed from: c, reason: collision with root package name */
    static boolean f15997c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f15998d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f15999e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f16000f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f16001g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static int f16002h = -1;

    public static int a() {
        Context c9;
        long longValue;
        long currentTimeMillis;
        try {
            c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            longValue = ((Long) al.a(c9, "freeExternalSize", 0L)).longValue();
            currentTimeMillis = System.currentTimeMillis();
        } catch (Throwable th) {
            ad.b("SameSDCardTool", th.getMessage(), th);
        }
        if (currentTimeMillis - longValue <= 1800000) {
            if (f15999e == -1) {
            }
            return f15999e;
        }
        f15999e = Long.valueOf((c() / 1000) / 1000).intValue();
        al.b(c9, "freeExternalSize", Long.valueOf(currentTimeMillis));
        return f15999e;
    }

    public static int b() {
        if (f16002h == -1) {
            try {
                f16002h = new Long((e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                ad.b("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f16002h;
    }

    private static long c() {
        if (d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return 0L;
    }

    private static boolean d() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            ad.b("", "hasSDCard is failed");
            return false;
        }
    }

    private static long e() {
        if (d()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return 0L;
    }

    private static void b(Context context) {
        com.mbridge.msdk.foundation.same.b.e.a(new com.mbridge.msdk.foundation.same.b.d(c(context)));
        com.mbridge.msdk.foundation.same.b.e.a().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (c() > 31457280) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(android.content.Context r6) {
        /*
            r0 = 0
            java.io.File r1 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L14
            java.io.File r1 = a(r1)     // Catch: java.lang.Throwable -> Lc
            goto L15
        Lc:
            r1 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.ad.b(r2, r3, r1)
        L14:
            r1 = r0
        L15:
            boolean r2 = com.mbridge.msdk.foundation.tools.ag.f15997c
            if (r2 == 0) goto L56
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            java.lang.String r3 = "Android"
            java.lang.String r4 = "data"
            x0.AbstractC2914a.j(r1, r2, r3, r2, r4)
            r1.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.io.File r1 = a(r2)
        L4b:
            long r2 = c()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L57
        L56:
            r0 = r1
        L57:
            if (r0 == 0) goto L5f
            boolean r1 = r0.exists()
            if (r1 != 0) goto L67
        L5f:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r0 = r6.getAbsoluteFile()
        L67:
            java.lang.String r6 = r0.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ag.c(android.content.Context):java.lang.String");
    }

    public static void a(Context context) {
        if (context == null || f16000f) {
            return;
        }
        try {
            try {
                b = context.getFilesDir().getAbsolutePath() + File.separator;
                f15997c = false;
                b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            b = context.getFilesDir().getAbsolutePath() + File.separator;
            b(context);
        }
        f16000f = true;
    }

    private static File a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }
}
