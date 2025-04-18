package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdea extends zzdcc implements zzdec {
    public zzdea(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzt() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzddz
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzdec) obj).zzt();
            }
        });
    }
}
