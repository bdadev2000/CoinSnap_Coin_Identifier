package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzml extends zzio {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzdc[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzml(java.util.Collection r7, com.google.android.gms.internal.ads.zzxi r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzdc[] r0 = new com.google.android.gms.internal.ads.zzdc[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzlu r4 = (com.google.android.gms.internal.ads.zzlu) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzdc r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzlu r3 = (com.google.android.gms.internal.ads.zzlu) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzml.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzxi):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final int zzq(int i9) {
        return zzgd.zzb(this.zzf, i9 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final int zzr(int i9) {
        return zzgd.zzb(this.zzg, i9 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final int zzs(int i9) {
        return this.zzf[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final int zzt(int i9) {
        return this.zzg[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final zzdc zzu(int i9) {
        return this.zzh[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    public final Object zzv(int i9) {
        return this.zzi[i9];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzml zzx(zzxi zzxiVar) {
        zzdc[] zzdcVarArr = new zzdc[this.zzh.length];
        int i9 = 0;
        while (true) {
            zzdc[] zzdcVarArr2 = this.zzh;
            if (i9 < zzdcVarArr2.length) {
                zzdcVarArr[i9] = new zzmk(this, zzdcVarArr2[i9]);
                i9++;
            } else {
                return new zzml(zzdcVarArr, this.zzi, zzxiVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzml(zzdc[] zzdcVarArr, Object[] objArr, zzxi zzxiVar) {
        super(false, zzxiVar);
        int i9 = 0;
        this.zzh = zzdcVarArr;
        int length = zzdcVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < zzdcVarArr.length) {
            zzdc zzdcVar = zzdcVarArr[i9];
            this.zzh[i12] = zzdcVar;
            this.zzg[i12] = i10;
            this.zzf[i12] = i11;
            i10 += zzdcVar.zzc();
            i11 += this.zzh[i12].zzb();
            this.zzj.put(objArr[i12], Integer.valueOf(i12));
            i9++;
            i12++;
        }
        this.zzd = i10;
        this.zze = i11;
    }
}
