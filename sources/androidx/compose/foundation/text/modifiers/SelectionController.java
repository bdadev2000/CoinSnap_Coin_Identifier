package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;

@StabilityInferred
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public final long f6940a;

    /* renamed from: b, reason: collision with root package name */
    public final SelectionRegistrar f6941b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6942c;
    public StaticTextSelectionParams d;

    /* renamed from: f, reason: collision with root package name */
    public Selectable f6943f;

    /* renamed from: g, reason: collision with root package name */
    public final Modifier f6944g;

    public SelectionController(final long j2, final SelectionRegistrar selectionRegistrar, long j3) {
        StaticTextSelectionParams staticTextSelectionParams = StaticTextSelectionParams.f6954c;
        this.f6940a = j2;
        this.f6941b = selectionRegistrar;
        this.f6942c = j3;
        this.d = staticTextSelectionParams;
        final SelectionController$modifier$1 selectionController$modifier$1 = new SelectionController$modifier$1(this);
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1

            /* renamed from: a, reason: collision with root package name */
            public long f6948a = 0;

            /* renamed from: b, reason: collision with root package name */
            public long f6949b = 0;

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void a() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void b(long j4) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$modifier$1.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.B()) {
                        return;
                    }
                    selectionRegistrar2.g(j4, SelectionAdjustment.Companion.f7091c, layoutCoordinates, true);
                    this.f6948a = j4;
                }
                if (SelectionRegistrarKt.a(selectionRegistrar, j2)) {
                    this.f6949b = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void c() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void d(long j4) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$modifier$1.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (layoutCoordinates.B() && SelectionRegistrarKt.a(selectionRegistrar2, j2)) {
                        long k2 = Offset.k(this.f6949b, j4);
                        this.f6949b = k2;
                        long k3 = Offset.k(this.f6948a, k2);
                        if (selectionRegistrar2.e(k3, this.f6948a, SelectionAdjustment.Companion.f7091c, layoutCoordinates, true)) {
                            this.f6948a = k3;
                            this.f6949b = 0L;
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                long j4 = j2;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.a(selectionRegistrar2, j4)) {
                    selectionRegistrar2.h();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                long j4 = j2;
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (SelectionRegistrarKt.a(selectionRegistrar2, j4)) {
                    selectionRegistrar2.h();
                }
            }
        };
        this.f6944g = PointerIconKt.a(SelectionGesturesKt.i(Modifier.Companion.f14687a, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1

            /* renamed from: a, reason: collision with root package name */
            public long f6951a = 0;

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean a(long j4, a aVar) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$modifier$1.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.B()) {
                    return false;
                }
                selectionRegistrar2.g(j4, aVar, layoutCoordinates, false);
                this.f6951a = j4;
                return SelectionRegistrarKt.a(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void b() {
                selectionRegistrar.h();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean c(long j4, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) selectionController$modifier$1.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinates.B() || !SelectionRegistrarKt.a(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.e(j4, this.f6951a, selectionAdjustment, layoutCoordinates, false)) {
                    return true;
                }
                this.f6951a = j4;
                return true;
            }
        }, textDragObserver), TextPointerIcon_androidKt.f6240a);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        Selectable selectable = this.f6943f;
        if (selectable != null) {
            this.f6941b.d(selectable);
            this.f6943f = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        Selectable selectable = this.f6943f;
        if (selectable != null) {
            this.f6941b.d(selectable);
            this.f6943f = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f6943f = this.f6941b.i(new MultiWidgetSelectionDelegate(this.f6940a, new SelectionController$onRemembered$1(this), new SelectionController$onRemembered$2(this)));
    }
}
