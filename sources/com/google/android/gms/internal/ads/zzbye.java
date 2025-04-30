package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzbye extends zzbyg {
    private final String zza;
    private final int zzb;

    public zzbye(String str, int i9) {
        this.zza = str;
        this.zzb = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbye)) {
            zzbye zzbyeVar = (zzbye) obj;
            if (Objects.equal(this.zza, zzbyeVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbyeVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final String zzc() {
        return this.zza;
    }
}
