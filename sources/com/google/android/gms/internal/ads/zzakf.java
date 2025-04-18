package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzakf extends zzakj {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzek zzekVar) {
        return zzk(zzekVar, zza);
    }

    private static boolean zzk(zzek zzekVar, byte[] bArr) {
        if (zzekVar.zzb() < 8) {
            return false;
        }
        int zzd = zzekVar.zzd();
        byte[] bArr2 = new byte[8];
        zzekVar.zzH(bArr2, 0, 8);
        zzekVar.zzL(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final long zza(zzek zzekVar) {
        return zzg(zzadw.zzd(zzekVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    public final void zzb(boolean z2) {
        super.zzb(z2);
        if (z2) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzek zzekVar, long j2, zzakg zzakgVar) throws zzbo {
        if (zzk(zzekVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzekVar.zzN(), zzekVar.zze());
            int i2 = copyOf[9] & UnsignedBytes.MAX_VALUE;
            List zze = zzadw.zze(copyOf);
            if (zzakgVar.zza == null) {
                zzad zzadVar = new zzad();
                zzadVar.zzZ("audio/opus");
                zzadVar.zzz(i2);
                zzadVar.zzaa(48000);
                zzadVar.zzM(zze);
                zzakgVar.zza = zzadVar.zzaf();
                return true;
            }
        } else {
            if (!zzk(zzekVar, zzb)) {
                zzdi.zzb(zzakgVar.zza);
                return false;
            }
            zzdi.zzb(zzakgVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzekVar.zzM(8);
                zzbk zzb2 = zzaen.zzb(zzgax.zzm(zzaen.zzc(zzekVar, false, false).zza));
                if (zzb2 != null) {
                    zzad zzb3 = zzakgVar.zza.zzb();
                    zzb3.zzS(zzb2.zzd(zzakgVar.zza.zzk));
                    zzakgVar.zza = zzb3.zzaf();
                }
            }
        }
        return true;
    }
}
