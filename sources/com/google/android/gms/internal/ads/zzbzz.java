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

/* loaded from: classes3.dex */
public final class zzbzz {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcad zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;

    @Nullable
    private zzbcs zzh;

    @Nullable
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzx zzl;
    private final Object zzm;
    private ua.b zzn;
    private final AtomicBoolean zzo;

    public zzbzz() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcad(com.google.android.gms.ads.internal.client.zzbc.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzx(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzib)).booleanValue()) {
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkA)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzq.zza(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzq.zza(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    @Nullable
    public final zzbcs zzg() {
        zzbcs zzbcsVar;
        synchronized (this.zza) {
            zzbcsVar = this.zzh;
        }
        return zzbcsVar;
    }

    public final zzcad zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final ua.b zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcV)).booleanValue()) {
                synchronized (this.zzm) {
                    ua.b bVar = this.zzn;
                    if (bVar != null) {
                        return bVar;
                    }
                    ua.b zzb = zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbzz.this.zzo();
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgei.zzh(new ArrayList());
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
        Context zza = zzbwh.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
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
        zzbcs zzbcsVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzv.zzb().zzc(this.zzc);
                this.zzb.zzp(this.zze);
                zzbuj.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzv.zze();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcd)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcsVar = null;
                } else {
                    zzbcsVar = new zzbcs();
                }
                this.zzh = zzbcsVar;
                if (zzbcsVar != null) {
                    zzcam.zza(new zzbzv(this).zzb(), "AppState.registerCsiReporter");
                }
                Context context2 = this.zze;
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzib)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzw(this));
                        } catch (RuntimeException e2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to register network callback", e2);
                            this.zzo.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void zzv(Throwable th2, String str) {
        zzbuj.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzbew.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th2, String str) {
        zzbuj.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzx(Throwable th2, String str) {
        zzbuj.zzd(this.zze, this.zzf).zzh(th2, str);
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
