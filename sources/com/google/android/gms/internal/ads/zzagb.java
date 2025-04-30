package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes2.dex */
final class zzagb extends zzagg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzagb(zzafa zzafaVar) {
        super(zzafaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zza(zzfu zzfuVar) throws zzagf {
        String str;
        if (!this.zzc) {
            int zzm = zzfuVar.zzm();
            int i9 = zzm >> 4;
            this.zze = i9;
            if (i9 == 2) {
                int i10 = zzb[(zzm >> 2) & 3];
                zzal zzalVar = new zzal();
                zzalVar.zzX(MimeTypes.AUDIO_MPEG);
                zzalVar.zzy(1);
                zzalVar.zzY(i10);
                this.zza.zzl(zzalVar.zzad());
                this.zzd = true;
            } else if (i9 != 7 && i9 != 8) {
                if (i9 != 10) {
                    throw new zzagf(o.h(i9, "Audio format not supported: "));
                }
            } else {
                zzal zzalVar2 = new zzal();
                if (i9 == 7) {
                    str = MimeTypes.AUDIO_ALAW;
                } else {
                    str = MimeTypes.AUDIO_MLAW;
                }
                zzalVar2.zzX(str);
                zzalVar2.zzy(1);
                zzalVar2.zzY(8000);
                this.zza.zzl(zzalVar2.zzad());
                this.zzd = true;
            }
            this.zzc = true;
        } else {
            zzfuVar.zzL(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final boolean zzb(zzfu zzfuVar, long j7) throws zzch {
        if (this.zze == 2) {
            int zzb2 = zzfuVar.zzb();
            this.zza.zzq(zzfuVar, zzb2);
            this.zza.zzs(j7, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzfuVar.zzm();
        if (zzm == 0 && !this.zzd) {
            int zzb3 = zzfuVar.zzb();
            byte[] bArr = new byte[zzb3];
            zzfuVar.zzG(bArr, 0, zzb3);
            zzacp zza = zzacq.zza(bArr);
            zzal zzalVar = new zzal();
            zzalVar.zzX(MimeTypes.AUDIO_AAC);
            zzalVar.zzz(zza.zzc);
            zzalVar.zzy(zza.zzb);
            zzalVar.zzY(zza.zza);
            zzalVar.zzL(Collections.singletonList(bArr));
            this.zza.zzl(zzalVar.zzad());
            this.zzd = true;
            return false;
        }
        if (this.zze == 10 && zzm != 1) {
            return false;
        }
        int zzb4 = zzfuVar.zzb();
        this.zza.zzq(zzfuVar, zzb4);
        this.zza.zzs(j7, 1, zzb4, 0, null);
        return true;
    }
}
