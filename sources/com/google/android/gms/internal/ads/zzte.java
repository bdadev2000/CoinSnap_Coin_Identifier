package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzte {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzte(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzte.class) {
            zzte zzteVar = (zzte) obj;
            if (TextUtils.equals(this.zza, zzteVar.zza) && this.zzb == zzteVar.zzb && this.zzc == zzteVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
