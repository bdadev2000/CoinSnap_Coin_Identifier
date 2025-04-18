package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdfg extends zzdcc {
    private boolean zzb;

    public zzdfg(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdfe());
            this.zzb = true;
        }
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdff
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzq(new zzdfe());
        this.zzb = true;
    }
}
