package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcxy extends zzddr implements com.google.android.gms.ads.internal.client.zza {
    public zzcxy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzcxx
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
