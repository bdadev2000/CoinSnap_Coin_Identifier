package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import java.util.Map;
import q0.l;

/* loaded from: classes4.dex */
public final class SaveableStateRegistryKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f14529a = new CompositionLocal(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.f14530a);

    public static final SaveableStateRegistry a(Map map, l lVar) {
        return new SaveableStateRegistryImpl(map, lVar);
    }
}
