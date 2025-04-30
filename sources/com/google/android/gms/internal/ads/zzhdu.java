package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhdu {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhdu() {
    }

    public static /* bridge */ /* synthetic */ zzhac zza(zzhdu zzhduVar, zzhac zzhacVar, zzhac zzhacVar2) {
        zzhduVar.zzb(zzhacVar);
        zzhduVar.zzb(zzhacVar2);
        zzhac zzhacVar3 = (zzhac) zzhduVar.zza.pop();
        while (!zzhduVar.zza.isEmpty()) {
            zzhacVar3 = new zzhdy((zzhac) zzhduVar.zza.pop(), zzhacVar3);
        }
        return zzhacVar3;
    }

    private final void zzb(zzhac zzhacVar) {
        zzhac zzhacVar2;
        zzhac zzhacVar3;
        if (zzhacVar.zzh()) {
            int zzc = zzc(zzhacVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhdy.zzc(zzc + 1);
            if (!arrayDeque.isEmpty() && ((zzhac) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzhdy.zzc(zzc);
                zzhac zzhacVar4 = (zzhac) this.zza.pop();
                while (true) {
                    if (this.zza.isEmpty() || ((zzhac) this.zza.peek()).zzd() >= zzc3) {
                        break;
                    } else {
                        zzhacVar4 = new zzhdy((zzhac) this.zza.pop(), zzhacVar4);
                    }
                }
                zzhdy zzhdyVar = new zzhdy(zzhacVar4, zzhacVar);
                while (!this.zza.isEmpty()) {
                    int zzc4 = zzc(zzhdyVar.zzd()) + 1;
                    ArrayDeque arrayDeque2 = this.zza;
                    if (((zzhac) arrayDeque2.peek()).zzd() >= zzhdy.zzc(zzc4)) {
                        break;
                    } else {
                        zzhdyVar = new zzhdy((zzhac) this.zza.pop(), zzhdyVar);
                    }
                }
                this.zza.push(zzhdyVar);
                return;
            }
            this.zza.push(zzhacVar);
            return;
        }
        if (zzhacVar instanceof zzhdy) {
            zzhdy zzhdyVar2 = (zzhdy) zzhacVar;
            zzhacVar2 = zzhdyVar2.zzd;
            zzb(zzhacVar2);
            zzhacVar3 = zzhdyVar2.zze;
            zzb(zzhacVar3);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzhacVar.getClass())));
    }

    private static final int zzc(int i9) {
        int binarySearch = Arrays.binarySearch(zzhdy.zza, i9);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public /* synthetic */ zzhdu(zzhdt zzhdtVar) {
    }
}
