package androidx.compose.runtime.changelist;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import d0.k;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class Operation {

    /* renamed from: a, reason: collision with root package name */
    public final int f14093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14094b;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class AdvanceSlotsBy extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final AdvanceSlotsBy f14095c = new Operation(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.a(opIterator.a(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "distance" : super.c(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class AppendValue extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final AppendValue f14096c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) opIterator.b(0);
            Object b2 = opIterator.b(1);
            if (b2 instanceof RememberObserverHolder) {
                rememberManager.b(((RememberObserverHolder) b2).f13970a);
            }
            if (slotWriter.f14012n != 0) {
                ComposerKt.c("Can only append a slot if not current inserting");
                throw null;
            }
            int i2 = slotWriter.f14007i;
            int i3 = slotWriter.f14008j;
            int c2 = slotWriter.c(anchor);
            int f2 = slotWriter.f(slotWriter.p(c2 + 1), slotWriter.f14002b);
            slotWriter.f14007i = f2;
            slotWriter.f14008j = f2;
            slotWriter.t(1, c2);
            if (i2 >= f2) {
                i2++;
                i3++;
            }
            slotWriter.f14003c[f2] = b2;
            slotWriter.f14007i = i2;
            slotWriter.f14008j = i3;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "anchor" : ObjectParameter.a(i2, 1) ? "value" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ApplyChangeList extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final ApplyChangeList f14097c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) opIterator.b(1);
            int i2 = intRef != null ? intRef.f14483a : 0;
            ChangeList changeList = (ChangeList) opIterator.b(0);
            if (i2 > 0) {
                applier = new OffsetApplier(applier, i2);
            }
            changeList.b(applier, slotWriter, rememberManager);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "changes" : ObjectParameter.a(i2, 1) ? "effectiveNodeIndex" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final CopyNodesToNewAnchorLocation f14098c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int i2 = ((IntRef) opIterator.b(0)).f14483a;
            List list = (List) opIterator.b(1);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                a.q(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i4 = i2 + i3;
                applier.f(i4, obj);
                applier.c(i4, obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "effectiveNodeIndex" : ObjectParameter.a(i2, 1) ? "nodes" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final CopySlotTableToAnchorLocation f14099c = new Operation(0, 4, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) opIterator.b(2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) opIterator.b(3);
            CompositionContext compositionContext = (CompositionContext) opIterator.b(1);
            MovableContentState movableContentState = (MovableContentState) opIterator.b(0);
            if (movableContentState == null && (movableContentState = compositionContext.o(movableContentStateReference)) == null) {
                ComposerKt.d("Could not resolve state for movable content");
                throw null;
            }
            ComposerKt.h(slotWriter.f14012n <= 0 && slotWriter.q(slotWriter.f14018t + 1) == 1);
            int i2 = slotWriter.f14018t;
            int i3 = slotWriter.f14007i;
            int i4 = slotWriter.f14008j;
            slotWriter.a(1);
            slotWriter.L();
            slotWriter.d();
            SlotWriter e = movableContentState.f13832a.e();
            try {
                List a2 = SlotWriter.Companion.a(e, 2, slotWriter, false, true, true);
                e.e(true);
                slotWriter.j();
                slotWriter.i();
                slotWriter.f14018t = i2;
                slotWriter.f14007i = i3;
                slotWriter.f14008j = i4;
                ControlledComposition controlledComposition = movableContentStateReference2.f13835c;
                a.q(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
                RecomposeScopeImpl.Companion.a(slotWriter, a2, (RecomposeScopeOwner) controlledComposition);
            } catch (Throwable th) {
                e.e(false);
                throw th;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "resolvedState" : ObjectParameter.a(i2, 1) ? "resolvedCompositionContext" : ObjectParameter.a(i2, 2) ? "from" : ObjectParameter.a(i2, 3) ? "to" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DeactivateCurrentGroup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final DeactivateCurrentGroup f14100c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$DeactivateCurrentGroup, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14100c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.e(slotWriter, rememberManager);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final DetermineMovableContentNodeIndex f14101c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int i2;
            IntRef intRef = (IntRef) opIterator.b(0);
            Anchor anchor = (Anchor) opIterator.b(1);
            a.q(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int c2 = slotWriter.c(anchor);
            ComposerKt.h(slotWriter.f14018t < c2);
            OperationKt.a(slotWriter, applier, c2);
            int i3 = slotWriter.f14018t;
            int i4 = slotWriter.f14020v;
            while (i4 >= 0) {
                if (SlotTableKt.f(slotWriter.p(i4), slotWriter.f14002b)) {
                    break;
                } else {
                    i4 = slotWriter.A(i4, slotWriter.f14002b);
                }
            }
            int i5 = i4 + 1;
            int i6 = 0;
            while (i5 < i3) {
                if (slotWriter.r(i3, i5)) {
                    if (SlotTableKt.f(slotWriter.p(i5), slotWriter.f14002b)) {
                        i6 = 0;
                    }
                    i5++;
                } else {
                    i6 += SlotTableKt.f(slotWriter.p(i5), slotWriter.f14002b) ? 1 : SlotTableKt.h(slotWriter.p(i5), slotWriter.f14002b);
                    i5 += slotWriter.q(i5);
                }
            }
            while (true) {
                i2 = slotWriter.f14018t;
                if (i2 >= c2) {
                    break;
                }
                if (slotWriter.r(c2, i2)) {
                    int i7 = slotWriter.f14018t;
                    if (i7 < slotWriter.f14019u) {
                        if (SlotTableKt.f(slotWriter.p(i7), slotWriter.f14002b)) {
                            applier.g(slotWriter.z(slotWriter.f14018t));
                            i6 = 0;
                        }
                    }
                    slotWriter.L();
                } else {
                    i6 += slotWriter.G();
                }
            }
            ComposerKt.h(i2 == c2);
            intRef.f14483a = i6;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "effectiveNodeIndexOut" : ObjectParameter.a(i2, 1) ? "anchor" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Downs extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final Downs f14102c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$Downs, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 1;
            f14102c = new Operation(0, i2, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            a.q(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) opIterator.b(0)) {
                applier.g(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "nodes" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class EndCompositionScope extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final EndCompositionScope f14103c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((l) opIterator.b(0)).invoke((Composition) opIterator.b(1));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "anchor" : ObjectParameter.a(i2, 1) ? "composition" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class EndCurrentGroup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final EndCurrentGroup f14104c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$EndCurrentGroup, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14104c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.i();
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class EndMovableContentPlacement extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final EndMovableContentPlacement f14105c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$EndMovableContentPlacement, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14105c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            a.q(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            OperationKt.a(slotWriter, applier, 0);
            slotWriter.i();
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class EnsureGroupStarted extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final EnsureGroupStarted f14106c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$EnsureGroupStarted, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 1;
            f14106c = new Operation(0, i2, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) opIterator.b(0);
            anchor.getClass();
            slotWriter.k(slotWriter.c(anchor));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "anchor" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class EnsureRootGroupStarted extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final EnsureRootGroupStarted f14107c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$EnsureRootGroupStarted, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14107c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.k(0);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class InsertNodeFixup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final InsertNodeFixup f14108c = new Operation(1, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object invoke = ((q0.a) opIterator.b(0)).invoke();
            Anchor anchor = (Anchor) opIterator.b(1);
            int a2 = opIterator.a(0);
            a.q(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            anchor.getClass();
            slotWriter.R(slotWriter.c(anchor), invoke);
            applier.c(a2, invoke);
            applier.g(invoke);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "insertIndex" : super.c(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "factory" : ObjectParameter.a(i2, 1) ? "groupAnchor" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class InsertSlots extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final InsertSlots f14109c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) opIterator.b(1);
            Anchor anchor = (Anchor) opIterator.b(0);
            slotWriter.d();
            anchor.getClass();
            slotWriter.v(slotTable, slotTable.b(anchor));
            slotWriter.j();
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "anchor" : ObjectParameter.a(i2, 1) ? "from" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class InsertSlotsWithFixups extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final InsertSlotsWithFixups f14110c = new Operation(0, 3, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) opIterator.b(1);
            Anchor anchor = (Anchor) opIterator.b(0);
            FixupList fixupList = (FixupList) opIterator.b(2);
            SlotWriter e = slotTable.e();
            try {
                if (!fixupList.f14092b.f()) {
                    ComposerKt.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                    throw null;
                }
                fixupList.f14091a.d(applier, e, rememberManager);
                e.e(true);
                slotWriter.d();
                anchor.getClass();
                slotWriter.v(slotTable, slotTable.b(anchor));
                slotWriter.j();
            } catch (Throwable th) {
                e.e(false);
                throw th;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "anchor" : ObjectParameter.a(i2, 1) ? "from" : ObjectParameter.a(i2, 2) ? "fixups" : super.d(i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class IntParameter {
        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof IntParameter)) {
                return false;
            }
            ((IntParameter) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "IntParameter(offset=0)";
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class MoveCurrentGroup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final MoveCurrentGroup f14111c = new Operation(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor;
            int c2;
            int a2 = opIterator.a(0);
            if (!(slotWriter.f14012n == 0)) {
                ComposerKt.c("Cannot move a group while inserting");
                throw null;
            }
            if (!(a2 >= 0)) {
                ComposerKt.c("Parameter offset is out of bounds");
                throw null;
            }
            if (a2 == 0) {
                return;
            }
            int i2 = slotWriter.f14018t;
            int i3 = slotWriter.f14020v;
            int i4 = slotWriter.f14019u;
            int i5 = i2;
            while (a2 > 0) {
                i5 += SlotTableKt.c(slotWriter.p(i5), slotWriter.f14002b);
                if (i5 > i4) {
                    ComposerKt.c("Parameter offset is out of bounds");
                    throw null;
                }
                a2--;
            }
            int c3 = SlotTableKt.c(slotWriter.p(i5), slotWriter.f14002b);
            int f2 = slotWriter.f(slotWriter.p(slotWriter.f14018t), slotWriter.f14002b);
            int f3 = slotWriter.f(slotWriter.p(i5), slotWriter.f14002b);
            int i6 = i5 + c3;
            int f4 = slotWriter.f(slotWriter.p(i6), slotWriter.f14002b);
            int i7 = f4 - f3;
            slotWriter.t(i7, Math.max(slotWriter.f14018t - 1, 0));
            slotWriter.s(c3);
            int[] iArr = slotWriter.f14002b;
            int p2 = slotWriter.p(i6) * 5;
            q.O(slotWriter.p(i2) * 5, p2, (c3 * 5) + p2, iArr, iArr);
            if (i7 > 0) {
                Object[] objArr = slotWriter.f14003c;
                q.P(f2, slotWriter.g(f3 + i7), objArr, slotWriter.g(f4 + i7), objArr);
            }
            int i8 = f3 + i7;
            int i9 = i8 - f2;
            int i10 = slotWriter.f14009k;
            int i11 = slotWriter.f14010l;
            int length = slotWriter.f14003c.length;
            int i12 = slotWriter.f14011m;
            int i13 = i2 + c3;
            int i14 = i2;
            while (i14 < i13) {
                int p3 = slotWriter.p(i14);
                int i15 = i13;
                int i16 = i9;
                iArr[(p3 * 5) + 4] = SlotWriter.h(SlotWriter.h(slotWriter.f(p3, iArr) - i9, i12 < p3 ? 0 : i10, i11, length), slotWriter.f14009k, slotWriter.f14010l, slotWriter.f14003c.length);
                i14++;
                i9 = i16;
                i13 = i15;
                i10 = i10;
                i11 = i11;
            }
            int i17 = i6 + c3;
            int n2 = slotWriter.n();
            int g2 = SlotTableKt.g(slotWriter.d, i6, n2);
            ArrayList arrayList = new ArrayList();
            if (g2 >= 0) {
                while (g2 < slotWriter.d.size() && (c2 = slotWriter.c((anchor = (Anchor) slotWriter.d.get(g2)))) >= i6 && c2 < i17) {
                    arrayList.add(anchor);
                    slotWriter.d.remove(g2);
                }
            }
            int i18 = i2 - i6;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                Anchor anchor2 = (Anchor) arrayList.get(i19);
                int c4 = slotWriter.c(anchor2) + i18;
                if (c4 >= slotWriter.f14005g) {
                    anchor2.f13675a = -(n2 - c4);
                } else {
                    anchor2.f13675a = c4;
                }
                slotWriter.d.add(SlotTableKt.g(slotWriter.d, c4, n2), anchor2);
            }
            if (!(!slotWriter.E(i6, c3))) {
                ComposerKt.c("Unexpectedly removed anchors");
                throw null;
            }
            slotWriter.l(i3, slotWriter.f14019u, i2);
            if (i7 > 0) {
                slotWriter.F(i8, i7, i6 - 1);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "offset" : super.c(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class MoveNode extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final MoveNode f14112c = new Operation(3, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.a(opIterator.a(0), opIterator.a(1), opIterator.a(2));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "from" : IntParameter.a(i2, 1) ? "to" : IntParameter.a(i2, 2) ? "count" : super.c(i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectParameter<T> {
        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectParameter)) {
                return false;
            }
            ((ObjectParameter) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "ObjectParameter(offset=0)";
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class PostInsertNodeFixup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final PostInsertNodeFixup f14113c = new Operation(1, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Anchor anchor = (Anchor) opIterator.b(0);
            int a2 = opIterator.a(0);
            applier.h();
            anchor.getClass();
            applier.f(a2, slotWriter.z(slotWriter.c(anchor)));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "insertIndex" : super.c(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "groupAnchor" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final ReleaseMovableGroupAtCurrent f14114c = new Operation(0, 3, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            final ControlledComposition controlledComposition = (ControlledComposition) opIterator.b(0);
            CompositionContext compositionContext = (CompositionContext) opIterator.b(1);
            final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) opIterator.b(2);
            SlotTable slotTable = new SlotTable();
            if (slotWriter.e != null) {
                slotTable.c();
            }
            if (slotWriter.f14004f != null) {
                slotTable.f13997k = new MutableIntObjectMap();
            }
            SlotWriter e = slotTable.e();
            try {
                e.d();
                MovableContent movableContent = movableContentStateReference.f13833a;
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                e.M(movableContent, 126665345, composer$Companion$Empty$1, false);
                SlotWriter.u(e);
                e.O(movableContentStateReference.f13834b);
                List y2 = slotWriter.y(movableContentStateReference.e, e);
                e.G();
                e.i();
                e.j();
                e.e(true);
                MovableContentState movableContentState = new MovableContentState(slotTable);
                if (!y2.isEmpty()) {
                    int size = y2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Anchor anchor = (Anchor) y2.get(i2);
                        if (slotTable.f(anchor)) {
                            int b2 = slotTable.b(anchor);
                            int j2 = SlotTableKt.j(b2, slotTable.f13989a);
                            int i3 = b2 + 1;
                            if (((i3 < slotTable.f13990b ? SlotTableKt.b(i3, slotTable.f13989a) : slotTable.f13991c.length) - j2 > 0 ? slotTable.f13991c[j2] : composer$Companion$Empty$1) instanceof RecomposeScopeImpl) {
                                RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public final void a(Object obj) {
                                    }

                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public final void c() {
                                    }

                                    @Override // androidx.compose.runtime.RecomposeScopeOwner
                                    public final InvalidationResult l(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                                        InvalidationResult invalidationResult;
                                        ControlledComposition controlledComposition2 = ControlledComposition.this;
                                        RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                                        InvalidationResult invalidationResult2 = InvalidationResult.f13812a;
                                        if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.l(recomposeScopeImpl, obj)) == null) {
                                            invalidationResult = invalidationResult2;
                                        }
                                        if (invalidationResult != invalidationResult2) {
                                            return invalidationResult;
                                        }
                                        MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                        movableContentStateReference2.f13836f = u.Q0(movableContentStateReference2.f13836f, new k(recomposeScopeImpl, obj));
                                        return InvalidationResult.f13813b;
                                    }
                                };
                                e = slotTable.e();
                                try {
                                    RecomposeScopeImpl.Companion.a(e, y2, recomposeScopeOwner);
                                    e.e(true);
                                    break;
                                } finally {
                                }
                            }
                        }
                        i2++;
                    }
                }
                compositionContext.n(movableContentStateReference, movableContentState);
            } finally {
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "composition" : ObjectParameter.a(i2, 1) ? "parentCompositionContext" : ObjectParameter.a(i2, 2) ? "reference" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Remember extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final Remember f14115c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$Remember, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 1;
            f14115c = new Operation(0, i2, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.b((RememberObserver) opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "value" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class RemoveCurrentGroup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final RemoveCurrentGroup f14116c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$RemoveCurrentGroup, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14116c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.g(slotWriter, rememberManager);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class RemoveNode extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final RemoveNode f14117c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$RemoveNode, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 2;
            f14117c = new Operation(i2, 0, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.b(opIterator.a(0), opIterator.a(1));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "removeIndex" : IntParameter.a(i2, 1) ? "count" : super.c(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ResetSlots extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final ResetSlots f14118c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$ResetSlots, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14118c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            if (slotWriter.f14012n != 0) {
                ComposerKt.c("Cannot reset when inserting");
                throw null;
            }
            slotWriter.C();
            slotWriter.f14018t = 0;
            slotWriter.f14019u = slotWriter.m() - slotWriter.f14006h;
            slotWriter.f14007i = 0;
            slotWriter.f14008j = 0;
            slotWriter.f14013o = 0;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class SideEffect extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final SideEffect f14119c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$SideEffect, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 1;
            f14119c = new Operation(0, i2, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.a((q0.a) opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "effect" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final SkipToEndOfCurrentGroup f14120c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$SkipToEndOfCurrentGroup, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14120c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.H();
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TestOperation extends Operation {

        /* renamed from: androidx.compose.runtime.changelist.Operation$TestOperation$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        final class AnonymousClass1 extends r implements q0.q {
            @Override // q0.q
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b0.f30125a;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            throw null;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String toString() {
            return "TestOperation(ints = " + this.f14093a + ", objects = " + this.f14094b + ")@" + System.identityHashCode(this);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TrimParentValues extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final TrimParentValues f14121c = new Operation(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int a2 = opIterator.a(0);
            int o2 = slotWriter.o();
            int i2 = slotWriter.f14020v;
            int I = slotWriter.I(slotWriter.p(i2), slotWriter.f14002b);
            int f2 = slotWriter.f(slotWriter.p(i2 + 1), slotWriter.f14002b);
            for (int max = Math.max(I, f2 - a2); max < f2; max++) {
                Object obj = slotWriter.f14003c[slotWriter.g(max)];
                if (obj instanceof RememberObserverHolder) {
                    rememberManager.c(((RememberObserverHolder) obj).f13970a, o2 - max, -1, -1);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).d();
                }
            }
            ComposerKt.h(a2 > 0);
            int i3 = slotWriter.f14020v;
            int I2 = slotWriter.I(slotWriter.p(i3), slotWriter.f14002b);
            int f3 = slotWriter.f(slotWriter.p(i3 + 1), slotWriter.f14002b) - a2;
            ComposerKt.h(f3 >= I2);
            slotWriter.F(f3, a2, i3);
            int i4 = slotWriter.f14007i;
            if (i4 >= I2) {
                slotWriter.f14007i = i4 - a2;
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "count" : super.c(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class UpdateAnchoredValue extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateAnchoredValue f14122c = new Operation(1, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int i2;
            int i3;
            Object b2 = opIterator.b(0);
            Anchor anchor = (Anchor) opIterator.b(1);
            int a2 = opIterator.a(0);
            if (b2 instanceof RememberObserverHolder) {
                rememberManager.b(((RememberObserverHolder) b2).f13970a);
            }
            int c2 = slotWriter.c(anchor);
            int g2 = slotWriter.g(slotWriter.J(c2, a2));
            Object[] objArr = slotWriter.f14003c;
            Object obj = objArr[g2];
            objArr[g2] = b2;
            if (!(obj instanceof RememberObserverHolder)) {
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).d();
                    return;
                }
                return;
            }
            int o2 = slotWriter.o() - slotWriter.J(c2, a2);
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
            Anchor anchor2 = rememberObserverHolder.f13971b;
            if (anchor2 == null || !anchor2.a()) {
                i2 = -1;
                i3 = -1;
            } else {
                i2 = slotWriter.c(anchor2);
                i3 = slotWriter.o() - slotWriter.f(slotWriter.p(slotWriter.q(i2) + i2), slotWriter.f14002b);
            }
            rememberManager.c(rememberObserverHolder.f13970a, o2, i2, i3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "groupSlotIndex" : super.c(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "value" : ObjectParameter.a(i2, 1) ? "anchor" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class UpdateAuxData extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateAuxData f14123c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$UpdateAuxData, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 1;
            f14123c = new Operation(0, i2, i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.P(opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "data" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class UpdateNode extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateNode f14124c = new Operation(0, 2, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((p) opIterator.b(1)).invoke(applier.e(), opIterator.b(0));
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "value" : ObjectParameter.a(i2, 1) ? "block" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class UpdateValue extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final UpdateValue f14125c = new Operation(1, 1);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object b2 = opIterator.b(0);
            int a2 = opIterator.a(0);
            if (b2 instanceof RememberObserverHolder) {
                rememberManager.b(((RememberObserverHolder) b2).f13970a);
            }
            int g2 = slotWriter.g(slotWriter.J(slotWriter.f14018t, a2));
            Object[] objArr = slotWriter.f14003c;
            Object obj = objArr[g2];
            objArr[g2] = b2;
            if (obj instanceof RememberObserverHolder) {
                rememberManager.c(((RememberObserverHolder) obj).f13970a, slotWriter.o() - slotWriter.J(slotWriter.f14018t, a2), -1, -1);
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).d();
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "groupSlotIndex" : super.c(i2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String d(int i2) {
            return ObjectParameter.a(i2, 0) ? "value" : super.d(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Ups extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final Ups f14126c = new Operation(1, 0, 2);

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int a2 = opIterator.a(0);
            for (int i2 = 0; i2 < a2; i2++) {
                applier.h();
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final String c(int i2) {
            return IntParameter.a(i2, 0) ? "count" : super.c(i2);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class UseCurrentNode extends Operation {

        /* renamed from: c, reason: collision with root package name */
        public static final UseCurrentNode f14127c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.changelist.Operation$UseCurrentNode, androidx.compose.runtime.changelist.Operation] */
        static {
            int i2 = 0;
            f14127c = new Operation(i2, i2, 3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public final void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object e = applier.e();
            a.q(e, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((ComposeNodeLifecycleCallback) e).f();
        }
    }

    public Operation(int i2, int i3) {
        this.f14093a = i2;
        this.f14094b = i3;
    }

    public abstract void a(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberManager rememberManager);

    public final String b() {
        String c2 = g0.a(getClass()).c();
        return c2 == null ? "" : c2;
    }

    public String c(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public String d(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public String toString() {
        return b();
    }

    public /* synthetic */ Operation(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
