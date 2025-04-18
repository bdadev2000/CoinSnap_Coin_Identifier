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
import kotlin.text.Typography;

/* loaded from: classes.dex */
public final class x2 extends y2 {

    /* renamed from: g, reason: collision with root package name */
    private final yg f8906g = new yg();

    /* renamed from: h, reason: collision with root package name */
    private final xg f8907h = new xg();

    /* renamed from: i, reason: collision with root package name */
    private int f8908i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8909j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8910k;

    /* renamed from: l, reason: collision with root package name */
    private final b[] f8911l;

    /* renamed from: m, reason: collision with root package name */
    private b f8912m;

    /* renamed from: n, reason: collision with root package name */
    private List f8913n;

    /* renamed from: o, reason: collision with root package name */
    private List f8914o;

    /* renamed from: p, reason: collision with root package name */
    private c f8915p;

    /* renamed from: q, reason: collision with root package name */
    private int f8916q;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator f8917c = new et(3);
        public final z4 a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8918b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            z4.b d10 = new z4.b().a(charSequence).b(alignment).a(f10, i10).a(i11).b(f11).b(i12).d(f12);
            if (z10) {
                d10.d(i13);
            }
            this.a = d10.a();
            this.f8918b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f8918b, aVar.f8918b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8943b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f8944c;

        /* renamed from: d, reason: collision with root package name */
        int f8945d = 0;

        public c(int i10, int i11) {
            this.a = i10;
            this.f8943b = i11;
            this.f8944c = new byte[(i11 * 2) - 1];
        }
    }

    public x2(int i10, List list) {
        this.f8910k = i10 == -1 ? 1 : i10;
        this.f8909j = list != null && m3.a(list);
        this.f8911l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f8911l[i11] = new b();
        }
        this.f8912m = this.f8911l[0];
    }

    private void a(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f8913n = l();
                return;
            }
            if (i10 != 8) {
                switch (i10) {
                    case 12:
                        r();
                        return;
                    case 13:
                        this.f8912m.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            a4.j.u("Currently unsupported COMMAND_EXT1 Command: ", i10, "Cea708Decoder");
                            this.f8907h.d(8);
                            return;
                        } else if (i10 >= 24 && i10 <= 31) {
                            a4.j.u("Currently unsupported COMMAND_P16 Command: ", i10, "Cea708Decoder");
                            this.f8907h.d(16);
                            return;
                        } else {
                            a4.j.u("Invalid C0 command: ", i10, "Cea708Decoder");
                            return;
                        }
                }
            }
            this.f8912m.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void b(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f8916q != i12) {
                    this.f8916q = i12;
                    this.f8912m = this.f8911l[i12];
                    return;
                }
                return;
            case 136:
                while (i11 <= 8) {
                    if (this.f8907h.f()) {
                        this.f8911l[8 - i11].d();
                    }
                    i11++;
                }
                return;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f8907h.f()) {
                        this.f8911l[8 - i13].a(true);
                    }
                }
                return;
            case 138:
                while (i11 <= 8) {
                    if (this.f8907h.f()) {
                        this.f8911l[8 - i11].a(false);
                    }
                    i11++;
                }
                return;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f8907h.f()) {
                        this.f8911l[8 - i14].a(!r0.g());
                    }
                }
                return;
            case 140:
                while (i11 <= 8) {
                    if (this.f8907h.f()) {
                        this.f8911l[8 - i11].h();
                    }
                    i11++;
                }
                return;
            case 141:
                this.f8907h.d(8);
                return;
            case 142:
                return;
            case 143:
                r();
                return;
            case 144:
                if (!this.f8912m.e()) {
                    this.f8907h.d(16);
                    return;
                } else {
                    m();
                    return;
                }
            case 145:
                if (!this.f8912m.e()) {
                    this.f8907h.d(24);
                    return;
                } else {
                    n();
                    return;
                }
            case 146:
                if (!this.f8912m.e()) {
                    this.f8907h.d(16);
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
                a4.j.u("Invalid C1 command: ", i10, "Cea708Decoder");
                return;
            case 151:
                if (!this.f8912m.e()) {
                    this.f8907h.d(32);
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
                int i15 = i10 - 152;
                e(i15);
                if (this.f8916q != i15) {
                    this.f8916q = i15;
                    this.f8912m = this.f8911l[i15];
                    return;
                }
                return;
        }
    }

    private void c(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f8907h.d(8);
            } else if (i10 <= 23) {
                this.f8907h.d(16);
            } else if (i10 <= 31) {
                this.f8907h.d(24);
            }
        }
    }

    private void d(int i10) {
        if (i10 <= 135) {
            this.f8907h.d(32);
            return;
        }
        if (i10 <= 143) {
            this.f8907h.d(40);
        } else if (i10 <= 159) {
            this.f8907h.d(2);
            this.f8907h.d(this.f8907h.a(6) * 8);
        }
    }

    private void h(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 37) {
                    if (i10 != 42) {
                        if (i10 != 44) {
                            if (i10 != 63) {
                                if (i10 != 57) {
                                    if (i10 != 58) {
                                        if (i10 != 60) {
                                            if (i10 != 61) {
                                                switch (i10) {
                                                    case 48:
                                                        this.f8912m.a((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.f8912m.a(Typography.leftSingleQuote);
                                                        return;
                                                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                                        this.f8912m.a(Typography.rightSingleQuote);
                                                        return;
                                                    case 51:
                                                        this.f8912m.a(Typography.leftDoubleQuote);
                                                        return;
                                                    case 52:
                                                        this.f8912m.a(Typography.rightDoubleQuote);
                                                        return;
                                                    case 53:
                                                        this.f8912m.a(Typography.bullet);
                                                        return;
                                                    default:
                                                        switch (i10) {
                                                            case 118:
                                                                this.f8912m.a((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.f8912m.a((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.f8912m.a((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.f8912m.a((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.f8912m.a((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.f8912m.a((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.f8912m.a((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.f8912m.a((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.f8912m.a((char) 9496);
                                                                return;
                                                            case 127:
                                                                this.f8912m.a((char) 9484);
                                                                return;
                                                            default:
                                                                a4.j.u("Invalid G2 character: ", i10, "Cea708Decoder");
                                                                return;
                                                        }
                                                }
                                            }
                                            this.f8912m.a((char) 8480);
                                            return;
                                        }
                                        this.f8912m.a((char) 339);
                                        return;
                                    }
                                    this.f8912m.a((char) 353);
                                    return;
                                }
                                this.f8912m.a(Typography.tm);
                                return;
                            }
                            this.f8912m.a((char) 376);
                            return;
                        }
                        this.f8912m.a((char) 338);
                        return;
                    }
                    this.f8912m.a((char) 352);
                    return;
                }
                this.f8912m.a(Typography.ellipsis);
                return;
            }
            this.f8912m.a(Typography.nbsp);
            return;
        }
        this.f8912m.a(' ');
    }

    private void i(int i10) {
        if (i10 == 160) {
            this.f8912m.a((char) 13252);
        } else {
            a4.j.u("Invalid G3 character: ", i10, "Cea708Decoder");
            this.f8912m.a('_');
        }
    }

    private void k() {
        if (this.f8915p == null) {
            return;
        }
        q();
        this.f8915p = null;
    }

    private List l() {
        a b3;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f8911l[i10].f() && this.f8911l[i10].g() && (b3 = this.f8911l[i10].b()) != null) {
                arrayList.add(b3);
            }
        }
        Collections.sort(arrayList, a.f8917c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void m() {
        this.f8912m.a(this.f8907h.a(4), this.f8907h.a(2), this.f8907h.a(2), this.f8907h.f(), this.f8907h.f(), this.f8907h.a(3), this.f8907h.a(3));
    }

    private void n() {
        int a10 = b.a(this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2));
        int a11 = b.a(this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2));
        this.f8907h.d(2);
        this.f8912m.b(a10, a11, b.a(this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2)));
    }

    private void o() {
        this.f8907h.d(4);
        int a10 = this.f8907h.a(4);
        this.f8907h.d(2);
        this.f8912m.a(a10, this.f8907h.a(6));
    }

    private void p() {
        int a10 = b.a(this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2));
        int a11 = this.f8907h.a(2);
        int a12 = b.a(this.f8907h.a(2), this.f8907h.a(2), this.f8907h.a(2));
        if (this.f8907h.f()) {
            a11 |= 4;
        }
        boolean f10 = this.f8907h.f();
        int a13 = this.f8907h.a(2);
        int a14 = this.f8907h.a(2);
        int a15 = this.f8907h.a(2);
        this.f8907h.d(8);
        this.f8912m.a(a10, a12, f10, a11, a13, a14, a15);
    }

    private void q() {
        c cVar = this.f8915p;
        if (cVar.f8945d != (cVar.f8943b * 2) - 1) {
            kc.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f8915p.f8943b * 2) - 1) + ", but current index is " + this.f8915p.f8945d + " (sequence number " + this.f8915p.a + ");");
        }
        xg xgVar = this.f8907h;
        c cVar2 = this.f8915p;
        xgVar.a(cVar2.f8944c, cVar2.f8945d);
        int a10 = this.f8907h.a(3);
        int a11 = this.f8907h.a(5);
        if (a10 == 7) {
            this.f8907h.d(2);
            a10 = this.f8907h.a(6);
            if (a10 < 7) {
                a4.j.u("Invalid extended service number: ", a10, "Cea708Decoder");
            }
        }
        if (a11 == 0) {
            if (a10 != 0) {
                kc.d("Cea708Decoder", "serviceNumber is non-zero (" + a10 + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (a10 != this.f8910k) {
            return;
        }
        boolean z10 = false;
        while (this.f8907h.b() > 0) {
            int a12 = this.f8907h.a(8);
            if (a12 != 16) {
                if (a12 <= 31) {
                    a(a12);
                } else {
                    if (a12 <= 127) {
                        f(a12);
                    } else if (a12 <= 159) {
                        b(a12);
                    } else if (a12 <= 255) {
                        g(a12);
                    } else {
                        a4.j.u("Invalid base command: ", a12, "Cea708Decoder");
                    }
                    z10 = true;
                }
            } else {
                int a13 = this.f8907h.a(8);
                if (a13 <= 31) {
                    c(a13);
                } else {
                    if (a13 <= 127) {
                        h(a13);
                    } else if (a13 <= 159) {
                        d(a13);
                    } else if (a13 <= 255) {
                        i(a13);
                    } else {
                        a4.j.u("Invalid extended command: ", a13, "Cea708Decoder");
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f8913n = l();
        }
    }

    private void r() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f8911l[i10].h();
        }
    }

    @Override // com.applovin.impl.y2
    public kl e() {
        List list = this.f8913n;
        this.f8914o = list;
        return new z2((List) a1.a(list));
    }

    @Override // com.applovin.impl.y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    @Override // com.applovin.impl.y2
    /* renamed from: g */
    public /* bridge */ /* synthetic */ pl c() {
        return super.c();
    }

    @Override // com.applovin.impl.y2
    public boolean j() {
        return this.f8913n != this.f8914o;
    }

    private void f(int i10) {
        if (i10 == 127) {
            this.f8912m.a((char) 9835);
        } else {
            this.f8912m.a((char) (i10 & 255));
        }
    }

    private void g(int i10) {
        this.f8912m.a((char) (i10 & 255));
    }

    private void e(int i10) {
        b bVar = this.f8911l[i10];
        this.f8907h.d(2);
        boolean f10 = this.f8907h.f();
        boolean f11 = this.f8907h.f();
        boolean f12 = this.f8907h.f();
        int a10 = this.f8907h.a(3);
        boolean f13 = this.f8907h.f();
        int a11 = this.f8907h.a(7);
        int a12 = this.f8907h.a(8);
        int a13 = this.f8907h.a(4);
        int a14 = this.f8907h.a(4);
        this.f8907h.d(2);
        int a15 = this.f8907h.a(6);
        this.f8907h.d(2);
        bVar.a(f10, f11, f12, a10, f13, a11, a12, a14, a15, a13, this.f8907h.a(3), this.f8907h.a(3));
    }

    /* loaded from: classes.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w, reason: collision with root package name */
        public static final int f8919w = a(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f8920x;

        /* renamed from: y, reason: collision with root package name */
        public static final int f8921y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f8922z;
        private final List a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f8923b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f8924c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8925d;

        /* renamed from: e, reason: collision with root package name */
        private int f8926e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8927f;

        /* renamed from: g, reason: collision with root package name */
        private int f8928g;

        /* renamed from: h, reason: collision with root package name */
        private int f8929h;

        /* renamed from: i, reason: collision with root package name */
        private int f8930i;

        /* renamed from: j, reason: collision with root package name */
        private int f8931j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f8932k;

        /* renamed from: l, reason: collision with root package name */
        private int f8933l;

        /* renamed from: m, reason: collision with root package name */
        private int f8934m;

        /* renamed from: n, reason: collision with root package name */
        private int f8935n;

        /* renamed from: o, reason: collision with root package name */
        private int f8936o;

        /* renamed from: p, reason: collision with root package name */
        private int f8937p;

        /* renamed from: q, reason: collision with root package name */
        private int f8938q;

        /* renamed from: r, reason: collision with root package name */
        private int f8939r;

        /* renamed from: s, reason: collision with root package name */
        private int f8940s;

        /* renamed from: t, reason: collision with root package name */
        private int f8941t;
        private int u;

        /* renamed from: v, reason: collision with root package name */
        private int f8942v;

        static {
            int a = a(0, 0, 0, 0);
            f8920x = a;
            int a10 = a(0, 0, 0, 3);
            f8921y = a10;
            f8922z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{a, a10, a, a, a10, a, a};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{a, a, a, a, a, a10, a10};
        }

        public b() {
            h();
        }

        public void a(char c10) {
            if (c10 == '\n') {
                this.a.add(c());
                this.f8923b.clear();
                if (this.f8937p != -1) {
                    this.f8937p = 0;
                }
                if (this.f8938q != -1) {
                    this.f8938q = 0;
                }
                if (this.f8939r != -1) {
                    this.f8939r = 0;
                }
                if (this.f8941t != -1) {
                    this.f8941t = 0;
                }
                while (true) {
                    if ((!this.f8932k || this.a.size() < this.f8931j) && this.a.size() < 15) {
                        return;
                    } else {
                        this.a.remove(0);
                    }
                }
            } else {
                this.f8923b.append(c10);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.applovin.impl.x2.a b() {
            /*
                Method dump skipped, instructions count: 184
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.x2.b.b():com.applovin.impl.x2$a");
        }

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8923b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f8937p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f8937p, length, 33);
                }
                if (this.f8938q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8938q, length, 33);
                }
                if (this.f8939r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8940s), this.f8939r, length, 33);
                }
                if (this.f8941t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.f8941t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void d() {
            this.a.clear();
            this.f8923b.clear();
            this.f8937p = -1;
            this.f8938q = -1;
            this.f8939r = -1;
            this.f8941t = -1;
            this.f8942v = 0;
        }

        public boolean e() {
            return this.f8924c;
        }

        public boolean f() {
            return !e() || (this.a.isEmpty() && this.f8923b.length() == 0);
        }

        public boolean g() {
            return this.f8925d;
        }

        public void h() {
            d();
            this.f8924c = false;
            this.f8925d = false;
            this.f8926e = 4;
            this.f8927f = false;
            this.f8928g = 0;
            this.f8929h = 0;
            this.f8930i = 0;
            this.f8931j = 15;
            this.f8932k = true;
            this.f8933l = 0;
            this.f8934m = 0;
            this.f8935n = 0;
            int i10 = f8920x;
            this.f8936o = i10;
            this.f8940s = f8919w;
            this.u = i10;
        }

        public void a() {
            int length = this.f8923b.length();
            if (length > 0) {
                this.f8923b.delete(length - 1, length);
            }
        }

        public void a(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f8924c = true;
            this.f8925d = z10;
            this.f8932k = z11;
            this.f8926e = i10;
            this.f8927f = z13;
            this.f8928g = i11;
            this.f8929h = i12;
            this.f8930i = i15;
            int i18 = i13 + 1;
            if (this.f8931j != i18) {
                this.f8931j = i18;
                while (true) {
                    if ((!z11 || this.a.size() < this.f8931j) && this.a.size() < 15) {
                        break;
                    } else {
                        this.a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f8934m != i16) {
                this.f8934m = i16;
                int i19 = i16 - 1;
                a(D[i19], f8921y, C[i19], 0, A[i19], B[i19], f8922z[i19]);
            }
            if (i17 == 0 || this.f8935n == i17) {
                return;
            }
            this.f8935n = i17;
            int i20 = i17 - 1;
            a(0, 1, 1, false, false, F[i20], E[i20]);
            b(f8919w, G[i20], f8920x);
        }

        public void b(int i10, int i11, int i12) {
            if (this.f8939r != -1 && this.f8940s != i10) {
                this.f8923b.setSpan(new ForegroundColorSpan(this.f8940s), this.f8939r, this.f8923b.length(), 33);
            }
            if (i10 != f8919w) {
                this.f8939r = this.f8923b.length();
                this.f8940s = i10;
            }
            if (this.f8941t != -1 && this.u != i11) {
                this.f8923b.setSpan(new BackgroundColorSpan(this.u), this.f8941t, this.f8923b.length(), 33);
            }
            if (i11 != f8920x) {
                this.f8941t = this.f8923b.length();
                this.u = i11;
            }
        }

        public static int a(int i10, int i11, int i12) {
            return a(i10, i11, i12, 0);
        }

        public static int a(int i10, int i11, int i12, int i13) {
            a1.a(i10, 0, 4);
            a1.a(i11, 0, 4);
            a1.a(i12, 0, 4);
            a1.a(i13, 0, 4);
            return Color.argb(i13 != 2 ? i13 != 3 ? 255 : 0 : 127, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f8937p != -1) {
                if (!z10) {
                    this.f8923b.setSpan(new StyleSpan(2), this.f8937p, this.f8923b.length(), 33);
                    this.f8937p = -1;
                }
            } else if (z10) {
                this.f8937p = this.f8923b.length();
            }
            if (this.f8938q == -1) {
                if (z11) {
                    this.f8938q = this.f8923b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f8923b.setSpan(new UnderlineSpan(), this.f8938q, this.f8923b.length(), 33);
                this.f8938q = -1;
            }
        }

        public void a(int i10, int i11) {
            if (this.f8942v != i10) {
                a('\n');
            }
            this.f8942v = i10;
        }

        public void a(boolean z10) {
            this.f8925d = z10;
        }

        public void a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f8936o = i10;
            this.f8933l = i15;
        }
    }

    @Override // com.applovin.impl.y2
    public void a(ol olVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a1.a(olVar.f6351c);
        this.f8906g.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f8906g.a() >= 3) {
            int w10 = this.f8906g.w();
            int i10 = w10 & 3;
            boolean z10 = (w10 & 4) == 4;
            byte w11 = (byte) this.f8906g.w();
            byte w12 = (byte) this.f8906g.w();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        k();
                        int i11 = (w11 & 192) >> 6;
                        int i12 = this.f8908i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            r();
                            kc.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f8908i + " current=" + i11);
                        }
                        this.f8908i = i11;
                        int i13 = w11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f8915p = cVar;
                        byte[] bArr = cVar.f8944c;
                        int i14 = cVar.f8945d;
                        cVar.f8945d = i14 + 1;
                        bArr[i14] = w12;
                    } else {
                        a1.a(i10 == 2);
                        c cVar2 = this.f8915p;
                        if (cVar2 == null) {
                            kc.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f8944c;
                            int i15 = cVar2.f8945d;
                            bArr2[i15] = w11;
                            cVar2.f8945d = i15 + 2;
                            bArr2[i15 + 1] = w12;
                        }
                    }
                    c cVar3 = this.f8915p;
                    if (cVar3.f8945d == (cVar3.f8943b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.f8913n = null;
        this.f8914o = null;
        this.f8916q = 0;
        this.f8912m = this.f8911l[0];
        r();
        this.f8915p = null;
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.applovin.impl.y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j3) {
        super.a(j3);
    }
}
