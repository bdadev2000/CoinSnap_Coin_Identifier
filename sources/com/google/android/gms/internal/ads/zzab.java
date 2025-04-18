package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class zzab {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzab)) {
            return false;
        }
        zzab zzabVar = (zzab) obj;
        if (zzeu.zza >= 24) {
            return this.zza.equals(zzabVar.zza);
        }
        if (this.zza.size() != zzabVar.zza.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (zza(i2) != zzabVar.zza(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzeu.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            size = (size * 31) + zza(i2);
        }
        return size;
    }

    public final int zza(int i2) {
        zzdi.zza(i2, 0, this.zza.size());
        return this.zza.keyAt(i2);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i2) {
        return this.zza.get(i2);
    }
}
