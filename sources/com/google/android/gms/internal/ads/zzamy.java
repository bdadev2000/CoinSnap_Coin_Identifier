package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzamy implements zzamm {
    private final zzed zza;
    private final zzadj zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private zzadx zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamy() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        boolean z10;
        boolean z11;
        zzdb.zzb(this.zze);
        while (zzedVar.zzb() > 0) {
            int i10 = this.zzg;
            boolean z12 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzedVar.zzb(), this.zzl - this.zzh);
                    this.zze.zzq(zzedVar, min);
                    int i11 = this.zzh + min;
                    this.zzh = i11;
                    if (i11 >= this.zzl) {
                        if (this.zzm == C.TIME_UNSET) {
                            z12 = false;
                        }
                        zzdb.zzf(z12);
                        this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                        this.zzm += this.zzk;
                        this.zzh = 0;
                        this.zzg = 0;
                    }
                } else {
                    int min2 = Math.min(zzedVar.zzb(), 4 - this.zzh);
                    zzedVar.zzH(this.zza.zzN(), this.zzh, min2);
                    int i12 = this.zzh + min2;
                    this.zzh = i12;
                    if (i12 >= 4) {
                        this.zza.zzL(0);
                        if (!this.zzb.zza(this.zza.zzg())) {
                            this.zzh = 0;
                            this.zzg = 1;
                        } else {
                            this.zzl = this.zzb.zzc;
                            if (!this.zzi) {
                                this.zzk = (r0.zzg * 1000000) / r0.zzd;
                                zzab zzabVar = new zzab();
                                zzabVar.zzL(this.zzf);
                                zzabVar.zzZ(this.zzb.zzb);
                                zzabVar.zzQ(4096);
                                zzabVar.zzz(this.zzb.zze);
                                zzabVar.zzaa(this.zzb.zzd);
                                zzabVar.zzP(this.zzc);
                                zzabVar.zzX(this.zzd);
                                this.zze.zzl(zzabVar.zzaf());
                                this.zzi = true;
                            }
                            this.zza.zzL(0);
                            this.zze.zzq(this.zza, 4);
                            this.zzg = 2;
                        }
                    }
                }
            } else {
                byte[] zzN = zzedVar.zzN();
                int zzd = zzedVar.zzd();
                int zze = zzedVar.zze();
                while (true) {
                    if (zzd < zze) {
                        int i13 = zzd + 1;
                        byte b3 = zzN[zzd];
                        if ((b3 & UByte.MAX_VALUE) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.zzj && (b3 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzj = z10;
                        if (z11) {
                            zzedVar.zzL(i13);
                            this.zzj = false;
                            this.zza.zzN()[1] = zzN[zzd];
                            this.zzh = 2;
                            this.zzg = 1;
                            break;
                        }
                        zzd = i13;
                    } else {
                        zzedVar.zzL(zze);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzf = zzaoaVar.zzb();
        this.zze = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzm = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzamy(@Nullable String str, int i10) {
        this.zzg = 0;
        zzed zzedVar = new zzed(4);
        this.zza = zzedVar;
        zzedVar.zzN()[0] = -1;
        this.zzb = new zzadj();
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i10;
    }
}
