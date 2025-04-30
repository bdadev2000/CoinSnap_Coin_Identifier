package k;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2407D {

    /* renamed from: d, reason: collision with root package name */
    public static C2407D f21227d;

    /* renamed from: a, reason: collision with root package name */
    public long f21228a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public int f21229c;

    public final void a(double d2, double d9, long j7) {
        double d10 = (0.01720197f * (((float) (j7 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d9) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d11 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d11))) / (Math.cos(asin) * Math.cos(d11));
        if (sin3 >= 1.0d) {
            this.f21229c = 1;
            this.f21228a = -1L;
            this.b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f21229c = 0;
                this.f21228a = -1L;
                this.b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f21228a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round;
            if (round < j7 && this.f21228a > j7) {
                this.f21229c = 0;
            } else {
                this.f21229c = 1;
            }
        }
    }
}
