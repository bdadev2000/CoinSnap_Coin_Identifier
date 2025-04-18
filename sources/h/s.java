package h;

import android.content.res.Resources;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class s implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18657b;

    public /* synthetic */ s(Object obj) {
        this.f18657b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        String message;
        int i10 = this.a;
        boolean z10 = true;
        Object obj = this.f18657b;
        switch (i10) {
            case 0:
                if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                    z10 = false;
                }
                if (z10) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                    notFoundException.initCause(th2.getCause());
                    notFoundException.setStackTrace(th2.getStackTrace());
                    ((Thread.UncaughtExceptionHandler) obj).uncaughtException(thread, notFoundException);
                    return;
                }
                ((Thread.UncaughtExceptionHandler) obj).uncaughtException(thread, th2);
                return;
            default:
                he.a0.b((he.a0) obj, th2, true);
                return;
        }
    }

    public /* synthetic */ s(he.a0 a0Var) {
        this((Object) a0Var);
    }
}
