package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdp {
    private final zzgbc zzd;
    public static final zzdp zza = new zzdp(zzgbc.zzm());
    private static final String zzc = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdm
    };

    public zzdp(List list) {
        this.zzd = zzgbc.zzk(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdp.class == obj.getClass()) {
            return this.zzd.equals(((zzdp) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzgbc zza() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzb(int i9) {
        for (int i10 = 0; i10 < this.zzd.size(); i10++) {
            zzdo zzdoVar = (zzdo) this.zzd.get(i10);
            if (zzdoVar.zzc() && zzdoVar.zza() == i9) {
                return true;
            }
        }
        return false;
    }
}
