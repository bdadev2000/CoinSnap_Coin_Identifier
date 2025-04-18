package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzalo implements zzaki {
    private final zzed zza = new zzed();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        boolean z10;
        zzct zzp;
        boolean z11;
        this.zza.zzJ(bArr, i11 + i10);
        this.zza.zzL(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar = this.zza;
            if (zzedVar.zzb() > 0) {
                if (zzedVar.zzb() >= 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zze(z10, "Incomplete Mp4Webvtt Top Level box header found.");
                zzed zzedVar2 = this.zza;
                int zzg = zzedVar2.zzg() - 8;
                if (zzedVar2.zzg() == 1987343459) {
                    zzed zzedVar3 = this.zza;
                    CharSequence charSequence = null;
                    zzcr zzcrVar = null;
                    while (zzg > 0) {
                        if (zzg >= 8) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zzdb.zze(z11, "Incomplete vtt cue box header found.");
                        int zzg2 = zzedVar3.zzg();
                        int zzg3 = zzedVar3.zzg();
                        int i12 = zzg - 8;
                        int i13 = zzg2 - 8;
                        String zzC = zzen.zzC(zzedVar3.zzN(), zzedVar3.zzd(), i13);
                        zzedVar3.zzM(i13);
                        if (zzg3 == 1937011815) {
                            zzcrVar = zzaly.zzb(zzC);
                        } else if (zzg3 == 1885436268) {
                            charSequence = zzaly.zza(null, zzC.trim(), Collections.emptyList());
                        }
                        zzg = i12 - i13;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (zzcrVar != null) {
                        zzcrVar.zzl(charSequence);
                        zzp = zzcrVar.zzp();
                    } else {
                        zzalw zzalwVar = new zzalw();
                        zzalwVar.zzc = charSequence;
                        zzp = zzalwVar.zza().zzp();
                    }
                    arrayList.add(zzp);
                } else {
                    this.zza.zzM(zzg);
                }
            } else {
                zzdgVar.zza(new zzaka(arrayList, C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
        }
    }
}
