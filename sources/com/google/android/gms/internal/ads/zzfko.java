package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfko implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdqa zzj;
    private final List zzk;
    private final zzbwf zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfkt zzg = zzfkx.zzb();
    private String zzh = "";
    private boolean zzl = false;

    public zzfko(Context context, VersionInfoParcel versionInfoParcel, zzdqa zzdqaVar, zzebv zzebvVar, zzbwf zzbwfVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdqaVar;
        this.zzm = zzbwfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziv)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfzo.zzn();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        boolean z10;
        synchronized (zza) {
            if (zzb == null) {
                if (!((Boolean) zzbeg.zzb.zze()).booleanValue()) {
                    zzb = Boolean.FALSE;
                } else {
                    if (Math.random() < ((Double) zzbeg.zza.zze()).doubleValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzb = Boolean.valueOf(z10);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzaV = ((zzfkx) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzebu(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzebs((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzip), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                } catch (Exception e2) {
                    if ((e2 instanceof zzdwn) && ((zzdwn) e2).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfke zzfkeVar) {
        zzcaj.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkn
            @Override // java.lang.Runnable
            public final void run() {
                zzfko.this.zzc(zzfkeVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfke zzfkeVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzv.zzq();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzp(this.zze);
                    } catch (RemoteException | RuntimeException e2) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziq)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlB)).booleanValue()) {
                        long j3 = intValue;
                        zzcaj.zzd.scheduleWithFixedDelay(this, j3, j3, TimeUnit.MILLISECONDS);
                    } else {
                        long j10 = intValue;
                        zzcaj.zzd.scheduleAtFixedRate(this, j10, j10, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfkeVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzir)).intValue()) {
                    return;
                }
                zzfkp zza2 = zzfks.zza();
                zza2.zzu(zzfkeVar.zzm());
                zza2.zzq(zzfkeVar.zzl());
                zza2.zzg(zzfkeVar.zzb());
                zza2.zzw(3);
                zza2.zzn(this.zzf.afmaVersion);
                zza2.zzb(this.zzh);
                zza2.zzk(Build.VERSION.RELEASE);
                zza2.zzr(Build.VERSION.SDK_INT);
                zza2.zzv(zzfkeVar.zzo());
                zza2.zzj(zzfkeVar.zza());
                zza2.zze(this.zzi);
                zza2.zzt(zzfkeVar.zzn());
                zza2.zzc(zzfkeVar.zze());
                zza2.zzf(zzfkeVar.zzg());
                zza2.zzh(zzfkeVar.zzh());
                zza2.zzi(this.zzj.zzb(zzfkeVar.zzh()));
                zza2.zzl(zzfkeVar.zzi());
                zza2.zzm(zzfkeVar.zzd());
                zza2.zzd(zzfkeVar.zzf());
                zza2.zzs(zzfkeVar.zzk());
                zza2.zzo(zzfkeVar.zzj());
                zza2.zzp(zzfkeVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziv)).booleanValue()) {
                    zza2.zza(this.zzk);
                }
                zzfkt zzfktVar = this.zzg;
                zzfku zza3 = zzfkv.zza();
                zza3.zza(zza2);
                zzfktVar.zzb(zza3);
            }
        }
    }
}
