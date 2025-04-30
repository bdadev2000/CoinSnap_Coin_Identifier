package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdhx extends zzdez {
    public zzdhx(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhv
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdhu) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzax.this);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhw
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdhu) obj).zzf(str);
            }
        });
    }
}
