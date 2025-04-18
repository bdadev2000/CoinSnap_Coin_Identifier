package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzeoe implements zzdal {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zza.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfdm.zza(this.zza, new zzfdl() { // from class: com.google.android.gms.internal.ads.zzeod
            @Override // com.google.android.gms.internal.ads.zzfdl
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
    }
}
