package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.z4;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.applovin.impl.x2 */
/* loaded from: classes.dex */
public final class C0776x2 extends AbstractC0780y2 {

    /* renamed from: g */
    private final yg f12101g = new yg();

    /* renamed from: h */
    private final xg f12102h = new xg();

    /* renamed from: i */
    private int f12103i = -1;

    /* renamed from: j */
    private final boolean f12104j;

    /* renamed from: k */
    private final int f12105k;
    private final b[] l;
    private b m;

    /* renamed from: n */
    private List f12106n;

    /* renamed from: o */
    private List f12107o;

    /* renamed from: p */
    private c f12108p;

    /* renamed from: q */
    private int f12109q;

    /* renamed from: com.applovin.impl.x2$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        private static final Comparator f12110c = new X(3);

        /* renamed from: a */
        public final z4 f12111a;
        public final int b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, boolean z8, int i12, int i13) {
            z4.b d2 = new z4.b().a(charSequence).b(alignment).a(f9, i9).a(i10).b(f10).b(i11).d(f11);
            if (z8) {
                d2.d(i12);
            }
            this.f12111a = d2.a();
            this.b = i13;
        }

        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.b, aVar.b);
        }
    }

    /* renamed from: com.applovin.impl.x2$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f12142a;
        public final int b;

        /* renamed from: c */
        public final byte[] f12143c;

        /* renamed from: d */
        int f12144d = 0;

        public c(int i9, int i10) {
            this.f12142a = i9;
            this.b = i10;
            this.f12143c = new byte[(i10 * 2) - 1];
        }
    }

    public C0776x2(int i9, List list) {
        this.f12105k = i9 == -1 ? 1 : i9;
        this.f12104j = list != null && m3.a(list);
        this.l = new b[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10] = new b();
        }
        this.m = this.l[0];
    }

    private void c(int i9) {
        if (i9 > 7) {
            if (i9 <= 15) {
                this.f12102h.d(8);
            } else if (i9 <= 23) {
                this.f12102h.d(16);
            } else if (i9 <= 31) {
                this.f12102h.d(24);
            }
        }
    }

    private void d(int i9) {
        if (i9 <= 135) {
            this.f12102h.d(32);
            return;
        }
        if (i9 <= 143) {
            this.f12102h.d(40);
        } else if (i9 <= 159) {
            this.f12102h.d(2);
            this.f12102h.d(this.f12102h.a(6) * 8);
        }
    }

    private void h(int i9) {
        if (i9 != 32) {
            if (i9 != 33) {
                if (i9 != 37) {
                    if (i9 != 42) {
                        if (i9 != 44) {
                            if (i9 != 63) {
                                if (i9 != 57) {
                                    if (i9 != 58) {
                                        if (i9 != 60) {
                                            if (i9 != 61) {
                                                switch (i9) {
                                                    case 48:
                                                        this.m.a((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.m.a((char) 8216);
                                                        return;
                                                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                                        this.m.a((char) 8217);
                                                        return;
                                                    case 51:
                                                        this.m.a((char) 8220);
                                                        return;
                                                    case 52:
                                                        this.m.a((char) 8221);
                                                        return;
                                                    case 53:
                                                        this.m.a((char) 8226);
                                                        return;
                                                    default:
                                                        switch (i9) {
                                                            case 118:
                                                                this.m.a((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.m.a((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.m.a((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.m.a((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.m.a((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.m.a((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.m.a((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.m.a((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.m.a((char) 9496);
                                                                return;
                                                            case 127:
                                                                this.m.a((char) 9484);
                                                                return;
                                                            default:
                                                                L.p(i9, "Invalid G2 character: ", "Cea708Decoder");
                                                                return;
                                                        }
                                                }
                                            }
                                            this.m.a((char) 8480);
                                            return;
                                        }
                                        this.m.a((char) 339);
                                        return;
                                    }
                                    this.m.a((char) 353);
                                    return;
                                }
                                this.m.a((char) 8482);
                                return;
                            }
                            this.m.a((char) 376);
                            return;
                        }
                        this.m.a((char) 338);
                        return;
                    }
                    this.m.a((char) 352);
                    return;
                }
                this.m.a((char) 8230);
                return;
            }
            this.m.a((char) 160);
            return;
        }
        this.m.a(' ');
    }

    private void i(int i9) {
        if (i9 == 160) {
            this.m.a((char) 13252);
        } else {
            L.p(i9, "Invalid G3 character: ", "Cea708Decoder");
            this.m.a('_');
        }
    }

    private void k() {
        if (this.f12108p == null) {
            return;
        }
        q();
        this.f12108p = null;
    }

    private List l() {
        a b8;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 8; i9++) {
            if (!this.l[i9].f() && this.l[i9].g() && (b8 = this.l[i9].b()) != null) {
                arrayList.add(b8);
            }
        }
        Collections.sort(arrayList, a.f12110c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(((a) arrayList.get(i10)).f12111a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void m() {
        this.m.a(this.f12102h.a(4), this.f12102h.a(2), this.f12102h.a(2), this.f12102h.f(), this.f12102h.f(), this.f12102h.a(3), this.f12102h.a(3));
    }

    private void n() {
        int a6 = b.a(this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2));
        int a9 = b.a(this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2));
        this.f12102h.d(2);
        this.m.b(a6, a9, b.a(this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2)));
    }

    private void o() {
        this.f12102h.d(4);
        int a6 = this.f12102h.a(4);
        this.f12102h.d(2);
        this.m.a(a6, this.f12102h.a(6));
    }

    private void p() {
        int a6 = b.a(this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2));
        int a9 = this.f12102h.a(2);
        int a10 = b.a(this.f12102h.a(2), this.f12102h.a(2), this.f12102h.a(2));
        if (this.f12102h.f()) {
            a9 |= 4;
        }
        boolean f9 = this.f12102h.f();
        int a11 = this.f12102h.a(2);
        int a12 = this.f12102h.a(2);
        int a13 = this.f12102h.a(2);
        this.f12102h.d(8);
        this.m.a(a6, a10, f9, a9, a11, a12, a13);
    }

    private void q() {
        c cVar = this.f12108p;
        if (cVar.f12144d != (cVar.b * 2) - 1) {
            kc.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f12108p.b * 2) - 1) + ", but current index is " + this.f12108p.f12144d + " (sequence number " + this.f12108p.f12142a + ");");
        }
        xg xgVar = this.f12102h;
        c cVar2 = this.f12108p;
        xgVar.a(cVar2.f12143c, cVar2.f12144d);
        int a6 = this.f12102h.a(3);
        int a9 = this.f12102h.a(5);
        if (a6 == 7) {
            this.f12102h.d(2);
            a6 = this.f12102h.a(6);
            if (a6 < 7) {
                L.p(a6, "Invalid extended service number: ", "Cea708Decoder");
            }
        }
        if (a9 == 0) {
            if (a6 != 0) {
                kc.d("Cea708Decoder", "serviceNumber is non-zero (" + a6 + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (a6 != this.f12105k) {
            return;
        }
        boolean z8 = false;
        while (this.f12102h.b() > 0) {
            int a10 = this.f12102h.a(8);
            if (a10 != 16) {
                if (a10 <= 31) {
                    a(a10);
                } else {
                    if (a10 <= 127) {
                        f(a10);
                    } else if (a10 <= 159) {
                        b(a10);
                    } else if (a10 <= 255) {
                        g(a10);
                    } else {
                        L.p(a10, "Invalid base command: ", "Cea708Decoder");
                    }
                    z8 = true;
                }
            } else {
                int a11 = this.f12102h.a(8);
                if (a11 <= 31) {
                    c(a11);
                } else {
                    if (a11 <= 127) {
                        h(a11);
                    } else if (a11 <= 159) {
                        d(a11);
                    } else if (a11 <= 255) {
                        i(a11);
                    } else {
                        L.p(a11, "Invalid extended command: ", "Cea708Decoder");
                    }
                    z8 = true;
                }
            }
        }
        if (z8) {
            this.f12106n = l();
        }
    }

    private void r() {
        for (int i9 = 0; i9 < 8; i9++) {
            this.l[i9].h();
        }
    }

    @Override // com.applovin.impl.AbstractC0780y2
    public void a(ol olVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0669a1.a(olVar.f9273c);
        this.f12101g.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f12101g.a() >= 3) {
            int w2 = this.f12101g.w();
            int i9 = w2 & 3;
            boolean z8 = (w2 & 4) == 4;
            byte w9 = (byte) this.f12101g.w();
            byte w10 = (byte) this.f12101g.w();
            if (i9 == 2 || i9 == 3) {
                if (z8) {
                    if (i9 == 3) {
                        k();
                        int i10 = (w9 & 192) >> 6;
                        int i11 = this.f12103i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            r();
                            kc.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12103i + " current=" + i10);
                        }
                        this.f12103i = i10;
                        int i12 = w9 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        c cVar = new c(i10, i12);
                        this.f12108p = cVar;
                        byte[] bArr = cVar.f12143c;
                        int i13 = cVar.f12144d;
                        cVar.f12144d = i13 + 1;
                        bArr[i13] = w10;
                    } else {
                        AbstractC0669a1.a(i9 == 2);
                        c cVar2 = this.f12108p;
                        if (cVar2 == null) {
                            kc.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f12143c;
                            int i14 = cVar2.f12144d;
                            bArr2[i14] = w9;
                            cVar2.f12144d = i14 + 2;
                            bArr2[i14 + 1] = w10;
                        }
                    }
                    c cVar3 = this.f12108p;
                    if (cVar3.f12144d == (cVar3.b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.f12106n = null;
        this.f12107o = null;
        this.f12109q = 0;
        this.m = this.l[0];
        r();
        this.f12108p = null;
    }

    @Override // com.applovin.impl.AbstractC0780y2
    public kl e() {
        List list = this.f12106n;
        this.f12107o = list;
        return new C0784z2((List) AbstractC0669a1.a(list));
    }

    @Override // com.applovin.impl.AbstractC0780y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    @Override // com.applovin.impl.AbstractC0780y2
    /* renamed from: g */
    public /* bridge */ /* synthetic */ pl c() {
        return super.c();
    }

    @Override // com.applovin.impl.AbstractC0780y2
    public boolean j() {
        if (this.f12106n != this.f12107o) {
            return true;
        }
        return false;
    }

    private void f(int i9) {
        if (i9 == 127) {
            this.m.a((char) 9835);
        } else {
            this.m.a((char) (i9 & 255));
        }
    }

    private void g(int i9) {
        this.m.a((char) (i9 & 255));
    }

    private void e(int i9) {
        b bVar = this.l[i9];
        this.f12102h.d(2);
        boolean f9 = this.f12102h.f();
        boolean f10 = this.f12102h.f();
        boolean f11 = this.f12102h.f();
        int a6 = this.f12102h.a(3);
        boolean f12 = this.f12102h.f();
        int a9 = this.f12102h.a(7);
        int a10 = this.f12102h.a(8);
        int a11 = this.f12102h.a(4);
        int a12 = this.f12102h.a(4);
        this.f12102h.d(2);
        int a13 = this.f12102h.a(6);
        this.f12102h.d(2);
        bVar.a(f9, f10, f11, a6, f12, a9, a10, a12, a13, a11, this.f12102h.a(3), this.f12102h.a(3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void b(int i9) {
        int i10 = 1;
        switch (i9) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i11 = i9 - 128;
                if (this.f12109q != i11) {
                    this.f12109q = i11;
                    this.m = this.l[i11];
                    return;
                }
                return;
            case 136:
                while (i10 <= 8) {
                    if (this.f12102h.f()) {
                        this.l[8 - i10].d();
                    }
                    i10++;
                }
                return;
            case 137:
                for (int i12 = 1; i12 <= 8; i12++) {
                    if (this.f12102h.f()) {
                        this.l[8 - i12].a(true);
                    }
                }
                return;
            case 138:
                while (i10 <= 8) {
                    if (this.f12102h.f()) {
                        this.l[8 - i10].a(false);
                    }
                    i10++;
                }
                return;
            case 139:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f12102h.f()) {
                        this.l[8 - i13].a(!r0.g());
                    }
                }
                return;
            case 140:
                while (i10 <= 8) {
                    if (this.f12102h.f()) {
                        this.l[8 - i10].h();
                    }
                    i10++;
                }
                return;
            case 141:
                this.f12102h.d(8);
                return;
            case 142:
                return;
            case 143:
                r();
                return;
            case 144:
                if (!this.m.e()) {
                    this.f12102h.d(16);
                    return;
                } else {
                    m();
                    return;
                }
            case 145:
                if (!this.m.e()) {
                    this.f12102h.d(24);
                    return;
                } else {
                    n();
                    return;
                }
            case 146:
                if (!this.m.e()) {
                    this.f12102h.d(16);
                    return;
                } else {
                    o();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                L.p(i9, "Invalid C1 command: ", "Cea708Decoder");
                return;
            case 151:
                if (!this.m.e()) {
                    this.f12102h.d(32);
                    return;
                } else {
                    p();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i14 = i9 - 152;
                e(i14);
                if (this.f12109q != i14) {
                    this.f12109q = i14;
                    this.m = this.l[i14];
                    return;
                }
                return;
        }
    }

    /* renamed from: com.applovin.impl.x2$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        private static final int[] f12112A;

        /* renamed from: B */
        private static final int[] f12113B;

        /* renamed from: C */
        private static final boolean[] f12114C;

        /* renamed from: D */
        private static final int[] f12115D;

        /* renamed from: E */
        private static final int[] f12116E;

        /* renamed from: F */
        private static final int[] f12117F;

        /* renamed from: G */
        private static final int[] f12118G;

        /* renamed from: w */
        public static final int f12119w = a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f12120x;

        /* renamed from: y */
        public static final int f12121y;

        /* renamed from: z */
        private static final int[] f12122z;

        /* renamed from: a */
        private final List f12123a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f12124c;

        /* renamed from: d */
        private boolean f12125d;

        /* renamed from: e */
        private int f12126e;

        /* renamed from: f */
        private boolean f12127f;

        /* renamed from: g */
        private int f12128g;

        /* renamed from: h */
        private int f12129h;

        /* renamed from: i */
        private int f12130i;

        /* renamed from: j */
        private int f12131j;

        /* renamed from: k */
        private boolean f12132k;
        private int l;
        private int m;

        /* renamed from: n */
        private int f12133n;

        /* renamed from: o */
        private int f12134o;

        /* renamed from: p */
        private int f12135p;

        /* renamed from: q */
        private int f12136q;

        /* renamed from: r */
        private int f12137r;

        /* renamed from: s */
        private int f12138s;

        /* renamed from: t */
        private int f12139t;

        /* renamed from: u */
        private int f12140u;

        /* renamed from: v */
        private int f12141v;

        static {
            int a6 = a(0, 0, 0, 0);
            f12120x = a6;
            int a9 = a(0, 0, 0, 3);
            f12121y = a9;
            f12122z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f12112A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f12113B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f12114C = new boolean[]{false, false, false, true, true, true, false};
            f12115D = new int[]{a6, a9, a6, a6, a9, a6, a6};
            f12116E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f12117F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f12118G = new int[]{a6, a6, a6, a6, a6, a9, a9};
        }

        public b() {
            h();
        }

        public void a(char c9) {
            if (c9 == '\n') {
                this.f12123a.add(c());
                this.b.clear();
                if (this.f12135p != -1) {
                    this.f12135p = 0;
                }
                if (this.f12136q != -1) {
                    this.f12136q = 0;
                }
                if (this.f12137r != -1) {
                    this.f12137r = 0;
                }
                if (this.f12139t != -1) {
                    this.f12139t = 0;
                }
                while (true) {
                    if ((!this.f12132k || this.f12123a.size() < this.f12131j) && this.f12123a.size() < 15) {
                        return;
                    } else {
                        this.f12123a.remove(0);
                    }
                }
            } else {
                this.b.append(c9);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.applovin.impl.C0776x2.a b() {
            /*
                Method dump skipped, instructions count: 185
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0776x2.b.b():com.applovin.impl.x2$a");
        }

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f12135p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f12135p, length, 33);
                }
                if (this.f12136q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12136q, length, 33);
                }
                if (this.f12137r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12138s), this.f12137r, length, 33);
                }
                if (this.f12139t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12140u), this.f12139t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void d() {
            this.f12123a.clear();
            this.b.clear();
            this.f12135p = -1;
            this.f12136q = -1;
            this.f12137r = -1;
            this.f12139t = -1;
            this.f12141v = 0;
        }

        public boolean e() {
            return this.f12124c;
        }

        public boolean f() {
            if (e() && (!this.f12123a.isEmpty() || this.b.length() != 0)) {
                return false;
            }
            return true;
        }

        public boolean g() {
            return this.f12125d;
        }

        public void h() {
            d();
            this.f12124c = false;
            this.f12125d = false;
            this.f12126e = 4;
            this.f12127f = false;
            this.f12128g = 0;
            this.f12129h = 0;
            this.f12130i = 0;
            this.f12131j = 15;
            this.f12132k = true;
            this.l = 0;
            this.m = 0;
            this.f12133n = 0;
            int i9 = f12120x;
            this.f12134o = i9;
            this.f12138s = f12119w;
            this.f12140u = i9;
        }

        public void a() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        public void a(boolean z8, boolean z9, boolean z10, int i9, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f12124c = true;
            this.f12125d = z8;
            this.f12132k = z9;
            this.f12126e = i9;
            this.f12127f = z11;
            this.f12128g = i10;
            this.f12129h = i11;
            this.f12130i = i14;
            int i17 = i12 + 1;
            if (this.f12131j != i17) {
                this.f12131j = i17;
                while (true) {
                    if ((!z9 || this.f12123a.size() < this.f12131j) && this.f12123a.size() < 15) {
                        break;
                    } else {
                        this.f12123a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.m != i15) {
                this.m = i15;
                int i18 = i15 - 1;
                a(f12115D[i18], f12121y, f12114C[i18], 0, f12112A[i18], f12113B[i18], f12122z[i18]);
            }
            if (i16 == 0 || this.f12133n == i16) {
                return;
            }
            this.f12133n = i16;
            int i19 = i16 - 1;
            a(0, 1, 1, false, false, f12117F[i19], f12116E[i19]);
            b(f12119w, f12118G[i19], f12120x);
        }

        public void b(int i9, int i10, int i11) {
            if (this.f12137r != -1 && this.f12138s != i9) {
                this.b.setSpan(new ForegroundColorSpan(this.f12138s), this.f12137r, this.b.length(), 33);
            }
            if (i9 != f12119w) {
                this.f12137r = this.b.length();
                this.f12138s = i9;
            }
            if (this.f12139t != -1 && this.f12140u != i10) {
                this.b.setSpan(new BackgroundColorSpan(this.f12140u), this.f12139t, this.b.length(), 33);
            }
            if (i10 != f12120x) {
                this.f12139t = this.b.length();
                this.f12140u = i10;
            }
        }

        public static int a(int i9, int i10, int i11) {
            return a(i9, i10, i11, 0);
        }

        public static int a(int i9, int i10, int i11, int i12) {
            AbstractC0669a1.a(i9, 0, 4);
            AbstractC0669a1.a(i10, 0, 4);
            AbstractC0669a1.a(i11, 0, 4);
            AbstractC0669a1.a(i12, 0, 4);
            return Color.argb(i12 != 2 ? i12 != 3 ? 255 : 0 : 127, i9 > 1 ? 255 : 0, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0);
        }

        public void a(int i9, int i10, int i11, boolean z8, boolean z9, int i12, int i13) {
            if (this.f12135p != -1) {
                if (!z8) {
                    this.b.setSpan(new StyleSpan(2), this.f12135p, this.b.length(), 33);
                    this.f12135p = -1;
                }
            } else if (z8) {
                this.f12135p = this.b.length();
            }
            if (this.f12136q == -1) {
                if (z9) {
                    this.f12136q = this.b.length();
                }
            } else {
                if (z9) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.f12136q, this.b.length(), 33);
                this.f12136q = -1;
            }
        }

        public void a(int i9, int i10) {
            if (this.f12141v != i9) {
                a('\n');
            }
            this.f12141v = i9;
        }

        public void a(boolean z8) {
            this.f12125d = z8;
        }

        public void a(int i9, int i10, boolean z8, int i11, int i12, int i13, int i14) {
            this.f12134o = i9;
            this.l = i14;
        }
    }

    private void a(int i9) {
        if (i9 != 0) {
            if (i9 == 3) {
                this.f12106n = l();
                return;
            }
            if (i9 != 8) {
                switch (i9) {
                    case 12:
                        r();
                        return;
                    case 13:
                        this.m.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i9 >= 17 && i9 <= 23) {
                            L.p(i9, "Currently unsupported COMMAND_EXT1 Command: ", "Cea708Decoder");
                            this.f12102h.d(8);
                            return;
                        } else if (i9 >= 24 && i9 <= 31) {
                            L.p(i9, "Currently unsupported COMMAND_P16 Command: ", "Cea708Decoder");
                            this.f12102h.d(16);
                            return;
                        } else {
                            L.p(i9, "Invalid C0 command: ", "Cea708Decoder");
                            return;
                        }
                }
            }
            this.m.a();
        }
    }

    @Override // com.applovin.impl.AbstractC0780y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.k5
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j7) {
        super.a(j7);
    }
}
