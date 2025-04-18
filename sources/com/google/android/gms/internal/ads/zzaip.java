package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaip {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzek zzf;
    private final zzek zzg;
    private int zzh;
    private int zzi;

    public zzaip(zzek zzekVar, zzek zzekVar2, boolean z2) throws zzbo {
        this.zzg = zzekVar;
        this.zzf = zzekVar2;
        this.zze = z2;
        zzekVar2.zzL(12);
        this.zza = zzekVar2.zzp();
        zzekVar.zzL(12);
        this.zzi = zzekVar.zzp();
        zzadf.zzb(zzekVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        if (i2 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i3 = this.zzi - 1;
            this.zzi = i3;
            this.zzh = i3 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
