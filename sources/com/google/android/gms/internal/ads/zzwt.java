package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class zzwt {
    private int zza;
    private final SparseArray zzb;
    private final zzdn zzc;

    public zzwt() {
        this(new zzdn() { // from class: com.google.android.gms.internal.ads.zzws
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i2) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i3 = this.zza;
            if (i3 > 0 && i2 < this.zzb.keyAt(i3)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i2 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i2, Object obj) {
        if (this.zza == -1) {
            zzdi.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            zzdi.zzd(i2 >= keyAt);
            if (keyAt == i2) {
                this.zzc.zza(this.zzb.valueAt(r1.size() - 1));
            }
        }
        this.zzb.append(i2, obj);
    }

    public final void zzd() {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            this.zzc.zza(this.zzb.valueAt(i2));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i2) {
        int i3 = 0;
        while (i3 < this.zzb.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.zzb.keyAt(i4)) {
                return;
            }
            this.zzc.zza(this.zzb.valueAt(i3));
            this.zzb.removeAt(i3);
            int i5 = this.zza;
            if (i5 > 0) {
                this.zza = i5 - 1;
            }
            i3 = i4;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwt(zzdn zzdnVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdnVar;
        this.zza = -1;
    }
}
