package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfyz extends zzgaz implements Serializable {
    final Comparator zza;

    public zzfyz(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgaz, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyz) {
            return this.zza.equals(((zzfyz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
