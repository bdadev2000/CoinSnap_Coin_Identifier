package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class zzfyj implements Serializable, zzfyh {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyj) {
            return this.zza.equals(((zzfyj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z8 = true;
        for (Object obj : this.zza) {
            if (!z8) {
                sb.append(',');
            }
            sb.append(obj);
            z8 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final boolean zza(Object obj) {
        for (int i9 = 0; i9 < this.zza.size(); i9++) {
            if (!((zzfyh) this.zza.get(i9)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
