package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class zzalw implements zzadx {
    private final zzadx zzb;
    private final zzalt zzc;
    private final SparseArray zzd = new SparseArray();

    public zzalw(zzadx zzadxVar, zzalt zzaltVar) {
        this.zzb = zzadxVar;
        this.zzc = zzaltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(zzaet zzaetVar) {
        this.zzb.zzO(zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i9, int i10) {
        if (i10 != 3) {
            return this.zzb.zzw(i9, i10);
        }
        zzaly zzalyVar = (zzaly) this.zzd.get(i9);
        if (zzalyVar != null) {
            return zzalyVar;
        }
        zzaly zzalyVar2 = new zzaly(this.zzb.zzw(i9, 3), this.zzc);
        this.zzd.put(i9, zzalyVar2);
        return zzalyVar2;
    }
}
