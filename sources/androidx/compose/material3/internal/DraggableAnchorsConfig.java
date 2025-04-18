package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DraggableAnchorsConfig<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12963a = new LinkedHashMap();

    public final void a(Enum r2, float f2) {
        this.f12963a.put(r2, Float.valueOf(f2));
    }
}
