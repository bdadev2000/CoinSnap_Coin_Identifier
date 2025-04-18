package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.b5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class z2 extends a3 {

    /* renamed from: g */
    private final bh f28258g = new bh();

    /* renamed from: h */
    private final ah f28259h = new ah();

    /* renamed from: i */
    private int f28260i = -1;

    /* renamed from: j */
    private final boolean f28261j;

    /* renamed from: k */
    private final int f28262k;

    /* renamed from: l */
    private final b[] f28263l;

    /* renamed from: m */
    private b f28264m;

    /* renamed from: n */
    private List f28265n;

    /* renamed from: o */
    private List f28266o;

    /* renamed from: p */
    private c f28267p;

    /* renamed from: q */
    private int f28268q;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: c */
        private static final Comparator f28269c = new ns(4);

        /* renamed from: a */
        public final b5 f28270a;

        /* renamed from: b */
        public final int f28271b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z2, int i5, int i6) {
            b5.b d = new b5.b().a(charSequence).b(alignment).a(f2, i2).a(i3).b(f3).b(i4).d(f4);
            if (z2) {
                d.d(i5);
            }
            this.f28270a = d.a();
            this.f28271b = i6;
        }

        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f28271b, aVar.f28271b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;
        public static final int w = a(2, 2, 2, 0);
        public static final int x;

        /* renamed from: y */
        public static final int f28272y;

        /* renamed from: z */
        private static final int[] f28273z;

        /* renamed from: a */
        private final List f28274a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f28275b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f28276c;
        private boolean d;
        private int e;

        /* renamed from: f */
        private boolean f28277f;

        /* renamed from: g */
        private int f28278g;

        /* renamed from: h */
        private int f28279h;

        /* renamed from: i */
        private int f28280i;

        /* renamed from: j */
        private int f28281j;

        /* renamed from: k */
        private boolean f28282k;

        /* renamed from: l */
        private int f28283l;

        /* renamed from: m */
        private int f28284m;

        /* renamed from: n */
        private int f28285n;

        /* renamed from: o */
        private int f28286o;

        /* renamed from: p */
        private int f28287p;

        /* renamed from: q */
        private int f28288q;

        /* renamed from: r */
        private int f28289r;

        /* renamed from: s */
        private int f28290s;

        /* renamed from: t */
        private int f28291t;

        /* renamed from: u */
        private int f28292u;

        /* renamed from: v */
        private int f28293v;

        static {
            int a2 = a(0, 0, 0, 0);
            x = a2;
            int a3 = a(0, 0, 0, 3);
            f28272y = a3;
            f28273z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{a2, a3, a2, a2, a3, a2, a2};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{a2, a2, a2, a2, a2, a3, a3};
        }

        public b() {
            h();
        }

        public void a(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.f28286o = i2;
            this.f28283l = i7;
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
        public com.applovin.impl.z2.a b() {
            /*
                Method dump skipped, instructions count: 185
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.z2.b.b():com.applovin.impl.z2$a");
        }

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28275b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f28287p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f28287p, length, 33);
                }
                if (this.f28288q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f28288q, length, 33);
                }
                if (this.f28289r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f28290s), this.f28289r, length, 33);
                }
                if (this.f28291t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f28292u), this.f28291t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void d() {
            this.f28274a.clear();
            this.f28275b.clear();
            this.f28287p = -1;
            this.f28288q = -1;
            this.f28289r = -1;
            this.f28291t = -1;
            this.f28293v = 0;
        }

        public boolean e() {
            return this.f28276c;
        }

        public boolean f() {
            return !e() || (this.f28274a.isEmpty() && this.f28275b.length() == 0);
        }

        public boolean g() {
            return this.d;
        }

        public void h() {
            d();
            this.f28276c = false;
            this.d = false;
            this.e = 4;
            this.f28277f = false;
            this.f28278g = 0;
            this.f28279h = 0;
            this.f28280i = 0;
            this.f28281j = 15;
            this.f28282k = true;
            this.f28283l = 0;
            this.f28284m = 0;
            this.f28285n = 0;
            int i2 = x;
            this.f28286o = i2;
            this.f28290s = w;
            this.f28292u = i2;
        }

        public void a(boolean z2) {
            this.d = z2;
        }

        public void a(char c2) {
            if (c2 == '\n') {
                this.f28274a.add(c());
                this.f28275b.clear();
                if (this.f28287p != -1) {
                    this.f28287p = 0;
                }
                if (this.f28288q != -1) {
                    this.f28288q = 0;
                }
                if (this.f28289r != -1) {
                    this.f28289r = 0;
                }
                if (this.f28291t != -1) {
                    this.f28291t = 0;
                }
                while (true) {
                    if ((!this.f28282k || this.f28274a.size() < this.f28281j) && this.f28274a.size() < 15) {
                        return;
                    } else {
                        this.f28274a.remove(0);
                    }
                }
            } else {
                this.f28275b.append(c2);
            }
        }

        public void a() {
            int length = this.f28275b.length();
            if (length > 0) {
                this.f28275b.delete(length - 1, length);
            }
        }

        public void a(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f28276c = true;
            this.d = z2;
            this.f28282k = z3;
            this.e = i2;
            this.f28277f = z5;
            this.f28278g = i3;
            this.f28279h = i4;
            this.f28280i = i7;
            int i10 = i5 + 1;
            if (this.f28281j != i10) {
                this.f28281j = i10;
                while (true) {
                    if ((!z3 || this.f28274a.size() < this.f28281j) && this.f28274a.size() < 15) {
                        break;
                    } else {
                        this.f28274a.remove(0);
                    }
                }
            }
            if (i8 != 0 && this.f28284m != i8) {
                this.f28284m = i8;
                int i11 = i8 - 1;
                a(D[i11], f28272y, C[i11], 0, A[i11], B[i11], f28273z[i11]);
            }
            if (i9 == 0 || this.f28285n == i9) {
                return;
            }
            this.f28285n = i9;
            int i12 = i9 - 1;
            a(0, 1, 1, false, false, F[i12], E[i12]);
            b(w, G[i12], x);
        }

        public void b(int i2, int i3, int i4) {
            if (this.f28289r != -1 && this.f28290s != i2) {
                this.f28275b.setSpan(new ForegroundColorSpan(this.f28290s), this.f28289r, this.f28275b.length(), 33);
            }
            if (i2 != w) {
                this.f28289r = this.f28275b.length();
                this.f28290s = i2;
            }
            if (this.f28291t != -1 && this.f28292u != i3) {
                this.f28275b.setSpan(new BackgroundColorSpan(this.f28292u), this.f28291t, this.f28275b.length(), 33);
            }
            if (i3 != x) {
                this.f28291t = this.f28275b.length();
                this.f28292u = i3;
            }
        }

        public static int a(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        public static int a(int i2, int i3, int i4, int i5) {
            b1.a(i2, 0, 4);
            b1.a(i3, 0, 4);
            b1.a(i4, 0, 4);
            b1.a(i5, 0, 4);
            return Color.argb(i5 != 2 ? i5 != 3 ? 255 : 0 : 127, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0);
        }

        public void a(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.f28287p != -1) {
                if (!z2) {
                    this.f28275b.setSpan(new StyleSpan(2), this.f28287p, this.f28275b.length(), 33);
                    this.f28287p = -1;
                }
            } else if (z2) {
                this.f28287p = this.f28275b.length();
            }
            if (this.f28288q == -1) {
                if (z3) {
                    this.f28288q = this.f28275b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.f28275b.setSpan(new UnderlineSpan(), this.f28288q, this.f28275b.length(), 33);
                this.f28288q = -1;
            }
        }

        public void a(int i2, int i3) {
            if (this.f28293v != i2) {
                a('\n');
            }
            this.f28293v = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public final int f28294a;

        /* renamed from: b */
        public final int f28295b;

        /* renamed from: c */
        public final byte[] f28296c;
        int d = 0;

        public c(int i2, int i3) {
            this.f28294a = i2;
            this.f28295b = i3;
            this.f28296c = new byte[(i3 * 2) - 1];
        }
    }

    public z2(int i2, List list) {
        this.f28262k = i2 == -1 ? 1 : i2;
        this.f28261j = list != null && o3.a(list);
        this.f28263l = new b[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f28263l[i3] = new b();
        }
        this.f28264m = this.f28263l[0];
    }

    private void a(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.f28265n = l();
                return;
            }
            if (i2 != 8) {
                switch (i2) {
                    case 12:
                        r();
                        return;
                    case 13:
                        this.f28264m.a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i2 >= 17 && i2 <= 23) {
                            com.applovin.impl.adview.t.u("Currently unsupported COMMAND_EXT1 Command: ", i2, "Cea708Decoder");
                            this.f28259h.d(8);
                            return;
                        } else if (i2 >= 24 && i2 <= 31) {
                            com.applovin.impl.adview.t.u("Currently unsupported COMMAND_P16 Command: ", i2, "Cea708Decoder");
                            this.f28259h.d(16);
                            return;
                        } else {
                            com.applovin.impl.adview.t.u("Invalid C0 command: ", i2, "Cea708Decoder");
                            return;
                        }
                }
            }
            this.f28264m.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    private void b(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case Opcodes.LOR /* 129 */:
            case 130:
            case Opcodes.LXOR /* 131 */:
            case Opcodes.IINC /* 132 */:
            case Opcodes.I2L /* 133 */:
            case Opcodes.I2F /* 134 */:
            case Opcodes.I2D /* 135 */:
                int i4 = i2 - 128;
                if (this.f28268q != i4) {
                    this.f28268q = i4;
                    this.f28264m = this.f28263l[i4];
                    return;
                }
                return;
            case Opcodes.L2I /* 136 */:
                while (i3 <= 8) {
                    if (this.f28259h.f()) {
                        this.f28263l[8 - i3].d();
                    }
                    i3++;
                }
                return;
            case Opcodes.L2F /* 137 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f28259h.f()) {
                        this.f28263l[8 - i5].a(true);
                    }
                }
                return;
            case Opcodes.L2D /* 138 */:
                while (i3 <= 8) {
                    if (this.f28259h.f()) {
                        this.f28263l[8 - i3].a(false);
                    }
                    i3++;
                }
                return;
            case Opcodes.F2I /* 139 */:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f28259h.f()) {
                        this.f28263l[8 - i6].a(!r0.g());
                    }
                }
                return;
            case Opcodes.F2L /* 140 */:
                while (i3 <= 8) {
                    if (this.f28259h.f()) {
                        this.f28263l[8 - i3].h();
                    }
                    i3++;
                }
                return;
            case Opcodes.F2D /* 141 */:
                this.f28259h.d(8);
                return;
            case Opcodes.D2I /* 142 */:
                return;
            case Opcodes.D2L /* 143 */:
                r();
                return;
            case Opcodes.D2F /* 144 */:
                if (!this.f28264m.e()) {
                    this.f28259h.d(16);
                    return;
                } else {
                    m();
                    return;
                }
            case Opcodes.I2B /* 145 */:
                if (!this.f28264m.e()) {
                    this.f28259h.d(24);
                    return;
                } else {
                    n();
                    return;
                }
            case Opcodes.I2C /* 146 */:
                if (!this.f28264m.e()) {
                    this.f28259h.d(16);
                    return;
                } else {
                    o();
                    return;
                }
            case Opcodes.I2S /* 147 */:
            case Opcodes.LCMP /* 148 */:
            case Opcodes.FCMPL /* 149 */:
            case Opcodes.FCMPG /* 150 */:
            default:
                com.applovin.impl.adview.t.u("Invalid C1 command: ", i2, "Cea708Decoder");
                return;
            case Opcodes.DCMPL /* 151 */:
                if (!this.f28264m.e()) {
                    this.f28259h.d(32);
                    return;
                } else {
                    p();
                    return;
                }
            case Opcodes.DCMPG /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case Opcodes.IF_ICMPEQ /* 159 */:
                int i7 = i2 - 152;
                e(i7);
                if (this.f28268q != i7) {
                    this.f28268q = i7;
                    this.f28264m = this.f28263l[i7];
                    return;
                }
                return;
        }
    }

    private void c(int i2) {
        if (i2 <= 7) {
            return;
        }
        if (i2 <= 15) {
            this.f28259h.d(8);
        } else if (i2 <= 23) {
            this.f28259h.d(16);
        } else if (i2 <= 31) {
            this.f28259h.d(24);
        }
    }

    private void d(int i2) {
        if (i2 <= 135) {
            this.f28259h.d(32);
            return;
        }
        if (i2 <= 143) {
            this.f28259h.d(40);
        } else if (i2 <= 159) {
            this.f28259h.d(2);
            this.f28259h.d(this.f28259h.a(6) * 8);
        }
    }

    private void h(int i2) {
        if (i2 == 32) {
            this.f28264m.a(' ');
            return;
        }
        if (i2 == 33) {
            this.f28264m.a((char) 160);
            return;
        }
        if (i2 == 37) {
            this.f28264m.a((char) 8230);
            return;
        }
        if (i2 == 42) {
            this.f28264m.a((char) 352);
            return;
        }
        if (i2 == 44) {
            this.f28264m.a((char) 338);
            return;
        }
        if (i2 == 63) {
            this.f28264m.a((char) 376);
            return;
        }
        if (i2 == 57) {
            this.f28264m.a((char) 8482);
            return;
        }
        if (i2 == 58) {
            this.f28264m.a((char) 353);
            return;
        }
        if (i2 == 60) {
            this.f28264m.a((char) 339);
            return;
        }
        if (i2 == 61) {
            this.f28264m.a((char) 8480);
            return;
        }
        switch (i2) {
            case 48:
                this.f28264m.a((char) 9608);
                return;
            case 49:
                this.f28264m.a((char) 8216);
                return;
            case 50:
                this.f28264m.a((char) 8217);
                return;
            case 51:
                this.f28264m.a((char) 8220);
                return;
            case 52:
                this.f28264m.a((char) 8221);
                return;
            case 53:
                this.f28264m.a((char) 8226);
                return;
            default:
                switch (i2) {
                    case Opcodes.FNEG /* 118 */:
                        this.f28264m.a((char) 8539);
                        return;
                    case Opcodes.DNEG /* 119 */:
                        this.f28264m.a((char) 8540);
                        return;
                    case 120:
                        this.f28264m.a((char) 8541);
                        return;
                    case Opcodes.LSHL /* 121 */:
                        this.f28264m.a((char) 8542);
                        return;
                    case 122:
                        this.f28264m.a((char) 9474);
                        return;
                    case Opcodes.LSHR /* 123 */:
                        this.f28264m.a((char) 9488);
                        return;
                    case 124:
                        this.f28264m.a((char) 9492);
                        return;
                    case Opcodes.LUSHR /* 125 */:
                        this.f28264m.a((char) 9472);
                        return;
                    case 126:
                        this.f28264m.a((char) 9496);
                        return;
                    case 127:
                        this.f28264m.a((char) 9484);
                        return;
                    default:
                        com.applovin.impl.adview.t.u("Invalid G2 character: ", i2, "Cea708Decoder");
                        return;
                }
        }
    }

    private void i(int i2) {
        if (i2 == 160) {
            this.f28264m.a((char) 13252);
        } else {
            com.applovin.impl.adview.t.u("Invalid G3 character: ", i2, "Cea708Decoder");
            this.f28264m.a('_');
        }
    }

    private void k() {
        if (this.f28267p == null) {
            return;
        }
        q();
        this.f28267p = null;
    }

    private List l() {
        a b2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.f28263l[i2].f() && this.f28263l[i2].g() && (b2 = this.f28263l[i2].b()) != null) {
                arrayList.add(b2);
            }
        }
        Collections.sort(arrayList, a.f28269c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((a) arrayList.get(i3)).f28270a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void m() {
        this.f28264m.a(this.f28259h.a(4), this.f28259h.a(2), this.f28259h.a(2), this.f28259h.f(), this.f28259h.f(), this.f28259h.a(3), this.f28259h.a(3));
    }

    private void n() {
        int a2 = b.a(this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2));
        int a3 = b.a(this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2));
        this.f28259h.d(2);
        this.f28264m.b(a2, a3, b.a(this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2)));
    }

    private void o() {
        this.f28259h.d(4);
        int a2 = this.f28259h.a(4);
        this.f28259h.d(2);
        this.f28264m.a(a2, this.f28259h.a(6));
    }

    private void p() {
        int a2 = b.a(this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2));
        int a3 = this.f28259h.a(2);
        int a4 = b.a(this.f28259h.a(2), this.f28259h.a(2), this.f28259h.a(2));
        if (this.f28259h.f()) {
            a3 |= 4;
        }
        boolean f2 = this.f28259h.f();
        int a5 = this.f28259h.a(2);
        int a6 = this.f28259h.a(2);
        int a7 = this.f28259h.a(2);
        this.f28259h.d(8);
        this.f28264m.a(a2, a4, f2, a3, a5, a6, a7);
    }

    private void q() {
        c cVar = this.f28267p;
        if (cVar.d != (cVar.f28295b * 2) - 1) {
            pc.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f28267p.f28295b * 2) - 1) + ", but current index is " + this.f28267p.d + " (sequence number " + this.f28267p.f28294a + ");");
        }
        ah ahVar = this.f28259h;
        c cVar2 = this.f28267p;
        ahVar.a(cVar2.f28296c, cVar2.d);
        int a2 = this.f28259h.a(3);
        int a3 = this.f28259h.a(5);
        if (a2 == 7) {
            this.f28259h.d(2);
            a2 = this.f28259h.a(6);
            if (a2 < 7) {
                com.applovin.impl.adview.t.u("Invalid extended service number: ", a2, "Cea708Decoder");
            }
        }
        if (a3 == 0) {
            if (a2 != 0) {
                pc.d("Cea708Decoder", "serviceNumber is non-zero (" + a2 + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (a2 != this.f28262k) {
            return;
        }
        boolean z2 = false;
        while (this.f28259h.b() > 0) {
            int a4 = this.f28259h.a(8);
            if (a4 == 16) {
                int a5 = this.f28259h.a(8);
                if (a5 <= 31) {
                    c(a5);
                } else {
                    if (a5 <= 127) {
                        h(a5);
                    } else if (a5 <= 159) {
                        d(a5);
                    } else if (a5 <= 255) {
                        i(a5);
                    } else {
                        com.applovin.impl.adview.t.u("Invalid extended command: ", a5, "Cea708Decoder");
                    }
                    z2 = true;
                }
            } else if (a4 <= 31) {
                a(a4);
            } else {
                if (a4 <= 127) {
                    f(a4);
                } else if (a4 <= 159) {
                    b(a4);
                } else if (a4 <= 255) {
                    g(a4);
                } else {
                    com.applovin.impl.adview.t.u("Invalid base command: ", a4, "Cea708Decoder");
                }
                z2 = true;
            }
        }
        if (z2) {
            this.f28265n = l();
        }
    }

    private void r() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f28263l[i2].h();
        }
    }

    @Override // com.applovin.impl.a3
    public nl e() {
        List list = this.f28265n;
        this.f28266o = list;
        return new b3((List) b1.a(list));
    }

    @Override // com.applovin.impl.a3
    /* renamed from: f */
    public /* bridge */ /* synthetic */ rl d() {
        return super.d();
    }

    @Override // com.applovin.impl.a3
    /* renamed from: g */
    public /* bridge */ /* synthetic */ sl c() {
        return super.c();
    }

    @Override // com.applovin.impl.a3
    public boolean j() {
        return this.f28265n != this.f28266o;
    }

    private void e(int i2) {
        b bVar = this.f28263l[i2];
        this.f28259h.d(2);
        boolean f2 = this.f28259h.f();
        boolean f3 = this.f28259h.f();
        boolean f4 = this.f28259h.f();
        int a2 = this.f28259h.a(3);
        boolean f5 = this.f28259h.f();
        int a3 = this.f28259h.a(7);
        int a4 = this.f28259h.a(8);
        int a5 = this.f28259h.a(4);
        int a6 = this.f28259h.a(4);
        this.f28259h.d(2);
        int a7 = this.f28259h.a(6);
        this.f28259h.d(2);
        bVar.a(f2, f3, f4, a2, f5, a3, a4, a6, a7, a5, this.f28259h.a(3), this.f28259h.a(3));
    }

    private void f(int i2) {
        if (i2 == 127) {
            this.f28264m.a((char) 9835);
        } else {
            this.f28264m.a((char) (i2 & 255));
        }
    }

    private void g(int i2) {
        this.f28264m.a((char) (i2 & 255));
    }

    @Override // com.applovin.impl.a3
    public void a(rl rlVar) {
        ByteBuffer byteBuffer = (ByteBuffer) b1.a(rlVar.f25963c);
        this.f28258g.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f28258g.a() >= 3) {
            int w = this.f28258g.w();
            int i2 = w & 3;
            boolean z2 = (w & 4) == 4;
            byte w2 = (byte) this.f28258g.w();
            byte w3 = (byte) this.f28258g.w();
            if (i2 == 2 || i2 == 3) {
                if (z2) {
                    if (i2 == 3) {
                        k();
                        int i3 = (w2 & 192) >> 6;
                        int i4 = this.f28260i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            r();
                            pc.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f28260i + " current=" + i3);
                        }
                        this.f28260i = i3;
                        int i5 = w2 & Utf8.REPLACEMENT_BYTE;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        c cVar = new c(i3, i5);
                        this.f28267p = cVar;
                        byte[] bArr = cVar.f28296c;
                        int i6 = cVar.d;
                        cVar.d = i6 + 1;
                        bArr[i6] = w3;
                    } else {
                        b1.a(i2 == 2);
                        c cVar2 = this.f28267p;
                        if (cVar2 == null) {
                            pc.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f28296c;
                            int i7 = cVar2.d;
                            bArr2[i7] = w2;
                            cVar2.d = i7 + 2;
                            bArr2[i7 + 1] = w3;
                        }
                    }
                    c cVar3 = this.f28267p;
                    if (cVar3.d == (cVar3.f28295b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.m5
    public void b() {
        super.b();
        this.f28265n = null;
        this.f28266o = null;
        this.f28268q = 0;
        this.f28264m = this.f28263l[0];
        r();
        this.f28267p = null;
    }

    @Override // com.applovin.impl.a3
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(rl rlVar) {
        super.a(rlVar);
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.m5
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.ol
    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }
}
