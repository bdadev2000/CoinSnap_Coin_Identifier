package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzes extends zzev {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzes(int i10, long j3) {
        super(i10, null);
        this.zza = j3;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final String toString() {
        List list = this.zzb;
        return zzev.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    @Nullable
    public final zzes zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzes zzesVar = (zzes) this.zzc.get(i11);
            if (zzesVar.zzd == i10) {
                return zzesVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzet zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzet zzetVar = (zzet) this.zzb.get(i11);
            if (zzetVar.zzd == i10) {
                return zzetVar;
            }
        }
        return null;
    }

    public final void zzc(zzes zzesVar) {
        this.zzc.add(zzesVar);
    }

    public final void zzd(zzet zzetVar) {
        this.zzb.add(zzetVar);
    }
}
