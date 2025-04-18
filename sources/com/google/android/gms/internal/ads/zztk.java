package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zztk {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztk(String str, boolean z2, boolean z3) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztk.class) {
            zztk zztkVar = (zztk) obj;
            if (TextUtils.equals(this.zza, zztkVar.zza) && this.zzb == zztkVar.zzb && this.zzc == zztkVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
