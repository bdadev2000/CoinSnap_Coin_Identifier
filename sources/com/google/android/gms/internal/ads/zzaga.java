package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaga implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzafz
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzaga(0)};
        }
    };
    private final byte[] zzb;
    private final zzfu zzc;
    private final zzaeb zzd;
    private zzadx zze;
    private zzafa zzf;
    private int zzg;

    @Nullable
    private zzcd zzh;
    private zzaeg zzi;
    private int zzj;
    private int zzk;
    private zzafy zzl;
    private int zzm;
    private long zzn;

    public zzaga() {
        throw null;
    }

    private final long zza(zzfu zzfuVar, boolean z8) {
        boolean z9;
        this.zzi.getClass();
        int zzd = zzfuVar.zzd();
        while (zzd <= zzfuVar.zze() - 16) {
            zzfuVar.zzK(zzd);
            if (zzaec.zzc(zzfuVar, this.zzi, this.zzk, this.zzd)) {
                zzfuVar.zzK(zzd);
                return this.zzd.zza;
            }
            zzd++;
        }
        if (z8) {
            while (zzd <= zzfuVar.zze() - this.zzj) {
                zzfuVar.zzK(zzd);
                try {
                    z9 = zzaec.zzc(zzfuVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z9 = false;
                }
                if (zzfuVar.zzd() <= zzfuVar.zze() && z9) {
                    zzfuVar.zzK(zzd);
                    return this.zzd.zza;
                }
                zzd++;
            }
            zzfuVar.zzK(zzfuVar.zze());
            return -1L;
        }
        zzfuVar.zzK(zzd);
        return -1L;
    }

    private final void zzg() {
        long j7 = this.zzn * 1000000;
        zzaeg zzaegVar = this.zzi;
        int i9 = zzgd.zza;
        this.zzf.zzs(j7 / zzaegVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean zzo;
        zzaet zzaesVar;
        int i9 = this.zzg;
        boolean z8 = true;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            this.zzf.getClass();
                            zzaeg zzaegVar = this.zzi;
                            zzaegVar.getClass();
                            zzafy zzafyVar = this.zzl;
                            if (zzafyVar != null && zzafyVar.zze()) {
                                return zzafyVar.zza(zzadvVar, zzaeqVar);
                            }
                            if (this.zzn == -1) {
                                this.zzn = zzaec.zzb(zzadvVar, zzaegVar);
                                return 0;
                            }
                            zzfu zzfuVar = this.zzc;
                            int zze = zzfuVar.zze();
                            if (zze < 32768) {
                                int zza2 = zzadvVar.zza(zzfuVar.zzM(), zze, 32768 - zze);
                                if (zza2 != -1) {
                                    z8 = false;
                                }
                                if (!z8) {
                                    this.zzc.zzJ(zze + zza2);
                                } else if (this.zzc.zzb() == 0) {
                                    zzg();
                                    return -1;
                                }
                            } else {
                                z8 = false;
                            }
                            zzfu zzfuVar2 = this.zzc;
                            int zzd = zzfuVar2.zzd();
                            int i10 = this.zzm;
                            int i11 = this.zzj;
                            if (i10 < i11) {
                                zzfuVar2.zzL(Math.min(i11 - i10, zzfuVar2.zzb()));
                            }
                            long zza3 = zza(this.zzc, z8);
                            zzfu zzfuVar3 = this.zzc;
                            int zzd2 = zzfuVar3.zzd() - zzd;
                            zzfuVar3.zzK(zzd);
                            zzaey.zzb(this.zzf, this.zzc, zzd2);
                            this.zzm += zzd2;
                            if (zza3 != -1) {
                                zzg();
                                this.zzm = 0;
                                this.zzn = zza3;
                            }
                            zzfu zzfuVar4 = this.zzc;
                            if (zzfuVar4.zzb() >= 16) {
                                return 0;
                            }
                            int zzb = zzfuVar4.zzb();
                            System.arraycopy(zzfuVar4.zzM(), zzfuVar4.zzd(), zzfuVar4.zzM(), 0, zzb);
                            this.zzc.zzK(0);
                            this.zzc.zzJ(zzb);
                            return 0;
                        }
                        zzadvVar.zzj();
                        zzfu zzfuVar5 = new zzfu(2);
                        ((zzadi) zzadvVar).zzm(zzfuVar5.zzM(), 0, 2, false);
                        int zzq = zzfuVar5.zzq();
                        if ((zzq >> 2) == 16382) {
                            zzadvVar.zzj();
                            this.zzk = zzq;
                            zzadx zzadxVar = this.zze;
                            int i12 = zzgd.zza;
                            long zzf = zzadvVar.zzf();
                            long zzd3 = zzadvVar.zzd();
                            zzaeg zzaegVar2 = this.zzi;
                            zzaegVar2.getClass();
                            if (zzaegVar2.zzk != null) {
                                zzaesVar = new zzaee(zzaegVar2, zzf);
                            } else if (zzd3 != -1 && zzaegVar2.zzj > 0) {
                                zzafy zzafyVar2 = new zzafy(zzaegVar2, this.zzk, zzf, zzd3);
                                this.zzl = zzafyVar2;
                                zzaesVar = zzafyVar2.zzb();
                            } else {
                                zzaesVar = new zzaes(zzaegVar2.zza(), 0L);
                            }
                            zzadxVar.zzO(zzaesVar);
                            this.zzg = 5;
                            return 0;
                        }
                        zzadvVar.zzj();
                        throw zzch.zza("First frame does not start with sync code.", null);
                    }
                    zzaeg zzaegVar3 = this.zzi;
                    do {
                        zzadvVar.zzj();
                        zzft zzftVar = new zzft(new byte[4], 4);
                        zzadi zzadiVar = (zzadi) zzadvVar;
                        zzadiVar.zzm(zzftVar.zza, 0, 4, false);
                        zzo = zzftVar.zzo();
                        int zzd4 = zzftVar.zzd(7);
                        int zzd5 = zzftVar.zzd(24) + 4;
                        if (zzd4 == 0) {
                            byte[] bArr = new byte[38];
                            zzadiVar.zzn(bArr, 0, 38, false);
                            zzaegVar3 = new zzaeg(bArr, 4);
                        } else if (zzaegVar3 != null) {
                            if (zzd4 == 3) {
                                zzfu zzfuVar6 = new zzfu(zzd5);
                                zzadiVar.zzn(zzfuVar6.zzM(), 0, zzd5, false);
                                zzaegVar3 = zzaegVar3.zzf(zzaed.zzb(zzfuVar6));
                            } else if (zzd4 == 4) {
                                zzfu zzfuVar7 = new zzfu(zzd5);
                                zzadiVar.zzn(zzfuVar7.zzM(), 0, zzd5, false);
                                zzfuVar7.zzL(4);
                                zzaegVar3 = zzaegVar3.zzg(Arrays.asList(zzafg.zzc(zzfuVar7, false, false).zzb));
                            } else if (zzd4 == 6) {
                                zzfu zzfuVar8 = new zzfu(zzd5);
                                zzadiVar.zzn(zzfuVar8.zzM(), 0, zzd5, false);
                                zzfuVar8.zzL(4);
                                zzaegVar3 = zzaegVar3.zze(zzgbc.zzn(zzagw.zzb(zzfuVar8)));
                            } else {
                                zzadiVar.zzo(zzd5, false);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i13 = zzgd.zza;
                        this.zzi = zzaegVar3;
                    } while (!zzo);
                    zzaegVar3.getClass();
                    this.zzj = Math.max(zzaegVar3.zzc, 6);
                    this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
                    this.zzg = 4;
                    return 0;
                }
                zzfu zzfuVar9 = new zzfu(4);
                ((zzadi) zzadvVar).zzn(zzfuVar9.zzM(), 0, 4, false);
                if (zzfuVar9.zzu() == 1716281667) {
                    this.zzg = 3;
                    return 0;
                }
                throw zzch.zza("Failed to read FLAC stream marker.", null);
            }
            ((zzadi) zzadvVar).zzm(this.zzb, 0, 42, false);
            zzadvVar.zzj();
            this.zzg = 2;
            return 0;
        }
        zzadvVar.zzj();
        long zze2 = zzadvVar.zze();
        zzcd zza4 = zzaed.zza(zzadvVar, true);
        ((zzadi) zzadvVar).zzo((int) (zzadvVar.zze() - zze2), false);
        this.zzh = zza4;
        this.zzg = 1;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zze = zzadxVar;
        this.zzf = zzadxVar.zzw(0, 1);
        zzadxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        long j10 = 0;
        if (j7 == 0) {
            this.zzg = 0;
        } else {
            zzafy zzafyVar = this.zzl;
            if (zzafyVar != null) {
                zzafyVar.zzd(j9);
            }
        }
        if (j9 != 0) {
            j10 = -1;
        }
        this.zzn = j10;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzaed.zza(zzadvVar, false);
        zzfu zzfuVar = new zzfu(4);
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 4, false);
        if (zzfuVar.zzu() != 1716281667) {
            return false;
        }
        return true;
    }

    public zzaga(int i9) {
        this.zzb = new byte[42];
        this.zzc = new zzfu(new byte[32768], 0);
        this.zzd = new zzaeb();
        this.zzg = 0;
    }
}
