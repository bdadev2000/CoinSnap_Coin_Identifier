package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zzgfd extends zzges {
    private List zza;

    public zzgfd(zzgax zzgaxVar, boolean z8) {
        super(zzgaxVar, z8, true);
        List zza;
        if (zzgaxVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzgbs.zza(zzgaxVar.size());
        }
        for (int i9 = 0; i9 < zzgaxVar.size(); i9++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzf(int i9, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i9, new zzgfc(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzy(int i9) {
        super.zzy(i9);
        this.zza = null;
    }
}
