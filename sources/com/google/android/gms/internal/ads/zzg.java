package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzg {
    public static final zzg zza = new zzg(0, 0, 1, 1, 0, null);

    @Nullable
    private zze zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public /* synthetic */ zzg(int i10, int i11, int i12, int i13, int i14, zzf zzfVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzg.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final zze zza() {
        if (this.zzb == null) {
            this.zzb = new zze(this, null);
        }
        return this.zzb;
    }
}
