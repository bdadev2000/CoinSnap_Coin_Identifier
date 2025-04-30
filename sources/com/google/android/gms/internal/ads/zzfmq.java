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

/* loaded from: classes2.dex */
public final class zzfmq implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdsq zzj;
    private final List zzk;
    private final zzeef zzm;
    private final zzbyd zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfnh zzg = zzfnk.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfmq(Context context, VersionInfoParcel versionInfoParcel, zzdsq zzdsqVar, zzeef zzeefVar, zzbyd zzbydVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdsqVar;
        this.zzm = zzeefVar;
        this.zzn = zzbydVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziQ)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzgbc.zzm();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        boolean z8;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (!((Boolean) zzbgd.zzb.zze()).booleanValue()) {
                        zzb = Boolean.FALSE;
                    } else {
                        if (Math.random() < ((Double) zzbgd.zza.zze()).doubleValue()) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zzb = Boolean.valueOf(z8);
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
                            zzaV = ((zzfnk) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzeee(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(new zzeec((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziK), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                    } catch (Exception e4) {
                        if ((e4 instanceof zzdzd) && ((zzdzd) e4).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfmg zzfmgVar) {
        zzcci.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmp
            @Override // java.lang.Runnable
            public final void run() {
                zzfmq.this.zzc(zzfmgVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfmg zzfmgVar) {
        synchronized (zzd) {
            try {
                if (!this.zzl) {
                    this.zzl = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzu.zzp();
                            this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                        } catch (RemoteException e4) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziL)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlP)).booleanValue()) {
                            long j7 = intValue;
                            zzcci.zzd.scheduleWithFixedDelay(this, j7, j7, TimeUnit.MILLISECONDS);
                        } else {
                            long j9 = intValue;
                            zzcci.zzd.scheduleAtFixedRate(this, j9, j9, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfmgVar != null) {
            synchronized (zzc) {
                try {
                    if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziM)).intValue()) {
                        return;
                    }
                    zzfms zza2 = zzfnf.zza();
                    zza2.zzk(zzfmgVar.zzd());
                    zza2.zzu(zzfmgVar.zzo());
                    zza2.zzh(zzfmgVar.zzb());
                    zza2.zzn(zzfna.OS_ANDROID);
                    zza2.zzr(this.zzf.afmaVersion);
                    zza2.zzb(this.zzh);
                    zza2.zzo(Build.VERSION.RELEASE);
                    zza2.zzv(Build.VERSION.SDK_INT);
                    zza2.zzm(zzfmgVar.zzf());
                    zza2.zzl(zzfmgVar.zza());
                    zza2.zzf(this.zzi);
                    zza2.zze(zzfmgVar.zze());
                    zza2.zzc(zzfmgVar.zzh());
                    zza2.zzg(zzfmgVar.zzj());
                    zza2.zzi(zzfmgVar.zzk());
                    zza2.zzj(this.zzj.zzb(zzfmgVar.zzk()));
                    zza2.zzp(zzfmgVar.zzl());
                    zza2.zzq(zzfmgVar.zzg());
                    zza2.zzd(zzfmgVar.zzi());
                    zza2.zzw(zzfmgVar.zzn());
                    zza2.zzs(zzfmgVar.zzm());
                    zza2.zzt(zzfmgVar.zzc());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziQ)).booleanValue()) {
                        zza2.zza(this.zzk);
                    }
                    zzfnh zzfnhVar = this.zzg;
                    zzfni zza3 = zzfnj.zza();
                    zza3.zza(zza2);
                    zzfnhVar.zzb(zza3);
                } finally {
                }
            }
        }
    }
}
