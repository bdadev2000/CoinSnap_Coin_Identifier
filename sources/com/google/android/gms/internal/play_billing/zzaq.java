package com.google.android.gms.internal.play_billing;

import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static zzaq zzf(int i2, Object[] objArr, zzah zzahVar) {
        int i3;
        byte[] bArr;
        int i4 = i2;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzaq) zza;
        }
        Object obj = null;
        if (i4 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            zzaa.zza(obj2, obj3);
            return new zzaq(null, objArr2, 1);
        }
        zzx.zzb(i4, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        int max = Math.max(i4, 2);
        if (max < 751619276) {
            i3 = Integer.highestOneBit(max - 1);
            do {
                i3 += i3;
            } while (i3 * 0.7d < max);
        } else {
            i3 = Ints.MAX_POWER_OF_TWO;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i4 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            zzaa.zza(obj4, obj5);
            i4 = 1;
        } else {
            int i5 = i3 - 1;
            char c2 = 65535;
            if (i3 <= 128) {
                bArr = new byte[i3];
                Arrays.fill(bArr, (byte) -1);
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = i6 + i6;
                    int i9 = i7 + i7;
                    Object obj6 = objArr2[i9];
                    obj6.getClass();
                    Object obj7 = objArr2[i9 ^ 1];
                    obj7.getClass();
                    zzaa.zza(obj6, obj7);
                    int zza2 = zzab.zza(obj6.hashCode());
                    while (true) {
                        int i10 = zza2 & i5;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            bArr[i10] = (byte) i8;
                            if (i6 < i7) {
                                objArr2[i8] = obj6;
                                objArr2[i8 ^ 1] = obj7;
                            }
                            i6++;
                        } else {
                            if (obj6.equals(objArr2[i11])) {
                                int i12 = i11 ^ 1;
                                Object obj8 = objArr2[i12];
                                obj8.getClass();
                                zzag zzagVar = new zzag(obj6, obj7, obj8);
                                objArr2[i12] = obj7;
                                obj = zzagVar;
                                break;
                            }
                            zza2 = i10 + 1;
                        }
                    }
                }
                if (i6 != i4) {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                }
                obj = bArr;
            } else if (i3 <= 32768) {
                bArr = new short[i3];
                Arrays.fill(bArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i4; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object obj9 = objArr2[i16];
                    obj9.getClass();
                    Object obj10 = objArr2[i16 ^ 1];
                    obj10.getClass();
                    zzaa.zza(obj9, obj10);
                    int zza3 = zzab.zza(obj9.hashCode());
                    while (true) {
                        int i17 = zza3 & i5;
                        char c3 = (char) bArr[i17];
                        if (c3 == 65535) {
                            bArr[i17] = (short) i15;
                            if (i13 < i14) {
                                objArr2[i15] = obj9;
                                objArr2[i15 ^ 1] = obj10;
                            }
                            i13++;
                        } else {
                            if (obj9.equals(objArr2[c3])) {
                                int i18 = c3 ^ 1;
                                Object obj11 = objArr2[i18];
                                obj11.getClass();
                                zzag zzagVar2 = new zzag(obj9, obj10, obj11);
                                objArr2[i18] = obj10;
                                obj = zzagVar2;
                                break;
                            }
                            zza3 = i17 + 1;
                        }
                    }
                }
                if (i13 != i4) {
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[i3];
                Arrays.fill((int[]) bArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i4) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    Object obj12 = objArr2[i22];
                    obj12.getClass();
                    Object obj13 = objArr2[i22 ^ 1];
                    obj13.getClass();
                    zzaa.zza(obj12, obj13);
                    int zza4 = zzab.zza(obj12.hashCode());
                    while (true) {
                        int i23 = zza4 & i5;
                        ?? r15 = bArr[i23];
                        if (r15 == c2) {
                            bArr[i23] = i21;
                            if (i20 < i19) {
                                objArr2[i21] = obj12;
                                objArr2[i21 ^ 1] = obj13;
                            }
                            i20++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i24 = r15 ^ 1;
                                Object obj14 = objArr2[i24];
                                obj14.getClass();
                                zzag zzagVar3 = new zzag(obj12, obj13, obj14);
                                objArr2[i24] = obj13;
                                obj = zzagVar3;
                                break;
                            }
                            zza4 = i23 + 1;
                            c2 = 65535;
                        }
                    }
                    i19++;
                    c2 = 65535;
                }
                if (i20 != i4) {
                    obj = new Object[]{bArr, Integer.valueOf(i20), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzahVar.zzc = (zzag) objArr3[2];
            Object obj15 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj15;
            i4 = intValue;
        }
        return new zzaq(obj, objArr2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzai, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzab.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzab.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.zzab.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzaq.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final zzac zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final zzaj zzc() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final zzaj zzd() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
