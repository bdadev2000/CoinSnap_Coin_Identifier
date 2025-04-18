package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class b extends k {
    public boolean a = true;

    @Override // ni.k
    public final l a(Type type, Annotation[] annotationArr) {
        if (wh.s0.class.isAssignableFrom(com.facebook.appevents.g.o(type))) {
            return d6.h.f16898d;
        }
        return null;
    }

    @Override // ni.k
    public final l b(Type type, Annotation[] annotationArr, u0 u0Var) {
        if (type == wh.y0.class) {
            if (com.facebook.appevents.g.t(annotationArr, pi.w.class)) {
                return e6.c.f17118d;
            }
            return c6.m.f2667f;
        }
        if (type == Void.class) {
            return g6.a.f18209j;
        }
        if (this.a && type == Unit.class) {
            try {
                return e6.g.f17133f;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
        return null;
    }
}
