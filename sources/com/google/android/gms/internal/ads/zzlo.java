package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzlo {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzlo(zzlm zzlmVar, zzln zzlnVar) {
        this.zza = zzlm.zzc(zzlmVar);
        this.zzb = zzlm.zza(zzlmVar);
        this.zzc = zzlm.zzb(zzlmVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlo)) {
            return false;
        }
        zzlo zzloVar = (zzlo) obj;
        if (this.zza == zzloVar.zza && this.zzb == zzloVar.zzb && this.zzc == zzloVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzlm zza() {
        return new zzlm(this, null);
    }
}
