package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes4.dex */
public final class zzbwj extends zzbwl {
    private final String zza;
    private final int zzb;

    public zzbwj(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwj)) {
            zzbwj zzbwjVar = (zzbwj) obj;
            if (Objects.equal(this.zza, zzbwjVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbwjVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final String zzc() {
        return this.zza;
    }
}
