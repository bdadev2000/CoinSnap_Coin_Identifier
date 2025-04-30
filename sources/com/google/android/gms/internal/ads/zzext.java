package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzext implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzext(zzgge zzggeVar, Context context) {
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzext.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzexv zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgo));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzexv() { // from class: com.google.android.gms.internal.ads.zzexs
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
