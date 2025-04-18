package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
final class zzfws implements Serializable, zzfwr {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfws) {
            return this.zza.equals(((zzfws) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.zza) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfwr) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
