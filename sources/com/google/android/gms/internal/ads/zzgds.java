package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class zzgds implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgds(int[] iArr, int i2, int i3) {
        this.zza = iArr;
        this.zzb = i3;
    }

    public static zzgds zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgds(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgds)) {
            return false;
        }
        zzgds zzgdsVar = (zzgds) obj;
        if (this.zzb != zzgdsVar.zzb) {
            return false;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (zza(i2) != zzgdsVar.zza(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 = (i2 * 31) + this.zza[i3];
        }
        return i2;
    }

    public final String toString() {
        int i2 = this.zzb;
        if (i2 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        sb.append(this.zza[0]);
        for (int i3 = 1; i3 < this.zzb; i3++) {
            sb.append(", ");
            sb.append(this.zza[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zza(int i2) {
        zzfxz.zza(i2, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zza[i2];
    }
}
