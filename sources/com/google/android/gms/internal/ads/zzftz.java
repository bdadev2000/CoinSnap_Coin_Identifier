package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import vd.e;

/* loaded from: classes3.dex */
final class zzftz extends zzfuk {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzftz(String str, String str2, zzfty zzftyVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfuk) {
            zzfuk zzfukVar = (zzfuk) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfukVar.zzb()) : zzfukVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfukVar.zza()) : zzfukVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb2.append(this.zza);
        sb2.append(", appId=");
        return e.h(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuk
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
