package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzgj implements zzgc {
    private final Context zza;
    private final zzgc zzb;

    public zzgj(Context context) {
        zzgl zzglVar = new zzgl();
        this.zza = context.getApplicationContext();
        this.zzb = zzglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final /* bridge */ /* synthetic */ zzgd zza() {
        return new zzgk(this.zza, ((zzgl) this.zzb).zza());
    }
}
