package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzaqw {
    private final String zza;
    private final String zzb;

    public zzaqw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaqw.class == obj.getClass()) {
            zzaqw zzaqwVar = (zzaqw) obj;
            if (TextUtils.equals(this.zza, zzaqwVar.zza) && TextUtils.equals(this.zzb, zzaqwVar.zzb)) {
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
        return AbstractC2914a.h(sb, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
