package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public abstract class d {
    public static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
        return com.facebook.appevents.g.m(i10, parameterizedType);
    }

    public static Class<?> getRawType(Type type) {
        return com.facebook.appevents.g.o(type);
    }

    public abstract e get(Type type, Annotation[] annotationArr, u0 u0Var);
}
