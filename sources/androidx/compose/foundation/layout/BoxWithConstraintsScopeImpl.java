package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;

/* loaded from: classes3.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {

    /* renamed from: a, reason: collision with root package name */
    public final Density f3826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BoxScopeInstance f3828c = BoxScopeInstance.f3816a;

    public BoxWithConstraintsScopeImpl(Density density, long j2) {
        this.f3826a = density;
        this.f3827b = j2;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier a(Modifier modifier, BiasAlignment biasAlignment) {
        return this.f3828c.a(modifier, biasAlignment);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return p0.a.g(this.f3826a, boxWithConstraintsScopeImpl.f3826a) && Constraints.c(this.f3827b, boxWithConstraintsScopeImpl.f3827b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3827b) + (this.f3826a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f3826a + ", constraints=" + ((Object) Constraints.m(this.f3827b)) + ')';
    }
}
