package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzwy {
    private final zzfu zza = new zzfu(32);
    private zzwx zzb;
    private zzwx zzc;
    private zzwx zzd;
    private long zze;
    private final zzzv zzf;

    public zzwy(zzzv zzzvVar) {
        this.zzf = zzzvVar;
        zzwx zzwxVar = new zzwx(0L, 65536);
        this.zzb = zzwxVar;
        this.zzc = zzwxVar;
        this.zzd = zzwxVar;
    }

    private final int zzi(int i9) {
        zzwx zzwxVar = this.zzd;
        if (zzwxVar.zzc == null) {
            zzzo zzb = this.zzf.zzb();
            zzwx zzwxVar2 = new zzwx(this.zzd.zzb, 65536);
            zzwxVar.zzc = zzb;
            zzwxVar.zzd = zzwxVar2;
        }
        return Math.min(i9, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwx zzj(zzwx zzwxVar, long j7) {
        while (j7 >= zzwxVar.zzb) {
            zzwxVar = zzwxVar.zzd;
        }
        return zzwxVar;
    }

    private static zzwx zzk(zzwx zzwxVar, long j7, ByteBuffer byteBuffer, int i9) {
        zzwx zzj = zzj(zzwxVar, j7);
        while (i9 > 0) {
            int min = Math.min(i9, (int) (zzj.zzb - j7));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j7), min);
            i9 -= min;
            j7 += min;
            if (j7 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwx zzl(zzwx zzwxVar, long j7, byte[] bArr, int i9) {
        zzwx zzj = zzj(zzwxVar, j7);
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j7));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j7), bArr, i9 - i10, min);
            i10 -= min;
            j7 += min;
            if (j7 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwx zzm(zzwx zzwxVar, zzin zzinVar, zzxa zzxaVar, zzfu zzfuVar) {
        zzwx zzwxVar2;
        boolean z8;
        int i9;
        if (zzinVar.zzk()) {
            long j7 = zzxaVar.zzb;
            zzfuVar.zzH(1);
            zzwx zzl = zzl(zzwxVar, j7, zzfuVar.zzM(), 1);
            long j9 = j7 + 1;
            byte b = zzfuVar.zzM()[0];
            int i10 = b & 128;
            int i11 = b & Ascii.DEL;
            zzik zzikVar = zzinVar.zzb;
            byte[] bArr = zzikVar.zza;
            if (bArr == null) {
                zzikVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i10 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            zzwxVar2 = zzl(zzl, j9, zzikVar.zza, i11);
            long j10 = j9 + i11;
            if (z8) {
                zzfuVar.zzH(2);
                zzwxVar2 = zzl(zzwxVar2, j10, zzfuVar.zzM(), 2);
                j10 += 2;
                i9 = zzfuVar.zzq();
            } else {
                i9 = 1;
            }
            int[] iArr = zzikVar.zzd;
            if (iArr == null || iArr.length < i9) {
                iArr = new int[i9];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzikVar.zze;
            if (iArr3 == null || iArr3.length < i9) {
                iArr3 = new int[i9];
            }
            int[] iArr4 = iArr3;
            if (z8) {
                int i12 = i9 * 6;
                zzfuVar.zzH(i12);
                zzwxVar2 = zzl(zzwxVar2, j10, zzfuVar.zzM(), i12);
                j10 += i12;
                zzfuVar.zzK(0);
                for (int i13 = 0; i13 < i9; i13++) {
                    iArr2[i13] = zzfuVar.zzq();
                    iArr4[i13] = zzfuVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxaVar.zza - ((int) (j10 - zzxaVar.zzb));
            }
            zzaez zzaezVar = zzxaVar.zzc;
            int i14 = zzgd.zza;
            zzikVar.zzc(i9, iArr2, iArr4, zzaezVar.zzb, zzikVar.zza, zzaezVar.zza, zzaezVar.zzc, zzaezVar.zzd);
            long j11 = zzxaVar.zzb;
            int i15 = (int) (j10 - j11);
            zzxaVar.zzb = j11 + i15;
            zzxaVar.zza -= i15;
        } else {
            zzwxVar2 = zzwxVar;
        }
        if (zzinVar.zze()) {
            zzfuVar.zzH(4);
            zzwx zzl2 = zzl(zzwxVar2, zzxaVar.zzb, zzfuVar.zzM(), 4);
            int zzp = zzfuVar.zzp();
            zzxaVar.zzb += 4;
            zzxaVar.zza -= 4;
            zzinVar.zzi(zzp);
            zzwx zzk = zzk(zzl2, zzxaVar.zzb, zzinVar.zzc, zzp);
            zzxaVar.zzb += zzp;
            int i16 = zzxaVar.zza - zzp;
            zzxaVar.zza = i16;
            ByteBuffer byteBuffer = zzinVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i16) {
                zzinVar.zzf.clear();
            } else {
                zzinVar.zzf = ByteBuffer.allocate(i16);
            }
            return zzk(zzk, zzxaVar.zzb, zzinVar.zzf, zzxaVar.zza);
        }
        zzinVar.zzi(zzxaVar.zza);
        return zzk(zzwxVar2, zzxaVar.zzb, zzinVar.zzc, zzxaVar.zza);
    }

    private final void zzn(int i9) {
        long j7 = this.zze + i9;
        this.zze = j7;
        zzwx zzwxVar = this.zzd;
        if (j7 == zzwxVar.zzb) {
            this.zzd = zzwxVar.zzd;
        }
    }

    public final int zza(zzu zzuVar, int i9, boolean z8) throws IOException {
        int zzi = zzi(i9);
        zzwx zzwxVar = this.zzd;
        int zza = zzuVar.zza(zzwxVar.zzc.zza, zzwxVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        zzn(zza);
        return zza;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j7) {
        zzwx zzwxVar;
        if (j7 != -1) {
            while (true) {
                zzwxVar = this.zzb;
                if (j7 < zzwxVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwxVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwxVar.zza) {
                this.zzc = zzwxVar;
            }
        }
    }

    public final void zzd(zzin zzinVar, zzxa zzxaVar) {
        zzm(this.zzc, zzinVar, zzxaVar, this.zza);
    }

    public final void zze(zzin zzinVar, zzxa zzxaVar) {
        this.zzc = zzm(this.zzc, zzinVar, zzxaVar, this.zza);
    }

    public final void zzf() {
        zzwx zzwxVar = this.zzb;
        if (zzwxVar.zzc != null) {
            this.zzf.zzd(zzwxVar);
            zzwxVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwx zzwxVar2 = this.zzb;
        this.zzc = zzwxVar2;
        this.zzd = zzwxVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfu zzfuVar, int i9) {
        while (i9 > 0) {
            int zzi = zzi(i9);
            zzwx zzwxVar = this.zzd;
            zzfuVar.zzG(zzwxVar.zzc.zza, zzwxVar.zza(this.zze), zzi);
            i9 -= zzi;
            zzn(zzi);
        }
    }
}
