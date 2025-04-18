package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import e0.u;
import h0.g;
import i0.a;
import java.util.List;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyListAnimateScrollScope implements LazyLayoutAnimateScrollScope {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f4283a;

    public LazyListAnimateScrollScope(LazyListState lazyListState) {
        this.f4283a = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int a() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) u.M0(this.f4283a.i().h());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final void b(int i2, int i3) {
        this.f4283a.k(i2, i3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final float c(int i2) {
        Object obj;
        LazyListLayoutInfo i3 = this.f4283a.i();
        if (i3.h().isEmpty()) {
            return 0.0f;
        }
        List h2 = i3.h();
        int size = h2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = h2.get(i4);
            if (((LazyListItemInfo) obj).getIndex() == i2) {
                break;
            }
            i4++;
        }
        if (((LazyListItemInfo) obj) != null) {
            return r6.a();
        }
        List h3 = i3.h();
        int size2 = h3.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            i5 += ((LazyListItemInfo) h3.get(i6)).getSize();
        }
        return ((i2 - r0.g()) * (i3.i() + (i5 / h3.size()))) - r0.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int d() {
        return this.f4283a.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int e() {
        return this.f4283a.g();
    }

    public final Object f(p pVar, g gVar) {
        Object b2 = this.f4283a.b(MutatePriority.f2811a, pVar, gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int getItemCount() {
        return this.f4283a.i().f();
    }
}
