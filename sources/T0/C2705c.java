package t0;

import G7.s;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.f0;
import com.mbridge.msdk.foundation.entity.o;
import java.io.PrintWriter;
import n1.C2475f;
import x.m;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2705c extends AbstractC2703a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0511v f23001a;
    public final C2704b b;

    public C2705c(InterfaceC0511v interfaceC0511v, f0 f0Var) {
        this.f23001a = interfaceC0511v;
        this.b = (C2704b) new C2475f(f0Var, C2704b.f23000c).o(s.a(C2704b.class));
    }

    public final void b(String str, PrintWriter printWriter) {
        m mVar = this.b.b;
        if (mVar.f24089d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (mVar.f24089d > 0) {
                o.v(mVar.f24088c[0]);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(mVar.b[0]);
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0511v interfaceC0511v = this.f23001a;
        if (interfaceC0511v == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC0511v.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0511v.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC0511v)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
