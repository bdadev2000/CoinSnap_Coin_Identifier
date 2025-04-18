package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class i7 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f5261h = {0, 7, 8, Ascii.SI};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f5262i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f5263j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5264b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f5265c;

    /* renamed from: d, reason: collision with root package name */
    private final b f5266d;

    /* renamed from: e, reason: collision with root package name */
    private final a f5267e;

    /* renamed from: f, reason: collision with root package name */
    private final h f5268f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f5269g;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f5270b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f5271c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f5272d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i10;
            this.f5270b = iArr;
            this.f5271c = iArr2;
            this.f5272d = iArr3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5273b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5274c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5275d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5276e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5277f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.a = i10;
            this.f5273b = i11;
            this.f5274c = i12;
            this.f5275d = i13;
            this.f5276e = i14;
            this.f5277f = i15;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5278b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f5279c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f5280d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.a = i10;
            this.f5278b = z10;
            this.f5279c = bArr;
            this.f5280d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5281b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5282c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f5283d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.a = i10;
            this.f5281b = i11;
            this.f5282c = i12;
            this.f5283d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5284b;

        public e(int i10, int i11) {
            this.a = i10;
            this.f5284b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f5285b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5286c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5287d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5288e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5289f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5290g;

        /* renamed from: h, reason: collision with root package name */
        public final int f5291h;

        /* renamed from: i, reason: collision with root package name */
        public final int f5292i;

        /* renamed from: j, reason: collision with root package name */
        public final int f5293j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f5294k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.a = i10;
            this.f5285b = z10;
            this.f5286c = i11;
            this.f5287d = i12;
            this.f5288e = i13;
            this.f5289f = i14;
            this.f5290g = i15;
            this.f5291h = i16;
            this.f5292i = i17;
            this.f5293j = i18;
            this.f5294k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f5294k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f5294k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5295b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5296c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5297d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5298e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5299f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.a = i10;
            this.f5295b = i11;
            this.f5296c = i12;
            this.f5297d = i13;
            this.f5298e = i14;
            this.f5299f = i15;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5300b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f5301c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f5302d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f5303e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f5304f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f5305g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f5306h;

        /* renamed from: i, reason: collision with root package name */
        public d f5307i;

        public h(int i10, int i11) {
            this.a = i10;
            this.f5300b = i11;
        }

        public void a() {
            this.f5301c.clear();
            this.f5302d.clear();
            this.f5303e.clear();
            this.f5304f.clear();
            this.f5305g.clear();
            this.f5306h = null;
            this.f5307i = null;
        }
    }

    public i7(int i10, int i11) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f5264b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f5265c = new Canvas();
        this.f5266d = new b(719, 575, 0, 719, 0, 575);
        this.f5267e = new a(0, a(), b(), c());
        this.f5268f = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = a(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public void d() {
        this.f5268f.a();
    }

    private static byte[] a(int i10, int i11, xg xgVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xgVar.a(i11);
        }
        return bArr;
    }

    private static int b(xg xgVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int a10;
        int a11;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int a12 = xgVar.a(4);
            if (a12 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!xgVar.f()) {
                int a13 = xgVar.a(3);
                if (a13 != 0) {
                    z10 = z11;
                    i12 = a13 + 2;
                    a12 = 0;
                } else {
                    z10 = true;
                    a12 = 0;
                    i12 = 0;
                }
            } else {
                if (!xgVar.f()) {
                    a10 = xgVar.a(2) + 4;
                    a11 = xgVar.a(4);
                } else {
                    int a14 = xgVar.a(2);
                    if (a14 == 0) {
                        z10 = z11;
                        i12 = 1;
                    } else if (a14 == 1) {
                        z10 = z11;
                        i12 = 2;
                    } else if (a14 == 2) {
                        a10 = xgVar.a(4) + 9;
                        a11 = xgVar.a(4);
                    } else if (a14 != 3) {
                        z10 = z11;
                        a12 = 0;
                        i12 = 0;
                    } else {
                        a10 = xgVar.a(8) + 25;
                        a11 = xgVar.a(4);
                    }
                    a12 = 0;
                }
                z10 = z11;
                i12 = a10;
                a12 = a11;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    a12 = bArr[a12];
                }
                paint.setColor(iArr[a12]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int a(xg xgVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int a10;
        int a11;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int a12 = xgVar.a(2);
            if (a12 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (xgVar.f()) {
                    a10 = xgVar.a(3) + 3;
                    a11 = xgVar.a(2);
                } else {
                    if (xgVar.f()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int a13 = xgVar.a(2);
                        if (a13 == 0) {
                            z10 = true;
                        } else if (a13 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (a13 == 2) {
                            a10 = xgVar.a(4) + 12;
                            a11 = xgVar.a(2);
                        } else if (a13 != 3) {
                            z10 = z11;
                        } else {
                            a10 = xgVar.a(8) + 29;
                            a11 = xgVar.a(2);
                        }
                        a12 = 0;
                        i12 = 0;
                    }
                    a12 = 0;
                }
                z10 = z11;
                i12 = a10;
                a12 = a11;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    a12 = bArr[a12];
                }
                paint.setColor(iArr[a12]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int c(xg xgVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int a10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int a11 = xgVar.a(8);
            if (a11 != 0) {
                z10 = z11;
                a10 = 1;
            } else if (!xgVar.f()) {
                int a12 = xgVar.a(7);
                if (a12 != 0) {
                    z10 = z11;
                    a10 = a12;
                    a11 = 0;
                } else {
                    z10 = true;
                    a11 = 0;
                    a10 = 0;
                }
            } else {
                z10 = z11;
                a10 = xgVar.a(7);
                a11 = xgVar.a(8);
            }
            if (a10 != 0 && paint != null) {
                if (bArr != null) {
                    a11 = bArr[a11];
                }
                paint.setColor(iArr[a11]);
                canvas.drawRect(i12, i11, i12 + a10, i11 + 1, paint);
            }
            i12 += a10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static f c(xg xgVar, int i10) {
        int i11;
        int a10;
        int a11;
        int a12 = xgVar.a(8);
        xgVar.d(4);
        boolean f10 = xgVar.f();
        xgVar.d(3);
        int i12 = 16;
        int a13 = xgVar.a(16);
        int a14 = xgVar.a(16);
        int a15 = xgVar.a(3);
        int a16 = xgVar.a(3);
        int i13 = 2;
        xgVar.d(2);
        int a17 = xgVar.a(8);
        int a18 = xgVar.a(8);
        int a19 = xgVar.a(4);
        int a20 = xgVar.a(2);
        xgVar.d(2);
        int i14 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i14 > 0) {
            int a21 = xgVar.a(i12);
            int a22 = xgVar.a(i13);
            int a23 = xgVar.a(i13);
            int a24 = xgVar.a(12);
            int i15 = a20;
            xgVar.d(4);
            int a25 = xgVar.a(12);
            int i16 = i14 - 6;
            if (a22 != 1) {
                i11 = 2;
                if (a22 != 2) {
                    a10 = 0;
                    a11 = 0;
                    i14 = i16;
                    sparseArray.put(a21, new g(a22, a23, a24, a25, a10, a11));
                    i13 = i11;
                    a20 = i15;
                    i12 = 16;
                }
            } else {
                i11 = 2;
            }
            i14 -= 8;
            a10 = xgVar.a(8);
            a11 = xgVar.a(8);
            sparseArray.put(a21, new g(a22, a23, a24, a25, a10, a11));
            i13 = i11;
            a20 = i15;
            i12 = 16;
        }
        return new f(a12, f10, a13, a14, a15, a16, a17, a18, a19, a20, sparseArray);
    }

    private static c b(xg xgVar) {
        byte[] bArr;
        int a10 = xgVar.a(16);
        xgVar.d(4);
        int a11 = xgVar.a(2);
        boolean f10 = xgVar.f();
        xgVar.d(1);
        byte[] bArr2 = yp.f9257f;
        if (a11 == 1) {
            xgVar.d(xgVar.a(8) * 16);
        } else if (a11 == 0) {
            int a12 = xgVar.a(16);
            int a13 = xgVar.a(16);
            if (a12 > 0) {
                bArr2 = new byte[a12];
                xgVar.b(bArr2, 0, a12);
            }
            if (a13 > 0) {
                bArr = new byte[a13];
                xgVar.b(bArr, 0, a13);
                return new c(a10, f10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a10, f10, bArr2, bArr);
    }

    private static void a(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f5272d;
        } else if (i10 == 2) {
            iArr = aVar.f5271c;
        } else {
            iArr = aVar.f5270b;
        }
        int[] iArr2 = iArr;
        a(cVar.f5279c, iArr2, i10, i11, i12, paint, canvas);
        a(cVar.f5280d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static a a(xg xgVar, int i10) {
        int a10;
        int i11;
        int a11;
        int i12;
        int i13;
        int i14 = 8;
        int a12 = xgVar.a(8);
        xgVar.d(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] a13 = a();
        int[] b3 = b();
        int[] c10 = c();
        while (i16 > 0) {
            int a14 = xgVar.a(i14);
            int a15 = xgVar.a(i14);
            int[] iArr = (a15 & 128) != 0 ? a13 : (a15 & 64) != 0 ? b3 : c10;
            if ((a15 & 1) != 0) {
                i12 = xgVar.a(i14);
                i13 = xgVar.a(i14);
                a10 = xgVar.a(i14);
                a11 = xgVar.a(i14);
                i11 = i16 - 6;
            } else {
                int a16 = xgVar.a(6) << i15;
                int a17 = xgVar.a(4) << 4;
                a10 = xgVar.a(4) << 4;
                i11 = i16 - 4;
                a11 = xgVar.a(i15) << 6;
                i12 = a16;
                i13 = a17;
            }
            if (i12 == 0) {
                a11 = 255;
                i13 = 0;
                a10 = 0;
            }
            double d10 = i12;
            double d11 = i13 - 128;
            double d12 = a10 - 128;
            iArr[a14] = a((byte) (255 - (a11 & 255)), yp.a((int) ((1.402d * d11) + d10), 0, 255), yp.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), yp.a((int) ((d12 * 1.772d) + d10), 0, 255));
            i16 = i11;
            a12 = a12;
            i14 = 8;
            i15 = 2;
        }
        return new a(a12, a13, b3, c10);
    }

    private static d b(xg xgVar, int i10) {
        int a10 = xgVar.a(8);
        int a11 = xgVar.a(4);
        int a12 = xgVar.a(2);
        xgVar.d(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int a13 = xgVar.a(8);
            xgVar.d(8);
            i11 -= 6;
            sparseArray.put(a13, new e(xgVar.a(16), xgVar.a(16)));
        }
        return new d(a10, a11, a12, sparseArray);
    }

    private static b a(xg xgVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        xgVar.d(4);
        boolean f10 = xgVar.f();
        xgVar.d(3);
        int a10 = xgVar.a(16);
        int a11 = xgVar.a(16);
        if (f10) {
            int a12 = xgVar.a(16);
            int a13 = xgVar.a(16);
            int a14 = xgVar.a(16);
            i13 = xgVar.a(16);
            i12 = a13;
            i11 = a14;
            i10 = a12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = a10;
            i13 = a11;
        }
        return new b(a10, a11, i10, i12, i11, i13);
    }

    private static void a(xg xgVar, h hVar) {
        f fVar;
        int a10 = xgVar.a(8);
        int a11 = xgVar.a(16);
        int a12 = xgVar.a(16);
        int d10 = xgVar.d() + a12;
        if (a12 * 8 > xgVar.b()) {
            kc.d("DvbParser", "Data field length exceeds limit");
            xgVar.d(xgVar.b());
            return;
        }
        switch (a10) {
            case 16:
                if (a11 == hVar.a) {
                    d dVar = hVar.f5307i;
                    d b3 = b(xgVar, a12);
                    if (b3.f5282c != 0) {
                        hVar.f5307i = b3;
                        hVar.f5301c.clear();
                        hVar.f5302d.clear();
                        hVar.f5303e.clear();
                        break;
                    } else if (dVar != null && dVar.f5281b != b3.f5281b) {
                        hVar.f5307i = b3;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f5307i;
                if (a11 == hVar.a && dVar2 != null) {
                    f c10 = c(xgVar, a12);
                    if (dVar2.f5282c == 0 && (fVar = (f) hVar.f5301c.get(c10.a)) != null) {
                        c10.a(fVar);
                    }
                    hVar.f5301c.put(c10.a, c10);
                    break;
                }
                break;
            case 18:
                if (a11 == hVar.a) {
                    a a13 = a(xgVar, a12);
                    hVar.f5302d.put(a13.a, a13);
                    break;
                } else if (a11 == hVar.f5300b) {
                    a a14 = a(xgVar, a12);
                    hVar.f5304f.put(a14.a, a14);
                    break;
                }
                break;
            case 19:
                if (a11 == hVar.a) {
                    c b10 = b(xgVar);
                    hVar.f5303e.put(b10.a, b10);
                    break;
                } else if (a11 == hVar.f5300b) {
                    c b11 = b(xgVar);
                    hVar.f5305g.put(b11.a, b11);
                    break;
                }
                break;
            case 20:
                if (a11 == hVar.a) {
                    hVar.f5306h = a(xgVar);
                    break;
                }
                break;
        }
        xgVar.e(d10 - xgVar.d());
    }

    public List a(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray sparseArray;
        xg xgVar = new xg(bArr, i10);
        while (xgVar.b() >= 48 && xgVar.a(8) == 15) {
            a(xgVar, this.f5268f);
        }
        h hVar = this.f5268f;
        d dVar = hVar.f5307i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f5306h;
        if (bVar == null) {
            bVar = this.f5266d;
        }
        Bitmap bitmap = this.f5269g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.f5273b + 1 != this.f5269g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.f5273b + 1, Bitmap.Config.ARGB_8888);
            this.f5269g = createBitmap;
            this.f5265c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f5283d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f5265c.save();
            e eVar = (e) sparseArray2.valueAt(i13);
            f fVar = (f) this.f5268f.f5301c.get(sparseArray2.keyAt(i13));
            int i14 = eVar.a + bVar.f5274c;
            int i15 = eVar.f5284b + bVar.f5276e;
            this.f5265c.clipRect(i14, i15, Math.min(fVar.f5286c + i14, bVar.f5275d), Math.min(fVar.f5287d + i15, bVar.f5277f));
            a aVar = (a) this.f5268f.f5302d.get(fVar.f5290g);
            if (aVar == null && (aVar = (a) this.f5268f.f5304f.get(fVar.f5290g)) == null) {
                aVar = this.f5267e;
            }
            SparseArray sparseArray3 = fVar.f5294k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g gVar = (g) sparseArray3.valueAt(i16);
                c cVar = (c) this.f5268f.f5303e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f5268f.f5305g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i12 = i16;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f5289f, gVar.f5296c + i14, i15 + gVar.f5297d, cVar2.f5278b ? null : this.a, this.f5265c);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f5285b) {
                int i17 = fVar.f5289f;
                if (i17 == 3) {
                    i11 = aVar.f5272d[fVar.f5291h];
                } else if (i17 == 2) {
                    i11 = aVar.f5271c[fVar.f5292i];
                } else {
                    i11 = aVar.f5270b[fVar.f5293j];
                }
                this.f5264b.setColor(i11);
                this.f5265c.drawRect(i14, i15, fVar.f5286c + i14, fVar.f5287d + i15, this.f5264b);
            }
            arrayList.add(new z4.b().a(Bitmap.createBitmap(this.f5269g, i14, i15, fVar.f5286c, fVar.f5287d)).b(i14 / bVar.a).b(0).a(i15 / bVar.f5273b, 0).a(0).d(fVar.f5286c / bVar.a).a(fVar.f5287d / bVar.f5273b).a());
            this.f5265c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f5265c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        xg xgVar = new xg(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xgVar.b() != 0) {
            int a10 = xgVar.a(8);
            if (a10 != 240) {
                switch (a10) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = f5261h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            i13 = a(xgVar, iArr, bArr2, i13, i14, paint, canvas);
                            xgVar.c();
                        } else if (bArr5 == null) {
                            bArr3 = f5262i;
                            bArr2 = bArr3;
                            i13 = a(xgVar, iArr, bArr2, i13, i14, paint, canvas);
                            xgVar.c();
                            break;
                        } else {
                            bArr2 = bArr5;
                            i13 = a(xgVar, iArr, bArr2, i13, i14, paint, canvas);
                            xgVar.c();
                        }
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f5263j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = b(xgVar, iArr, bArr4, i13, i14, paint, canvas);
                        xgVar.c();
                        break;
                    case 18:
                        i13 = c(xgVar, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (a10) {
                            case 32:
                                bArr7 = a(4, 4, xgVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xgVar);
                                break;
                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                                bArr6 = a(16, 8, xgVar);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }
}
