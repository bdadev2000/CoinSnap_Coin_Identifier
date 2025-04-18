package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzdgp extends zzddr {
    public zzdgp(Set set) {
        super(set);
    }

    public final synchronized void zza(@Nullable final com.google.android.gms.ads.nonagon.signalgeneration.zzbd zzbdVar) {
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdgn
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((zzdgm) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbd.this);
            }
        });
    }

    public final synchronized void zzb(@Nullable final String str) {
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((zzdgm) obj).zzf(str);
            }
        });
    }
}
