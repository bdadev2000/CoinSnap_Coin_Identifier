package uc;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f25792b;

    public o(Method method) {
        this.f25792b = method;
    }

    @Override // uc.q
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f25792b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e2) {
            throw new RuntimeException("Failed invoking canAccess", e2);
        }
    }
}
