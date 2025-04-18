package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdgp;
import com.google.android.gms.internal.ads.zzgfk;

/* loaded from: classes4.dex */
final class zzar implements zzgfk {
    final /* synthetic */ zzdgp zza;

    public zzar(zzdgp zzdgpVar) {
        this.zza = zzdgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbd) obj);
    }
}
