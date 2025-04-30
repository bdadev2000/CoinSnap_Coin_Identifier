package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcx extends zzfzd {
    final Iterator zza;
    final /* synthetic */ zzgcy zzb;

    public zzgcx(zzgcy zzgcyVar) {
        this.zzb = zzgcyVar;
        this.zza = zzgcyVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            Set set = this.zzb.zzb;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
