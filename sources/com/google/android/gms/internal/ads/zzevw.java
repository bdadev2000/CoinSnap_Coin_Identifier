package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzevw implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzevw(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevw.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzevy zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfY));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzevy() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
