package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzz {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzz)) {
            return false;
        }
        zzz zzzVar = (zzz) obj;
        if (zzen.zza < 24) {
            if (this.zza.size() != zzzVar.zza.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                if (zza(i10) != zzzVar.zza(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.zza.equals(zzzVar.zza);
    }

    public final int hashCode() {
        if (zzen.zza < 24) {
            int size = this.zza.size();
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                size = (size * 31) + zza(i10);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i10) {
        zzdb.zza(i10, 0, this.zza.size());
        return this.zza.keyAt(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i10) {
        return this.zza.get(i10);
    }
}
