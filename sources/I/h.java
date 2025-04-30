package I;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.AbstractC0408i;
import androidx.core.app.AbstractC0415p;
import androidx.core.app.NotificationManagerCompat;
import java.io.File;
import java.util.concurrent.Executor;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class h {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    @NonNull
    public static Context createAttributionContext(@NonNull Context context, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.a(context, str);
        }
        return context;
    }

    @Nullable
    public static Context createDeviceProtectedStorageContext(@NonNull Context context) {
        return c.a(context);
    }

    @Nullable
    public static String getAttributionTag(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    @NonNull
    public static File getCodeCacheDir(@NonNull Context context) {
        return a.a(context);
    }

    public static int getColor(@NonNull Context context, int i9) {
        return b.a(context, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f1628c == r8.hashCode()) goto L21;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList getColorStateList(@androidx.annotation.NonNull android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            K.l r1 = new K.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = K.o.f1633c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = K.o.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            K.k r5 = (K.k) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f1628c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb9
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f1628c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f1627a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            goto Lb8
        L55:
            java.lang.ThreadLocal r2 = K.o.f1632a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = K.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb4
            java.lang.Object r2 = K.o.f1633c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = K.o.b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb2
        La1:
            K.k r0 = new K.k     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f1629a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            r3 = r4
            goto Lb8
        Lb2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb4:
            android.content.res.ColorStateList r3 = K.j.b(r0, r9, r8)
        Lb8:
            return r3
        Lb9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I.h.getColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    @NonNull
    public static Context getContextForLanguage(@NonNull Context context) {
        P.l a6;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            Object systemService = context.getSystemService("locale");
            if (systemService != null) {
                a6 = new P.l(new P.m(AbstractC0415p.a(systemService)));
            } else {
                a6 = P.l.b;
            }
        } else {
            a6 = P.l.a(AbstractC0408i.f(context));
        }
        if (i9 <= 32 && !a6.f2264a.f2265a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            P.f.b(configuration, a6);
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    @Nullable
    public static File getDataDir(@NonNull Context context) {
        return c.b(context);
    }

    @NonNull
    public static Display getDisplayOrDefault(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.c(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, int i9) {
        return a.b(context, i9);
    }

    @NonNull
    public static File[] getExternalCacheDirs(@NonNull Context context) {
        return context.getExternalCacheDirs();
    }

    @NonNull
    public static File[] getExternalFilesDirs(@NonNull Context context, @Nullable String str) {
        return context.getExternalFilesDirs(str);
    }

    @NonNull
    public static Executor getMainExecutor(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(context);
        }
        return new P.h(new Handler(context.getMainLooper()), 0);
    }

    @Nullable
    public static File getNoBackupFilesDir(@NonNull Context context) {
        return a.c(context);
    }

    @NonNull
    public static File[] getObbDirs(@NonNull Context context) {
        return context.getObbDirs();
    }

    @NonNull
    public static String getString(@NonNull Context context, int i9) {
        return getContextForLanguage(context).getString(i9);
    }

    @Nullable
    public static <T> T getSystemService(@NonNull Context context, @NonNull Class<T> cls) {
        return (T) b.b(context, cls);
    }

    @Nullable
    public static String getSystemServiceName(@NonNull Context context, @NonNull Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (z2.i.e(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC2914a.e("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i9) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i9);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i9) {
        int i10 = i9 & 1;
        if (i10 != 0 && (i9 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i10 != 0) {
            i9 |= 2;
        }
        int i11 = i9;
        int i12 = i11 & 2;
        if (i12 == 0 && (i11 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i12 != 0 && (i11 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i11);
        }
        if (i13 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i11);
        }
        if ((i11 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
