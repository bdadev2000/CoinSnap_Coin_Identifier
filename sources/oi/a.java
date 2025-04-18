package oi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import lb.o;
import ni.k;
import ni.l;
import ni.u0;
import yg.a0;
import yg.n;

/* loaded from: classes5.dex */
public final class a extends k {
    public final a0 a;

    public a(a0 a0Var) {
        this.a = a0Var;
    }

    public static a c() {
        return new a(new a0(new o()));
    }

    public static Set d(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(n.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    @Override // ni.k
    public final l a(Type type, Annotation[] annotationArr) {
        return new b(this.a.a(type, d(annotationArr), null));
    }

    @Override // ni.k
    public final l b(Type type, Annotation[] annotationArr, u0 u0Var) {
        return new c(this.a.a(type, d(annotationArr), null));
    }
}
