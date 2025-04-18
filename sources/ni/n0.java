package ni;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class n0 extends o0 {
    @Override // ni.o0
    public final Executor a() {
        return new j0.h();
    }

    @Override // ni.o0
    public final Object b(Class cls, Object obj, Method method, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(cls, obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
