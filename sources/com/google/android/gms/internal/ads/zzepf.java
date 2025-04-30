package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzepf implements zzdbw {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfdy.zza(this.zza, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzepe
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
