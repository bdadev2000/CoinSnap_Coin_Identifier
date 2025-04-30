package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
final class zzfvt extends zzfwe {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfvt(String str, String str2, zzfvs zzfvsVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwe) {
            zzfwe zzfweVar = (zzfwe) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfweVar.zzb()) : zzfweVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfweVar.zza()) : zzfweVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return AbstractC2914a.h(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
