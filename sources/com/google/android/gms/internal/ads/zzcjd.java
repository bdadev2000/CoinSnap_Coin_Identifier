package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public abstract class zzcjd implements zzcoq {
    private static zzcjd zza;

    private static synchronized zzcjd zzD(Context context, zzbrf zzbrfVar, int i9, boolean z8, int i10, zzcki zzckiVar) {
        synchronized (zzcjd.class) {
            try {
                zzcjd zzcjdVar = zza;
                if (zzcjdVar != null) {
                    return zzcjdVar;
                }
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbep.zza(context);
                if (((Boolean) zzbgc.zze.zze()).booleanValue()) {
                    zzbdz.zzd(context);
                }
                zzfik zzd = zzfik.zzd(context);
                VersionInfoParcel zzc = zzd.zzc(241806000, false, i10);
                zzd.zzf(zzbrfVar);
                zzclw zzclwVar = new zzclw(null);
                zzcje zzcjeVar = new zzcje();
                zzcjeVar.zzf(zzc);
                zzcjeVar.zze(context);
                zzcjeVar.zzd(currentTimeMillis);
                zzclwVar.zzb(new zzcjg(zzcjeVar, null));
                zzclwVar.zzc(new zzcnj(zzckiVar));
                zzcjd zza2 = zzclwVar.zza();
                com.google.android.gms.ads.internal.zzu.zzo().zzu(context, zzc);
                com.google.android.gms.ads.internal.zzu.zzc().zzi(context);
                com.google.android.gms.ads.internal.zzu.zzp().zzl(context);
                com.google.android.gms.ads.internal.zzu.zzp().zzk(context);
                com.google.android.gms.ads.internal.util.zzd.zza(context);
                com.google.android.gms.ads.internal.zzu.zzb().zzd(context);
                com.google.android.gms.ads.internal.zzu.zzv().zzb(context);
                zza2.zza().zzc();
                zzcav.zzd(context);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaw)).booleanValue()) {
                        new zzefm(context, zzc, new zzbdm(new zzbdu(context)), new zzeer(new zzeen(context), zza2.zzA())).zzb(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
                    }
                }
                zza = zza2;
                return zza2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzcjd zzb(Context context, zzbrf zzbrfVar, int i9) {
        return zzD(context, zzbrfVar, 241806000, false, i9, new zzcki());
    }

    public abstract zzgge zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcf zza();

    public abstract zzcnt zzc();

    public abstract zzcrs zzd();

    public abstract zzctf zze();

    public abstract zzdca zzf();

    public abstract zzdjg zzg();

    public abstract zzdkc zzh();

    public abstract zzdrl zzi();

    public abstract zzdvc zzj();

    public abstract zzdwl zzk();

    public abstract zzdya zzl();

    public abstract zzdyx zzm();

    public abstract zzegk zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzk zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaj zzq();

    @Override // com.google.android.gms.internal.ads.zzcoq
    public final zzeyv zzr(zzbxu zzbxuVar, int i9) {
        return zzs(new zzfay(zzbxuVar, i9));
    }

    public abstract zzeyv zzs(zzfay zzfayVar);

    public abstract zzfbt zzt();

    public abstract zzfdh zzu();

    public abstract zzfey zzv();

    public abstract zzfgm zzw();

    public abstract zzfid zzx();

    public abstract zzfin zzy();

    public abstract zzfmq zzz();
}
