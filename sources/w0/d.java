package w0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f31404a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31405b;

    public d(float f2, float f3) {
        this.f31404a = f2;
        this.f31405b = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return this.f31404a > this.f31405b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!a() || !((d) obj).a()) {
                d dVar = (d) obj;
                if (this.f31404a != dVar.f31404a || this.f31405b != dVar.f31405b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.hashCode(this.f31404a) * 31) + Float.hashCode(this.f31405b);
    }

    public final String toString() {
        return this.f31404a + ".." + this.f31405b;
    }
}
