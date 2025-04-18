package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzyk {
    public final int zza;
    public final zzlr[] zzb;
    public final zzyd[] zzc;
    public final zzcd zzd;

    @Nullable
    public final Object zze;

    public zzyk(zzlr[] zzlrVarArr, zzyd[] zzydVarArr, zzcd zzcdVar, @Nullable Object obj) {
        boolean z10;
        int length = zzlrVarArr.length;
        if (length == zzydVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzb = zzlrVarArr;
        this.zzc = (zzyd[]) zzydVarArr.clone();
        this.zzd = zzcdVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(@Nullable zzyk zzykVar, int i10) {
        if (zzykVar == null || !Objects.equals(this.zzb[i10], zzykVar.zzb[i10]) || !Objects.equals(this.zzc[i10], zzykVar.zzc[i10])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i10) {
        return this.zzb[i10] != null;
    }
}
