package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaew implements zzacr {
    private final byte[] zza;
    private final zzed zzb;
    private final zzacx zzc;
    private zzacu zzd;
    private zzadx zze;
    private int zzf;

    @Nullable
    private zzbd zzg;
    private zzadc zzh;
    private int zzi;
    private int zzj;
    private zzaev zzk;
    private int zzl;
    private long zzm;

    public zzaew() {
        throw null;
    }

    private final long zza(zzed zzedVar, boolean z10) {
        boolean z11;
        this.zzh.getClass();
        int zzd = zzedVar.zzd();
        while (zzd <= zzedVar.zze() - 16) {
            zzedVar.zzL(zzd);
            if (zzacy.zzc(zzedVar, this.zzh, this.zzj, this.zzc)) {
                zzedVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (z10) {
            while (zzd <= zzedVar.zze() - this.zzi) {
                zzedVar.zzL(zzd);
                try {
                    z11 = zzacy.zzc(zzedVar, this.zzh, this.zzj, this.zzc);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzedVar.zzd() <= zzedVar.zze() && z11) {
                    zzedVar.zzL(zzd);
                    return this.zzc.zza;
                }
                zzd++;
            }
            zzedVar.zzL(zzedVar.zze());
            return -1L;
        }
        zzedVar.zzL(zzd);
        return -1L;
    }

    private final void zzg() {
        long j3 = this.zzm * 1000000;
        zzadc zzadcVar = this.zzh;
        int i10 = zzen.zza;
        this.zze.zzs(j3 / zzadcVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        boolean zzp;
        zzadq zzadpVar;
        int i10 = this.zzf;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            this.zze.getClass();
                            zzadc zzadcVar = this.zzh;
                            zzadcVar.getClass();
                            zzaev zzaevVar = this.zzk;
                            if (zzaevVar != null && zzaevVar.zze()) {
                                return zzaevVar.zza(zzacsVar, zzadnVar);
                            }
                            if (this.zzm == -1) {
                                this.zzm = zzacy.zzb(zzacsVar, zzadcVar);
                                return 0;
                            }
                            zzed zzedVar = this.zzb;
                            int zze = zzedVar.zze();
                            if (zze < 32768) {
                                int zza = zzacsVar.zza(zzedVar.zzN(), zze, 32768 - zze);
                                if (zza != -1) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.zzb.zzK(zze + zza);
                                } else if (this.zzb.zzb() == 0) {
                                    zzg();
                                    return -1;
                                }
                            } else {
                                z10 = false;
                            }
                            zzed zzedVar2 = this.zzb;
                            int zzd = zzedVar2.zzd();
                            int i11 = this.zzl;
                            int i12 = this.zzi;
                            if (i11 < i12) {
                                zzedVar2.zzM(Math.min(i12 - i11, zzedVar2.zzb()));
                            }
                            long zza2 = zza(this.zzb, z10);
                            zzed zzedVar3 = this.zzb;
                            int zzd2 = zzedVar3.zzd() - zzd;
                            zzedVar3.zzL(zzd);
                            this.zze.zzq(this.zzb, zzd2);
                            this.zzl += zzd2;
                            if (zza2 != -1) {
                                zzg();
                                this.zzl = 0;
                                this.zzm = zza2;
                            }
                            zzed zzedVar4 = this.zzb;
                            if (zzedVar4.zzb() >= 16) {
                                return 0;
                            }
                            int zzb = zzedVar4.zzb();
                            System.arraycopy(zzedVar4.zzN(), zzedVar4.zzd(), zzedVar4.zzN(), 0, zzb);
                            this.zzb.zzL(0);
                            this.zzb.zzK(zzb);
                            return 0;
                        }
                        zzacsVar.zzj();
                        zzed zzedVar5 = new zzed(2);
                        zzacsVar.zzh(zzedVar5.zzN(), 0, 2);
                        int zzq = zzedVar5.zzq();
                        if ((zzq >> 2) == 16382) {
                            zzacsVar.zzj();
                            this.zzj = zzq;
                            zzacu zzacuVar = this.zzd;
                            int i13 = zzen.zza;
                            long zzf = zzacsVar.zzf();
                            long zzd3 = zzacsVar.zzd();
                            zzadc zzadcVar2 = this.zzh;
                            zzadcVar2.getClass();
                            if (zzadcVar2.zzk != null) {
                                zzadpVar = new zzada(zzadcVar2, zzf);
                            } else if (zzd3 != -1 && zzadcVar2.zzj > 0) {
                                zzaev zzaevVar2 = new zzaev(zzadcVar2, this.zzj, zzf, zzd3);
                                this.zzk = zzaevVar2;
                                zzadpVar = zzaevVar2.zzb();
                            } else {
                                zzadpVar = new zzadp(zzadcVar2.zza(), 0L);
                            }
                            zzacuVar.zzO(zzadpVar);
                            this.zzf = 5;
                            return 0;
                        }
                        zzacsVar.zzj();
                        throw zzbh.zza("First frame does not start with sync code.", null);
                    }
                    zzadc zzadcVar3 = this.zzh;
                    do {
                        zzacsVar.zzj();
                        zzec zzecVar = new zzec(new byte[4], 4);
                        zzacsVar.zzh(zzecVar.zza, 0, 4);
                        zzp = zzecVar.zzp();
                        int zzd4 = zzecVar.zzd(7);
                        int zzd5 = zzecVar.zzd(24) + 4;
                        if (zzd4 == 0) {
                            byte[] bArr = new byte[38];
                            zzacsVar.zzi(bArr, 0, 38);
                            zzadcVar3 = new zzadc(bArr, 4);
                        } else if (zzadcVar3 != null) {
                            if (zzd4 == 3) {
                                zzed zzedVar6 = new zzed(zzd5);
                                zzacsVar.zzi(zzedVar6.zzN(), 0, zzd5);
                                zzadcVar3 = zzadcVar3.zzf(zzacz.zzb(zzedVar6));
                            } else if (zzd4 == 4) {
                                zzed zzedVar7 = new zzed(zzd5);
                                zzacsVar.zzi(zzedVar7.zzN(), 0, zzd5);
                                zzedVar7.zzM(4);
                                zzadcVar3 = zzadcVar3.zzg(Arrays.asList(zzaed.zzc(zzedVar7, false, false).zza));
                            } else if (zzd4 == 6) {
                                zzed zzedVar8 = new zzed(zzd5);
                                zzacsVar.zzi(zzedVar8.zzN(), 0, zzd5);
                                zzedVar8.zzM(4);
                                zzadcVar3 = zzadcVar3.zze(zzfzo.zzo(zzafr.zzb(zzedVar8)));
                            } else {
                                zzacsVar.zzk(zzd5);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i14 = zzen.zza;
                        this.zzh = zzadcVar3;
                    } while (!zzp);
                    zzadcVar3.getClass();
                    this.zzi = Math.max(zzadcVar3.zzc, 6);
                    this.zze.zzl(this.zzh.zzc(this.zza, this.zzg));
                    this.zzf = 4;
                    return 0;
                }
                zzed zzedVar9 = new zzed(4);
                zzacsVar.zzi(zzedVar9.zzN(), 0, 4);
                if (zzedVar9.zzu() == 1716281667) {
                    this.zzf = 3;
                    return 0;
                }
                throw zzbh.zza("Failed to read FLAC stream marker.", null);
            }
            zzacsVar.zzh(this.zza, 0, 42);
            zzacsVar.zzj();
            this.zzf = 2;
            return 0;
        }
        zzacsVar.zzj();
        long zze2 = zzacsVar.zze();
        zzbd zza3 = zzacz.zza(zzacsVar, true);
        zzacsVar.zzk((int) (zzacsVar.zze() - zze2));
        this.zzg = zza3;
        this.zzf = 1;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzd = zzacuVar;
        this.zze = zzacuVar.zzw(0, 1);
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.zzf = 0;
        } else {
            zzaev zzaevVar = this.zzk;
            if (zzaevVar != null) {
                zzaevVar.zzd(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.zzm = j11;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacz.zza(zzacsVar, false);
        zzed zzedVar = new zzed(4);
        ((zzacg) zzacsVar).zzm(zzedVar.zzN(), 0, 4, false);
        if (zzedVar.zzu() != 1716281667) {
            return false;
        }
        return true;
    }

    public zzaew(int i10) {
        this.zza = new byte[42];
        this.zzb = new zzed(new byte[32768], 0);
        this.zzc = new zzacx();
        this.zzf = 0;
    }
}
