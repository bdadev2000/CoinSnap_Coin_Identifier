package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import d0.b0;
import h0.g;
import kotlin.jvm.internal.r;
import q0.l;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class SheetState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11197a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11198b;

    /* renamed from: c, reason: collision with root package name */
    public final AnchoredDraggableState f11199c;

    /* renamed from: androidx.compose.material3.SheetState$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public SheetState(boolean z2, Density density, SheetValue sheetValue, l lVar, boolean z3) {
        this.f11197a = z2;
        this.f11198b = z3;
        if (z2 && sheetValue == SheetValue.f11208c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z3 && sheetValue == SheetValue.f11206a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        this.f11199c = new AnchoredDraggableState(sheetValue, new SheetState$anchoredDraggableState$1(density), new SheetState$anchoredDraggableState$2(density), SheetDefaultsKt.f11188b, lVar);
    }

    public static Object a(SheetState sheetState, SheetValue sheetValue, g gVar) {
        Object d = AnchoredDraggableKt.d(sheetState.f11199c, sheetValue, sheetState.f11199c.f12829l.c(), gVar);
        return d == i0.a.f30806a ? d : b0.f30125a;
    }

    public final SheetValue b() {
        return (SheetValue) this.f11199c.f12824g.getValue();
    }

    public final Object c(g gVar) {
        if (!(!this.f11198b)) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object a2 = a(this, SheetValue.f11206a, gVar);
        return a2 == i0.a.f30806a ? a2 : b0.f30125a;
    }

    public final boolean d() {
        return this.f11199c.f12824g.getValue() != SheetValue.f11206a;
    }

    public final Object e(g gVar) {
        if (!(!this.f11197a)) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object a2 = a(this, SheetValue.f11208c, gVar);
        return a2 == i0.a.f30806a ? a2 : b0.f30125a;
    }
}
