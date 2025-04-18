package androidx.datastore.core;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SingleProcessDataStore$actor$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore f18999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore singleProcessDataStore) {
        super(1);
        this.f18999a = singleProcessDataStore;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            this.f18999a.f18986h.h(new Final(th));
        }
        Object obj2 = SingleProcessDataStore.f18980l;
        SingleProcessDataStore singleProcessDataStore = this.f18999a;
        synchronized (obj2) {
            SingleProcessDataStore.f18979k.remove(singleProcessDataStore.c().getAbsolutePath());
        }
        return b0.f30125a;
    }
}
