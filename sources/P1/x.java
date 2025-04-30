package P1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class x extends Exception {

    /* renamed from: h, reason: collision with root package name */
    public static final StackTraceElement[] f2405h = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public N1.f f2406c;

    /* renamed from: d, reason: collision with root package name */
    public int f2407d;

    /* renamed from: f, reason: collision with root package name */
    public Class f2408f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2409g;

    public x(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof x) {
            Iterator it = ((x) th).b.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, w wVar) {
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            wVar.append("Cause (");
            int i10 = i9 + 1;
            wVar.append(String.valueOf(i10));
            wVar.append(" of ");
            wVar.append(String.valueOf(size));
            wVar.append("): ");
            Throwable th = (Throwable) list.get(i9);
            if (th instanceof x) {
                ((x) th).e(wVar);
            } else {
                c(th, wVar);
            }
            i9 = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i10 = i9 + 1;
            sb.append(i10);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i9));
            i9 = i10;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.b, new w(appendable));
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f2409g);
        String str3 = "";
        if (this.f2408f == null) {
            str = "";
        } else {
            str = ", " + this.f2408f;
        }
        sb.append(str);
        int i9 = this.f2407d;
        if (i9 == 0) {
            str2 = "";
        } else {
            str2 = ", ".concat(AbstractC2914a.o(i9));
        }
        sb.append(str2);
        if (this.f2406c != null) {
            str3 = ", " + this.f2406c;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public x(String str, List list) {
        this.f2409g = str;
        setStackTrace(f2405h);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
