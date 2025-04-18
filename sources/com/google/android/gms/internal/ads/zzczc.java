package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class zzczc implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcze zzczeVar = (zzcze) this.zza.get();
        if (zzczeVar != null) {
            zzczeVar.zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcza
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) {
                    ((zzcyy) obj).zzb();
                }
            });
        }
    }
}
