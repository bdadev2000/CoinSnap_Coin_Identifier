package com.applovin.impl;

import com.applovin.impl.f9;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f24755a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f24756b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f24757c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f24758f = {69, 87, 104, Opcodes.LSHL, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f24759a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24760b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24761c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24762f;

        private b(String str, int i2, int i3, int i4, int i5, int i6) {
            this.f24759a = str;
            this.f24760b = i2;
            this.d = i3;
            this.f24761c = i4;
            this.e = i5;
            this.f24762f = i6;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i2 = position; i2 <= limit; i2++) {
            if ((xp.a(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - position;
            }
        }
        return -1;
    }

    public static int b(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f24755a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f24756b;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = f24758f;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + iArr2[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static f9 b(bh bhVar, String str, String str2, y6 y6Var) {
        bhVar.g(2);
        int i2 = f24756b[(bhVar.w() & Opcodes.CHECKCAST) >> 6];
        int w = bhVar.w();
        int i3 = d[(w & 14) >> 1];
        if ((w & 1) != 0) {
            i3++;
        }
        if (((bhVar.w() & 30) >> 1) > 0 && (2 & bhVar.w()) != 0) {
            i3 += 2;
        }
        return new f9.b().c(str).f((bhVar.a() <= 0 || (bhVar.w() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i3).n(i2).a(y6Var).e(str2).a();
    }

    public static f9 a(bh bhVar, String str, String str2, y6 y6Var) {
        int i2 = f24756b[(bhVar.w() & Opcodes.CHECKCAST) >> 6];
        int w = bhVar.w();
        int i3 = d[(w & 56) >> 3];
        if ((w & 4) != 0) {
            i3++;
        }
        return new f9.b().c(str).f("audio/ac3").c(i3).n(i2).a(y6Var).e(str2).a();
    }

    public static b a(ah ahVar) {
        int a2;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int a3;
        int i6;
        int i7;
        int i8;
        int i9;
        int e2 = ahVar.e();
        ahVar.d(40);
        boolean z2 = ahVar.a(5) > 10;
        ahVar.c(e2);
        int i10 = -1;
        if (z2) {
            ahVar.d(16);
            int a4 = ahVar.a(2);
            if (a4 == 0) {
                i10 = 0;
            } else if (a4 == 1) {
                i10 = 1;
            } else if (a4 == 2) {
                i10 = 2;
            }
            ahVar.d(3);
            a2 = (ahVar.a(11) + 1) * 2;
            int a5 = ahVar.a(2);
            if (a5 == 3) {
                i2 = f24757c[ahVar.a(2)];
                i6 = 6;
                a3 = 3;
            } else {
                a3 = ahVar.a(2);
                i6 = f24755a[a3];
                i2 = f24756b[a5];
            }
            i4 = i6 * 256;
            int a6 = ahVar.a(3);
            boolean f2 = ahVar.f();
            i3 = d[a6] + (f2 ? 1 : 0);
            ahVar.d(10);
            if (ahVar.f()) {
                ahVar.d(8);
            }
            if (a6 == 0) {
                ahVar.d(5);
                if (ahVar.f()) {
                    ahVar.d(8);
                }
            }
            if (i10 == 1 && ahVar.f()) {
                ahVar.d(16);
            }
            if (ahVar.f()) {
                if (a6 > 2) {
                    ahVar.d(2);
                }
                if ((a6 & 1) == 0 || a6 <= 2) {
                    i8 = 6;
                } else {
                    i8 = 6;
                    ahVar.d(6);
                }
                if ((a6 & 4) != 0) {
                    ahVar.d(i8);
                }
                if (f2 && ahVar.f()) {
                    ahVar.d(5);
                }
                if (i10 == 0) {
                    if (ahVar.f()) {
                        i9 = 6;
                        ahVar.d(6);
                    } else {
                        i9 = 6;
                    }
                    if (a6 == 0 && ahVar.f()) {
                        ahVar.d(i9);
                    }
                    if (ahVar.f()) {
                        ahVar.d(i9);
                    }
                    int a7 = ahVar.a(2);
                    if (a7 == 1) {
                        ahVar.d(5);
                    } else if (a7 == 2) {
                        ahVar.d(12);
                    } else if (a7 == 3) {
                        int a8 = ahVar.a(5);
                        if (ahVar.f()) {
                            ahVar.d(5);
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                ahVar.d(4);
                            }
                            if (ahVar.f()) {
                                if (ahVar.f()) {
                                    ahVar.d(4);
                                }
                                if (ahVar.f()) {
                                    ahVar.d(4);
                                }
                            }
                        }
                        if (ahVar.f()) {
                            ahVar.d(5);
                            if (ahVar.f()) {
                                ahVar.d(7);
                                if (ahVar.f()) {
                                    ahVar.d(8);
                                }
                            }
                        }
                        ahVar.d((a8 + 2) * 8);
                        ahVar.c();
                    }
                    if (a6 < 2) {
                        if (ahVar.f()) {
                            ahVar.d(14);
                        }
                        if (a6 == 0 && ahVar.f()) {
                            ahVar.d(14);
                        }
                    }
                    if (ahVar.f()) {
                        if (a3 == 0) {
                            ahVar.d(5);
                        } else {
                            for (int i11 = 0; i11 < i6; i11++) {
                                if (ahVar.f()) {
                                    ahVar.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (ahVar.f()) {
                ahVar.d(5);
                if (a6 == 2) {
                    ahVar.d(4);
                }
                if (a6 >= 6) {
                    ahVar.d(2);
                }
                if (ahVar.f()) {
                    ahVar.d(8);
                }
                if (a6 == 0 && ahVar.f()) {
                    ahVar.d(8);
                }
                if (a5 < 3) {
                    ahVar.g();
                }
            }
            if (i10 == 0 && a3 != 3) {
                ahVar.g();
            }
            if (i10 == 2 && (a3 == 3 || ahVar.f())) {
                i7 = 6;
                ahVar.d(6);
            } else {
                i7 = 6;
            }
            str = (ahVar.f() && ahVar.a(i7) == 1 && ahVar.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i10;
        } else {
            ahVar.d(32);
            int a9 = ahVar.a(2);
            String str2 = a9 == 3 ? null : "audio/ac3";
            a2 = a(a9, ahVar.a(6));
            ahVar.d(8);
            int a10 = ahVar.a(3);
            if ((a10 & 1) != 0 && a10 != 1) {
                ahVar.d(2);
            }
            if ((a10 & 4) != 0) {
                ahVar.d(2);
            }
            if (a10 == 2) {
                ahVar.d(2);
            }
            int[] iArr = f24756b;
            i2 = a9 < iArr.length ? iArr[a9] : -1;
            i3 = d[a10] + (ahVar.f() ? 1 : 0);
            i4 = 1536;
            i5 = -1;
            str = str2;
        }
        return new b(str, i5, i3, i2, a2, i4);
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & UnsignedBytes.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & UnsignedBytes.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & Utf8.REPLACEMENT_BYTE);
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & UnsignedBytes.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
