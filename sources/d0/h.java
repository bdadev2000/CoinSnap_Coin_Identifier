package d0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import f0.q;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

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

    public static int getColor(@NonNull Context context, int i10) {
        return b.a(context, i10);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f0.k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f0.l lVar = new f0.l(resources, theme);
        synchronized (q.f17535c) {
            SparseArray sparseArray = (SparseArray) q.f17534b.get(lVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (kVar = (f0.k) sparseArray.get(i10)) != null) {
                if (kVar.f17526b.equals(resources.getConfiguration()) && ((theme == null && kVar.f17527c == 0) || (theme != null && kVar.f17527c == theme.hashCode()))) {
                    colorStateList2 = kVar.a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = q.a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z10 = true;
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (i11 < 28 || i11 > 31) {
                z10 = false;
            }
            if (!z10) {
                try {
                    colorStateList = f0.b.a(resources, resources.getXml(i10), theme);
                } catch (Exception e2) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
                }
            }
            if (colorStateList != null) {
                synchronized (q.f17535c) {
                    WeakHashMap weakHashMap = q.f17534b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(lVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(lVar, sparseArray2);
                    }
                    sparseArray2.append(i10, new f0.k(colorStateList, lVar.a.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return f0.j.b(resources, i10, theme);
        }
        return colorStateList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r2 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:
    
        if (r2 == null) goto L33;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context getContextForLanguage(@androidx.annotation.NonNull android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L22
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L1e
            android.os.LocaleList r0 = androidx.core.app.q.a(r0)
            j0.k r1 = new j0.k
            j0.m r2 = new j0.m
            r2.<init>(r0)
            r1.<init>(r2)
            goto L8d
        L1e:
            j0.k r1 = j0.k.f19714b
            goto L8d
        L22:
            java.lang.Object r0 = androidx.core.app.l.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L88 java.lang.Throwable -> Lae
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
        L3a:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            r6 = 1
            if (r5 == r6) goto L63
            r6 = 3
            if (r5 != r6) goto L4a
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            if (r7 <= r4) goto L63
        L4a:
            if (r5 == r6) goto L3a
            r6 = 4
            if (r5 != r6) goto L50
            goto L3a
        L50:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
            if (r5 == 0) goto L3a
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L66 java.lang.Throwable -> L68
        L63:
            if (r2 == 0) goto L74
            goto L71
        L66:
            r8 = move-exception
            goto L82
        L68:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L74
        L71:
            r2.close()     // Catch: java.io.IOException -> L74 java.lang.Throwable -> Lae
        L74:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> Lae
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            goto L89
        L82:
            if (r2 == 0) goto L87
            r2.close()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
        L87:
            throw r8     // Catch: java.lang.Throwable -> Lae
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
        L89:
            j0.k r1 = j0.k.a(r1)
        L8d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto Lad
            boolean r0 = r1.b()
            if (r0 != 0) goto Lad
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r0.<init>(r2)
            j0.f.b(r0, r1)
            android.content.Context r8 = r8.createConfigurationContext(r0)
        Lad:
            return r8
        Lae:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.h.getContextForLanguage(android.content.Context):android.content.Context");
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
    public static Drawable getDrawable(@NonNull Context context, int i10) {
        return a.b(context, i10);
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
        return new j0.h(new Handler(context.getMainLooper()));
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
    public static String getString(@NonNull Context context, int i10) {
        return getContextForLanguage(context).getString(i10);
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
        if (com.bumptech.glide.e.n(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(com.applovin.impl.mediation.ads.e.f("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    @Nullable
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
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
    public static Intent registerReceiver(@NonNull Context context, @Nullable BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if (i14 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if ((i12 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
