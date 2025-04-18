package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdfa extends zzdcc {
    public zzdfa(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbd zzbdVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzdex) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd.this);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzdex) obj).zzf(str);
            }
        });
    }
}
