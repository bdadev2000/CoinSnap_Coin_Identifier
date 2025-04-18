package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlp extends zzhr {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzcc[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzlp(java.util.Collection r7, com.google.android.gms.internal.ads.zzwq r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzcc[] r0 = new com.google.android.gms.internal.ads.zzcc[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzky r4 = (com.google.android.gms.internal.ads.zzky) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzcc r4 = r4.zza()
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
            com.google.android.gms.internal.ads.zzky r3 = (com.google.android.gms.internal.ads.zzky) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlp.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzwq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final int zzq(int i2) {
        return zzeu.zzb(this.zze, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final int zzr(int i2) {
        return zzeu.zzb(this.zzf, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final int zzs(int i2) {
        return this.zze[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final int zzt(int i2) {
        return this.zzf[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final zzcc zzu(int i2) {
        return this.zzg[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Object zzv(int i2) {
        return this.zzh[i2];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlp zzx(zzwq zzwqVar) {
        zzcc[] zzccVarArr = new zzcc[this.zzg.length];
        int i2 = 0;
        while (true) {
            zzcc[] zzccVarArr2 = this.zzg;
            if (i2 >= zzccVarArr2.length) {
                return new zzlp(zzccVarArr, this.zzh, zzwqVar);
            }
            zzccVarArr[i2] = new zzlo(this, zzccVarArr2[i2]);
            i2++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlp(zzcc[] zzccVarArr, Object[] objArr, zzwq zzwqVar) {
        super(false, zzwqVar);
        int i2 = 0;
        this.zzg = zzccVarArr;
        int length = zzccVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < zzccVarArr.length) {
            zzcc zzccVar = zzccVarArr[i2];
            this.zzg[i5] = zzccVar;
            this.zzf[i5] = i3;
            this.zze[i5] = i4;
            i3 += zzccVar.zzc();
            i4 += this.zzg[i5].zzb();
            this.zzi.put(objArr[i5], Integer.valueOf(i5));
            i2++;
            i5++;
        }
        this.zzc = i3;
        this.zzd = i4;
    }
}
