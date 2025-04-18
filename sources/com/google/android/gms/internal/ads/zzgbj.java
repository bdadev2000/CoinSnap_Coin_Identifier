package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgbj extends zzfxp {
    final Iterator zza;
    final /* synthetic */ zzgbk zzb;

    public zzgbj(zzgbk zzgbkVar) {
        this.zzb = zzgbkVar;
        this.zza = zzgbkVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
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
