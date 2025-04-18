package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcwk extends zzdcc implements com.google.android.gms.ads.internal.client.zza {
    public zzcwk(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwj
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
