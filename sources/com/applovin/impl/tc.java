package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.ej;
import com.applovin.impl.ro;
import com.applovin.impl.w6;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class tc implements i8 {

    /* renamed from: b0 */
    public static final m8 f11367b0 = new A0(14);

    /* renamed from: c0 */
    private static final byte[] f11368c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    private static final byte[] f11369d0 = yp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f11370e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    private static final Map f11371g0;

    /* renamed from: A */
    private long f11372A;

    /* renamed from: B */
    private long f11373B;

    /* renamed from: C */
    private mc f11374C;

    /* renamed from: D */
    private mc f11375D;

    /* renamed from: E */
    private boolean f11376E;

    /* renamed from: F */
    private boolean f11377F;

    /* renamed from: G */
    private int f11378G;

    /* renamed from: H */
    private long f11379H;

    /* renamed from: I */
    private long f11380I;

    /* renamed from: J */
    private int f11381J;

    /* renamed from: K */
    private int f11382K;

    /* renamed from: L */
    private int[] f11383L;

    /* renamed from: M */
    private int f11384M;

    /* renamed from: N */
    private int f11385N;
    private int O;

    /* renamed from: P */
    private int f11386P;

    /* renamed from: Q */
    private boolean f11387Q;

    /* renamed from: R */
    private int f11388R;

    /* renamed from: S */
    private int f11389S;

    /* renamed from: T */
    private int f11390T;

    /* renamed from: U */
    private boolean f11391U;

    /* renamed from: V */
    private boolean f11392V;

    /* renamed from: W */
    private boolean f11393W;

    /* renamed from: X */
    private int f11394X;

    /* renamed from: Y */
    private byte f11395Y;

    /* renamed from: Z */
    private boolean f11396Z;

    /* renamed from: a */
    private final n7 f11397a;

    /* renamed from: a0 */
    private k8 f11398a0;
    private final aq b;

    /* renamed from: c */
    private final SparseArray f11399c;

    /* renamed from: d */
    private final boolean f11400d;

    /* renamed from: e */
    private final yg f11401e;

    /* renamed from: f */
    private final yg f11402f;

    /* renamed from: g */
    private final yg f11403g;

    /* renamed from: h */
    private final yg f11404h;

    /* renamed from: i */
    private final yg f11405i;

    /* renamed from: j */
    private final yg f11406j;

    /* renamed from: k */
    private final yg f11407k;
    private final yg l;
    private final yg m;

    /* renamed from: n */
    private final yg f11408n;

    /* renamed from: o */
    private ByteBuffer f11409o;

    /* renamed from: p */
    private long f11410p;

    /* renamed from: q */
    private long f11411q;

    /* renamed from: r */
    private long f11412r;

    /* renamed from: s */
    private long f11413s;

    /* renamed from: t */
    private long f11414t;

    /* renamed from: u */
    private c f11415u;

    /* renamed from: v */
    private boolean f11416v;

    /* renamed from: w */
    private int f11417w;

    /* renamed from: x */
    private long f11418x;

    /* renamed from: y */
    private boolean f11419y;

    /* renamed from: z */
    private long f11420z;

    /* loaded from: classes.dex */
    public final class b implements m7 {
        private b() {
        }

        @Override // com.applovin.impl.m7
        public void a(int i9, int i10, j8 j8Var) {
            tc.this.a(i9, i10, j8Var);
        }

        @Override // com.applovin.impl.m7
        public int b(int i9) {
            return tc.this.e(i9);
        }

        @Override // com.applovin.impl.m7
        public boolean c(int i9) {
            return tc.this.f(i9);
        }

        public /* synthetic */ b(tc tcVar, a aVar) {
            this();
        }

        @Override // com.applovin.impl.m7
        public void a(int i9) {
            tc.this.c(i9);
        }

        @Override // com.applovin.impl.m7
        public void a(int i9, double d2) {
            tc.this.a(i9, d2);
        }

        @Override // com.applovin.impl.m7
        public void a(int i9, long j7) {
            tc.this.a(i9, j7);
        }

        @Override // com.applovin.impl.m7
        public void a(int i9, long j7, long j9) {
            tc.this.a(i9, j7, j9);
        }

        @Override // com.applovin.impl.m7
        public void a(int i9, String str) {
            tc.this.a(i9, str);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: A */
        public int f11422A;

        /* renamed from: B */
        public int f11423B;

        /* renamed from: C */
        public int f11424C;

        /* renamed from: D */
        public float f11425D;

        /* renamed from: E */
        public float f11426E;

        /* renamed from: F */
        public float f11427F;

        /* renamed from: G */
        public float f11428G;

        /* renamed from: H */
        public float f11429H;

        /* renamed from: I */
        public float f11430I;

        /* renamed from: J */
        public float f11431J;

        /* renamed from: K */
        public float f11432K;

        /* renamed from: L */
        public float f11433L;

        /* renamed from: M */
        public float f11434M;

        /* renamed from: N */
        public byte[] f11435N;
        public int O;

        /* renamed from: P */
        public int f11436P;

        /* renamed from: Q */
        public int f11437Q;

        /* renamed from: R */
        public long f11438R;

        /* renamed from: S */
        public long f11439S;

        /* renamed from: T */
        public d f11440T;

        /* renamed from: U */
        public boolean f11441U;

        /* renamed from: V */
        public boolean f11442V;

        /* renamed from: W */
        private String f11443W;

        /* renamed from: X */
        public ro f11444X;

        /* renamed from: Y */
        public int f11445Y;

        /* renamed from: a */
        public String f11446a;
        public String b;

        /* renamed from: c */
        public int f11447c;

        /* renamed from: d */
        public int f11448d;

        /* renamed from: e */
        public int f11449e;

        /* renamed from: f */
        public int f11450f;

        /* renamed from: g */
        private int f11451g;

        /* renamed from: h */
        public boolean f11452h;

        /* renamed from: i */
        public byte[] f11453i;

        /* renamed from: j */
        public ro.a f11454j;

        /* renamed from: k */
        public byte[] f11455k;
        public w6 l;
        public int m;

        /* renamed from: n */
        public int f11456n;

        /* renamed from: o */
        public int f11457o;

        /* renamed from: p */
        public int f11458p;

        /* renamed from: q */
        public int f11459q;

        /* renamed from: r */
        public int f11460r;

        /* renamed from: s */
        public float f11461s;

        /* renamed from: t */
        public float f11462t;

        /* renamed from: u */
        public float f11463u;

        /* renamed from: v */
        public byte[] f11464v;

        /* renamed from: w */
        public int f11465w;

        /* renamed from: x */
        public boolean f11466x;

        /* renamed from: y */
        public int f11467y;

        /* renamed from: z */
        public int f11468z;

        private c() {
            this.m = -1;
            this.f11456n = -1;
            this.f11457o = -1;
            this.f11458p = -1;
            this.f11459q = 0;
            this.f11460r = -1;
            this.f11461s = 0.0f;
            this.f11462t = 0.0f;
            this.f11463u = 0.0f;
            this.f11464v = null;
            this.f11465w = -1;
            this.f11466x = false;
            this.f11467y = -1;
            this.f11468z = -1;
            this.f11422A = -1;
            this.f11423B = 1000;
            this.f11424C = 200;
            this.f11425D = -1.0f;
            this.f11426E = -1.0f;
            this.f11427F = -1.0f;
            this.f11428G = -1.0f;
            this.f11429H = -1.0f;
            this.f11430I = -1.0f;
            this.f11431J = -1.0f;
            this.f11432K = -1.0f;
            this.f11433L = -1.0f;
            this.f11434M = -1.0f;
            this.O = 1;
            this.f11436P = -1;
            this.f11437Q = 8000;
            this.f11438R = 0L;
            this.f11439S = 0L;
            this.f11442V = true;
            this.f11443W = "eng";
        }

        public void c() {
            d dVar = this.f11440T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void d() {
            d dVar = this.f11440T;
            if (dVar != null) {
                dVar.a();
            }
        }

        private byte[] b() {
            if (this.f11425D == -1.0f || this.f11426E == -1.0f || this.f11427F == -1.0f || this.f11428G == -1.0f || this.f11429H == -1.0f || this.f11430I == -1.0f || this.f11431J == -1.0f || this.f11432K == -1.0f || this.f11433L == -1.0f || this.f11434M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f11425D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11426E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11427F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11428G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11429H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11430I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11431J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f11432K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f11433L + 0.5f));
            order.putShort((short) (this.f11434M + 0.5f));
            order.putShort((short) this.f11423B);
            order.putShort((short) this.f11424C);
            return bArr;
        }

        public void a() {
            AbstractC0669a1.a(this.f11444X);
        }

        private byte[] a(String str) {
            byte[] bArr = this.f11455k;
            if (bArr != null) {
                return bArr;
            }
            throw ah.a("Missing CodecPrivate for codec " + str, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x01cf. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:13:0x03f7  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x040c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x041b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0534  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x042d  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x040e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.applovin.impl.k8 r21, int r22) {
            /*
                Method dump skipped, instructions count: 1604
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.c.a(com.applovin.impl.k8, int):void");
        }

        private static boolean b(yg ygVar) {
            try {
                int r9 = ygVar.r();
                if (r9 == 1) {
                    return true;
                }
                if (r9 != 65534) {
                    return false;
                }
                ygVar.f(24);
                if (ygVar.s() == tc.f0.getMostSignificantBits()) {
                    if (ygVar.s() == tc.f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing MS/ACM codec private", null);
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        private static Pair a(yg ygVar) {
            try {
                ygVar.g(16);
                long p2 = ygVar.p();
                if (p2 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (p2 == 859189832) {
                    return new Pair(MimeTypes.VIDEO_H263, null);
                }
                if (p2 == 826496599) {
                    byte[] c9 = ygVar.c();
                    for (int d2 = ygVar.d() + 20; d2 < c9.length - 4; d2++) {
                        if (c9[d2] == 0 && c9[d2 + 1] == 0 && c9[d2 + 2] == 1 && c9[d2 + 3] == 15) {
                            return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(c9, d2, c9.length)));
                        }
                    }
                    throw ah.a("Failed to find FourCC VC1 initialization data", null);
                }
                kc.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing FourCC private data", null);
            }
        }

        private static List a(byte[] bArr) {
            int i9;
            int i10;
            try {
                if (bArr[0] == 2) {
                    int i11 = 0;
                    int i12 = 1;
                    while (true) {
                        i9 = bArr[i12] & 255;
                        if (i9 != 255) {
                            break;
                        }
                        i11 += 255;
                        i12++;
                    }
                    int i13 = i12 + 1;
                    int i14 = i11 + i9;
                    int i15 = 0;
                    while (true) {
                        i10 = bArr[i13] & 255;
                        if (i10 != 255) {
                            break;
                        }
                        i15 += 255;
                        i13++;
                    }
                    int i16 = i13 + 1;
                    int i17 = i15 + i10;
                    if (bArr[i16] == 1) {
                        byte[] bArr2 = new byte[i14];
                        System.arraycopy(bArr, i16, bArr2, 0, i14);
                        int i18 = i16 + i14;
                        if (bArr[i18] == 3) {
                            int i19 = i18 + i17;
                            if (bArr[i19] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i19];
                                System.arraycopy(bArr, i19, bArr3, 0, bArr.length - i19);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw ah.a("Error parsing vorbis codec private", null);
                        }
                        throw ah.a("Error parsing vorbis codec private", null);
                    }
                    throw ah.a("Error parsing vorbis codec private", null);
                }
                throw ah.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing vorbis codec private", null);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        L.q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        L.q(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11371g0 = Collections.unmodifiableMap(hashMap);
    }

    public tc() {
        this(0);
    }

    private void b(int i9) {
        if (this.f11415u != null) {
            return;
        }
        throw ah.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    private c d(int i9) {
        b(i9);
        return this.f11415u;
    }

    public static /* synthetic */ i8[] g() {
        return new i8[]{new tc()};
    }

    private void h() {
        this.f11388R = 0;
        this.f11389S = 0;
        this.f11390T = 0;
        this.f11391U = false;
        this.f11392V = false;
        this.f11393W = false;
        this.f11394X = 0;
        this.f11395Y = (byte) 0;
        this.f11396Z = false;
        this.f11406j.d(0);
    }

    @Override // com.applovin.impl.i8
    public final void a() {
    }

    public void c(int i9) {
        e();
        if (i9 == 160) {
            if (this.f11378G != 2) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f11382K; i11++) {
                i10 += this.f11383L[i11];
            }
            c cVar = (c) this.f11399c.get(this.f11384M);
            cVar.a();
            for (int i12 = 0; i12 < this.f11382K; i12++) {
                long j7 = ((cVar.f11449e * i12) / 1000) + this.f11379H;
                int i13 = this.O;
                if (i12 == 0 && !this.f11387Q) {
                    i13 |= 1;
                }
                int i14 = this.f11383L[i12];
                i10 -= i14;
                a(cVar, j7, i13, i14, i10);
            }
            this.f11378G = 0;
            return;
        }
        if (i9 == 174) {
            c cVar2 = (c) AbstractC0669a1.b(this.f11415u);
            String str = cVar2.b;
            if (str != null) {
                if (a(str)) {
                    cVar2.a(this.f11398a0, cVar2.f11447c);
                    this.f11399c.put(cVar2.f11447c, cVar2);
                }
                this.f11415u = null;
                return;
            }
            throw ah.a("CodecId is missing in TrackEntry element", null);
        }
        if (i9 == 19899) {
            int i15 = this.f11417w;
            if (i15 != -1) {
                long j9 = this.f11418x;
                if (j9 != -1) {
                    if (i15 == 475249515) {
                        this.f11420z = j9;
                        return;
                    }
                    return;
                }
            }
            throw ah.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i9 == 25152) {
            b(i9);
            c cVar3 = this.f11415u;
            if (cVar3.f11452h) {
                if (cVar3.f11454j != null) {
                    cVar3.l = new w6(new w6.b(AbstractC0744r2.f10444a, MimeTypes.VIDEO_WEBM, this.f11415u.f11454j.b));
                    return;
                }
                throw ah.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i9 == 28032) {
            b(i9);
            c cVar4 = this.f11415u;
            if (cVar4.f11452h && cVar4.f11453i != null) {
                throw ah.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i9 == 357149030) {
            if (this.f11412r == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.f11412r = 1000000L;
            }
            long j10 = this.f11413s;
            if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.f11414t = a(j10);
                return;
            }
            return;
        }
        if (i9 == 374648427) {
            if (this.f11399c.size() != 0) {
                this.f11398a0.c();
                return;
            }
            throw ah.a("No valid tracks were found", null);
        }
        if (i9 != 475249515) {
            return;
        }
        if (!this.f11416v) {
            this.f11398a0.a(a(this.f11374C, this.f11375D));
            this.f11416v = true;
        }
        this.f11374C = null;
        this.f11375D = null;
    }

    public int e(int i9) {
        switch (i9) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public boolean f(int i9) {
        return i9 == 357149030 || i9 == 524531317 || i9 == 475249515 || i9 == 374648427;
    }

    public tc(int i9) {
        this(new y5(), i9);
    }

    private void a(int i9) {
        if (this.f11374C == null || this.f11375D == null) {
            throw ah.a("Element " + i9 + " must be in a Cues", null);
        }
    }

    private void e() {
        AbstractC0669a1.b(this.f11398a0);
    }

    private int f() {
        int i9 = this.f11389S;
        h();
        return i9;
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private final byte[] f11469a = new byte[10];
        private boolean b;

        /* renamed from: c */
        private int f11470c;

        /* renamed from: d */
        private long f11471d;

        /* renamed from: e */
        private int f11472e;

        /* renamed from: f */
        private int f11473f;

        /* renamed from: g */
        private int f11474g;

        public void a(c cVar) {
            if (this.f11470c > 0) {
                cVar.f11444X.a(this.f11471d, this.f11472e, this.f11473f, this.f11474g, cVar.f11454j);
                this.f11470c = 0;
            }
        }

        public void a() {
            this.b = false;
            this.f11470c = 0;
        }

        public void a(c cVar, long j7, int i9, int i10, int i11) {
            if (this.b) {
                int i12 = this.f11470c;
                int i13 = i12 + 1;
                this.f11470c = i13;
                if (i12 == 0) {
                    this.f11471d = j7;
                    this.f11472e = i9;
                    this.f11473f = 0;
                }
                this.f11473f += i10;
                this.f11474g = i11;
                if (i13 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(j8 j8Var) {
            if (this.b) {
                return;
            }
            j8Var.c(this.f11469a, 0, 10);
            j8Var.b();
            if (AbstractC0714k.b(this.f11469a) == 0) {
                return;
            }
            this.b = true;
        }
    }

    public tc(n7 n7Var, int i9) {
        this.f11411q = -1L;
        this.f11412r = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11413s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11414t = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11420z = -1L;
        this.f11372A = -1L;
        this.f11373B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11397a = n7Var;
        n7Var.a(new b());
        this.f11400d = (i9 & 1) == 0;
        this.b = new aq();
        this.f11399c = new SparseArray();
        this.f11403g = new yg(4);
        this.f11404h = new yg(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11405i = new yg(4);
        this.f11401e = new yg(uf.f11591a);
        this.f11402f = new yg(4);
        this.f11406j = new yg();
        this.f11407k = new yg();
        this.l = new yg(8);
        this.m = new yg();
        this.f11408n = new yg();
        this.f11383L = new int[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0229, code lost:
    
        throw com.applovin.impl.ah.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r20, int r21, com.applovin.impl.j8 r22) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.a(int, int, com.applovin.impl.j8):void");
    }

    private ej a(mc mcVar, mc mcVar2) {
        int i9;
        if (this.f11411q != -1 && this.f11414t != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && mcVar != null && mcVar.a() != 0 && mcVar2 != null && mcVar2.a() == mcVar.a()) {
            int a6 = mcVar.a();
            int[] iArr = new int[a6];
            long[] jArr = new long[a6];
            long[] jArr2 = new long[a6];
            long[] jArr3 = new long[a6];
            int i10 = 0;
            for (int i11 = 0; i11 < a6; i11++) {
                jArr3[i11] = mcVar.a(i11);
                jArr[i11] = mcVar2.a(i11) + this.f11411q;
            }
            while (true) {
                i9 = a6 - 1;
                if (i10 >= i9) {
                    break;
                }
                int i12 = i10 + 1;
                iArr[i10] = (int) (jArr[i12] - jArr[i10]);
                jArr2[i10] = jArr3[i12] - jArr3[i10];
                i10 = i12;
            }
            iArr[i9] = (int) ((this.f11411q + this.f11410p) - jArr[i9]);
            long j7 = this.f11414t - jArr3[i9];
            jArr2[i9] = j7;
            if (j7 <= 0) {
                kc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j7);
                iArr = Arrays.copyOf(iArr, i9);
                jArr = Arrays.copyOf(jArr, i9);
                jArr2 = Arrays.copyOf(jArr2, i9);
                jArr3 = Arrays.copyOf(jArr3, i9);
            }
            return new C0691e3(iArr, jArr, jArr2, jArr3);
        }
        return new ej.b(this.f11414t);
    }

    private void a(c cVar, long j7, int i9, int i10, int i11) {
        d dVar = cVar.f11440T;
        if (dVar != null) {
            dVar.a(cVar, j7, i9, i10, i11);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b)) {
                if (this.f11382K > 1) {
                    kc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j9 = this.f11380I;
                    if (j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        kc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.b, j9, this.f11407k.c());
                        int d2 = this.f11407k.d();
                        while (true) {
                            if (d2 >= this.f11407k.e()) {
                                break;
                            }
                            if (this.f11407k.c()[d2] == 0) {
                                this.f11407k.e(d2);
                                break;
                            }
                            d2++;
                        }
                        ro roVar = cVar.f11444X;
                        yg ygVar = this.f11407k;
                        roVar.a(ygVar, ygVar.e());
                        i10 += this.f11407k.e();
                    }
                }
            }
            if ((268435456 & i9) != 0) {
                if (this.f11382K > 1) {
                    i9 &= -268435457;
                } else {
                    int e4 = this.f11408n.e();
                    cVar.f11444X.a(this.f11408n, e4, 2);
                    i10 += e4;
                }
            }
            cVar.f11444X.a(j7, i9, i10, i11, cVar.f11454j);
        }
        this.f11377F = true;
    }

    private static int[] a(int[] iArr, int i9) {
        if (iArr == null) {
            return new int[i9];
        }
        return iArr.length >= i9 ? iArr : new int[Math.max(iArr.length * 2, i9)];
    }

    public void a(int i9, double d2) {
        if (i9 == 181) {
            d(i9).f11437Q = (int) d2;
            return;
        }
        if (i9 != 17545) {
            switch (i9) {
                case 21969:
                    d(i9).f11425D = (float) d2;
                    return;
                case 21970:
                    d(i9).f11426E = (float) d2;
                    return;
                case 21971:
                    d(i9).f11427F = (float) d2;
                    return;
                case 21972:
                    d(i9).f11428G = (float) d2;
                    return;
                case 21973:
                    d(i9).f11429H = (float) d2;
                    return;
                case 21974:
                    d(i9).f11430I = (float) d2;
                    return;
                case 21975:
                    d(i9).f11431J = (float) d2;
                    return;
                case 21976:
                    d(i9).f11432K = (float) d2;
                    return;
                case 21977:
                    d(i9).f11433L = (float) d2;
                    return;
                case 21978:
                    d(i9).f11434M = (float) d2;
                    return;
                default:
                    switch (i9) {
                        case 30323:
                            d(i9).f11461s = (float) d2;
                            return;
                        case 30324:
                            d(i9).f11462t = (float) d2;
                            return;
                        case 30325:
                            d(i9).f11463u = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        }
        this.f11413s = (long) d2;
    }

    private static byte[] a(long j7, String str, long j9) {
        AbstractC0669a1.a(j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        int i9 = (int) (j7 / 3600000000L);
        long j10 = j7 - ((i9 * 3600) * 1000000);
        int i10 = (int) (j10 / 60000000);
        long j11 = j10 - ((i10 * 60) * 1000000);
        int i11 = (int) (j11 / 1000000);
        return yp.c(String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j11 - (i11 * 1000000)) / j9))));
    }

    public void a(c cVar, j8 j8Var, int i9) {
        if (cVar.f11451g != 1685485123 && cVar.f11451g != 1685480259) {
            j8Var.a(i9);
            return;
        }
        byte[] bArr = new byte[i9];
        cVar.f11435N = bArr;
        j8Var.d(bArr, 0, i9);
    }

    public void a(c cVar, int i9, j8 j8Var, int i10) {
        if (i9 == 4 && "V_VP9".equals(cVar.b)) {
            this.f11408n.d(i10);
            j8Var.d(this.f11408n.c(), 0, i10);
        } else {
            j8Var.a(i10);
        }
    }

    @Override // com.applovin.impl.i8
    public final void a(k8 k8Var) {
        this.f11398a0 = k8Var;
    }

    public void a(int i9, long j7) {
        if (i9 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw ah.a("ContentEncodingOrder " + j7 + " not supported", null);
        }
        if (i9 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw ah.a("ContentEncodingScope " + j7 + " not supported", null);
        }
        switch (i9) {
            case 131:
                d(i9).f11448d = (int) j7;
                return;
            case 136:
                d(i9).f11442V = j7 == 1;
                return;
            case 155:
                this.f11380I = a(j7);
                return;
            case 159:
                d(i9).O = (int) j7;
                return;
            case 176:
                d(i9).m = (int) j7;
                return;
            case 179:
                a(i9);
                this.f11374C.a(a(j7));
                return;
            case 186:
                d(i9).f11456n = (int) j7;
                return;
            case 215:
                d(i9).f11447c = (int) j7;
                return;
            case 231:
                this.f11373B = a(j7);
                return;
            case 238:
                this.f11386P = (int) j7;
                return;
            case 241:
                if (this.f11376E) {
                    return;
                }
                a(i9);
                this.f11375D.a(j7);
                this.f11376E = true;
                return;
            case 251:
                this.f11387Q = true;
                return;
            case 16871:
                d(i9).f11451g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw ah.a("ContentCompAlgo " + j7 + " not supported", null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw ah.a("DocTypeReadVersion " + j7 + " not supported", null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw ah.a("EBMLReadVersion " + j7 + " not supported", null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw ah.a("ContentEncAlgo " + j7 + " not supported", null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw ah.a("AESSettingsCipherMode " + j7 + " not supported", null);
            case 21420:
                this.f11418x = j7 + this.f11411q;
                return;
            case 21432:
                int i10 = (int) j7;
                b(i9);
                if (i10 == 0) {
                    this.f11415u.f11465w = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f11415u.f11465w = 2;
                    return;
                } else if (i10 == 3) {
                    this.f11415u.f11465w = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.f11415u.f11465w = 3;
                    return;
                }
            case 21680:
                d(i9).f11457o = (int) j7;
                return;
            case 21682:
                d(i9).f11459q = (int) j7;
                return;
            case 21690:
                d(i9).f11458p = (int) j7;
                return;
            case 21930:
                d(i9).f11441U = j7 == 1;
                return;
            case 21998:
                d(i9).f11450f = (int) j7;
                return;
            case 22186:
                d(i9).f11438R = j7;
                return;
            case 22203:
                d(i9).f11439S = j7;
                return;
            case 25188:
                d(i9).f11436P = (int) j7;
                return;
            case 30321:
                b(i9);
                int i11 = (int) j7;
                if (i11 == 0) {
                    this.f11415u.f11460r = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f11415u.f11460r = 1;
                    return;
                } else if (i11 == 2) {
                    this.f11415u.f11460r = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f11415u.f11460r = 3;
                    return;
                }
            case 2352003:
                d(i9).f11449e = (int) j7;
                return;
            case 2807729:
                this.f11412r = j7;
                return;
            default:
                switch (i9) {
                    case 21945:
                        b(i9);
                        int i12 = (int) j7;
                        if (i12 == 1) {
                            this.f11415u.f11422A = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.f11415u.f11422A = 1;
                            return;
                        }
                    case 21946:
                        b(i9);
                        int b8 = p3.b((int) j7);
                        if (b8 != -1) {
                            this.f11415u.f11468z = b8;
                            return;
                        }
                        return;
                    case 21947:
                        b(i9);
                        this.f11415u.f11466x = true;
                        int a6 = p3.a((int) j7);
                        if (a6 != -1) {
                            this.f11415u.f11467y = a6;
                            return;
                        }
                        return;
                    case 21948:
                        d(i9).f11423B = (int) j7;
                        return;
                    case 21949:
                        d(i9).f11424C = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean a(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c9 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c9 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c9 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c9 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c9 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c9 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c9 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c9 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c9 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c9 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c9 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c9 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c9 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c9 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c9 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c9 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c9 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c9 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c9 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c9 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c9 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c9 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c9 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c9 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c9 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c9 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c9 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c9 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c9 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c9 = 31;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case AD_PLAY_RESET_ON_DEINIT_VALUE:
            case 31:
                return true;
            default:
                return false;
        }
    }

    private boolean a(qh qhVar, long j7) {
        if (this.f11419y) {
            this.f11372A = j7;
            qhVar.f10346a = this.f11420z;
            this.f11419y = false;
            return true;
        }
        if (this.f11416v) {
            long j9 = this.f11372A;
            if (j9 != -1) {
                qhVar.f10346a = j9;
                this.f11372A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public final int a(j8 j8Var, qh qhVar) {
        this.f11377F = false;
        boolean z8 = true;
        while (z8 && !this.f11377F) {
            z8 = this.f11397a.a(j8Var);
            if (z8 && a(qhVar, j8Var.f())) {
                return 1;
            }
        }
        if (z8) {
            return 0;
        }
        for (int i9 = 0; i9 < this.f11399c.size(); i9++) {
            c cVar = (c) this.f11399c.valueAt(i9);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(j8 j8Var, int i9) {
        if (this.f11403g.e() >= i9) {
            return;
        }
        if (this.f11403g.b() < i9) {
            yg ygVar = this.f11403g;
            ygVar.a(Math.max(ygVar.b() * 2, i9));
        }
        j8Var.d(this.f11403g.c(), this.f11403g.e(), i9 - this.f11403g.e());
        this.f11403g.e(i9);
    }

    private long a(long j7) {
        long j9 = this.f11412r;
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return yp.c(j7, j9, 1000L);
        }
        throw ah.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f11373B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f11378G = 0;
        this.f11397a.reset();
        this.b.b();
        h();
        for (int i9 = 0; i9 < this.f11399c.size(); i9++) {
            ((c) this.f11399c.valueAt(i9)).d();
        }
    }

    private static void a(String str, long j7, byte[] bArr) {
        byte[] a6;
        int i9;
        str.getClass();
        if (str.equals("S_TEXT/ASS")) {
            a6 = a(j7, "%01d:%02d:%02d:%02d", 10000L);
            i9 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            a6 = a(j7, "%02d:%02d:%02d,%03d", 1000L);
            i9 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(a6, 0, bArr, i9, a6.length);
    }

    public void a(int i9, long j7, long j9) {
        e();
        if (i9 == 160) {
            this.f11387Q = false;
            return;
        }
        if (i9 == 174) {
            this.f11415u = new c();
            return;
        }
        if (i9 == 187) {
            this.f11376E = false;
            return;
        }
        if (i9 == 19899) {
            this.f11417w = -1;
            this.f11418x = -1L;
            return;
        }
        if (i9 == 20533) {
            d(i9).f11452h = true;
            return;
        }
        if (i9 == 21968) {
            d(i9).f11466x = true;
            return;
        }
        if (i9 == 408125543) {
            long j10 = this.f11411q;
            if (j10 != -1 && j10 != j7) {
                throw ah.a("Multiple Segment elements not supported", null);
            }
            this.f11411q = j7;
            this.f11410p = j9;
            return;
        }
        if (i9 != 475249515) {
            if (i9 == 524531317 && !this.f11416v) {
                if (this.f11400d && this.f11420z != -1) {
                    this.f11419y = true;
                    return;
                } else {
                    this.f11398a0.a(new ej.b(this.f11414t));
                    this.f11416v = true;
                    return;
                }
            }
            return;
        }
        this.f11374C = new mc();
        this.f11375D = new mc();
    }

    public void a(int i9, String str) {
        if (i9 == 134) {
            d(i9).b = str;
            return;
        }
        if (i9 != 17026) {
            if (i9 == 21358) {
                d(i9).f11446a = str;
                return;
            } else {
                if (i9 != 2274716) {
                    return;
                }
                d(i9).f11443W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ah.a("DocType " + str + " not supported", null);
    }

    private int a(j8 j8Var, c cVar, int i9) {
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            a(j8Var, f11368c0, i9);
            return f();
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            a(j8Var, f11370e0, i9);
            return f();
        }
        ro roVar = cVar.f11444X;
        if (!this.f11391U) {
            if (cVar.f11452h) {
                this.O &= -1073741825;
                if (!this.f11392V) {
                    j8Var.d(this.f11403g.c(), 0, 1);
                    this.f11388R++;
                    if ((this.f11403g.c()[0] & 128) != 128) {
                        this.f11395Y = this.f11403g.c()[0];
                        this.f11392V = true;
                    } else {
                        throw ah.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b8 = this.f11395Y;
                if ((b8 & 1) == 1) {
                    boolean z8 = (b8 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f11396Z) {
                        j8Var.d(this.l.c(), 0, 8);
                        this.f11388R += 8;
                        this.f11396Z = true;
                        this.f11403g.c()[0] = (byte) ((z8 ? 128 : 0) | 8);
                        this.f11403g.f(0);
                        roVar.a(this.f11403g, 1, 1);
                        this.f11389S++;
                        this.l.f(0);
                        roVar.a(this.l, 8, 1);
                        this.f11389S += 8;
                    }
                    if (z8) {
                        if (!this.f11393W) {
                            j8Var.d(this.f11403g.c(), 0, 1);
                            this.f11388R++;
                            this.f11403g.f(0);
                            this.f11394X = this.f11403g.w();
                            this.f11393W = true;
                        }
                        int i11 = this.f11394X * 4;
                        this.f11403g.d(i11);
                        j8Var.d(this.f11403g.c(), 0, i11);
                        this.f11388R += i11;
                        short s5 = (short) ((this.f11394X / 2) + 1);
                        int i12 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f11409o;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f11409o = ByteBuffer.allocate(i12);
                        }
                        this.f11409o.position(0);
                        this.f11409o.putShort(s5);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i10 = this.f11394X;
                            if (i13 >= i10) {
                                break;
                            }
                            int A8 = this.f11403g.A();
                            if (i13 % 2 == 0) {
                                this.f11409o.putShort((short) (A8 - i14));
                            } else {
                                this.f11409o.putInt(A8 - i14);
                            }
                            i13++;
                            i14 = A8;
                        }
                        int i15 = (i9 - this.f11388R) - i14;
                        if (i10 % 2 == 1) {
                            this.f11409o.putInt(i15);
                        } else {
                            this.f11409o.putShort((short) i15);
                            this.f11409o.putInt(0);
                        }
                        this.m.a(this.f11409o.array(), i12);
                        roVar.a(this.m, i12, 1);
                        this.f11389S += i12;
                    }
                }
            } else {
                byte[] bArr = cVar.f11453i;
                if (bArr != null) {
                    this.f11406j.a(bArr, bArr.length);
                }
            }
            if (cVar.f11450f > 0) {
                this.O |= 268435456;
                this.f11408n.d(0);
                this.f11403g.d(4);
                this.f11403g.c()[0] = (byte) ((i9 >> 24) & 255);
                this.f11403g.c()[1] = (byte) ((i9 >> 16) & 255);
                this.f11403g.c()[2] = (byte) ((i9 >> 8) & 255);
                this.f11403g.c()[3] = (byte) (i9 & 255);
                roVar.a(this.f11403g, 4, 2);
                this.f11389S += 4;
            }
            this.f11391U = true;
        }
        int e4 = this.f11406j.e() + i9;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.f11440T != null) {
                AbstractC0669a1.b(this.f11406j.e() == 0);
                cVar.f11440T.a(j8Var);
            }
            while (true) {
                int i16 = this.f11388R;
                if (i16 >= e4) {
                    break;
                }
                int a6 = a(j8Var, roVar, e4 - i16);
                this.f11388R += a6;
                this.f11389S += a6;
            }
        } else {
            byte[] c9 = this.f11402f.c();
            c9[0] = 0;
            c9[1] = 0;
            c9[2] = 0;
            int i17 = cVar.f11445Y;
            int i18 = 4 - i17;
            while (this.f11388R < e4) {
                int i19 = this.f11390T;
                if (i19 == 0) {
                    a(j8Var, c9, i18, i17);
                    this.f11388R += i17;
                    this.f11402f.f(0);
                    this.f11390T = this.f11402f.A();
                    this.f11401e.f(0);
                    roVar.a(this.f11401e, 4);
                    this.f11389S += 4;
                } else {
                    int a9 = a(j8Var, roVar, i19);
                    this.f11388R += a9;
                    this.f11389S += a9;
                    this.f11390T -= a9;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            this.f11404h.f(0);
            roVar.a(this.f11404h, 4);
            this.f11389S += 4;
        }
        return f();
    }

    private void a(j8 j8Var, byte[] bArr, int i9) {
        int length = bArr.length + i9;
        if (this.f11407k.b() < length) {
            this.f11407k.a(Arrays.copyOf(bArr, length + i9));
        } else {
            System.arraycopy(bArr, 0, this.f11407k.c(), 0, bArr.length);
        }
        j8Var.d(this.f11407k.c(), bArr.length, i9);
        this.f11407k.f(0);
        this.f11407k.e(length);
    }

    private int a(j8 j8Var, ro roVar, int i9) {
        int a6 = this.f11406j.a();
        if (a6 > 0) {
            int min = Math.min(i9, a6);
            roVar.a(this.f11406j, min);
            return min;
        }
        return roVar.a((e5) j8Var, i9, false);
    }

    private void a(j8 j8Var, byte[] bArr, int i9, int i10) {
        int min = Math.min(i10, this.f11406j.a());
        j8Var.d(bArr, i9 + min, i10 - min);
        if (min > 0) {
            this.f11406j.a(bArr, i9, min);
        }
    }

    @Override // com.applovin.impl.i8
    public final boolean a(j8 j8Var) {
        return new jk().b(j8Var);
    }
}
