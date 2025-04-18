package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadm {
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
    public final zzadl zzk;

    @Nullable
    private final zzbk zzl;

    private zzadm(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, @Nullable zzadl zzadlVar, @Nullable zzbk zzbkVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = zzi(i6);
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = zzh(i8);
        this.zzj = j2;
        this.zzk = zzadlVar;
        this.zzl = zzbkVar;
    }

    private static int zzh(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 != 20) {
            return i2 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i2) {
        switch (i2) {
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
        long j2 = this.zzj;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.zze;
    }

    public final long zzb(long j2) {
        return Math.max(0L, Math.min((j2 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzaf zzc(byte[] bArr, @Nullable zzbk zzbkVar) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        zzbk zzd = zzd(zzbkVar);
        zzad zzadVar = new zzad();
        zzadVar.zzZ("audio/flac");
        int i2 = this.zzd;
        if (i2 <= 0) {
            i2 = -1;
        }
        zzadVar.zzQ(i2);
        zzadVar.zzz(this.zzg);
        zzadVar.zzaa(this.zze);
        zzadVar.zzT(zzeu.zzm(this.zzh));
        zzadVar.zzM(Collections.singletonList(bArr));
        zzadVar.zzS(zzd);
        return zzadVar.zzaf();
    }

    @Nullable
    public final zzbk zzd(@Nullable zzbk zzbkVar) {
        zzbk zzbkVar2 = this.zzl;
        return zzbkVar2 == null ? zzbkVar : zzbkVar2.zzd(zzbkVar);
    }

    public final zzadm zze(List list) {
        return new zzadm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbk(list)));
    }

    public final zzadm zzf(@Nullable zzadl zzadlVar) {
        return new zzadm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadlVar, this.zzl);
    }

    public final zzadm zzg(List list) {
        return new zzadm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaen.zzb(list)));
    }

    public zzadm(byte[] bArr, int i2) {
        zzej zzejVar = new zzej(bArr, bArr.length);
        zzejVar.zzl(i2 * 8);
        this.zza = zzejVar.zzd(16);
        this.zzb = zzejVar.zzd(16);
        this.zzc = zzejVar.zzd(24);
        this.zzd = zzejVar.zzd(24);
        int zzd = zzejVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzejVar.zzd(3) + 1;
        int zzd2 = zzejVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzejVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
