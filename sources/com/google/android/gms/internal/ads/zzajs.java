package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzajs extends zzajw {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzed zzedVar) {
        return zzk(zzedVar, zza);
    }

    private static boolean zzk(zzed zzedVar, byte[] bArr) {
        if (zzedVar.zzb() < 8) {
            return false;
        }
        int zzd = zzedVar.zzd();
        byte[] bArr2 = new byte[8];
        zzedVar.zzH(bArr2, 0, 8);
        zzedVar.zzL(zzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final long zza(zzed zzedVar) {
        return zzg(zzadm.zzd(zzedVar.zzN()));
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final boolean zzc(zzed zzedVar, long j3, zzajt zzajtVar) throws zzbh {
        if (zzk(zzedVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzedVar.zzN(), zzedVar.zze());
            int i10 = copyOf[9] & UByte.MAX_VALUE;
            List zze = zzadm.zze(copyOf);
            if (zzajtVar.zza == null) {
                zzab zzabVar = new zzab();
                zzabVar.zzZ(MimeTypes.AUDIO_OPUS);
                zzabVar.zzz(i10);
                zzabVar.zzaa(48000);
                zzabVar.zzM(zze);
                zzajtVar.zza = zzabVar.zzaf();
                return true;
            }
        } else if (zzk(zzedVar, zzb)) {
            zzdb.zzb(zzajtVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzedVar.zzM(8);
                zzbd zzb2 = zzaed.zzb(zzfzo.zzm(zzaed.zzc(zzedVar, false, false).zza));
                if (zzb2 != null) {
                    zzab zzb3 = zzajtVar.zza.zzb();
                    zzb3.zzS(zzb2.zzd(zzajtVar.zza.zzl));
                    zzajtVar.zza = zzb3.zzaf();
                }
            }
        } else {
            zzdb.zzb(zzajtVar.zza);
            return false;
        }
        return true;
    }
}
