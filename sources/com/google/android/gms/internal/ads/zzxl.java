package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class zzxl {
    private int zza;
    private final SparseArray zzb;
    private final zzev zzc;

    public zzxl() {
        this(new zzev() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // com.google.android.gms.internal.ads.zzev
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i9) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i10 = this.zza;
            if (i10 > 0 && i9 < this.zzb.keyAt(i10)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i9 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i9, Object obj) {
        boolean z8;
        boolean z9 = true;
        if (this.zza == -1) {
            if (this.zzb.size() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzeq.zzf(z8);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            if (i9 < keyAt) {
                z9 = false;
            }
            zzeq.zzd(z9);
            if (keyAt == i9) {
                this.zzc.zza(this.zzb.valueAt(r1.size() - 1));
            }
        }
        this.zzb.append(i9, obj);
    }

    public final void zzd() {
        for (int i9 = 0; i9 < this.zzb.size(); i9++) {
            this.zzc.zza(this.zzb.valueAt(i9));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i9) {
        int i10 = 0;
        while (i10 < this.zzb.size() - 1) {
            int i11 = i10 + 1;
            if (i9 >= this.zzb.keyAt(i11)) {
                this.zzc.zza(this.zzb.valueAt(i10));
                this.zzb.removeAt(i10);
                int i12 = this.zza;
                if (i12 > 0) {
                    this.zza = i12 - 1;
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final boolean zzf() {
        if (this.zzb.size() == 0) {
            return true;
        }
        return false;
    }

    public zzxl(zzev zzevVar) {
        this.zzb = new SparseArray();
        this.zzc = zzevVar;
        this.zza = -1;
    }
}
