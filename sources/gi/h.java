package gi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements InvocationHandler {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18498b;

    /* renamed from: c, reason: collision with root package name */
    public String f18499c;

    public h(ArrayList protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        boolean z10;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
            this.f18498b = true;
            return null;
        }
        boolean areEqual = Intrinsics.areEqual(name, "protocols");
        List list = this.a;
        if (areEqual) {
            if (objArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return list;
            }
        }
        if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                if (obj != null) {
                    List list2 = (List) obj;
                    int size = list2.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj2 = list2.get(i10);
                            if (obj2 != null) {
                                String str = (String) obj2;
                                if (list.contains(str)) {
                                    this.f18499c = str;
                                    return str;
                                }
                                if (i10 == size) {
                                    break;
                                }
                                i10 = i11;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                    String str2 = (String) list.get(0);
                    this.f18499c = str2;
                    return str2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
            }
        }
        if ((Intrinsics.areEqual(name, "protocolSelected") || Intrinsics.areEqual(name, "selected")) && objArr.length == 1) {
            Object obj3 = objArr[0];
            if (obj3 != null) {
                this.f18499c = (String) obj3;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
