package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcys extends zzddr {
    private boolean zzb;

    public zzcys(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((zzcyu) obj).zzr();
            }
        });
        this.zzb = true;
    }
}
