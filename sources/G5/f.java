package G5;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: i, reason: collision with root package name */
    public static final f[] f1287i = {new f(3, 5, 8, 8, 1, 3, 5, false), new f(5, 7, 10, 10, 1, 5, 7, false), new f(5, 7, 16, 6, 1, 5, 7, true), new f(8, 10, 12, 12, 1, 8, 10, false), new f(10, 11, 14, 6, 2, 10, 11, true), new f(12, 12, 14, 14, 1, 12, 12, false), new f(16, 14, 24, 10, 1, 16, 14, true), new f(18, 14, 16, 16, 1, 18, 14, false), new f(22, 18, 18, 18, 1, 22, 18, false), new f(22, 18, 16, 10, 2, 22, 18, true), new f(30, 20, 20, 20, 1, 30, 20, false), new f(32, 24, 16, 14, 2, 32, 24, true), new f(36, 24, 22, 22, 1, 36, 24, false), new f(44, 28, 24, 24, 1, 44, 28, false), new f(49, 28, 22, 14, 2, 49, 28, true), new f(62, 36, 14, 14, 4, 62, 36, false), new f(86, 42, 16, 16, 4, 86, 42, false), new f(114, 48, 18, 18, 4, 114, 48, false), new f(144, 56, 20, 20, 4, 144, 56, false), new f(174, 68, 22, 22, 4, 174, 68, false), new f(204, 84, 24, 24, 4, 102, 42, false), new f(280, 112, 14, 14, 16, 140, 56, false), new f(368, 144, 16, 16, 16, 92, 36, false), new f(456, PsExtractor.AUDIO_STREAM, 18, 18, 16, 114, 48, false), new f(576, 224, 20, 20, 16, 144, 56, false), new f(696, 272, 22, 22, 16, 174, 68, false), new f(816, 336, 24, 24, 16, 136, 56, false), new f(1050, TTAdConstant.DOWNLOAD_URL_CODE, 18, 18, 36, 175, 68, false), new f(1304, 496, 20, 20, 36, 163, 62, false), new f(1558, 620, 22, 22, 36, -1, 62, false)};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1288a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1289c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1290d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1291e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1292f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1293g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1294h;

    public f(int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z8) {
        this.f1288a = z8;
        this.b = i9;
        this.f1289c = i10;
        this.f1290d = i11;
        this.f1291e = i12;
        this.f1292f = i13;
        this.f1293g = i14;
        this.f1294h = i15;
    }

    public static f e(int i9, g gVar) {
        f[] fVarArr = f1287i;
        for (int i10 = 0; i10 < 30; i10++) {
            f fVar = fVarArr[i10];
            if ((gVar != g.f1295c || !fVar.f1288a) && ((gVar != g.f1296d || fVar.f1288a) && i9 <= fVar.b)) {
                return fVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i9)));
    }

    public int a(int i9) {
        return this.f1293g;
    }

    public final int b() {
        int i9 = 1;
        int i10 = this.f1292f;
        if (i10 != 1) {
            i9 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i9;
    }

    public int c() {
        return this.b / this.f1293g;
    }

    public final int d() {
        int i9 = this.f1292f;
        if (i9 == 1 || i9 == 2) {
            return 1;
        }
        if (i9 == 4) {
            return 2;
        }
        if (i9 == 16) {
            return 4;
        }
        if (i9 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f1288a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        int i9 = this.f1290d;
        sb.append(i9);
        sb.append('x');
        int i10 = this.f1291e;
        sb.append(i10);
        sb.append(", symbol size ");
        sb.append((b() * i9) + (b() << 1));
        sb.append('x');
        sb.append((d() * i10) + (d() << 1));
        sb.append(", symbol data size ");
        sb.append(b() * i9);
        sb.append('x');
        sb.append(d() * i10);
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.f1289c);
        return sb.toString();
    }
}
