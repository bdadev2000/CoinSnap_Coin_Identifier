package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzak {

    @Nullable
    public final String zza;
    public final String zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzak(@Nullable String str, String str2) {
        this.zza = zzeu.zzD(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzak.class == obj.getClass()) {
            zzak zzakVar = (zzak) obj;
            if (Objects.equals(this.zza, zzakVar.zza) && Objects.equals(this.zzb, zzakVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
