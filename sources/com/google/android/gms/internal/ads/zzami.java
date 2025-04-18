package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzami implements zzamm {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzec zzc = new zzec(new byte[7], 7);
    private final zzed zzd = new zzed(Arrays.copyOf(zza, 10));

    @Nullable
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadx zzh;
    private zzadx zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadx zzv;
    private long zzw;

    public zzami(boolean z10, @Nullable String str, int i10) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = C.TIME_UNSET;
        this.zzu = C.TIME_UNSET;
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadx zzadxVar, long j3, int i10, int i11) {
        this.zzj = 4;
        this.zzk = i10;
        this.zzv = zzadxVar;
        this.zzw = j3;
        this.zzt = i11;
    }

    private final boolean zzk(zzed zzedVar, byte[] bArr, int i10) {
        int min = Math.min(zzedVar.zzb(), i10 - this.zzk);
        zzedVar.zzH(bArr, this.zzk, min);
        int i11 = this.zzk + min;
        this.zzk = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private static final boolean zzl(byte b3, byte b10) {
        return zzf((b10 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzed zzedVar, byte[] bArr, int i10) {
        if (zzedVar.zzb() < i10) {
            return false;
        }
        zzedVar.zzH(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.zzh.getClass();
        int i15 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int i16 = this.zzj;
            int i17 = 13;
            boolean z11 = false;
            int i18 = 2;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            int min = Math.min(zzedVar.zzb(), this.zzt - this.zzk);
                            this.zzv.zzq(zzedVar, min);
                            int i19 = this.zzk + min;
                            this.zzk = i19;
                            if (i19 == this.zzt) {
                                if (this.zzu != C.TIME_UNSET) {
                                    z11 = true;
                                }
                                zzdb.zzf(z11);
                                this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                                this.zzu += this.zzw;
                                zzh();
                            }
                        } else {
                            if (true != this.zzm) {
                                i10 = 5;
                            } else {
                                i10 = 7;
                            }
                            if (zzk(zzedVar, this.zzc.zza, i10)) {
                                this.zzc.zzl(0);
                                if (!this.zzr) {
                                    int zzd = this.zzc.zzd(2) + 1;
                                    if (zzd != 2) {
                                        zzdt.zzf("AdtsReader", "Detected audio object type: " + zzd + ", but assuming AAC LC.");
                                    }
                                    this.zzc.zzn(5);
                                    int zzd2 = this.zzc.zzd(3);
                                    int i20 = this.zzp;
                                    byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzd2 << 3) & 120) | ((i20 << 7) & 128))};
                                    zzabm zza2 = zzabo.zza(bArr);
                                    zzab zzabVar = new zzab();
                                    zzabVar.zzL(this.zzg);
                                    zzabVar.zzZ(MimeTypes.AUDIO_AAC);
                                    zzabVar.zzA(zza2.zzc);
                                    zzabVar.zzz(zza2.zzb);
                                    zzabVar.zzaa(zza2.zza);
                                    zzabVar.zzM(Collections.singletonList(bArr));
                                    zzabVar.zzP(this.zze);
                                    zzabVar.zzX(this.zzf);
                                    zzad zzaf = zzabVar.zzaf();
                                    this.zzs = 1024000000 / zzaf.zzD;
                                    this.zzh.zzl(zzaf);
                                    this.zzr = true;
                                } else {
                                    this.zzc.zzn(10);
                                }
                                this.zzc.zzn(4);
                                int zzd3 = this.zzc.zzd(13) - 7;
                                if (this.zzm) {
                                    zzd3 -= 2;
                                }
                                zzj(this.zzh, this.zzs, 0, zzd3);
                            }
                        }
                    } else if (zzk(zzedVar, this.zzd.zzN(), 10)) {
                        this.zzi.zzq(this.zzd, 10);
                        this.zzd.zzL(6);
                        zzj(this.zzi, 0L, 10, 10 + this.zzd.zzl());
                    }
                } else if (zzedVar.zzb() != 0) {
                    zzec zzecVar = this.zzc;
                    zzecVar.zza[0] = zzedVar.zzN()[zzedVar.zzd()];
                    zzecVar.zzl(2);
                    int zzd4 = this.zzc.zzd(4);
                    int i21 = this.zzp;
                    if (i21 != -1 && zzd4 != i21) {
                        zzg();
                    } else {
                        if (!this.zzn) {
                            this.zzn = true;
                            this.zzo = this.zzq;
                            this.zzp = zzd4;
                        }
                        zzi();
                    }
                }
            } else {
                byte[] zzN = zzedVar.zzN();
                int zzd5 = zzedVar.zzd();
                int zze = zzedVar.zze();
                while (true) {
                    if (zzd5 < zze) {
                        i11 = zzd5 + 1;
                        i12 = zzN[zzd5] & UByte.MAX_VALUE;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i12)) {
                            if (!this.zzn) {
                                int i22 = i11 - 2;
                                zzedVar.zzL(i22 + 1);
                                if (zzm(zzedVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int zzd6 = this.zzc.zzd(1);
                                    int i23 = this.zzo;
                                    if (i23 == -1 || zzd6 == i23) {
                                        if (this.zzp != -1) {
                                            if (!zzm(zzedVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzl(i18);
                                            if (this.zzc.zzd(4) == this.zzp) {
                                                zzedVar.zzL(i22 + 2);
                                            }
                                        }
                                        if (!zzm(zzedVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzl(14);
                                        int zzd7 = this.zzc.zzd(i17);
                                        if (zzd7 >= 7) {
                                            byte[] zzN2 = zzedVar.zzN();
                                            int zze2 = zzedVar.zze();
                                            int i24 = i22 + zzd7;
                                            if (i24 < zze2) {
                                                byte b3 = zzN2[i24];
                                                if (b3 == -1) {
                                                    int i25 = i24 + 1;
                                                    if (i25 == zze2) {
                                                        break;
                                                    }
                                                    byte b10 = zzN2[i25];
                                                    if (zzl((byte) -1, b10) && ((b10 & 8) >> 3) == zzd6) {
                                                        break;
                                                    }
                                                } else if (b3 == 73) {
                                                    int i26 = i24 + 1;
                                                    if (i26 == zze2) {
                                                        break;
                                                    }
                                                    if (zzN2[i26] == 68) {
                                                        int i27 = i24 + 2;
                                                        if (i27 == zze2) {
                                                            break;
                                                        } else if (zzN2[i27] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i28 = this.zzl;
                        int i29 = i28 | i12;
                        if (i29 != 329) {
                            if (i29 != 511) {
                                if (i29 != 836) {
                                    if (i29 != 1075) {
                                        if (i28 != 256) {
                                            this.zzl = NotificationCompat.FLAG_LOCAL_ONLY;
                                            zzd5 = i11 - 1;
                                            i17 = 13;
                                            i18 = 2;
                                        } else {
                                            i13 = 2;
                                            i18 = i13;
                                            zzd5 = i11;
                                            i17 = 13;
                                        }
                                    } else {
                                        this.zzj = 2;
                                        this.zzk = 3;
                                        this.zzt = 0;
                                        this.zzd.zzL(0);
                                        zzedVar.zzL(i11);
                                        break;
                                    }
                                } else {
                                    i13 = 2;
                                    i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                                }
                            } else {
                                i13 = 2;
                                i14 = 512;
                            }
                        } else {
                            i13 = 2;
                            i14 = 768;
                        }
                        this.zzl = i14;
                        i18 = i13;
                        zzd5 = i11;
                        i17 = 13;
                    } else {
                        zzedVar.zzL(zzd5);
                        break;
                    }
                }
                this.zzq = (i12 & 8) >> 3;
                if (1 != ((i12 & 1) ^ 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.zzm = z10;
                if (!this.zzn) {
                    this.zzj = 1;
                    this.zzk = 0;
                } else {
                    zzi();
                }
                zzedVar.zzL(i11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzg = zzaoaVar.zzb();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (this.zzb) {
            zzaoaVar.zzc();
            zzadx zzw2 = zzacuVar.zzw(zzaoaVar.zza(), 5);
            this.zzi = zzw2;
            zzab zzabVar = new zzab();
            zzabVar.zzL(zzaoaVar.zzb());
            zzabVar.zzZ(MimeTypes.APPLICATION_ID3);
            zzw2.zzl(zzabVar.zzaf());
            return;
        }
        this.zzi = new zzacm();
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j3, int i10) {
        this.zzu = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzu = C.TIME_UNSET;
        zzg();
    }
}
