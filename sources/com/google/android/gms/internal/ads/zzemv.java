package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzemv implements zzcyx {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zza.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfby.zza(this.zza, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemu
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
    }
}
