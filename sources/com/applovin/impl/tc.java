package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.ej;
import com.applovin.impl.ro;
import com.applovin.impl.w6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public class tc implements i8 {

    /* renamed from: b0 */
    public static final m8 f8199b0 = new ht(14);

    /* renamed from: c0 */
    private static final byte[] f8200c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    private static final byte[] f8201d0 = yp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f8202e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0 */
    private static final UUID f8203f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    private static final Map f8204g0;
    private long A;
    private long B;
    private mc C;
    private mc D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;
    private final n7 a;

    /* renamed from: a0 */
    private k8 f8205a0;

    /* renamed from: b */
    private final aq f8206b;

    /* renamed from: c */
    private final SparseArray f8207c;

    /* renamed from: d */
    private final boolean f8208d;

    /* renamed from: e */
    private final yg f8209e;

    /* renamed from: f */
    private final yg f8210f;

    /* renamed from: g */
    private final yg f8211g;

    /* renamed from: h */
    private final yg f8212h;

    /* renamed from: i */
    private final yg f8213i;

    /* renamed from: j */
    private final yg f8214j;

    /* renamed from: k */
    private final yg f8215k;

    /* renamed from: l */
    private final yg f8216l;

    /* renamed from: m */
    private final yg f8217m;

    /* renamed from: n */
    private final yg f8218n;

    /* renamed from: o */
    private ByteBuffer f8219o;

    /* renamed from: p */
    private long f8220p;

    /* renamed from: q */
    private long f8221q;

    /* renamed from: r */
    private long f8222r;

    /* renamed from: s */
    private long f8223s;

    /* renamed from: t */
    private long f8224t;
    private c u;

    /* renamed from: v */
    private boolean f8225v;

    /* renamed from: w */
    private int f8226w;

    /* renamed from: x */
    private long f8227x;

    /* renamed from: y */
    private boolean f8228y;

    /* renamed from: z */
    private long f8229z;

    /* loaded from: classes.dex */
    public final class b implements m7 {
        private b() {
        }

        @Override // com.applovin.impl.m7
        public void a(int i10, int i11, j8 j8Var) {
            tc.this.a(i10, i11, j8Var);
        }

        @Override // com.applovin.impl.m7
        public int b(int i10) {
            return tc.this.e(i10);
        }

        @Override // com.applovin.impl.m7
        public boolean c(int i10) {
            return tc.this.f(i10);
        }

        public /* synthetic */ b(tc tcVar, a aVar) {
            this();
        }

        @Override // com.applovin.impl.m7
        public void a(int i10) {
            tc.this.c(i10);
        }

        @Override // com.applovin.impl.m7
        public void a(int i10, double d10) {
            tc.this.a(i10, d10);
        }

        @Override // com.applovin.impl.m7
        public void a(int i10, long j3) {
            tc.this.a(i10, j3);
        }

        @Override // com.applovin.impl.m7
        public void a(int i10, long j3, long j10) {
            tc.this.a(i10, j3, j10);
        }

        @Override // com.applovin.impl.m7
        public void a(int i10, String str) {
            tc.this.a(i10, str);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        private String W;
        public ro X;
        public int Y;
        public String a;

        /* renamed from: b */
        public String f8230b;

        /* renamed from: c */
        public int f8231c;

        /* renamed from: d */
        public int f8232d;

        /* renamed from: e */
        public int f8233e;

        /* renamed from: f */
        public int f8234f;

        /* renamed from: g */
        private int f8235g;

        /* renamed from: h */
        public boolean f8236h;

        /* renamed from: i */
        public byte[] f8237i;

        /* renamed from: j */
        public ro.a f8238j;

        /* renamed from: k */
        public byte[] f8239k;

        /* renamed from: l */
        public w6 f8240l;

        /* renamed from: m */
        public int f8241m;

        /* renamed from: n */
        public int f8242n;

        /* renamed from: o */
        public int f8243o;

        /* renamed from: p */
        public int f8244p;

        /* renamed from: q */
        public int f8245q;

        /* renamed from: r */
        public int f8246r;

        /* renamed from: s */
        public float f8247s;

        /* renamed from: t */
        public float f8248t;
        public float u;

        /* renamed from: v */
        public byte[] f8249v;

        /* renamed from: w */
        public int f8250w;

        /* renamed from: x */
        public boolean f8251x;

        /* renamed from: y */
        public int f8252y;

        /* renamed from: z */
        public int f8253z;

        private c() {
            this.f8241m = -1;
            this.f8242n = -1;
            this.f8243o = -1;
            this.f8244p = -1;
            this.f8245q = 0;
            this.f8246r = -1;
            this.f8247s = 0.0f;
            this.f8248t = 0.0f;
            this.u = 0.0f;
            this.f8249v = null;
            this.f8250w = -1;
            this.f8251x = false;
            this.f8252y = -1;
            this.f8253z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        public void c() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void d() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a();
            }
        }

        private byte[] b() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        public void a() {
            a1.a(this.X);
        }

        private byte[] a(String str) {
            byte[] bArr = this.f8239k;
            if (bArr != null) {
                return bArr;
            }
            throw ah.a("Missing CodecPrivate for codec " + str, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01cf. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0416  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x042b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0552  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x044c  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x042d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.applovin.impl.k8 r21, int r22) {
            /*
                Method dump skipped, instructions count: 1634
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.c.a(com.applovin.impl.k8, int):void");
        }

        private static boolean b(yg ygVar) {
            try {
                int r6 = ygVar.r();
                if (r6 == 1) {
                    return true;
                }
                if (r6 != 65534) {
                    return false;
                }
                ygVar.f(24);
                if (ygVar.s() == tc.f8203f0.getMostSignificantBits()) {
                    if (ygVar.s() == tc.f8203f0.getLeastSignificantBits()) {
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
                long p10 = ygVar.p();
                if (p10 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (p10 == 859189832) {
                    return new Pair(MimeTypes.VIDEO_H263, null);
                }
                if (p10 == 826496599) {
                    byte[] c10 = ygVar.c();
                    for (int d10 = ygVar.d() + 20; d10 < c10.length - 4; d10++) {
                        if (c10[d10] == 0 && c10[d10 + 1] == 0 && c10[d10 + 2] == 1 && c10[d10 + 3] == 15) {
                            return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(c10, d10, c10.length)));
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
            int i10;
            int i11;
            try {
                if (bArr[0] == 2) {
                    int i12 = 0;
                    int i13 = 1;
                    while (true) {
                        i10 = bArr[i13] & 255;
                        if (i10 != 255) {
                            break;
                        }
                        i12 += 255;
                        i13++;
                    }
                    int i14 = i13 + 1;
                    int i15 = i12 + i10;
                    int i16 = 0;
                    while (true) {
                        i11 = bArr[i14] & 255;
                        if (i11 != 255) {
                            break;
                        }
                        i16 += 255;
                        i14++;
                    }
                    int i17 = i14 + 1;
                    int i18 = i16 + i11;
                    if (bArr[i17] == 1) {
                        byte[] bArr2 = new byte[i15];
                        System.arraycopy(bArr, i17, bArr2, 0, i15);
                        int i19 = i17 + i15;
                        if (bArr[i19] == 3) {
                            int i20 = i19 + i18;
                            if (bArr[i20] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i20];
                                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
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
        com.applovin.impl.mediation.ads.e.l(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f8204g0 = Collections.unmodifiableMap(hashMap);
    }

    public tc() {
        this(0);
    }

    private void b(int i10) {
        if (this.u != null) {
            return;
        }
        throw ah.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private c d(int i10) {
        b(i10);
        return this.u;
    }

    public static /* synthetic */ i8[] g() {
        return new i8[]{new tc()};
    }

    private void h() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f8214j.d(0);
    }

    public static /* synthetic */ i8[] i() {
        return g();
    }

    @Override // com.applovin.impl.i8
    public final void a() {
    }

    public void c(int i10) {
        e();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            c cVar = (c) this.f8207c.get(this.M);
            cVar.a();
            for (int i13 = 0; i13 < this.K; i13++) {
                long j3 = ((cVar.f8233e * i13) / 1000) + this.H;
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                i11 -= i15;
                a(cVar, j3, i14, i15, i11);
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) a1.b(this.u);
            String str = cVar2.f8230b;
            if (str != null) {
                if (a(str)) {
                    cVar2.a(this.f8205a0, cVar2.f8231c);
                    this.f8207c.put(cVar2.f8231c, cVar2);
                }
                this.u = null;
                return;
            }
            throw ah.a("CodecId is missing in TrackEntry element", null);
        }
        if (i10 == 19899) {
            int i16 = this.f8226w;
            if (i16 != -1) {
                long j10 = this.f8227x;
                if (j10 != -1) {
                    if (i16 == 475249515) {
                        this.f8229z = j10;
                        return;
                    }
                    return;
                }
            }
            throw ah.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            b(i10);
            c cVar3 = this.u;
            if (cVar3.f8236h) {
                if (cVar3.f8238j != null) {
                    cVar3.f8240l = new w6(new w6.b(r2.a, MimeTypes.VIDEO_WEBM, this.u.f8238j.f7386b));
                    return;
                }
                throw ah.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i10 == 28032) {
            b(i10);
            c cVar4 = this.u;
            if (cVar4.f8236h && cVar4.f8237i != null) {
                throw ah.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f8222r == C.TIME_UNSET) {
                this.f8222r = 1000000L;
            }
            long j11 = this.f8223s;
            if (j11 != C.TIME_UNSET) {
                this.f8224t = a(j11);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f8207c.size() != 0) {
                this.f8205a0.c();
                return;
            }
            throw ah.a("No valid tracks were found", null);
        }
        if (i10 != 475249515) {
            return;
        }
        if (!this.f8225v) {
            this.f8205a0.a(a(this.C, this.D));
            this.f8225v = true;
        }
        this.C = null;
        this.D = null;
    }

    public int e(int i10) {
        switch (i10) {
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

    public boolean f(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public tc(int i10) {
        this(new y5(), i10);
    }

    private void a(int i10) {
        if (this.C == null || this.D == null) {
            throw ah.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void e() {
        a1.b(this.f8205a0);
    }

    private int f() {
        int i10 = this.S;
        h();
        return i10;
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final byte[] a = new byte[10];

        /* renamed from: b */
        private boolean f8254b;

        /* renamed from: c */
        private int f8255c;

        /* renamed from: d */
        private long f8256d;

        /* renamed from: e */
        private int f8257e;

        /* renamed from: f */
        private int f8258f;

        /* renamed from: g */
        private int f8259g;

        public void a(c cVar) {
            if (this.f8255c > 0) {
                cVar.X.a(this.f8256d, this.f8257e, this.f8258f, this.f8259g, cVar.f8238j);
                this.f8255c = 0;
            }
        }

        public void a() {
            this.f8254b = false;
            this.f8255c = 0;
        }

        public void a(c cVar, long j3, int i10, int i11, int i12) {
            if (this.f8254b) {
                int i13 = this.f8255c;
                int i14 = i13 + 1;
                this.f8255c = i14;
                if (i13 == 0) {
                    this.f8256d = j3;
                    this.f8257e = i10;
                    this.f8258f = 0;
                }
                this.f8258f += i11;
                this.f8259g = i12;
                if (i14 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(j8 j8Var) {
            if (this.f8254b) {
                return;
            }
            j8Var.c(this.a, 0, 10);
            j8Var.b();
            if (k.b(this.a) == 0) {
                return;
            }
            this.f8254b = true;
        }
    }

    public tc(n7 n7Var, int i10) {
        this.f8221q = -1L;
        this.f8222r = C.TIME_UNSET;
        this.f8223s = C.TIME_UNSET;
        this.f8224t = C.TIME_UNSET;
        this.f8229z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.a = n7Var;
        n7Var.a(new b());
        this.f8208d = (i10 & 1) == 0;
        this.f8206b = new aq();
        this.f8207c = new SparseArray();
        this.f8211g = new yg(4);
        this.f8212h = new yg(ByteBuffer.allocate(4).putInt(-1).array());
        this.f8213i = new yg(4);
        this.f8209e = new yg(uf.a);
        this.f8210f = new yg(4);
        this.f8214j = new yg();
        this.f8215k = new yg();
        this.f8216l = new yg(8);
        this.f8217m = new yg();
        this.f8218n = new yg();
        this.L = new int[1];
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
        int i10;
        if (this.f8221q != -1 && this.f8224t != C.TIME_UNSET && mcVar != null && mcVar.a() != 0 && mcVar2 != null && mcVar2.a() == mcVar.a()) {
            int a10 = mcVar.a();
            int[] iArr = new int[a10];
            long[] jArr = new long[a10];
            long[] jArr2 = new long[a10];
            long[] jArr3 = new long[a10];
            int i11 = 0;
            for (int i12 = 0; i12 < a10; i12++) {
                jArr3[i12] = mcVar.a(i12);
                jArr[i12] = mcVar2.a(i12) + this.f8221q;
            }
            while (true) {
                i10 = a10 - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            iArr[i10] = (int) ((this.f8221q + this.f8220p) - jArr[i10]);
            long j3 = this.f8224t - jArr3[i10];
            jArr2[i10] = j3;
            if (j3 <= 0) {
                kc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j3);
                iArr = Arrays.copyOf(iArr, i10);
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                jArr3 = Arrays.copyOf(jArr3, i10);
            }
            return new e3(iArr, jArr, jArr2, jArr3);
        }
        return new ej.b(this.f8224t);
    }

    private void a(c cVar, long j3, int i10, int i11, int i12) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.a(cVar, j3, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f8230b) || "S_TEXT/ASS".equals(cVar.f8230b)) {
                if (this.K > 1) {
                    kc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.I;
                    if (j10 == C.TIME_UNSET) {
                        kc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.f8230b, j10, this.f8215k.c());
                        int d10 = this.f8215k.d();
                        while (true) {
                            if (d10 >= this.f8215k.e()) {
                                break;
                            }
                            if (this.f8215k.c()[d10] == 0) {
                                this.f8215k.e(d10);
                                break;
                            }
                            d10++;
                        }
                        ro roVar = cVar.X;
                        yg ygVar = this.f8215k;
                        roVar.a(ygVar, ygVar.e());
                        i11 += this.f8215k.e();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int e2 = this.f8218n.e();
                    cVar.X.a(this.f8218n, e2, 2);
                    i11 += e2;
                }
            }
            cVar.X.a(j3, i10, i11, i12, cVar.f8238j);
        }
        this.F = true;
    }

    private static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public void a(int i10, double d10) {
        if (i10 == 181) {
            d(i10).Q = (int) d10;
            return;
        }
        if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    d(i10).D = (float) d10;
                    return;
                case 21970:
                    d(i10).E = (float) d10;
                    return;
                case 21971:
                    d(i10).F = (float) d10;
                    return;
                case 21972:
                    d(i10).G = (float) d10;
                    return;
                case 21973:
                    d(i10).H = (float) d10;
                    return;
                case 21974:
                    d(i10).I = (float) d10;
                    return;
                case 21975:
                    d(i10).J = (float) d10;
                    return;
                case 21976:
                    d(i10).K = (float) d10;
                    return;
                case 21977:
                    d(i10).L = (float) d10;
                    return;
                case 21978:
                    d(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            d(i10).f8247s = (float) d10;
                            return;
                        case 30324:
                            d(i10).f8248t = (float) d10;
                            return;
                        case 30325:
                            d(i10).u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        }
        this.f8223s = (long) d10;
    }

    private static byte[] a(long j3, String str, long j10) {
        a1.a(j3 != C.TIME_UNSET);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - ((i11 * 60) * 1000000);
        int i12 = (int) (j12 / 1000000);
        return yp.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10))));
    }

    public void a(c cVar, j8 j8Var, int i10) {
        if (cVar.f8235g != 1685485123 && cVar.f8235g != 1685480259) {
            j8Var.a(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        j8Var.d(bArr, 0, i10);
    }

    public void a(c cVar, int i10, j8 j8Var, int i11) {
        if (i10 == 4 && "V_VP9".equals(cVar.f8230b)) {
            this.f8218n.d(i11);
            j8Var.d(this.f8218n.c(), 0, i11);
        } else {
            j8Var.a(i11);
        }
    }

    @Override // com.applovin.impl.i8
    public final void a(k8 k8Var) {
        this.f8205a0 = k8Var;
    }

    public void a(int i10, long j3) {
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw ah.a("ContentEncodingOrder " + j3 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw ah.a("ContentEncodingScope " + j3 + " not supported", null);
        }
        switch (i10) {
            case 131:
                d(i10).f8232d = (int) j3;
                return;
            case 136:
                d(i10).V = j3 == 1;
                return;
            case 155:
                this.I = a(j3);
                return;
            case 159:
                d(i10).O = (int) j3;
                return;
            case 176:
                d(i10).f8241m = (int) j3;
                return;
            case 179:
                a(i10);
                this.C.a(a(j3));
                return;
            case 186:
                d(i10).f8242n = (int) j3;
                return;
            case 215:
                d(i10).f8231c = (int) j3;
                return;
            case 231:
                this.B = a(j3);
                return;
            case 238:
                this.P = (int) j3;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                a(i10);
                this.D.a(j3);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                d(i10).f8235g = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw ah.a("ContentCompAlgo " + j3 + " not supported", null);
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw ah.a("DocTypeReadVersion " + j3 + " not supported", null);
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw ah.a("EBMLReadVersion " + j3 + " not supported", null);
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw ah.a("ContentEncAlgo " + j3 + " not supported", null);
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw ah.a("AESSettingsCipherMode " + j3 + " not supported", null);
            case 21420:
                this.f8227x = j3 + this.f8221q;
                return;
            case 21432:
                int i11 = (int) j3;
                b(i10);
                if (i11 == 0) {
                    this.u.f8250w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.u.f8250w = 2;
                    return;
                } else if (i11 == 3) {
                    this.u.f8250w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.u.f8250w = 3;
                    return;
                }
            case 21680:
                d(i10).f8243o = (int) j3;
                return;
            case 21682:
                d(i10).f8245q = (int) j3;
                return;
            case 21690:
                d(i10).f8244p = (int) j3;
                return;
            case 21930:
                d(i10).U = j3 == 1;
                return;
            case 21998:
                d(i10).f8234f = (int) j3;
                return;
            case 22186:
                d(i10).R = j3;
                return;
            case 22203:
                d(i10).S = j3;
                return;
            case 25188:
                d(i10).P = (int) j3;
                return;
            case 30321:
                b(i10);
                int i12 = (int) j3;
                if (i12 == 0) {
                    this.u.f8246r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.u.f8246r = 1;
                    return;
                } else if (i12 == 2) {
                    this.u.f8246r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.u.f8246r = 3;
                    return;
                }
            case 2352003:
                d(i10).f8233e = (int) j3;
                return;
            case 2807729:
                this.f8222r = j3;
                return;
            default:
                switch (i10) {
                    case 21945:
                        b(i10);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            this.u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.u.A = 1;
                            return;
                        }
                    case 21946:
                        b(i10);
                        int b3 = p3.b((int) j3);
                        if (b3 != -1) {
                            this.u.f8253z = b3;
                            return;
                        }
                        return;
                    case 21947:
                        b(i10);
                        this.u.f8251x = true;
                        int a10 = p3.a((int) j3);
                        if (a10 != -1) {
                            this.u.f8252y = a10;
                            return;
                        }
                        return;
                    case 21948:
                        d(i10).B = (int) j3;
                        return;
                    case 21949:
                        d(i10).C = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = 31;
                    break;
                }
                break;
        }
        switch (c10) {
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
            case NOTIFICATION_REDIRECT_VALUE:
            case 30:
            case TEMPLATE_HTML_SIZE_VALUE:
                return true;
            default:
                return false;
        }
    }

    private boolean a(qh qhVar, long j3) {
        if (this.f8228y) {
            this.A = j3;
            qhVar.a = this.f8229z;
            this.f8228y = false;
            return true;
        }
        if (this.f8225v) {
            long j10 = this.A;
            if (j10 != -1) {
                qhVar.a = j10;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public final int a(j8 j8Var, qh qhVar) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.a.a(j8Var);
            if (z10 && a(qhVar, j8Var.f())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f8207c.size(); i10++) {
            c cVar = (c) this.f8207c.valueAt(i10);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(j8 j8Var, int i10) {
        if (this.f8211g.e() >= i10) {
            return;
        }
        if (this.f8211g.b() < i10) {
            yg ygVar = this.f8211g;
            ygVar.a(Math.max(ygVar.b() * 2, i10));
        }
        j8Var.d(this.f8211g.c(), this.f8211g.e(), i10 - this.f8211g.e());
        this.f8211g.e(i10);
    }

    private long a(long j3) {
        long j10 = this.f8222r;
        if (j10 != C.TIME_UNSET) {
            return yp.c(j3, j10, 1000L);
        }
        throw ah.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.applovin.impl.i8
    public void a(long j3, long j10) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        this.a.reset();
        this.f8206b.b();
        h();
        for (int i10 = 0; i10 < this.f8207c.size(); i10++) {
            ((c) this.f8207c.valueAt(i10)).d();
        }
    }

    private static void a(String str, long j3, byte[] bArr) {
        byte[] a10;
        int i10;
        str.getClass();
        if (str.equals("S_TEXT/ASS")) {
            a10 = a(j3, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            a10 = a(j3, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(a10, 0, bArr, i10, a10.length);
    }

    public void a(int i10, long j3, long j10) {
        e();
        if (i10 == 160) {
            this.Q = false;
            return;
        }
        if (i10 == 174) {
            this.u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f8226w = -1;
            this.f8227x = -1L;
            return;
        }
        if (i10 == 20533) {
            d(i10).f8236h = true;
            return;
        }
        if (i10 == 21968) {
            d(i10).f8251x = true;
            return;
        }
        if (i10 == 408125543) {
            long j11 = this.f8221q;
            if (j11 != -1 && j11 != j3) {
                throw ah.a("Multiple Segment elements not supported", null);
            }
            this.f8221q = j3;
            this.f8220p = j10;
            return;
        }
        if (i10 != 475249515) {
            if (i10 == 524531317 && !this.f8225v) {
                if (this.f8208d && this.f8229z != -1) {
                    this.f8228y = true;
                    return;
                } else {
                    this.f8205a0.a(new ej.b(this.f8224t));
                    this.f8225v = true;
                    return;
                }
            }
            return;
        }
        this.C = new mc();
        this.D = new mc();
    }

    public void a(int i10, String str) {
        if (i10 == 134) {
            d(i10).f8230b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                d(i10).a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                d(i10).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ah.a("DocType " + str + " not supported", null);
    }

    private int a(j8 j8Var, c cVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f8230b)) {
            a(j8Var, f8200c0, i10);
            return f();
        }
        if ("S_TEXT/ASS".equals(cVar.f8230b)) {
            a(j8Var, f8202e0, i10);
            return f();
        }
        ro roVar = cVar.X;
        if (!this.U) {
            if (cVar.f8236h) {
                this.O &= -1073741825;
                if (!this.V) {
                    j8Var.d(this.f8211g.c(), 0, 1);
                    this.R++;
                    if ((this.f8211g.c()[0] & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.Y = this.f8211g.c()[0];
                        this.V = true;
                    } else {
                        throw ah.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b3 = this.Y;
                if ((b3 & 1) == 1) {
                    boolean z10 = (b3 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        j8Var.d(this.f8216l.c(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.f8211g.c()[0] = (byte) ((z10 ? 128 : 0) | 8);
                        this.f8211g.f(0);
                        roVar.a(this.f8211g, 1, 1);
                        this.S++;
                        this.f8216l.f(0);
                        roVar.a(this.f8216l, 8, 1);
                        this.S += 8;
                    }
                    if (z10) {
                        if (!this.W) {
                            j8Var.d(this.f8211g.c(), 0, 1);
                            this.R++;
                            this.f8211g.f(0);
                            this.X = this.f8211g.w();
                            this.W = true;
                        }
                        int i12 = this.X * 4;
                        this.f8211g.d(i12);
                        j8Var.d(this.f8211g.c(), 0, i12);
                        this.R += i12;
                        short s5 = (short) ((this.X / 2) + 1);
                        int i13 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f8219o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f8219o = ByteBuffer.allocate(i13);
                        }
                        this.f8219o.position(0);
                        this.f8219o.putShort(s5);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.X;
                            if (i14 >= i11) {
                                break;
                            }
                            int A = this.f8211g.A();
                            if (i14 % 2 == 0) {
                                this.f8219o.putShort((short) (A - i15));
                            } else {
                                this.f8219o.putInt(A - i15);
                            }
                            i14++;
                            i15 = A;
                        }
                        int i16 = (i10 - this.R) - i15;
                        if (i11 % 2 == 1) {
                            this.f8219o.putInt(i16);
                        } else {
                            this.f8219o.putShort((short) i16);
                            this.f8219o.putInt(0);
                        }
                        this.f8217m.a(this.f8219o.array(), i13);
                        roVar.a(this.f8217m, i13, 1);
                        this.S += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f8237i;
                if (bArr != null) {
                    this.f8214j.a(bArr, bArr.length);
                }
            }
            if (cVar.f8234f > 0) {
                this.O |= 268435456;
                this.f8218n.d(0);
                this.f8211g.d(4);
                this.f8211g.c()[0] = (byte) ((i10 >> 24) & 255);
                this.f8211g.c()[1] = (byte) ((i10 >> 16) & 255);
                this.f8211g.c()[2] = (byte) ((i10 >> 8) & 255);
                this.f8211g.c()[3] = (byte) (i10 & 255);
                roVar.a(this.f8211g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int e2 = this.f8214j.e() + i10;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f8230b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f8230b)) {
            if (cVar.T != null) {
                a1.b(this.f8214j.e() == 0);
                cVar.T.a(j8Var);
            }
            while (true) {
                int i17 = this.R;
                if (i17 >= e2) {
                    break;
                }
                int a10 = a(j8Var, roVar, e2 - i17);
                this.R += a10;
                this.S += a10;
            }
        } else {
            byte[] c10 = this.f8210f.c();
            c10[0] = 0;
            c10[1] = 0;
            c10[2] = 0;
            int i18 = cVar.Y;
            int i19 = 4 - i18;
            while (this.R < e2) {
                int i20 = this.T;
                if (i20 == 0) {
                    a(j8Var, c10, i19, i18);
                    this.R += i18;
                    this.f8210f.f(0);
                    this.T = this.f8210f.A();
                    this.f8209e.f(0);
                    roVar.a(this.f8209e, 4);
                    this.S += 4;
                } else {
                    int a11 = a(j8Var, roVar, i20);
                    this.R += a11;
                    this.S += a11;
                    this.T -= a11;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f8230b)) {
            this.f8212h.f(0);
            roVar.a(this.f8212h, 4);
            this.S += 4;
        }
        return f();
    }

    private void a(j8 j8Var, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f8215k.b() < length) {
            this.f8215k.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f8215k.c(), 0, bArr.length);
        }
        j8Var.d(this.f8215k.c(), bArr.length, i10);
        this.f8215k.f(0);
        this.f8215k.e(length);
    }

    private int a(j8 j8Var, ro roVar, int i10) {
        int a10 = this.f8214j.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            roVar.a(this.f8214j, min);
            return min;
        }
        return roVar.a((e5) j8Var, i10, false);
    }

    private void a(j8 j8Var, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f8214j.a());
        j8Var.d(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f8214j.a(bArr, i10, min);
        }
    }

    @Override // com.applovin.impl.i8
    public final boolean a(j8 j8Var) {
        return new jk().b(j8Var);
    }
}
