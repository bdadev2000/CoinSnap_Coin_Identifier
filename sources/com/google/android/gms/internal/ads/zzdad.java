package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdad extends zzdez {
    private boolean zzb;

    public zzdad(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdac
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(Object obj) {
                    ((zzdaf) obj).zzr();
                }
            });
            this.zzb = true;
        }
    }
}
