package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbs;

/* loaded from: classes3.dex */
public final class zzdqm implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzdqm(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i10;
        Context zza = ((zzchq) this.zza).zza();
        final String zzb = ((zzdxj) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcid) this.zzc).zza();
        final zzbbs.zza.EnumC0141zza enumC0141zza = (zzbbs.zza.EnumC0141zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbl zzbblVar = new zzbbl(new zzbbr(zza));
        zzbbs.zzar.zza zzd = zzbbs.zzar.zzd();
        zzd.zzg(zza2.buddyApkVersion);
        zzd.zzi(zza2.clientJarVersion);
        if (true != zza2.isClientJar) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        zzd.zzh(i10);
        final zzbbs.zzar zzbr = zzd.zzbr();
        zzbblVar.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdql
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzbbs.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbM.zzH(zzbbs.zza.EnumC0141zza.this);
                zzaVar.zzG(zzbM);
                zzbbs.zzm.zza zzbM2 = zzaVar.zzg().zzbM();
                zzbM2.zzm(zzb);
                zzbM2.zzw(zzbr);
                zzaVar.zzK(zzbM2);
                zzaVar.zzO(str);
            }
        });
        return zzbblVar;
    }
}
