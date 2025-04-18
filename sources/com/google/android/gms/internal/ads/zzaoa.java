package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaoa {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaoa(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
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
        int i10 = this.zzd;
        int i11 = i10 == Integer.MIN_VALUE ? this.zzb : i10 + this.zzc;
        this.zzd = i11;
        this.zze = this.zza + i11;
    }
}
