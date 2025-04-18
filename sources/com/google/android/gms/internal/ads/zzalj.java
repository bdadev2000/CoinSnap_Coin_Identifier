package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class zzalj implements zzakv {
    private final zzek zza = new zzek();
    private final zzek zzb = new zzek();
    private final zzali zzc = new zzali();

    @Nullable
    private Inflater zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] bArr, int i2, int i3, zzaku zzakuVar, zzdn zzdnVar) {
        this.zza.zzJ(bArr, i3 + i2);
        this.zza.zzL(i2);
        zzek zzekVar = this.zza;
        if (zzekVar.zzb() > 0 && zzekVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzeu.zzG(zzekVar, this.zzb, this.zzd)) {
                zzek zzekVar2 = this.zzb;
                zzekVar.zzJ(zzekVar2.zzN(), zzekVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzek zzekVar3 = this.zza;
            if (zzekVar3.zzb() < 3) {
                zzdnVar.zza(new zzakn(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzali zzaliVar = this.zzc;
            int zze = zzekVar3.zze();
            int zzm = zzekVar3.zzm();
            int zzq = zzekVar3.zzq();
            int zzd = zzekVar3.zzd() + zzq;
            zzdb zzdbVar = null;
            if (zzd > zze) {
                zzekVar3.zzL(zze);
            } else {
                if (zzm != 128) {
                    switch (zzm) {
                        case 20:
                            zzali.zzd(zzaliVar, zzekVar3, zzq);
                            break;
                        case 21:
                            zzali.zzb(zzaliVar, zzekVar3, zzq);
                            break;
                        case 22:
                            zzali.zzc(zzaliVar, zzekVar3, zzq);
                            break;
                    }
                } else {
                    zzdbVar = zzaliVar.zza();
                    zzaliVar.zze();
                }
                zzekVar3.zzL(zzd);
            }
            if (zzdbVar != null) {
                arrayList.add(zzdbVar);
            }
        }
    }
}
