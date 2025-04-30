package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzanb implements zzalv {
    private final zzfu zza = new zzfu();

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i9, int i10, zzalu zzaluVar, zzev zzevVar) {
        boolean z8;
        zzei zzp;
        boolean z9;
        this.zza.zzI(bArr, i10 + i9);
        this.zza.zzK(i9);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfu zzfuVar = this.zza;
            if (zzfuVar.zzb() > 0) {
                if (zzfuVar.zzb() >= 8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zze(z8, "Incomplete Mp4Webvtt Top Level box header found.");
                zzfu zzfuVar2 = this.zza;
                int zzg = zzfuVar2.zzg() - 8;
                if (zzfuVar2.zzg() == 1987343459) {
                    zzfu zzfuVar3 = this.zza;
                    CharSequence charSequence = null;
                    zzeg zzegVar = null;
                    while (zzg > 0) {
                        if (zzg >= 8) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        zzeq.zze(z9, "Incomplete vtt cue box header found.");
                        int zzg2 = zzfuVar3.zzg();
                        int zzg3 = zzfuVar3.zzg();
                        int i11 = zzg - 8;
                        int i12 = zzg2 - 8;
                        String zzB = zzgd.zzB(zzfuVar3.zzM(), zzfuVar3.zzd(), i12);
                        zzfuVar3.zzL(i12);
                        if (zzg3 == 1937011815) {
                            zzegVar = zzanl.zzb(zzB);
                        } else if (zzg3 == 1885436268) {
                            charSequence = zzanl.zza(null, zzB.trim(), Collections.emptyList());
                        }
                        zzg = i11 - i12;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (zzegVar != null) {
                        zzegVar.zzl(charSequence);
                        zzp = zzegVar.zzp();
                    } else {
                        zzank zzankVar = new zzank();
                        zzankVar.zzc = charSequence;
                        zzp = zzankVar.zza().zzp();
                    }
                    arrayList.add(zzp);
                } else {
                    this.zza.zzL(zzg);
                }
            } else {
                zzevVar.zza(new zzaln(arrayList, C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
