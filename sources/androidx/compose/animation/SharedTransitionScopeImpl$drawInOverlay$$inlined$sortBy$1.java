package androidx.compose.animation;

import java.util.Comparator;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LayerRenderer layerRenderer = (LayerRenderer) obj;
        LayerRenderer layerRenderer2 = (LayerRenderer) obj2;
        return q.c(Float.valueOf((layerRenderer.a() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).f1913c == null) ? -1.0f : layerRenderer.a()), Float.valueOf((layerRenderer2.a() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).f1913c == null) ? -1.0f : layerRenderer2.a()));
    }
}
