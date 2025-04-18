package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.d9;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class k {
    private static final int[] a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5552b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5553c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f5554d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f5555e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f5556f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5557b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5558c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5559d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5560e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5561f;

        private b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.a = str;
            this.f5557b = i10;
            this.f5559d = i11;
            this.f5558c = i12;
            this.f5560e = i13;
            this.f5561f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((yp.a(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int b(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return 1536;
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f5552b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f5556f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f5555e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static d9 b(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(2);
        int i10 = f5552b[(ygVar.w() & PsExtractor.AUDIO_STREAM) >> 6];
        int w10 = ygVar.w();
        int i11 = f5554d[(w10 & 14) >> 1];
        if ((w10 & 1) != 0) {
            i11++;
        }
        if (((ygVar.w() & 30) >> 1) > 0 && (2 & ygVar.w()) != 0) {
            i11 += 2;
        }
        return new d9.b().c(str).f((ygVar.a() <= 0 || (ygVar.w() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC).c(i11).n(i10).a(w6Var).e(str2).a();
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        int i10 = f5552b[(ygVar.w() & PsExtractor.AUDIO_STREAM) >> 6];
        int w10 = ygVar.w();
        int i11 = f5554d[(w10 & 56) >> 3];
        if ((w10 & 4) != 0) {
            i11++;
        }
        return new d9.b().c(str).f(MimeTypes.AUDIO_AC3).c(i11).n(i10).a(w6Var).e(str2).a();
    }

    public static b a(xg xgVar) {
        int a10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int a11;
        int i14;
        int i15;
        int i16;
        int i17;
        int e2 = xgVar.e();
        xgVar.d(40);
        boolean z10 = xgVar.a(5) > 10;
        xgVar.c(e2);
        int i18 = -1;
        if (z10) {
            xgVar.d(16);
            int a12 = xgVar.a(2);
            if (a12 == 0) {
                i18 = 0;
            } else if (a12 == 1) {
                i18 = 1;
            } else if (a12 == 2) {
                i18 = 2;
            }
            xgVar.d(3);
            a10 = (xgVar.a(11) + 1) * 2;
            int a13 = xgVar.a(2);
            if (a13 == 3) {
                i10 = f5553c[xgVar.a(2)];
                i14 = 6;
                a11 = 3;
            } else {
                a11 = xgVar.a(2);
                i14 = a[a11];
                i10 = f5552b[a13];
            }
            i12 = i14 * NotificationCompat.FLAG_LOCAL_ONLY;
            int a14 = xgVar.a(3);
            boolean f10 = xgVar.f();
            i11 = f5554d[a14] + (f10 ? 1 : 0);
            xgVar.d(10);
            if (xgVar.f()) {
                xgVar.d(8);
            }
            if (a14 == 0) {
                xgVar.d(5);
                if (xgVar.f()) {
                    xgVar.d(8);
                }
            }
            if (i18 == 1 && xgVar.f()) {
                xgVar.d(16);
            }
            if (xgVar.f()) {
                if (a14 > 2) {
                    xgVar.d(2);
                }
                if ((a14 & 1) == 0 || a14 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    xgVar.d(6);
                }
                if ((a14 & 4) != 0) {
                    xgVar.d(i16);
                }
                if (f10 && xgVar.f()) {
                    xgVar.d(5);
                }
                if (i18 == 0) {
                    if (xgVar.f()) {
                        i17 = 6;
                        xgVar.d(6);
                    } else {
                        i17 = 6;
                    }
                    if (a14 == 0 && xgVar.f()) {
                        xgVar.d(i17);
                    }
                    if (xgVar.f()) {
                        xgVar.d(i17);
                    }
                    int a15 = xgVar.a(2);
                    if (a15 == 1) {
                        xgVar.d(5);
                    } else if (a15 == 2) {
                        xgVar.d(12);
                    } else if (a15 == 3) {
                        int a16 = xgVar.a(5);
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
                        xgVar.d((a16 + 2) * 8);
                        xgVar.c();
                    }
                    if (a14 < 2) {
                        if (xgVar.f()) {
                            xgVar.d(14);
                        }
                        if (a14 == 0 && xgVar.f()) {
                            xgVar.d(14);
                        }
                    }
                    if (xgVar.f()) {
                        if (a11 == 0) {
                            xgVar.d(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
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
                if (a14 == 2) {
                    xgVar.d(4);
                }
                if (a14 >= 6) {
                    xgVar.d(2);
                }
                if (xgVar.f()) {
                    xgVar.d(8);
                }
                if (a14 == 0 && xgVar.f()) {
                    xgVar.d(8);
                }
                if (a13 < 3) {
                    xgVar.g();
                }
            }
            if (i18 == 0 && a11 != 3) {
                xgVar.g();
            }
            if (i18 == 2 && (a11 == 3 || xgVar.f())) {
                i15 = 6;
                xgVar.d(6);
            } else {
                i15 = 6;
            }
            str = (xgVar.f() && xgVar.a(i15) == 1 && xgVar.a(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i13 = i18;
        } else {
            xgVar.d(32);
            int a17 = xgVar.a(2);
            String str2 = a17 == 3 ? null : MimeTypes.AUDIO_AC3;
            a10 = a(a17, xgVar.a(6));
            xgVar.d(8);
            int a18 = xgVar.a(3);
            if ((a18 & 1) != 0 && a18 != 1) {
                xgVar.d(2);
            }
            if ((a18 & 4) != 0) {
                xgVar.d(2);
            }
            if (a18 == 2) {
                xgVar.d(2);
            }
            int[] iArr = f5552b;
            i10 = a17 < iArr.length ? iArr[a17] : -1;
            i11 = f5554d[a18] + (xgVar.f() ? 1 : 0);
            i12 = 1536;
            i13 = -1;
            str = str2;
        }
        return new b(str, i13, i11, i10, a10, i12);
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                return 40 << ((bArr[(b3 & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & UByte.MAX_VALUE) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b3 = bArr[4];
        return a((b3 & 192) >> 6, b3 & 63);
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
