package G7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final t f1335a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [G7.t] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    static {
        ?? r02 = 0;
        try {
            r02 = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r02 == 0) {
            r02 = new Object();
        }
        f1335a = r02;
    }

    public static e a(Class cls) {
        f1335a.getClass();
        return new e(cls);
    }

    public static x b(Class cls) {
        e a6 = a(cls);
        List emptyList = Collections.emptyList();
        f1335a.getClass();
        return new x(a6, emptyList);
    }
}
