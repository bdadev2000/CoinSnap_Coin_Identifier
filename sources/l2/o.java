package l2;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class o {
    public static final p a;

    static {
        p cVar;
        try {
            cVar = new fb.c((WebViewProviderFactoryBoundaryInterface) mi.a.b(WebViewProviderFactoryBoundaryInterface.class, com.facebook.appevents.o.g()), 12);
        } catch (ClassNotFoundException unused) {
            cVar = new x5.c();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
        a = cVar;
    }
}
