package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes.dex */
public final class s0 extends P {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4606c;

    public static int n(byte[] bArr, int i9, long j7, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return u0.d(i9, r0.f(bArr, j7), r0.f(bArr, j7 + 1));
                }
                throw new AssertionError();
            }
            return u0.c(i9, r0.f(bArr, j7));
        }
        P p2 = u0.f4609a;
        if (i9 > -12) {
            return -1;
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    @Override // androidx.datastore.preferences.protobuf.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.f(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.CharSequence r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.g(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final int j(byte[] bArr, int i9, int i10) {
        int i11;
        int i12 = i9;
        switch (this.f4606c) {
            case 0:
                break;
            default:
                if ((i12 | i10 | (bArr.length - i10)) >= 0) {
                    long j7 = i12;
                    int i13 = (int) (i10 - j7);
                    long j9 = 1;
                    if (i13 < 16) {
                        i11 = 0;
                    } else {
                        long j10 = j7;
                        i11 = 0;
                        while (true) {
                            if (i11 < i13) {
                                long j11 = j10 + 1;
                                if (r0.f(bArr, j10) >= 0) {
                                    i11++;
                                    j10 = j11;
                                }
                            } else {
                                i11 = i13;
                            }
                        }
                    }
                    int i14 = i13 - i11;
                    long j12 = j7 + i11;
                    while (true) {
                        byte b = 0;
                        while (true) {
                            if (i14 > 0) {
                                long j13 = j12 + j9;
                                b = r0.f(bArr, j12);
                                if (b >= 0) {
                                    i14--;
                                    j12 = j13;
                                } else {
                                    j12 = j13;
                                }
                            }
                        }
                        if (i14 == 0) {
                            return 0;
                        }
                        int i15 = i14 - 1;
                        if (b < -32) {
                            if (i15 == 0) {
                                return b;
                            }
                            i14 -= 2;
                            if (b >= -62) {
                                long j14 = j12 + j9;
                                if (r0.f(bArr, j12) <= -65) {
                                    j12 = j14;
                                    j9 = 1;
                                }
                            }
                        } else if (b < -16) {
                            if (i15 < 2) {
                                return n(bArr, b, j12, i15);
                            }
                            i14 -= 3;
                            long j15 = j12 + j9;
                            byte f9 = r0.f(bArr, j12);
                            if (f9 <= -65 && ((b != -32 || f9 >= -96) && (b != -19 || f9 < -96))) {
                                j12 += 2;
                                if (r0.f(bArr, j15) <= -65) {
                                    j9 = 1;
                                }
                            }
                        } else {
                            if (i15 < 3) {
                                return n(bArr, b, j12, i15);
                            }
                            i14 -= 4;
                            long j16 = j12 + j9;
                            byte f10 = r0.f(bArr, j12);
                            if (f10 <= -65) {
                                if ((((f10 + 112) + (b << Ascii.FS)) >> 30) == 0) {
                                    long j17 = j12 + 2;
                                    if (r0.f(bArr, j16) <= -65) {
                                        j12 += 3;
                                        if (r0.f(bArr, j17) <= -65) {
                                            j9 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        while (i12 < i10 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i10) {
            return 0;
        }
        while (i12 < i10) {
            int i16 = i12 + 1;
            byte b8 = bArr[i12];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i16 >= i10) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i12 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 < -16) {
                    if (i16 >= i10 - 1) {
                        return u0.a(bArr, i16, i10);
                    }
                    int i17 = i12 + 2;
                    byte b9 = bArr[i16];
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i12 += 3;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 >= i10 - 2) {
                    return u0.a(bArr, i16, i10);
                }
                int i18 = i12 + 2;
                byte b10 = bArr[i16];
                if (b10 <= -65) {
                    if ((((b10 + 112) + (b8 << Ascii.FS)) >> 30) == 0) {
                        int i19 = i12 + 3;
                        if (bArr[i18] <= -65) {
                            i12 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i12 = i16;
        }
        return 0;
    }
}
