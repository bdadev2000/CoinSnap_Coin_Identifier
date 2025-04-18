package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class zzchk implements zzclo {
    private static zzchk zza;

    private static synchronized zzchk zzG(Context context, zzbpg zzbpgVar, int i10, boolean z10, int i11, zzcio zzcioVar) {
        synchronized (zzchk.class) {
            zzchk zzchkVar = zza;
            if (zzchkVar != null) {
                return zzchkVar;
            }
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            zzbcn.zza(context);
            if (((Boolean) zzbef.zze.zze()).booleanValue()) {
                zzbbx.zzd(context);
            }
            zzfgk zzd = zzfgk.zzd(context);
            VersionInfoParcel zzc = zzd.zzc(243799000, false, i11);
            zzd.zzf(zzbpgVar);
            zzcjj zzcjjVar = new zzcjj(null);
            zzchl zzchlVar = new zzchl();
            zzchlVar.zzf(zzc);
            zzchlVar.zze(context);
            zzchlVar.zzd(currentTimeMillis);
            zzcjjVar.zzb(new zzchn(zzchlVar, 0 == true ? 1 : 0));
            zzcjjVar.zzc(new zzcke(zzcioVar));
            zzchk zza2 = zzcjjVar.zza();
            com.google.android.gms.ads.internal.zzv.zzp().zzu(context, zzc);
            com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzl(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzk(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzv.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzv.zzw().zzb(context);
            zza2.zza().zzc();
            zzbyw.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgc)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaF)).booleanValue()) {
                    new zzedc(context, zzc, new zzbbl(new zzbbr(context)), new zzech(new zzecd(context), zza2.zzB())).zzb(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzchk zzb(Context context, zzbpg zzbpgVar, int i10) {
        return zzG(context, zzbpgVar, 243799000, false, i10, new zzcio());
    }

    public abstract zzfma zzA();

    public abstract zzges zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbzo zzE();

    @Override // com.google.android.gms.internal.ads.zzclo
    public final zzbzo zzF() {
        return zzE();
    }

    public abstract com.google.android.gms.ads.internal.util.zzca zza();

    public abstract zzckp zzc();

    public abstract zzcoq zzd();

    public abstract zzcqg zze();

    public abstract zzcze zzf();

    public abstract zzdgm zzg();

    public abstract zzdhi zzh();

    public abstract zzdov zzi();

    public abstract zzdsm zzj();

    public abstract zzdtv zzk();

    public abstract zzdvk zzl();

    public abstract zzdwh zzm();

    public abstract zzeea zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzq();

    @Override // com.google.android.gms.internal.ads.zzclo
    public final zzexc zzr(zzbvx zzbvxVar, int i10) {
        return zzs(new zzeyv(zzbvxVar, i10));
    }

    public abstract zzexc zzs(zzeyv zzeyvVar);

    public abstract zzezt zzt();

    public abstract zzfbh zzu();

    public abstract zzfcy zzv();

    public abstract zzfem zzw();

    public abstract zzfgd zzx();

    public abstract zzfgn zzy();

    public abstract zzfko zzz();
}
