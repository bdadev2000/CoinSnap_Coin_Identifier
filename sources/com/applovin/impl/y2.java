package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class y2 extends a3 {

    /* renamed from: h, reason: collision with root package name */
    private final int f28036h;

    /* renamed from: i, reason: collision with root package name */
    private final int f28037i;

    /* renamed from: j, reason: collision with root package name */
    private final int f28038j;

    /* renamed from: k, reason: collision with root package name */
    private final long f28039k;

    /* renamed from: n, reason: collision with root package name */
    private List f28042n;

    /* renamed from: o, reason: collision with root package name */
    private List f28043o;

    /* renamed from: p, reason: collision with root package name */
    private int f28044p;

    /* renamed from: q, reason: collision with root package name */
    private int f28045q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28046r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f28047s;

    /* renamed from: t, reason: collision with root package name */
    private byte f28048t;

    /* renamed from: u, reason: collision with root package name */
    private byte f28049u;
    private boolean w;
    private long x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f28033y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f28034z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, Opcodes.V_PREVIEW, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, Opcodes.LREM, Opcodes.FREM, Opcodes.DREM, 116, Opcodes.LNEG, Opcodes.FNEG, Opcodes.DNEG, 120, Opcodes.LSHL, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {Opcodes.FRETURN, Opcodes.ARETURN, Opcodes.ANEWARRAY, Opcodes.ATHROW, 8482, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {Opcodes.INSTANCEOF, 201, 211, 218, 220, 252, 8216, Opcodes.IF_ICMPLT, 42, 39, 8212, Opcodes.RET, 8480, 8226, 8220, 8221, Opcodes.CHECKCAST, Opcodes.MONITORENTER, Opcodes.IFNONNULL, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, Opcodes.LOOKUPSWITCH, Opcodes.NEW};
    private static final int[] E = {Opcodes.MONITOREXIT, 227, 205, 204, 236, 210, 242, 213, 245, Opcodes.LSHR, Opcodes.LUSHR, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPLE, 9474, Opcodes.MULTIANEWARRAY, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final bh f28035g = new bh();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f28040l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private a f28041m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f28050v = 0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f28051a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f28052b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f28053c = new StringBuilder();
        private int d;
        private int e;

        /* renamed from: f, reason: collision with root package name */
        private int f28054f;

        /* renamed from: g, reason: collision with root package name */
        private int f28055g;

        /* renamed from: h, reason: collision with root package name */
        private int f28056h;

        /* renamed from: com.applovin.impl.y2$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0104a {

            /* renamed from: a, reason: collision with root package name */
            public final int f28057a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f28058b;

            /* renamed from: c, reason: collision with root package name */
            public int f28059c;

            public C0104a(int i2, boolean z2, int i3) {
                this.f28057a = i2;
                this.f28058b = z2;
                this.f28059c = i3;
            }
        }

        public a(int i2, int i3) {
            b(i2);
            this.f28056h = i3;
        }

        public void c(int i2) {
            this.f28055g = i2;
        }

        public void d(int i2) {
            this.f28056h = i2;
        }

        public void b(int i2) {
            this.f28055g = i2;
            this.f28051a.clear();
            this.f28052b.clear();
            this.f28053c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f28054f = 0;
        }

        public void d() {
            this.f28052b.add(b());
            this.f28053c.setLength(0);
            this.f28051a.clear();
            int min = Math.min(this.f28056h, this.d);
            while (this.f28052b.size() >= min) {
                this.f28052b.remove(0);
            }
        }

        public void a(char c2) {
            if (this.f28053c.length() < 32) {
                this.f28053c.append(c2);
            }
        }

        public boolean c() {
            return this.f28051a.isEmpty() && this.f28052b.isEmpty() && this.f28053c.length() == 0;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        public void a() {
            int length = this.f28053c.length();
            if (length > 0) {
                this.f28053c.delete(length - 1, length);
                for (int size = this.f28051a.size() - 1; size >= 0; size--) {
                    C0104a c0104a = (C0104a) this.f28051a.get(size);
                    int i2 = c0104a.f28059c;
                    if (i2 != length) {
                        return;
                    }
                    c0104a.f28059c = i2 - 1;
                }
            }
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28053c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (i6 < this.f28051a.size()) {
                C0104a c0104a = (C0104a) this.f28051a.get(i6);
                boolean z3 = c0104a.f28058b;
                int i8 = c0104a.f28057a;
                if (i8 != 8) {
                    boolean z4 = i8 == 7;
                    if (i8 != 7) {
                        i5 = y2.A[i8];
                    }
                    z2 = z4;
                }
                int i9 = c0104a.f28059c;
                i6++;
                if (i9 != (i6 < this.f28051a.size() ? ((C0104a) this.f28051a.get(i6)).f28059c : length)) {
                    if (i2 != -1 && !z3) {
                        b(spannableStringBuilder, i2, i9);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        a(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        a(spannableStringBuilder, i7, i9, i4);
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                b(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                a(spannableStringBuilder, i3, length);
            }
            if (i7 != length) {
                a(spannableStringBuilder, i7, length, i4);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public b5 a(int i2) {
            float f2;
            int i3 = this.e + this.f28054f;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f28052b.size(); i5++) {
                spannableStringBuilder.append(xp.a((CharSequence) this.f28052b.get(i5), i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(xp.a(b(), i4));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i4 - spannableStringBuilder.length();
            int i6 = i3 - length;
            if (i2 == Integer.MIN_VALUE) {
                i2 = (this.f28055g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.f28055g != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length;
                }
                f2 = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i7 = this.d;
            if (i7 > 7) {
                i7 -= 17;
            } else if (this.f28055g == 1) {
                i7 -= this.f28056h - 1;
            }
            return new b5.b().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(i7, 1).b(f2).b(i2).a();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        public void a(int i2, boolean z2) {
            this.f28051a.add(new C0104a(i2, z2, this.f28053c.length()));
        }
    }

    public y2(String str, int i2, long j2) {
        this.f28039k = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.f28036h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.f28038j = 0;
            this.f28037i = 0;
        } else if (i2 == 2) {
            this.f28038j = 1;
            this.f28037i = 0;
        } else if (i2 == 3) {
            this.f28038j = 0;
            this.f28037i = 1;
        } else if (i2 != 4) {
            pc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f28038j = 0;
            this.f28037i = 0;
        } else {
            this.f28038j = 1;
            this.f28037i = 1;
        }
        a(0);
        m();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    private static int b(byte b2) {
        return (b2 >> 3) & 1;
    }

    private static boolean c(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    private static boolean d(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static boolean e(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    private static boolean f(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean g(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    private static boolean h(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean i(byte b2) {
        return (b2 & 240) == 16;
    }

    private static boolean k(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    private List l() {
        int size = this.f28040l.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            b5 a2 = ((a) this.f28040l.get(i3)).a(Integer.MIN_VALUE);
            arrayList.add(a2);
            if (a2 != null) {
                i2 = Math.min(i2, a2.f22997j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            b5 b5Var = (b5) arrayList.get(i4);
            if (b5Var != null) {
                if (b5Var.f22997j != i2) {
                    b5Var = (b5) b1.a(((a) this.f28040l.get(i4)).a(i2));
                }
                arrayList2.add(b5Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.f28041m.b(this.f28044p);
        this.f28040l.clear();
        this.f28040l.add(this.f28041m);
    }

    private boolean n() {
        return (this.f28039k == -9223372036854775807L || this.x == -9223372036854775807L || i() - this.x < this.f28039k) ? false : true;
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.m5
    public void a() {
    }

    @Override // com.applovin.impl.a3
    public boolean j() {
        return this.f28042n != this.f28043o;
    }

    private static char d(byte b2) {
        return (char) E[b2 & 31];
    }

    private static boolean h(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0018. Please report as an issue. */
    private void i(byte b2, byte b3) {
        if (k(b2)) {
            this.w = false;
            return;
        }
        if (j(b2)) {
            if (b3 != 32 && b3 != 47) {
                switch (b3) {
                    default:
                        switch (b3) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.w = false;
                                return;
                            default:
                                return;
                        }
                    case 37:
                    case 38:
                    case 39:
                        this.w = true;
                }
            }
            this.w = true;
        }
    }

    private static boolean j(byte b2) {
        return (b2 & 247) == 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // com.applovin.impl.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.rl r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.y2.a(com.applovin.impl.rl):void");
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.m5
    public void b() {
        super.b();
        this.f28042n = null;
        this.f28043o = null;
        a(0);
        b(4);
        m();
        this.f28046r = false;
        this.f28047s = false;
        this.f28048t = (byte) 0;
        this.f28049u = (byte) 0;
        this.f28050v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.applovin.impl.a3
    public nl e() {
        List list = this.f28042n;
        this.f28043o = list;
        return new b3((List) b1.a(list));
    }

    @Override // com.applovin.impl.a3
    /* renamed from: f */
    public /* bridge */ /* synthetic */ rl d() {
        return super.d();
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.m5
    /* renamed from: g */
    public sl c() {
        sl h2;
        sl c2 = super.c();
        if (c2 != null) {
            return c2;
        }
        if (!n() || (h2 = h()) == null) {
            return null;
        }
        this.f28042n = Collections.emptyList();
        this.x = -9223372036854775807L;
        h2.a(i(), e(), Long.MAX_VALUE);
        return h2;
    }

    private static char c(byte b2) {
        return (char) D[b2 & 31];
    }

    private static char e(byte b2) {
        return (char) C[b2 & 15];
    }

    private void f(byte b2) {
        this.f28041m.a(' ');
        this.f28041m.a((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void b(byte b2, byte b3) {
        int i2 = f28033y[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.f28041m.d) {
            if (this.f28044p != 1 && !this.f28041m.c()) {
                a aVar = new a(this.f28044p, this.f28045q);
                this.f28041m = aVar;
                this.f28040l.add(aVar);
            }
            this.f28041m.d = i2;
        }
        boolean z2 = (b3 & 16) == 16;
        boolean z3 = (b3 & 1) == 1;
        int i3 = (b3 >> 1) & 7;
        this.f28041m.a(z2 ? 8 : i3, z3);
        if (z2) {
            this.f28041m.e = f28034z[i3];
        }
    }

    private void g(byte b2) {
        if (b2 == 32) {
            a(2);
            return;
        }
        if (b2 != 41) {
            switch (b2) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case 38:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i2 = this.f28044p;
                    if (i2 == 0) {
                        return;
                    }
                    if (b2 != 33) {
                        switch (b2) {
                            case 44:
                                this.f28042n = Collections.emptyList();
                                int i3 = this.f28044p;
                                if (i3 == 1 || i3 == 3) {
                                    m();
                                    return;
                                }
                                return;
                            case 45:
                                if (i2 != 1 || this.f28041m.c()) {
                                    return;
                                }
                                this.f28041m.d();
                                return;
                            case 46:
                                m();
                                return;
                            case 47:
                                this.f28042n = l();
                                m();
                                return;
                            default:
                                return;
                        }
                    }
                    this.f28041m.a();
                    return;
            }
        }
        a(3);
    }

    private boolean l(byte b2) {
        if (h(b2)) {
            this.f28050v = b(b2);
        }
        return this.f28050v == this.f28038j;
    }

    @Override // com.applovin.impl.a3
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(rl rlVar) {
        super.a(rlVar);
    }

    private void b(int i2) {
        this.f28045q = i2;
        this.f28041m.d(i2);
    }

    private static char a(byte b2) {
        return (char) B[(b2 & Byte.MAX_VALUE) - 32];
    }

    private static char a(byte b2, byte b3) {
        if ((b2 & 1) == 0) {
            return c(b3);
        }
        return d(b3);
    }

    private boolean a(boolean z2, byte b2, byte b3) {
        if (!z2 || !i(b2)) {
            this.f28047s = false;
        } else {
            if (this.f28047s && this.f28048t == b2 && this.f28049u == b3) {
                this.f28047s = false;
                return true;
            }
            this.f28047s = true;
            this.f28048t = b2;
            this.f28049u = b3;
        }
        return false;
    }

    private void a(int i2) {
        int i3 = this.f28044p;
        if (i3 == i2) {
            return;
        }
        this.f28044p = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.f28040l.size(); i4++) {
                ((a) this.f28040l.get(i4)).c(i2);
            }
            return;
        }
        m();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.f28042n = Collections.emptyList();
        }
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.ol
    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }
}
