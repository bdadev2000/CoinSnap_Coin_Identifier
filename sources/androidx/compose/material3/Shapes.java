package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class Shapes {

    /* renamed from: a, reason: collision with root package name */
    public final CornerBasedShape f11182a;

    /* renamed from: b, reason: collision with root package name */
    public final CornerBasedShape f11183b;

    /* renamed from: c, reason: collision with root package name */
    public final CornerBasedShape f11184c;
    public final CornerBasedShape d;
    public final CornerBasedShape e;

    public Shapes() {
        RoundedCornerShape roundedCornerShape = ShapeDefaults.f11179a;
        RoundedCornerShape roundedCornerShape2 = ShapeDefaults.f11180b;
        RoundedCornerShape roundedCornerShape3 = ShapeDefaults.f11181c;
        RoundedCornerShape roundedCornerShape4 = ShapeDefaults.d;
        RoundedCornerShape roundedCornerShape5 = ShapeDefaults.e;
        this.f11182a = roundedCornerShape;
        this.f11183b = roundedCornerShape2;
        this.f11184c = roundedCornerShape3;
        this.d = roundedCornerShape4;
        this.e = roundedCornerShape5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return p0.a.g(this.f11182a, shapes.f11182a) && p0.a.g(this.f11183b, shapes.f11183b) && p0.a.g(this.f11184c, shapes.f11184c) && p0.a.g(this.d, shapes.d) && p0.a.g(this.e, shapes.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f11184c.hashCode() + ((this.f11183b.hashCode() + (this.f11182a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f11182a + ", small=" + this.f11183b + ", medium=" + this.f11184c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}
