package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes4.dex */
public final class zzdhj implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;

    public zzdhj(zzdhc zzdhcVar, zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcih) this.zzb).zza();
        final zzfgh zza2 = ((zzctv) this.zzc).zza();
        final zzfhc zza3 = ((zzcxr) this.zzd).zza();
        return new zzdfs(new zzczo() { // from class: com.google.android.gms.internal.ads.zzdha
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzs = com.google.android.gms.ads.internal.zzu.zzs();
                Context context2 = context;
                zzfhc zzfhcVar = zza3;
                zzs.zzn(context2, zza.afmaVersion, zza2.zzC.toString(), zzfhcVar.zzf);
            }
        }, zzcan.zzf);
    }
}
