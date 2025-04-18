package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhax {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhax() {
    }

    public static /* bridge */ /* synthetic */ zzgxp zza(zzhax zzhaxVar, zzgxp zzgxpVar, zzgxp zzgxpVar2) {
        zzhaxVar.zzb(zzgxpVar);
        zzhaxVar.zzb(zzgxpVar2);
        zzgxp zzgxpVar3 = (zzgxp) zzhaxVar.zza.pop();
        while (!zzhaxVar.zza.isEmpty()) {
            zzgxpVar3 = new zzhba((zzgxp) zzhaxVar.zza.pop(), zzgxpVar3);
        }
        return zzgxpVar3;
    }

    private final void zzb(zzgxp zzgxpVar) {
        zzgxp zzgxpVar2;
        zzgxp zzgxpVar3;
        if (zzgxpVar.zzh()) {
            int zzc = zzc(zzgxpVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhba.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzgxp) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzhba.zzc(zzc);
                zzgxp zzgxpVar4 = (zzgxp) this.zza.pop();
                while (true) {
                    if (this.zza.isEmpty() || ((zzgxp) this.zza.peek()).zzd() >= zzc3) {
                        break;
                    } else {
                        zzgxpVar4 = new zzhba((zzgxp) this.zza.pop(), zzgxpVar4);
                    }
                }
                zzhba zzhbaVar = new zzhba(zzgxpVar4, zzgxpVar);
                while (!this.zza.isEmpty()) {
                    int zzc4 = zzc(zzhbaVar.zzd()) + 1;
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzgxp) arrayDeque2.peek()).zzd() >= zzhba.zzc(zzc4)) {
                        break;
                    } else {
                        zzhbaVar = new zzhba((zzgxp) this.zza.pop(), zzhbaVar);
                    }
                }
                this.zza.push(zzhbaVar);
                return;
            }
            this.zza.push(zzgxpVar);
            return;
        }
        if (zzgxpVar instanceof zzhba) {
            zzhba zzhbaVar2 = (zzhba) zzgxpVar;
            zzgxpVar2 = zzhbaVar2.zzd;
            zzb(zzgxpVar2);
            zzgxpVar3 = zzhbaVar2.zze;
            zzb(zzgxpVar3);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgxpVar.getClass())));
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzhba.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzhax(zzhaz zzhazVar) {
    }
}
