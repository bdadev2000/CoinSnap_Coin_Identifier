package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class zzcho implements zzcnc {
    private static zzcho zza;

    private static synchronized zzcho zzE(Context context, zzbpl zzbplVar, int i2, boolean z2, int i3, zzcis zzcisVar) {
        synchronized (zzcho.class) {
            try {
                zzcho zzchoVar = zza;
                if (zzchoVar != null) {
                    return zzchoVar;
                }
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbcv.zza(context);
                if (((Boolean) zzbej.zze.zze()).booleanValue()) {
                    zzbcf.zzd(context);
                }
                zzfhy zzd = zzfhy.zzd(context);
                VersionInfoParcel zzc = zzd.zzc(243220000, false, i3);
                zzd.zzf(zzbplVar);
                zzckg zzckgVar = new zzckg(null);
                zzchp zzchpVar = new zzchp();
                zzchpVar.zzf(zzc);
                zzchpVar.zze(context);
                zzchpVar.zzd(currentTimeMillis);
                zzckgVar.zzb(new zzchr(zzchpVar, null));
                zzckgVar.zzc(new zzclt(zzcisVar));
                zzcho zza2 = zzckgVar.zza();
                com.google.android.gms.ads.internal.zzu.zzo().zzu(context, zzc);
                com.google.android.gms.ads.internal.zzu.zzc().zzi(context);
                com.google.android.gms.ads.internal.zzu.zzp().zzl(context);
                com.google.android.gms.ads.internal.zzu.zzp().zzk(context);
                com.google.android.gms.ads.internal.util.zzd.zza(context);
                com.google.android.gms.ads.internal.zzu.zzb().zzd(context);
                com.google.android.gms.ads.internal.zzu.zzv().zzb(context);
                zza2.zza().zzc();
                zzbza.zzd(context);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfX)).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaC)).booleanValue()) {
                        new zzeel(context, zzc, new zzbbu(new zzbca(context)), new zzedq(new zzedm(context), zza2.zzB())).zzb(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
                    }
                }
                zza = zza2;
                return zza2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzcho zzb(Context context, zzbpl zzbplVar, int i2) {
        return zzE(context, zzbplVar, 243220000, false, i2, new zzcis());
    }

    public abstract zzfnp zzA();

    public abstract zzgfz zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract com.google.android.gms.ads.internal.util.zzcb zza();

    public abstract zzcmd zzc();

    public abstract zzcqe zzd();

    public abstract zzcru zze();

    public abstract zzdat zzf();

    public abstract zzdib zzg();

    public abstract zzdix zzh();

    public abstract zzdqm zzi();

    public abstract zzdud zzj();

    public abstract zzdvm zzk();

    public abstract zzdxb zzl();

    public abstract zzdxy zzm();

    public abstract zzefj zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzw zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzap zzq();

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final zzeyk zzr(zzbwa zzbwaVar, int i2) {
        return zzs(new zzfaj(zzbwaVar, i2));
    }

    public abstract zzeyk zzs(zzfaj zzfajVar);

    public abstract zzfbh zzt();

    public abstract zzfcv zzu();

    public abstract zzfem zzv();

    public abstract zzfga zzw();

    public abstract zzfhr zzx();

    public abstract zzfib zzy();

    public abstract zzfmd zzz();
}
