package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
final class zzdaq implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdat zzdatVar = (zzdat) this.zza.get();
        if (zzdatVar != null) {
            zzdatVar.zzq(new zzddq() { // from class: com.google.android.gms.internal.ads.zzdan
                @Override // com.google.android.gms.internal.ads.zzddq
                public final void zza(Object obj) {
                    ((zzdam) obj).zza();
                }
            });
        }
    }
}
