package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfvz extends zzfwr {
    private final int zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfvz(int i9, String str, zzfvy zzfvyVar) {
        this.zza = i9;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwr) {
            zzfwr zzfwrVar = (zzfwr) obj;
            if (this.zza == zzfwrVar.zza() && ((str = this.zzb) != null ? str.equals(zzfwrVar.zzb()) : zzfwrVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.zza);
        sb.append(", sessionToken=");
        return AbstractC2914a.h(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
