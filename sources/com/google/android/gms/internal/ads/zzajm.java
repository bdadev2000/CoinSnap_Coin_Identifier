package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzajm extends zzajo {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzajm(int i9, long j7) {
        super(i9);
        this.zza = j7;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final String toString() {
        List list = this.zzb;
        return zzajo.zzf(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    @Nullable
    public final zzajm zza(int i9) {
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzajm zzajmVar = (zzajm) this.zzc.get(i10);
            if (zzajmVar.zzd == i9) {
                return zzajmVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzajn zzb(int i9) {
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzajn zzajnVar = (zzajn) this.zzb.get(i10);
            if (zzajnVar.zzd == i9) {
                return zzajnVar;
            }
        }
        return null;
    }

    public final void zzc(zzajm zzajmVar) {
        this.zzc.add(zzajmVar);
    }

    public final void zzd(zzajn zzajnVar) {
        this.zzb.add(zzajnVar);
    }
}
