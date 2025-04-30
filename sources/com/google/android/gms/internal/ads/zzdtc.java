package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;

/* loaded from: classes2.dex */
public final class zzdtc implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzdtc(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i9;
        Context zza = ((zzcjj) this.zza).zza();
        final String zzb = ((zzdzv) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcjv) this.zzc).zza();
        final zzbdv.zza.EnumC0129zza enumC0129zza = (zzbdv.zza.EnumC0129zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbdm zzbdmVar = new zzbdm(new zzbdu(zza));
        zzbdv.zzar.zza zzd = zzbdv.zzar.zzd();
        zzd.zzg(zza2.buddyApkVersion);
        zzd.zzi(zza2.clientJarVersion);
        if (true != zza2.isClientJar) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        zzd.zzh(i9);
        final zzbdv.zzar zzbr = zzd.zzbr();
        zzbdmVar.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdtb
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                zzbdv.zza.zzb zzcZ = zzaVar.zze().zzcZ();
                zzcZ.zzH(zzbdv.zza.EnumC0129zza.this);
                zzaVar.zzG(zzcZ);
                zzbdv.zzm.zza zzcZ2 = zzaVar.zzg().zzcZ();
                zzcZ2.zzm(zzb);
                zzcZ2.zzw(zzbr);
                zzaVar.zzK(zzcZ2);
                zzaVar.zzO(str);
            }
        });
        return zzbdmVar;
    }
}
