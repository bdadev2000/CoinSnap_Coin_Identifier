package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class zzakw implements zzaki {
    private final zzed zza = new zzed();
    private final zzed zzb = new zzed();
    private final zzakv zzc = new zzakv();

    @Nullable
    private Inflater zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        zzed zzedVar = this.zza;
        if (zzedVar.zzb() > 0 && zzedVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzen.zzH(zzedVar, this.zzb, this.zzd)) {
                zzed zzedVar2 = this.zzb;
                zzedVar.zzJ(zzedVar2.zzN(), zzedVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar3 = this.zza;
            if (zzedVar3.zzb() >= 3) {
                zzakv zzakvVar = this.zzc;
                int zze = zzedVar3.zze();
                int zzm = zzedVar3.zzm();
                int zzq = zzedVar3.zzq();
                int zzd = zzedVar3.zzd() + zzq;
                zzct zzctVar = null;
                if (zzd > zze) {
                    zzedVar3.zzL(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzakv.zzd(zzakvVar, zzedVar3, zzq);
                                break;
                            case 21:
                                zzakv.zzb(zzakvVar, zzedVar3, zzq);
                                break;
                            case 22:
                                zzakv.zzc(zzakvVar, zzedVar3, zzq);
                                break;
                        }
                    } else {
                        zzct zza = zzakvVar.zza();
                        zzakvVar.zze();
                        zzctVar = zza;
                    }
                    zzedVar3.zzL(zzd);
                }
                if (zzctVar != null) {
                    arrayList.add(zzctVar);
                }
            } else {
                zzdgVar.zza(new zzaka(arrayList, C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
