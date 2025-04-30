package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzah {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (zzgd.zza < 24) {
            if (this.zza.size() != zzahVar.zza.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.zza.size(); i9++) {
                if (zza(i9) != zzahVar.zza(i9)) {
                    return false;
                }
            }
            return true;
        }
        return this.zza.equals(zzahVar.zza);
    }

    public final int hashCode() {
        if (zzgd.zza < 24) {
            int size = this.zza.size();
            for (int i9 = 0; i9 < this.zza.size(); i9++) {
                size = (size * 31) + zza(i9);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i9) {
        zzeq.zza(i9, 0, this.zza.size());
        return this.zza.keyAt(i9);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i9) {
        return this.zza.get(i9);
    }
}
