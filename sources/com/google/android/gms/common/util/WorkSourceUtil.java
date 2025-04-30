package com.google.android.gms.common.util;

import I.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:55|56|7|8|9|10|11|12|13|(13:47|48|16|(10:42|43|19|(7:37|38|22|(7:28|29|30|31|32|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0046, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0036, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 0
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L16
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Method r3 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r3 = r2
        L17:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r3
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == 0) goto L2c
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2c
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> L2c
            goto L2d
        L2c:
            r0 = r2
        L2d:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
            r0 = r2
        L37:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.String r0 = "get"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L46
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L46
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> L46
            goto L47
        L46:
            r0 = r2
        L47:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L5c
            java.lang.String r0 = "getName"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5c
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L5c
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> L5c
            goto L5d
        L5c:
            r0 = r2
        L5d:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r3 = "WorkSourceUtil"
            if (r0 == 0) goto L74
            java.lang.String r0 = "createWorkChain"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L6e
            goto L75
        L6e:
            r0 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r3, r5, r0)
        L74:
            r0 = r2
        L75:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L96
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = "addNode"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L90
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r4}     // Catch: java.lang.Exception -> L90
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch: java.lang.Exception -> L90
            goto L97
        L90:
            r0 = move-exception
            java.lang.String r4 = "Missing WorkChain class"
            android.util.Log.w(r3, r4, r0)
        L96:
            r0 = r2
        L97:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Laa
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> Laa
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lab
            goto Lab
        Laa:
            r0 = r2
        Lab:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@NonNull WorkSource workSource, int i9, @NonNull String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i9), str);
                return;
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i9));
            } catch (Exception e9) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackage(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i9 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i9, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i9 = -1;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i9 = applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i9 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 != null && (method = zzh) != null) {
                try {
                    Object invoke = method2.invoke(workSource, null);
                    int i10 = zza;
                    if (i9 != i10) {
                        method.invoke(invoke, Integer.valueOf(i9), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i10), str2);
                } catch (Exception e4) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e4);
                }
            } else {
                add(workSource, i9, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @KeepForSdk
    public static int get(@NonNull WorkSource workSource, int i9) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i9));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return 0;
            }
        }
        return 0;
    }

    @NonNull
    @KeepForSdk
    public static String getName(@NonNull WorkSource workSource, int i9) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i9));
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return null;
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static List<String> getNames(@NonNull WorkSource workSource) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            size = 0;
        } else {
            size = size(workSource);
        }
        if (size != 0) {
            for (int i9 = 0; i9 < size; i9++) {
                String name = getName(workSource, i9);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@NonNull Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z8 = false;
            if (context == null) {
                return false;
            }
            if (h.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z8 = true;
            }
            zzj = Boolean.valueOf(z8);
            return z8;
        }
    }

    @KeepForSdk
    public static boolean isEmpty(@NonNull WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e4) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e4);
            }
        }
        if (size(workSource) == 0) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static int size(@NonNull WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return 0;
            }
        }
        return 0;
    }
}
