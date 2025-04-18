package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import d0.b0;
import h0.g;
import kotlin.jvm.internal.r;
import q0.l;

@Stable
/* loaded from: classes2.dex */
public final class DrawerState {

    /* renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState f9247a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9248b;

    /* renamed from: androidx.compose.material3.DrawerState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public DrawerState(DrawerValue drawerValue, l lVar) {
        ParcelableSnapshotMutableState f2;
        this.f9247a = new AnchoredDraggableState(drawerValue, DrawerState$anchoredDraggableState$1.f9251a, new DrawerState$anchoredDraggableState$2(this), NavigationDrawerKt.f10044c, lVar);
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f9248b = f2;
    }

    public final Object a(g gVar) {
        DrawerValue drawerValue = DrawerValue.f9261a;
        TweenSpec tweenSpec = NavigationDrawerKt.f10044c;
        AnchoredDraggableState anchoredDraggableState = this.f9247a;
        Object b2 = anchoredDraggableState.b(drawerValue, MutatePriority.f2811a, new DrawerState$animateTo$3(this, anchoredDraggableState.f12829l.c(), tweenSpec, null), gVar);
        i0.a aVar = i0.a.f30806a;
        b0 b0Var = b0.f30125a;
        if (b2 != aVar) {
            b2 = b0Var;
        }
        return b2 == aVar ? b2 : b0Var;
    }
}
