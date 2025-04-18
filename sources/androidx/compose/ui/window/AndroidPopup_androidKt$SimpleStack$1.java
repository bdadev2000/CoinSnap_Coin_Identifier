package androidx.compose.ui.window;

import android.support.v4.media.d;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import b1.f0;
import d0.b0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidPopup_androidKt$SimpleStack$1 f17656a = new Object();

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17657a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f17658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Placeable placeable) {
            super(1);
            this.f17658a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope.h((Placeable.PlacementScope) obj, this.f17658a, 0, 0);
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f17659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ArrayList arrayList) {
            super(1);
            this.f17659a = arrayList;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f17659a;
            int p2 = f0.p(list);
            if (p2 >= 0) {
                int i2 = 0;
                while (true) {
                    Placeable.PlacementScope.h(placementScope, (Placeable) list.get(i2), 0, 0);
                    if (i2 == p2) {
                        break;
                    }
                    i2++;
                }
            }
            return b0.f30125a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        int i2;
        int size = list.size();
        x xVar = x.f30219a;
        int i3 = 0;
        if (size == 0) {
            return measureScope.T(0, 0, xVar, AnonymousClass1.f17657a);
        }
        if (size == 1) {
            Placeable V = ((Measurable) list.get(0)).V(j2);
            return measureScope.T(V.f15825a, V.f15826b, xVar, new AnonymousClass2(V));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i4 = 0;
        while (i4 < size2) {
            i4 = d.e((Measurable) list.get(i4), j2, arrayList, i4, 1);
        }
        int p2 = f0.p(arrayList);
        if (p2 >= 0) {
            int i5 = 0;
            i2 = 0;
            while (true) {
                Placeable placeable = (Placeable) arrayList.get(i3);
                i5 = Math.max(i5, placeable.f15825a);
                i2 = Math.max(i2, placeable.f15826b);
                if (i3 == p2) {
                    break;
                }
                i3++;
            }
            i3 = i5;
        } else {
            i2 = 0;
        }
        return measureScope.T(i3, i2, xVar, new AnonymousClass3(arrayList));
    }
}
