package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzaka extends zzakj {

    @Nullable
    private zzadm zza;

    @Nullable
    private zzajz zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final long zza(zzek zzekVar) {
        if (!zzd(zzekVar.zzN())) {
            return -1L;
        }
        int i2 = (zzekVar.zzN()[2] & UnsignedBytes.MAX_VALUE) >> 4;
        if (i2 != 6) {
            if (i2 == 7) {
                i2 = 7;
            }
            int zza = zzadi.zza(zzekVar, i2);
            zzekVar.zzL(0);
            return zza;
        }
        zzekVar.zzM(4);
        zzekVar.zzx();
        int zza2 = zzadi.zza(zzekVar, i2);
        zzekVar.zzL(0);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final void zzb(boolean z2) {
        super.zzb(z2);
        if (z2) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzek zzekVar, long j2, zzakg zzakgVar) {
        byte[] zzN = zzekVar.zzN();
        zzadm zzadmVar = this.zza;
        if (zzadmVar == null) {
            zzadm zzadmVar2 = new zzadm(zzN, 17);
            this.zza = zzadmVar2;
            zzakgVar.zza = zzadmVar2.zzc(Arrays.copyOfRange(zzN, 9, zzekVar.zze()), null);
            return true;
        }
        if ((zzN[0] & Byte.MAX_VALUE) == 3) {
            zzadl zzb = zzadj.zzb(zzekVar);
            zzadm zzf = zzadmVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzajz(zzf, zzb);
            return true;
        }
        if (!zzd(zzN)) {
            return true;
        }
        zzajz zzajzVar = this.zzb;
        if (zzajzVar != null) {
            zzajzVar.zza(j2);
            zzakgVar.zzb = this.zzb;
        }
        zzakgVar.zza.getClass();
        return false;
    }
}
