package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class LazyListMeasureKt$measureLazyList$8 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListMeasuredItem f4346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4347c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$8(ArrayList arrayList, LazyListMeasuredItem lazyListMeasuredItem, boolean z2, MutableState mutableState) {
        super(1);
        this.f4345a = arrayList;
        this.f4346b = lazyListMeasuredItem;
        this.f4347c = z2;
        this.d = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LazyListMeasuredItem lazyListMeasuredItem;
        boolean z2;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f4345a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            lazyListMeasuredItem = this.f4346b;
            z2 = this.f4347c;
            if (i2 >= size) {
                break;
            }
            LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) list.get(i2);
            if (lazyListMeasuredItem2 != lazyListMeasuredItem) {
                lazyListMeasuredItem2.f(placementScope, z2);
            }
            i2++;
        }
        if (lazyListMeasuredItem != null) {
            lazyListMeasuredItem.f(placementScope, z2);
        }
        this.d.getValue();
        return b0.f30125a;
    }
}
