package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdeu extends zzdcc implements zzbki {
    public zzdeu(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zza(final zzbwv zzbwvVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdet
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzbki) obj).zza(zzbwv.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzbki) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final synchronized void zzc() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzder
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzbki) obj).zzc();
            }
        });
    }
}
