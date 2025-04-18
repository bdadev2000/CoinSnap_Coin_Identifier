package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzai {

    @Nullable
    public final String zza;
    public final String zzb;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzai(@Nullable String str, String str2) {
        this.zza = zzen.zzE(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzai.class == obj.getClass()) {
            zzai zzaiVar = (zzai) obj;
            if (Objects.equals(this.zza, zzaiVar.zza) && Objects.equals(this.zzb, zzaiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
