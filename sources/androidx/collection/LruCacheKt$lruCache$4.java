package androidx.collection;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import p0.a;

/* loaded from: classes3.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<Object, Object> {
    @Override // androidx.collection.LruCache
    public final Object create(Object obj) {
        a.s(obj, SDKConstants.PARAM_KEY);
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        a.s(obj, SDKConstants.PARAM_KEY);
        a.s(obj2, "oldValue");
        throw null;
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        a.s(obj, SDKConstants.PARAM_KEY);
        a.s(obj2, "value");
        throw null;
    }
}
