package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.ij;
import com.applovin.impl.qo;
import com.applovin.impl.y6;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.FirebaseError;
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
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class yc implements k8 {

    /* renamed from: b0 */
    public static final o8 f28134b0 = new dt(14);

    /* renamed from: c0 */
    private static final byte[] f28135c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0 */
    private static final byte[] f28136d0 = xp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0 */
    private static final byte[] f28137e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0 */
    private static final UUID f28138f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: g0 */
    private static final Map f28139g0;
    private long A;
    private long B;
    private rc C;
    private rc D;
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

    /* renamed from: a */
    private final p7 f28140a;

    /* renamed from: a0 */
    private m8 f28141a0;

    /* renamed from: b */
    private final zp f28142b;

    /* renamed from: c */
    private final SparseArray f28143c;
    private final boolean d;
    private final bh e;

    /* renamed from: f */
    private final bh f28144f;

    /* renamed from: g */
    private final bh f28145g;

    /* renamed from: h */
    private final bh f28146h;

    /* renamed from: i */
    private final bh f28147i;

    /* renamed from: j */
    private final bh f28148j;

    /* renamed from: k */
    private final bh f28149k;

    /* renamed from: l */
    private final bh f28150l;

    /* renamed from: m */
    private final bh f28151m;

    /* renamed from: n */
    private final bh f28152n;

    /* renamed from: o */
    private ByteBuffer f28153o;

    /* renamed from: p */
    private long f28154p;

    /* renamed from: q */
    private long f28155q;

    /* renamed from: r */
    private long f28156r;

    /* renamed from: s */
    private long f28157s;

    /* renamed from: t */
    private long f28158t;

    /* renamed from: u */
    private c f28159u;

    /* renamed from: v */
    private boolean f28160v;
    private int w;
    private long x;

    /* renamed from: y */
    private boolean f28161y;

    /* renamed from: z */
    private long f28162z;

    /* loaded from: classes3.dex */
    public final class b implements o7 {
        private b() {
        }

        @Override // com.applovin.impl.o7
        public void a(int i2, int i3, l8 l8Var) {
            yc.this.a(i2, i3, l8Var);
        }

        @Override // com.applovin.impl.o7
        public int b(int i2) {
            return yc.this.e(i2);
        }

        @Override // com.applovin.impl.o7
        public boolean c(int i2) {
            return yc.this.f(i2);
        }

        public /* synthetic */ b(yc ycVar, a aVar) {
            this();
        }

        @Override // com.applovin.impl.o7
        public void a(int i2) {
            yc.this.c(i2);
        }

        @Override // com.applovin.impl.o7
        public void a(int i2, double d) {
            yc.this.a(i2, d);
        }

        @Override // com.applovin.impl.o7
        public void a(int i2, long j2) {
            yc.this.a(i2, j2);
        }

        @Override // com.applovin.impl.o7
        public void a(int i2, long j2, long j3) {
            yc.this.a(i2, j2, j3);
        }

        @Override // com.applovin.impl.o7
        public void a(int i2, String str) {
            yc.this.a(i2, str);
        }
    }

    /* loaded from: classes3.dex */
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
        public qo X;
        public int Y;

        /* renamed from: a */
        public String f28164a;

        /* renamed from: b */
        public String f28165b;

        /* renamed from: c */
        public int f28166c;
        public int d;
        public int e;

        /* renamed from: f */
        public int f28167f;

        /* renamed from: g */
        private int f28168g;

        /* renamed from: h */
        public boolean f28169h;

        /* renamed from: i */
        public byte[] f28170i;

        /* renamed from: j */
        public qo.a f28171j;

        /* renamed from: k */
        public byte[] f28172k;

        /* renamed from: l */
        public y6 f28173l;

        /* renamed from: m */
        public int f28174m;

        /* renamed from: n */
        public int f28175n;

        /* renamed from: o */
        public int f28176o;

        /* renamed from: p */
        public int f28177p;

        /* renamed from: q */
        public int f28178q;

        /* renamed from: r */
        public int f28179r;

        /* renamed from: s */
        public float f28180s;

        /* renamed from: t */
        public float f28181t;

        /* renamed from: u */
        public float f28182u;

        /* renamed from: v */
        public byte[] f28183v;
        public int w;
        public boolean x;

        /* renamed from: y */
        public int f28184y;

        /* renamed from: z */
        public int f28185z;

        private c() {
            this.f28174m = -1;
            this.f28175n = -1;
            this.f28176o = -1;
            this.f28177p = -1;
            this.f28178q = 0;
            this.f28179r = -1;
            this.f28180s = 0.0f;
            this.f28181t = 0.0f;
            this.f28182u = 0.0f;
            this.f28183v = null;
            this.w = -1;
            this.x = false;
            this.f28184y = -1;
            this.f28185z = -1;
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

        public /* synthetic */ c(a aVar) {
            this();
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
            b1.a(this.X);
        }

        private byte[] a(String str) {
            byte[] bArr = this.f28172k;
            if (bArr != null) {
                return bArr;
            }
            throw dh.a("Missing CodecPrivate for codec " + str, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01cf. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0436  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x054f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0429  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.applovin.impl.m8 r21, int r22) {
            /*
                Method dump skipped, instructions count: 1630
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yc.c.a(com.applovin.impl.m8, int):void");
        }

        private static boolean b(bh bhVar) {
            try {
                int r2 = bhVar.r();
                if (r2 == 1) {
                    return true;
                }
                if (r2 != 65534) {
                    return false;
                }
                bhVar.f(24);
                if (bhVar.s() == yc.f28138f0.getMostSignificantBits()) {
                    if (bhVar.s() == yc.f28138f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw dh.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static Pair a(bh bhVar) {
            try {
                bhVar.g(16);
                long p2 = bhVar.p();
                if (p2 == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (p2 == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (p2 == 826496599) {
                    byte[] c2 = bhVar.c();
                    for (int d = bhVar.d() + 20; d < c2.length - 4; d++) {
                        if (c2[d] == 0 && c2[d + 1] == 0 && c2[d + 2] == 1 && c2[d + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(c2, d, c2.length)));
                        }
                    }
                    throw dh.a("Failed to find FourCC VC1 initialization data", null);
                }
                pc.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw dh.a("Error parsing FourCC private data", null);
            }
        }

        private static List a(byte[] bArr) {
            int i2;
            int i3;
            try {
                if (bArr[0] == 2) {
                    int i4 = 0;
                    int i5 = 1;
                    while (true) {
                        i2 = bArr[i5] & 255;
                        if (i2 != 255) {
                            break;
                        }
                        i4 += 255;
                        i5++;
                    }
                    int i6 = i5 + 1;
                    int i7 = i4 + i2;
                    int i8 = 0;
                    while (true) {
                        i3 = bArr[i6] & 255;
                        if (i3 != 255) {
                            break;
                        }
                        i8 += 255;
                        i6++;
                    }
                    int i9 = i6 + 1;
                    int i10 = i8 + i3;
                    if (bArr[i9] == 1) {
                        byte[] bArr2 = new byte[i7];
                        System.arraycopy(bArr, i9, bArr2, 0, i7);
                        int i11 = i9 + i7;
                        if (bArr[i11] == 3) {
                            int i12 = i11 + i10;
                            if (bArr[i12] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i12];
                                System.arraycopy(bArr, i12, bArr3, 0, bArr.length - i12);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw dh.a("Error parsing vorbis codec private", null);
                        }
                        throw dh.a("Error parsing vorbis codec private", null);
                    }
                    throw dh.a("Error parsing vorbis codec private", null);
                }
                throw dh.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw dh.a("Error parsing vorbis codec private", null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final byte[] f28186a = new byte[10];

        /* renamed from: b */
        private boolean f28187b;

        /* renamed from: c */
        private int f28188c;
        private long d;
        private int e;

        /* renamed from: f */
        private int f28189f;

        /* renamed from: g */
        private int f28190g;

        public void a() {
            this.f28187b = false;
            this.f28188c = 0;
        }

        public void a(c cVar) {
            if (this.f28188c > 0) {
                cVar.X.a(this.d, this.e, this.f28189f, this.f28190g, cVar.f28171j);
                this.f28188c = 0;
            }
        }

        public void a(c cVar, long j2, int i2, int i3, int i4) {
            if (this.f28187b) {
                int i5 = this.f28188c;
                int i6 = i5 + 1;
                this.f28188c = i6;
                if (i5 == 0) {
                    this.d = j2;
                    this.e = i2;
                    this.f28189f = 0;
                }
                this.f28189f += i3;
                this.f28190g = i4;
                if (i6 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(l8 l8Var) {
            if (this.f28187b) {
                return;
            }
            l8Var.c(this.f28186a, 0, 10);
            l8Var.b();
            if (k.b(this.f28186a) == 0) {
                return;
            }
            this.f28187b = true;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        com.applovin.impl.adview.t.s(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.applovin.impl.adview.t.s(Opcodes.GETFIELD, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f28139g0 = Collections.unmodifiableMap(hashMap);
    }

    public yc() {
        this(0);
    }

    public static /* synthetic */ k8[] g() {
        return new k8[]{new yc()};
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
        this.f28148j.d(0);
    }

    @Override // com.applovin.impl.k8
    public final void a() {
    }

    public int e(int i2) {
        switch (i2) {
            case Opcodes.LXOR /* 131 */:
            case Opcodes.L2I /* 136 */:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
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
            case Opcodes.I2F /* 134 */:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
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
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
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

    public boolean f(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    public yc(int i2) {
        this(new a6(), i2);
    }

    private void b(int i2) {
        if (this.f28159u != null) {
            return;
        }
        throw dh.a("Element " + i2 + " must be in a TrackEntry", null);
    }

    private c d(int i2) {
        b(i2);
        return this.f28159u;
    }

    private void e() {
        b1.b(this.f28141a0);
    }

    private int f() {
        int i2 = this.S;
        h();
        return i2;
    }

    @Override // com.applovin.impl.k8
    public final void a(m8 m8Var) {
        this.f28141a0 = m8Var;
    }

    public void c(int i2) {
        e();
        if (i2 == 160) {
            if (this.G != 2) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.K; i4++) {
                i3 += this.L[i4];
            }
            c cVar = (c) this.f28143c.get(this.M);
            cVar.a();
            for (int i5 = 0; i5 < this.K; i5++) {
                long j2 = ((cVar.e * i5) / 1000) + this.H;
                int i6 = this.O;
                if (i5 == 0 && !this.Q) {
                    i6 |= 1;
                }
                int i7 = this.L[i5];
                i3 -= i7;
                a(cVar, j2, i6, i7, i3);
            }
            this.G = 0;
            return;
        }
        if (i2 == 174) {
            c cVar2 = (c) b1.b(this.f28159u);
            String str = cVar2.f28165b;
            if (str != null) {
                if (a(str)) {
                    cVar2.a(this.f28141a0, cVar2.f28166c);
                    this.f28143c.put(cVar2.f28166c, cVar2);
                }
                this.f28159u = null;
                return;
            }
            throw dh.a("CodecId is missing in TrackEntry element", null);
        }
        if (i2 == 19899) {
            int i8 = this.w;
            if (i8 != -1) {
                long j3 = this.x;
                if (j3 != -1) {
                    if (i8 == 475249515) {
                        this.f28162z = j3;
                        return;
                    }
                    return;
                }
            }
            throw dh.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i2 == 25152) {
            b(i2);
            c cVar3 = this.f28159u;
            if (cVar3.f28169h) {
                if (cVar3.f28171j != null) {
                    cVar3.f28173l = new y6(new y6.b(t2.f27005a, "video/webm", this.f28159u.f28171j.f26204b));
                    return;
                }
                throw dh.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i2 == 28032) {
            b(i2);
            c cVar4 = this.f28159u;
            if (cVar4.f28169h && cVar4.f28170i != null) {
                throw dh.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.f28156r == -9223372036854775807L) {
                this.f28156r = 1000000L;
            }
            long j4 = this.f28157s;
            if (j4 != -9223372036854775807L) {
                this.f28158t = a(j4);
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            if (this.f28143c.size() != 0) {
                this.f28141a0.c();
                return;
            }
            throw dh.a("No valid tracks were found", null);
        }
        if (i2 != 475249515) {
            return;
        }
        if (!this.f28160v) {
            this.f28141a0.a(a(this.C, this.D));
            this.f28160v = true;
        }
        this.C = null;
        this.D = null;
    }

    public yc(p7 p7Var, int i2) {
        this.f28155q = -1L;
        this.f28156r = -9223372036854775807L;
        this.f28157s = -9223372036854775807L;
        this.f28158t = -9223372036854775807L;
        this.f28162z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f28140a = p7Var;
        p7Var.a(new b());
        this.d = (i2 & 1) == 0;
        this.f28142b = new zp();
        this.f28143c = new SparseArray();
        this.f28145g = new bh(4);
        this.f28146h = new bh(ByteBuffer.allocate(4).putInt(-1).array());
        this.f28147i = new bh(4);
        this.e = new bh(zf.f28330a);
        this.f28144f = new bh(4);
        this.f28148j = new bh();
        this.f28149k = new bh();
        this.f28150l = new bh(8);
        this.f28151m = new bh();
        this.f28152n = new bh();
        this.L = new int[1];
    }

    private void a(int i2) {
        if (this.C == null || this.D == null) {
            throw dh.a("Element " + i2 + " must be in a Cues", null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0229, code lost:
    
        throw com.applovin.impl.dh.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r20, int r21, com.applovin.impl.l8 r22) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yc.a(int, int, com.applovin.impl.l8):void");
    }

    private ij a(rc rcVar, rc rcVar2) {
        int i2;
        if (this.f28155q != -1 && this.f28158t != -9223372036854775807L && rcVar != null && rcVar.a() != 0 && rcVar2 != null && rcVar2.a() == rcVar.a()) {
            int a2 = rcVar.a();
            int[] iArr = new int[a2];
            long[] jArr = new long[a2];
            long[] jArr2 = new long[a2];
            long[] jArr3 = new long[a2];
            int i3 = 0;
            for (int i4 = 0; i4 < a2; i4++) {
                jArr3[i4] = rcVar.a(i4);
                jArr[i4] = rcVar2.a(i4) + this.f28155q;
            }
            while (true) {
                i2 = a2 - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            iArr[i2] = (int) ((this.f28155q + this.f28154p) - jArr[i2]);
            long j2 = this.f28158t - jArr3[i2];
            jArr2[i2] = j2;
            if (j2 <= 0) {
                pc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j2);
                iArr = Arrays.copyOf(iArr, i2);
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                jArr3 = Arrays.copyOf(jArr3, i2);
            }
            return new g3(iArr, jArr, jArr2, jArr3);
        }
        return new ij.b(this.f28158t);
    }

    private void a(c cVar, long j2, int i2, int i3, int i4) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.a(cVar, j2, i2, i3, i4);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f28165b) || "S_TEXT/ASS".equals(cVar.f28165b)) {
                if (this.K > 1) {
                    pc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.I;
                    if (j3 == -9223372036854775807L) {
                        pc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.f28165b, j3, this.f28149k.c());
                        int d2 = this.f28149k.d();
                        while (true) {
                            if (d2 >= this.f28149k.e()) {
                                break;
                            }
                            if (this.f28149k.c()[d2] == 0) {
                                this.f28149k.e(d2);
                                break;
                            }
                            d2++;
                        }
                        qo qoVar = cVar.X;
                        bh bhVar = this.f28149k;
                        qoVar.a(bhVar, bhVar.e());
                        i3 += this.f28149k.e();
                    }
                }
            }
            if ((268435456 & i2) != 0) {
                if (this.K > 1) {
                    i2 &= -268435457;
                } else {
                    int e = this.f28152n.e();
                    cVar.X.a(this.f28152n, e, 2);
                    i3 += e;
                }
            }
            cVar.X.a(j2, i2, i3, i4, cVar.f28171j);
        }
        this.F = true;
    }

    private static int[] a(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        return iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    public void a(int i2, double d2) {
        if (i2 == 181) {
            d(i2).Q = (int) d2;
            return;
        }
        if (i2 == 17545) {
            this.f28157s = (long) d2;
            return;
        }
        switch (i2) {
            case 21969:
                d(i2).D = (float) d2;
                return;
            case 21970:
                d(i2).E = (float) d2;
                return;
            case 21971:
                d(i2).F = (float) d2;
                return;
            case 21972:
                d(i2).G = (float) d2;
                return;
            case 21973:
                d(i2).H = (float) d2;
                return;
            case 21974:
                d(i2).I = (float) d2;
                return;
            case 21975:
                d(i2).J = (float) d2;
                return;
            case 21976:
                d(i2).K = (float) d2;
                return;
            case 21977:
                d(i2).L = (float) d2;
                return;
            case 21978:
                d(i2).M = (float) d2;
                return;
            default:
                switch (i2) {
                    case 30323:
                        d(i2).f28180s = (float) d2;
                        return;
                    case 30324:
                        d(i2).f28181t = (float) d2;
                        return;
                    case 30325:
                        d(i2).f28182u = (float) d2;
                        return;
                    default:
                        return;
                }
        }
    }

    private static byte[] a(long j2, String str, long j3) {
        b1.a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * 3600) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return xp.c(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    public void a(c cVar, l8 l8Var, int i2) {
        if (cVar.f28168g != 1685485123 && cVar.f28168g != 1685480259) {
            l8Var.a(i2);
            return;
        }
        byte[] bArr = new byte[i2];
        cVar.N = bArr;
        l8Var.d(bArr, 0, i2);
    }

    public void a(c cVar, int i2, l8 l8Var, int i3) {
        if (i2 == 4 && "V_VP9".equals(cVar.f28165b)) {
            this.f28152n.d(i3);
            l8Var.d(this.f28152n.c(), 0, i3);
        } else {
            l8Var.a(i3);
        }
    }

    public void a(int i2, long j2) {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw dh.a("ContentEncodingOrder " + j2 + " not supported", null);
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            throw dh.a("ContentEncodingScope " + j2 + " not supported", null);
        }
        switch (i2) {
            case Opcodes.LXOR /* 131 */:
                d(i2).d = (int) j2;
                return;
            case Opcodes.L2I /* 136 */:
                d(i2).V = j2 == 1;
                return;
            case 155:
                this.I = a(j2);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                d(i2).O = (int) j2;
                return;
            case Opcodes.ARETURN /* 176 */:
                d(i2).f28174m = (int) j2;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                a(i2);
                this.C.a(a(j2));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                d(i2).f28175n = (int) j2;
                return;
            case 215:
                d(i2).f28166c = (int) j2;
                return;
            case 231:
                this.B = a(j2);
                return;
            case 238:
                this.P = (int) j2;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                a(i2);
                this.D.a(j2);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                d(i2).f28168g = (int) j2;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                throw dh.a("ContentCompAlgo " + j2 + " not supported", null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    throw dh.a("DocTypeReadVersion " + j2 + " not supported", null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                throw dh.a("EBMLReadVersion " + j2 + " not supported", null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                throw dh.a("ContentEncAlgo " + j2 + " not supported", null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                throw dh.a("AESSettingsCipherMode " + j2 + " not supported", null);
            case 21420:
                this.x = j2 + this.f28155q;
                return;
            case 21432:
                int i3 = (int) j2;
                b(i2);
                if (i3 == 0) {
                    this.f28159u.w = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f28159u.w = 2;
                    return;
                } else if (i3 == 3) {
                    this.f28159u.w = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.f28159u.w = 3;
                    return;
                }
            case 21680:
                d(i2).f28176o = (int) j2;
                return;
            case 21682:
                d(i2).f28178q = (int) j2;
                return;
            case 21690:
                d(i2).f28177p = (int) j2;
                return;
            case 21930:
                d(i2).U = j2 == 1;
                return;
            case 21998:
                d(i2).f28167f = (int) j2;
                return;
            case 22186:
                d(i2).R = j2;
                return;
            case 22203:
                d(i2).S = j2;
                return;
            case 25188:
                d(i2).P = (int) j2;
                return;
            case 30321:
                b(i2);
                int i4 = (int) j2;
                if (i4 == 0) {
                    this.f28159u.f28179r = 0;
                    return;
                }
                if (i4 == 1) {
                    this.f28159u.f28179r = 1;
                    return;
                } else if (i4 == 2) {
                    this.f28159u.f28179r = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f28159u.f28179r = 3;
                    return;
                }
            case 2352003:
                d(i2).e = (int) j2;
                return;
            case 2807729:
                this.f28156r = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        b(i2);
                        int i5 = (int) j2;
                        if (i5 == 1) {
                            this.f28159u.A = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.f28159u.A = 1;
                            return;
                        }
                    case 21946:
                        b(i2);
                        int b2 = r3.b((int) j2);
                        if (b2 != -1) {
                            this.f28159u.f28185z = b2;
                            return;
                        }
                        return;
                    case 21947:
                        b(i2);
                        this.f28159u.x = true;
                        int a2 = r3.a((int) j2);
                        if (a2 != -1) {
                            this.f28159u.f28184y = a2;
                            return;
                        }
                        return;
                    case 21948:
                        d(i2).B = (int) j2;
                        return;
                    case 21949:
                        d(i2).C = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean a(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c2 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c2 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c2 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c2 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c2 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c2 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c2 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c2 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c2 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c2 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c2 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c2 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c2 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c2 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c2 = 26;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c2 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c2 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c2 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c2 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c2 = 31;
                    break;
                }
                break;
        }
        switch (c2) {
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
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    private boolean a(th thVar, long j2) {
        if (this.f28161y) {
            this.A = j2;
            thVar.f27165a = this.f28162z;
            this.f28161y = false;
            return true;
        }
        if (this.f28160v) {
            long j3 = this.A;
            if (j3 != -1) {
                thVar.f27165a = j3;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.k8
    public final int a(l8 l8Var, th thVar) {
        this.F = false;
        boolean z2 = true;
        while (z2 && !this.F) {
            z2 = this.f28140a.a(l8Var);
            if (z2 && a(thVar, l8Var.f())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.f28143c.size(); i2++) {
            c cVar = (c) this.f28143c.valueAt(i2);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(l8 l8Var, int i2) {
        if (this.f28145g.e() >= i2) {
            return;
        }
        if (this.f28145g.b() < i2) {
            bh bhVar = this.f28145g;
            bhVar.a(Math.max(bhVar.b() * 2, i2));
        }
        l8Var.d(this.f28145g.c(), this.f28145g.e(), i2 - this.f28145g.e());
        this.f28145g.e(i2);
    }

    private long a(long j2) {
        long j3 = this.f28156r;
        if (j3 != -9223372036854775807L) {
            return xp.c(j2, j3, 1000L);
        }
        throw dh.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f28140a.reset();
        this.f28142b.b();
        h();
        for (int i2 = 0; i2 < this.f28143c.size(); i2++) {
            ((c) this.f28143c.valueAt(i2)).d();
        }
    }

    private static void a(String str, long j2, byte[] bArr) {
        byte[] a2;
        int i2;
        str.getClass();
        if (str.equals("S_TEXT/ASS")) {
            a2 = a(j2, "%01d:%02d:%02d:%02d", 10000L);
            i2 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            a2 = a(j2, "%02d:%02d:%02d,%03d", 1000L);
            i2 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(a2, 0, bArr, i2, a2.length);
    }

    public void a(int i2, long j2, long j3) {
        e();
        if (i2 == 160) {
            this.Q = false;
            return;
        }
        if (i2 == 174) {
            this.f28159u = new c();
            return;
        }
        if (i2 == 187) {
            this.E = false;
            return;
        }
        if (i2 == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i2 == 20533) {
            d(i2).f28169h = true;
            return;
        }
        if (i2 == 21968) {
            d(i2).x = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.f28155q;
            if (j4 != -1 && j4 != j2) {
                throw dh.a("Multiple Segment elements not supported", null);
            }
            this.f28155q = j2;
            this.f28154p = j3;
            return;
        }
        if (i2 == 475249515) {
            this.C = new rc();
            this.D = new rc();
        } else if (i2 == 524531317 && !this.f28160v) {
            if (this.d && this.f28162z != -1) {
                this.f28161y = true;
            } else {
                this.f28141a0.a(new ij.b(this.f28158t));
                this.f28160v = true;
            }
        }
    }

    public void a(int i2, String str) {
        if (i2 == 134) {
            d(i2).f28165b = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 21358) {
                d(i2).f28164a = str;
                return;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                d(i2).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw dh.a("DocType " + str + " not supported", null);
    }

    private int a(l8 l8Var, c cVar, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.f28165b)) {
            a(l8Var, f28135c0, i2);
            return f();
        }
        if ("S_TEXT/ASS".equals(cVar.f28165b)) {
            a(l8Var, f28137e0, i2);
            return f();
        }
        qo qoVar = cVar.X;
        if (!this.U) {
            if (cVar.f28169h) {
                this.O &= -1073741825;
                if (!this.V) {
                    l8Var.d(this.f28145g.c(), 0, 1);
                    this.R++;
                    if ((this.f28145g.c()[0] & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                        this.Y = this.f28145g.c()[0];
                        this.V = true;
                    } else {
                        throw dh.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.O |= Ints.MAX_POWER_OF_TWO;
                    if (!this.Z) {
                        l8Var.d(this.f28150l.c(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.f28145g.c()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f28145g.f(0);
                        qoVar.a(this.f28145g, 1, 1);
                        this.S++;
                        this.f28150l.f(0);
                        qoVar.a(this.f28150l, 8, 1);
                        this.S += 8;
                    }
                    if (z2) {
                        if (!this.W) {
                            l8Var.d(this.f28145g.c(), 0, 1);
                            this.R++;
                            this.f28145g.f(0);
                            this.X = this.f28145g.w();
                            this.W = true;
                        }
                        int i4 = this.X * 4;
                        this.f28145g.d(i4);
                        l8Var.d(this.f28145g.c(), 0, i4);
                        this.R += i4;
                        short s2 = (short) ((this.X / 2) + 1);
                        int i5 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.f28153o;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f28153o = ByteBuffer.allocate(i5);
                        }
                        this.f28153o.position(0);
                        this.f28153o.putShort(s2);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i3 = this.X;
                            if (i6 >= i3) {
                                break;
                            }
                            int A = this.f28145g.A();
                            if (i6 % 2 == 0) {
                                this.f28153o.putShort((short) (A - i7));
                            } else {
                                this.f28153o.putInt(A - i7);
                            }
                            i6++;
                            i7 = A;
                        }
                        int i8 = (i2 - this.R) - i7;
                        if (i3 % 2 == 1) {
                            this.f28153o.putInt(i8);
                        } else {
                            this.f28153o.putShort((short) i8);
                            this.f28153o.putInt(0);
                        }
                        this.f28151m.a(this.f28153o.array(), i5);
                        qoVar.a(this.f28151m, i5, 1);
                        this.S += i5;
                    }
                }
            } else {
                byte[] bArr = cVar.f28170i;
                if (bArr != null) {
                    this.f28148j.a(bArr, bArr.length);
                }
            }
            if (cVar.f28167f > 0) {
                this.O |= 268435456;
                this.f28152n.d(0);
                this.f28145g.d(4);
                this.f28145g.c()[0] = (byte) ((i2 >> 24) & 255);
                this.f28145g.c()[1] = (byte) ((i2 >> 16) & 255);
                this.f28145g.c()[2] = (byte) ((i2 >> 8) & 255);
                this.f28145g.c()[3] = (byte) (i2 & 255);
                qoVar.a(this.f28145g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int e = this.f28148j.e() + i2;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f28165b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f28165b)) {
            if (cVar.T != null) {
                b1.b(this.f28148j.e() == 0);
                cVar.T.a(l8Var);
            }
            while (true) {
                int i9 = this.R;
                if (i9 >= e) {
                    break;
                }
                int a2 = a(l8Var, qoVar, e - i9);
                this.R += a2;
                this.S += a2;
            }
        } else {
            byte[] c2 = this.f28144f.c();
            c2[0] = 0;
            c2[1] = 0;
            c2[2] = 0;
            int i10 = cVar.Y;
            int i11 = 4 - i10;
            while (this.R < e) {
                int i12 = this.T;
                if (i12 == 0) {
                    a(l8Var, c2, i11, i10);
                    this.R += i10;
                    this.f28144f.f(0);
                    this.T = this.f28144f.A();
                    this.e.f(0);
                    qoVar.a(this.e, 4);
                    this.S += 4;
                } else {
                    int a3 = a(l8Var, qoVar, i12);
                    this.R += a3;
                    this.S += a3;
                    this.T -= a3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f28165b)) {
            this.f28146h.f(0);
            qoVar.a(this.f28146h, 4);
            this.S += 4;
        }
        return f();
    }

    private void a(l8 l8Var, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        if (this.f28149k.b() < length) {
            this.f28149k.a(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, this.f28149k.c(), 0, bArr.length);
        }
        l8Var.d(this.f28149k.c(), bArr.length, i2);
        this.f28149k.f(0);
        this.f28149k.e(length);
    }

    private int a(l8 l8Var, qo qoVar, int i2) {
        int a2 = this.f28148j.a();
        if (a2 > 0) {
            int min = Math.min(i2, a2);
            qoVar.a(this.f28148j, min);
            return min;
        }
        return qoVar.a((g5) l8Var, i2, false);
    }

    private void a(l8 l8Var, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, this.f28148j.a());
        l8Var.d(bArr, i2 + min, i3 - min);
        if (min > 0) {
            this.f28148j.a(bArr, i2, min);
        }
    }

    @Override // com.applovin.impl.k8
    public final boolean a(l8 l8Var) {
        return new mk().b(l8Var);
    }
}
