package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.ui.layout.LayoutCoordinates;

/* loaded from: classes3.dex */
public interface SelectionRegistrar {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    long a();

    LongObjectMap b();

    void c(long j2);

    void d(Selectable selectable);

    boolean e(long j2, long j3, SelectionAdjustment selectionAdjustment, LayoutCoordinates layoutCoordinates, boolean z2);

    void f(long j2);

    void g(long j2, a aVar, LayoutCoordinates layoutCoordinates, boolean z2);

    void h();

    Selectable i(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate);
}
