package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaeg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;

    @Nullable
    public final zzaef zzk;

    @Nullable
    private final zzcd zzl;

    private zzaeg(int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j7, @Nullable zzaef zzaefVar, @Nullable zzcd zzcdVar) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = zzi(i13);
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzh(i15);
        this.zzj = j7;
        this.zzk = zzaefVar;
        this.zzl = zzcdVar;
    }

    private static int zzh(int i9) {
        if (i9 == 8) {
            return 1;
        }
        if (i9 == 12) {
            return 2;
        }
        if (i9 == 16) {
            return 4;
        }
        if (i9 != 20) {
            return i9 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i9) {
        switch (i9) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j7 = this.zzj;
        if (j7 == 0) {
            return C.TIME_UNSET;
        }
        return (j7 * 1000000) / this.zze;
    }

    public final long zzb(long j7) {
        return Math.max(0L, Math.min((j7 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzan zzc(byte[] bArr, @Nullable zzcd zzcdVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzcd zzd = zzd(zzcdVar);
        zzal zzalVar = new zzal();
        zzalVar.zzX(MimeTypes.AUDIO_FLAC);
        int i9 = this.zzd;
        if (i9 <= 0) {
            i9 = -1;
        }
        zzalVar.zzP(i9);
        zzalVar.zzy(this.zzg);
        zzalVar.zzY(this.zze);
        zzalVar.zzR(zzgd.zzl(this.zzh));
        zzalVar.zzL(Collections.singletonList(bArr));
        zzalVar.zzQ(zzd);
        return zzalVar.zzad();
    }

    @Nullable
    public final zzcd zzd(@Nullable zzcd zzcdVar) {
        zzcd zzcdVar2 = this.zzl;
        if (zzcdVar2 == null) {
            return zzcdVar;
        }
        return zzcdVar2.zzd(zzcdVar);
    }

    public final zzaeg zze(List list) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzcd(list)));
    }

    public final zzaeg zzf(@Nullable zzaef zzaefVar) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaefVar, this.zzl);
    }

    public final zzaeg zzg(List list) {
        return new zzaeg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzafg.zzb(list)));
    }

    public zzaeg(byte[] bArr, int i9) {
        zzft zzftVar = new zzft(bArr, bArr.length);
        zzftVar.zzk(i9 * 8);
        this.zza = zzftVar.zzd(16);
        this.zzb = zzftVar.zzd(16);
        this.zzc = zzftVar.zzd(24);
        this.zzd = zzftVar.zzd(24);
        int zzd = zzftVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzftVar.zzd(3) + 1;
        int zzd2 = zzftVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        int zzd3 = zzftVar.zzd(4);
        int zzd4 = zzftVar.zzd(32);
        int i10 = zzgd.zza;
        this.zzj = ((zzd3 & 4294967295L) << 32) | (zzd4 & 4294967295L);
        this.zzk = null;
        this.zzl = null;
    }
}
