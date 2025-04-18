package ed;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    public static final e[] f17315i = {new e(false, 3, 5, 8, 8, 1), new e(false, 5, 7, 10, 10, 1), new e(true, 5, 7, 16, 6, 1), new e(false, 8, 10, 12, 12, 1), new e(true, 10, 11, 14, 6, 2), new e(false, 12, 12, 14, 14, 1), new e(true, 16, 14, 24, 10, 1), new e(false, 18, 14, 16, 16, 1), new e(false, 22, 18, 18, 18, 1), new e(true, 22, 18, 16, 10, 2), new e(false, 30, 20, 20, 20, 1), new e(true, 32, 24, 16, 14, 2), new e(false, 36, 24, 22, 22, 1), new e(false, 44, 28, 24, 24, 1), new e(true, 49, 28, 22, 14, 2), new e(false, 62, 36, 14, 14, 4), new e(false, 86, 42, 16, 16, 4), new e(false, 114, 48, 18, 18, 4), new e(false, 144, 56, 20, 20, 4), new e(false, 174, 68, 22, 22, 4), new e(204, 84, 24, 24, 4, 102, 42, false), new e(280, 112, 14, 14, 16, 140, 56, false), new e(368, 144, 16, 16, 16, 92, 36, false), new e(456, PsExtractor.AUDIO_STREAM, 18, 18, 16, 114, 48, false), new e(576, 224, 20, 20, 16, 144, 56, false), new e(696, 272, 22, 22, 16, 174, 68, false), new e(816, 336, 24, 24, 16, 136, 56, false), new e(1050, TTAdConstant.DOWNLOAD_URL_CODE, 18, 18, 36, 175, 68, false), new e(1304, 496, 20, 20, 36, 163, 62, false), new a()};
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17318d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17319e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17320f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17321g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17322h;

    public e(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(i10, i11, i12, i13, i14, i10, i11, z10);
    }

    public static e e(int i10, f fVar) {
        e[] eVarArr = f17315i;
        for (int i11 = 0; i11 < 30; i11++) {
            e eVar = eVarArr[i11];
            if ((fVar != f.FORCE_SQUARE || !eVar.a) && ((fVar != f.FORCE_RECTANGLE || eVar.a) && i10 <= eVar.f17316b)) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public int a(int i10) {
        return this.f17321g;
    }

    public final int b() {
        int i10 = 1;
        int i11 = this.f17320f;
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i10;
    }

    public int c() {
        return this.f17316b / this.f17321g;
    }

    public final int d() {
        int i10 = this.f17320f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        int i10 = this.f17318d;
        sb2.append(i10);
        sb2.append('x');
        int i11 = this.f17319e;
        sb2.append(i11);
        sb2.append(", symbol size ");
        sb2.append((b() * i10) + (b() << 1));
        sb2.append('x');
        sb2.append((d() * i11) + (d() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i10);
        sb2.append('x');
        sb2.append(d() * i11);
        sb2.append(", codewords ");
        sb2.append(this.f17316b);
        sb2.append('+');
        sb2.append(this.f17317c);
        return sb2.toString();
    }

    public e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.a = z10;
        this.f17316b = i10;
        this.f17317c = i11;
        this.f17318d = i12;
        this.f17319e = i13;
        this.f17320f = i14;
        this.f17321g = i15;
        this.f17322h = i16;
    }
}
