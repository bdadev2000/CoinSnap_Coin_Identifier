package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgjm extends zzgii {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgjk zzd;

    public /* synthetic */ zzgjm(int i9, int i10, int i11, zzgjk zzgjkVar, zzgjl zzgjlVar) {
        this.zza = i9;
        this.zzb = i10;
        this.zzd = zzgjkVar;
    }

    public static zzgjj zzd() {
        return new zzgjj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjm)) {
            return false;
        }
        zzgjm zzgjmVar = (zzgjm) obj;
        if (zzgjmVar.zza != this.zza || zzgjmVar.zzb != this.zzb || zzgjmVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgjm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder n2 = o.n("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        n2.append(this.zzb);
        n2.append("-byte IV, 16-byte tag, and ");
        return AbstractC2914a.g(n2, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzd != zzgjk.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgjk zze() {
        return this.zzd;
    }
}
