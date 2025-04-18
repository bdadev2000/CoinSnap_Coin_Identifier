package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import b1.f0;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class SelectionContainerKt$SelectionContainer$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionRegistrarImpl f7107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7109c;
    public final /* synthetic */ p d;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f7110a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SelectionManager f7111b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f7112c;

        /* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C00301 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f7113a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectionManager f7114b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00301(p pVar, SelectionManager selectionManager) {
                super(2);
                this.f7113a = pVar;
                this.f7114b = selectionManager;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Selection e;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    this.f7113a.invoke(composer, 0);
                    final SelectionManager selectionManager = this.f7114b;
                    if (!selectionManager.g() || !selectionManager.d() || (e = selectionManager.e()) == null || p0.a.g(e.f7083a, e.f7084b)) {
                        composer.J(-880741817);
                        composer.D();
                    } else {
                        composer.J(-882227523);
                        Selection e2 = selectionManager.e();
                        if (e2 == null) {
                            composer.J(-882188681);
                        } else {
                            composer.J(-882188680);
                            composer.J(1495564482);
                            List v2 = f0.v(Boolean.TRUE, Boolean.FALSE);
                            int size = v2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                final boolean booleanValue = ((Boolean) v2.get(i2)).booleanValue();
                                boolean a2 = composer.a(booleanValue);
                                Object u2 = composer.u();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                                if (a2 || u2 == composer$Companion$Empty$1) {
                                    u2 = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void a() {
                                            Selection e3;
                                            LayoutCoordinates e4;
                                            SelectionManager selectionManager2 = selectionManager;
                                            boolean z2 = booleanValue;
                                            if ((z2 ? (Offset) selectionManager2.f7226n.getValue() : (Offset) selectionManager2.f7227o.getValue()) == null || (e3 = selectionManager2.e()) == null) {
                                                return;
                                            }
                                            Selectable selectable = (Selectable) selectionManager2.f7215a.f7277c.c((z2 ? e3.f7083a : e3.f7084b).f7088c);
                                            if (selectable == null || (e4 = selectable.e()) == null) {
                                                return;
                                            }
                                            long f2 = selectable.f(e3, z2);
                                            if (OffsetKt.d(f2)) {
                                                return;
                                            }
                                            selectionManager2.f7229q.setValue(new Offset(selectionManager2.j().v(e4, SelectionHandlesKt.a(f2))));
                                            selectionManager2.f7228p.setValue(z2 ? Handle.f5965b : Handle.f5966c);
                                            selectionManager2.n(false);
                                        }

                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void b(long j2) {
                                            SelectionManager selectionManager2 = selectionManager;
                                            if (selectionManager2.c() == null) {
                                                return;
                                            }
                                            Selection e3 = selectionManager2.e();
                                            p0.a.p(e3);
                                            boolean z2 = booleanValue;
                                            Object c2 = selectionManager2.f7215a.f7277c.c((z2 ? e3.f7083a : e3.f7084b).f7088c);
                                            if (c2 == null) {
                                                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
                                            }
                                            Selectable selectable = (Selectable) c2;
                                            LayoutCoordinates e4 = selectable.e();
                                            if (e4 == null) {
                                                throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
                                            }
                                            long f2 = selectable.f(e3, z2);
                                            if (OffsetKt.d(f2)) {
                                                return;
                                            }
                                            selectionManager2.f7224l.setValue(new Offset(selectionManager2.j().v(e4, SelectionHandlesKt.a(f2))));
                                            selectionManager2.f7225m.setValue(new Offset(0L));
                                        }

                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void c() {
                                            SelectionManager selectionManager2 = selectionManager;
                                            selectionManager2.n(true);
                                            selectionManager2.f7228p.setValue(null);
                                            selectionManager2.f7229q.setValue(null);
                                        }

                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void d(long j2) {
                                            SelectionManager selectionManager2 = selectionManager;
                                            if (selectionManager2.c() == null) {
                                                return;
                                            }
                                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = selectionManager2.f7225m;
                                            parcelableSnapshotMutableState.setValue(new Offset(Offset.k(((Offset) parcelableSnapshotMutableState.getValue()).f14913a, j2)));
                                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = selectionManager2.f7224l;
                                            long k2 = Offset.k(((Offset) parcelableSnapshotMutableState2.getValue()).f14913a, ((Offset) parcelableSnapshotMutableState.getValue()).f14913a);
                                            if (selectionManager2.p(k2, ((Offset) selectionManager2.f7224l.getValue()).f14913a, booleanValue, SelectionAdjustment.Companion.e)) {
                                                parcelableSnapshotMutableState2.setValue(new Offset(k2));
                                                parcelableSnapshotMutableState.setValue(new Offset(0L));
                                            }
                                        }

                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void onCancel() {
                                            SelectionManager selectionManager2 = selectionManager;
                                            selectionManager2.n(true);
                                            selectionManager2.f7228p.setValue(null);
                                            selectionManager2.f7229q.setValue(null);
                                        }

                                        @Override // androidx.compose.foundation.text.TextDragObserver
                                        public final void onStop() {
                                            SelectionManager selectionManager2 = selectionManager;
                                            selectionManager2.n(true);
                                            selectionManager2.f7228p.setValue(null);
                                            selectionManager2.f7229q.setValue(null);
                                        }
                                    };
                                    composer.o(u2);
                                }
                                TextDragObserver textDragObserver = (TextDragObserver) u2;
                                boolean a3 = composer.a(booleanValue);
                                Object u3 = composer.u();
                                if (a3 || u3 == composer$Companion$Empty$1) {
                                    u3 = booleanValue ? new SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$1(selectionManager) : new SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2(selectionManager);
                                    composer.o(u3);
                                }
                                q0.a aVar = (q0.a) u3;
                                ResolvedTextDirection resolvedTextDirection = booleanValue ? e2.f7083a.f7086a : e2.f7084b.f7086a;
                                SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(aVar);
                                boolean z2 = e2.f7085c;
                                Modifier.Companion companion = Modifier.Companion.f14687a;
                                boolean w = composer.w(textDragObserver);
                                Object u4 = composer.u();
                                if (w || u4 == composer$Companion$Empty$1) {
                                    u4 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1$1(textDragObserver, null);
                                    composer.o(u4);
                                }
                                AndroidSelectionHandles_androidKt.b(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, resolvedTextDirection, z2, 0L, SuspendingPointerInputFilterKt.b(companion, textDragObserver, (p) u4), composer, 0, 16);
                            }
                            composer.D();
                        }
                        composer.D();
                        composer.D();
                    }
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Modifier modifier, SelectionManager selectionManager, p pVar) {
            super(2);
            this.f7110a = modifier;
            this.f7111b = selectionManager;
            this.f7112c = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Selection e;
            Composer composer = (Composer) obj;
            int intValue = ((Number) obj2).intValue() & 3;
            b0 b0Var = b0.f30125a;
            if (intValue == 2 && composer.i()) {
                composer.A();
            } else {
                SelectionManager selectionManager = this.f7111b;
                selectionManager.getClass();
                Modifier modifier = Modifier.Companion.f14687a;
                Modifier a2 = KeyInputModifierKt.a(SelectionGesturesKt.k(FocusableKt.a(null, FocusChangedModifierKt.a(FocusRequesterModifierKt.a(OnGloballyPositionedModifierKt.a(selectionManager.d() ? SuspendingPointerInputFilterKt.b(modifier, b0Var, new SelectionManager$onClearSelectionRequested$1(selectionManager, new SelectionManager$modifier$1(selectionManager), null)) : modifier, new SelectionManager$modifier$2(selectionManager)), selectionManager.f7220h), new SelectionManager$modifier$3(selectionManager)), true), new SelectionManager$modifier$4(selectionManager)), new SelectionManager$modifier$5(selectionManager));
                if (selectionManager.c() != null && selectionManager.g() && (e = selectionManager.e()) != null && !p0.a.g(e.f7083a, e.f7084b) && Magnifier_androidKt.a()) {
                    modifier = ComposedModifierKt.a(modifier, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager));
                }
                SimpleLayoutKt.a(this.f7110a.T0(a2.T0(modifier)), ComposableLambdaKt.c(1375295262, new C00301(this.f7112c, selectionManager), composer), composer, 48, 0);
            }
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$3(SelectionRegistrarImpl selectionRegistrarImpl, Modifier modifier, SelectionManager selectionManager, p pVar) {
        super(2);
        this.f7107a = selectionRegistrarImpl;
        this.f7108b = modifier;
        this.f7109c = selectionManager;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            CompositionLocalKt.a(SelectionRegistrarKt.f7288a.c(this.f7107a), ComposableLambdaKt.c(935424596, new AnonymousClass1(this.f7108b, this.f7109c, this.d), composer), composer, 56);
        }
        return b0.f30125a;
    }
}
