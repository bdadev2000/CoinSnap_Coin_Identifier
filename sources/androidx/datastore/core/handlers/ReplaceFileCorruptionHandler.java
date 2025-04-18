package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l f19062a;

    public ReplaceFileCorruptionHandler(l lVar) {
        a.s(lVar, "produceNewData");
        this.f19062a = lVar;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public final Object a(CorruptionException corruptionException) {
        return this.f19062a.invoke(corruptionException);
    }
}
