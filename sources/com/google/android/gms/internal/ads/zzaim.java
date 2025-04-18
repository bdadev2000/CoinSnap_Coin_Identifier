package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzaim extends zzaio {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaim(int i2, long j2) {
        super(i2);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final String toString() {
        List list = this.zzb;
        return zzaio.zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    @Nullable
    public final zzaim zza(int i2) {
        int size = this.zzc.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzaim zzaimVar = (zzaim) this.zzc.get(i3);
            if (zzaimVar.zzd == i2) {
                return zzaimVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzain zzb(int i2) {
        int size = this.zzb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzain zzainVar = (zzain) this.zzb.get(i3);
            if (zzainVar.zzd == i2) {
                return zzainVar;
            }
        }
        return null;
    }

    public final void zzc(zzaim zzaimVar) {
        this.zzc.add(zzaimVar);
    }

    public final void zzd(zzain zzainVar) {
        this.zzb.add(zzainVar);
    }
}
