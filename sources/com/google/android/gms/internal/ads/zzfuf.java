package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import vd.e;

/* loaded from: classes3.dex */
final class zzfuf extends zzfvh {
    private final int zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfuf(int i10, String str, zzfue zzfueVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvh) {
            zzfvh zzfvhVar = (zzfvh) obj;
            if (this.zza == zzfvhVar.zza() && ((str = this.zzb) != null ? str.equals(zzfvhVar.zzb()) : zzfvhVar.zzb() == null)) {
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
        StringBuilder sb2 = new StringBuilder("OverlayDisplayState{statusCode=");
        sb2.append(this.zza);
        sb2.append(", sessionToken=");
        return e.h(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
