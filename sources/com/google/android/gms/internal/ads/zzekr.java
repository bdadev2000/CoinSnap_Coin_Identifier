package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzekr implements zzegq {
    private final Context zza;
    private final Executor zzb;
    private final zzdqn zzc;

    public zzekr(Context context, Executor executor, zzdqn zzdqnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, final zzegn zzegnVar) throws zzfhj, zzeki {
        zzdqj zze = this.zzc.zze(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdqk(new zzdik() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // com.google.android.gms.internal.ads.zzdik
            public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
                zzegn zzegnVar2 = zzegn.this;
                try {
                    ((zzfia) zzegnVar2.zzb).zzv(z2);
                    ((zzfia) zzegnVar2.zzb).zzz(context);
                } catch (zzfhj e) {
                    throw new zzdij(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcof((zzfia) zzegnVar.zzb), this.zzb);
        ((zzeig) zzegnVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        try {
            zzfhc zzfhcVar = zzfgtVar.zza.zza;
            if (zzfhcVar.zzo.zza == 3) {
                ((zzfia) zzegnVar.zzb).zzr(this.zza, zzfhcVar.zzd, zzfghVar.zzv.toString(), (zzbpr) zzegnVar.zzc);
            } else {
                ((zzfia) zzegnVar.zzb).zzq(this.zza, zzfhcVar.zzd, zzfghVar.zzv.toString(), (zzbpr) zzegnVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzegnVar.zza)), e);
        }
    }
}
