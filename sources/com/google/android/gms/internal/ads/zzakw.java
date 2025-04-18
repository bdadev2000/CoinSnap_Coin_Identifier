package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzakw implements zzade {
    private final zzade zzb;
    private final zzakt zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakw(zzade zzadeVar, zzakt zzaktVar) {
        this.zzb = zzadeVar;
        this.zzc = zzaktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final void zzO(zzaea zzaeaVar) {
        this.zzb.zzO(zzaeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzaeh zzw(int i2, int i3) {
        if (i3 != 3) {
            return this.zzb.zzw(i2, i3);
        }
        zzaky zzakyVar = (zzaky) this.zzd.get(i2);
        if (zzakyVar != null) {
            return zzakyVar;
        }
        zzaky zzakyVar2 = new zzaky(this.zzb.zzw(i2, 3), this.zzc);
        this.zzd.put(i2, zzakyVar2);
        return zzakyVar2;
    }
}
