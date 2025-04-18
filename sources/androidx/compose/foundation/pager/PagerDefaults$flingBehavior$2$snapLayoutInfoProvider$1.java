package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f5143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f5144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1(PagerState pagerState, LayoutDirection layoutDirection, float f2) {
        super(3);
        this.f5142a = pagerState;
        this.f5143b = layoutDirection;
        this.f5144c = f2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean b2;
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        PagerState pagerState = this.f5142a;
        if (pagerState.l().c() == Orientation.f3394a) {
            b2 = PagerSnapLayoutInfoProviderKt.b(pagerState);
        } else {
            b2 = this.f5143b == LayoutDirection.f17494a ? PagerSnapLayoutInfoProviderKt.b(pagerState) : !PagerSnapLayoutInfoProviderKt.b(pagerState);
        }
        int pageSize = pagerState.l().getPageSize();
        float a2 = pageSize == 0 ? 0.0f : PagerSnapLayoutInfoProviderKt.a(pagerState) / pageSize;
        float f2 = a2 - ((int) a2);
        int i2 = Math.abs(floatValue) < pagerState.f5276p.y1(SnapFlingBehaviorKt.f3701a) ? 0 : floatValue > 0.0f ? 1 : 2;
        if (FinalSnappingItem.a(i2, 0)) {
            floatValue2 = Math.abs(f2) > this.f5144c ? floatValue3 : floatValue3;
        } else {
            if (!FinalSnappingItem.a(i2, 1)) {
                if (!FinalSnappingItem.a(i2, 2)) {
                    floatValue2 = 0.0f;
                }
            }
        }
        return Float.valueOf(floatValue2);
    }
}
