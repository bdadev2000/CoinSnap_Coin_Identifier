package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzeoy implements zzeor {
    private final zzfha zza;
    private final zzcho zzb;
    private final Context zzc;
    private final zzeoo zzd;
    private final zzfmd zze;

    @Nullable
    private zzctt zzf;

    public zzeoy(zzcho zzchoVar, Context context, zzeoo zzeooVar, zzfha zzfhaVar) {
        this.zzb = zzchoVar;
        this.zzc = context;
        this.zzd = zzeooVar;
        this.zza = zzfhaVar;
        this.zze = zzchoVar.zzz();
        zzfhaVar.zzv(zzeooVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
        zzctt zzcttVar = this.zzf;
        return zzcttVar != null && zzcttVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeop zzeopVar, zzeoq zzeoqVar) throws RemoteException {
        zzfma zzfmaVar;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeot
                @Override // java.lang.Runnable
                public final void run() {
                    zzeoy.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeou
                @Override // java.lang.Runnable
                public final void run() {
                    zzeoy.this.zzg();
                }
            });
            return false;
        }
        zzfhz.zza(this.zzc, zzmVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue() && zzmVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i2 = ((zzeos) zzeopVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        String zza = zzdtm.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdto.zza(new Pair(zza, valueOf), new Pair(zzdtm.DYNAMITE_ENTER.zza(), valueOf));
        zzfha zzfhaVar = this.zza;
        zzfhaVar.zzH(zzmVar);
        zzfhaVar.zzA(zza2);
        zzfhaVar.zzC(i2);
        Context context = this.zzc;
        zzfhc zzJ = zzfhaVar.zzJ();
        zzflp zzb = zzflo.zzb(context, zzflz.zzf(zzJ), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcm zzcmVar = zzJ.zzn;
        if (zzcmVar != null) {
            this.zzd.zzd().zzm(zzcmVar);
        }
        zzdix zzh = this.zzb.zzh();
        zzcxi zzcxiVar = new zzcxi();
        zzcxiVar.zze(this.zzc);
        zzcxiVar.zzi(zzJ);
        zzh.zzf(zzcxiVar.zzj());
        zzdds zzddsVar = new zzdds();
        zzddsVar.zzk(this.zzd.zzd(), this.zzb.zzC());
        zzh.zze(zzddsVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcqo(null));
        zzdiy zzg = zzh.zzg();
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            zzfma zzf = zzg.zzf();
            zzf.zzi(8);
            zzf.zzb(zzmVar.zzp);
            zzf.zzf(zzmVar.zzm);
            zzfmaVar = zzf;
        } else {
            zzfmaVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzcho zzchoVar = this.zzb;
        zzgfz zzc = zzfkb.zzc();
        ScheduledExecutorService zzD = zzchoVar.zzD();
        zzcum zza3 = zzg.zza();
        zzctt zzcttVar = new zzctt(zzc, zzD, zza3.zzi(zza3.zzj()));
        this.zzf = zzcttVar;
        zzcttVar.zze(new zzeox(this, zzeoqVar, zzfmaVar, zzb, zzg));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfie.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfie.zzd(6, null, null));
    }
}
