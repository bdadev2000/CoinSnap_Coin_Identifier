package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfad implements zzexw {
    final zzgge zza;
    final Context zzb;
    final zzbdb zzc;

    public zzfad(zzbdb zzbdbVar, zzgge zzggeVar, Context context) {
        this.zzc = zzbdbVar;
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfae(new JSONObject());
            }
        });
    }
}
