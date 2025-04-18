package l1;

import a4.j;
import androidx.lifecycle.d1;
import androidx.lifecycle.v;
import java.io.PrintWriter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import r.l;

/* loaded from: classes.dex */
public final class c extends a {
    public final v a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21112b;

    public c(v vVar, d1 d1Var) {
        this.a = vVar;
        this.f21112b = (b) new h.c(d1Var, b.f21111b, 0).s(b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        l lVar = this.f21112b.a;
        if (lVar.f23959d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (lVar.f23959d > 0) {
                j.t(lVar.f23958c[0]);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(lVar.f23957b[0]);
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        v vVar = this.a;
        if (vVar == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            String simpleName = vVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = vVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb2.append(simpleName);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb2.append(Integer.toHexString(System.identityHashCode(vVar)));
        }
        sb2.append("}}");
        return sb2.toString();
    }
}
