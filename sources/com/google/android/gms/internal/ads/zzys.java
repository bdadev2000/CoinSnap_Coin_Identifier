package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzys {
    public final int zza;
    public final zzlv[] zzb;
    public final zzyl[] zzc;
    public final zzck zzd;

    @Nullable
    public final Object zze;

    public zzys(zzlv[] zzlvVarArr, zzyl[] zzylVarArr, zzck zzckVar, @Nullable Object obj) {
        int length = zzlvVarArr.length;
        zzdi.zzd(length == zzylVarArr.length);
        this.zzb = zzlvVarArr;
        this.zzc = (zzyl[]) zzylVarArr.clone();
        this.zzd = zzckVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(@Nullable zzys zzysVar, int i2) {
        return zzysVar != null && Objects.equals(this.zzb[i2], zzysVar.zzb[i2]) && Objects.equals(this.zzc[i2], zzysVar.zzc[i2]);
    }

    public final boolean zzb(int i2) {
        return this.zzb[i2] != null;
    }
}
