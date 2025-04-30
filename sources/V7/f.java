package V7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f3512a;

    static {
        try {
            Iterator it = Arrays.asList(new R7.b()).iterator();
            G7.j.e(it, "<this>");
            f3512a = N7.h.A(new N7.a(new N7.j(it, 0)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
