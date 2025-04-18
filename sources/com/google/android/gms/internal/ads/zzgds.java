package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
abstract class zzgds extends zzgdi {
    private List zza;

    public zzgds(zzfzj zzfzjVar, boolean z10) {
        super(zzfzjVar, z10, true);
        List zza;
        if (zzfzjVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzgae.zza(zzfzjVar.size());
        }
        for (int i10 = 0; i10 < zzfzjVar.size(); i10++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgdr(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}
