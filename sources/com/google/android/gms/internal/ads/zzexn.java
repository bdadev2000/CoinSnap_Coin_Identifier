package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzexn implements zzexh {
    private final Context zza;
    private final zzgfz zzb;

    public zzexn(Context context, zzgfz zzgfzVar) {
        this.zza = context;
        this.zzb = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return ((Boolean) zzbej.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexn.this.zzc();
            }
        }) : zzgfo.zzh(null);
    }

    public final /* synthetic */ zzexo zzc() throws Exception {
        Context context = this.zza;
        return new zzexo(zzbcf.zzb(context), zzbcf.zza(context));
    }
}
