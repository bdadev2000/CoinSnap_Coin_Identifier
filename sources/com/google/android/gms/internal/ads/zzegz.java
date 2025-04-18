package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzegz implements zzegq {
    private final Context zza;
    private final zzcqf zzb;
    private final Executor zzc;

    public zzegz(Context context, zzcqf zzcqfVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqfVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, final zzegn zzegnVar) throws zzfhj, zzeki {
        zzcqc zza = this.zzb.zza(new zzctu(zzfgtVar, zzfghVar, zzegnVar.zza), new zzdhc(new zzdik() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // com.google.android.gms.internal.ads.zzdik
            public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
                zzegn zzegnVar2 = zzegn.this;
                try {
                    ((zzfia) zzegnVar2.zzb).zzv(z2);
                    ((zzfia) zzegnVar2.zzb).zzw(context);
                } catch (zzfhj e) {
                    throw new zzdij(e.getCause());
                }
            }
        }, null), new zzcqd(zzfghVar.zzaa));
        zza.zzd().zzo(new zzcof((zzfia) zzegnVar.zzb), this.zzc);
        ((zzeig) zzegnVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(zzfgt zzfgtVar, zzfgh zzfghVar, zzegn zzegnVar) throws zzfhj {
        zzfia zzfiaVar = (zzfia) zzegnVar.zzb;
        zzfhc zzfhcVar = zzfgtVar.zza.zza;
        String jSONObject = zzfghVar.zzv.toString();
        zzfiaVar.zzl(this.zza, zzfhcVar.zzd, jSONObject, (zzbpr) zzegnVar.zzc);
    }
}
