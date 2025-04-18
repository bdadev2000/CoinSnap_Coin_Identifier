package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzafg implements zzadb {
    private final byte[] zza;
    private final zzek zzb;
    private final zzadh zzc;
    private zzade zzd;
    private zzaeh zze;
    private int zzf;

    @Nullable
    private zzbk zzg;
    private zzadm zzh;
    private int zzi;
    private int zzj;
    private zzaff zzk;
    private int zzl;
    private long zzm;

    public zzafg() {
        throw null;
    }

    private final long zza(zzek zzekVar, boolean z2) {
        boolean z3;
        this.zzh.getClass();
        int zzd = zzekVar.zzd();
        while (zzd <= zzekVar.zze() - 16) {
            zzekVar.zzL(zzd);
            if (zzadi.zzc(zzekVar, this.zzh, this.zzj, this.zzc)) {
                zzekVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (!z2) {
            zzekVar.zzL(zzd);
            return -1L;
        }
        while (zzd <= zzekVar.zze() - this.zzi) {
            zzekVar.zzL(zzd);
            try {
                z3 = zzadi.zzc(zzekVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z3 = false;
            }
            if (zzekVar.zzd() <= zzekVar.zze() && z3) {
                zzekVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        zzekVar.zzL(zzekVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j2 = this.zzm * 1000000;
        zzadm zzadmVar = this.zzh;
        int i2 = zzeu.zza;
        this.zze.zzs(j2 / zzadmVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zzb(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        boolean zzp;
        zzaea zzadzVar;
        boolean z2;
        int i2 = this.zzf;
        if (i2 == 0) {
            zzadcVar.zzj();
            long zze = zzadcVar.zze();
            zzbk zza = zzadj.zza(zzadcVar, true);
            zzadcVar.zzk((int) (zzadcVar.zze() - zze));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i2 == 1) {
            zzadcVar.zzh(this.zza, 0, 42);
            zzadcVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i2 == 2) {
            zzek zzekVar = new zzek(4);
            zzadcVar.zzi(zzekVar.zzN(), 0, 4);
            if (zzekVar.zzu() != 1716281667) {
                throw zzbo.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i2 == 3) {
            zzadm zzadmVar = this.zzh;
            do {
                zzadcVar.zzj();
                zzej zzejVar = new zzej(new byte[4], 4);
                zzadcVar.zzh(zzejVar.zza, 0, 4);
                zzp = zzejVar.zzp();
                int zzd = zzejVar.zzd(7);
                int zzd2 = zzejVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzadcVar.zzi(bArr, 0, 38);
                    zzadmVar = new zzadm(bArr, 4);
                } else {
                    if (zzadmVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzd == 3) {
                        zzek zzekVar2 = new zzek(zzd2);
                        zzadcVar.zzi(zzekVar2.zzN(), 0, zzd2);
                        zzadmVar = zzadmVar.zzf(zzadj.zzb(zzekVar2));
                    } else if (zzd == 4) {
                        zzek zzekVar3 = new zzek(zzd2);
                        zzadcVar.zzi(zzekVar3.zzN(), 0, zzd2);
                        zzekVar3.zzM(4);
                        zzadmVar = zzadmVar.zzg(Arrays.asList(zzaen.zzc(zzekVar3, false, false).zza));
                    } else if (zzd == 6) {
                        zzek zzekVar4 = new zzek(zzd2);
                        zzadcVar.zzi(zzekVar4.zzN(), 0, zzd2);
                        zzekVar4.zzM(4);
                        zzadmVar = zzadmVar.zze(zzgax.zzo(zzagb.zzb(zzekVar4)));
                    } else {
                        zzadcVar.zzk(zzd2);
                    }
                }
                int i3 = zzeu.zza;
                this.zzh = zzadmVar;
            } while (!zzp);
            zzadmVar.getClass();
            this.zzi = Math.max(zzadmVar.zzc, 6);
            this.zze.zzl(this.zzh.zzc(this.zza, this.zzg));
            this.zzf = 4;
            return 0;
        }
        if (i2 == 4) {
            zzadcVar.zzj();
            zzek zzekVar5 = new zzek(2);
            zzadcVar.zzh(zzekVar5.zzN(), 0, 2);
            int zzq = zzekVar5.zzq();
            if ((zzq >> 2) != 16382) {
                zzadcVar.zzj();
                throw zzbo.zza("First frame does not start with sync code.", null);
            }
            zzadcVar.zzj();
            this.zzj = zzq;
            zzade zzadeVar = this.zzd;
            int i4 = zzeu.zza;
            long zzf = zzadcVar.zzf();
            long zzd3 = zzadcVar.zzd();
            zzadm zzadmVar2 = this.zzh;
            zzadmVar2.getClass();
            if (zzadmVar2.zzk != null) {
                zzadzVar = new zzadk(zzadmVar2, zzf);
            } else if (zzd3 == -1 || zzadmVar2.zzj <= 0) {
                zzadzVar = new zzadz(zzadmVar2.zza(), 0L);
            } else {
                zzaff zzaffVar = new zzaff(zzadmVar2, this.zzj, zzf, zzd3);
                this.zzk = zzaffVar;
                zzadzVar = zzaffVar.zzb();
            }
            zzadeVar.zzO(zzadzVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadm zzadmVar3 = this.zzh;
        zzadmVar3.getClass();
        zzaff zzaffVar2 = this.zzk;
        if (zzaffVar2 != null && zzaffVar2.zze()) {
            return zzaffVar2.zza(zzadcVar, zzadxVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadi.zzb(zzadcVar, zzadmVar3);
            return 0;
        }
        zzek zzekVar6 = this.zzb;
        int zze2 = zzekVar6.zze();
        if (zze2 < 32768) {
            int zza2 = zzadcVar.zza(zzekVar6.zzN(), zze2, 32768 - zze2);
            z2 = zza2 == -1;
            if (!z2) {
                this.zzb.zzK(zze2 + zza2);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z2 = false;
        }
        zzek zzekVar7 = this.zzb;
        int zzd4 = zzekVar7.zzd();
        int i5 = this.zzl;
        int i6 = this.zzi;
        if (i5 < i6) {
            zzekVar7.zzM(Math.min(i6 - i5, zzekVar7.zzb()));
        }
        long zza3 = zza(this.zzb, z2);
        zzek zzekVar8 = this.zzb;
        int zzd5 = zzekVar8.zzd() - zzd4;
        zzekVar8.zzL(zzd4);
        this.zze.zzq(this.zzb, zzd5);
        this.zzl += zzd5;
        if (zza3 != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = zza3;
        }
        zzek zzekVar9 = this.zzb;
        if (zzekVar9.zzb() >= 16) {
            return 0;
        }
        int zzb = zzekVar9.zzb();
        System.arraycopy(zzekVar9.zzN(), zzekVar9.zzd(), zzekVar9.zzN(), 0, zzb);
        this.zzb.zzL(0);
        this.zzb.zzK(zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ zzadb zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final /* synthetic */ List zzd() {
        return zzgax.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zze(zzade zzadeVar) {
        this.zzd = zzadeVar;
        this.zze = zzadeVar.zzw(0, 1);
        zzadeVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final void zzf(long j2, long j3) {
        if (j2 == 0) {
            this.zzf = 0;
        } else {
            zzaff zzaffVar = this.zzk;
            if (zzaffVar != null) {
                zzaffVar.zzd(j3);
            }
        }
        this.zzm = j3 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final boolean zzi(zzadc zzadcVar) throws IOException {
        zzadj.zza(zzadcVar, false);
        zzek zzekVar = new zzek(4);
        ((zzacq) zzadcVar).zzm(zzekVar.zzN(), 0, 4, false);
        return zzekVar.zzu() == 1716281667;
    }

    public zzafg(int i2) {
        this.zza = new byte[42];
        this.zzb = new zzek(new byte[32768], 0);
        this.zzc = new zzadh();
        this.zzf = 0;
    }
}
