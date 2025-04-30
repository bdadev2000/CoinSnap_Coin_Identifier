package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn {
    private static volatile zzag zze;
    private static Context zzg;
    static final zzl zza = new zzf(zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzl zzd = new zzi(zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    public static zzx zza(String str, zzj zzjVar, boolean z8, boolean z9) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z8, z9);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static zzx zzb(String str, boolean z8, boolean z9, boolean z10) {
        return zzi(str, z8, false, false, true);
    }

    public static zzx zzc(String str, boolean z8, boolean z9, boolean z10) {
        return zzi(str, z8, false, false, false);
    }

    public static /* synthetic */ String zzd(boolean z8, String str, zzj zzjVar) throws Exception {
        String str2;
        if (!z8 && zzh(str, zzjVar, true, false).zza) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest zza2 = AndroidUtilsLight.zza(Constants.SHA256);
        Preconditions.checkNotNull(zza2);
        return str2 + ": pkg=" + str + ", sha256=" + Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzf())) + ", atk=" + z8 + ", ver=12451000.false";
    }

    public static synchronized void zze(Context context) {
        synchronized (zzn.class) {
            if (zzg == null) {
                if (context != null) {
                    zzg = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static boolean zzf() {
        boolean z8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                z8 = zze.zzg();
            } catch (RemoteException | DynamiteModule.LoadingException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                z8 = false;
            }
            return z8;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static boolean zzg() {
        boolean z8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                z8 = zze.zzi();
            } catch (RemoteException | DynamiteModule.LoadingException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                z8 = false;
            }
            return z8;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static zzx zzh(final String str, final zzj zzjVar, final boolean z8, boolean z9) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                if (zze.zzh(new zzs(str, zzjVar, z8, z9), ObjectWrapper.wrap(zzg.getPackageManager()))) {
                    return zzx.zzb();
                }
                return new zzv(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.zzd(z8, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return zzx.zzd("module call", e4);
            }
        } catch (DynamiteModule.LoadingException e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return zzx.zzd("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static zzx zzi(String str, boolean z8, boolean z9, boolean z10, boolean z11) {
        zzx zzd2;
        zzq zzf2;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z8, false, ObjectWrapper.wrap(zzg), false, true);
                try {
                    if (z11) {
                        zzf2 = zze.zze(zzoVar);
                    } else {
                        zzf2 = zze.zzf(zzoVar);
                    }
                    if (zzf2.zzb()) {
                        zzd2 = zzx.zzf(zzf2.zzc());
                    } else {
                        String zza2 = zzf2.zza();
                        if (zzf2.zzd() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = zzx.zzg(zzf2.zzc(), zzf2.zzd(), zza2, nameNotFoundException);
                    }
                } catch (RemoteException e4) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                    zzd2 = zzx.zzd("module call", e4);
                }
            } catch (DynamiteModule.LoadingException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                zzd2 = zzx.zzd("module init: ".concat(String.valueOf(e9.getMessage())), e9);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zzd2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void zzj() throws DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            try {
                if (zze == null) {
                    zze = zzaf.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
