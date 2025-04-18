package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class ga implements q7 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f24059l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final vp f24060a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f24061b;
    private final yf e;

    /* renamed from: f, reason: collision with root package name */
    private b f24063f;

    /* renamed from: g, reason: collision with root package name */
    private long f24064g;

    /* renamed from: h, reason: collision with root package name */
    private String f24065h;

    /* renamed from: i, reason: collision with root package name */
    private qo f24066i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24067j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f24062c = new boolean[4];
    private final a d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    private long f24068k = -9223372036854775807L;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f24069f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f24070a;

        /* renamed from: b, reason: collision with root package name */
        private int f24071b;

        /* renamed from: c, reason: collision with root package name */
        public int f24072c;
        public int d;
        public byte[] e;

        public a(int i2) {
            this.e = new byte[i2];
        }

        public void a() {
            this.f24070a = false;
            this.f24072c = 0;
            this.f24071b = 0;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f24070a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i5 = this.f24072c + i4;
                if (length < i5) {
                    this.e = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.e, this.f24072c, i4);
                this.f24072c += i4;
            }
        }

        public boolean a(int i2, int i3) {
            int i4 = this.f24071b;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i2 == 179 || i2 == 181) {
                                this.f24072c -= i3;
                                this.f24070a = false;
                                return true;
                            }
                        } else if ((i2 & 240) != 32) {
                            pc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.d = this.f24072c;
                            this.f24071b = 4;
                        }
                    } else if (i2 > 31) {
                        pc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f24071b = 3;
                    }
                } else if (i2 != 181) {
                    pc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f24071b = 2;
                }
            } else if (i2 == 176) {
                this.f24071b = 1;
                this.f24070a = true;
            }
            byte[] bArr = f24069f;
            a(bArr, 0, bArr.length);
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final qo f24073a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24074b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24075c;
        private boolean d;
        private int e;

        /* renamed from: f, reason: collision with root package name */
        private int f24076f;

        /* renamed from: g, reason: collision with root package name */
        private long f24077g;

        /* renamed from: h, reason: collision with root package name */
        private long f24078h;

        public b(qo qoVar) {
            this.f24073a = qoVar;
        }

        public void a() {
            this.f24074b = false;
            this.f24075c = false;
            this.d = false;
            this.e = -1;
        }

        public void a(int i2, long j2) {
            this.e = i2;
            this.d = false;
            this.f24074b = i2 == 182 || i2 == 179;
            this.f24075c = i2 == 182;
            this.f24076f = 0;
            this.f24078h = j2;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f24075c) {
                int i4 = this.f24076f;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f24076f = (i3 - i2) + i4;
                } else {
                    this.d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f24075c = false;
                }
            }
        }

        public void a(long j2, int i2, boolean z2) {
            if (this.e == 182 && z2 && this.f24074b) {
                long j3 = this.f24078h;
                if (j3 != -9223372036854775807L) {
                    this.f24073a.a(j3, this.d ? 1 : 0, (int) (j2 - this.f24077g), i2, null);
                }
            }
            if (this.e != 179) {
                this.f24077g = j2;
            }
        }
    }

    public ga(vp vpVar) {
        this.f24060a = vpVar;
        if (vpVar != null) {
            this.e = new yf(Opcodes.GETSTATIC, 128);
            this.f24061b = new bh();
        } else {
            this.e = null;
            this.f24061b = null;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f24068k = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.f24063f);
        b1.b(this.f24066i);
        int d = bhVar.d();
        int e = bhVar.e();
        byte[] c2 = bhVar.c();
        this.f24064g += bhVar.a();
        this.f24066i.a(bhVar, bhVar.a());
        while (true) {
            int a2 = zf.a(c2, d, e, this.f24062c);
            if (a2 == e) {
                break;
            }
            int i2 = a2 + 3;
            int i3 = bhVar.c()[i2] & UnsignedBytes.MAX_VALUE;
            int i4 = a2 - d;
            int i5 = 0;
            if (!this.f24067j) {
                if (i4 > 0) {
                    this.d.a(c2, d, a2);
                }
                if (this.d.a(i3, i4 < 0 ? -i4 : 0)) {
                    qo qoVar = this.f24066i;
                    a aVar = this.d;
                    qoVar.a(a(aVar, aVar.d, (String) b1.a((Object) this.f24065h)));
                    this.f24067j = true;
                }
            }
            this.f24063f.a(c2, d, a2);
            yf yfVar = this.e;
            if (yfVar != null) {
                if (i4 > 0) {
                    yfVar.a(c2, d, a2);
                } else {
                    i5 = -i4;
                }
                if (this.e.a(i5)) {
                    yf yfVar2 = this.e;
                    ((bh) xp.a(this.f24061b)).a(this.e.d, zf.c(yfVar2.d, yfVar2.e));
                    ((vp) xp.a(this.f24060a)).a(this.f24068k, this.f24061b);
                }
                if (i3 == 178 && bhVar.c()[a2 + 2] == 1) {
                    this.e.b(i3);
                }
            }
            int i6 = e - a2;
            this.f24063f.a(this.f24064g - i6, i6, this.f24067j);
            this.f24063f.a(i3, this.f24068k);
            d = i2;
        }
        if (!this.f24067j) {
            this.d.a(c2, d, e);
        }
        this.f24063f.a(c2, d, e);
        yf yfVar3 = this.e;
        if (yfVar3 != null) {
            yfVar3.a(c2, d, e);
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.f24065h = dVar.b();
        qo a2 = m8Var.a(dVar.c(), 2);
        this.f24066i = a2;
        this.f24063f = new b(a2);
        vp vpVar = this.f24060a;
        if (vpVar != null) {
            vpVar.a(m8Var, dVar);
        }
    }

    private static f9 a(a aVar, int i2, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.f24072c);
        ah ahVar = new ah(copyOf);
        ahVar.e(i2);
        ahVar.e(4);
        ahVar.g();
        ahVar.d(8);
        if (ahVar.f()) {
            ahVar.d(4);
            ahVar.d(3);
        }
        int a2 = ahVar.a(4);
        float f2 = 1.0f;
        if (a2 == 15) {
            int a3 = ahVar.a(8);
            int a4 = ahVar.a(8);
            if (a4 == 0) {
                pc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f2 = a3 / a4;
            }
        } else {
            float[] fArr = f24059l;
            if (a2 < fArr.length) {
                f2 = fArr[a2];
            } else {
                pc.d("H263Reader", "Invalid aspect ratio");
            }
        }
        if (ahVar.f()) {
            ahVar.d(2);
            ahVar.d(1);
            if (ahVar.f()) {
                ahVar.d(15);
                ahVar.g();
                ahVar.d(15);
                ahVar.g();
                ahVar.d(15);
                ahVar.g();
                ahVar.d(3);
                ahVar.d(11);
                ahVar.g();
                ahVar.d(15);
                ahVar.g();
            }
        }
        if (ahVar.a(2) != 0) {
            pc.d("H263Reader", "Unhandled video object layer shape");
        }
        ahVar.g();
        int a5 = ahVar.a(16);
        ahVar.g();
        if (ahVar.f()) {
            if (a5 == 0) {
                pc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i3 = 0;
                for (int i4 = a5 - 1; i4 > 0; i4 >>= 1) {
                    i3++;
                }
                ahVar.d(i3);
            }
        }
        ahVar.g();
        int a6 = ahVar.a(13);
        ahVar.g();
        int a7 = ahVar.a(13);
        ahVar.g();
        ahVar.g();
        return new f9.b().c(str).f("video/mp4v-es").q(a6).g(a7).b(f2).a(Collections.singletonList(copyOf)).a();
    }

    @Override // com.applovin.impl.q7
    public void a() {
        zf.a(this.f24062c);
        this.d.a();
        b bVar = this.f24063f;
        if (bVar != null) {
            bVar.a();
        }
        yf yfVar = this.e;
        if (yfVar != null) {
            yfVar.b();
        }
        this.f24064g = 0L;
        this.f24068k = -9223372036854775807L;
    }
}
