package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f17037a;

    public TextLayoutCache(int i2) {
        this.f17037a = new LruCache(i2);
    }
}
