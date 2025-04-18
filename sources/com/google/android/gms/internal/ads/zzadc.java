package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class zzadc {
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
    public final zzadb zzk;

    @Nullable
    private final zzbd zzl;

    private zzadc(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j3, @Nullable zzadb zzadbVar, @Nullable zzbd zzbdVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j3;
        this.zzk = zzadbVar;
        this.zzl = zzbdVar;
    }

    private static int zzh(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i10) {
        switch (i10) {
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
        long j3 = this.zzj;
        return j3 == 0 ? C.TIME_UNSET : (j3 * 1000000) / this.zze;
    }

    public final long zzb(long j3) {
        return Math.max(0L, Math.min((j3 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzad zzc(byte[] bArr, @Nullable zzbd zzbdVar) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        zzbd zzd = zzd(zzbdVar);
        zzab zzabVar = new zzab();
        zzabVar.zzZ(MimeTypes.AUDIO_FLAC);
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzabVar.zzQ(i10);
        zzabVar.zzz(this.zzg);
        zzabVar.zzaa(this.zze);
        zzabVar.zzT(zzen.zzn(this.zzh));
        zzabVar.zzM(Collections.singletonList(bArr));
        zzabVar.zzS(zzd);
        return zzabVar.zzaf();
    }

    @Nullable
    public final zzbd zzd(@Nullable zzbd zzbdVar) {
        zzbd zzbdVar2 = this.zzl;
        return zzbdVar2 == null ? zzbdVar : zzbdVar2.zzd(zzbdVar);
    }

    public final zzadc zze(List list) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbd(list)));
    }

    public final zzadc zzf(@Nullable zzadb zzadbVar) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadbVar, this.zzl);
    }

    public final zzadc zzg(List list) {
        return new zzadc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaed.zzb(list)));
    }

    public zzadc(byte[] bArr, int i10) {
        zzec zzecVar = new zzec(bArr, bArr.length);
        zzecVar.zzl(i10 * 8);
        this.zza = zzecVar.zzd(16);
        this.zzb = zzecVar.zzd(16);
        this.zzc = zzecVar.zzd(24);
        this.zzd = zzecVar.zzd(24);
        int zzd = zzecVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzecVar.zzd(3) + 1;
        int zzd2 = zzecVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzecVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
