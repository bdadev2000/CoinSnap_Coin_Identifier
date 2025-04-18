package li;

import androidx.lifecycle.r0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jb.t;
import ki.b0;
import ki.k0;
import ki.l;
import ki.o;
import ki.v;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wh.c0;

/* loaded from: classes5.dex */
public final class f extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f21387c;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f21388b;

    static {
        new c0(26, 0);
        String str = b0.f20952c;
        f21387c = c0.h("/", false);
    }

    public f(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f21388b = LazyKt.lazy(new r0(classLoader, 5));
    }

    public static String i(b0 child) {
        b0 b0Var;
        b0 d10;
        b0 other = f21387c;
        other.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        boolean z10 = true;
        b0 b3 = c.b(other, child, true);
        Intrinsics.checkNotNullParameter(other, "other");
        int a = c.a(b3);
        b0 b0Var2 = null;
        l lVar = b3.f20953b;
        if (a == -1) {
            b0Var = null;
        } else {
            b0Var = new b0(lVar.n(0, a));
        }
        int a10 = c.a(other);
        l lVar2 = other.f20953b;
        if (a10 != -1) {
            b0Var2 = new b0(lVar2.n(0, a10));
        }
        if (Intrinsics.areEqual(b0Var, b0Var2)) {
            ArrayList a11 = b3.a();
            ArrayList a12 = other.a();
            int min = Math.min(a11.size(), a12.size());
            int i10 = 0;
            while (i10 < min && Intrinsics.areEqual(a11.get(i10), a12.get(i10))) {
                i10++;
            }
            if (i10 == min && lVar.d() == lVar2.d()) {
                String str = b0.f20952c;
                d10 = c0.h(".", false);
            } else {
                if (a12.subList(i10, a12.size()).indexOf(c.f21383e) != -1) {
                    z10 = false;
                }
                if (z10) {
                    ki.i iVar = new ki.i();
                    l c10 = c.c(other);
                    if (c10 == null && (c10 = c.c(b3)) == null) {
                        c10 = c.f(b0.f20952c);
                    }
                    int size = a12.size();
                    for (int i11 = i10; i11 < size; i11++) {
                        iVar.v(c.f21383e);
                        iVar.v(c10);
                    }
                    int size2 = a11.size();
                    while (i10 < size2) {
                        iVar.v((l) a11.get(i10));
                        iVar.v(c10);
                        i10++;
                    }
                    d10 = c.d(iVar, false);
                } else {
                    throw new IllegalArgumentException(("Impossible relative path to resolve: " + b3 + " and " + other).toString());
                }
            }
            return d10.toString();
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b3 + " and " + other).toString());
    }

    @Override // ki.o
    public final void a(b0 source, b0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // ki.o
    public final void b(b0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // ki.o
    public final void c(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // ki.o
    public final t e(b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!c0.a(path)) {
            return null;
        }
        String i10 = i(path);
        for (Pair pair : (List) this.f21388b.getValue()) {
            t e2 = ((o) pair.component1()).e(((b0) pair.component2()).d(i10));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    @Override // ki.o
    public final v f(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (c0.a(file)) {
            String i10 = i(file);
            for (Pair pair : (List) this.f21388b.getValue()) {
                try {
                    return ((o) pair.component1()).f(((b0) pair.component2()).d(i10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // ki.o
    public final v g(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // ki.o
    public final k0 h(b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (c0.a(file)) {
            String i10 = i(file);
            for (Pair pair : (List) this.f21388b.getValue()) {
                try {
                    return ((o) pair.component1()).h(((b0) pair.component2()).d(i10));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
