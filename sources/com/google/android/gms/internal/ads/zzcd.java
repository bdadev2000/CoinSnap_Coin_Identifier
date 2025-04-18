package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcd {
    public static final zzcd zza = new zzcd(zzfzo.zzn());
    private final zzfzo zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzcd(List list) {
        this.zzb = zzfzo.zzl(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcd.class == obj.getClass()) {
            return this.zzb.equals(((zzcd) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfzo zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzcc zzccVar = (zzcc) this.zzb.get(i11);
            if (zzccVar.zzc() && zzccVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
