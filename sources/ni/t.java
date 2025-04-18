package ni;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class t {
    public final Method a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22878b;

    public t(Method method, ArrayList arrayList) {
        this.a = method;
        this.f22878b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f22878b);
    }
}
