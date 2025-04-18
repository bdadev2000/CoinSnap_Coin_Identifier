package b9;

import android.text.SpannableStringBuilder;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import n9.o;
import n9.x;
import v8.u0;
import y7.c0;

/* loaded from: classes3.dex */
public final class f extends i {

    /* renamed from: g, reason: collision with root package name */
    public final x f2391g = new x();

    /* renamed from: h, reason: collision with root package name */
    public final c0 f2392h = new c0(2);

    /* renamed from: i, reason: collision with root package name */
    public int f2393i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f2394j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f2395k;

    /* renamed from: l, reason: collision with root package name */
    public e f2396l;

    /* renamed from: m, reason: collision with root package name */
    public List f2397m;

    /* renamed from: n, reason: collision with root package name */
    public List f2398n;

    /* renamed from: o, reason: collision with root package name */
    public c0 f2399o;

    /* renamed from: p, reason: collision with root package name */
    public int f2400p;

    public f(int i10, List list) {
        this.f2394j = i10 == -1 ? 1 : i10;
        if (list != null && (list.size() != 1 || ((byte[]) list.get(0)).length != 1 || ((byte[]) list.get(0))[0] != 1)) {
        }
        this.f2395k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f2395k[i11] = new e();
        }
        this.f2396l = this.f2395k[0];
    }

    @Override // b9.i
    public final j b() {
        List list = this.f2397m;
        this.f2398n = list;
        list.getClass();
        return new j(list, 0);
    }

    @Override // b9.i
    public final void c(g gVar) {
        boolean z10;
        ByteBuffer byteBuffer = gVar.f26890f;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.f2391g;
        xVar.E(array, limit);
        while (xVar.f22600c - xVar.f22599b >= 3) {
            int v10 = xVar.v() & 7;
            int i10 = v10 & 3;
            boolean z11 = false;
            if ((v10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte v11 = (byte) xVar.v();
            byte v12 = (byte) xVar.v();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        f();
                        int i11 = (v11 & 192) >> 6;
                        int i12 = this.f2393i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            h();
                            o.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2393i + " current=" + i11);
                        }
                        this.f2393i = i11;
                        int i13 = v11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c0 c0Var = new c0(i11, i13);
                        this.f2399o = c0Var;
                        byte[] bArr = c0Var.f27958d;
                        int i14 = c0Var.f27959e;
                        c0Var.f27959e = i14 + 1;
                        bArr[i14] = v12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        u0.d(z11);
                        c0 c0Var2 = this.f2399o;
                        if (c0Var2 == null) {
                            o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0Var2.f27958d;
                            int i15 = c0Var2.f27959e;
                            int i16 = i15 + 1;
                            bArr2[i15] = v11;
                            c0Var2.f27959e = i16 + 1;
                            bArr2[i16] = v12;
                        }
                    }
                    c0 c0Var3 = this.f2399o;
                    if (c0Var3.f27959e == (c0Var3.f27957c * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // b9.i
    public final boolean e() {
        return this.f2397m != this.f2398n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0141. Please report as an issue. */
    public final void f() {
        int i10;
        String str;
        c0 c0Var = this.f2399o;
        if (c0Var == null) {
            return;
        }
        int i11 = 2;
        String str2 = "Cea708Decoder";
        if (c0Var.f27959e != (c0Var.f27957c * 2) - 1) {
            StringBuilder sb2 = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.f2399o.f27957c * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.f2399o.f27959e);
            sb2.append(" (sequence number ");
            sb2.append(this.f2399o.f27956b);
            sb2.append(");");
            o.b("Cea708Decoder", sb2.toString());
        }
        c0 c0Var2 = this.f2399o;
        byte[] bArr = c0Var2.f27958d;
        int i12 = c0Var2.f27959e;
        c0 c0Var3 = this.f2392h;
        c0Var3.n(bArr, i12);
        boolean z10 = false;
        while (true) {
            if (c0Var3.b() > 0) {
                int i13 = 3;
                int i14 = c0Var3.i(3);
                int i15 = c0Var3.i(5);
                if (i14 == 7) {
                    c0Var3.r(i11);
                    i14 = c0Var3.i(6);
                    if (i14 < 7) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid extended service number: ", i14, str2);
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        o.f(str2, "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f2394j) {
                    c0Var3.s(i15);
                } else {
                    int g10 = (i15 * 8) + c0Var3.g();
                    while (c0Var3.g() < g10) {
                        int i16 = c0Var3.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 != i13) {
                                        if (i16 != 8) {
                                            switch (i16) {
                                                case 12:
                                                    h();
                                                    break;
                                                case 13:
                                                    this.f2396l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        o.f(str2, "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        c0Var3.r(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        o.f(str2, "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        c0Var3.r(16);
                                                        break;
                                                    } else {
                                                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid C0 command: ", i16, str2);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f2396l.f2371b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f2397m = g();
                                    }
                                }
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f2396l.a((char) 9835);
                                } else {
                                    this.f2396l.a((char) (i16 & 255));
                                }
                                z10 = true;
                            } else {
                                if (i16 <= 159) {
                                    e[] eVarArr = this.f2395k;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str = str2;
                                            i10 = g10;
                                            z10 = true;
                                            int i17 = i16 - 128;
                                            if (this.f2400p != i17) {
                                                this.f2400p = i17;
                                                this.f2396l = eVarArr[i17];
                                            }
                                            str2 = str;
                                            break;
                                        case 136:
                                            str = str2;
                                            i10 = g10;
                                            z10 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (c0Var3.h()) {
                                                    e eVar = eVarArr[8 - i18];
                                                    eVar.a.clear();
                                                    eVar.f2371b.clear();
                                                    eVar.f2385p = -1;
                                                    eVar.f2386q = -1;
                                                    eVar.f2387r = -1;
                                                    eVar.f2389t = -1;
                                                    eVar.f2390v = 0;
                                                }
                                            }
                                            str2 = str;
                                            break;
                                        case 137:
                                            str = str2;
                                            i10 = g10;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (c0Var3.h()) {
                                                    eVarArr[8 - i19].f2373d = true;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 138:
                                            str = str2;
                                            i10 = g10;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (c0Var3.h()) {
                                                    eVarArr[8 - i20].f2373d = false;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 139:
                                            str = str2;
                                            i10 = g10;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (c0Var3.h()) {
                                                    eVarArr[8 - i21].f2373d = !r3.f2373d;
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 140:
                                            str = str2;
                                            i10 = g10;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (c0Var3.h()) {
                                                    eVarArr[8 - i22].d();
                                                }
                                            }
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 141:
                                            str = str2;
                                            i10 = g10;
                                            c0Var3.r(8);
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 142:
                                            str = str2;
                                            i10 = g10;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 143:
                                            str = str2;
                                            i10 = g10;
                                            h();
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 144:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f2396l.f2372c) {
                                                c0Var3.r(16);
                                                i13 = 3;
                                                z10 = true;
                                                str2 = str;
                                                break;
                                            } else {
                                                c0Var3.i(4);
                                                c0Var3.i(2);
                                                c0Var3.i(2);
                                                boolean h10 = c0Var3.h();
                                                boolean h11 = c0Var3.h();
                                                c0Var3.i(3);
                                                c0Var3.i(3);
                                                this.f2396l.e(h10, h11);
                                                i13 = 3;
                                                z10 = true;
                                                str2 = str;
                                            }
                                        case 145:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f2396l.f2372c) {
                                                c0Var3.r(24);
                                            } else {
                                                int c10 = e.c(c0Var3.i(2), c0Var3.i(2), c0Var3.i(2), c0Var3.i(2));
                                                int c11 = e.c(c0Var3.i(2), c0Var3.i(2), c0Var3.i(2), c0Var3.i(2));
                                                c0Var3.r(2);
                                                e.c(c0Var3.i(2), c0Var3.i(2), c0Var3.i(2), 0);
                                                this.f2396l.f(c10, c11);
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 146:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f2396l.f2372c) {
                                                c0Var3.r(16);
                                            } else {
                                                c0Var3.r(4);
                                                int i23 = c0Var3.i(4);
                                                c0Var3.r(2);
                                                c0Var3.i(6);
                                                e eVar2 = this.f2396l;
                                                if (eVar2.f2390v != i23) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f2390v = i23;
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            i10 = g10;
                                            z10 = true;
                                            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid C1 command: ", i16, str2);
                                            break;
                                        case 151:
                                            str = str2;
                                            i10 = g10;
                                            if (!this.f2396l.f2372c) {
                                                c0Var3.r(32);
                                            } else {
                                                int c12 = e.c(c0Var3.i(2), c0Var3.i(2), c0Var3.i(2), c0Var3.i(2));
                                                c0Var3.i(2);
                                                e.c(c0Var3.i(2), c0Var3.i(2), c0Var3.i(2), 0);
                                                c0Var3.h();
                                                c0Var3.h();
                                                c0Var3.i(2);
                                                c0Var3.i(2);
                                                int i24 = c0Var3.i(2);
                                                c0Var3.r(8);
                                                e eVar3 = this.f2396l;
                                                eVar3.f2384o = c12;
                                                eVar3.f2381l = i24;
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i16 - 152;
                                            e eVar4 = eVarArr[i25];
                                            c0Var3.r(i11);
                                            boolean h12 = c0Var3.h();
                                            boolean h13 = c0Var3.h();
                                            c0Var3.h();
                                            int i26 = c0Var3.i(i13);
                                            boolean h14 = c0Var3.h();
                                            int i27 = c0Var3.i(7);
                                            int i28 = c0Var3.i(8);
                                            int i29 = c0Var3.i(4);
                                            int i30 = c0Var3.i(4);
                                            c0Var3.r(i11);
                                            i10 = g10;
                                            c0Var3.i(6);
                                            c0Var3.r(i11);
                                            int i31 = c0Var3.i(3);
                                            int i32 = c0Var3.i(3);
                                            str = str2;
                                            eVar4.f2372c = true;
                                            eVar4.f2373d = h12;
                                            eVar4.f2380k = h13;
                                            eVar4.f2374e = i26;
                                            eVar4.f2375f = h14;
                                            eVar4.f2376g = i27;
                                            eVar4.f2377h = i28;
                                            eVar4.f2378i = i29;
                                            int i33 = i30 + 1;
                                            if (eVar4.f2379j != i33) {
                                                eVar4.f2379j = i33;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.a;
                                                    if ((h13 && arrayList.size() >= eVar4.f2379j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && eVar4.f2382m != i31) {
                                                eVar4.f2382m = i31;
                                                int i34 = i31 - 1;
                                                int i35 = e.C[i34];
                                                boolean z11 = e.B[i34];
                                                int i36 = e.f2370z[i34];
                                                int i37 = e.A[i34];
                                                int i38 = e.f2369y[i34];
                                                eVar4.f2384o = i35;
                                                eVar4.f2381l = i38;
                                            }
                                            if (i32 != 0 && eVar4.f2383n != i32) {
                                                eVar4.f2383n = i32;
                                                int i39 = i32 - 1;
                                                int i40 = e.E[i39];
                                                int i41 = e.D[i39];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f2367w, e.F[i39]);
                                            }
                                            if (this.f2400p != i25) {
                                                this.f2400p = i25;
                                                this.f2396l = eVarArr[i25];
                                            }
                                            i13 = 3;
                                            z10 = true;
                                            str2 = str;
                                            break;
                                    }
                                } else {
                                    i10 = g10;
                                    if (i16 <= 255) {
                                        this.f2396l.a((char) (i16 & 255));
                                        z10 = true;
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid base command: ", i16, str2);
                                    }
                                }
                                i11 = 2;
                            }
                            i10 = g10;
                        } else {
                            i10 = g10;
                            int i42 = c0Var3.i(8);
                            if (i42 <= 31) {
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        c0Var3.r(8);
                                    } else if (i42 <= 23) {
                                        c0Var3.r(16);
                                    } else if (i42 <= 31) {
                                        c0Var3.r(24);
                                    }
                                }
                            } else if (i42 <= 127) {
                                if (i42 != 32) {
                                    if (i42 != 33) {
                                        if (i42 != 37) {
                                            if (i42 != 42) {
                                                if (i42 != 44) {
                                                    if (i42 != 63) {
                                                        if (i42 != 57) {
                                                            if (i42 != 58) {
                                                                if (i42 != 60) {
                                                                    if (i42 != 61) {
                                                                        switch (i42) {
                                                                            case 48:
                                                                                this.f2396l.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f2396l.a(Typography.leftSingleQuote);
                                                                                break;
                                                                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                                                                this.f2396l.a(Typography.rightSingleQuote);
                                                                                break;
                                                                            case 51:
                                                                                this.f2396l.a(Typography.leftDoubleQuote);
                                                                                break;
                                                                            case 52:
                                                                                this.f2396l.a(Typography.rightDoubleQuote);
                                                                                break;
                                                                            case 53:
                                                                                this.f2396l.a(Typography.bullet);
                                                                                break;
                                                                            default:
                                                                                switch (i42) {
                                                                                    case 118:
                                                                                        this.f2396l.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f2396l.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f2396l.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f2396l.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f2396l.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f2396l.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f2396l.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f2396l.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f2396l.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f2396l.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid G2 character: ", i42, str2);
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f2396l.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f2396l.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f2396l.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f2396l.a(Typography.tm);
                                                        }
                                                    } else {
                                                        this.f2396l.a((char) 376);
                                                    }
                                                } else {
                                                    this.f2396l.a((char) 338);
                                                }
                                            } else {
                                                this.f2396l.a((char) 352);
                                            }
                                        } else {
                                            this.f2396l.a(Typography.ellipsis);
                                        }
                                    } else {
                                        this.f2396l.a(Typography.nbsp);
                                    }
                                } else {
                                    this.f2396l.a(' ');
                                }
                                z10 = true;
                            } else if (i42 <= 159) {
                                if (i42 <= 135) {
                                    c0Var3.r(32);
                                } else if (i42 <= 143) {
                                    c0Var3.r(40);
                                } else if (i42 <= 159) {
                                    i11 = 2;
                                    c0Var3.r(2);
                                    c0Var3.r(c0Var3.i(6) * 8);
                                }
                            } else {
                                if (i42 <= 255) {
                                    if (i42 == 160) {
                                        this.f2396l.a((char) 13252);
                                    } else {
                                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid G3 character: ", i42, str2);
                                        this.f2396l.a('_');
                                    }
                                    z10 = true;
                                } else {
                                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.v("Invalid extended command: ", i42, str2);
                                }
                                i11 = 2;
                            }
                            i11 = 2;
                        }
                        g10 = i10;
                    }
                }
            }
        }
        if (z10) {
            this.f2397m = g();
        }
        this.f2399o = null;
    }

    @Override // b9.i, w7.e
    public final void flush() {
        super.flush();
        this.f2397m = null;
        this.f2398n = null;
        this.f2400p = 0;
        this.f2396l = this.f2395k[0];
        h();
        this.f2399o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List g() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.f.g():java.util.List");
    }

    public final void h() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f2395k[i10].d();
        }
    }
}
