package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.internal.AbstractC1839h;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f13801a = new Object();
    public static final HashSet b = com.bumptech.glide.d.N(H.f13414g);

    /* renamed from: c, reason: collision with root package name */
    public static Executor f13802c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile String f13803d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile String f13804e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile String f13805f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Boolean f13806g;

    /* renamed from: h, reason: collision with root package name */
    public static Context f13807h;

    /* renamed from: i, reason: collision with root package name */
    public static int f13808i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f13809j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f13810k;
    public static boolean l;
    public static boolean m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f13811n;

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicBoolean f13812o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile String f13813p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile String f13814q;

    /* renamed from: r, reason: collision with root package name */
    public static final A4.a f13815r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f13816s;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.r, java.lang.Object] */
    static {
        new AtomicLong(65536L);
        f13808i = 64206;
        f13809j = new ReentrantLock();
        f13810k = "v16.0";
        f13812o = new AtomicBoolean(false);
        f13813p = "instagram.com";
        f13814q = "facebook.com";
        f13815r = new A4.a(15);
    }

    public static final Context a() {
        AbstractC1839h.k();
        Context context = f13807h;
        if (context != null) {
            return context;
        }
        G7.j.k("applicationContext");
        throw null;
    }

    public static final String b() {
        AbstractC1839h.k();
        String str = f13803d;
        if (str != null) {
            return str;
        }
        throw new C1849l("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f13809j;
        reentrantLock.lock();
        try {
            if (f13802c == null) {
                f13802c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f13802c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        String str = f13810k;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        String str;
        Date date = C0785a.f13439n;
        C0785a m2 = com.facebook.appevents.g.m();
        if (m2 != null) {
            str = m2.m;
        } else {
            str = null;
        }
        String str2 = f13814q;
        if (str != null) {
            if (str.equals("gaming")) {
                return O7.o.A(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return O7.o.A(str2, "facebook.com", "instagram.com");
            }
            return str2;
        }
        return str2;
    }

    public static final boolean f(Context context) {
        AbstractC1839h.k();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        boolean z8;
        synchronized (r.class) {
            z8 = f13816s;
        }
        return z8;
    }

    public static final void h(H h6) {
        G7.j.e(h6, "behavior");
        synchronized (b) {
        }
    }

    public static final void i(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            G7.j.d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f13803d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    G7.j.d(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    G7.j.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (O7.o.C(lowerCase, "fb", false)) {
                        String substring = str.substring(2);
                        G7.j.d(substring, "(this as java.lang.String).substring(startIndex)");
                        f13803d = substring;
                    } else {
                        f13803d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new C1849l("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f13804e == null) {
                f13804e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f13805f == null) {
                f13805f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f13808i == 64206) {
                f13808i = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f13806g == null) {
                f13806g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void j(Context context) {
        synchronized (r.class) {
            G7.j.e(context, "applicationContext");
            k(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x001b, B:13:0x0022, B:15:0x002a, B:16:0x0031, B:18:0x003a, B:19:0x0041, B:21:0x0053, B:23:0x005a, B:25:0x0060, B:27:0x0064, B:29:0x006a, B:33:0x008e, B:34:0x0090, B:36:0x0094, B:38:0x0098, B:40:0x009e, B:42:0x00a4, B:43:0x00af, B:44:0x00b4, B:45:0x00b5, B:47:0x00c1, B:50:0x0135, B:51:0x013a, B:52:0x013b, B:53:0x0140, B:58:0x0088, B:59:0x0141, B:60:0x0148, B:61:0x0149, B:62:0x0150, B:63:0x0151, B:64:0x0156, B:55:0x007b), top: B:3:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void k(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.r.k(android.content.Context):void");
    }
}
