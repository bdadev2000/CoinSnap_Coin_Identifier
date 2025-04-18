package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzapu {
    private final String zza;
    private final String zzb;

    public zzapu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapu.class == obj.getClass()) {
            zzapu zzapuVar = (zzapu) obj;
            if (TextUtils.equals(this.zza, zzapuVar.zza) && TextUtils.equals(this.zzb, zzapuVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.zza);
        sb.append(",value=");
        return d.r(sb, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
