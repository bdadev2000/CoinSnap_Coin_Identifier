package xc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class a extends s.a {
    public a() {
        super((Object) null);
    }

    @Override // s.a
    public final Method i(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // s.a
    public final Constructor j(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // s.a
    public final String[] l(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // s.a
    public final boolean m(Class cls) {
        return false;
    }
}
