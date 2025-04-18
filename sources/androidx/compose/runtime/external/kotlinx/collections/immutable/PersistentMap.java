package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import r0.e;

/* loaded from: classes3.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* loaded from: classes3.dex */
    public interface Builder<K, V> extends Map<K, V>, e {
        PersistentMap build();
    }

    Builder builder();
}
