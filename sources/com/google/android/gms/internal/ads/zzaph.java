package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import vd.e;

/* loaded from: classes3.dex */
public final class zzaph {
    private final String zza;
    private final String zzb;

    public zzaph(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaph.class == obj.getClass()) {
            zzaph zzaphVar = (zzaph) obj;
            if (TextUtils.equals(this.zza, zzaphVar.zza) && TextUtils.equals(this.zzb, zzaphVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.zza);
        sb2.append(",value=");
        return e.h(sb2, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
