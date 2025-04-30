package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzdv {
    public final int zzc;
    public final int zzd;
    public final int zze = 0;
    public final float zzf;
    public static final zzdv zza = new zzdv(0, 0, 0, 1.0f);
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdu
    };

    public zzdv(int i9, int i10, int i11, float f9) {
        this.zzc = i9;
        this.zzd = i10;
        this.zzf = f9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdv) {
            zzdv zzdvVar = (zzdv) obj;
            if (this.zzc == zzdvVar.zzc && this.zzd == zzdvVar.zzd && this.zzf == zzdvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = ((this.zzc + 217) * 31) + this.zzd;
        return Float.floatToRawIntBits(this.zzf) + (i9 * 961);
    }
}
