package u7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* loaded from: classes3.dex */
public final class s0 implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f25644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25646d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25647e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25649g;

    public s0() {
        this.f25644b = 250000;
        this.f25645c = 750000;
        this.f25646d = 4;
        this.f25647e = 250000;
        this.f25648f = 50000000;
        this.f25649g = 2;
    }

    public static int a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    public s0(s0 s0Var) {
        this.f25644b = s0Var.f25644b;
        this.f25645c = s0Var.f25645c;
        this.f25646d = s0Var.f25646d;
        this.f25647e = s0Var.f25647e;
        this.f25648f = s0Var.f25648f;
        this.f25649g = s0Var.f25649g;
    }

    public s0(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f25644b = i10;
        this.f25645c = i11;
        this.f25646d = i12;
        this.f25647e = i13;
        this.f25648f = i14;
        this.f25649g = i15;
    }
}
