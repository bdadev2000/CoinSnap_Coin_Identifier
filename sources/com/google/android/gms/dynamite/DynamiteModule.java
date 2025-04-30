package com.google.android.gms.dynamite;

import W1.D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @Nullable
    private static Boolean zzb = null;

    @Nullable
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;

    @Nullable
    private static Boolean zzf;

    @Nullable
    private static zzq zzk;

    @Nullable
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {

        @Nullable
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes2.dex */
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z8) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        VersionPolicy.SelectionResult selectModule;
        DynamiteModule zzc2;
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z8;
        IObjectWrapper zze2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = zzg;
            zzn zznVar = (zzn) threadLocal.get();
            zzn zznVar2 = new zzn(null);
            threadLocal.set(zznVar2);
            ThreadLocal threadLocal2 = zzh;
            Long l = (Long) threadLocal2.get();
            long longValue = l.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                selectModule = versionPolicy.selectModule(context, str, zzi);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + selectModule.localVersion + " and remote module " + str + ":" + selectModule.remoteVersion);
                int i9 = selectModule.selection;
                if (i9 != 0) {
                    if (i9 == -1) {
                        if (selectModule.localVersion != 0) {
                            i9 = -1;
                        }
                    }
                    if (i9 != 1 || selectModule.remoteVersion != 0) {
                        if (i9 == -1) {
                            zzc2 = zzc(applicationContext, str);
                        } else if (i9 == 1) {
                            try {
                                int i10 = selectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (zzf(context)) {
                                            bool = zzb;
                                        } else {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = zzl;
                                            }
                                            if (zzrVar != null) {
                                                zzn zznVar3 = (zzn) threadLocal.get();
                                                if (zznVar3 != null && zznVar3.zza != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = zznVar3.zza;
                                                    ObjectWrapper.wrap(null);
                                                    synchronized (DynamiteModule.class) {
                                                        if (zze >= 2) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                    }
                                                    if (z8) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i10, ObjectWrapper.wrap(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i10, ObjectWrapper.wrap(cursor));
                                                    }
                                                    Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            zzq zzg2 = zzg(context);
                                            if (zzg2 != null) {
                                                int zze3 = zzg2.zze();
                                                if (zze3 >= 3) {
                                                    zzn zznVar4 = (zzn) threadLocal.get();
                                                    if (zznVar4 != null) {
                                                        zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i10, ObjectWrapper.wrap(zznVar4.zza));
                                                    } else {
                                                        throw new LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (zze3 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i10);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i10);
                                                }
                                                Object unwrap = ObjectWrapper.unwrap(zzh2);
                                                if (unwrap != null) {
                                                    dynamiteModule = new DynamiteModule((Context) unwrap);
                                                } else {
                                                    throw new LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        zzc2 = dynamiteModule;
                                    } else {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                } catch (RemoteException e4) {
                                    throw new LoadingException("Failed to load remote module.", e4, null);
                                } catch (LoadingException e9) {
                                    throw e9;
                                } catch (Throwable th2) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e10) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                int i11 = selectModule.localVersion;
                                if (i11 != 0 && versionPolicy.selectModule(context, str, new zzo(i11, 0)).selection == -1) {
                                    zzc2 = zzc(applicationContext, str);
                                } else {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e10, null);
                                }
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i9, null);
                        }
                        if (longValue == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l);
                        }
                        Cursor cursor2 = zznVar2.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        zzg.set(zznVar);
                        return zzc2;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
            } catch (Throwable th3) {
                th = th3;
                zznVar = zznVar;
                if (longValue == 0) {
                    zzh.remove();
                } else {
                    zzh.set(l);
                }
                Cursor cursor3 = zznVar2.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zznVar);
                throw th;
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01bf -> B:24:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c1 -> B:24:0x01c4). Please report as a decompilation issue!!! */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z8) {
        Field declaredField;
        Throwable th;
        RemoteException e4;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int i9 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e9) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e9.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!zzf(context)) {
                                return 0;
                            }
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzb2 = zzb(context, str, z8, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    D.c();
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    zza2 = D.b(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    zza2 = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(zza2);
                                            declaredField.set(null, zza2);
                                            zzb = bool2;
                                            return zzb2;
                                        }
                                        return zzb2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzb = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z8, false);
                    } catch (LoadingException e10) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                        return 0;
                    }
                }
                zzq zzg2 = zzg(context);
                try {
                    if (zzg2 != null) {
                        try {
                            int zze2 = zzg2.zze();
                            if (zze2 >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar != null && (cursor = zznVar.zza) != null) {
                                    i9 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z8, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                if (i10 <= 0 || !zze(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i9 = i10;
                                            }
                                        } catch (RemoteException e11) {
                                            e4 = e11;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i9;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (zze2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i9 = zzg2.zzg(ObjectWrapper.wrap(context), str, z8);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i9 = zzg2.zzf(ObjectWrapper.wrap(context), str, z8);
                            }
                        } catch (RemoteException e12) {
                            e4 = e12;
                        }
                    }
                    return i9;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zzb(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar != null && zznVar.zza == null) {
            zznVar.zza = cursor;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z8 = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z8 = true;
            }
            zzf = Boolean.valueOf(z8);
            if (z8 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z8) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z8;
    }

    @Nullable
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, null);
        }
    }
}
