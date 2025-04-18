package ni;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class m implements e {
    public final /* synthetic */ Type a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Executor f22821b;

    public m(Type type, Executor executor) {
        this.a = type;
        this.f22821b = executor;
    }

    @Override // ni.e
    public final Object adapt(c cVar) {
        Executor executor = this.f22821b;
        return executor == null ? cVar : new n(executor, cVar);
    }

    @Override // ni.e
    /* renamed from: responseType */
    public final Type getResponseType() {
        return this.a;
    }
}
