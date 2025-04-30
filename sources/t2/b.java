package t2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f23006a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23007c;

    public b(float f9, float f10, float f11) {
        this.f23006a = f9;
        this.b = f10;
        this.f23007c = f11;
    }

    public final float[] a() {
        return new float[]{this.f23006a, this.b, this.f23007c};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.compare(this.f23006a, bVar.f23006a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.f23007c, bVar.f23007c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23007c) + ((Float.hashCode(this.b) + (Float.hashCode(this.f23006a) * 31)) * 31);
    }

    public final String toString() {
        return "Point3D(x=" + this.f23006a + ", y=" + this.b + ", z=" + this.f23007c + ")";
    }
}
