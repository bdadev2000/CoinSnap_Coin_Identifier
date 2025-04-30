package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcux implements zzelg {
    public final List zza;

    public zzcux(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgft.zzr((f4.c) it.next(), new zzcuw(this), zzggk.zzb());
        }
    }

    public zzcux(zzcup zzcupVar) {
        this.zza = Collections.singletonList(zzgft.zzh(zzcupVar));
    }
}
