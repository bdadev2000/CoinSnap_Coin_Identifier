package androidx.compose.foundation.text;

import android.support.v4.media.d;
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
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 f5411a = new Object();

    /* renamed from: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f5412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList) {
            super(1);
            this.f5412a = arrayList;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
            List list = this.f5412a;
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
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i2 = d.e((Measurable) list.get(i2), j2, arrayList, i2, 1);
        }
        return measureScope.T(Constraints.i(j2), Constraints.h(j2), x.f30219a, new AnonymousClass1(arrayList));
    }
}
