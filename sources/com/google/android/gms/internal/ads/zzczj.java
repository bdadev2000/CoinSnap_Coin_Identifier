package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzczj extends zzdez implements com.google.android.gms.ads.internal.client.zza {
    public zzczj(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
