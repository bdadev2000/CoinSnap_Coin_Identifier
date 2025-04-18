package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.l;

@Immutable
/* loaded from: classes3.dex */
public final class ChangeSize {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f1773a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1774b;

    /* renamed from: c, reason: collision with root package name */
    public final FiniteAnimationSpec f1775c;
    public final boolean d;

    /* renamed from: androidx.compose.animation.ChangeSize$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((IntSize) obj).f17493a;
            return new IntSize(IntSizeKt.a(0, 0));
        }
    }

    public ChangeSize(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, l lVar, boolean z2) {
        this.f1773a = alignment;
        this.f1774b = lVar;
        this.f1775c = finiteAnimationSpec;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return p0.a.g(this.f1773a, changeSize.f1773a) && p0.a.g(this.f1774b, changeSize.f1774b) && p0.a.g(this.f1775c, changeSize.f1775c) && this.d == changeSize.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f1775c.hashCode() + ((this.f1774b.hashCode() + (this.f1773a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.f1773a);
        sb.append(", size=");
        sb.append(this.f1774b);
        sb.append(", animationSpec=");
        sb.append(this.f1775c);
        sb.append(", clip=");
        return d.s(sb, this.d, ')');
    }
}
