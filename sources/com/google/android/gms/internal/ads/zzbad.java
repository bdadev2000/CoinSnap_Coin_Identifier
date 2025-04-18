package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzbad {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbad(long j2, String str, int i2) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzbad)) {
            zzbad zzbadVar = (zzbad) obj;
            if (zzbadVar.zza == this.zza && zzbadVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
