package V7;

import a.AbstractC0325a;
import t7.AbstractC2712a;
import t7.C2722k;
import y7.AbstractC2952a;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3541a = 0;

    static {
        Object b;
        Object b8;
        Exception exc = new Exception();
        String simpleName = AbstractC0325a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b = AbstractC2952a.class.getCanonicalName();
        } catch (Throwable th) {
            b = AbstractC2712a.b(th);
        }
        if (C2722k.a(b) != null) {
            b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b8 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            b8 = AbstractC2712a.b(th2);
        }
        if (C2722k.a(b8) != null) {
            b8 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
