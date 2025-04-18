package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class ea implements o7 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f4414l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final wp a;

    /* renamed from: b, reason: collision with root package name */
    private final yg f4415b;

    /* renamed from: e, reason: collision with root package name */
    private final tf f4418e;

    /* renamed from: f, reason: collision with root package name */
    private b f4419f;

    /* renamed from: g, reason: collision with root package name */
    private long f4420g;

    /* renamed from: h, reason: collision with root package name */
    private String f4421h;

    /* renamed from: i, reason: collision with root package name */
    private ro f4422i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4423j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f4416c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f4417d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    private long f4424k = C.TIME_UNSET;

    public ea(wp wpVar) {
        this.a = wpVar;
        if (wpVar != null) {
            this.f4418e = new tf(178, 128);
            this.f4415b = new yg();
        } else {
            this.f4418e = null;
            this.f4415b = null;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f4419f);
        a1.b(this.f4422i);
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        byte[] c10 = ygVar.c();
        this.f4420g += ygVar.a();
        this.f4422i.a(ygVar, ygVar.a());
        while (true) {
            int a10 = uf.a(c10, d10, e2, this.f4416c);
            if (a10 == e2) {
                break;
            }
            int i10 = a10 + 3;
            int i11 = ygVar.c()[i10] & UByte.MAX_VALUE;
            int i12 = a10 - d10;
            int i13 = 0;
            if (!this.f4423j) {
                if (i12 > 0) {
                    this.f4417d.a(c10, d10, a10);
                }
                if (this.f4417d.a(i11, i12 < 0 ? -i12 : 0)) {
                    ro roVar = this.f4422i;
                    a aVar = this.f4417d;
                    roVar.a(a(aVar, aVar.f4428d, (String) a1.a((Object) this.f4421h)));
                    this.f4423j = true;
                }
            }
            this.f4419f.a(c10, d10, a10);
            tf tfVar = this.f4418e;
            if (tfVar != null) {
                if (i12 > 0) {
                    tfVar.a(c10, d10, a10);
                } else {
                    i13 = -i12;
                }
                if (this.f4418e.a(i13)) {
                    tf tfVar2 = this.f4418e;
                    ((yg) yp.a(this.f4415b)).a(this.f4418e.f8269d, uf.c(tfVar2.f8269d, tfVar2.f8270e));
                    ((wp) yp.a(this.a)).a(this.f4424k, this.f4415b);
                }
                if (i11 == 178 && ygVar.c()[a10 + 2] == 1) {
                    this.f4418e.b(i11);
                }
            }
            int i14 = e2 - a10;
            this.f4419f.a(this.f4420g - i14, i14, this.f4423j);
            this.f4419f.a(i11, this.f4424k);
            d10 = i10;
        }
        if (!this.f4423j) {
            this.f4417d.a(c10, d10, e2);
        }
        this.f4419f.a(c10, d10, e2);
        tf tfVar3 = this.f4418e;
        if (tfVar3 != null) {
            tfVar3.a(c10, d10, e2);
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f4425f = {0, 0, 1};
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f4426b;

        /* renamed from: c, reason: collision with root package name */
        public int f4427c;

        /* renamed from: d, reason: collision with root package name */
        public int f4428d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f4429e;

        public a(int i10) {
            this.f4429e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f4429e;
                int length = bArr2.length;
                int i13 = this.f4427c + i12;
                if (length < i13) {
                    this.f4429e = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f4429e, this.f4427c, i12);
                this.f4427c += i12;
            }
        }

        public boolean a(int i10, int i11) {
            int i12 = this.f4426b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f4427c -= i11;
                                this.a = false;
                                return true;
                            }
                        } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            kc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f4428d = this.f4427c;
                            this.f4426b = 4;
                        }
                    } else if (i10 > 31) {
                        kc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f4426b = 3;
                    }
                } else if (i10 != 181) {
                    kc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f4426b = 2;
                }
            } else if (i10 == 176) {
                this.f4426b = 1;
                this.a = true;
            }
            byte[] bArr = f4425f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.a = false;
            this.f4427c = 0;
            this.f4426b = 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final ro a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4430b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4431c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4432d;

        /* renamed from: e, reason: collision with root package name */
        private int f4433e;

        /* renamed from: f, reason: collision with root package name */
        private int f4434f;

        /* renamed from: g, reason: collision with root package name */
        private long f4435g;

        /* renamed from: h, reason: collision with root package name */
        private long f4436h;

        public b(ro roVar) {
            this.a = roVar;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f4431c) {
                int i12 = this.f4434f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f4432d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f4431c = false;
                } else {
                    this.f4434f = (i11 - i10) + i12;
                }
            }
        }

        public void a(long j3, int i10, boolean z10) {
            if (this.f4433e == 182 && z10 && this.f4430b) {
                long j10 = this.f4436h;
                if (j10 != C.TIME_UNSET) {
                    this.a.a(j10, this.f4432d ? 1 : 0, (int) (j3 - this.f4435g), i10, null);
                }
            }
            if (this.f4433e != 179) {
                this.f4435g = j3;
            }
        }

        public void a(int i10, long j3) {
            this.f4433e = i10;
            this.f4432d = false;
            this.f4430b = i10 == 182 || i10 == 179;
            this.f4431c = i10 == 182;
            this.f4434f = 0;
            this.f4436h = j3;
        }

        public void a() {
            this.f4430b = false;
            this.f4431c = false;
            this.f4432d = false;
            this.f4433e = -1;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f4421h = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f4422i = a10;
        this.f4419f = new b(a10);
        wp wpVar = this.a;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f4424k = j3;
        }
    }

    private static d9 a(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f4429e, aVar.f4427c);
        xg xgVar = new xg(copyOf);
        xgVar.e(i10);
        xgVar.e(4);
        xgVar.g();
        xgVar.d(8);
        if (xgVar.f()) {
            xgVar.d(4);
            xgVar.d(3);
        }
        int a10 = xgVar.a(4);
        float f10 = 1.0f;
        if (a10 == 15) {
            int a11 = xgVar.a(8);
            int a12 = xgVar.a(8);
            if (a12 == 0) {
                kc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = a11 / a12;
            }
        } else {
            float[] fArr = f4414l;
            if (a10 < fArr.length) {
                f10 = fArr[a10];
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
        int a13 = xgVar.a(16);
        xgVar.g();
        if (xgVar.f()) {
            if (a13 == 0) {
                kc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = a13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xgVar.d(i11);
            }
        }
        xgVar.g();
        int a14 = xgVar.a(13);
        xgVar.g();
        int a15 = xgVar.a(13);
        xgVar.g();
        xgVar.g();
        return new d9.b().c(str).f(MimeTypes.VIDEO_MP4V).q(a14).g(a15).b(f10).a(Collections.singletonList(copyOf)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.f4416c);
        this.f4417d.a();
        b bVar = this.f4419f;
        if (bVar != null) {
            bVar.a();
        }
        tf tfVar = this.f4418e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f4420g = 0L;
        this.f4424k = C.TIME_UNSET;
    }
}
