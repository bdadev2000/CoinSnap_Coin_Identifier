package U0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3112a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [U0.n] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r12;
        try {
            r12 = new E1.c((WebViewProviderFactoryBoundaryInterface) y8.a.c(WebViewProviderFactoryBoundaryInterface.class, e1.f.i()), 20);
        } catch (ClassNotFoundException unused) {
            r12 = new Object();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f3112a = r12;
    }
}
