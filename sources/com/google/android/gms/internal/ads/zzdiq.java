package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzdiq implements zzhkp {
    private final zzdik zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzdiq(zzdik zzdikVar, zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzdikVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
        this.zzd = zzhlgVar3;
        this.zze = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final VersionInfoParcel zza = ((zzcjv) this.zzc).zza();
        final zzfgt zza2 = ((zzcvg) this.zzd).zza();
        final zzfho zza3 = ((zzczc) this.zze).zza();
        return new zzdha(new zzdaz() { // from class: com.google.android.gms.internal.ads.zzdii
            @Override // com.google.android.gms.internal.ads.zzdaz
            public final void zzs() {
                com.google.android.gms.ads.internal.zzu.zzs().zzn(context, zza.afmaVersion, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzcci.zzf);
    }
}
