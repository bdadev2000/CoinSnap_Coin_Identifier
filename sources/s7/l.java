package s7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class l {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24496b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24497c;

    /* renamed from: d, reason: collision with root package name */
    public long f24498d = C.TIME_UNSET;

    /* renamed from: e, reason: collision with root package name */
    public long f24499e = C.TIME_UNSET;

    /* renamed from: g, reason: collision with root package name */
    public long f24501g = C.TIME_UNSET;

    /* renamed from: h, reason: collision with root package name */
    public long f24502h = C.TIME_UNSET;

    /* renamed from: k, reason: collision with root package name */
    public float f24505k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    public float f24504j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    public float f24506l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public long f24507m = C.TIME_UNSET;

    /* renamed from: f, reason: collision with root package name */
    public long f24500f = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f24503i = C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    public long f24508n = C.TIME_UNSET;

    /* renamed from: o, reason: collision with root package name */
    public long f24509o = C.TIME_UNSET;

    public l(long j3, long j10, float f10) {
        this.a = j3;
        this.f24496b = j10;
        this.f24497c = f10;
    }

    public final void a() {
        long j3 = this.f24498d;
        if (j3 != C.TIME_UNSET) {
            long j10 = this.f24499e;
            if (j10 != C.TIME_UNSET) {
                j3 = j10;
            }
            long j11 = this.f24501g;
            if (j11 != C.TIME_UNSET && j3 < j11) {
                j3 = j11;
            }
            long j12 = this.f24502h;
            if (j12 != C.TIME_UNSET && j3 > j12) {
                j3 = j12;
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f24500f == j3) {
            return;
        }
        this.f24500f = j3;
        this.f24503i = j3;
        this.f24508n = C.TIME_UNSET;
        this.f24509o = C.TIME_UNSET;
        this.f24507m = C.TIME_UNSET;
    }
}
