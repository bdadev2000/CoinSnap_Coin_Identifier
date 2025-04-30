package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzapo {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzapo(int i9, int i10, int i11) {
        String str;
        if (i9 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i9 + "/";
        }
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i9;
        int i10 = this.zzd;
        if (i10 == Integer.MIN_VALUE) {
            i9 = this.zzb;
        } else {
            i9 = i10 + this.zzc;
        }
        this.zzd = i9;
        this.zze = this.zza + i9;
    }
}
