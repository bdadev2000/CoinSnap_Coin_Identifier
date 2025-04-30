package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzgbj extends zzfzd {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfyh zzb;

    public zzgbj(Iterator it, zzfyh zzfyhVar) {
        this.zza = it;
        this.zzb = zzfyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfyh zzfyhVar = this.zzb;
            Object next = it.next();
            if (zzfyhVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
