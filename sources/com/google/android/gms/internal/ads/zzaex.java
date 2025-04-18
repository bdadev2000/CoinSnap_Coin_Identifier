package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.j;
import java.util.Collections;

/* loaded from: classes3.dex */
final class zzaex extends zzafb {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaex(zzadx zzadxVar) {
        super(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zza(zzed zzedVar) throws zzafa {
        String str;
        if (!this.zzc) {
            int zzm = zzedVar.zzm();
            int i10 = zzm >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzm >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzZ(MimeTypes.AUDIO_MPEG);
                zzabVar.zzz(1);
                zzabVar.zzaa(i11);
                this.zza.zzl(zzabVar.zzaf());
                this.zzd = true;
            } else if (i10 != 7 && i10 != 8) {
                if (i10 != 10) {
                    throw new zzafa(j.i("Audio format not supported: ", i10));
                }
            } else {
                zzab zzabVar2 = new zzab();
                if (i10 == 7) {
                    str = MimeTypes.AUDIO_ALAW;
                } else {
                    str = MimeTypes.AUDIO_MLAW;
                }
                zzabVar2.zzZ(str);
                zzabVar2.zzz(1);
                zzabVar2.zzaa(8000);
                this.zza.zzl(zzabVar2.zzaf());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzedVar.zzM(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final boolean zzb(zzed zzedVar, long j3) throws zzbh {
        if (this.zze == 2) {
            int zzb2 = zzedVar.zzb();
            this.zza.zzq(zzedVar, zzb2);
            this.zza.zzs(j3, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzedVar.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzedVar.zzb();
            byte[] bArr = new byte[zzb3];
            zzedVar.zzH(bArr, 0, zzb3);
            zzabm zza = zzabo.zza(bArr);
            zzab zzabVar = new zzab();
            zzabVar.zzZ(MimeTypes.AUDIO_AAC);
            zzabVar.zzA(zza.zzc);
            zzabVar.zzz(zza.zzb);
            zzabVar.zzaa(zza.zza);
            zzabVar.zzM(Collections.singletonList(bArr));
            this.zza.zzl(zzabVar.zzaf());
            this.zzd = true;
            return false;
        }
        if (this.zze == 10 && zzm != 1) {
            return false;
        }
        int zzb4 = zzedVar.zzb();
        this.zza.zzq(zzedVar, zzb4);
        this.zza.zzs(j3, 1, zzb4, 0, null);
        return true;
    }
}
