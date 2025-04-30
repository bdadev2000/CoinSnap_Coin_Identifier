package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzcby {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzccc zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;

    @Nullable
    private zzbeu zzh;

    @Nullable
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzcbx zzl;
    private final Object zzm;
    private f4.c zzn;
    private final AtomicBoolean zzo;

    public zzcby() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzccc(com.google.android.gms.ads.internal.client.zzay.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzcbx(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzix)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    @Nullable
    public final Context zzd() {
        return this.zze;
    }

    @Nullable
    public final Resources zze() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkQ)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzq.zza(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzq.zza(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot load resource from dynamite apk or local jar", e4);
            return null;
        }
    }

    @Nullable
    public final zzbeu zzg() {
        zzbeu zzbeuVar;
        synchronized (this.zza) {
            zzbeuVar = this.zzh;
        }
        return zzbeuVar;
    }

    public final zzccc zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final f4.c zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcJ)).booleanValue()) {
                synchronized (this.zzm) {
                    try {
                        f4.c cVar = this.zzn;
                        if (cVar != null) {
                            return cVar;
                        }
                        f4.c zzb = zzcci.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcbt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzcby.this.zzo();
                            }
                        });
                        this.zzn = zzb;
                        return zzb;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgft.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() throws Exception {
        Context zza = zzbyf.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i9 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i9 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i9] & 2) != 0) {
                        arrayList.add(strArr[i9]);
                    }
                    i9++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context, VersionInfoParcel versionInfoParcel) {
        zzbeu zzbeuVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzu.zzb().zzc(this.zzc);
                    this.zzb.zzs(this.zze);
                    zzbwj.zzb(this.zze, this.zzf);
                    com.google.android.gms.ads.internal.zzu.zze();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbY)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbeuVar = null;
                    } else {
                        zzbeuVar = new zzbeu();
                    }
                    this.zzh = zzbeuVar;
                    if (zzbeuVar != null) {
                        zzccl.zza(new zzcbu(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzix)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcbv(this));
                            } catch (RuntimeException e4) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to register network callback", e4);
                                this.zzo.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void zzv(Throwable th, String str) {
        zzbwj.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbgt.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbwj.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        zzbwj.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
