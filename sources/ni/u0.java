package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public final wh.j f22885b;

    /* renamed from: c, reason: collision with root package name */
    public final wh.d0 f22886c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22887d;

    /* renamed from: e, reason: collision with root package name */
    public final List f22888e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f22889f;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22890g = false;

    public u0(wh.j jVar, wh.d0 d0Var, List list, List list2, Executor executor) {
        this.f22885b = jVar;
        this.f22886c = d0Var;
        this.f22887d = list;
        this.f22888e = list2;
        this.f22889f = executor;
    }

    public final e a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f22888e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            e eVar = ((d) list.get(i10)).get(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((d) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object b(Class cls) {
        boolean z10;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f22890g) {
                o0 o0Var = o0.f22825c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (o0Var.a && method.isDefault()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c6.j(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final s c(Method method) {
        s sVar;
        s sVar2 = (s) this.a.get(method);
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (this.a) {
            sVar = (s) this.a.get(method);
            if (sVar == null) {
                sVar = s.b(this, method);
                this.a.put(method, sVar);
            }
        }
        return sVar;
    }

    public final l d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f22887d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            l a = ((k) list.get(i10)).a(type, annotationArr);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((k) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final l e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f22887d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            l b3 = ((k) list.get(i10)).b(type, annotationArr, this);
            if (b3 != null) {
                return b3;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((k) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f22887d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((k) list.get(i10)).getClass();
        }
    }
}
