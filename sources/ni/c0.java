package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: classes5.dex */
public final class c0 extends k {
    public static final c0 a = new c0();

    @Override // ni.k
    public final l b(Type type, Annotation[] annotationArr, u0 u0Var) {
        if (com.facebook.appevents.g.o(type) != Optional.class) {
            return null;
        }
        return new ka.f(u0Var.e(com.facebook.appevents.g.m(0, (ParameterizedType) type), annotationArr));
    }
}
