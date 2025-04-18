package androidx.compose.runtime.changelist;

import androidx.compose.foundation.text.input.a;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {

    /* renamed from: a, reason: collision with root package name */
    public final ComposerImpl f14081a;

    /* renamed from: b, reason: collision with root package name */
    public ChangeList f14082b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14083c;

    /* renamed from: f, reason: collision with root package name */
    public int f14084f;

    /* renamed from: g, reason: collision with root package name */
    public int f14085g;

    /* renamed from: l, reason: collision with root package name */
    public int f14090l;
    public final IntStack d = new IntStack();
    public boolean e = true;

    /* renamed from: h, reason: collision with root package name */
    public final Stack f14086h = new Stack();

    /* renamed from: i, reason: collision with root package name */
    public int f14087i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f14088j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f14089k = -1;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.f14081a = composerImpl;
        this.f14082b = changeList;
    }

    public final void a(ArrayList arrayList, IntRef intRef) {
        ChangeList changeList = this.f14082b;
        changeList.getClass();
        if (!arrayList.isEmpty()) {
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.f14098c;
            Operations operations = changeList.f14080a;
            operations.j(copyNodesToNewAnchorLocation);
            Operations.WriteScope.b(operations, 1, arrayList);
            Operations.WriteScope.b(operations, 0, intRef);
            int i2 = operations.f14134g;
            int i3 = copyNodesToNewAnchorLocation.f14093a;
            int b2 = Operations.b(operations, i3);
            int i4 = copyNodesToNewAnchorLocation.f14094b;
            if (i2 == b2 && operations.f14135h == Operations.b(operations, i4)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (((1 << i6) & operations.f14134g) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(copyNodesToNewAnchorLocation.c(i6));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                if (((1 << i8) & operations.f14135h) != 0) {
                    if (i5 > 0) {
                        s2.append(", ");
                    }
                    s2.append(copyNodesToNewAnchorLocation.d(i8));
                    i7++;
                }
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(copyNodesToNewAnchorLocation);
            sb4.append(". Not all arguments were provided. Missing ");
            a.y(sb4, i5, " int arguments (", sb2, ") and ");
            a.C(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void b(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        ChangeList changeList = this.f14082b;
        changeList.getClass();
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.f14099c;
        Operations operations = changeList.f14080a;
        operations.j(copySlotTableToAnchorLocation);
        Operations.WriteScope.b(operations, 0, movableContentState);
        Operations.WriteScope.b(operations, 1, compositionContext);
        Operations.WriteScope.b(operations, 3, movableContentStateReference2);
        Operations.WriteScope.b(operations, 2, movableContentStateReference);
        int i2 = operations.f14134g;
        int i3 = copySlotTableToAnchorLocation.f14093a;
        int b2 = Operations.b(operations, i3);
        int i4 = copySlotTableToAnchorLocation.f14094b;
        if (i2 == b2 && operations.f14135h == Operations.b(operations, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & operations.f14134g) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.c(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & operations.f14135h) != 0) {
                if (i5 > 0) {
                    s2.append(", ");
                }
                s2.append(copySlotTableToAnchorLocation.d(i8));
                i7++;
            }
        }
        String sb3 = s2.toString();
        p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(copySlotTableToAnchorLocation);
        sb4.append(". Not all arguments were provided. Missing ");
        a.y(sb4, i5, " int arguments (", sb2, ") and ");
        a.C(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public final void c(IntRef intRef, Anchor anchor) {
        f();
        ChangeList changeList = this.f14082b;
        changeList.getClass();
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.f14101c;
        Operations operations = changeList.f14080a;
        operations.j(determineMovableContentNodeIndex);
        Operations.WriteScope.b(operations, 0, intRef);
        Operations.WriteScope.b(operations, 1, anchor);
        int i2 = operations.f14134g;
        int i3 = determineMovableContentNodeIndex.f14093a;
        int b2 = Operations.b(operations, i3);
        int i4 = determineMovableContentNodeIndex.f14094b;
        if (i2 == b2 && operations.f14135h == Operations.b(operations, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & operations.f14134g) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.c(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & operations.f14135h) != 0) {
                if (i5 > 0) {
                    s2.append(", ");
                }
                s2.append(determineMovableContentNodeIndex.d(i8));
                i7++;
            }
        }
        String sb3 = s2.toString();
        p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(determineMovableContentNodeIndex);
        sb4.append(". Not all arguments were provided. Missing ");
        a.y(sb4, i5, " int arguments (", sb2, ") and ");
        a.C(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public final void d(ChangeList changeList, IntRef intRef) {
        ChangeList changeList2 = this.f14082b;
        changeList2.getClass();
        if (changeList.f14080a.g()) {
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.f14097c;
            Operations operations = changeList2.f14080a;
            operations.j(applyChangeList);
            Operations.WriteScope.b(operations, 0, changeList);
            Operations.WriteScope.b(operations, 1, intRef);
            int i2 = operations.f14134g;
            int i3 = applyChangeList.f14093a;
            int b2 = Operations.b(operations, i3);
            int i4 = applyChangeList.f14094b;
            if (i2 == b2 && operations.f14135h == Operations.b(operations, i4)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (((1 << i6) & operations.f14134g) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.c(i6));
                    i5++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                if (((1 << i8) & operations.f14135h) != 0) {
                    if (i5 > 0) {
                        s2.append(", ");
                    }
                    s2.append(applyChangeList.d(i8));
                    i7++;
                }
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(applyChangeList);
            sb4.append(". Not all arguments were provided. Missing ");
            a.y(sb4, i5, " int arguments (", sb2, ") and ");
            a.C(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e() {
        g();
        Stack stack = this.f14086h;
        if (!(!stack.f14076a.isEmpty())) {
            this.f14085g++;
        } else {
            stack.f14076a.remove(r0.size() - 1);
        }
    }

    public final void f() {
        ComposerChangeListWriter composerChangeListWriter = this;
        int i2 = composerChangeListWriter.f14085g;
        int i3 = 0;
        if (i2 > 0) {
            ChangeList changeList = composerChangeListWriter.f14082b;
            changeList.getClass();
            Operation.Ups ups = Operation.Ups.f14126c;
            Operations operations = changeList.f14080a;
            operations.j(ups);
            Operations.WriteScope.a(operations, 0, i2);
            int i4 = operations.f14134g;
            int i5 = ups.f14093a;
            int b2 = Operations.b(operations, i5);
            int i6 = ups.f14094b;
            if (i4 != b2 || operations.f14135h != Operations.b(operations, i6)) {
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i5;
                    if (((1 << i7) & operations.f14134g) != 0) {
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(ups.c(i7));
                        i3++;
                    }
                    i7++;
                    i5 = i8;
                }
                String sb2 = sb.toString();
                StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                int i9 = 0;
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i6;
                    if (((1 << i10) & operations.f14135h) != 0) {
                        if (i3 > 0) {
                            s2.append(", ");
                        }
                        s2.append(ups.d(i10));
                        i9++;
                    }
                    i10++;
                    i6 = i11;
                }
                String sb3 = s2.toString();
                p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(ups);
                sb4.append(". Not all arguments were provided. Missing ");
                a.y(sb4, i3, " int arguments (", sb2, ") and ");
                a.C(sb4, i9, " object arguments (", sb3, ").");
                throw null;
            }
            composerChangeListWriter.f14085g = 0;
        } else {
            composerChangeListWriter = this;
        }
        Stack stack = composerChangeListWriter.f14086h;
        if (!stack.f14076a.isEmpty()) {
            ChangeList changeList2 = composerChangeListWriter.f14082b;
            ArrayList arrayList = stack.f14076a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i12 = 0; i12 < size; i12++) {
                objArr[i12] = arrayList.get(i12);
            }
            changeList2.getClass();
            if (!(size == 0)) {
                Operation.Downs downs = Operation.Downs.f14102c;
                Operations operations2 = changeList2.f14080a;
                operations2.j(downs);
                Operations.WriteScope.b(operations2, 0, objArr);
                int i13 = operations2.f14134g;
                int i14 = downs.f14093a;
                int b3 = Operations.b(operations2, i14);
                int i15 = downs.f14094b;
                if (i13 != b3 || operations2.f14135h != Operations.b(operations2, i15)) {
                    StringBuilder sb5 = new StringBuilder();
                    int i16 = 0;
                    for (int i17 = 0; i17 < i14; i17++) {
                        if (((1 << i17) & operations2.f14134g) != 0) {
                            if (i16 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(downs.c(i17));
                            i16++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder s3 = a.s(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i15) {
                        int i20 = i15;
                        if (((1 << i18) & operations2.f14135h) != 0) {
                            if (i16 > 0) {
                                s3.append(", ");
                            }
                            s3.append(downs.d(i18));
                            i19++;
                        }
                        i18++;
                        i15 = i20;
                    }
                    String sb7 = s3.toString();
                    p0.a.r(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(downs);
                    sb8.append(". Not all arguments were provided. Missing ");
                    a.y(sb8, i16, " int arguments (", sb6, ") and ");
                    a.C(sb8, i19, " object arguments (", sb7, ").");
                    throw null;
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        int i2 = this.f14090l;
        if (i2 > 0) {
            int i3 = this.f14087i;
            if (i3 >= 0) {
                f();
                ChangeList changeList = this.f14082b;
                changeList.getClass();
                Operation.RemoveNode removeNode = Operation.RemoveNode.f14117c;
                Operations operations = changeList.f14080a;
                operations.j(removeNode);
                Operations.WriteScope.a(operations, 0, i3);
                Operations.WriteScope.a(operations, 1, i2);
                int i4 = operations.f14134g;
                int i5 = removeNode.f14093a;
                int b2 = Operations.b(operations, i5);
                int i6 = removeNode.f14094b;
                if (i4 != b2 || operations.f14135h != Operations.b(operations, i6)) {
                    StringBuilder sb = new StringBuilder();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < i5) {
                        int i9 = i5;
                        if (((1 << i7) & operations.f14134g) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(removeNode.c(i7));
                            i8++;
                        }
                        i7++;
                        i5 = i9;
                    }
                    String sb2 = sb.toString();
                    StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < i6) {
                        int i12 = i6;
                        if (((1 << i11) & operations.f14135h) != 0) {
                            if (i8 > 0) {
                                s2.append(", ");
                            }
                            s2.append(removeNode.d(i11));
                            i10++;
                        }
                        i11++;
                        i6 = i12;
                    }
                    String sb3 = s2.toString();
                    p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(removeNode);
                    sb4.append(". Not all arguments were provided. Missing ");
                    a.y(sb4, i8, " int arguments (", sb2, ") and ");
                    a.C(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f14087i = -1;
            } else {
                int i13 = this.f14089k;
                int i14 = this.f14088j;
                f();
                ChangeList changeList2 = this.f14082b;
                changeList2.getClass();
                Operation.MoveNode moveNode = Operation.MoveNode.f14112c;
                Operations operations2 = changeList2.f14080a;
                operations2.j(moveNode);
                Operations.WriteScope.a(operations2, 1, i13);
                Operations.WriteScope.a(operations2, 0, i14);
                Operations.WriteScope.a(operations2, 2, i2);
                int i15 = operations2.f14134g;
                int i16 = moveNode.f14093a;
                int b3 = Operations.b(operations2, i16);
                int i17 = moveNode.f14094b;
                if (i15 != b3 || operations2.f14135h != Operations.b(operations2, i17)) {
                    int i18 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i19 = 0; i19 < i16; i19++) {
                        if (((1 << i19) & operations2.f14134g) != 0) {
                            if (i18 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(moveNode.c(i19));
                            i18++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder s3 = a.s(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i17) {
                        int i22 = i17;
                        if (((1 << i20) & operations2.f14135h) != 0) {
                            if (i18 > 0) {
                                s3.append(", ");
                            }
                            s3.append(moveNode.d(i20));
                            i21++;
                        }
                        i20++;
                        i17 = i22;
                    }
                    String sb7 = s3.toString();
                    p0.a.r(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(moveNode);
                    sb8.append(". Not all arguments were provided. Missing ");
                    a.y(sb8, i18, " int arguments (", sb6, ") and ");
                    a.C(sb8, i21, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f14088j = -1;
                this.f14089k = -1;
            }
            this.f14090l = 0;
        }
    }

    public final void h(boolean z2) {
        ComposerImpl composerImpl = this.f14081a;
        int i2 = z2 ? composerImpl.F.f13983i : composerImpl.F.f13981g;
        int i3 = i2 - this.f14084f;
        if (!(i3 >= 0)) {
            ComposerKt.c("Tried to seek backward");
            throw null;
        }
        if (i3 > 0) {
            ChangeList changeList = this.f14082b;
            changeList.getClass();
            Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.f14095c;
            Operations operations = changeList.f14080a;
            operations.j(advanceSlotsBy);
            Operations.WriteScope.a(operations, 0, i3);
            int i4 = operations.f14134g;
            int i5 = advanceSlotsBy.f14093a;
            int b2 = Operations.b(operations, i5);
            int i6 = advanceSlotsBy.f14094b;
            if (i4 == b2 && operations.f14135h == Operations.b(operations, i6)) {
                this.f14084f = i2;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                if (((1 << i8) & operations.f14134g) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(advanceSlotsBy.c(i8));
                    i7++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                if (((1 << i10) & operations.f14135h) != 0) {
                    if (i7 > 0) {
                        s2.append(", ");
                    }
                    s2.append(advanceSlotsBy.d(i10));
                    i9++;
                }
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(advanceSlotsBy);
            sb4.append(". Not all arguments were provided. Missing ");
            a.y(sb4, i7, " int arguments (", sb2, ") and ");
            a.C(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void i() {
        SlotReader slotReader = this.f14081a.F;
        if (slotReader.f13979c > 0) {
            int i2 = slotReader.f13983i;
            IntStack intStack = this.d;
            int i3 = intStack.f13808b;
            if ((i3 > 0 ? intStack.f13807a[i3 - 1] : -2) != i2) {
                if (!this.f14083c && this.e) {
                    h(false);
                    ChangeList changeList = this.f14082b;
                    changeList.getClass();
                    changeList.f14080a.i(Operation.EnsureRootGroupStarted.f14107c);
                    this.f14083c = true;
                }
                if (i2 > 0) {
                    Anchor a2 = slotReader.a(i2);
                    intStack.b(i2);
                    h(false);
                    ChangeList changeList2 = this.f14082b;
                    changeList2.getClass();
                    Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.f14106c;
                    Operations operations = changeList2.f14080a;
                    operations.j(ensureGroupStarted);
                    Operations.WriteScope.b(operations, 0, a2);
                    int i4 = operations.f14134g;
                    int i5 = ensureGroupStarted.f14093a;
                    int b2 = Operations.b(operations, i5);
                    int i6 = ensureGroupStarted.f14094b;
                    if (i4 == b2 && operations.f14135h == Operations.b(operations, i6)) {
                        this.f14083c = true;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        if (((1 << i8) & operations.f14134g) != 0) {
                            if (i7 > 0) {
                                sb.append(", ");
                            }
                            sb.append(ensureGroupStarted.c(i8));
                            i7++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder s2 = a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i9 = 0;
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (((1 << i10) & operations.f14135h) != 0) {
                            if (i7 > 0) {
                                s2.append(", ");
                            }
                            s2.append(ensureGroupStarted.d(i10));
                            i9++;
                        }
                    }
                    String sb3 = s2.toString();
                    p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(ensureGroupStarted);
                    sb4.append(". Not all arguments were provided. Missing ");
                    a.y(sb4, i7, " int arguments (", sb2, ") and ");
                    a.C(sb4, i9, " object arguments (", sb3, ").");
                    throw null;
                }
            }
        }
    }

    public final void j(int i2, int i3) {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                ComposerKt.c("Invalid remove index " + i2);
                throw null;
            }
            if (this.f14087i == i2) {
                this.f14090l += i3;
                return;
            }
            g();
            this.f14087i = i2;
            this.f14090l = i3;
        }
    }
}
