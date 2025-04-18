package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgco extends zzgba {
    static final zzgba zza = new zzgco(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgco(Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static zzgco zzj(int i2, Object[] objArr, zzgaz zzgazVar) {
        byte[] bArr;
        int i3 = i2;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (zzgco) zza;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArr2[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr2[1];
            Objects.requireNonNull(obj3);
            zzfzu.zzb(obj2, obj3);
            return new zzgco(null, objArr2, 1);
        }
        zzfxz.zzb(i3, objArr2.length >> 1, FirebaseAnalytics.Param.INDEX);
        int zzh = zzgbc.zzh(i2);
        if (i3 == 1) {
            Object obj4 = objArr2[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr2[1];
            Objects.requireNonNull(obj5);
            zzfzu.zzb(obj4, obj5);
            i3 = 1;
        } else {
            int i4 = zzh - 1;
            char c2 = 65535;
            if (zzh <= 128) {
                bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i5 + i5;
                    int i8 = i6 + i6;
                    Object obj6 = objArr2[i8];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr2[i8 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzfzu.zzb(obj6, obj7);
                    int zza2 = zzgap.zza(obj6.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i5 < i6) {
                                objArr2[i7] = obj6;
                                objArr2[i7 ^ 1] = obj7;
                            }
                            i5++;
                        } else {
                            if (obj6.equals(objArr2[i10])) {
                                int i11 = i10 ^ 1;
                                Object obj8 = objArr2[i11];
                                Objects.requireNonNull(obj8);
                                zzgay zzgayVar = new zzgay(obj6, obj7, obj8);
                                objArr2[i11] = obj7;
                                obj = zzgayVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                }
                if (i5 != i3) {
                    obj = new Object[]{bArr, Integer.valueOf(i5), obj};
                }
                obj = bArr;
            } else if (zzh <= 32768) {
                bArr = new short[zzh];
                Arrays.fill(bArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj9 = objArr2[i15];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArr2[i15 ^ 1];
                    Objects.requireNonNull(obj10);
                    zzfzu.zzb(obj9, obj10);
                    int zza3 = zzgap.zza(obj9.hashCode());
                    while (true) {
                        int i16 = zza3 & i4;
                        char c3 = (char) bArr[i16];
                        if (c3 == 65535) {
                            bArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArr2[i14] = obj9;
                                objArr2[i14 ^ 1] = obj10;
                            }
                            i12++;
                        } else {
                            if (obj9.equals(objArr2[c3])) {
                                int i17 = c3 ^ 1;
                                Object obj11 = objArr2[i17];
                                Objects.requireNonNull(obj11);
                                zzgay zzgayVar2 = new zzgay(obj9, obj10, obj11);
                                objArr2[i17] = obj10;
                                obj = zzgayVar2;
                                break;
                            }
                            zza3 = i16 + 1;
                        }
                    }
                }
                if (i12 != i3) {
                    obj = new Object[]{bArr, Integer.valueOf(i12), obj};
                }
                obj = bArr;
            } else {
                bArr = new int[zzh];
                Arrays.fill((int[]) bArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i3) {
                    int i20 = i19 + i19;
                    int i21 = i18 + i18;
                    Object obj12 = objArr2[i21];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArr2[i21 ^ 1];
                    Objects.requireNonNull(obj13);
                    zzfzu.zzb(obj12, obj13);
                    int zza4 = zzgap.zza(obj12.hashCode());
                    while (true) {
                        int i22 = zza4 & i4;
                        ?? r15 = bArr[i22];
                        if (r15 == c2) {
                            bArr[i22] = i20;
                            if (i19 < i18) {
                                objArr2[i20] = obj12;
                                objArr2[i20 ^ 1] = obj13;
                            }
                            i19++;
                        } else {
                            if (obj12.equals(objArr2[r15])) {
                                int i23 = r15 ^ 1;
                                Object obj14 = objArr2[i23];
                                Objects.requireNonNull(obj14);
                                zzgay zzgayVar3 = new zzgay(obj12, obj13, obj14);
                                objArr2[i23] = obj13;
                                obj = zzgayVar3;
                                break;
                            }
                            zza4 = i22 + 1;
                            c2 = 65535;
                        }
                    }
                    i18++;
                    c2 = 65535;
                }
                if (i19 != i3) {
                    obj = new Object[]{bArr, Integer.valueOf(i19), obj};
                }
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            zzgay zzgayVar4 = (zzgay) objArr3[2];
            if (zzgazVar == null) {
                throw zzgayVar4.zza();
            }
            zzgazVar.zzc = zzgayVar4;
            Object obj15 = objArr3[0];
            int intValue = ((Integer) objArr3[1]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj = obj15;
            i3 = intValue;
        }
        return new zzgco(obj, objArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgba, java.util.Map
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
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
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
            int r1 = com.google.android.gms.internal.ads.zzgap.zza(r1)
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
            int r1 = com.google.android.gms.internal.ads.zzgap.zza(r1)
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
            int r6 = com.google.android.gms.internal.ads.zzgap.zza(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgco.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgas zza() {
        return new zzgcn(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgbc zzf() {
        return new zzgcl(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final zzgbc zzg() {
        return new zzgcm(this, new zzgcn(this.zzb, 0, this.zzd));
    }
}
