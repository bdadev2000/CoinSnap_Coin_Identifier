package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes5.dex */
public final class j extends d {
    public static final j a = new j();

    @Override // ni.d
    public final e get(Type type, Annotation[] annotationArr, u0 u0Var) {
        if (d.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type parameterUpperBound = d.getParameterUpperBound(0, (ParameterizedType) type);
            if (d.getRawType(parameterUpperBound) != s0.class) {
                return new h(0, parameterUpperBound);
            }
            if (parameterUpperBound instanceof ParameterizedType) {
                return new h(1, d.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
