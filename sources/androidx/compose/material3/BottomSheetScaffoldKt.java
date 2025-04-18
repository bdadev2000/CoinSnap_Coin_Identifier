package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import b1.d0;
import b1.f0;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
public final class BottomSheetScaffoldKt {
    public static final void a(Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, final q0.a aVar, final SheetState sheetState, long j2, long j3, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1651214892);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.I(sheetState) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.d(j2) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((100663296 & i2) == 0) {
            i4 |= g2.d(j3) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if ((i5 & 38347923) == 38347922 && g2.i()) {
            g2.A();
        } else {
            p[] pVarArr = new p[4];
            pVarArr[0] = pVar == null ? ComposableSingletons$BottomSheetScaffoldKt.f8593c : pVar;
            pVarArr[1] = ComposableLambdaKt.c(398963586, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1(modifier, j2, j3, pVar2), g2);
            pVarArr[2] = pVar3;
            pVarArr[3] = pVar4;
            List v2 = f0.v(pVarArr);
            boolean z2 = ((i5 & 3670016) == 1048576) | ((i5 & Opcodes.ASM7) == 131072);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z2 || u2 == composer$Companion$Empty$1) {
                u2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1

                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f7971a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f7972b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ List f7973c;
                        public final /* synthetic */ SheetState d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ q0.a f7974f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ int f7975g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ List f7976h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ List f7977i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ int f7978j;

                        /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                        /* loaded from: classes.dex */
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[SheetValue.values().length];
                                try {
                                    iArr[2] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[1] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[0] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ArrayList arrayList, int i2, ArrayList arrayList2, SheetState sheetState, q0.a aVar, int i3, ArrayList arrayList3, ArrayList arrayList4, int i4) {
                            super(1);
                            this.f7971a = arrayList;
                            this.f7972b = i2;
                            this.f7973c = arrayList2;
                            this.d = sheetState;
                            this.f7974f = aVar;
                            this.f7975g = i3;
                            this.f7976h = arrayList3;
                            this.f7977i = arrayList4;
                            this.f7978j = i4;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            Integer valueOf;
                            Integer valueOf2;
                            int i2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            List list = this.f7971a;
                            Integer num = null;
                            if (list.isEmpty()) {
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(((Placeable) list.get(0)).f15825a);
                                int p2 = f0.p(list);
                                if (1 <= p2) {
                                    int i3 = 1;
                                    while (true) {
                                        Integer valueOf3 = Integer.valueOf(((Placeable) list.get(i3)).f15825a);
                                        if (valueOf3.compareTo(valueOf) > 0) {
                                            valueOf = valueOf3;
                                        }
                                        if (i3 == p2) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            int intValue = valueOf != null ? valueOf.intValue() : 0;
                            int i4 = this.f7972b;
                            int max = Integer.max(0, (i4 - intValue) / 2);
                            List list2 = this.f7973c;
                            if (list2.isEmpty()) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(((Placeable) list2.get(0)).f15825a);
                                int p3 = f0.p(list2);
                                if (1 <= p3) {
                                    int i5 = 1;
                                    while (true) {
                                        Integer valueOf4 = Integer.valueOf(((Placeable) list2.get(i5)).f15825a);
                                        if (valueOf4.compareTo(valueOf2) > 0) {
                                            valueOf2 = valueOf4;
                                        }
                                        if (i5 == p3) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                            int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
                            if (!list2.isEmpty()) {
                                num = Integer.valueOf(((Placeable) list2.get(0)).f15826b);
                                int p4 = f0.p(list2);
                                if (1 <= p4) {
                                    int i6 = 1;
                                    while (true) {
                                        Integer valueOf5 = Integer.valueOf(((Placeable) list2.get(i6)).f15826b);
                                        if (valueOf5.compareTo(num) > 0) {
                                            num = valueOf5;
                                        }
                                        if (i6 == p4) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            int intValue3 = num != null ? num.intValue() : 0;
                            int i7 = (i4 - intValue2) / 2;
                            int ordinal = this.d.b().ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                i2 = this.f7975g;
                            } else {
                                if (ordinal != 2) {
                                    throw new RuntimeException();
                                }
                                i2 = p0.a.t0(((Number) this.f7974f.invoke()).floatValue());
                            }
                            int i8 = i2 - intValue3;
                            List list3 = this.f7976h;
                            int size = list3.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                Placeable.PlacementScope.h(placementScope, (Placeable) list3.get(i9), 0, this.f7978j);
                            }
                            List list4 = this.f7977i;
                            int size2 = list4.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                Placeable.PlacementScope.h(placementScope, (Placeable) list4.get(i10), 0, 0);
                            }
                            int size3 = list.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                Placeable.PlacementScope.h(placementScope, (Placeable) list.get(i11), max, 0);
                            }
                            int size4 = list2.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                Placeable.PlacementScope.h(placementScope, (Placeable) list2.get(i12), i7, i8);
                            }
                            return b0.f30125a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j4) {
                        Integer valueOf;
                        ArrayList arrayList = (ArrayList) list;
                        List list2 = (List) arrayList.get(0);
                        int i6 = 1;
                        List list3 = (List) arrayList.get(1);
                        List list4 = (List) arrayList.get(2);
                        List list5 = (List) arrayList.get(3);
                        int i7 = Constraints.i(j4);
                        int h2 = Constraints.h(j4);
                        long b2 = Constraints.b(j4, 0, 0, 0, 0, 10);
                        ArrayList arrayList2 = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i8 = 0; i8 < size; i8 = d.e((Measurable) list4.get(i8), b2, arrayList2, i8, 1)) {
                        }
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9 = d.e((Measurable) list2.get(i9), b2, arrayList3, i9, 1)) {
                        }
                        if (arrayList3.isEmpty()) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(((Placeable) arrayList3.get(0)).f15826b);
                            int p2 = f0.p(arrayList3);
                            if (1 <= p2) {
                                while (true) {
                                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList3.get(i6)).f15826b);
                                    if (valueOf2.compareTo(valueOf) > 0) {
                                        valueOf = valueOf2;
                                    }
                                    if (i6 == p2) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : 0;
                        long b3 = Constraints.b(b2, 0, 0, 0, h2 - intValue, 7);
                        ArrayList arrayList4 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i10 = 0; i10 < size3; i10 = d.e((Measurable) list3.get(i10), b3, arrayList4, i10, 1)) {
                        }
                        ArrayList arrayList5 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i11 = 0; i11 < size4; i11 = d.e((Measurable) list5.get(i11), b2, arrayList5, i11, 1)) {
                        }
                        return measureScope.T(i7, h2, x.f30219a, new AnonymousClass1(arrayList2, i7, arrayList5, SheetState.this, aVar, h2, arrayList4, arrayList3, intValue));
                    }
                };
                g2.o(u2);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) u2;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ComposableLambdaImpl a2 = LayoutKt.a(v2);
            boolean I = g2.I(multiContentMeasurePolicy);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy);
                g2.o(u3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u3;
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar5);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            a2.invoke(g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3(modifier, pVar, pVar2, pVar3, pVar4, aVar, sheetState, j2, j3, i2);
        }
    }

    public static final void b(SheetState sheetState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, p pVar, q qVar, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Modifier modifier;
        ComposerImpl g2 = composer.g(721467526);
        if ((i2 & 6) == 0) {
            i4 = (g2.I(sheetState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g2.b(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g2.b(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g2.a(z2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= g2.I(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= g2.d(j2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= g2.d(j3) ? 1048576 : Opcodes.ASM8;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= g2.b(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= g2.b(f5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= g2.w(pVar) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (g2.w(qVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i6 & 306783379) == 306783378 && (i5 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = d.h(EffectsKt.g(g2), g2);
            }
            d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
            Orientation orientation = Orientation.f3394a;
            float y1 = ((Density) g2.K(CompositionLocalsKt.f16434f)).y1(f2);
            g2.J(-1831611516);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            if (z2) {
                boolean I = g2.I(sheetState.f11199c);
                Object u3 = g2.u();
                if (I || u3 == composer$Companion$Empty$1) {
                    BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1 bottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1 = new BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1(sheetState, d0Var);
                    float f6 = SheetDefaultsKt.f11187a;
                    u3 = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, bottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1);
                    g2.o(u3);
                }
                modifier = NestedScrollModifierKt.a(companion, (NestedScrollConnection) u3, null);
            } else {
                modifier = companion;
            }
            g2.V(false);
            Modifier T0 = SizeKt.i(SizeKt.d(SizeKt.s(companion, 0.0f, f3, 1), 1.0f), f2).T0(modifier);
            AnchoredDraggableState anchoredDraggableState = sheetState.f11199c;
            boolean b2 = g2.b(y1) | ((i6 & 14) == 4);
            Object u4 = g2.u();
            if (b2 || u4 == composer$Companion$Empty$1) {
                u4 = new BottomSheetScaffoldKt$StandardBottomSheet$1$1(sheetState, y1);
                g2.o(u4);
            }
            int i7 = i6 >> 9;
            SurfaceKt.a(AnchoredDraggableKt.c(AnchoredDraggableKt.e(T0, anchoredDraggableState, orientation, (p) u4), sheetState.f11199c, orientation, z2, false, 24), shape, j2, j3, f4, f5, null, ComposableLambdaKt.c(390720907, new BottomSheetScaffoldKt$StandardBottomSheet$2(pVar, sheetState, z2, d0Var, qVar), g2), g2, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & Opcodes.ASM7), 64);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomSheetScaffoldKt$StandardBottomSheet$3(sheetState, f2, f3, z2, shape, j2, j3, f4, f5, pVar, qVar, i2, i3);
        }
    }
}
