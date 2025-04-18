package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzamb implements zzakv {
    private final zzek zza = new zzek();

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        zzdb zzp;
        this.zza.zzJ(bArr, i3 + i2);
        this.zza.zzL(i2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzek zzekVar = this.zza;
            if (zzekVar.zzb() <= 0) {
                zzdnVar.zza(new zzakn(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzdi.zze(zzekVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzek zzekVar2 = this.zza;
            int zzg = zzekVar2.zzg() - 8;
            if (zzekVar2.zzg() == 1987343459) {
                zzek zzekVar3 = this.zza;
                CharSequence charSequence = null;
                zzcz zzczVar = null;
                while (zzg > 0) {
                    zzdi.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                    int zzg2 = zzekVar3.zzg();
                    int zzg3 = zzekVar3.zzg();
                    int i4 = zzg - 8;
                    int i5 = zzg2 - 8;
                    String zzB = zzeu.zzB(zzekVar3.zzN(), zzekVar3.zzd(), i5);
                    zzekVar3.zzM(i5);
                    if (zzg3 == 1937011815) {
                        zzczVar = zzaml.zzb(zzB);
                    } else if (zzg3 == 1885436268) {
                        charSequence = zzaml.zza(null, zzB.trim(), Collections.emptyList());
                    }
                    zzg = i4 - i5;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzczVar != null) {
                    zzczVar.zzl(charSequence);
                    zzp = zzczVar.zzp();
                } else {
                    zzamk zzamkVar = new zzamk();
                    zzamkVar.zzc = charSequence;
                    zzp = zzamkVar.zza().zzp();
                }
                arrayList.add(zzp);
            } else {
                this.zza.zzM(zzg);
            }
        }
    }
}
