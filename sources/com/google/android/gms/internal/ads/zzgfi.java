package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class zzgfi extends zzgfj {
    private final ListenableFuture zza;

    public zzgfi(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh, com.google.android.gms.internal.ads.zzgao
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfj, com.google.android.gms.internal.ads.zzgfh
    public final /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfj
    public final ListenableFuture zzc() {
        return this.zza;
    }
}
