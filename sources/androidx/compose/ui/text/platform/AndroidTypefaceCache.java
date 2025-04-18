package androidx.compose.ui.text.platform;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.a;

@StabilityInferred
@a
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {
    static {
        new LruCache(16);
    }
}
