package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zzgey extends zzgen {
    private List zza;

    public zzgey(zzgas zzgasVar, boolean z2) {
        super(zzgasVar, z2, true);
        List emptyList = zzgasVar.isEmpty() ? Collections.emptyList() : zzgbn.zza(zzgasVar.size());
        for (int i2 = 0; i2 < zzgasVar.size(); i2++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzf(int i2, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i2, new zzgex(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzy(int i2) {
        super.zzy(i2);
        this.zza = null;
    }
}
