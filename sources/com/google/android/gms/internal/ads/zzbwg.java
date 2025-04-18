package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzbwg extends zzbwi {
    private final String zza;
    private final int zzb;

    public zzbwg(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwg)) {
            zzbwg zzbwgVar = (zzbwg) obj;
            if (Objects.equal(this.zza, zzbwgVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbwgVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final String zzc() {
        return this.zza;
    }
}
