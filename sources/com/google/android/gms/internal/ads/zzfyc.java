package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfyc implements Serializable, zzfya {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyc) {
            return this.zza.equals(((zzfyc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.zza) {
            if (!z2) {
                sb.append(',');
            }
            sb.append(obj);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zza(Object obj) {
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (!((zzfya) this.zza.get(i2)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
