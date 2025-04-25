package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo342measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        int i;
        Measurable measurable4;
        final int m2035calculateWidthVsPV1Ek;
        final int m2034calculateHeightO3s9Psw;
        List<? extends Measurable> list2 = list;
        final int i2 = measureScope.mo671roundToPx0680j_4(this.paddingValues.getTop());
        int i3 = measureScope.mo671roundToPx0680j_4(this.paddingValues.getBottom());
        final int i4 = measureScope.mo671roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long m6941copyZbe2FdA$default = Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i5++;
        }
        Measurable measurable5 = measurable;
        Placeable mo5851measureBRTryo0 = measurable5 != null ? measurable5.mo5851measureBRTryo0(m6941copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo5851measureBRTryo0);
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i6);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i6++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo5851measureBRTryo02 = measurable6 != null ? measurable6.mo5851measureBRTryo0(ConstraintsKt.m6970offsetNN6EwU$default(m6941copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i7 = -i3;
        int i8 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo5851measureBRTryo02));
        long m6969offsetNN6EwU = ConstraintsKt.m6969offsetNN6EwU(m6941copyZbe2FdA$default, i8, i7);
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i9);
            int i10 = size3;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i9++;
            size3 = i10;
        }
        Measurable measurable7 = measurable3;
        Placeable mo5851measureBRTryo03 = measurable7 != null ? measurable7.mo5851measureBRTryo0(m6969offsetNN6EwU) : null;
        if (mo5851measureBRTryo03 != null) {
            i = mo5851measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i == Integer.MIN_VALUE) {
                i = mo5851measureBRTryo03.getHeight();
            }
        } else {
            i = 0;
        }
        final int max = Math.max(i, i2);
        long m6969offsetNN6EwU2 = ConstraintsKt.m6969offsetNN6EwU(Constraints.m6941copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i8, mo5851measureBRTryo03 != null ? (i7 - i4) - max : (-i2) - i3);
        int size4 = list.size();
        int i11 = 0;
        while (i11 < size4) {
            Measurable measurable8 = list2.get(i11);
            int i12 = size4;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                final Placeable mo5851measureBRTryo04 = measurable8.mo5851measureBRTryo0(m6969offsetNN6EwU2);
                long m6941copyZbe2FdA$default2 = Constraints.m6941copyZbe2FdA$default(m6969offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list2.get(i13);
                    int i14 = size5;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i13++;
                    list2 = list;
                    size5 = i14;
                }
                Measurable measurable9 = measurable4;
                Placeable mo5851measureBRTryo05 = measurable9 != null ? measurable9.mo5851measureBRTryo0(m6941copyZbe2FdA$default2) : null;
                m2035calculateWidthVsPV1Ek = TextFieldKt.m2035calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo5851measureBRTryo0), TextFieldImplKt.widthOrZero(mo5851measureBRTryo02), mo5851measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo5851measureBRTryo03), TextFieldImplKt.widthOrZero(mo5851measureBRTryo05), j);
                m2034calculateHeightO3s9Psw = TextFieldKt.m2034calculateHeightO3s9Psw(mo5851measureBRTryo04.getHeight(), mo5851measureBRTryo03 != null, max, TextFieldImplKt.heightOrZero(mo5851measureBRTryo0), TextFieldImplKt.heightOrZero(mo5851measureBRTryo02), TextFieldImplKt.heightOrZero(mo5851measureBRTryo05), j, measureScope.getDensity(), this.paddingValues);
                final Placeable placeable = mo5851measureBRTryo03;
                final int i15 = i;
                final Placeable placeable2 = mo5851measureBRTryo05;
                final Placeable placeable3 = mo5851measureBRTryo0;
                final Placeable placeable4 = mo5851measureBRTryo02;
                return MeasureScope.layout$default(measureScope, m2035calculateWidthVsPV1Ek, m2034calculateHeightO3s9Psw, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        boolean z;
                        PaddingValues paddingValues;
                        boolean z2;
                        float f;
                        if (Placeable.this != null) {
                            int coerceAtLeast = RangesKt.coerceAtLeast(i2 - i15, 0);
                            int i16 = m2035calculateWidthVsPV1Ek;
                            int i17 = m2034calculateHeightO3s9Psw;
                            Placeable placeable5 = mo5851measureBRTryo04;
                            Placeable placeable6 = Placeable.this;
                            Placeable placeable7 = placeable2;
                            Placeable placeable8 = placeable3;
                            Placeable placeable9 = placeable4;
                            z2 = this.singleLine;
                            int i18 = max + i4;
                            f = this.animationProgress;
                            TextFieldKt.placeWithLabel(placementScope, i16, i17, placeable5, placeable6, placeable7, placeable8, placeable9, z2, coerceAtLeast, i18, f, measureScope.getDensity());
                            return;
                        }
                        int i19 = m2035calculateWidthVsPV1Ek;
                        int i20 = m2034calculateHeightO3s9Psw;
                        Placeable placeable10 = mo5851measureBRTryo04;
                        Placeable placeable11 = placeable2;
                        Placeable placeable12 = placeable3;
                        Placeable placeable13 = placeable4;
                        z = this.singleLine;
                        float density = measureScope.getDensity();
                        paddingValues = this.paddingValues;
                        TextFieldKt.placeWithoutLabel(placementScope, i19, i20, placeable10, placeable11, placeable12, placeable13, z, density, paddingValues);
                    }
                }, 4, null);
            }
            i11++;
            list2 = list;
            size4 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2035calculateWidthVsPV1Ek;
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable5 = measurables.get(i);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int intValue = intrinsicMeasurer.invoke(intrinsicMeasurable5, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i2 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i2 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i2);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable6 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable6, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable7 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable8 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = measurables.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2035calculateWidthVsPV1Ek = TextFieldKt.m2035calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
                return m2035calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i2;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2034calculateHeightO3s9Psw;
        int size = list.size();
        int i5 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i5 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i2 = i - intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE);
            i3 = function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i2 -= intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE);
            i4 = function2.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i2)).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int intValue2 = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2034calculateHeightO3s9Psw = TextFieldKt.m2034calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i3, i4, intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2034calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
