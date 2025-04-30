package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdid extends zzdez {
    private boolean zzb;

    public zzdid(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzdib());
                this.zzb = true;
            }
            zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdic
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzdib());
        this.zzb = true;
    }
}
