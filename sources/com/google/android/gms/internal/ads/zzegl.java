package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public final class zzegl implements zzegk {

    @VisibleForTesting
    public final zzegk zza;
    private final zzfxq zzb;

    public zzegl(zzegk zzegkVar, zzfxq zzfxqVar) {
        this.zza = zzegkVar;
        this.zzb = zzfxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final ListenableFuture zza(zzfgt zzfgtVar, zzfgh zzfghVar) {
        return zzgfo.zzm(this.zza.zza(zzfgtVar, zzfghVar), this.zzb, zzcan.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfgt zzfgtVar, zzfgh zzfghVar) {
        return this.zza.zzb(zzfgtVar, zzfghVar);
    }
}
