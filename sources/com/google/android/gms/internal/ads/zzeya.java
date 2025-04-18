package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeya implements zzevz {
    final zzges zza;

    public zzeya(zzbba zzbbaVar, zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyb(new JSONObject());
            }
        });
    }
}
