package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzfvn extends zzfwp {
    private final int zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfvn(int i2, String str, zzfvm zzfvmVar) {
        this.zza = i2;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwp) {
            zzfwp zzfwpVar = (zzfwp) obj;
            if (this.zza == zzfwpVar.zza() && ((str = this.zzb) != null ? str.equals(zzfwpVar.zzb()) : zzfwpVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.zza);
        sb.append(", sessionToken=");
        return d.r(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
