package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzwr {
    public static final zzwr zza = new zzwr(new zzbw[0]);
    public final int zzb;
    private final zzfzo zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzwr(zzbw... zzbwVarArr) {
        this.zzc = zzfzo.zzm(zzbwVarArr);
        this.zzb = zzbwVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbw) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzdt.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwr.class == obj.getClass()) {
            zzwr zzwrVar = (zzwr) obj;
            if (this.zzb == zzwrVar.zzb && this.zzc.equals(zzwrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzbw zzbwVar) {
        int indexOf = this.zzc.indexOf(zzbwVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbw zzb(int i10) {
        return (zzbw) this.zzc.get(i10);
    }

    public final zzfzo zzc() {
        return zzfzo.zzl(zzgae.zzb(this.zzc, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzwr zzwrVar = zzwr.zza;
                return Integer.valueOf(((zzbw) obj).zzc);
            }
        }));
    }
}
