package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzazu {
    final long zza;
    final String zzb;
    final int zzc;

    public zzazu(long j3, String str, int i10) {
        this.zza = j3;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzazu)) {
            zzazu zzazuVar = (zzazu) obj;
            if (zzazuVar.zza == this.zza && zzazuVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
