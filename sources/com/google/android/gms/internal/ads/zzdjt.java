package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class zzdjt implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzdjt(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfu((Context) this.zza.zzb(), new HashSet(), ((zzctv) this.zzb).zza());
    }
}
