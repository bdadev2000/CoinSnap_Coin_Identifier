package ki;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f21009e;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f21010b;

    /* renamed from: c, reason: collision with root package name */
    public final o f21011c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f21012d;

    static {
        String str = b0.f20952c;
        f21009e = wh.c0.h("/", false);
    }

    public n0(b0 zipPath, w fileSystem, Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f21010b = zipPath;
        this.f21011c = fileSystem;
        this.f21012d = entries;
    }

    @Override // ki.o
    public final void a(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ki.o
    public final void b(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ki.o
    public final void c(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ki.o
    public final jb.t e(b0 child) {
        Long valueOf;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(child, "path");
        b0 b0Var = f21009e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        li.g gVar = (li.g) this.f21012d.get(li.c.b(b0Var, child, true));
        Throwable th2 = null;
        if (gVar == null) {
            return null;
        }
        boolean z10 = gVar.f21389b;
        boolean z11 = !z10;
        if (z10) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(gVar.f21391d);
        }
        jb.t basicMetadata = new jb.t(z11, z10, null, valueOf, null, gVar.f21393f, null);
        long j3 = gVar.f21394g;
        if (j3 == -1) {
            return basicMetadata;
        }
        v f10 = this.f21011c.f(this.f21010b);
        try {
            e0Var = a6.k.f(f10.k(j3));
            try {
                f10.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (f10 != null) {
                try {
                    f10.close();
                } catch (Throwable th5) {
                    ExceptionsKt.addSuppressed(th4, th5);
                }
            }
            e0Var = null;
            th2 = th4;
        }
        if (th2 == null) {
            Intrinsics.checkNotNull(e0Var);
            Intrinsics.checkNotNullParameter(e0Var, "<this>");
            Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
            jb.t e2 = li.j.e(e0Var, basicMetadata);
            Intrinsics.checkNotNull(e2);
            return e2;
        }
        throw th2;
    }

    @Override // ki.o
    public final v f(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ki.o
    public final v g(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // ki.o
    public final k0 h(b0 child) {
        Throwable th2;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(child, "file");
        b0 b0Var = f21009e;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        li.g gVar = (li.g) this.f21012d.get(li.c.b(b0Var, child, true));
        if (gVar != null) {
            v f10 = this.f21011c.f(this.f21010b);
            try {
                e0Var = a6.k.f(f10.k(gVar.f21394g));
                try {
                    f10.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (f10 != null) {
                    try {
                        f10.close();
                    } catch (Throwable th5) {
                        ExceptionsKt.addSuppressed(th4, th5);
                    }
                }
                th2 = th4;
                e0Var = null;
            }
            if (th2 == null) {
                Intrinsics.checkNotNull(e0Var);
                Intrinsics.checkNotNullParameter(e0Var, "<this>");
                li.j.e(e0Var, null);
                int i10 = gVar.f21392e;
                long j3 = gVar.f21391d;
                if (i10 == 0) {
                    return new li.e(e0Var, j3, true);
                }
                li.e source = new li.e(e0Var, gVar.f21390c, true);
                Inflater inflater = new Inflater(true);
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                return new li.e(new u(a6.k.f(source), inflater), j3, false);
            }
            throw th2;
        }
        throw new FileNotFoundException("no such file: " + child);
    }
}
