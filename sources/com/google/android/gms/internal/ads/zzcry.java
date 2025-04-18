package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcry implements zzeiw {
    public final List zza;

    public zzcry(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzr() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgei.zzr((ua.b) it.next(), new zzcrx(this), zzgey.zzb());
        }
    }

    public zzcry(zzcrq zzcrqVar) {
        this.zza = Collections.singletonList(zzgei.zzh(zzcrqVar));
    }
}
