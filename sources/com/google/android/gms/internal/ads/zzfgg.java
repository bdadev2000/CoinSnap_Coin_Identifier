package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfgg implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzffw zzd;
    private final zzfek zze;
    private final zzfhg zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private f4.c zzi;

    public zzfgg(Context context, Executor executor, zzcjd zzcjdVar, zzfek zzfekVar, zzffw zzffwVar, zzfhm zzfhmVar, zzfhg zzfhgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zze = zzfekVar;
        this.zzd = zzffwVar;
        this.zzh = zzfhmVar;
        this.zzf = zzfhgVar;
        this.zzg = zzcjdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdrl zzk(zzfei zzfeiVar) {
        zzdrl zzi = this.zzc.zzi();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zza);
        zzcytVar.zzi(((zzfgf) zzfeiVar).zza);
        zzcytVar.zzh(this.zzf);
        zzi.zzd(zzcytVar.zzj());
        zzi.zzc(new zzdfa().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) throws RemoteException {
        zzfmn zzfmnVar;
        zzbyo zzbyoVar = new zzbyo(zzlVar, str);
        if (zzbyoVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfgg.this.zzi();
                }
            });
            return false;
        }
        f4.c cVar = this.zzi;
        if (cVar != null && !cVar.isDone()) {
            return false;
        }
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfek zzfekVar = this.zze;
            if (zzfekVar.zzd() != null) {
                zzfmn zzh = ((zzdrm) zzfekVar.zzd()).zzh();
                zzh.zzd(zzfmw.FORMAT_REWARDED);
                zzh.zzb(zzbyoVar.zza.zzp);
                zzh.zzg(zzbyoVar.zza.zzm);
                zzfmnVar = zzh;
                zzfil.zza(this.zza, zzbyoVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzbyoVar.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzbyoVar.zza.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                zzfhm zzfhmVar = this.zzh;
                zzfhmVar.zzt(zzbyoVar.zzb);
                zzfhmVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfhmVar.zzH(zzbyoVar.zza);
                zzfhmVar.zzA(zza);
                Context context = this.zza;
                zzfho zzJ = zzfhmVar.zzJ();
                zzfmc zzb = zzfmb.zzb(context, zzfmm.zza(zzJ), zzfmw.FORMAT_REWARDED, zzbyoVar.zza);
                zzfgf zzfgfVar = new zzfgf(null);
                zzfgfVar.zza = zzJ;
                f4.c zzc = this.zze.zzc(new zzfel(zzfgfVar, null), new zzfej() { // from class: com.google.android.gms.internal.ads.zzfga
                    @Override // com.google.android.gms.internal.ads.zzfej
                    public final zzcyr zza(zzfei zzfeiVar) {
                        zzdrl zzk;
                        zzk = zzfgg.this.zzk(zzfeiVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgft.zzr(zzc, new zzfgd(this, zzeprVar, zzfmnVar, zzb, zzfgfVar), this.zzb);
                return true;
            }
        }
        zzfmnVar = null;
        zzfil.zza(this.zza, zzbyoVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            this.zzc.zzl().zzo(true);
        }
        Bundle zza2 = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzbyoVar.zza.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar2 = this.zzh;
        zzfhmVar2.zzt(zzbyoVar.zzb);
        zzfhmVar2.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfhmVar2.zzH(zzbyoVar.zza);
        zzfhmVar2.zzA(zza2);
        Context context2 = this.zza;
        zzfho zzJ2 = zzfhmVar2.zzJ();
        zzfmc zzb2 = zzfmb.zzb(context2, zzfmm.zza(zzJ2), zzfmw.FORMAT_REWARDED, zzbyoVar.zza);
        zzfgf zzfgfVar2 = new zzfgf(null);
        zzfgfVar2.zza = zzJ2;
        f4.c zzc2 = this.zze.zzc(new zzfel(zzfgfVar2, null), new zzfej() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzfej
            public final zzcyr zza(zzfei zzfeiVar) {
                zzdrl zzk;
                zzk = zzfgg.this.zzk(zzfeiVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgft.zzr(zzc2, new zzfgd(this, zzeprVar, zzfmnVar, zzb2, zzfgfVar2), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzj(int i9) {
        this.zzh.zzp().zza(i9);
    }
}
