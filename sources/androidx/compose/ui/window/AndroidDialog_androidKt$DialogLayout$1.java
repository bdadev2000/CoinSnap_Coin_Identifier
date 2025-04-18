package androidx.compose.ui.window;

import android.support.v4.media.d;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import b1.f0;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidDialog_androidKt$DialogLayout$1 f17610a = new Object();

    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f17611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList) {
            super(1);
            this.f17611a = arrayList;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f17611a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable.PlacementScope.h(placementScope, (Placeable) list.get(i2), 0, 0);
            }
            return b0.f30125a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i2 = d.e((Measurable) list.get(i2), j2, arrayList, i2, 1);
        }
        int i3 = 1;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((Placeable) obj).f15825a;
            int p2 = f0.p(arrayList);
            if (1 <= p2) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((Placeable) obj3).f15825a;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == p2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int k2 = placeable != null ? placeable.f15825a : Constraints.k(j2);
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((Placeable) obj2).f15826b;
            int p3 = f0.p(arrayList);
            if (1 <= p3) {
                while (true) {
                    Object obj4 = arrayList.get(i3);
                    int i8 = ((Placeable) obj4).f15826b;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i3 == p3) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        return measureScope.T(k2, placeable2 != null ? placeable2.f15826b : Constraints.j(j2), x.f30219a, new AnonymousClass1(arrayList));
    }
}
