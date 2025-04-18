package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzafh extends zzafl {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzafh(zzaeh zzaehVar) {
        super(zzaehVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zza(zzek zzekVar) throws zzafk {
        if (this.zzc) {
            zzekVar.zzM(1);
        } else {
            int zzm = zzekVar.zzm();
            int i2 = zzm >> 4;
            this.zze = i2;
            if (i2 == 2) {
                int i3 = zzb[(zzm >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzZ("audio/mpeg");
                zzadVar.zzz(1);
                zzadVar.zzaa(i3);
                this.zza.zzl(zzadVar.zzaf());
                this.zzd = true;
            } else if (i2 == 7 || i2 == 8) {
                zzad zzadVar2 = new zzad();
                zzadVar2.zzZ(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zzadVar2.zzz(1);
                zzadVar2.zzaa(8000);
                this.zza.zzl(zzadVar2.zzaf());
                this.zzd = true;
            } else if (i2 != 10) {
                throw new zzafk(d.i("Audio format not supported: ", i2));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final boolean zzb(zzek zzekVar, long j2) throws zzbo {
        if (this.zze == 2) {
            int zzb2 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb2);
            this.zza.zzs(j2, 1, zzb2, 0, null);
            return true;
        }
        int zzm = zzekVar.zzm();
        if (zzm != 0 || this.zzd) {
            if (this.zze == 10 && zzm != 1) {
                return false;
            }
            int zzb3 = zzekVar.zzb();
            this.zza.zzq(zzekVar, zzb3);
            this.zza.zzs(j2, 1, zzb3, 0, null);
            return true;
        }
        int zzb4 = zzekVar.zzb();
        byte[] bArr = new byte[zzb4];
        zzekVar.zzH(bArr, 0, zzb4);
        zzabx zza = zzaby.zza(bArr);
        zzad zzadVar = new zzad();
        zzadVar.zzZ("audio/mp4a-latm");
        zzadVar.zzA(zza.zzc);
        zzadVar.zzz(zza.zzb);
        zzadVar.zzaa(zza.zza);
        zzadVar.zzM(Collections.singletonList(bArr));
        this.zza.zzl(zzadVar.zzaf());
        this.zzd = true;
        return false;
    }
}
