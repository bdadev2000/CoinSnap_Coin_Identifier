package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class zzdbz implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdca zzdcaVar = (zzdca) this.zza.get();
        if (zzdcaVar != null) {
            zzdcaVar.zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdbx
                @Override // com.google.android.gms.internal.ads.zzdey
                public final void zza(Object obj) {
                    ((zzdcb) obj).zza();
                }
            });
        }
    }
}
