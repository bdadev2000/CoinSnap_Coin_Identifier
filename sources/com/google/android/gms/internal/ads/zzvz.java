package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzvz {
    private final zzed zza = new zzed(32);
    private zzvy zzb;
    private zzvy zzc;
    private zzvy zzd;
    private long zze;
    private final zzys zzf;

    public zzvz(zzys zzysVar) {
        this.zzf = zzysVar;
        zzvy zzvyVar = new zzvy(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.zzb = zzvyVar;
        this.zzc = zzvyVar;
        this.zzd = zzvyVar;
    }

    private final int zzi(int i10) {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar.zzc == null) {
            zzyl zzb = this.zzf.zzb();
            zzvy zzvyVar2 = new zzvy(this.zzd.zzb, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            zzvyVar.zzc = zzb;
            zzvyVar.zzd = zzvyVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvy zzj(zzvy zzvyVar, long j3) {
        while (j3 >= zzvyVar.zzb) {
            zzvyVar = zzvyVar.zzd;
        }
        return zzvyVar;
    }

    private static zzvy zzk(zzvy zzvyVar, long j3, ByteBuffer byteBuffer, int i10) {
        zzvy zzj = zzj(zzvyVar, j3);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j3));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j3), min);
            i10 -= min;
            j3 += min;
            if (j3 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvy zzl(zzvy zzvyVar, long j3, byte[] bArr, int i10) {
        zzvy zzj = zzj(zzvyVar, j3);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j3));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j3), bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvy zzm(zzvy zzvyVar, zzhm zzhmVar, zzwb zzwbVar, zzed zzedVar) {
        zzvy zzvyVar2;
        boolean z10;
        if (zzhmVar.zzl()) {
            long j3 = zzwbVar.zzb;
            int i10 = 1;
            zzedVar.zzI(1);
            zzvy zzl = zzl(zzvyVar, j3, zzedVar.zzN(), 1);
            long j10 = j3 + 1;
            byte b3 = zzedVar.zzN()[0];
            int i11 = b3 & ByteCompanionObject.MIN_VALUE;
            int i12 = b3 & Byte.MAX_VALUE;
            zzhj zzhjVar = zzhmVar.zzb;
            byte[] bArr = zzhjVar.zza;
            if (bArr == null) {
                zzhjVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzvyVar2 = zzl(zzl, j10, zzhjVar.zza, i12);
            long j11 = j10 + i12;
            if (z10) {
                zzedVar.zzI(2);
                zzvyVar2 = zzl(zzvyVar2, j11, zzedVar.zzN(), 2);
                j11 += 2;
                i10 = zzedVar.zzq();
            }
            int i13 = i10;
            int[] iArr = zzhjVar.zzd;
            if (iArr == null || iArr.length < i13) {
                iArr = new int[i13];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhjVar.zze;
            if (iArr3 == null || iArr3.length < i13) {
                iArr3 = new int[i13];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i14 = i13 * 6;
                zzedVar.zzI(i14);
                zzvyVar2 = zzl(zzvyVar2, j11, zzedVar.zzN(), i14);
                j11 += i14;
                zzedVar.zzL(0);
                for (int i15 = 0; i15 < i13; i15++) {
                    iArr2[i15] = zzedVar.zzq();
                    iArr4[i15] = zzedVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwbVar.zza - ((int) (j11 - zzwbVar.zzb));
            }
            zzadw zzadwVar = zzwbVar.zzc;
            int i16 = zzen.zza;
            zzhjVar.zzc(i13, iArr2, iArr4, zzadwVar.zzb, zzhjVar.zza, zzadwVar.zza, zzadwVar.zzc, zzadwVar.zzd);
            long j12 = zzwbVar.zzb;
            int i17 = (int) (j11 - j12);
            zzwbVar.zzb = j12 + i17;
            zzwbVar.zza -= i17;
        } else {
            zzvyVar2 = zzvyVar;
        }
        if (zzhmVar.zze()) {
            zzedVar.zzI(4);
            zzvy zzl2 = zzl(zzvyVar2, zzwbVar.zzb, zzedVar.zzN(), 4);
            int zzp = zzedVar.zzp();
            zzwbVar.zzb += 4;
            zzwbVar.zza -= 4;
            zzhmVar.zzj(zzp);
            zzvy zzk = zzk(zzl2, zzwbVar.zzb, zzhmVar.zzc, zzp);
            zzwbVar.zzb += zzp;
            int i18 = zzwbVar.zza - zzp;
            zzwbVar.zza = i18;
            ByteBuffer byteBuffer = zzhmVar.zzf;
            if (byteBuffer != null && byteBuffer.capacity() >= i18) {
                zzhmVar.zzf.clear();
            } else {
                zzhmVar.zzf = ByteBuffer.allocate(i18);
            }
            return zzk(zzk, zzwbVar.zzb, zzhmVar.zzf, zzwbVar.zza);
        }
        zzhmVar.zzj(zzwbVar.zza);
        return zzk(zzvyVar2, zzwbVar.zzb, zzhmVar.zzc, zzwbVar.zza);
    }

    private final void zzn(int i10) {
        long j3 = this.zze + i10;
        this.zze = j3;
        zzvy zzvyVar = this.zzd;
        if (j3 == zzvyVar.zzb) {
            this.zzd = zzvyVar.zzd;
        }
    }

    public final int zza(zzn zznVar, int i10, boolean z10) throws IOException {
        int zzi = zzi(i10);
        zzvy zzvyVar = this.zzd;
        int zza = zznVar.zza(zzvyVar.zzc.zza, zzvyVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z10) {
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

    public final void zzc(long j3) {
        zzvy zzvyVar;
        if (j3 != -1) {
            while (true) {
                zzvyVar = this.zzb;
                if (j3 < zzvyVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvyVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvyVar.zza) {
                this.zzc = zzvyVar;
            }
        }
    }

    public final void zzd(zzhm zzhmVar, zzwb zzwbVar) {
        zzm(this.zzc, zzhmVar, zzwbVar, this.zza);
    }

    public final void zze(zzhm zzhmVar, zzwb zzwbVar) {
        this.zzc = zzm(this.zzc, zzhmVar, zzwbVar, this.zza);
    }

    public final void zzf() {
        zzvy zzvyVar = this.zzb;
        if (zzvyVar.zzc != null) {
            this.zzf.zzd(zzvyVar);
            zzvyVar.zzb();
        }
        this.zzb.zze(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzvy zzvyVar2 = this.zzb;
        this.zzc = zzvyVar2;
        this.zzd = zzvyVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzed zzedVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvy zzvyVar = this.zzd;
            zzedVar.zzH(zzvyVar.zzc.zza, zzvyVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
