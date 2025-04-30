package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzxr {
    public final int zzc;
    private final zzgbc zze;
    private int zzf;
    public static final zzxr zza = new zzxr(new zzde[0]);
    private static final String zzd = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzxp
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzxr(zzde... zzdeVarArr) {
        this.zze = zzgbc.zzl(zzdeVarArr);
        this.zzc = zzdeVarArr.length;
        int i9 = 0;
        while (i9 < this.zze.size()) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < this.zze.size(); i11++) {
                if (((zzde) this.zze.get(i9)).equals(this.zze.get(i11))) {
                    zzfk.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i9 = i10;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxr.class == obj.getClass()) {
            zzxr zzxrVar = (zzxr) obj;
            if (this.zzc == zzxrVar.zzc && this.zze.equals(zzxrVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzf;
        if (i9 == 0) {
            int hashCode = this.zze.hashCode();
            this.zzf = hashCode;
            return hashCode;
        }
        return i9;
    }

    public final int zza(zzde zzdeVar) {
        int indexOf = this.zze.indexOf(zzdeVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzde zzb(int i9) {
        return (zzde) this.zze.get(i9);
    }

    public final zzgbc zzc() {
        return zzgbc.zzk(zzgbs.zzb(this.zze, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzxq
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzxr zzxrVar = zzxr.zza;
                return Integer.valueOf(((zzde) obj).zzd);
            }
        }));
    }
}
