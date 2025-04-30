package r8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final List f22939a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public String f22940c;

    public h(ArrayList arrayList) {
        this.f22939a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        G7.j.e(obj, "proxy");
        G7.j.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (G7.j.a(name, "supports") && G7.j.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (G7.j.a(name, "unsupported") && G7.j.a(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean a6 = G7.j.a(name, "protocols");
        List list = this.f22939a;
        if (a6 && objArr.length == 0) {
            return list;
        }
        if ((G7.j.a(name, "selectProtocol") || G7.j.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                if (obj2 != null) {
                    List list2 = (List) obj2;
                    int size = list2.size();
                    if (size >= 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            Object obj3 = list2.get(i9);
                            if (obj3 != null) {
                                String str = (String) obj3;
                                if (list.contains(str)) {
                                    this.f22940c = str;
                                    return str;
                                }
                                if (i9 == size) {
                                    break;
                                }
                                i9 = i10;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                    String str2 = (String) list.get(0);
                    this.f22940c = str2;
                    return str2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
        }
        if ((G7.j.a(name, "protocolSelected") || G7.j.a(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            if (obj4 != null) {
                this.f22940c = (String) obj4;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
