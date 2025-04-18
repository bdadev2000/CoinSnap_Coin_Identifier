package o;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f31169a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f31170b;

    public d(Bitmap bitmap, Map map) {
        this.f31169a = bitmap;
        this.f31170b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (p0.a.g(this.f31169a, dVar.f31169a) && p0.a.g(this.f31170b, dVar.f31170b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31170b.hashCode() + (this.f31169a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f31169a + ", extras=" + this.f31170b + ')';
    }
}
