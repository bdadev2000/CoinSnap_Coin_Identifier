package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzepz implements zzeps {
    private final zzfhm zza;
    private final zzcjd zzb;
    private final Context zzc;
    private final zzepp zzd;
    private final zzfmq zze;

    @Nullable
    private zzcve zzf;

    public zzepz(zzcjd zzcjdVar, Context context, zzepp zzeppVar, zzfhm zzfhmVar) {
        this.zzb = zzcjdVar;
        this.zzc = context;
        this.zzd = zzeppVar;
        this.zza = zzfhmVar;
        this.zze = zzcjdVar.zzz();
        zzfhmVar.zzv(zzeppVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        zzcve zzcveVar = this.zzf;
        if (zzcveVar != null && zzcveVar.zzf()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws RemoteException {
        zzfmn zzfmnVar;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzH(this.zzc) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepu
                @Override // java.lang.Runnable
                public final void run() {
                    zzepz.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepv
                @Override // java.lang.Runnable
                public final void run() {
                    zzepz.this.zzg();
                }
            });
            return false;
        }
        zzfil.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i9 = ((zzept) zzepqVar).zza;
        Bundle zza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zza;
        zzfhmVar.zzH(zzlVar);
        zzfhmVar.zzA(zza);
        zzfhmVar.zzC(i9);
        Context context = this.zzc;
        zzfho zzJ = zzfhmVar.zzJ();
        zzfmu zza2 = zzfmm.zza(zzJ);
        zzfmw zzfmwVar = zzfmw.FORMAT_NATIVE;
        zzfmc zzb = zzfmb.zzb(context, zza2, zzfmwVar, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzJ.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdkc zzh = this.zzb.zzh();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zzc);
        zzcytVar.zzi(zzJ);
        zzh.zzf(zzcytVar.zzj());
        zzdfa zzdfaVar = new zzdfa();
        zzdfaVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzh.zze(zzdfaVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcsc(null));
        zzdkd zzh2 = zzh.zzh();
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfmn zzf = zzh2.zzf();
            zzf.zzd(zzfmwVar);
            zzf.zzb(zzlVar.zzp);
            zzf.zzg(zzlVar.zzm);
            zzfmnVar = zzf;
        } else {
            zzfmnVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        ScheduledExecutorService zzC = this.zzb.zzC();
        zzcvx zza3 = zzh2.zza();
        zzcve zzcveVar = new zzcve(zzggeVar, zzC, zza3.zzi(zza3.zzj()));
        this.zzf = zzcveVar;
        zzcveVar.zze(new zzepy(this, zzeprVar, zzfmnVar, zzb, zzh2));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfiq.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfiq.zzd(6, null, null));
    }
}
