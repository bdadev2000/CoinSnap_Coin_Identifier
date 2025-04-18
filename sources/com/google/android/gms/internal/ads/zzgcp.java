package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzgcp implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgcp(int[] iArr, int i10, int i11) {
        this.zza = iArr;
        this.zzb = i11;
    }

    public static zzgcp zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgcp(copyOf, 0, copyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgcp)) {
            return false;
        }
        zzgcp zzgcpVar = (zzgcp) obj;
        if (this.zzb != zzgcpVar.zzb) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (zza(i10) != zzgcpVar.zza(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + this.zza[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.zzb;
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder(i10 * 5);
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.zza[0]);
            for (int i11 = 1; i11 < this.zzb; i11++) {
                sb2.append(", ");
                sb2.append(this.zza[i11]);
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return sb2.toString();
        }
        return "[]";
    }

    public final int zza(int i10) {
        zzfwq.zza(i10, this.zzb, "index");
        return this.zza[i10];
    }
}
