package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import q0.q;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GenericShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final q f5390a;

    public GenericShape(q qVar) {
        this.f5390a = qVar;
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        AndroidPath a2 = AndroidPath_androidKt.a();
        this.f5390a.invoke(a2, new Size(j2), layoutDirection);
        a2.close();
        return new Outline.Generic(a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.f5390a : null) == this.f5390a;
    }

    public final int hashCode() {
        return this.f5390a.hashCode();
    }
}
