package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzeeb implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzeeb(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.gms.internal.ads.zzezl] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzezj, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzhlg zzhlgVar = this.zzc;
        ?? zzb = this.zzb.zzb();
        ?? zzb2 = zzhlgVar.zzb();
        zzeef zzeefVar = new zzeef();
        zzeei zzb3 = ((zzeej) this.zze).zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzeea(zza, zzb, zzb2, zzeefVar, zzb3, zzggeVar, new zzbyd());
    }
}
