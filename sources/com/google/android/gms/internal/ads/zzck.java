package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzck {
    public static final zzck zza = new zzck(zzgax.zzn());
    private final zzgax zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzck(List list) {
        this.zzb = zzgax.zzl(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzck.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzck) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgax zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i2) {
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            zzcj zzcjVar = (zzcj) this.zzb.get(i3);
            if (zzcjVar.zzc() && zzcjVar.zza() == i2) {
                return true;
            }
        }
        return false;
    }
}
