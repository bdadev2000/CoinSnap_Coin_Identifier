package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ea implements o7 {
    private static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final wp f7388a;
    private final yg b;

    /* renamed from: e, reason: collision with root package name */
    private final tf f7391e;

    /* renamed from: f, reason: collision with root package name */
    private b f7392f;

    /* renamed from: g, reason: collision with root package name */
    private long f7393g;

    /* renamed from: h, reason: collision with root package name */
    private String f7394h;

    /* renamed from: i, reason: collision with root package name */
    private ro f7395i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7396j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f7389c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f7390d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    private long f7397k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public ea(wp wpVar) {
        this.f7388a = wpVar;
        if (wpVar != null) {
            this.f7391e = new tf(178, 128);
            this.b = new yg();
        } else {
            this.f7391e = null;
            this.b = null;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f7392f);
        AbstractC0669a1.b(this.f7395i);
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        byte[] c9 = ygVar.c();
        this.f7393g += ygVar.a();
        this.f7395i.a(ygVar, ygVar.a());
        while (true) {
            int a6 = uf.a(c9, d2, e4, this.f7389c);
            if (a6 == e4) {
                break;
            }
            int i9 = a6 + 3;
            int i10 = ygVar.c()[i9] & 255;
            int i11 = a6 - d2;
            int i12 = 0;
            if (!this.f7396j) {
                if (i11 > 0) {
                    this.f7390d.a(c9, d2, a6);
                }
                if (this.f7390d.a(i10, i11 < 0 ? -i11 : 0)) {
                    ro roVar = this.f7395i;
                    a aVar = this.f7390d;
                    roVar.a(a(aVar, aVar.f7401d, (String) AbstractC0669a1.a((Object) this.f7394h)));
                    this.f7396j = true;
                }
            }
            this.f7392f.a(c9, d2, a6);
            tf tfVar = this.f7391e;
            if (tfVar != null) {
                if (i11 > 0) {
                    tfVar.a(c9, d2, a6);
                } else {
                    i12 = -i11;
                }
                if (this.f7391e.a(i12)) {
                    tf tfVar2 = this.f7391e;
                    ((yg) yp.a(this.b)).a(this.f7391e.f11484d, uf.c(tfVar2.f11484d, tfVar2.f11485e));
                    ((wp) yp.a(this.f7388a)).a(this.f7397k, this.b);
                }
                if (i10 == 178 && ygVar.c()[a6 + 2] == 1) {
                    this.f7391e.b(i10);
                }
            }
            int i13 = e4 - a6;
            this.f7392f.a(this.f7393g - i13, i13, this.f7396j);
            this.f7392f.a(i10, this.f7397k);
            d2 = i9;
        }
        if (!this.f7396j) {
            this.f7390d.a(c9, d2, e4);
        }
        this.f7392f.a(c9, d2, e4);
        tf tfVar3 = this.f7391e;
        if (tfVar3 != null) {
            tfVar3.a(c9, d2, e4);
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f7398f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f7399a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        public int f7400c;

        /* renamed from: d, reason: collision with root package name */
        public int f7401d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f7402e;

        public a(int i9) {
            this.f7402e = new byte[i9];
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f7399a) {
                int i11 = i10 - i9;
                byte[] bArr2 = this.f7402e;
                int length = bArr2.length;
                int i12 = this.f7400c + i11;
                if (length < i12) {
                    this.f7402e = Arrays.copyOf(bArr2, i12 * 2);
                }
                System.arraycopy(bArr, i9, this.f7402e, this.f7400c, i11);
                this.f7400c += i11;
            }
        }

        public boolean a(int i9, int i10) {
            int i11 = this.b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i9 == 179 || i9 == 181) {
                                this.f7400c -= i10;
                                this.f7399a = false;
                                return true;
                            }
                        } else if ((i9 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            kc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f7401d = this.f7400c;
                            this.b = 4;
                        }
                    } else if (i9 > 31) {
                        kc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.b = 3;
                    }
                } else if (i9 != 181) {
                    kc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.b = 2;
                }
            } else if (i9 == 176) {
                this.b = 1;
                this.f7399a = true;
            }
            byte[] bArr = f7398f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f7399a = false;
            this.f7400c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ro f7403a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7404c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7405d;

        /* renamed from: e, reason: collision with root package name */
        private int f7406e;

        /* renamed from: f, reason: collision with root package name */
        private int f7407f;

        /* renamed from: g, reason: collision with root package name */
        private long f7408g;

        /* renamed from: h, reason: collision with root package name */
        private long f7409h;

        public b(ro roVar) {
            this.f7403a = roVar;
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f7404c) {
                int i11 = this.f7407f;
                int i12 = (i9 + 1) - i11;
                if (i12 < i10) {
                    this.f7405d = ((bArr[i12] & 192) >> 6) == 0;
                    this.f7404c = false;
                } else {
                    this.f7407f = (i10 - i9) + i11;
                }
            }
        }

        public void a(long j7, int i9, boolean z8) {
            if (this.f7406e == 182 && z8 && this.b) {
                long j9 = this.f7409h;
                if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.f7403a.a(j9, this.f7405d ? 1 : 0, (int) (j7 - this.f7408g), i9, null);
                }
            }
            if (this.f7406e != 179) {
                this.f7408g = j7;
            }
        }

        public void a(int i9, long j7) {
            this.f7406e = i9;
            this.f7405d = false;
            this.b = i9 == 182 || i9 == 179;
            this.f7404c = i9 == 182;
            this.f7407f = 0;
            this.f7409h = j7;
        }

        public void a() {
            this.b = false;
            this.f7404c = false;
            this.f7405d = false;
            this.f7406e = -1;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7394h = dVar.b();
        ro a6 = k8Var.a(dVar.c(), 2);
        this.f7395i = a6;
        this.f7392f = new b(a6);
        wp wpVar = this.f7388a;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f7397k = j7;
        }
    }

    private static d9 a(a aVar, int i9, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f7402e, aVar.f7400c);
        xg xgVar = new xg(copyOf);
        xgVar.e(i9);
        xgVar.e(4);
        xgVar.g();
        xgVar.d(8);
        if (xgVar.f()) {
            xgVar.d(4);
            xgVar.d(3);
        }
        int a6 = xgVar.a(4);
        float f9 = 1.0f;
        if (a6 == 15) {
            int a9 = xgVar.a(8);
            int a10 = xgVar.a(8);
            if (a10 == 0) {
                kc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f9 = a9 / a10;
            }
        } else {
            float[] fArr = l;
            if (a6 < fArr.length) {
                f9 = fArr[a6];
            } else {
                kc.d("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xgVar.f()) {
            xgVar.d(2);
            xgVar.d(1);
            if (xgVar.f()) {
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(3);
                xgVar.d(11);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
            }
        }
        if (xgVar.a(2) != 0) {
            kc.d("H263Reader", "Unhandled video object layer shape");
        }
        xgVar.g();
        int a11 = xgVar.a(16);
        xgVar.g();
        if (xgVar.f()) {
            if (a11 == 0) {
                kc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i10 = 0;
                for (int i11 = a11 - 1; i11 > 0; i11 >>= 1) {
                    i10++;
                }
                xgVar.d(i10);
            }
        }
        xgVar.g();
        int a12 = xgVar.a(13);
        xgVar.g();
        int a13 = xgVar.a(13);
        xgVar.g();
        xgVar.g();
        return new d9.b().c(str).f(MimeTypes.VIDEO_MP4V).q(a12).g(a13).b(f9).a(Collections.singletonList(copyOf)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.f7389c);
        this.f7390d.a();
        b bVar = this.f7392f;
        if (bVar != null) {
            bVar.a();
        }
        tf tfVar = this.f7391e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f7393g = 0L;
        this.f7397k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
