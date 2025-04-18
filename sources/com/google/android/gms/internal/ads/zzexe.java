package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzexe implements zzexh {
    private final zzgfz zza;
    private final Context zzb;

    public zzexe(zzgfz zzgfzVar, Context context) {
        this.zza = zzgfzVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexe.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzexg zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfT));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzexg() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzexg
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
