package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TypefaceRequestCache {

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedObject f17289a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LruCache f17290b = new LruCache(16);
}
