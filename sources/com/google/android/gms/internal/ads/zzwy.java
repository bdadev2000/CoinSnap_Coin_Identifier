package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzwy {
    public static final zzwy zza = new zzwy(new zzcd[0]);
    public final int zzb;
    private final zzgax zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzwy(zzcd... zzcdVarArr) {
        this.zzc = zzgax.zzm(zzcdVarArr);
        this.zzb = zzcdVarArr.length;
        int i2 = 0;
        while (i2 < this.zzc.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.zzc.size(); i4++) {
                if (((zzcd) this.zzc.get(i2)).equals(this.zzc.get(i4))) {
                    zzea.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i2 = i3;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwy.class == obj.getClass()) {
            zzwy zzwyVar = (zzwy) obj;
            if (this.zzb == zzwyVar.zzb && this.zzc.equals(zzwyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzcd zzcdVar) {
        int indexOf = this.zzc.indexOf(zzcdVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcd zzb(int i2) {
        return (zzcd) this.zzc.get(i2);
    }

    public final zzgax zzc() {
        return zzgax.zzl(zzgbn.zzb(this.zzc, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzwx
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                zzwy zzwyVar = zzwy.zza;
                return Integer.valueOf(((zzcd) obj).zzc);
            }
        }));
    }
}
