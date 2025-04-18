package li;

import ki.b0;
import ki.l;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes5.dex */
public abstract class c {
    public static final l a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f21380b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f21381c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f21382d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f21383e;

    static {
        l lVar = l.f20996f;
        a = a0.p("/");
        f21380b = a0.p("\\");
        f21381c = a0.p("/\\");
        f21382d = a0.p(".");
        f21383e = a0.p("..");
    }

    public static final int a(b0 b0Var) {
        boolean z10;
        if (b0Var.f20953b.d() == 0) {
            return -1;
        }
        l lVar = b0Var.f20953b;
        boolean z11 = false;
        if (lVar.i(0) != 47) {
            if (lVar.i(0) == 92) {
                if (lVar.d() > 2 && lVar.i(1) == 92) {
                    l other = f21380b;
                    Intrinsics.checkNotNullParameter(other, "other");
                    int f10 = lVar.f(other.f20997b, 2);
                    if (f10 == -1) {
                        return lVar.d();
                    }
                    return f10;
                }
            } else {
                if (lVar.d() <= 2 || lVar.i(1) != 58 || lVar.i(2) != 92) {
                    return -1;
                }
                char i10 = (char) lVar.i(0);
                if ('a' <= i10 && i10 < '{') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if ('A' <= i10 && i10 < '[') {
                        z11 = true;
                    }
                    if (!z11) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 1;
    }

    public static final b0 b(b0 b0Var, b0 child, boolean z10) {
        boolean z11;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && child.g() == null) {
            l c10 = c(b0Var);
            if (c10 == null && (c10 = c(child)) == null) {
                c10 = f(b0.f20952c);
            }
            ki.i iVar = new ki.i();
            iVar.v(b0Var.f20953b);
            if (iVar.f20994c > 0) {
                iVar.v(c10);
            }
            iVar.v(child.f20953b);
            return d(iVar, z10);
        }
        return child;
    }

    public static final l c(b0 b0Var) {
        l lVar = b0Var.f20953b;
        l lVar2 = a;
        if (l.g(lVar, lVar2) == -1) {
            l lVar3 = f21380b;
            if (l.g(b0Var.f20953b, lVar3) == -1) {
                return null;
            }
            return lVar3;
        }
        return lVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x009c, code lost:
    
        if (r4 != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ki.b0 d(ki.i r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: li.c.d(ki.i, boolean):ki.b0");
    }

    public static final l e(byte b3) {
        if (b3 != 47) {
            if (b3 == 92) {
                return f21380b;
            }
            throw new IllegalArgumentException(eb.j.i("not a directory separator: ", b3));
        }
        return a;
    }

    public static final l f(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f21380b;
        }
        throw new IllegalArgumentException(vd.e.e("not a directory separator: ", str));
    }
}
