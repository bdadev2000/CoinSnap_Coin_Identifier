package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.d9;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0714k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8500a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8501c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f8502d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f8503e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f8504f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.applovin.impl.k$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f8505a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8506c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8507d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8508e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8509f;

        private b(String str, int i9, int i10, int i11, int i12, int i13) {
            this.f8505a = str;
            this.b = i9;
            this.f8507d = i10;
            this.f8506c = i11;
            this.f8508e = i12;
            this.f8509f = i13;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i9 = position; i9 <= limit; i9++) {
            if ((yp.a(byteBuffer, i9 + 4) & (-2)) == -126718022) {
                return i9 - position;
            }
        }
        return -1;
    }

    public static int b(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f8500a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    private static int a(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i9 >= iArr.length || i10 < 0) {
            return -1;
        }
        int[] iArr2 = f8504f;
        if (i11 >= iArr2.length) {
            return -1;
        }
        int i12 = iArr[i9];
        if (i12 == 44100) {
            return ((i10 % 2) + iArr2[i11]) * 2;
        }
        int i13 = f8503e[i11];
        return i12 == 32000 ? i13 * 6 : i13 * 4;
    }

    public static d9 b(yg ygVar, String str, String str2, w6 w6Var) {
        String str3;
        ygVar.g(2);
        int i9 = b[(ygVar.w() & PsExtractor.AUDIO_STREAM) >> 6];
        int w2 = ygVar.w();
        int i10 = f8502d[(w2 & 14) >> 1];
        if ((w2 & 1) != 0) {
            i10++;
        }
        if (((ygVar.w() & 30) >> 1) > 0 && (2 & ygVar.w()) != 0) {
            i10 += 2;
        }
        if (ygVar.a() > 0 && (ygVar.w() & 1) != 0) {
            str3 = MimeTypes.AUDIO_E_AC3_JOC;
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        return new d9.b().c(str).f(str3).c(i10).n(i9).a(w6Var).e(str2).a();
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        int i9 = b[(ygVar.w() & PsExtractor.AUDIO_STREAM) >> 6];
        int w2 = ygVar.w();
        int i10 = f8502d[(w2 & 56) >> 3];
        if ((w2 & 4) != 0) {
            i10++;
        }
        return new d9.b().c(str).f(MimeTypes.AUDIO_AC3).c(i10).n(i9).a(w6Var).e(str2).a();
    }

    public static b a(xg xgVar) {
        int a6;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        int a9;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        int e4 = xgVar.e();
        xgVar.d(40);
        boolean z8 = xgVar.a(5) > 10;
        xgVar.c(e4);
        int i17 = -1;
        if (z8) {
            xgVar.d(16);
            int a10 = xgVar.a(2);
            if (a10 == 0) {
                i17 = 0;
            } else if (a10 == 1) {
                i17 = 1;
            } else if (a10 == 2) {
                i17 = 2;
            }
            xgVar.d(3);
            a6 = (xgVar.a(11) + 1) * 2;
            int a11 = xgVar.a(2);
            if (a11 == 3) {
                i9 = f8501c[xgVar.a(2)];
                i13 = 6;
                a9 = 3;
            } else {
                a9 = xgVar.a(2);
                i13 = f8500a[a9];
                i9 = b[a11];
            }
            i11 = i13 * NotificationCompat.FLAG_LOCAL_ONLY;
            int a12 = xgVar.a(3);
            boolean f9 = xgVar.f();
            i10 = f8502d[a12] + (f9 ? 1 : 0);
            xgVar.d(10);
            if (xgVar.f()) {
                xgVar.d(8);
            }
            if (a12 == 0) {
                xgVar.d(5);
                if (xgVar.f()) {
                    xgVar.d(8);
                }
            }
            if (i17 == 1 && xgVar.f()) {
                xgVar.d(16);
            }
            if (xgVar.f()) {
                if (a12 > 2) {
                    xgVar.d(2);
                }
                if ((a12 & 1) == 0 || a12 <= 2) {
                    i15 = 6;
                } else {
                    i15 = 6;
                    xgVar.d(6);
                }
                if ((a12 & 4) != 0) {
                    xgVar.d(i15);
                }
                if (f9 && xgVar.f()) {
                    xgVar.d(5);
                }
                if (i17 == 0) {
                    if (xgVar.f()) {
                        i16 = 6;
                        xgVar.d(6);
                    } else {
                        i16 = 6;
                    }
                    if (a12 == 0 && xgVar.f()) {
                        xgVar.d(i16);
                    }
                    if (xgVar.f()) {
                        xgVar.d(i16);
                    }
                    int a13 = xgVar.a(2);
                    if (a13 == 1) {
                        xgVar.d(5);
                    } else if (a13 == 2) {
                        xgVar.d(12);
                    } else if (a13 == 3) {
                        int a14 = xgVar.a(5);
                        if (xgVar.f()) {
                            xgVar.d(5);
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                if (xgVar.f()) {
                                    xgVar.d(4);
                                }
                                if (xgVar.f()) {
                                    xgVar.d(4);
                                }
                            }
                        }
                        if (xgVar.f()) {
                            xgVar.d(5);
                            if (xgVar.f()) {
                                xgVar.d(7);
                                if (xgVar.f()) {
                                    xgVar.d(8);
                                }
                            }
                        }
                        xgVar.d((a14 + 2) * 8);
                        xgVar.c();
                    }
                    if (a12 < 2) {
                        if (xgVar.f()) {
                            xgVar.d(14);
                        }
                        if (a12 == 0 && xgVar.f()) {
                            xgVar.d(14);
                        }
                    }
                    if (xgVar.f()) {
                        if (a9 == 0) {
                            xgVar.d(5);
                        } else {
                            for (int i18 = 0; i18 < i13; i18++) {
                                if (xgVar.f()) {
                                    xgVar.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xgVar.f()) {
                xgVar.d(5);
                if (a12 == 2) {
                    xgVar.d(4);
                }
                if (a12 >= 6) {
                    xgVar.d(2);
                }
                if (xgVar.f()) {
                    xgVar.d(8);
                }
                if (a12 == 0 && xgVar.f()) {
                    xgVar.d(8);
                }
                if (a11 < 3) {
                    xgVar.g();
                }
            }
            if (i17 == 0 && a9 != 3) {
                xgVar.g();
            }
            if (i17 == 2 && (a9 == 3 || xgVar.f())) {
                i14 = 6;
                xgVar.d(6);
            } else {
                i14 = 6;
            }
            if (xgVar.f() && xgVar.a(i14) == 1 && xgVar.a(8) == 1) {
                str2 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str2 = MimeTypes.AUDIO_E_AC3;
            }
            str = str2;
            i12 = i17;
        } else {
            xgVar.d(32);
            int a15 = xgVar.a(2);
            String str3 = a15 == 3 ? null : MimeTypes.AUDIO_AC3;
            a6 = a(a15, xgVar.a(6));
            xgVar.d(8);
            int a16 = xgVar.a(3);
            if ((a16 & 1) != 0 && a16 != 1) {
                xgVar.d(2);
            }
            if ((a16 & 4) != 0) {
                xgVar.d(2);
            }
            if (a16 == 2) {
                xgVar.d(2);
            }
            int[] iArr = b;
            i9 = a15 < iArr.length ? iArr[a15] : -1;
            i10 = f8502d[a16] + (xgVar.f() ? 1 : 0);
            i11 = 1536;
            i12 = -1;
            str = str3;
        }
        return new b(str, i12, i10, i9, a6, i11);
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b8 = bArr[7];
            if ((b8 & 254) == 186) {
                return 40 << ((bArr[(b8 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b8 = bArr[4];
        return a((b8 & 192) >> 6, b8 & 63);
    }

    public static int a(ByteBuffer byteBuffer, int i9) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i9) + ((byteBuffer.get((byteBuffer.position() + i9) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
