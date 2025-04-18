package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzfzv extends zzfxp {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfwr zzb;

    public zzfzv(Iterator it, zzfwr zzfwrVar) {
        this.zza = it;
        this.zzb = zzfwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfwr zzfwrVar = this.zzb;
            Object next = it.next();
            if (zzfwrVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
