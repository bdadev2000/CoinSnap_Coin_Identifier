package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class zzale extends zzali {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfu zzfuVar) {
        return zzk(zzfuVar, zza);
    }

    private static boolean zzk(zzfu zzfuVar, byte[] bArr) {
        if (zzfuVar.zzb() < 8) {
            return false;
        }
        int zzd = zzfuVar.zzd();
        byte[] bArr2 = new byte[8];
        zzfuVar.zzG(bArr2, 0, 8);
        zzfuVar.zzK(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final long zza(zzfu zzfuVar) {
        return zzg(zzaep.zzd(zzfuVar.zzM()));
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(boolean z8) {
        super.zzb(z8);
        if (z8) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final boolean zzc(zzfu zzfuVar, long j7, zzalf zzalfVar) throws zzch {
        if (zzk(zzfuVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze());
            int i9 = copyOf[9] & 255;
            List zze = zzaep.zze(copyOf);
            if (zzalfVar.zza == null) {
                zzal zzalVar = new zzal();
                zzalVar.zzX(MimeTypes.AUDIO_OPUS);
                zzalVar.zzy(i9);
                zzalVar.zzY(48000);
                zzalVar.zzL(zze);
                zzalfVar.zza = zzalVar.zzad();
                return true;
            }
        } else if (zzk(zzfuVar, zzb)) {
            zzeq.zzb(zzalfVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzfuVar.zzL(8);
                zzcd zzb2 = zzafg.zzb(zzgbc.zzl(zzafg.zzc(zzfuVar, false, false).zzb));
                if (zzb2 != null) {
                    zzal zzb3 = zzalfVar.zza.zzb();
                    zzb3.zzQ(zzb2.zzd(zzalfVar.zza.zzl));
                    zzalfVar.zza = zzb3.zzad();
                }
            }
        } else {
            zzeq.zzb(zzalfVar.zza);
            return false;
        }
        return true;
    }
}
