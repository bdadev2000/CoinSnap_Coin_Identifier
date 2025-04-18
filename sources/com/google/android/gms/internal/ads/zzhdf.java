package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhdf {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhdf() {
    }

    public static /* bridge */ /* synthetic */ zzgzs zza(zzhdf zzhdfVar, zzgzs zzgzsVar, zzgzs zzgzsVar2) {
        zzhdfVar.zzb(zzgzsVar);
        zzhdfVar.zzb(zzgzsVar2);
        zzgzs zzgzsVar3 = (zzgzs) zzhdfVar.zza.pop();
        while (!zzhdfVar.zza.isEmpty()) {
            zzgzsVar3 = new zzhdj((zzgzs) zzhdfVar.zza.pop(), zzgzsVar3);
        }
        return zzgzsVar3;
    }

    private final void zzb(zzgzs zzgzsVar) {
        zzgzs zzgzsVar2;
        zzgzs zzgzsVar3;
        if (!zzgzsVar.zzh()) {
            if (!(zzgzsVar instanceof zzhdj)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgzsVar.getClass())));
            }
            zzhdj zzhdjVar = (zzhdj) zzgzsVar;
            zzgzsVar2 = zzhdjVar.zzd;
            zzb(zzgzsVar2);
            zzgzsVar3 = zzhdjVar.zze;
            zzb(zzgzsVar3);
            return;
        }
        int zzc = zzc(zzgzsVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzhdj.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgzs) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgzsVar);
            return;
        }
        int zzc3 = zzhdj.zzc(zzc);
        zzgzs zzgzsVar4 = (zzgzs) this.zza.pop();
        while (true) {
            if (this.zza.isEmpty() || ((zzgzs) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgzsVar4 = new zzhdj((zzgzs) this.zza.pop(), zzgzsVar4);
            }
        }
        zzhdj zzhdjVar2 = new zzhdj(zzgzsVar4, zzgzsVar);
        while (!this.zza.isEmpty()) {
            int zzc4 = zzc(zzhdjVar2.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgzs) arrayDeque2.peek()).zzd() >= zzhdj.zzc(zzc4)) {
                break;
            } else {
                zzhdjVar2 = new zzhdj((zzgzs) this.zza.pop(), zzhdjVar2);
            }
        }
        this.zza.push(zzhdjVar2);
    }

    private static final int zzc(int i2) {
        int binarySearch = Arrays.binarySearch(zzhdj.zza, i2);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzhdf(zzhde zzhdeVar) {
    }
}
