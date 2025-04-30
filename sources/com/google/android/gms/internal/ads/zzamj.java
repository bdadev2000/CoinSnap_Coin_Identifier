package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class zzamj implements zzalv {
    private final zzfu zza = new zzfu();
    private final zzfu zzb = new zzfu();
    private final zzami zzc = new zzami();

    @Nullable
    private Inflater zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        this.zza.zzI(bArr, i10 + i9);
        this.zza.zzK(i9);
        zzfu zzfuVar = this.zza;
        if (zzfuVar.zzb() > 0 && zzfuVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzgd.zzI(zzfuVar, this.zzb, this.zzd)) {
                zzfu zzfuVar2 = this.zzb;
                zzfuVar.zzI(zzfuVar2.zzM(), zzfuVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfu zzfuVar3 = this.zza;
            if (zzfuVar3.zzb() >= 3) {
                zzami zzamiVar = this.zzc;
                int zze = zzfuVar3.zze();
                int zzm = zzfuVar3.zzm();
                int zzq = zzfuVar3.zzq();
                int zzd = zzfuVar3.zzd() + zzq;
                zzei zzeiVar = null;
                if (zzd > zze) {
                    zzfuVar3.zzK(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzami.zzd(zzamiVar, zzfuVar3, zzq);
                                break;
                            case 21:
                                zzami.zzb(zzamiVar, zzfuVar3, zzq);
                                break;
                            case 22:
                                zzami.zzc(zzamiVar, zzfuVar3, zzq);
                                break;
                        }
                    } else {
                        zzeiVar = zzamiVar.zza();
                        zzamiVar.zze();
                    }
                    zzfuVar3.zzK(zzd);
                }
                if (zzeiVar != null) {
                    arrayList.add(zzeiVar);
                }
            } else {
                zzevVar.zza(new zzaln(arrayList, C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
