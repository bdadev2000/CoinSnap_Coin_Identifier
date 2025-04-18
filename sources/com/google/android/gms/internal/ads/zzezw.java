package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzezw implements zzexh {
    public zzezw(zzbzr zzbzrVar, zzgfz zzgfzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        final ListenableFuture zzh = zzgfo.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfE)).booleanValue()) {
            zzh = zzgfo.zzh(null);
        }
        final ListenableFuture zzh2 = zzgfo.zzh(null);
        return zzgfo.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzezv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezx((String) ListenableFuture.this.get(), (String) zzh2.get());
            }
        }, zzcan.zza);
    }
}
