package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class o extends d {
    public final Executor a;

    public o(Executor executor) {
        this.a = executor;
    }

    @Override // ni.d
    public final e get(Type type, Annotation[] annotationArr, u0 u0Var) {
        Executor executor = null;
        if (d.getRawType(type) != c.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m10 = com.facebook.appevents.g.m(0, (ParameterizedType) type);
            if (!com.facebook.appevents.g.t(annotationArr, v0.class)) {
                executor = this.a;
            }
            return new m(m10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
