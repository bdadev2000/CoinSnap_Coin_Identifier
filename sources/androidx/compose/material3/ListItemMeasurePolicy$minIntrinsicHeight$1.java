package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.o;
import q0.p;

/* loaded from: classes.dex */
final /* synthetic */ class ListItemMeasurePolicy$minIntrinsicHeight$1 extends o implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final ListItemMeasurePolicy$minIntrinsicHeight$1 f9710a = new o(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((IntrinsicMeasurable) obj).K(((Number) obj2).intValue()));
    }
}
