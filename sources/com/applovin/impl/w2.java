package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.MotionEventCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.z4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class w2 extends y2 {

    /* renamed from: h, reason: collision with root package name */
    private final int f8652h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8653i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8654j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8655k;

    /* renamed from: n, reason: collision with root package name */
    private List f8658n;

    /* renamed from: o, reason: collision with root package name */
    private List f8659o;

    /* renamed from: p, reason: collision with root package name */
    private int f8660p;

    /* renamed from: q, reason: collision with root package name */
    private int f8661q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8662r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8663s;

    /* renamed from: t, reason: collision with root package name */
    private byte f8664t;
    private byte u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8666w;

    /* renamed from: x, reason: collision with root package name */
    private long f8667x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f8649y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f8650z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final yg f8651g = new yg();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f8656l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private a f8657m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f8665v = 0;

    /* loaded from: classes.dex */
    public static final class a {
        private final List a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f8668b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f8669c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f8670d;

        /* renamed from: e, reason: collision with root package name */
        private int f8671e;

        /* renamed from: f, reason: collision with root package name */
        private int f8672f;

        /* renamed from: g, reason: collision with root package name */
        private int f8673g;

        /* renamed from: h, reason: collision with root package name */
        private int f8674h;

        /* renamed from: com.applovin.impl.w2$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0040a {
            public final int a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f8675b;

            /* renamed from: c, reason: collision with root package name */
            public int f8676c;

            public C0040a(int i10, boolean z10, int i11) {
                this.a = i10;
                this.f8675b = z10;
                this.f8676c = i11;
            }
        }

        public a(int i10, int i11) {
            b(i10);
            this.f8674h = i11;
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i10, i11, 33);
        }

        public void d() {
            this.f8668b.add(b());
            this.f8669c.setLength(0);
            this.a.clear();
            int min = Math.min(this.f8674h, this.f8670d);
            while (this.f8668b.size() >= min) {
                this.f8668b.remove(0);
            }
        }

        public void b(int i10) {
            this.f8673g = i10;
            this.a.clear();
            this.f8668b.clear();
            this.f8669c.setLength(0);
            this.f8670d = 15;
            this.f8671e = 0;
            this.f8672f = 0;
        }

        public boolean c() {
            return this.a.isEmpty() && this.f8668b.isEmpty() && this.f8669c.length() == 0;
        }

        public void c(int i10) {
            this.f8673g = i10;
        }

        public void a(char c10) {
            if (this.f8669c.length() < 32) {
                this.f8669c.append(c10);
            }
        }

        public void d(int i10) {
            this.f8674h = i10;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void a() {
            int length = this.f8669c.length();
            if (length > 0) {
                this.f8669c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0040a c0040a = (C0040a) this.a.get(size);
                    int i10 = c0040a.f8676c;
                    if (i10 != length) {
                        return;
                    }
                    c0040a.f8676c = i10 - 1;
                }
            }
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8669c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.a.size()) {
                C0040a c0040a = (C0040a) this.a.get(i14);
                boolean z11 = c0040a.f8675b;
                int i16 = c0040a.a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = w2.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0040a.f8676c;
                i14++;
                if (i17 != (i14 < this.a.size() ? ((C0040a) this.a.get(i14)).f8676c : length)) {
                    if (i10 != -1 && !z11) {
                        b(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        a(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        a(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                b(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                a(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                a(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public z4 a(int i10) {
            float f10;
            int i11 = this.f8671e + this.f8672f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f8668b.size(); i13++) {
                spannableStringBuilder.append(yp.a((CharSequence) this.f8668b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(yp.a(b(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f8673g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f8673g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f8670d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f8673g == 1) {
                i15 -= this.f8674h - 1;
            }
            return new z4.b().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(i15, 1).b(f10).b(i10).a();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        public void a(int i10, boolean z10) {
            this.a.add(new C0040a(i10, z10, this.f8669c.length()));
        }
    }

    public w2(String str, int i10, long j3) {
        long j10;
        int i11;
        if (j3 > 0) {
            j10 = j3 * 1000;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f8655k = j10;
        if (MimeTypes.APPLICATION_MP4CEA608.equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f8652h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        kc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f8654j = 0;
                        this.f8653i = 0;
                    } else {
                        this.f8654j = 1;
                        this.f8653i = 1;
                    }
                } else {
                    this.f8654j = 0;
                    this.f8653i = 1;
                }
            } else {
                this.f8654j = 1;
                this.f8653i = 0;
            }
        } else {
            this.f8654j = 0;
            this.f8653i = 0;
        }
        a(0);
        m();
        this.f8666w = true;
        this.f8667x = C.TIME_UNSET;
    }

    private static int b(byte b3) {
        return (b3 >> 3) & 1;
    }

    private static boolean c(byte b3, byte b10) {
        return (b3 & 246) == 18 && (b10 & 224) == 32;
    }

    private static boolean d(byte b3, byte b10) {
        return (b3 & 247) == 17 && (b10 & 240) == 32;
    }

    private static boolean e(byte b3, byte b10) {
        return (b3 & 246) == 20 && (b10 & 240) == 32;
    }

    private static boolean f(byte b3, byte b10) {
        return (b3 & 240) == 16 && (b10 & 192) == 64;
    }

    private static boolean g(byte b3, byte b10) {
        return (b3 & 247) == 17 && (b10 & 240) == 48;
    }

    private static boolean h(byte b3) {
        return (b3 & 224) == 0;
    }

    private static boolean i(byte b3) {
        return (b3 & 240) == 16;
    }

    private static boolean j(byte b3) {
        return (b3 & 247) == 20;
    }

    private static boolean k(byte b3) {
        return 1 <= b3 && b3 <= 15;
    }

    private List l() {
        int size = this.f8656l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            z4 a10 = ((a) this.f8656l.get(i11)).a(Integer.MIN_VALUE);
            arrayList.add(a10);
            if (a10 != null) {
                i10 = Math.min(i10, a10.f9328j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            z4 z4Var = (z4) arrayList.get(i12);
            if (z4Var != null) {
                if (z4Var.f9328j != i10) {
                    z4Var = (z4) a1.a(((a) this.f8656l.get(i12)).a(i10));
                }
                arrayList2.add(z4Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.f8657m.b(this.f8660p);
        this.f8656l.clear();
        this.f8656l.add(this.f8657m);
    }

    private boolean n() {
        if (this.f8655k == C.TIME_UNSET || this.f8667x == C.TIME_UNSET || i() - this.f8667x < this.f8655k) {
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void a() {
    }

    private static char d(byte b3) {
        return (char) E[b3 & Ascii.US];
    }

    private static boolean h(byte b3, byte b10) {
        return (b3 & 247) == 23 && b10 >= 33 && b10 <= 35;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0018. Please report as an issue. */
    private void i(byte b3, byte b10) {
        if (k(b3)) {
            this.f8666w = false;
            return;
        }
        if (j(b3)) {
            if (b10 != 32 && b10 != 47) {
                switch (b10) {
                    default:
                        switch (b10) {
                            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                                break;
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                                this.f8666w = false;
                                return;
                            default:
                                return;
                        }
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        this.f8666w = true;
                }
            }
            this.f8666w = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // com.applovin.impl.y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.ol r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w2.a(com.applovin.impl.ol):void");
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.f8658n = null;
        this.f8659o = null;
        a(0);
        b(4);
        m();
        this.f8662r = false;
        this.f8663s = false;
        this.f8664t = (byte) 0;
        this.u = (byte) 0;
        this.f8665v = 0;
        this.f8666w = true;
        this.f8667x = C.TIME_UNSET;
    }

    @Override // com.applovin.impl.y2
    public kl e() {
        List list = this.f8658n;
        this.f8659o = list;
        return new z2((List) a1.a(list));
    }

    @Override // com.applovin.impl.y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    /* renamed from: g */
    public pl c() {
        pl h10;
        pl c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        if (!n() || (h10 = h()) == null) {
            return null;
        }
        this.f8658n = Collections.emptyList();
        this.f8667x = C.TIME_UNSET;
        h10.a(i(), e(), Long.MAX_VALUE);
        return h10;
    }

    @Override // com.applovin.impl.y2
    public boolean j() {
        return this.f8658n != this.f8659o;
    }

    private static char c(byte b3) {
        return (char) D[b3 & Ascii.US];
    }

    private void f(byte b3) {
        this.f8657m.a(' ');
        this.f8657m.a((b3 >> 1) & 7, (b3 & 1) == 1);
    }

    private static char e(byte b3) {
        return (char) C[b3 & Ascii.SI];
    }

    private void g(byte b3) {
        if (b3 == 32) {
            a(2);
            return;
        }
        if (b3 != 41) {
            switch (b3) {
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    a(1);
                    b(2);
                    return;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    a(1);
                    b(3);
                    return;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    a(1);
                    b(4);
                    return;
                default:
                    int i10 = this.f8660p;
                    if (i10 == 0) {
                        return;
                    }
                    if (b3 != 33) {
                        switch (b3) {
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                                this.f8658n = Collections.emptyList();
                                int i11 = this.f8660p;
                                if (i11 == 1 || i11 == 3) {
                                    m();
                                    return;
                                }
                                return;
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                                if (i10 != 1 || this.f8657m.c()) {
                                    return;
                                }
                                this.f8657m.d();
                                return;
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                                m();
                                return;
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                                this.f8658n = l();
                                m();
                                return;
                            default:
                                return;
                        }
                    }
                    this.f8657m.a();
                    return;
            }
        }
        a(3);
    }

    private boolean l(byte b3) {
        if (h(b3)) {
            this.f8665v = b(b3);
        }
        return this.f8665v == this.f8654j;
    }

    private void b(byte b3, byte b10) {
        int i10 = f8649y[b3 & 7];
        if ((b10 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f8657m.f8670d) {
            if (this.f8660p != 1 && !this.f8657m.c()) {
                a aVar = new a(this.f8660p, this.f8661q);
                this.f8657m = aVar;
                this.f8656l.add(aVar);
            }
            this.f8657m.f8670d = i10;
        }
        boolean z10 = (b10 & Ascii.DLE) == 16;
        boolean z11 = (b10 & 1) == 1;
        int i11 = (b10 >> 1) & 7;
        this.f8657m.a(z10 ? 8 : i11, z11);
        if (z10) {
            this.f8657m.f8671e = f8650z[i11];
        }
    }

    @Override // com.applovin.impl.y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    private void b(int i10) {
        this.f8661q = i10;
        this.f8657m.d(i10);
    }

    private static char a(byte b3) {
        return (char) B[(b3 & Byte.MAX_VALUE) - 32];
    }

    private static char a(byte b3, byte b10) {
        if ((b3 & 1) == 0) {
            return c(b10);
        }
        return d(b10);
    }

    private boolean a(boolean z10, byte b3, byte b10) {
        if (z10 && i(b3)) {
            if (this.f8663s && this.f8664t == b3 && this.u == b10) {
                this.f8663s = false;
                return true;
            }
            this.f8663s = true;
            this.f8664t = b3;
            this.u = b10;
        } else {
            this.f8663s = false;
        }
        return false;
    }

    private void a(int i10) {
        int i11 = this.f8660p;
        if (i11 == i10) {
            return;
        }
        this.f8660p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f8656l.size(); i12++) {
                ((a) this.f8656l.get(i12)).c(i10);
            }
            return;
        }
        m();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f8658n = Collections.emptyList();
        }
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j3) {
        super.a(j3);
    }
}
