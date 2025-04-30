package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class i7 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f8225h = {0, 7, 8, Ascii.SI};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f8226i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f8227j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f8228a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f8229c;

    /* renamed from: d, reason: collision with root package name */
    private final b f8230d;

    /* renamed from: e, reason: collision with root package name */
    private final a f8231e;

    /* renamed from: f, reason: collision with root package name */
    private final h f8232f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f8233g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8234a;
        public final int[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f8235c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f8236d;

        public a(int i9, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8234a = i9;
            this.b = iArr;
            this.f8235c = iArr2;
            this.f8236d = iArr3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f8237a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8238c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8239d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8240e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8241f;

        public b(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f8237a = i9;
            this.b = i10;
            this.f8238c = i11;
            this.f8239d = i12;
            this.f8240e = i13;
            this.f8241f = i14;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8242a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f8243c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f8244d;

        public c(int i9, boolean z8, byte[] bArr, byte[] bArr2) {
            this.f8242a = i9;
            this.b = z8;
            this.f8243c = bArr;
            this.f8244d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f8245a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8246c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f8247d;

        public d(int i9, int i10, int i11, SparseArray sparseArray) {
            this.f8245a = i9;
            this.b = i10;
            this.f8246c = i11;
            this.f8247d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f8248a;
        public final int b;

        public e(int i9, int i10) {
            this.f8248a = i9;
            this.b = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f8249a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8250c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8251d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8252e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8253f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8254g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8255h;

        /* renamed from: i, reason: collision with root package name */
        public final int f8256i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8257j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f8258k;

        public f(int i9, boolean z8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f8249a = i9;
            this.b = z8;
            this.f8250c = i10;
            this.f8251d = i11;
            this.f8252e = i12;
            this.f8253f = i13;
            this.f8254g = i14;
            this.f8255h = i15;
            this.f8256i = i16;
            this.f8257j = i17;
            this.f8258k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f8258k;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                this.f8258k.put(sparseArray.keyAt(i9), (g) sparseArray.valueAt(i9));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f8259a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8260c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8261d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8262e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8263f;

        public g(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f8259a = i9;
            this.b = i10;
            this.f8260c = i11;
            this.f8261d = i12;
            this.f8262e = i13;
            this.f8263f = i14;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f8264a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f8265c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f8266d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f8267e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f8268f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f8269g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f8270h;

        /* renamed from: i, reason: collision with root package name */
        public d f8271i;

        public h(int i9, int i10) {
            this.f8264a = i9;
            this.b = i10;
        }

        public void a() {
            this.f8265c.clear();
            this.f8266d.clear();
            this.f8267e.clear();
            this.f8268f.clear();
            this.f8269g.clear();
            this.f8270h = null;
            this.f8271i = null;
        }
    }

    public i7(int i9, int i10) {
        Paint paint = new Paint();
        this.f8228a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8229c = new Canvas();
        this.f8230d = new b(719, 575, 0, 719, 0, 575);
        this.f8231e = new a(0, a(), b(), c());
        this.f8232f = new h(i9, i10);
    }

    private static int a(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i9 = 1; i9 < 16; i9++) {
            if (i9 < 8) {
                iArr[i9] = a(255, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i9] = a(255, (i9 & 1) != 0 ? 127 : 0, (i9 & 2) != 0 ? 127 : 0, (i9 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            if (i9 < 8) {
                iArr[i9] = a(63, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i9 & 136;
                if (i10 == 0) {
                    iArr[i9] = a(255, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i9] = a(127, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i9] = a(255, ((i9 & 1) != 0 ? 43 : 0) + 127 + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + 127 + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + 127 + ((i9 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i9] = a(255, ((i9 & 1) != 0 ? 43 : 0) + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + ((i9 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public void d() {
        this.f8232f.a();
    }

    private static byte[] a(int i9, int i10, xg xgVar) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) xgVar.a(i10);
        }
        return bArr;
    }

    private static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int a(xg xgVar, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int i11;
        int a6;
        int a9;
        int i12 = i9;
        boolean z9 = false;
        while (true) {
            int a10 = xgVar.a(2);
            if (a10 != 0) {
                z8 = z9;
                i11 = 1;
            } else {
                if (xgVar.f()) {
                    a6 = xgVar.a(3) + 3;
                    a9 = xgVar.a(2);
                } else {
                    if (xgVar.f()) {
                        z8 = z9;
                        i11 = 1;
                    } else {
                        int a11 = xgVar.a(2);
                        if (a11 == 0) {
                            z8 = true;
                        } else if (a11 == 1) {
                            z8 = z9;
                            i11 = 2;
                        } else if (a11 == 2) {
                            a6 = xgVar.a(4) + 12;
                            a9 = xgVar.a(2);
                        } else if (a11 != 3) {
                            z8 = z9;
                        } else {
                            a6 = xgVar.a(8) + 29;
                            a9 = xgVar.a(2);
                        }
                        a10 = 0;
                        i11 = 0;
                    }
                    a10 = 0;
                }
                z8 = z9;
                i11 = a6;
                a10 = a9;
            }
            if (i11 != 0 && paint != null) {
                if (bArr != null) {
                    a10 = bArr[a10];
                }
                paint.setColor(iArr[a10]);
                canvas.drawRect(i12, i10, i12 + i11, i10 + 1, paint);
            }
            i12 += i11;
            if (z8) {
                return i12;
            }
            z9 = z8;
        }
    }

    private static int b(xg xgVar, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int i11;
        int a6;
        int a9;
        int i12 = i9;
        boolean z9 = false;
        while (true) {
            int a10 = xgVar.a(4);
            if (a10 != 0) {
                z8 = z9;
                i11 = 1;
            } else if (!xgVar.f()) {
                int a11 = xgVar.a(3);
                if (a11 != 0) {
                    z8 = z9;
                    i11 = a11 + 2;
                    a10 = 0;
                } else {
                    z8 = true;
                    a10 = 0;
                    i11 = 0;
                }
            } else {
                if (!xgVar.f()) {
                    a6 = xgVar.a(2) + 4;
                    a9 = xgVar.a(4);
                } else {
                    int a12 = xgVar.a(2);
                    if (a12 == 0) {
                        z8 = z9;
                        i11 = 1;
                    } else if (a12 == 1) {
                        z8 = z9;
                        i11 = 2;
                    } else if (a12 == 2) {
                        a6 = xgVar.a(4) + 9;
                        a9 = xgVar.a(4);
                    } else if (a12 != 3) {
                        z8 = z9;
                        a10 = 0;
                        i11 = 0;
                    } else {
                        a6 = xgVar.a(8) + 25;
                        a9 = xgVar.a(4);
                    }
                    a10 = 0;
                }
                z8 = z9;
                i11 = a6;
                a10 = a9;
            }
            if (i11 != 0 && paint != null) {
                if (bArr != null) {
                    a10 = bArr[a10];
                }
                paint.setColor(iArr[a10]);
                canvas.drawRect(i12, i10, i12 + i11, i10 + 1, paint);
            }
            i12 += i11;
            if (z8) {
                return i12;
            }
            z9 = z8;
        }
    }

    private static int c(xg xgVar, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z8;
        int a6;
        int i11 = i9;
        boolean z9 = false;
        while (true) {
            int a9 = xgVar.a(8);
            if (a9 != 0) {
                z8 = z9;
                a6 = 1;
            } else if (!xgVar.f()) {
                int a10 = xgVar.a(7);
                if (a10 != 0) {
                    z8 = z9;
                    a6 = a10;
                    a9 = 0;
                } else {
                    z8 = true;
                    a9 = 0;
                    a6 = 0;
                }
            } else {
                z8 = z9;
                a6 = xgVar.a(7);
                a9 = xgVar.a(8);
            }
            if (a6 != 0 && paint != null) {
                if (bArr != null) {
                    a9 = bArr[a9];
                }
                paint.setColor(iArr[a9]);
                canvas.drawRect(i11, i10, i11 + a6, i10 + 1, paint);
            }
            i11 += a6;
            if (z8) {
                return i11;
            }
            z9 = z8;
        }
    }

    private static f c(xg xgVar, int i9) {
        int i10;
        int i11;
        int i12;
        int a6 = xgVar.a(8);
        xgVar.d(4);
        boolean f9 = xgVar.f();
        xgVar.d(3);
        int i13 = 16;
        int a9 = xgVar.a(16);
        int a10 = xgVar.a(16);
        int a11 = xgVar.a(3);
        int a12 = xgVar.a(3);
        int i14 = 2;
        xgVar.d(2);
        int a13 = xgVar.a(8);
        int a14 = xgVar.a(8);
        int a15 = xgVar.a(4);
        int a16 = xgVar.a(2);
        xgVar.d(2);
        int i15 = i9 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int a17 = xgVar.a(i13);
            int a18 = xgVar.a(i14);
            int a19 = xgVar.a(i14);
            int a20 = xgVar.a(12);
            int i16 = a16;
            xgVar.d(4);
            int a21 = xgVar.a(12);
            int i17 = i15 - 6;
            if (a18 != 1) {
                i10 = 2;
                if (a18 != 2) {
                    i12 = 0;
                    i11 = 0;
                    i15 = i17;
                    sparseArray.put(a17, new g(a18, a19, a20, a21, i12, i11));
                    i14 = i10;
                    a16 = i16;
                    i13 = 16;
                }
            } else {
                i10 = 2;
            }
            i15 -= 8;
            i12 = xgVar.a(8);
            i11 = xgVar.a(8);
            sparseArray.put(a17, new g(a18, a19, a20, a21, i12, i11));
            i14 = i10;
            a16 = i16;
            i13 = 16;
        }
        return new f(a6, f9, a9, a10, a11, a12, a13, a14, a15, a16, sparseArray);
    }

    private static void a(c cVar, a aVar, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i9 == 3) {
            iArr = aVar.f8236d;
        } else if (i9 == 2) {
            iArr = aVar.f8235c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        a(cVar.f8243c, iArr2, i9, i10, i11, paint, canvas);
        a(cVar.f8244d, iArr2, i9, i10, i11 + 1, paint, canvas);
    }

    private static c b(xg xgVar) {
        byte[] bArr;
        int a6 = xgVar.a(16);
        xgVar.d(4);
        int a9 = xgVar.a(2);
        boolean f9 = xgVar.f();
        xgVar.d(1);
        byte[] bArr2 = yp.f12455f;
        if (a9 == 1) {
            xgVar.d(xgVar.a(8) * 16);
        } else if (a9 == 0) {
            int a10 = xgVar.a(16);
            int a11 = xgVar.a(16);
            if (a10 > 0) {
                bArr2 = new byte[a10];
                xgVar.b(bArr2, 0, a10);
            }
            if (a11 > 0) {
                bArr = new byte[a11];
                xgVar.b(bArr, 0, a11);
                return new c(a6, f9, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a6, f9, bArr2, bArr);
    }

    private static a a(xg xgVar, int i9) {
        int a6;
        int i10;
        int a9;
        int i11;
        int i12;
        int i13 = 8;
        int a10 = xgVar.a(8);
        xgVar.d(8);
        int i14 = 2;
        int i15 = i9 - 2;
        int[] a11 = a();
        int[] b8 = b();
        int[] c9 = c();
        while (i15 > 0) {
            int a12 = xgVar.a(i13);
            int a13 = xgVar.a(i13);
            int[] iArr = (a13 & 128) != 0 ? a11 : (a13 & 64) != 0 ? b8 : c9;
            if ((a13 & 1) != 0) {
                i11 = xgVar.a(i13);
                i12 = xgVar.a(i13);
                a6 = xgVar.a(i13);
                a9 = xgVar.a(i13);
                i10 = i15 - 6;
            } else {
                int a14 = xgVar.a(6) << i14;
                int a15 = xgVar.a(4) << 4;
                a6 = xgVar.a(4) << 4;
                i10 = i15 - 4;
                a9 = xgVar.a(i14) << 6;
                i11 = a14;
                i12 = a15;
            }
            if (i11 == 0) {
                a9 = 255;
                i12 = 0;
                a6 = 0;
            }
            double d2 = i11;
            double d9 = i12 - 128;
            double d10 = a6 - 128;
            iArr[a12] = a((byte) (255 - (a9 & 255)), yp.a((int) ((1.402d * d9) + d2), 0, 255), yp.a((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), yp.a((int) ((d10 * 1.772d) + d2), 0, 255));
            i15 = i10;
            a10 = a10;
            i13 = 8;
            i14 = 2;
        }
        return new a(a10, a11, b8, c9);
    }

    private static d b(xg xgVar, int i9) {
        int a6 = xgVar.a(8);
        int a9 = xgVar.a(4);
        int a10 = xgVar.a(2);
        xgVar.d(2);
        int i10 = i9 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int a11 = xgVar.a(8);
            xgVar.d(8);
            i10 -= 6;
            sparseArray.put(a11, new e(xgVar.a(16), xgVar.a(16)));
        }
        return new d(a6, a9, a10, sparseArray);
    }

    private static b a(xg xgVar) {
        int i9;
        int i10;
        int i11;
        int i12;
        xgVar.d(4);
        boolean f9 = xgVar.f();
        xgVar.d(3);
        int a6 = xgVar.a(16);
        int a9 = xgVar.a(16);
        if (f9) {
            int a10 = xgVar.a(16);
            int a11 = xgVar.a(16);
            int a12 = xgVar.a(16);
            i12 = xgVar.a(16);
            i11 = a11;
            i10 = a12;
            i9 = a10;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = a6;
            i12 = a9;
        }
        return new b(a6, a9, i9, i11, i10, i12);
    }

    private static void a(xg xgVar, h hVar) {
        f fVar;
        int a6 = xgVar.a(8);
        int a9 = xgVar.a(16);
        int a10 = xgVar.a(16);
        int d2 = xgVar.d() + a10;
        if (a10 * 8 > xgVar.b()) {
            kc.d("DvbParser", "Data field length exceeds limit");
            xgVar.d(xgVar.b());
            return;
        }
        switch (a6) {
            case 16:
                if (a9 == hVar.f8264a) {
                    d dVar = hVar.f8271i;
                    d b8 = b(xgVar, a10);
                    if (b8.f8246c != 0) {
                        hVar.f8271i = b8;
                        hVar.f8265c.clear();
                        hVar.f8266d.clear();
                        hVar.f8267e.clear();
                        break;
                    } else if (dVar != null && dVar.b != b8.b) {
                        hVar.f8271i = b8;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f8271i;
                if (a9 == hVar.f8264a && dVar2 != null) {
                    f c9 = c(xgVar, a10);
                    if (dVar2.f8246c == 0 && (fVar = (f) hVar.f8265c.get(c9.f8249a)) != null) {
                        c9.a(fVar);
                    }
                    hVar.f8265c.put(c9.f8249a, c9);
                    break;
                }
                break;
            case 18:
                if (a9 == hVar.f8264a) {
                    a a11 = a(xgVar, a10);
                    hVar.f8266d.put(a11.f8234a, a11);
                    break;
                } else if (a9 == hVar.b) {
                    a a12 = a(xgVar, a10);
                    hVar.f8268f.put(a12.f8234a, a12);
                    break;
                }
                break;
            case 19:
                if (a9 == hVar.f8264a) {
                    c b9 = b(xgVar);
                    hVar.f8267e.put(b9.f8242a, b9);
                    break;
                } else if (a9 == hVar.b) {
                    c b10 = b(xgVar);
                    hVar.f8269g.put(b10.f8242a, b10);
                    break;
                }
                break;
            case 20:
                if (a9 == hVar.f8264a) {
                    hVar.f8270h = a(xgVar);
                    break;
                }
                break;
        }
        xgVar.e(d2 - xgVar.d());
    }

    public List a(byte[] bArr, int i9) {
        int i10;
        int i11;
        SparseArray sparseArray;
        xg xgVar = new xg(bArr, i9);
        while (xgVar.b() >= 48 && xgVar.a(8) == 15) {
            a(xgVar, this.f8232f);
        }
        h hVar = this.f8232f;
        d dVar = hVar.f8271i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f8270h;
        if (bVar == null) {
            bVar = this.f8230d;
        }
        Bitmap bitmap = this.f8233g;
        if (bitmap == null || bVar.f8237a + 1 != bitmap.getWidth() || bVar.b + 1 != this.f8233g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f8237a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.f8233g = createBitmap;
            this.f8229c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f8247d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f8229c.save();
            e eVar = (e) sparseArray2.valueAt(i12);
            f fVar = (f) this.f8232f.f8265c.get(sparseArray2.keyAt(i12));
            int i13 = eVar.f8248a + bVar.f8238c;
            int i14 = eVar.b + bVar.f8240e;
            this.f8229c.clipRect(i13, i14, Math.min(fVar.f8250c + i13, bVar.f8239d), Math.min(fVar.f8251d + i14, bVar.f8241f));
            a aVar = (a) this.f8232f.f8266d.get(fVar.f8254g);
            if (aVar == null && (aVar = (a) this.f8232f.f8268f.get(fVar.f8254g)) == null) {
                aVar = this.f8231e;
            }
            SparseArray sparseArray3 = fVar.f8258k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g gVar = (g) sparseArray3.valueAt(i15);
                c cVar = (c) this.f8232f.f8267e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f8232f.f8269g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f8253f, gVar.f8260c + i13, i14 + gVar.f8261d, cVar2.b ? null : this.f8228a, this.f8229c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i16 = fVar.f8253f;
                if (i16 == 3) {
                    i10 = aVar.f8236d[fVar.f8255h];
                } else if (i16 == 2) {
                    i10 = aVar.f8235c[fVar.f8256i];
                } else {
                    i10 = aVar.b[fVar.f8257j];
                }
                this.b.setColor(i10);
                this.f8229c.drawRect(i13, i14, fVar.f8250c + i13, fVar.f8251d + i14, this.b);
            }
            arrayList.add(new z4.b().a(Bitmap.createBitmap(this.f8233g, i13, i14, fVar.f8250c, fVar.f8251d)).b(i13 / bVar.f8237a).b(0).a(i14 / bVar.b, 0).a(0).d(fVar.f8250c / bVar.f8237a).a(fVar.f8251d / bVar.b).a());
            this.f8229c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f8229c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        xg xgVar = new xg(bArr);
        int i12 = i10;
        int i13 = i11;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xgVar.b() != 0) {
            int a6 = xgVar.a(8);
            if (a6 != 240) {
                switch (a6) {
                    case 16:
                        if (i9 != 3) {
                            if (i9 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = f8225h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            i12 = a(xgVar, iArr, bArr2, i12, i13, paint, canvas);
                            xgVar.c();
                        } else if (bArr5 == null) {
                            bArr3 = f8226i;
                            bArr2 = bArr3;
                            i12 = a(xgVar, iArr, bArr2, i12, i13, paint, canvas);
                            xgVar.c();
                            break;
                        } else {
                            bArr2 = bArr5;
                            i12 = a(xgVar, iArr, bArr2, i12, i13, paint, canvas);
                            xgVar.c();
                        }
                    case 17:
                        if (i9 == 3) {
                            bArr4 = bArr6 == null ? f8227j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i12 = b(xgVar, iArr, bArr4, i12, i13, paint, canvas);
                        xgVar.c();
                        break;
                    case 18:
                        i12 = c(xgVar, iArr, null, i12, i13, paint, canvas);
                        break;
                    default:
                        switch (a6) {
                            case 32:
                                bArr7 = a(4, 4, xgVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xgVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, xgVar);
                                break;
                        }
                }
            } else {
                i13 += 2;
                i12 = i10;
            }
        }
    }
}
