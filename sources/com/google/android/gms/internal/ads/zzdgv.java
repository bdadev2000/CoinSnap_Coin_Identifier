package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzdgv extends zzddr {
    private boolean zzb;

    public zzdgv(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdgr
            @Override // com.google.android.gms.internal.ads.zzddq
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzdgt());
                this.zzb = true;
            }
            zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdgu
                @Override // com.google.android.gms.internal.ads.zzddq
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzdgt());
        this.zzb = true;
    }
}
