package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcb;

/* loaded from: classes3.dex */
public final class zzdsd implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;
    private final zzhja zzd;
    private final zzhja zze;

    public zzdsd(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4, zzhja zzhjaVar5) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
        this.zzd = zzhjaVar4;
        this.zze = zzhjaVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzchu) this.zza).zza();
        final String zzb = ((zzdyu) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcih) this.zzc).zza();
        final zzbcb.zza.EnumC0122zza enumC0122zza = (zzbcb.zza.EnumC0122zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbu zzbbuVar = new zzbbu(new zzbca(zza));
        zzbcb.zzar.zza zzd = zzbcb.zzar.zzd();
        zzd.zzg(zza2.buddyApkVersion);
        zzd.zzi(zza2.clientJarVersion);
        zzd.zzh(true != zza2.isClientJar ? 2 : 0);
        final zzbcb.zzar zzbr = zzd.zzbr();
        zzbbuVar.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                zzbcb.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbM.zzH(zzbcb.zza.EnumC0122zza.this);
                zzaVar.zzG(zzbM);
                zzbcb.zzm.zza zzbM2 = zzaVar.zzg().zzbM();
                zzbM2.zzm(zzb);
                zzbM2.zzw(zzbr);
                zzaVar.zzK(zzbM2);
                zzaVar.zzO(str);
            }
        });
        return zzbbuVar;
    }
}
