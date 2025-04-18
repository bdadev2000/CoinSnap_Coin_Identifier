package com.google.accompanist.flowlayout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import e0.u;
import e0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class FlowKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: Flow-F4y8cZ0, reason: not valid java name */
    public static final void m588FlowF4y8cZ0(Modifier modifier, final LayoutOrientation layoutOrientation, final SizeMode sizeMode, final MainAxisAlignment mainAxisAlignment, final float f2, final FlowCrossAxisAlignment flowCrossAxisAlignment, final float f3, final MainAxisAlignment mainAxisAlignment2, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1107216104);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.I(layoutOrientation) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.I(sizeMode) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= g2.I(mainAxisAlignment) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= g2.b(f2) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= g2.I(flowCrossAxisAlignment) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= g2.b(f3) ? 1048576 : Opcodes.ASM8;
        }
        if ((29360128 & i2) == 0) {
            i3 |= g2.I(mainAxisAlignment2) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= g2.I(pVar) ? 67108864 : 33554432;
        }
        if (((191739611 & i3) ^ 38347922) == 0 && g2.i()) {
            g2.A();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.google.accompanist.flowlayout.FlowKt$Flow$1
                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, d0 d0Var, MeasureScope measureScope, float f4, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation2, Placeable placeable) {
                    int Flow_F4y8cZ0$mainAxisSize;
                    if (!list.isEmpty()) {
                        int F0 = measureScope.F0(f4) + d0Var.f30925a;
                        Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize(placeable, layoutOrientation2);
                        if (Flow_F4y8cZ0$mainAxisSize + F0 > orientationIndependentConstraints.getMainAxisMax()) {
                            return false;
                        }
                    }
                    return true;
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, d0 d0Var, MeasureScope measureScope, float f4, List<Placeable> list2, List<Integer> list3, d0 d0Var2, List<Integer> list4, d0 d0Var3, d0 d0Var4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        d0Var.f30925a = measureScope.F0(f4) + d0Var.f30925a;
                    }
                    list5.add(u.Z0(list2));
                    list3.add(Integer.valueOf(d0Var2.f30925a));
                    list4.add(Integer.valueOf(d0Var.f30925a));
                    d0Var.f30925a += d0Var2.f30925a;
                    d0Var3.f30925a = Math.max(d0Var3.f30925a, d0Var4.f30925a);
                    list2.clear();
                    d0Var4.f30925a = 0;
                    d0Var2.f30925a = 0;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i4) {
                    int maxIntrinsicHeight;
                    maxIntrinsicHeight = super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    return maxIntrinsicHeight;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i4) {
                    int maxIntrinsicWidth;
                    maxIntrinsicWidth = super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    return maxIntrinsicWidth;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo0measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2) {
                    Object obj;
                    ArrayList arrayList;
                    Object obj2;
                    int Flow_F4y8cZ0$mainAxisSize;
                    int Flow_F4y8cZ0$crossAxisSize;
                    a.s(measureScope, "$this$Layout");
                    a.s(list, "measurables");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ?? obj3 = new Object();
                    Object obj4 = new Object();
                    ArrayList arrayList5 = new ArrayList();
                    Object obj5 = new Object();
                    Object obj6 = new Object();
                    OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j2, LayoutOrientation.this, null);
                    long b2 = LayoutOrientation.this == LayoutOrientation.Horizontal ? ConstraintsKt.b(orientationIndependentConstraints.getMainAxisMax(), 0, 13) : ConstraintsKt.b(0, orientationIndependentConstraints.getMainAxisMax(), 7);
                    Iterator<? extends Measurable> it = list.iterator();
                    d0 d0Var = obj6;
                    while (it.hasNext()) {
                        Placeable V = it.next().V(b2);
                        long j3 = b2;
                        OrientationIndependentConstraints orientationIndependentConstraints2 = orientationIndependentConstraints;
                        d0 d0Var2 = d0Var;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList5, obj5, measureScope, f2, orientationIndependentConstraints, LayoutOrientation.this, V)) {
                            obj = obj5;
                            arrayList = arrayList5;
                            obj2 = obj4;
                        } else {
                            d0 d0Var3 = obj5;
                            arrayList = arrayList5;
                            obj2 = obj4;
                            measure_3p2s80s$startNewSequence(arrayList2, obj4, measureScope, f3, arrayList5, arrayList3, d0Var2, arrayList4, obj3, d0Var3);
                            obj = d0Var3;
                        }
                        d0 d0Var4 = obj;
                        if (!arrayList.isEmpty()) {
                            d0Var4.f30925a = measureScope.F0(f2) + d0Var4.f30925a;
                        }
                        ArrayList arrayList6 = arrayList;
                        arrayList6.add(V);
                        int i4 = d0Var4.f30925a;
                        Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize(V, LayoutOrientation.this);
                        d0Var4.f30925a = Flow_F4y8cZ0$mainAxisSize + i4;
                        d0 d0Var5 = d0Var2;
                        int i5 = d0Var5.f30925a;
                        Flow_F4y8cZ0$crossAxisSize = FlowKt.Flow_F4y8cZ0$crossAxisSize(V, LayoutOrientation.this);
                        d0Var5.f30925a = Math.max(i5, Flow_F4y8cZ0$crossAxisSize);
                        arrayList5 = arrayList6;
                        obj5 = d0Var4;
                        orientationIndependentConstraints = orientationIndependentConstraints2;
                        b2 = j3;
                        obj4 = obj2;
                        d0Var = d0Var5;
                    }
                    OrientationIndependentConstraints orientationIndependentConstraints3 = orientationIndependentConstraints;
                    ArrayList arrayList7 = arrayList5;
                    d0 d0Var6 = obj4;
                    d0 d0Var7 = obj5;
                    if (!arrayList7.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList2, d0Var6, measureScope, f3, arrayList7, arrayList3, d0Var, arrayList4, obj3, d0Var7);
                    }
                    int max = (orientationIndependentConstraints3.getMainAxisMax() == Integer.MAX_VALUE || sizeMode != SizeMode.Expand) ? Math.max(obj3.f30925a, orientationIndependentConstraints3.getMainAxisMin()) : orientationIndependentConstraints3.getMainAxisMax();
                    int max2 = Math.max(d0Var6.f30925a, orientationIndependentConstraints3.getCrossAxisMin());
                    LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                    LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                    return measureScope.T(layoutOrientation2 == layoutOrientation3 ? max : max2, layoutOrientation2 == layoutOrientation3 ? max2 : max, x.f30219a, new FlowKt$Flow$1$measure$1(arrayList2, measureScope, f2, mainAxisAlignment, mainAxisAlignment2, layoutOrientation2, max, flowCrossAxisAlignment, arrayList3, arrayList4));
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i4) {
                    int minIntrinsicHeight;
                    minIntrinsicHeight = super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    return minIntrinsicHeight;
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i4) {
                    int minIntrinsicWidth;
                    minIntrinsicWidth = super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    return minIntrinsicWidth;
                }
            };
            g2.t(1376089335);
            Density density = (Density) g2.K(CompositionLocalsKt.f16434f);
            LayoutDirection layoutDirection = (LayoutDirection) g2.K(CompositionLocalsKt.f16440l);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            ComposableLambdaImpl b2 = LayoutKt.b(modifier);
            int i4 = ((((i3 << 3) & 112) | ((i3 >> 24) & 14)) << 9) & 7168;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            g2.x = false;
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, density, ComposeUiNode.Companion.e);
            Updater.b(g2, layoutDirection, ComposeUiNode.Companion.f15899h);
            g2.U();
            b2.invoke(new SkippableUpdater(g2), g2, Integer.valueOf((i4 >> 3) & 112));
            g2.t(2058660585);
            pVar.invoke(g2, Integer.valueOf((i4 >> 9) & 14));
            g2.V(false);
            g2.V(true);
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z == null) {
            return;
        }
        Z.d = new FlowKt$Flow$2(modifier, layoutOrientation, sizeMode, mainAxisAlignment, f2, flowCrossAxisAlignment, f3, mainAxisAlignment2, pVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0071  */
    @androidx.compose.runtime.Composable
    /* renamed from: FlowColumn-07r0xoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m589FlowColumn07r0xoM(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.SizeMode r26, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.MainAxisAlignment r27, float r28, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.FlowCrossAxisAlignment r29, float r30, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.MainAxisAlignment r31, @org.jetbrains.annotations.NotNull q0.p r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt.m589FlowColumn07r0xoM(androidx.compose.ui.Modifier, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0071  */
    @androidx.compose.runtime.Composable
    /* renamed from: FlowRow-07r0xoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m590FlowRow07r0xoM(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.SizeMode r26, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.MainAxisAlignment r27, float r28, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.FlowCrossAxisAlignment r29, float r30, @org.jetbrains.annotations.Nullable com.google.accompanist.flowlayout.MainAxisAlignment r31, @org.jetbrains.annotations.NotNull q0.p r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt.m590FlowRow07r0xoM(androidx.compose.ui.Modifier, com.google.accompanist.flowlayout.SizeMode, com.google.accompanist.flowlayout.MainAxisAlignment, float, com.google.accompanist.flowlayout.FlowCrossAxisAlignment, float, com.google.accompanist.flowlayout.MainAxisAlignment, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.f15826b : placeable.f15825a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.f15825a : placeable.f15826b;
    }
}
