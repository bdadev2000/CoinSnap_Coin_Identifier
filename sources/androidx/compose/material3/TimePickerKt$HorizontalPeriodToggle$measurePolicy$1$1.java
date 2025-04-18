package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 f12397a = new Object();

    /* renamed from: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12398a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Placeable f12399b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList, Placeable placeable) {
            super(1);
            this.f12398a = arrayList;
            this.f12399b = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f12398a;
            placementScope.e((Placeable) list.get(0), 0, 0, 0.0f);
            placementScope.e((Placeable) list.get(1), ((Placeable) list.get(0)).f15825a, 0, 0.0f);
            int i2 = ((Placeable) list.get(0)).f15825a;
            Placeable placeable = this.f12399b;
            placementScope.e(placeable, i2 - (placeable.f15825a / 2), 0, 0.0f);
            return b0.f30125a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            if (p0.a.g(LayoutIdKt.a(measurable), "Spacer")) {
                Placeable V = measurable.V(Constraints.b(j2, 0, measureScope.F0(TimePickerTokens.f13568i), 0, 0, 12));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj = list.get(i3);
                    if (!p0.a.g(LayoutIdKt.a((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    i4 = d.e((Measurable) arrayList.get(i4), Constraints.b(j2, 0, Constraints.i(j2) / 2, 0, 0, 12), arrayList2, i4, 1);
                }
                return measureScope.T(Constraints.i(j2), Constraints.h(j2), x.f30219a, new AnonymousClass1(arrayList2, V));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
