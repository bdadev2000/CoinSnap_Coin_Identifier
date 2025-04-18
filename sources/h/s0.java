package h;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: d, reason: collision with root package name */
    public static s0 f18658d;

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f18659e = new s0(-3, C.TIME_UNSET, -1L);
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public long f18660b;

    /* renamed from: c, reason: collision with root package name */
    public long f18661c;

    public s0() {
    }

    public s0(int i10, long j3, long j10) {
        this.a = i10;
        this.f18660b = j3;
        this.f18661c = j10;
    }

    public static s0 b(long j3) {
        return new s0(0, C.TIME_UNSET, j3);
    }

    public void a(long j3, double d10, double d11) {
        double d12 = (0.01720197f * (((float) (j3 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.a = 1;
            this.f18660b = -1L;
            this.f18661c = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.a = 0;
                this.f18660b = -1L;
                this.f18661c = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f18660b = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f18661c = round;
            if (round < j3 && this.f18660b > j3) {
                this.a = 0;
            } else {
                this.a = 1;
            }
        }
    }

    public s0(long j3, long j10, int i10) {
        this.f18660b = j3;
        this.f18661c = j10;
        this.a = i10;
    }
}
