package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzevz implements zzexh {
    private final String zza;
    private final String zzb;

    public zzevz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(new zzewa(this.zza, this.zzb));
    }
}
