package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezo implements zzexh {
    final zzgfz zza;

    public zzezo(zzbbj zzbbjVar, zzgfz zzgfzVar, Context context) {
        this.zza = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezp(new JSONObject());
            }
        });
    }
}
