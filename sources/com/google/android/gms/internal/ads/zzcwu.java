package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcwu implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzcwu(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcih) this.zzb).zza();
        final zzfhc zza2 = ((zzcxr) this.zzc).zza();
        return new zzfxq() { // from class: com.google.android.gms.internal.ads.zzcwt
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                zzfgh zzfghVar = (zzfgh) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzfghVar.zzB);
                zzauVar.zzq(zzfghVar.zzC.toString());
                zzauVar.zzo(zza.afmaVersion);
                zzauVar.zzn(zza2.zzf);
                return zzauVar;
            }
        };
    }
}
