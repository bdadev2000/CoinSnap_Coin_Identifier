package j0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.q;

/* loaded from: classes2.dex */
public abstract class a implements h0.g, d, Serializable {

    @Nullable
    private final h0.g completion;

    public a(h0.g gVar) {
        this.completion = gVar;
    }

    @NotNull
    public h0.g create(@NotNull h0.g gVar) {
        p0.a.s(gVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public d getCallerFrame() {
        h0.g gVar = this.completion;
        if (gVar instanceof d) {
            return (d) gVar;
        }
        return null;
    }

    @Nullable
    public final h0.g getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int i2;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v2 = eVar.v();
        if (v2 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? eVar.l()[i2] : -1;
        q qVar = f.f30860b;
        q qVar2 = f.f30859a;
        if (qVar == null) {
            try {
                q qVar3 = new q(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f30860b = qVar3;
                qVar = qVar3;
            } catch (Exception unused2) {
                f.f30860b = qVar2;
                qVar = qVar2;
            }
        }
        if (qVar != qVar2) {
            Method method = (Method) qVar.f31329a;
            Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (invoke != null) {
                Method method2 = (Method) qVar.f31330b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                if (invoke2 != null) {
                    Method method3 = (Method) qVar.f31331c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // h0.g
    public final void resumeWith(@NotNull Object obj) {
        h0.g gVar = this;
        while (true) {
            a aVar = (a) gVar;
            h0.g gVar2 = aVar.completion;
            p0.a.p(gVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == i0.a.f30806a) {
                    return;
                }
            } catch (Throwable th) {
                obj = kotlin.jvm.internal.q.d(th);
            }
            aVar.releaseIntercepted();
            if (!(gVar2 instanceof a)) {
                gVar2.resumeWith(obj);
                return;
            }
            gVar = gVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public h0.g create(@Nullable Object obj, @NotNull h0.g gVar) {
        p0.a.s(gVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
