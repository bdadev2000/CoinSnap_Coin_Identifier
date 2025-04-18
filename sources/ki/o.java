package ki;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class o {
    public static final w a;

    static {
        w wVar;
        try {
            Class.forName("java.nio.file.Files");
            wVar = new x();
        } catch (ClassNotFoundException unused) {
            wVar = new w();
        }
        a = wVar;
        String str = b0.f20952c;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        wh.c0.h(property, false);
        ClassLoader classLoader = li.f.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        new li.f(classLoader);
    }

    public abstract void a(b0 b0Var, b0 b0Var2);

    public abstract void b(b0 b0Var);

    public abstract void c(b0 b0Var);

    public final boolean d(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        if (e(path) != null) {
            return true;
        }
        return false;
    }

    public abstract jb.t e(b0 b0Var);

    public abstract v f(b0 b0Var);

    public abstract v g(b0 b0Var);

    public abstract k0 h(b0 b0Var);
}
