package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes.dex */
public final class c2 extends com.bumptech.glide.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1356o;

    public static int Q(byte[] bArr, int i10, long j3, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return e2.d(i10, b2.h(bArr, j3), b2.h(bArr, j3 + 1));
                }
                throw new AssertionError();
            }
            return e2.c(i10, b2.h(bArr, j3));
        }
        c2 c2Var = e2.a;
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String N(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c2.N(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c2.O(java.lang.CharSequence, byte[], int, int):int");
    }

    public final int P(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i10;
        switch (this.f1356o) {
            case 0:
                break;
            default:
                if ((i13 | i11 | (bArr.length - i11)) >= 0) {
                    long j3 = i13;
                    int i14 = (int) (i11 - j3);
                    if (i14 < 16) {
                        i12 = 0;
                    } else {
                        int i15 = 8 - (((int) j3) & 7);
                        long j10 = j3;
                        i12 = 0;
                        while (true) {
                            if (i12 < i15) {
                                long j11 = j10 + 1;
                                if (b2.h(bArr, j10) >= 0) {
                                    i12++;
                                    j10 = j11;
                                }
                            } else {
                                while (true) {
                                    int i16 = i12 + 8;
                                    if (i16 <= i14 && (b2.n(bArr, b2.f1351f + j10) & (-9187201950435737472L)) == 0) {
                                        j10 += 8;
                                        i12 = i16;
                                    }
                                }
                                while (true) {
                                    if (i12 < i14) {
                                        long j12 = j10 + 1;
                                        if (b2.h(bArr, j10) >= 0) {
                                            i12++;
                                            j10 = j12;
                                        }
                                    } else {
                                        i12 = i14;
                                    }
                                }
                            }
                        }
                    }
                    int i17 = i14 - i12;
                    long j13 = j3 + i12;
                    while (true) {
                        byte b3 = 0;
                        while (true) {
                            if (i17 > 0) {
                                long j14 = j13 + 1;
                                b3 = b2.h(bArr, j13);
                                if (b3 >= 0) {
                                    i17--;
                                    j13 = j14;
                                } else {
                                    j13 = j14;
                                }
                            }
                        }
                        if (i17 == 0) {
                            return 0;
                        }
                        int i18 = i17 - 1;
                        if (b3 < -32) {
                            if (i18 == 0) {
                                return b3;
                            }
                            i17 = i18 - 1;
                            if (b3 < -62) {
                                break;
                            } else {
                                long j15 = j13 + 1;
                                if (b2.h(bArr, j13) > -65) {
                                    break;
                                } else {
                                    j13 = j15;
                                }
                            }
                        } else if (b3 < -16) {
                            if (i18 < 2) {
                                return Q(bArr, b3, j13, i18);
                            }
                            i17 = i18 - 2;
                            long j16 = j13 + 1;
                            byte h10 = b2.h(bArr, j13);
                            if (h10 <= -65 && ((b3 != -32 || h10 >= -96) && (b3 != -19 || h10 < -96))) {
                                j13 = j16 + 1;
                                if (b2.h(bArr, j16) > -65) {
                                    break;
                                }
                            }
                        } else {
                            if (i18 < 3) {
                                return Q(bArr, b3, j13, i18);
                            }
                            i17 = i18 - 3;
                            long j17 = j13 + 1;
                            byte h11 = b2.h(bArr, j13);
                            if (h11 <= -65 && (((h11 + 112) + (b3 << Ascii.FS)) >> 30) == 0) {
                                long j18 = j17 + 1;
                                if (b2.h(bArr, j17) > -65) {
                                    break;
                                } else {
                                    long j19 = j18 + 1;
                                    if (b2.h(bArr, j18) > -65) {
                                        break;
                                    } else {
                                        j13 = j19;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                break;
        }
        while (i13 < i11 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 < i11) {
            while (i13 < i11) {
                int i19 = i13 + 1;
                byte b10 = bArr[i13];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i19 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i13 = i19 + 1;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i19 >= i11 - 1) {
                            return e2.a(bArr, i19, i11);
                        }
                        int i20 = i19 + 1;
                        byte b11 = bArr[i19];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i13 = i20 + 1;
                            if (bArr[i20] > -65) {
                            }
                        }
                    } else {
                        if (i19 >= i11 - 2) {
                            return e2.a(bArr, i19, i11);
                        }
                        int i21 = i19 + 1;
                        byte b12 = bArr[i19];
                        if (b12 <= -65 && (((b12 + 112) + (b10 << Ascii.FS)) >> 30) == 0) {
                            int i22 = i21 + 1;
                            if (bArr[i21] <= -65) {
                                i19 = i22 + 1;
                                if (bArr[i22] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i13 = i19;
            }
        }
        return 0;
    }
}
