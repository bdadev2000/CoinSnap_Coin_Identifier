package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzub {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzub(String str, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = z8;
        this.zzc = z9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzub.class) {
            zzub zzubVar = (zzub) obj;
            if (TextUtils.equals(this.zza, zzubVar.zza) && this.zzb == zzubVar.zzb && this.zzc == zzubVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zza.hashCode() + 31;
        int i10 = 1231;
        if (true != this.zzb) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i11 = ((hashCode * 31) + i9) * 31;
        if (true != this.zzc) {
            i10 = 1237;
        }
        return i11 + i10;
    }
}
