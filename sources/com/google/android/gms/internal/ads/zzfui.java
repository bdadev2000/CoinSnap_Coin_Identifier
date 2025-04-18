package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import vd.e;

/* loaded from: classes3.dex */
final class zzfui extends zzfvk {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfui(String str, String str2, zzfuh zzfuhVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvk) {
            zzfvk zzfvkVar = (zzfvk) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfvkVar.zzb()) : zzfvkVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfvkVar.zza()) : zzfvkVar.zza() == null) {
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
        StringBuilder sb2 = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb2.append(this.zza);
        sb2.append(", appId=");
        return e.h(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
