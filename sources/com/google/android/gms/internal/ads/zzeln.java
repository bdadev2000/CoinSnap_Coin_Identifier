package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzeln implements zzegq {
    private final Context zza;
    private final Executor zzb;
    private final zzdqn zzc;

    public zzeln(Context context, Executor executor, zzdqn zzdqnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqnVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzeln zzelnVar) {
        return zzelnVar.zzb;
    }

    public static final void zze(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) {
        try {
            ((zzfia) zzegnVar.zzb).zzk(zzfgtVar.zza.zza.zzd, zzfghVar.zzv.toString());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegnVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, final zzegn zzegnVar) throws zzfhj, zzeki {
        zzdqj zze = this.zzc.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdqk(new zzdik() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // com.google.android.gms.internal.ads.zzdik
            public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
                zzegn zzegnVar2 = zzegn.this;
                try {
                    ((zzfia) zzegnVar2.zzb).zzv(z2);
                    ((zzfia) zzegnVar2.zzb).zzA();
                } catch (zzfhj e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot show rewarded video.", e);
                    throw new zzdij(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcof((zzfia) zzegnVar.zzb), this.zzb);
        zzczh zze2 = zze.zze();
        zzcxy zzb = zze.zzb();
        ((zzeih) zzegnVar.zzc).zzc(new zzelm(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        if (((zzfia) zzegnVar.zzb).zzC()) {
            zze(zzfgtVar, zzfghVar, zzegnVar);
            return;
        }
        ((zzeih) zzegnVar.zzc).zzd(new zzell(this, zzfgtVar, zzfghVar, zzegnVar));
        Object obj = zzegnVar.zzb;
        Context context = this.zza;
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        ((zzfia) obj).zzh(context, zzfhcVar.zzd, null, (zzbwx) zzegnVar.zzc, zzfghVar.zzv.toString());
    }
}
