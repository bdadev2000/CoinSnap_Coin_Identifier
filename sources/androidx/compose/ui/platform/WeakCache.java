package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

@StabilityInferred
/* loaded from: classes3.dex */
public final class WeakCache<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f16643a = new MutableVector(new Reference[16]);

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue f16644b = new ReferenceQueue();
}
