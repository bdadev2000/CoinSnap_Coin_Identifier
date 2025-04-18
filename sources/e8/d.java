package e8;

import android.util.SparseArray;
import androidx.recyclerview.widget.s0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import n9.h0;
import n9.u;
import n9.x;
import s7.x1;
import v8.u0;
import y7.a0;
import y7.b0;
import y7.h;
import y7.l;
import y7.m;
import y7.n;

/* loaded from: classes3.dex */
public final class d implements l {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f17166c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f17167d0 = h0.z("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f17168e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f17169f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f17170g0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f17171h0;
    public long A;
    public long B;
    public s0 C;
    public s0 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final b a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f17172a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f17173b;

    /* renamed from: b0, reason: collision with root package name */
    public n f17174b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f17175c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17176d;

    /* renamed from: e, reason: collision with root package name */
    public final x f17177e;

    /* renamed from: f, reason: collision with root package name */
    public final x f17178f;

    /* renamed from: g, reason: collision with root package name */
    public final x f17179g;

    /* renamed from: h, reason: collision with root package name */
    public final x f17180h;

    /* renamed from: i, reason: collision with root package name */
    public final x f17181i;

    /* renamed from: j, reason: collision with root package name */
    public final x f17182j;

    /* renamed from: k, reason: collision with root package name */
    public final x f17183k;

    /* renamed from: l, reason: collision with root package name */
    public final x f17184l;

    /* renamed from: m, reason: collision with root package name */
    public final x f17185m;

    /* renamed from: n, reason: collision with root package name */
    public final x f17186n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f17187o;

    /* renamed from: p, reason: collision with root package name */
    public long f17188p;

    /* renamed from: q, reason: collision with root package name */
    public long f17189q;

    /* renamed from: r, reason: collision with root package name */
    public long f17190r;

    /* renamed from: s, reason: collision with root package name */
    public long f17191s;

    /* renamed from: t, reason: collision with root package name */
    public long f17192t;
    public c u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17193v;

    /* renamed from: w, reason: collision with root package name */
    public int f17194w;

    /* renamed from: x, reason: collision with root package name */
    public long f17195x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17196y;

    /* renamed from: z, reason: collision with root package name */
    public long f17197z;

    static {
        HashMap hashMap = new HashMap();
        com.applovin.impl.mediation.ads.e.l(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f17171h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        boolean z10;
        b bVar = new b();
        this.f17189q = -1L;
        this.f17190r = C.TIME_UNSET;
        this.f17191s = C.TIME_UNSET;
        this.f17192t = C.TIME_UNSET;
        this.f17197z = -1L;
        this.A = -1L;
        this.B = C.TIME_UNSET;
        this.a = bVar;
        bVar.f17138d = new v3.c(this);
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17176d = z10;
        this.f17173b = new e();
        this.f17175c = new SparseArray();
        this.f17179g = new x(4);
        this.f17180h = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f17181i = new x(4);
        this.f17177e = new x(u.a);
        this.f17178f = new x(4);
        this.f17182j = new x();
        this.f17183k = new x();
        this.f17184l = new x(8);
        this.f17185m = new x();
        this.f17186n = new x();
        this.L = new int[1];
    }

    public static byte[] g(long j3, String str, long j10) {
        boolean z10;
        if (j3 != C.TIME_UNSET) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - ((i11 * 60) * 1000000);
        int i12 = (int) (j12 / 1000000);
        return h0.z(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10))));
    }

    @Override // y7.l
    public final void a(n nVar) {
        this.f17174b0 = nVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01ef, code lost:
    
        r2 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01f0, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x093a, code lost:
    
        if (r5 == false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x093c, code lost:
    
        r3 = r37.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0942, code lost:
    
        if (r36.f17196y == false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0944, code lost:
    
        r36.A = r3;
        r6 = r38;
        r6.a = r36.f17197z;
        r36.f17196y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0961, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0964, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0965, code lost:
    
        if (r4 == false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0967, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x046c, code lost:
    
        throw s7.x1.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x094f, code lost:
    
        r6 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0953, code lost:
    
        if (r36.f17193v == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0955, code lost:
    
        r2 = r36.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x095b, code lost:
    
        if (r2 == (-1)) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x095d, code lost:
    
        r6.a = r2;
        r36.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0963, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0968, code lost:
    
        r6 = r38;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x072b, code lost:
    
        throw s7.x1.a("DocTypeReadVersion " + r10 + " not supported", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0980, code lost:
    
        if (r5 != false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0982, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0983, code lost:
    
        r1 = r36.f17175c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0989, code lost:
    
        if (r3 >= r1.size()) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x098b, code lost:
    
        r1 = (e8.c) r1.valueAt(r3);
        r1.X.getClass();
        r2 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0998, code lost:
    
        if (r2 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x099a, code lost:
    
        r2.a(r1.X, r1.f17150j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x09a1, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x09a4, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x09a6, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0394  */
    @Override // y7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(y7.m r37, y7.p r38) {
        /*
            Method dump skipped, instructions count: 3020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.d.b(y7.m, y7.p):int");
    }

    public final void c(int i10) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw x1.a("Element " + i10 + " must be in a Cues", null);
    }

    @Override // y7.l
    public final boolean d(m mVar) {
        s0 s0Var = new s0(4);
        h hVar = (h) mVar;
        long j3 = hVar.f27981c;
        long j10 = 1024;
        if (j3 != -1 && j3 <= 1024) {
            j10 = j3;
        }
        int i10 = (int) j10;
        hVar.peekFully(((x) s0Var.f2032c).a, 0, 4, false);
        s0Var.f2031b = 4;
        for (long w10 = ((x) s0Var.f2032c).w(); w10 != 440786851; w10 = ((w10 << 8) & (-256)) | (((x) s0Var.f2032c).a[0] & UByte.MAX_VALUE)) {
            int i11 = s0Var.f2031b + 1;
            s0Var.f2031b = i11;
            if (i11 == i10) {
                return false;
            }
            hVar.peekFully(((x) s0Var.f2032c).a, 0, 1, false);
        }
        long m10 = s0Var.m(hVar);
        long j11 = s0Var.f2031b;
        if (m10 == Long.MIN_VALUE) {
            return false;
        }
        if (j3 != -1 && j11 + m10 >= j3) {
            return false;
        }
        while (true) {
            long j12 = s0Var.f2031b;
            long j13 = j11 + m10;
            if (j12 < j13) {
                if (s0Var.m(hVar) == Long.MIN_VALUE) {
                    return false;
                }
                long m11 = s0Var.m(hVar);
                if (m11 < 0 || m11 > 2147483647L) {
                    return false;
                }
                if (m11 != 0) {
                    int i12 = (int) m11;
                    hVar.advancePeekPosition(i12, false);
                    s0Var.f2031b += i12;
                }
            } else {
                if (j12 != j13) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void e(int i10) {
        if (this.u != null) {
            return;
        }
        throw x1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5 A[EDGE_INSN: B:50:0x00d5->B:49:0x00d5 BREAK  A[LOOP:0: B:42:0x00c4->B:46:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(e8.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.d.f(e8.c, long, int, int, int):void");
    }

    public final void h(m mVar, int i10) {
        x xVar = this.f17179g;
        if (xVar.f22600c >= i10) {
            return;
        }
        byte[] bArr = xVar.a;
        if (bArr.length < i10) {
            xVar.a(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.a;
        int i11 = xVar.f22600c;
        mVar.readFully(bArr2, i11, i10 - i11);
        xVar.F(i10);
    }

    public final void i() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f17172a0 = false;
        this.f17182j.D(0);
    }

    public final long j(long j3) {
        long j10 = this.f17190r;
        if (j10 != C.TIME_UNSET) {
            return h0.M(j3, j10, 1000L);
        }
        throw x1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int k(m mVar, c cVar, int i10, boolean z10) {
        int b3;
        int b10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f17142b)) {
            l(mVar, f17166c0, i10);
            int i12 = this.T;
            i();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.f17142b)) {
            l(mVar, f17168e0, i10);
            int i13 = this.T;
            i();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f17142b)) {
            l(mVar, f17169f0, i10);
            int i14 = this.T;
            i();
            return i14;
        }
        a0 a0Var = cVar.X;
        boolean z14 = this.V;
        boolean z15 = true;
        x xVar = this.f17182j;
        if (!z14) {
            boolean z16 = cVar.f17148h;
            x xVar2 = this.f17179g;
            if (z16) {
                this.O &= -1073741825;
                int i15 = 128;
                if (!this.W) {
                    mVar.readFully(xVar2.a, 0, 1);
                    this.S++;
                    byte b11 = xVar2.a[0];
                    if ((b11 & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.Z = b11;
                        this.W = true;
                    } else {
                        throw x1.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b12 = this.Z;
                if ((b12 & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if ((b12 & 2) == 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.O |= 1073741824;
                    if (!this.f17172a0) {
                        x xVar3 = this.f17184l;
                        mVar.readFully(xVar3.a, 0, 8);
                        this.S += 8;
                        this.f17172a0 = true;
                        byte[] bArr = xVar2.a;
                        if (!z13) {
                            i15 = 0;
                        }
                        bArr[0] = (byte) (i15 | 8);
                        xVar2.G(0);
                        a0Var.a(1, xVar2);
                        this.T++;
                        xVar3.G(0);
                        a0Var.a(8, xVar3);
                        this.T += 8;
                    }
                    if (z13) {
                        if (!this.X) {
                            mVar.readFully(xVar2.a, 0, 1);
                            this.S++;
                            xVar2.G(0);
                            this.Y = xVar2.v();
                            this.X = true;
                        }
                        int i16 = this.Y * 4;
                        xVar2.D(i16);
                        mVar.readFully(xVar2.a, 0, i16);
                        this.S += i16;
                        short s5 = (short) ((this.Y / 2) + 1);
                        int i17 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f17187o;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f17187o = ByteBuffer.allocate(i17);
                        }
                        this.f17187o.position(0);
                        this.f17187o.putShort(s5);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i18 >= i11) {
                                break;
                            }
                            int y4 = xVar2.y();
                            if (i18 % 2 == 0) {
                                this.f17187o.putShort((short) (y4 - i19));
                            } else {
                                this.f17187o.putInt(y4 - i19);
                            }
                            i18++;
                            i19 = y4;
                        }
                        int i20 = (i10 - this.S) - i19;
                        if (i11 % 2 == 1) {
                            this.f17187o.putInt(i20);
                        } else {
                            this.f17187o.putShort((short) i20);
                            this.f17187o.putInt(0);
                        }
                        byte[] array = this.f17187o.array();
                        x xVar4 = this.f17185m;
                        xVar4.E(array, i17);
                        a0Var.a(i17, xVar4);
                        this.T += i17;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f17149i;
                if (bArr2 != null) {
                    xVar.E(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(cVar.f17142b)) {
                z11 = z10;
            } else if (cVar.f17146f > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.O |= 268435456;
                this.f17186n.D(0);
                int i21 = (xVar.f22600c + i10) - this.S;
                xVar2.D(4);
                byte[] bArr3 = xVar2.a;
                bArr3[0] = (byte) ((i21 >> 24) & 255);
                bArr3[1] = (byte) ((i21 >> 16) & 255);
                bArr3[2] = (byte) ((i21 >> 8) & 255);
                bArr3[3] = (byte) (i21 & 255);
                a0Var.a(4, xVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i22 = i10 + xVar.f22600c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f17142b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f17142b)) {
            if (cVar.T != null) {
                if (xVar.f22600c != 0) {
                    z15 = false;
                }
                u0.m(z15);
                cVar.T.c(mVar);
            }
            while (true) {
                int i23 = this.S;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int i25 = xVar.f22600c - xVar.f22599b;
                if (i25 > 0) {
                    b10 = Math.min(i24, i25);
                    a0Var.a(b10, xVar);
                } else {
                    b10 = a0Var.b(mVar, i24, false);
                }
                this.S += b10;
                this.T += b10;
            }
        } else {
            x xVar5 = this.f17178f;
            byte[] bArr4 = xVar5.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i26 = cVar.Y;
            int i27 = 4 - i26;
            while (this.S < i22) {
                int i28 = this.U;
                if (i28 == 0) {
                    int min = Math.min(i26, xVar.f22600c - xVar.f22599b);
                    mVar.readFully(bArr4, i27 + min, i26 - min);
                    if (min > 0) {
                        xVar.d(bArr4, i27, min);
                    }
                    this.S += i26;
                    xVar5.G(0);
                    this.U = xVar5.y();
                    x xVar6 = this.f17177e;
                    xVar6.G(0);
                    a0Var.a(4, xVar6);
                    this.T += 4;
                } else {
                    int i29 = xVar.f22600c - xVar.f22599b;
                    if (i29 > 0) {
                        b3 = Math.min(i28, i29);
                        a0Var.a(b3, xVar);
                    } else {
                        b3 = a0Var.b(mVar, i28, false);
                    }
                    this.S += b3;
                    this.T += b3;
                    this.U -= b3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f17142b)) {
            x xVar7 = this.f17180h;
            xVar7.G(0);
            a0Var.a(4, xVar7);
            this.T += 4;
        }
        int i30 = this.T;
        i();
        return i30;
    }

    public final void l(m mVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f17183k;
        byte[] bArr2 = xVar.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        mVar.readFully(xVar.a, bArr.length, i10);
        xVar.G(0);
        xVar.F(length);
    }

    @Override // y7.l
    public final void release() {
    }

    @Override // y7.l
    public final void seek(long j3, long j10) {
        this.B = C.TIME_UNSET;
        this.G = 0;
        b bVar = this.a;
        bVar.f17139e = 0;
        bVar.f17136b.clear();
        e eVar = bVar.f17137c;
        eVar.f17199b = 0;
        eVar.f17200c = 0;
        e eVar2 = this.f17173b;
        eVar2.f17199b = 0;
        eVar2.f17200c = 0;
        i();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f17175c;
            if (i10 < sparseArray.size()) {
                b0 b0Var = ((c) sparseArray.valueAt(i10)).T;
                if (b0Var != null) {
                    b0Var.f27950b = false;
                    b0Var.f27951c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
