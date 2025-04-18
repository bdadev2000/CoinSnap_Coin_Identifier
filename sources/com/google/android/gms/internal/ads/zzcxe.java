package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcxe extends zzdcc {
    private boolean zzb;

    public zzcxe(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcxd
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) {
                    ((zzcxg) obj).zzr();
                }
            });
            this.zzb = true;
        }
    }
}
