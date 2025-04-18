package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class x {
    public static final x a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f11422b = SetsKt.hashSetOf(m0.DEVELOPER_ERRORS);

    /* renamed from: c, reason: collision with root package name */
    public static Executor f11423c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile String f11424d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile String f11425e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile String f11426f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile Boolean f11427g;

    /* renamed from: h, reason: collision with root package name */
    public static Context f11428h;

    /* renamed from: i, reason: collision with root package name */
    public static int f11429i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f11430j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11431k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f11432l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11433m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f11434n;

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicBoolean f11435o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile String f11436p;

    /* renamed from: q, reason: collision with root package name */
    public static volatile String f11437q;

    /* renamed from: r, reason: collision with root package name */
    public static final n0.h f11438r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f11439s;

    static {
        new AtomicLong(65536L);
        f11429i = 64206;
        f11430j = new ReentrantLock();
        f11431k = "v16.0";
        f11435o = new AtomicBoolean(false);
        f11436p = "instagram.com";
        f11437q = "facebook.com";
        f11438r = new n0.h(24);
    }

    public static final Context a() {
        x5.i.s();
        Context context = f11428h;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        throw null;
    }

    public static final String b() {
        x5.i.s();
        String str = f11424d;
        if (str != null) {
            return str;
        }
        throw new q("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f11430j;
        reentrantLock.lock();
        try {
            if (f11423c == null) {
                f11423c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor = f11423c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = f11431k;
        Intrinsics.checkNotNullExpressionValue(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String e() {
        String str;
        Date date = a.f10880n;
        a n10 = z1.d.n();
        if (n10 != null) {
            str = n10.f10893m;
        } else {
            str = null;
        }
        String str2 = f11437q;
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return StringsKt.s(str2, "facebook.com", "fb.gg");
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return StringsKt.s(str2, "facebook.com", "instagram.com");
            }
            return str2;
        }
        return str2;
    }

    public static final boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        x5.i.s();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        boolean z10;
        synchronized (x.class) {
            z10 = f11439s;
        }
        return z10;
    }

    public static final boolean h() {
        return f11435o.get();
    }

    public static final void i(m0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        synchronized (f11422b) {
        }
    }

    public static final void j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f11424d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.z(lowerCase, "fb")) {
                        String substring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        f11424d = substring;
                    } else {
                        f11424d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new q("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f11425e == null) {
                f11425e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f11426f == null) {
                f11426f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f11429i == 64206) {
                f11429i = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f11427g == null) {
                f11427g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context applicationContext) {
        synchronized (x.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            l(applicationContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x0159, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153 A[Catch: all -> 0x0159, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0012, B:11:0x0021, B:13:0x0028, B:15:0x0030, B:16:0x0037, B:18:0x0047, B:19:0x004e, B:21:0x0062, B:23:0x006a, B:28:0x0076, B:30:0x007a, B:35:0x0086, B:39:0x00a9, B:40:0x00ab, B:42:0x00af, B:44:0x00b3, B:46:0x00b9, B:48:0x00bf, B:49:0x00c7, B:50:0x00cc, B:51:0x00cd, B:53:0x00d9, B:56:0x0137, B:57:0x013c, B:58:0x013d, B:59:0x0142, B:64:0x00a3, B:65:0x0143, B:66:0x014a, B:68:0x014b, B:69:0x0152, B:71:0x0153, B:72:0x0158, B:61:0x0096), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void l(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.x.l(android.content.Context):void");
    }
}
