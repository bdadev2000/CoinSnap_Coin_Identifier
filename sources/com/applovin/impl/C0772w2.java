package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.MotionEventCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772w2 extends AbstractC0780y2 {

    /* renamed from: h, reason: collision with root package name */
    private final int f11866h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11867i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11868j;

    /* renamed from: k, reason: collision with root package name */
    private final long f11869k;

    /* renamed from: n, reason: collision with root package name */
    private List f11870n;

    /* renamed from: o, reason: collision with root package name */
    private List f11871o;

    /* renamed from: p, reason: collision with root package name */
    private int f11872p;

    /* renamed from: q, reason: collision with root package name */
    private int f11873q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11874r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11875s;

    /* renamed from: t, reason: collision with root package name */
    private byte f11876t;

    /* renamed from: u, reason: collision with root package name */
    private byte f11877u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11879w;

    /* renamed from: x, reason: collision with root package name */
    private long f11880x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f11863y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f11864z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f11857A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f11858B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f11859C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f11860D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f11861E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    private static final boolean[] f11862F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final yg f11865g = new yg();
    private final ArrayList l = new ArrayList();
    private a m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f11878v = 0;

    /* renamed from: com.applovin.impl.w2$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f11881a = new ArrayList();
        private final List b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f11882c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f11883d;

        /* renamed from: e, reason: collision with root package name */
        private int f11884e;

        /* renamed from: f, reason: collision with root package name */
        private int f11885f;

        /* renamed from: g, reason: collision with root package name */
        private int f11886g;

        /* renamed from: h, reason: collision with root package name */
        private int f11887h;

        /* renamed from: com.applovin.impl.w2$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0040a {

            /* renamed from: a, reason: collision with root package name */
            public final int f11888a;
            public final boolean b;

            /* renamed from: c, reason: collision with root package name */
            public int f11889c;

            public C0040a(int i9, boolean z8, int i10) {
                this.f11888a = i9;
                this.b = z8;
                this.f11889c = i10;
            }
        }

        public a(int i9, int i10) {
            b(i9);
            this.f11887h = i10;
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
            L.o(2, spannableStringBuilder, i9, i10, 33);
        }

        public void d() {
            this.b.add(b());
            this.f11882c.setLength(0);
            this.f11881a.clear();
            int min = Math.min(this.f11887h, this.f11883d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void b(int i9) {
            this.f11886g = i9;
            this.f11881a.clear();
            this.b.clear();
            this.f11882c.setLength(0);
            this.f11883d = 15;
            this.f11884e = 0;
            this.f11885f = 0;
        }

        public boolean c() {
            return this.f11881a.isEmpty() && this.b.isEmpty() && this.f11882c.length() == 0;
        }

        public void c(int i9) {
            this.f11886g = i9;
        }

        public void a(char c9) {
            if (this.f11882c.length() < 32) {
                this.f11882c.append(c9);
            }
        }

        public void d(int i9) {
            this.f11887h = i9;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i9, int i10) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, 33);
        }

        public void a() {
            int length = this.f11882c.length();
            if (length > 0) {
                this.f11882c.delete(length - 1, length);
                for (int size = this.f11881a.size() - 1; size >= 0; size--) {
                    C0040a c0040a = (C0040a) this.f11881a.get(size);
                    int i9 = c0040a.f11889c;
                    if (i9 != length) {
                        return;
                    }
                    c0040a.f11889c = i9 - 1;
                }
            }
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f11882c);
            int length = spannableStringBuilder.length();
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            boolean z8 = false;
            while (i13 < this.f11881a.size()) {
                C0040a c0040a = (C0040a) this.f11881a.get(i13);
                boolean z9 = c0040a.b;
                int i15 = c0040a.f11888a;
                if (i15 != 8) {
                    boolean z10 = i15 == 7;
                    if (i15 != 7) {
                        i12 = C0772w2.f11857A[i15];
                    }
                    z8 = z10;
                }
                int i16 = c0040a.f11889c;
                i13++;
                if (i16 != (i13 < this.f11881a.size() ? ((C0040a) this.f11881a.get(i13)).f11889c : length)) {
                    if (i9 != -1 && !z9) {
                        b(spannableStringBuilder, i9, i16);
                        i9 = -1;
                    } else if (i9 == -1 && z9) {
                        i9 = i16;
                    }
                    if (i10 != -1 && !z8) {
                        a(spannableStringBuilder, i10, i16);
                        i10 = -1;
                    } else if (i10 == -1 && z8) {
                        i10 = i16;
                    }
                    if (i12 != i11) {
                        a(spannableStringBuilder, i14, i16, i11);
                        i11 = i12;
                        i14 = i16;
                    }
                }
            }
            if (i9 != -1 && i9 != length) {
                b(spannableStringBuilder, i9, length);
            }
            if (i10 != -1 && i10 != length) {
                a(spannableStringBuilder, i10, length);
            }
            if (i14 != length) {
                a(spannableStringBuilder, i14, length, i11);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public z4 a(int i9) {
            float f9;
            int i10 = this.f11884e + this.f11885f;
            int i11 = 32 - i10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.b.size(); i12++) {
                spannableStringBuilder.append(yp.a((CharSequence) this.b.get(i12), i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(yp.a(b(), i11));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i11 - spannableStringBuilder.length();
            int i13 = i10 - length;
            if (i9 == Integer.MIN_VALUE) {
                if (this.f11886g != 2 || (Math.abs(i13) >= 3 && length >= 0)) {
                    i9 = (this.f11886g != 2 || i13 <= 0) ? 0 : 2;
                } else {
                    i9 = 1;
                }
            }
            if (i9 != 1) {
                if (i9 == 2) {
                    i10 = 32 - length;
                }
                f9 = ((i10 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f9 = 0.5f;
            }
            int i14 = this.f11883d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f11886g == 1) {
                i14 -= this.f11887h - 1;
            }
            return new z4.b().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(i14, 1).b(f9).b(i9).a();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11) {
            if (i11 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i9, i10, 33);
        }

        public void a(int i9, boolean z8) {
            this.f11881a.add(new C0040a(i9, z8, this.f11882c.length()));
        }
    }

    public C0772w2(String str, int i9, long j7) {
        long j9;
        int i10;
        if (j7 > 0) {
            j9 = j7 * 1000;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f11869k = j9;
        if (MimeTypes.APPLICATION_MP4CEA608.equals(str)) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        this.f11866h = i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        kc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f11868j = 0;
                        this.f11867i = 0;
                    } else {
                        this.f11868j = 1;
                        this.f11867i = 1;
                    }
                } else {
                    this.f11868j = 0;
                    this.f11867i = 1;
                }
            } else {
                this.f11868j = 1;
                this.f11867i = 0;
            }
        } else {
            this.f11868j = 0;
            this.f11867i = 0;
        }
        a(0);
        m();
        this.f11879w = true;
        this.f11880x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    private static int b(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean c(byte b, byte b8) {
        return (b & 246) == 18 && (b8 & 224) == 32;
    }

    private static boolean d(byte b, byte b8) {
        return (b & 247) == 17 && (b8 & 240) == 32;
    }

    private static boolean e(byte b, byte b8) {
        return (b & 246) == 20 && (b8 & 240) == 32;
    }

    private static boolean f(byte b, byte b8) {
        return (b & 240) == 16 && (b8 & 192) == 64;
    }

    private static boolean g(byte b, byte b8) {
        return (b & 247) == 17 && (b8 & 240) == 48;
    }

    private static boolean h(byte b) {
        return (b & 224) == 0;
    }

    private static boolean i(byte b) {
        return (b & 240) == 16;
    }

    private static boolean j(byte b) {
        return (b & 247) == 20;
    }

    private static boolean k(byte b) {
        return 1 <= b && b <= 15;
    }

    private List l() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int i9 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            z4 a6 = ((a) this.l.get(i10)).a(Integer.MIN_VALUE);
            arrayList.add(a6);
            if (a6 != null) {
                i9 = Math.min(i9, a6.f12512j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            z4 z4Var = (z4) arrayList.get(i11);
            if (z4Var != null) {
                if (z4Var.f12512j != i9) {
                    z4Var = (z4) AbstractC0669a1.a(((a) this.l.get(i11)).a(i9));
                }
                arrayList2.add(z4Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.m.b(this.f11872p);
        this.l.clear();
        this.l.add(this.m);
    }

    private boolean n() {
        if (this.f11869k == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || this.f11880x == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || i() - this.f11880x < this.f11869k) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.k5
    public void a() {
    }

    private static char d(byte b) {
        return (char) f11861E[b & Ascii.US];
    }

    private static boolean h(byte b, byte b8) {
        return (b & 247) == 23 && b8 >= 33 && b8 <= 35;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0018. Please report as an issue. */
    private void i(byte b, byte b8) {
        if (k(b)) {
            this.f11879w = false;
            return;
        }
        if (j(b)) {
            if (b8 != 32 && b8 != 47) {
                switch (b8) {
                    default:
                        switch (b8) {
                            case 41:
                                break;
                            case 42:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                this.f11879w = false;
                                return;
                            default:
                                return;
                        }
                    case 37:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case 39:
                        this.f11879w = true;
                }
            }
            this.f11879w = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // com.applovin.impl.AbstractC0780y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.ol r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0772w2.a(com.applovin.impl.ol):void");
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.f11870n = null;
        this.f11871o = null;
        a(0);
        b(4);
        m();
        this.f11874r = false;
        this.f11875s = false;
        this.f11876t = (byte) 0;
        this.f11877u = (byte) 0;
        this.f11878v = 0;
        this.f11879w = true;
        this.f11880x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.AbstractC0780y2
    public kl e() {
        List list = this.f11870n;
        this.f11871o = list;
        return new C0784z2((List) AbstractC0669a1.a(list));
    }

    @Override // com.applovin.impl.AbstractC0780y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.k5
    /* renamed from: g */
    public pl c() {
        pl h6;
        pl c9 = super.c();
        if (c9 != null) {
            return c9;
        }
        if (!n() || (h6 = h()) == null) {
            return null;
        }
        this.f11870n = Collections.emptyList();
        this.f11880x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        h6.a(i(), e(), Long.MAX_VALUE);
        return h6;
    }

    @Override // com.applovin.impl.AbstractC0780y2
    public boolean j() {
        return this.f11870n != this.f11871o;
    }

    private static char c(byte b) {
        return (char) f11860D[b & Ascii.US];
    }

    private void f(byte b) {
        this.m.a(' ');
        this.m.a((b >> 1) & 7, (b & 1) == 1);
    }

    private static char e(byte b) {
        return (char) f11859C[b & Ascii.SI];
    }

    private void g(byte b) {
        if (b == 32) {
            a(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i9 = this.f11872p;
                    if (i9 == 0) {
                        return;
                    }
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.f11870n = Collections.emptyList();
                                int i10 = this.f11872p;
                                if (i10 == 1 || i10 == 3) {
                                    m();
                                    return;
                                }
                                return;
                            case 45:
                                if (i9 != 1 || this.m.c()) {
                                    return;
                                }
                                this.m.d();
                                return;
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                m();
                                return;
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                this.f11870n = l();
                                m();
                                return;
                            default:
                                return;
                        }
                    }
                    this.m.a();
                    return;
            }
        }
        a(3);
    }

    private boolean l(byte b) {
        if (h(b)) {
            this.f11878v = b(b);
        }
        return this.f11878v == this.f11868j;
    }

    private void b(byte b, byte b8) {
        int i9 = f11863y[b & 7];
        if ((b8 & 32) != 0) {
            i9++;
        }
        if (i9 != this.m.f11883d) {
            if (this.f11872p != 1 && !this.m.c()) {
                a aVar = new a(this.f11872p, this.f11873q);
                this.m = aVar;
                this.l.add(aVar);
            }
            this.m.f11883d = i9;
        }
        boolean z8 = (b8 & Ascii.DLE) == 16;
        boolean z9 = (b8 & 1) == 1;
        int i10 = (b8 >> 1) & 7;
        this.m.a(z8 ? 8 : i10, z9);
        if (z8) {
            this.m.f11884e = f11864z[i10];
        }
    }

    @Override // com.applovin.impl.AbstractC0780y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    private void b(int i9) {
        this.f11873q = i9;
        this.m.d(i9);
    }

    private static char a(byte b) {
        return (char) f11858B[(b & Ascii.DEL) - 32];
    }

    private static char a(byte b, byte b8) {
        if ((b & 1) == 0) {
            return c(b8);
        }
        return d(b8);
    }

    private boolean a(boolean z8, byte b, byte b8) {
        if (z8 && i(b)) {
            if (this.f11875s && this.f11876t == b && this.f11877u == b8) {
                this.f11875s = false;
                return true;
            }
            this.f11875s = true;
            this.f11876t = b;
            this.f11877u = b8;
        } else {
            this.f11875s = false;
        }
        return false;
    }

    private void a(int i9) {
        int i10 = this.f11872p;
        if (i10 == i9) {
            return;
        }
        this.f11872p = i9;
        if (i9 == 3) {
            for (int i11 = 0; i11 < this.l.size(); i11++) {
                ((a) this.l.get(i11)).c(i9);
            }
            return;
        }
        m();
        if (i10 == 3 || i9 == 1 || i9 == 0) {
            this.f11870n = Collections.emptyList();
        }
    }

    @Override // com.applovin.impl.AbstractC0780y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j7) {
        super.a(j7);
    }
}
