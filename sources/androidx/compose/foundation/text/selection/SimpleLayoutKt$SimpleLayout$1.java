package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SimpleLayoutKt$SimpleLayout$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleLayoutKt$SimpleLayout$1 f7290a = new Object();

    /* renamed from: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f7291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList) {
            super(1);
            this.f7291a = arrayList;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f7291a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                placementScope.e((Placeable) list.get(i2), 0, 0, 0.0f);
            }
            return b0.f30125a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        int i2 = 0;
        while (i2 < size) {
            i2 = d.e((Measurable) list.get(i2), j2, arrayList, i2, 1);
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i3 = 0; i3 < size2; i3++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((Placeable) arrayList.get(i3)).f15825a));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i4)).f15826b));
        }
        return measureScope.T(intValue, num.intValue(), x.f30219a, new AnonymousClass1(arrayList));
    }
}
