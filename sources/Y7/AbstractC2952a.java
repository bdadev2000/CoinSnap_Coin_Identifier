package y7;

import G7.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import t7.AbstractC2712a;
import x7.EnumC2928a;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2952a implements w7.f, InterfaceC2955d, Serializable {
    public final w7.f b;

    public AbstractC2952a(w7.f fVar) {
        this.b = fVar;
    }

    public w7.f c(Object obj, w7.f fVar) {
        j.e(fVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC2955d d() {
        w7.f fVar = this.b;
        if (fVar instanceof InterfaceC2955d) {
            return (InterfaceC2955d) fVar;
        }
        return null;
    }

    @Override // w7.f
    public final void e(Object obj) {
        w7.f fVar = this;
        while (true) {
            AbstractC2952a abstractC2952a = (AbstractC2952a) fVar;
            w7.f fVar2 = abstractC2952a.b;
            j.b(fVar2);
            try {
                obj = abstractC2952a.i(obj);
                if (obj == EnumC2928a.b) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC2712a.b(th);
            }
            abstractC2952a.j();
            if (fVar2 instanceof AbstractC2952a) {
                fVar = fVar2;
            } else {
                fVar2.e(obj);
                return;
            }
        }
    }

    public StackTraceElement h() {
        int i9;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i10;
        InterfaceC2956e interfaceC2956e = (InterfaceC2956e) getClass().getAnnotation(InterfaceC2956e.class);
        String str2 = null;
        if (interfaceC2956e == null) {
            return null;
        }
        int v6 = interfaceC2956e.v();
        if (v6 <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                i9 = i10 - 1;
            } catch (Exception unused) {
                i9 = -1;
            }
            if (i9 >= 0) {
                i11 = interfaceC2956e.l()[i9];
            }
            s8.h hVar = AbstractC2957f.b;
            s8.h hVar2 = AbstractC2957f.f24448a;
            if (hVar == null) {
                try {
                    s8.h hVar3 = new s8.h(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC2957f.b = hVar3;
                    hVar = hVar3;
                } catch (Exception unused2) {
                    AbstractC2957f.b = hVar2;
                    hVar = hVar2;
                }
            }
            if (hVar != hVar2) {
                Method method = hVar.f22996a;
                if (method != null) {
                    obj = method.invoke(getClass(), null);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = hVar.b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, null);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = hVar.f22997c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, null);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = interfaceC2956e.c();
            } else {
                str = str2 + '/' + interfaceC2956e.c();
            }
            return new StackTraceElement(str, interfaceC2956e.m(), interfaceC2956e.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v6 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object i(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object h6 = h();
        if (h6 == null) {
            h6 = getClass().getName();
        }
        sb.append(h6);
        return sb.toString();
    }

    public void j() {
    }
}
