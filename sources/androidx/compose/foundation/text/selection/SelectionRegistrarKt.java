package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;

/* loaded from: classes3.dex */
public final class SelectionRegistrarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f7288a = CompositionLocalKt.c(SelectionRegistrarKt$LocalSelectionRegistrar$1.f7289a);

    public static final boolean a(SelectionRegistrar selectionRegistrar, long j2) {
        LongObjectMap b2;
        if (selectionRegistrar == null || (b2 = selectionRegistrar.b()) == null) {
            return false;
        }
        return b2.b(j2);
    }
}
