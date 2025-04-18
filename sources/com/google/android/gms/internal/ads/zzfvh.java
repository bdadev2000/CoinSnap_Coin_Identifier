package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzfvh extends zzfvs {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfvh(String str, String str2, zzfvg zzfvgVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvs) {
            zzfvs zzfvsVar = (zzfvs) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfvsVar.zzb()) : zzfvsVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfvsVar.zza()) : zzfvsVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return d.r(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
