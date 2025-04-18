package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SelectionRegistrarImpl$sort$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f7287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.f7287a = layoutCoordinates;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LayoutCoordinates e = ((Selectable) obj).e();
        LayoutCoordinates e2 = ((Selectable) obj2).e();
        LayoutCoordinates layoutCoordinates = this.f7287a;
        long v2 = e != null ? layoutCoordinates.v(e, 0L) : 0L;
        long v3 = e2 != null ? layoutCoordinates.v(e2, 0L) : 0L;
        return Integer.valueOf(Offset.h(v2) == Offset.h(v3) ? q.c(Float.valueOf(Offset.g(v2)), Float.valueOf(Offset.g(v3))) : q.c(Float.valueOf(Offset.h(v2)), Float.valueOf(Offset.h(v3))));
    }
}
