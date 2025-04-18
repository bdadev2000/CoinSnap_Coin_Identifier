package androidx.compose.ui;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CombinedModifier implements Modifier {

    /* renamed from: a, reason: collision with root package name */
    public final Modifier f14679a;

    /* renamed from: b, reason: collision with root package name */
    public final Modifier f14680b;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.f14679a = modifier;
        this.f14680b = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean D(l lVar) {
        return this.f14679a.D(lVar) && this.f14680b.D(lVar);
    }

    @Override // androidx.compose.ui.Modifier
    public final Object G(Object obj, p pVar) {
        return this.f14680b.G(this.f14679a.G(obj, pVar), pVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (a.g(this.f14679a, combinedModifier.f14679a) && a.g(this.f14680b, combinedModifier.f14680b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14680b.hashCode() * 31) + this.f14679a.hashCode();
    }

    public final String toString() {
        return d.q(new StringBuilder("["), (String) G("", CombinedModifier$toString$1.f14681a), ']');
    }
}
