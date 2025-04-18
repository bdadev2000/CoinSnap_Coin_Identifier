package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.common.api.Api;
import e0.u;
import e0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.f0;
import q0.l;
import q0.q;

/* loaded from: classes3.dex */
public final class FlowLayoutKt {

    /* renamed from: a, reason: collision with root package name */
    public static final CrossAxisAlignment f3910a = new CrossAxisAlignment.VerticalCrossAxisAlignment(Alignment.Companion.f14666j);

    /* renamed from: b, reason: collision with root package name */
    public static final CrossAxisAlignment f3911b = new CrossAxisAlignment.HorizontalCrossAxisAlignment(Alignment.Companion.f14669m);

    /* JADX WARN: Removed duplicated region for block: B:104:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r31, androidx.compose.foundation.layout.Arrangement.Horizontal r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, int r34, int r35, androidx.compose.foundation.layout.FlowRowOverflow r36, q0.q r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public static final MeasureResult b(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator it, float f2, float f3, long j2, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i4;
        MutableVector mutableVector;
        FlowLineInfo flowLineInfo;
        MutableIntObjectMap mutableIntObjectMap;
        ArrayList arrayList;
        IntIntPair intIntPair;
        MutableIntList mutableIntList;
        MutableIntList mutableIntList2;
        Measurable measurable;
        f0 f0Var;
        int i5;
        long j3;
        int i6;
        int i7;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        ArrayList arrayList2;
        MutableIntObjectMap mutableIntObjectMap2;
        MeasureScope measureScope2;
        int i8;
        int height;
        int width;
        int i9;
        int i10;
        MutableIntObjectMap mutableIntObjectMap3;
        IntIntPair intIntPair2;
        Measurable measurable2;
        FlowLineInfo flowLineInfo2;
        int i11;
        IntIntPair intIntPair3;
        int i12;
        MutableIntList mutableIntList3;
        MutableIntList mutableIntList4;
        int i13;
        int i14;
        Integer num;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i15;
        int i16;
        Iterator it2 = it;
        MutableVector mutableVector2 = new MutableVector(new MeasureResult[16]);
        int i17 = Constraints.i(j2);
        int k2 = Constraints.k(j2);
        int h2 = Constraints.h(j2);
        MutableIntObjectMap mutableIntObjectMap4 = IntObjectMapKt.f1442a;
        MutableIntObjectMap mutableIntObjectMap5 = new MutableIntObjectMap();
        ArrayList arrayList3 = new ArrayList();
        int ceil = (int) Math.ceil(measureScope.y1(f2));
        int ceil2 = (int) Math.ceil(measureScope.y1(f3));
        long a2 = ConstraintsKt.a(0, i17, 0, h2);
        long c2 = OrientationIndependentConstraints.c(OrientationIndependentConstraints.b(a2, 14), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.f4037a : LayoutOrientation.f4038b);
        ?? obj = new Object();
        if (it2 instanceof ContextualFlowItemIterator) {
            i4 = k2;
            mutableVector = mutableVector2;
            flowLineInfo = new FlowLineInfo(0, 0, measureScope.H(i17), measureScope.H(h2));
        } else {
            i4 = k2;
            mutableVector = mutableVector2;
            flowLineInfo = null;
        }
        Measurable f4 = !it.hasNext() ? null : f(it2, flowLineInfo);
        if (f4 != null) {
            mutableIntObjectMap = mutableIntObjectMap5;
            arrayList = arrayList3;
            intIntPair = new IntIntPair(e(f4, flowLineMeasurePolicy, c2, new FlowLayoutKt$breakDownItems$nextSize$1$1(obj)));
        } else {
            mutableIntObjectMap = mutableIntObjectMap5;
            arrayList = arrayList3;
            intIntPair = null;
        }
        Integer valueOf = intIntPair != null ? Integer.valueOf((int) (intIntPair.f1432a >> 32)) : null;
        Integer valueOf2 = intIntPair != null ? Integer.valueOf((int) (intIntPair.f1432a & 4294967295L)) : null;
        MutableIntList mutableIntList5 = new MutableIntList();
        MutableIntList mutableIntList6 = new MutableIntList();
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i2, flowLayoutOverflowState, j2, i3, ceil, ceil2);
        FlowLayoutBuildingBlocks.WrapInfo b2 = flowLayoutBuildingBlocks.b(it.hasNext(), 0, IntIntPair.a(i17, h2), intIntPair, 0, 0, 0, false, false);
        if (b2.f3908b) {
            mutableIntList = mutableIntList6;
            j3 = c2;
            mutableIntList2 = mutableIntList5;
            measurable = f4;
            f0Var = obj;
            i6 = 0;
            i7 = ceil2;
            i5 = ceil;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.a(b2, intIntPair != null, -1, 0, i17, 0);
        } else {
            mutableIntList = mutableIntList6;
            mutableIntList2 = mutableIntList5;
            measurable = f4;
            f0Var = obj;
            i5 = ceil;
            j3 = c2;
            i6 = 0;
            i7 = ceil2;
            wrapEllipsisInfo = null;
        }
        int i18 = i17;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        Integer num2 = valueOf;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = b2;
        Measurable measurable3 = measurable;
        int i19 = i4;
        int i20 = i6;
        int i21 = i20;
        int i22 = i21;
        int i23 = i22;
        int i24 = i23;
        int i25 = i24;
        while (!wrapInfo.f3908b && measurable3 != null) {
            p0.a.p(num2);
            int intValue = num2.intValue();
            p0.a.p(valueOf2);
            int i26 = i17;
            int i27 = i22 + intValue;
            int max = Math.max(i20, valueOf2.intValue());
            int i28 = i18 - intValue;
            int i29 = i21 + 1;
            flowLayoutOverflowState.d = i29;
            ArrayList arrayList4 = arrayList;
            arrayList4.add(measurable3);
            arrayList = arrayList4;
            MutableIntObjectMap mutableIntObjectMap6 = mutableIntObjectMap;
            mutableIntObjectMap6.i(i21, f0Var.f30930a);
            int i30 = i29 - i23;
            int i31 = i30 < i2 ? 1 : i6;
            if (flowLineInfo != null) {
                int i32 = i31 != 0 ? i24 : i24 + 1;
                if (i31 != 0) {
                    int i33 = i28 - i5;
                    if (i33 < 0) {
                        i33 = i6;
                    }
                    i9 = i23;
                    i15 = i33;
                } else {
                    i9 = i23;
                    i15 = i26;
                }
                measureScope.H(i15);
                if (i31 != 0) {
                    i16 = h2;
                } else {
                    i16 = (h2 - max) - i7;
                    if (i16 < 0) {
                        i16 = i6;
                    }
                }
                measureScope.H(i16);
                flowLineInfo.f3955a = i32;
                flowLineInfo.getClass();
                flowLineInfo.getClass();
                flowLineInfo.getClass();
            } else {
                i9 = i23;
            }
            Measurable f5 = !it.hasNext() ? null : f(it2, flowLineInfo);
            f0Var.f30930a = null;
            if (f5 != null) {
                i10 = max;
                mutableIntObjectMap3 = mutableIntObjectMap6;
                intIntPair2 = new IntIntPair(e(f5, flowLineMeasurePolicy, j3, new FlowLayoutKt$breakDownItems$1$1(f0Var)));
            } else {
                i10 = max;
                mutableIntObjectMap3 = mutableIntObjectMap6;
                intIntPair2 = null;
            }
            Integer valueOf3 = intIntPair2 != null ? Integer.valueOf(((int) (intIntPair2.f1432a >> 32)) + i5) : null;
            Integer valueOf4 = intIntPair2 != null ? Integer.valueOf((int) (intIntPair2.f1432a & 4294967295L)) : null;
            boolean hasNext = it.hasNext();
            long a3 = IntIntPair.a(i28, h2);
            if (intIntPair2 == null) {
                measurable2 = f5;
                flowLineInfo2 = flowLineInfo;
                i11 = h2;
                intIntPair3 = null;
            } else {
                p0.a.p(valueOf3);
                int intValue2 = valueOf3.intValue();
                p0.a.p(valueOf4);
                measurable2 = f5;
                flowLineInfo2 = flowLineInfo;
                i11 = h2;
                intIntPair3 = new IntIntPair(IntIntPair.a(intValue2, valueOf4.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo b3 = flowLayoutBuildingBlocks.b(hasNext, i30, a3, intIntPair3, i24, i25, i10, false, false);
            if (b3.f3907a) {
                i13 = i26;
                int min = Math.min(Math.max(i19, i27), i13);
                int i34 = i25 + i10;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo a4 = flowLayoutBuildingBlocks.a(b3, intIntPair2 != null ? 1 : i6, i24, i34, i28, i30);
                mutableIntList3 = mutableIntList;
                mutableIntList3.b(i10);
                int i35 = (h2 - i34) - i7;
                MutableIntList mutableIntList7 = mutableIntList2;
                mutableIntList7.b(i29);
                i24++;
                i25 = i34 + i7;
                i11 = i35;
                num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i5) : null;
                i19 = min;
                i14 = i13;
                i22 = i6;
                wrapEllipsisInfo2 = a4;
                i23 = i29;
                mutableIntList4 = mutableIntList7;
                i12 = i22;
            } else {
                i12 = i10;
                mutableIntList3 = mutableIntList;
                mutableIntList4 = mutableIntList2;
                i13 = i26;
                i14 = i28;
                num = valueOf3;
                i22 = i27;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
                i23 = i9;
            }
            mutableIntList2 = mutableIntList4;
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            wrapInfo = b3;
            mutableIntList = mutableIntList3;
            h2 = i11;
            num2 = num;
            i18 = i14;
            mutableIntObjectMap = mutableIntObjectMap3;
            measurable3 = measurable2;
            it2 = it;
            valueOf2 = valueOf4;
            i17 = i13;
            flowLineInfo = flowLineInfo2;
            int i36 = i12;
            i21 = i29;
            i20 = i36;
        }
        MutableIntObjectMap mutableIntObjectMap7 = mutableIntObjectMap;
        MutableIntList mutableIntList8 = mutableIntList;
        MutableIntList mutableIntList9 = mutableIntList2;
        if (wrapEllipsisInfo3 != null) {
            FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = wrapEllipsisInfo3;
            arrayList2 = arrayList;
            arrayList2.add(wrapEllipsisInfo4.f3904a);
            mutableIntObjectMap2 = mutableIntObjectMap7;
            mutableIntObjectMap2.i(arrayList2.size() - 1, wrapEllipsisInfo4.f3905b);
            int i37 = mutableIntList9.f1434b - 1;
            boolean z2 = wrapEllipsisInfo4.d;
            long j4 = wrapEllipsisInfo4.f3906c;
            if (z2) {
                mutableIntList8.e(i37, Math.max(mutableIntList8.a(i37), (int) (j4 & 4294967295L)));
                int i38 = mutableIntList9.f1434b;
                if (i38 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                mutableIntList9.e(i37, mutableIntList9.f1433a[i38 - 1] + 1);
            } else {
                mutableIntList8.b((int) (j4 & 4294967295L));
                int i39 = mutableIntList9.f1434b;
                if (i39 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                mutableIntList9.b(mutableIntList9.f1433a[i39 - 1] + 1);
            }
        } else {
            arrayList2 = arrayList;
            mutableIntObjectMap2 = mutableIntObjectMap7;
        }
        int size = arrayList2.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i40 = i6; i40 < size; i40++) {
            placeableArr[i40] = mutableIntObjectMap2.c(i40);
        }
        int i41 = mutableIntList9.f1434b;
        int[] iArr = new int[i41];
        for (int i42 = i6; i42 < i41; i42++) {
            iArr[i42] = i6;
        }
        int i43 = mutableIntList9.f1434b;
        int[] iArr2 = new int[i43];
        for (int i44 = i6; i44 < i43; i44++) {
            iArr2[i44] = i6;
        }
        int[] iArr3 = mutableIntList9.f1433a;
        int i45 = mutableIntList9.f1434b;
        int i46 = i19;
        int i47 = i6;
        int i48 = i47;
        int i49 = i48;
        Placeable[] placeableArr2 = placeableArr;
        while (i47 < i45) {
            int i50 = iArr3[i47];
            int i51 = i46;
            ArrayList arrayList5 = arrayList2;
            int i52 = i45;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int i53 = i49;
            MutableIntList mutableIntList10 = mutableIntList8;
            int[] iArr6 = iArr;
            Placeable[] placeableArr3 = placeableArr2;
            MeasureResult a5 = RowColumnMeasurePolicyKt.a(flowLineMeasurePolicy, i46, Constraints.j(a2), Constraints.i(a2), mutableIntList8.a(i47), i5, measureScope, arrayList5, placeableArr2, i53, i50, iArr, i47);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = a5.getWidth();
                width = a5.getHeight();
            } else {
                height = a5.getHeight();
                width = a5.getWidth();
            }
            iArr5[i47] = width;
            i48 += width;
            i46 = Math.max(i51, height);
            mutableVector.b(a5);
            i47++;
            iArr = iArr6;
            iArr2 = iArr5;
            mutableIntList8 = mutableIntList10;
            i49 = i50;
            arrayList2 = arrayList5;
            i45 = i52;
            iArr3 = iArr4;
            placeableArr2 = placeableArr3;
        }
        int i54 = i46;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        MutableVector mutableVector3 = mutableVector;
        if (mutableVector3.l()) {
            i54 = i6;
        } else {
            i6 = i48;
        }
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical l2 = flowLineMeasurePolicy.l();
        Arrangement.Horizontal j5 = flowLineMeasurePolicy.j();
        if (!isHorizontal) {
            measureScope2 = measureScope;
            if (j5 == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            int A = p0.a.A(((mutableVector3.f14144c - 1) * measureScope2.F0(j5.a())) + i6, Constraints.j(j2), Constraints.h(j2));
            j5.c(measureScope, A, iArr7, measureScope.getLayoutDirection(), iArr8);
            i8 = A;
        } else {
            if (l2 == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            measureScope2 = measureScope;
            i8 = p0.a.A(((mutableVector3.f14144c - 1) * measureScope2.F0(l2.a())) + i6, Constraints.j(j2), Constraints.h(j2));
            l2.b(measureScope2, i8, iArr7, iArr8);
        }
        int A2 = p0.a.A(i54, Constraints.k(j2), Constraints.i(j2));
        if (isHorizontal) {
            int i55 = i8;
            i8 = A2;
            A2 = i55;
        }
        return measureScope2.T(i8, A2, x.f30219a, new FlowLayoutKt$placeHelper$5(mutableVector3));
    }

    public static final int c(IntrinsicMeasurable intrinsicMeasurable, boolean z2, int i2) {
        return z2 ? intrinsicMeasurable.K(i2) : intrinsicMeasurable.R(i2);
    }

    public static final long d(List list, q qVar, q qVar2, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i7;
        List list2 = list;
        q qVar3 = qVar;
        if (list.isEmpty()) {
            return IntIntPair.a(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i5, flowLayoutOverflowState, ConstraintsKt.a(0, i2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), i6, i3, i4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) u.G0(0, list2);
        int intValue = intrinsicMeasurable != null ? ((Number) qVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i2))).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? ((Number) qVar3.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue))).intValue() : 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        if (flowLayoutBuildingBlocks.b(list.size() > 1, 0, IntIntPair.a(i2, Api.BaseClientBuilder.API_PRIORITY_OTHER), intrinsicMeasurable == null ? null : new IntIntPair(IntIntPair.a(intValue2, intValue)), 0, 0, 0, false, false).f3908b) {
            IntIntPair a2 = flowLayoutOverflowState.a(0, 0, intrinsicMeasurable != null);
            return IntIntPair.a(a2 != null ? (int) (a2.f1432a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i11 = i2;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            int i15 = i11 - intValue2;
            int i16 = i12 + 1;
            int max = Math.max(i8, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) u.G0(i16, list2);
            int intValue3 = intrinsicMeasurable2 != null ? ((Number) qVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(i2))).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? ((Number) qVar3.invoke(intrinsicMeasurable2, Integer.valueOf(i16), Integer.valueOf(intValue3))).intValue() + i3 : 0;
            boolean z2 = i12 + 2 < list.size();
            int i17 = i16 - i13;
            FlowLayoutBuildingBlocks.WrapInfo b2 = flowLayoutBuildingBlocks.b(z2, i17, IntIntPair.a(i15, Api.BaseClientBuilder.API_PRIORITY_OTHER), intrinsicMeasurable2 == null ? null : new IntIntPair(IntIntPair.a(intValue4, intValue3)), i10, i9, max, false, false);
            if (b2.f3907a) {
                int i18 = max + i4 + i9;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo a3 = flowLayoutBuildingBlocks.a(b2, intrinsicMeasurable2 != null, i10, i18, i15, i17);
                int i19 = intValue4 - i3;
                i10++;
                if (b2.f3908b) {
                    if (a3 != null && !a3.d) {
                        i18 += ((int) (a3.f3906c & 4294967295L)) + i4;
                    }
                    i9 = i18;
                    i14 = i16;
                } else {
                    i7 = i2;
                    i9 = i18;
                    i13 = i16;
                    intValue2 = i19;
                    i8 = 0;
                }
            } else {
                i8 = max;
                i7 = i15;
                intValue2 = intValue4;
            }
            i12 = i16;
            i14 = i12;
            intValue = intValue3;
            list2 = list;
            i11 = i7;
            qVar3 = qVar;
        }
        return IntIntPair.a(i9 - i4, i14);
    }

    public static final long e(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j2, l lVar) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.c(RowColumnImplKt.a(measurable)) == 0.0f) {
            RowColumnParentData a2 = RowColumnImplKt.a(measurable);
            if (((a2 == null || (flowLayoutData = a2.d) == null) ? null : Float.valueOf(flowLayoutData.f3909a)) == null) {
                Placeable V = measurable.V(j2);
                lVar.invoke(V);
                return IntIntPair.a(flowLineMeasurePolicy.d(V), flowLineMeasurePolicy.e(V));
            }
        }
        int R = flowLineMeasurePolicy.isHorizontal() ? measurable.R(Api.BaseClientBuilder.API_PRIORITY_OTHER) : measurable.K(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return IntIntPair.a(R, c(measurable, flowLineMeasurePolicy.isHorizontal(), R));
    }

    public static final Measurable f(Iterator it, FlowLineInfo flowLineInfo) {
        Measurable measurable;
        try {
            if (it instanceof ContextualFlowItemIterator) {
                p0.a.p(flowLineInfo);
                measurable = ((ContextualFlowItemIterator) it).b(flowLineInfo);
            } else {
                measurable = (Measurable) it.next();
            }
            return measurable;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
