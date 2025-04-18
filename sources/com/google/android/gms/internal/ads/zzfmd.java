package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzfmd implements Runnable {

    @GuardedBy
    @VisibleForTesting
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdrr zzj;
    private final List zzk;
    private final zzbwi zzm;

    @VisibleForTesting
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    @GuardedBy
    private final zzfmj zzg = zzfmm.zzc();
    private String zzh = "";

    @GuardedBy
    private boolean zzl = false;

    public zzfmd(Context context, VersionInfoParcel versionInfoParcel, zzdrr zzdrrVar, zzede zzedeVar, zzbwi zzbwiVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdrrVar;
        this.zzm = zzbwiVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzit)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzgax.zzn();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbek.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbek.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                booleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzaV = ((zzfmm) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzedd(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzedb((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzin), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzdye) && ((zzdye) e).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzflt zzfltVar) {
        zzcan.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmc
            @Override // java.lang.Runnable
            public final void run() {
                zzfmd.this.zzc(zzfltVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzflt zzfltVar) {
        synchronized (zzd) {
            try {
                if (!this.zzl) {
                    this.zzl = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzu.zzp();
                            this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzio)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlv)).booleanValue()) {
                            long j2 = intValue;
                            zzcan.zzd.scheduleWithFixedDelay(this, j2, j2, TimeUnit.MILLISECONDS);
                        } else {
                            long j3 = intValue;
                            zzcan.zzd.scheduleAtFixedRate(this, j3, j3, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfltVar != null) {
            synchronized (zzc) {
                try {
                    if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzip)).intValue()) {
                        return;
                    }
                    zzfmf zza2 = zzfmh.zza();
                    zza2.zzu(zzfltVar.zzm());
                    zza2.zzq(zzfltVar.zzl());
                    zza2.zzg(zzfltVar.zzb());
                    zza2.zzw(3);
                    zza2.zzn(this.zzf.afmaVersion);
                    zza2.zzb(this.zzh);
                    zza2.zzk(Build.VERSION.RELEASE);
                    zza2.zzr(Build.VERSION.SDK_INT);
                    zza2.zzv(zzfltVar.zzo());
                    zza2.zzj(zzfltVar.zza());
                    zza2.zze(this.zzi);
                    zza2.zzt(zzfltVar.zzn());
                    zza2.zzc(zzfltVar.zze());
                    zza2.zzf(zzfltVar.zzg());
                    zza2.zzh(zzfltVar.zzh());
                    zza2.zzi(this.zzj.zzb(zzfltVar.zzh()));
                    zza2.zzl(zzfltVar.zzi());
                    zza2.zzm(zzfltVar.zzd());
                    zza2.zzd(zzfltVar.zzf());
                    zza2.zzs(zzfltVar.zzk());
                    zza2.zzo(zzfltVar.zzj());
                    zza2.zzp(zzfltVar.zzc());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzit)).booleanValue()) {
                        zza2.zza(this.zzk);
                    }
                    zzfmj zzfmjVar = this.zzg;
                    zzfmk zza3 = zzfml.zza();
                    zza3.zza(zza2);
                    zzfmjVar.zzb(zza3);
                } finally {
                }
            }
        }
    }
}
