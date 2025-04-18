package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcxw implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;
    private final zzhja zzc;

    public zzcxw(zzcxv zzcxvVar, zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3, zzhja zzhjaVar4) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
        this.zzc = zzhjaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel zza = ((zzcih) this.zzb).zza();
        zzfgh zza2 = ((zzctv) this.zzc).zza();
        zzbyg zzbygVar = new zzbyg();
        zzbyh zzbyhVar = zza2.zzA;
        if (zzbyhVar == null) {
            return null;
        }
        zzfgm zzfgmVar = zza2.zzs;
        return new zzbyf(context, zza, zzbyhVar, zzfgmVar == null ? null : zzfgmVar.zzb, zzbygVar);
    }
}
