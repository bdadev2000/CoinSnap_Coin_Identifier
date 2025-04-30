package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzas {
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);

    @Nullable
    public final String zza;
    public final String zzb;

    public zzas(@Nullable String str, String str2) {
        this.zza = zzgd.zzD(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzas.class == obj.getClass()) {
            zzas zzasVar = (zzas) obj;
            if (zzgd.zzG(this.zza, zzasVar.zza) && zzgd.zzG(this.zzb, zzasVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
