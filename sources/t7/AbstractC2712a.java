package t7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import x7.EnumC2928a;

/* renamed from: t7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2712a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2928a f23013a = EnumC2928a.b;

    public static void a(Throwable th, Throwable th2) {
        G7.j.e(th, "<this>");
        G7.j.e(th2, "exception");
        if (th != th2) {
            Integer num = B7.a.f336a;
            if (num != null && num.intValue() < 19) {
                Method method = A7.a.f84a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static final C2721j b(Throwable th) {
        G7.j.e(th, "exception");
        return new C2721j(th);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [t7.l, java.lang.Object, t7.f] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, t7.z, t7.f] */
    public static InterfaceC2717f c(EnumC2718g enumC2718g, F7.a aVar) {
        int ordinal = enumC2718g.ordinal();
        if (ordinal != 0) {
            u uVar = u.f23028a;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.b = aVar;
                    obj.f23030c = uVar;
                    return obj;
                }
                throw new RuntimeException();
            }
            ?? obj2 = new Object();
            obj2.b = aVar;
            obj2.f23023c = uVar;
            return obj2;
        }
        return new C2724m(aVar);
    }

    public static C2724m d(F7.a aVar) {
        G7.j.e(aVar, "initializer");
        return new C2724m(aVar);
    }

    public static String e(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        G7.j.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static final void f(Object obj) {
        if (!(obj instanceof C2721j)) {
        } else {
            throw ((C2721j) obj).b;
        }
    }
}
