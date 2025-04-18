package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.impl.b5;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
final class k7 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f24824h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f24825i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f24826j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f24827a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f24828b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f24829c;
    private final b d;
    private final a e;

    /* renamed from: f, reason: collision with root package name */
    private final h f24830f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f24831g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24832a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f24833b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f24834c;
        public final int[] d;

        public a(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f24832a = i2;
            this.f24833b = iArr;
            this.f24834c = iArr2;
            this.d = iArr3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f24835a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24836b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24837c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24838f;

        public b(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f24835a = i2;
            this.f24836b = i3;
            this.f24837c = i4;
            this.d = i5;
            this.e = i6;
            this.f24838f = i7;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f24839a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24840b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f24841c;
        public final byte[] d;

        public c(int i2, boolean z2, byte[] bArr, byte[] bArr2) {
            this.f24839a = i2;
            this.f24840b = z2;
            this.f24841c = bArr;
            this.d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f24842a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24843b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24844c;
        public final SparseArray d;

        public d(int i2, int i3, int i4, SparseArray sparseArray) {
            this.f24842a = i2;
            this.f24843b = i3;
            this.f24844c = i4;
            this.d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f24845a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24846b;

        public e(int i2, int i3) {
            this.f24845a = i2;
            this.f24846b = i3;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f24847a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24848b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24849c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24850f;

        /* renamed from: g, reason: collision with root package name */
        public final int f24851g;

        /* renamed from: h, reason: collision with root package name */
        public final int f24852h;

        /* renamed from: i, reason: collision with root package name */
        public final int f24853i;

        /* renamed from: j, reason: collision with root package name */
        public final int f24854j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f24855k;

        public f(int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray sparseArray) {
            this.f24847a = i2;
            this.f24848b = z2;
            this.f24849c = i3;
            this.d = i4;
            this.e = i5;
            this.f24850f = i6;
            this.f24851g = i7;
            this.f24852h = i8;
            this.f24853i = i9;
            this.f24854j = i10;
            this.f24855k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f24855k;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.f24855k.put(sparseArray.keyAt(i2), (g) sparseArray.valueAt(i2));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f24856a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24857b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24858c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24859f;

        public g(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f24856a = i2;
            this.f24857b = i3;
            this.f24858c = i4;
            this.d = i5;
            this.e = i6;
            this.f24859f = i7;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f24860a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24861b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f24862c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f24863f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f24864g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f24865h;

        /* renamed from: i, reason: collision with root package name */
        public d f24866i;

        public h(int i2, int i3) {
            this.f24860a = i2;
            this.f24861b = i3;
        }

        public void a() {
            this.f24862c.clear();
            this.d.clear();
            this.e.clear();
            this.f24863f.clear();
            this.f24864g.clear();
            this.f24865h = null;
            this.f24866i = null;
        }
    }

    public k7(int i2, int i3) {
        Paint paint = new Paint();
        this.f24827a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f24828b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f24829c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, a(), b(), c());
        this.f24830f = new h(i2, i3);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = a(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i3 & Opcodes.L2I;
                int i5 = Opcodes.TABLESWITCH;
                if (i4 == 0) {
                    int i6 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i7 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(255, i6, i7, i2 + i5);
                } else if (i4 == 8) {
                    int i8 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i9 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(127, i8, i9, i2 + i5);
                } else if (i4 == 128) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public void d() {
        this.f24830f.a();
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static byte[] a(int i2, int i3, ah ahVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ahVar.a(i3);
        }
        return bArr;
    }

    private static int b(ah ahVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int a2;
        int a3;
        int i5 = i2;
        boolean z3 = false;
        while (true) {
            int a4 = ahVar.a(4);
            if (a4 != 0) {
                z2 = z3;
                i4 = 1;
            } else if (!ahVar.f()) {
                int a5 = ahVar.a(3);
                if (a5 != 0) {
                    z2 = z3;
                    i4 = a5 + 2;
                    a4 = 0;
                } else {
                    z2 = true;
                    a4 = 0;
                    i4 = 0;
                }
            } else {
                if (!ahVar.f()) {
                    a2 = ahVar.a(2) + 4;
                    a3 = ahVar.a(4);
                } else {
                    int a6 = ahVar.a(2);
                    if (a6 == 0) {
                        z2 = z3;
                        i4 = 1;
                    } else if (a6 == 1) {
                        z2 = z3;
                        i4 = 2;
                    } else if (a6 == 2) {
                        a2 = ahVar.a(4) + 9;
                        a3 = ahVar.a(4);
                    } else if (a6 != 3) {
                        z2 = z3;
                        a4 = 0;
                        i4 = 0;
                    } else {
                        a2 = ahVar.a(8) + 25;
                        a3 = ahVar.a(4);
                    }
                    a4 = 0;
                }
                z2 = z3;
                i4 = a2;
                a4 = a3;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    a4 = bArr[a4];
                }
                paint.setColor(iArr[a4]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z2) {
                return i5;
            }
            z3 = z2;
        }
    }

    private static int a(ah ahVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int i4;
        int a2;
        int a3;
        int i5 = i2;
        boolean z3 = false;
        while (true) {
            int a4 = ahVar.a(2);
            if (a4 != 0) {
                z2 = z3;
                i4 = 1;
            } else {
                if (ahVar.f()) {
                    a2 = ahVar.a(3) + 3;
                    a3 = ahVar.a(2);
                } else {
                    if (ahVar.f()) {
                        z2 = z3;
                        i4 = 1;
                    } else {
                        int a5 = ahVar.a(2);
                        if (a5 == 0) {
                            z2 = true;
                        } else if (a5 == 1) {
                            z2 = z3;
                            i4 = 2;
                        } else if (a5 == 2) {
                            a2 = ahVar.a(4) + 12;
                            a3 = ahVar.a(2);
                        } else if (a5 != 3) {
                            z2 = z3;
                        } else {
                            a2 = ahVar.a(8) + 29;
                            a3 = ahVar.a(2);
                        }
                        a4 = 0;
                        i4 = 0;
                    }
                    a4 = 0;
                }
                z2 = z3;
                i4 = a2;
                a4 = a3;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    a4 = bArr[a4];
                }
                paint.setColor(iArr[a4]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z2) {
                return i5;
            }
            z3 = z2;
        }
    }

    private static int c(ah ahVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z2;
        int a2;
        int i4 = i2;
        boolean z3 = false;
        while (true) {
            int a3 = ahVar.a(8);
            if (a3 != 0) {
                z2 = z3;
                a2 = 1;
            } else if (!ahVar.f()) {
                int a4 = ahVar.a(7);
                if (a4 != 0) {
                    z2 = z3;
                    a2 = a4;
                    a3 = 0;
                } else {
                    z2 = true;
                    a3 = 0;
                    a2 = 0;
                }
            } else {
                z2 = z3;
                a2 = ahVar.a(7);
                a3 = ahVar.a(8);
            }
            if (a2 != 0 && paint != null) {
                if (bArr != null) {
                    a3 = bArr[a3];
                }
                paint.setColor(iArr[a3]);
                canvas.drawRect(i4, i3, i4 + a2, i3 + 1, paint);
            }
            i4 += a2;
            if (z2) {
                return i4;
            }
            z3 = z2;
        }
    }

    private static f c(ah ahVar, int i2) {
        int i3;
        int i4;
        int i5;
        int a2 = ahVar.a(8);
        ahVar.d(4);
        boolean f2 = ahVar.f();
        ahVar.d(3);
        int i6 = 16;
        int a3 = ahVar.a(16);
        int a4 = ahVar.a(16);
        int a5 = ahVar.a(3);
        int a6 = ahVar.a(3);
        int i7 = 2;
        ahVar.d(2);
        int a7 = ahVar.a(8);
        int a8 = ahVar.a(8);
        int a9 = ahVar.a(4);
        int a10 = ahVar.a(2);
        ahVar.d(2);
        int i8 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int a11 = ahVar.a(i6);
            int a12 = ahVar.a(i7);
            int a13 = ahVar.a(i7);
            int a14 = ahVar.a(12);
            int i9 = a10;
            ahVar.d(4);
            int a15 = ahVar.a(12);
            int i10 = i8 - 6;
            if (a12 != 1) {
                i3 = 2;
                if (a12 != 2) {
                    i5 = 0;
                    i4 = 0;
                    i8 = i10;
                    sparseArray.put(a11, new g(a12, a13, a14, a15, i5, i4));
                    i7 = i3;
                    a10 = i9;
                    i6 = 16;
                }
            } else {
                i3 = 2;
            }
            i8 -= 8;
            i5 = ahVar.a(8);
            i4 = ahVar.a(8);
            sparseArray.put(a11, new g(a12, a13, a14, a15, i5, i4));
            i7 = i3;
            a10 = i9;
            i6 = 16;
        }
        return new f(a2, f2, a3, a4, a5, a6, a7, a8, a9, a10, sparseArray);
    }

    private static c b(ah ahVar) {
        byte[] bArr;
        int a2 = ahVar.a(16);
        ahVar.d(4);
        int a3 = ahVar.a(2);
        boolean f2 = ahVar.f();
        ahVar.d(1);
        byte[] bArr2 = xp.f27965f;
        if (a3 == 1) {
            ahVar.d(ahVar.a(8) * 16);
        } else if (a3 == 0) {
            int a4 = ahVar.a(16);
            int a5 = ahVar.a(16);
            if (a4 > 0) {
                bArr2 = new byte[a4];
                ahVar.b(bArr2, 0, a4);
            }
            if (a5 > 0) {
                bArr = new byte[a5];
                ahVar.b(bArr, 0, a5);
                return new c(a2, f2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a2, f2, bArr2, bArr);
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.f24834c;
        } else {
            iArr = aVar.f24833b;
        }
        int[] iArr2 = iArr;
        a(cVar.f24841c, iArr2, i2, i3, i4, paint, canvas);
        a(cVar.d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static a a(ah ahVar, int i2) {
        int a2;
        int i3;
        int a3;
        int i4;
        int i5;
        int i6 = 8;
        int a4 = ahVar.a(8);
        ahVar.d(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] a5 = a();
        int[] b2 = b();
        int[] c2 = c();
        while (i8 > 0) {
            int a6 = ahVar.a(i6);
            int a7 = ahVar.a(i6);
            int[] iArr = (a7 & 128) != 0 ? a5 : (a7 & 64) != 0 ? b2 : c2;
            if ((a7 & 1) != 0) {
                i4 = ahVar.a(i6);
                i5 = ahVar.a(i6);
                a2 = ahVar.a(i6);
                a3 = ahVar.a(i6);
                i3 = i8 - 6;
            } else {
                int a8 = ahVar.a(6) << i7;
                int a9 = ahVar.a(4) << 4;
                a2 = ahVar.a(4) << 4;
                i3 = i8 - 4;
                a3 = ahVar.a(i7) << 6;
                i4 = a8;
                i5 = a9;
            }
            if (i4 == 0) {
                a3 = 255;
                i5 = 0;
                a2 = 0;
            }
            double d2 = i4;
            double d3 = i5 - 128;
            double d4 = a2 - 128;
            iArr[a6] = a((byte) (255 - (a3 & 255)), xp.a((int) ((1.402d * d3) + d2), 0, 255), xp.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), xp.a((int) ((d4 * 1.772d) + d2), 0, 255));
            i8 = i3;
            a4 = a4;
            i6 = 8;
            i7 = 2;
        }
        return new a(a4, a5, b2, c2);
    }

    private static d b(ah ahVar, int i2) {
        int a2 = ahVar.a(8);
        int a3 = ahVar.a(4);
        int a4 = ahVar.a(2);
        ahVar.d(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int a5 = ahVar.a(8);
            ahVar.d(8);
            i3 -= 6;
            sparseArray.put(a5, new e(ahVar.a(16), ahVar.a(16)));
        }
        return new d(a2, a3, a4, sparseArray);
    }

    private static b a(ah ahVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        ahVar.d(4);
        boolean f2 = ahVar.f();
        ahVar.d(3);
        int a2 = ahVar.a(16);
        int a3 = ahVar.a(16);
        if (f2) {
            int a4 = ahVar.a(16);
            int a5 = ahVar.a(16);
            int a6 = ahVar.a(16);
            i5 = ahVar.a(16);
            i4 = a5;
            i3 = a6;
            i2 = a4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = a2;
            i5 = a3;
        }
        return new b(a2, a3, i2, i4, i3, i5);
    }

    private static void a(ah ahVar, h hVar) {
        f fVar;
        int a2 = ahVar.a(8);
        int a3 = ahVar.a(16);
        int a4 = ahVar.a(16);
        int d2 = ahVar.d() + a4;
        if (a4 * 8 > ahVar.b()) {
            pc.d("DvbParser", "Data field length exceeds limit");
            ahVar.d(ahVar.b());
            return;
        }
        switch (a2) {
            case 16:
                if (a3 == hVar.f24860a) {
                    d dVar = hVar.f24866i;
                    d b2 = b(ahVar, a4);
                    if (b2.f24844c != 0) {
                        hVar.f24866i = b2;
                        hVar.f24862c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    } else if (dVar != null && dVar.f24843b != b2.f24843b) {
                        hVar.f24866i = b2;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f24866i;
                if (a3 == hVar.f24860a && dVar2 != null) {
                    f c2 = c(ahVar, a4);
                    if (dVar2.f24844c == 0 && (fVar = (f) hVar.f24862c.get(c2.f24847a)) != null) {
                        c2.a(fVar);
                    }
                    hVar.f24862c.put(c2.f24847a, c2);
                    break;
                }
                break;
            case 18:
                if (a3 == hVar.f24860a) {
                    a a5 = a(ahVar, a4);
                    hVar.d.put(a5.f24832a, a5);
                    break;
                } else if (a3 == hVar.f24861b) {
                    a a6 = a(ahVar, a4);
                    hVar.f24863f.put(a6.f24832a, a6);
                    break;
                }
                break;
            case 19:
                if (a3 == hVar.f24860a) {
                    c b3 = b(ahVar);
                    hVar.e.put(b3.f24839a, b3);
                    break;
                } else if (a3 == hVar.f24861b) {
                    c b4 = b(ahVar);
                    hVar.f24864g.put(b4.f24839a, b4);
                    break;
                }
                break;
            case 20:
                if (a3 == hVar.f24860a) {
                    hVar.f24865h = a(ahVar);
                    break;
                }
                break;
        }
        ahVar.e(d2 - ahVar.d());
    }

    public List a(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray sparseArray;
        ah ahVar = new ah(bArr, i2);
        while (ahVar.b() >= 48 && ahVar.a(8) == 15) {
            a(ahVar, this.f24830f);
        }
        h hVar = this.f24830f;
        d dVar = hVar.f24866i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f24865h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.f24831g;
        if (bitmap == null || bVar.f24835a + 1 != bitmap.getWidth() || bVar.f24836b + 1 != this.f24831g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f24835a + 1, bVar.f24836b + 1, Bitmap.Config.ARGB_8888);
            this.f24831g = createBitmap;
            this.f24829c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.d;
        for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
            this.f24829c.save();
            e eVar = (e) sparseArray2.valueAt(i5);
            f fVar = (f) this.f24830f.f24862c.get(sparseArray2.keyAt(i5));
            int i6 = eVar.f24845a + bVar.f24837c;
            int i7 = eVar.f24846b + bVar.e;
            this.f24829c.clipRect(i6, i7, Math.min(fVar.f24849c + i6, bVar.d), Math.min(fVar.d + i7, bVar.f24838f));
            a aVar = (a) this.f24830f.d.get(fVar.f24851g);
            if (aVar == null && (aVar = (a) this.f24830f.f24863f.get(fVar.f24851g)) == null) {
                aVar = this.e;
            }
            SparseArray sparseArray3 = fVar.f24855k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i8);
                g gVar = (g) sparseArray3.valueAt(i8);
                c cVar = (c) this.f24830f.e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f24830f.f24864g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i4 = i8;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f24850f, gVar.f24858c + i6, i7 + gVar.d, cVar2.f24840b ? null : this.f24827a, this.f24829c);
                } else {
                    i4 = i8;
                    sparseArray = sparseArray3;
                }
                i8 = i4 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f24848b) {
                int i9 = fVar.f24850f;
                if (i9 == 3) {
                    i3 = aVar.d[fVar.f24852h];
                } else if (i9 == 2) {
                    i3 = aVar.f24834c[fVar.f24853i];
                } else {
                    i3 = aVar.f24833b[fVar.f24854j];
                }
                this.f24828b.setColor(i3);
                this.f24829c.drawRect(i6, i7, fVar.f24849c + i6, fVar.d + i7, this.f24828b);
            }
            arrayList.add(new b5.b().a(Bitmap.createBitmap(this.f24831g, i6, i7, fVar.f24849c, fVar.d)).b(i6 / bVar.f24835a).b(0).a(i7 / bVar.f24836b, 0).a(0).d(fVar.f24849c / bVar.f24835a).a(fVar.d / bVar.f24836b).a());
            this.f24829c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f24829c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        ah ahVar = new ah(bArr);
        int i5 = i3;
        int i6 = i4;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (ahVar.b() != 0) {
            int a2 = ahVar.a(8);
            if (a2 != 240) {
                switch (a2) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = f24824h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i5 = a(ahVar, iArr, bArr2, i5, i6, paint, canvas);
                            ahVar.c();
                        } else if (bArr4 == null) {
                            bArr3 = f24825i;
                            bArr2 = bArr3;
                            i5 = a(ahVar, iArr, bArr2, i5, i6, paint, canvas);
                            ahVar.c();
                            break;
                        } else {
                            bArr2 = bArr4;
                            i5 = a(ahVar, iArr, bArr2, i5, i6, paint, canvas);
                            ahVar.c();
                        }
                    case 17:
                        i5 = b(ahVar, iArr, i2 == 3 ? bArr5 == null ? f24826j : bArr5 : null, i5, i6, paint, canvas);
                        ahVar.c();
                        break;
                    case 18:
                        i5 = c(ahVar, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (a2) {
                            case 32:
                                bArr6 = a(4, 4, ahVar);
                                break;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                bArr4 = a(4, 8, ahVar);
                                break;
                            case 34:
                                bArr5 = a(16, 8, ahVar);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i3;
            }
        }
    }
}
