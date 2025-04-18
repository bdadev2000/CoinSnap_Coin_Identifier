package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class zzakj implements zzacu {
    private final zzacu zzb;
    private final zzakg zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakj(zzacu zzacuVar, zzakg zzakgVar) {
        this.zzb = zzacuVar;
        this.zzc = zzakgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(zzadq zzadqVar) {
        this.zzb.zzO(zzadqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i10, int i11) {
        if (i11 != 3) {
            return this.zzb.zzw(i10, i11);
        }
        zzakl zzaklVar = (zzakl) this.zzd.get(i10);
        if (zzaklVar != null) {
            return zzaklVar;
        }
        zzakl zzaklVar2 = new zzakl(this.zzb.zzw(i10, 3), this.zzc);
        this.zzd.put(i10, zzaklVar2);
        return zzaklVar2;
    }
}
