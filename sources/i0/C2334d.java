package i0;

import D3.h;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334d {

    /* renamed from: a, reason: collision with root package name */
    public double f20628a;
    public double b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20629c;

    /* renamed from: d, reason: collision with root package name */
    public double f20630d;

    /* renamed from: e, reason: collision with root package name */
    public double f20631e;

    /* renamed from: f, reason: collision with root package name */
    public double f20632f;

    /* renamed from: g, reason: collision with root package name */
    public double f20633g;

    /* renamed from: h, reason: collision with root package name */
    public double f20634h;

    /* renamed from: i, reason: collision with root package name */
    public double f20635i;

    /* renamed from: j, reason: collision with root package name */
    public final h f20636j;

    /* JADX WARN: Type inference failed for: r0v5, types: [D3.h, java.lang.Object] */
    public C2334d() {
        this.f20628a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f20629c = false;
        this.f20635i = Double.MAX_VALUE;
        this.f20636j = new Object();
    }

    public final h a(double d2, double d9, long j7) {
        double cos;
        double d10;
        if (!this.f20629c) {
            if (this.f20635i != Double.MAX_VALUE) {
                double d11 = this.b;
                if (d11 > 1.0d) {
                    double d12 = this.f20628a;
                    this.f20632f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.b;
                    double d14 = this.f20628a;
                    this.f20633g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.f20634h = Math.sqrt(1.0d - (d11 * d11)) * this.f20628a;
                }
                this.f20629c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j7 / 1000.0d;
        double d16 = d2 - this.f20635i;
        double d17 = this.b;
        if (d17 > 1.0d) {
            double d18 = this.f20633g;
            double d19 = this.f20632f;
            double d20 = d16 - (((d18 * d16) - d9) / (d18 - d19));
            double d21 = ((d16 * d18) - d9) / (d18 - d19);
            d10 = (Math.pow(2.718281828459045d, this.f20632f * d15) * d21) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d22 = this.f20633g;
            double pow = Math.pow(2.718281828459045d, d22 * d15) * d20 * d22;
            double d23 = this.f20632f;
            cos = (Math.pow(2.718281828459045d, d23 * d15) * d21 * d23) + pow;
        } else if (d17 == 1.0d) {
            double d24 = this.f20628a;
            double d25 = (d24 * d16) + d9;
            double d26 = (d25 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d24) * d15) * d26;
            double pow3 = Math.pow(2.718281828459045d, (-this.f20628a) * d15) * d26;
            double d27 = this.f20628a;
            cos = (Math.pow(2.718281828459045d, (-d27) * d15) * d25) + (pow3 * (-d27));
            d10 = pow2;
        } else {
            double d28 = 1.0d / this.f20634h;
            double d29 = this.f20628a;
            double d30 = ((d17 * d29 * d16) + d9) * d28;
            double sin = ((Math.sin(this.f20634h * d15) * d30) + (Math.cos(this.f20634h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d29 * d15);
            double d31 = this.f20628a;
            double d32 = this.b;
            double d33 = (-d31) * sin * d32;
            double pow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d15);
            double d34 = this.f20634h;
            double sin2 = Math.sin(d34 * d15) * (-d34) * d16;
            double d35 = this.f20634h;
            cos = (((Math.cos(d35 * d15) * d30 * d35) + sin2) * pow4) + d33;
            d10 = sin;
        }
        float f9 = (float) (d10 + this.f20635i);
        h hVar = this.f20636j;
        hVar.f744a = f9;
        hVar.b = (float) cos;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [D3.h, java.lang.Object] */
    public C2334d(float f9) {
        this.f20628a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f20629c = false;
        this.f20636j = new Object();
        this.f20635i = f9;
    }
}
