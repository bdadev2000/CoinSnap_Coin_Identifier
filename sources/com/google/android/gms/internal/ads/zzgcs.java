package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgcs extends zzfyy {
    final Iterator zza;
    final /* synthetic */ zzgct zzb;

    public zzgcs(zzgct zzgctVar) {
        this.zzb = zzgctVar;
        this.zza = zzgctVar.zza.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
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
