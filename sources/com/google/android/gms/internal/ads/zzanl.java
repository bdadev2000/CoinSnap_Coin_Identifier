package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
public final class zzanl implements zzamz {
    private final zzek zza;
    private final zzadt zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private zzaeh zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzanl() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zze);
        while (zzekVar.zzb() > 0) {
            int i2 = this.zzg;
            if (i2 == 0) {
                byte[] zzN = zzekVar.zzN();
                int zzd = zzekVar.zzd();
                int zze = zzekVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzekVar.zzL(zze);
                        break;
                    }
                    int i3 = zzd + 1;
                    byte b2 = zzN[zzd];
                    boolean z2 = (b2 & UnsignedBytes.MAX_VALUE) == 255;
                    boolean z3 = this.zzj && (b2 & 224) == 224;
                    this.zzj = z2;
                    if (z3) {
                        zzekVar.zzL(i3);
                        this.zzj = false;
                        this.zza.zzN()[1] = zzN[zzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    zzd = i3;
                }
            } else if (i2 != 1) {
                int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                this.zze.zzq(zzekVar, min);
                int i4 = this.zzh + min;
                this.zzh = i4;
                if (i4 >= this.zzl) {
                    zzdi.zzf(this.zzm != -9223372036854775807L);
                    this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int min2 = Math.min(zzekVar.zzb(), 4 - this.zzh);
                zzekVar.zzH(this.zza.zzN(), this.zzh, min2);
                int i5 = this.zzh + min2;
                this.zzh = i5;
                if (i5 >= 4) {
                    this.zza.zzL(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzl = this.zzb.zzc;
                        if (!this.zzi) {
                            this.zzk = (r0.zzg * 1000000) / r0.zzd;
                            zzad zzadVar = new zzad();
                            zzadVar.zzL(this.zzf);
                            zzadVar.zzZ(this.zzb.zzb);
                            zzadVar.zzQ(4096);
                            zzadVar.zzz(this.zzb.zze);
                            zzadVar.zzaa(this.zzb.zzd);
                            zzadVar.zzP(this.zzc);
                            zzadVar.zzX(this.zzd);
                            this.zze.zzl(zzadVar.zzaf());
                            this.zzi = true;
                        }
                        this.zza.zzL(0);
                        this.zze.zzq(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzf = zzaonVar.zzb();
        this.zze = zzadeVar.zzw(zzaonVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j2, int i2) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }

    public zzanl(@Nullable String str, int i2) {
        this.zzg = 0;
        zzek zzekVar = new zzek(4);
        this.zza = zzekVar;
        zzekVar.zzN()[0] = -1;
        this.zzb = new zzadt();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
    }
}
