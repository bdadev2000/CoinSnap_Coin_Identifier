package ki;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f20952c;

    /* renamed from: b, reason: collision with root package name */
    public final l f20953b;

    static {
        new wh.c0(24, 0);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f20952c = separator;
    }

    public b0(l bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f20953b = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = li.c.a(this);
        l lVar = this.f20953b;
        if (a == -1) {
            a = 0;
        } else if (a < lVar.d() && lVar.i(a) == 92) {
            a++;
        }
        int d10 = lVar.d();
        int i10 = a;
        while (a < d10) {
            if (lVar.i(a) == 47 || lVar.i(a) == 92) {
                arrayList.add(lVar.n(i10, a));
                i10 = a + 1;
            }
            a++;
        }
        if (i10 < lVar.d()) {
            arrayList.add(lVar.n(i10, lVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        l lVar = li.c.a;
        l lVar2 = li.c.a;
        l lVar3 = this.f20953b;
        int k10 = l.k(lVar3, lVar2);
        if (k10 == -1) {
            k10 = l.k(lVar3, li.c.f21380b);
        }
        if (k10 != -1) {
            lVar3 = l.o(lVar3, k10 + 1, 0, 2);
        } else if (g() != null && lVar3.d() == 2) {
            lVar3 = l.f20996f;
        }
        return lVar3.q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r1.l(0, r3, r3.d()) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ki.b0 c() {
        /*
            r9 = this;
            ki.l r0 = li.c.f21382d
            ki.l r1 = r9.f20953b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 != 0) goto Lcd
            ki.l r2 = li.c.a
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r3 != 0) goto Lcd
            ki.l r3 = li.c.f21380b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r4 != 0) goto Lcd
            ki.l r4 = li.c.f21383e
            r1.getClass()
            java.lang.String r5 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            int r5 = r1.d()
            byte[] r6 = r4.f20997b
            int r7 = r6.length
            int r5 = r5 - r7
            int r6 = r6.length
            boolean r4 = r1.l(r5, r4, r6)
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L58
            int r4 = r1.d()
            if (r4 != r6) goto L3d
            goto L56
        L3d:
            int r4 = r1.d()
            int r4 = r4 + (-3)
            boolean r4 = r1.l(r4, r2, r7)
            if (r4 == 0) goto L4a
            goto L56
        L4a:
            int r4 = r1.d()
            int r4 = r4 + (-3)
            boolean r4 = r1.l(r4, r3, r7)
            if (r4 == 0) goto L58
        L56:
            r4 = r7
            goto L59
        L58:
            r4 = r5
        L59:
            if (r4 == 0) goto L5d
            goto Lcd
        L5d:
            int r2 = ki.l.k(r1, r2)
            r4 = -1
            if (r2 == r4) goto L65
            goto L69
        L65:
            int r2 = ki.l.k(r1, r3)
        L69:
            if (r2 != r6) goto L83
            java.lang.Character r8 = r9.g()
            if (r8 == 0) goto L83
            int r0 = r1.d()
            r2 = 3
            if (r0 != r2) goto L79
            goto Lcd
        L79:
            ki.b0 r0 = new ki.b0
            ki.l r1 = ki.l.o(r1, r5, r2, r7)
            r0.<init>(r1)
            goto Lcb
        L83:
            if (r2 != r7) goto L95
            java.lang.String r8 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r8)
            int r8 = r3.d()
            boolean r3 = r1.l(r5, r3, r8)
            if (r3 == 0) goto L95
            goto Lcd
        L95:
            if (r2 != r4) goto Lae
            java.lang.Character r3 = r9.g()
            if (r3 == 0) goto Lae
            int r0 = r1.d()
            if (r0 != r6) goto La4
            goto Lcd
        La4:
            ki.b0 r0 = new ki.b0
            ki.l r1 = ki.l.o(r1, r5, r6, r7)
            r0.<init>(r1)
            goto Lcb
        Lae:
            if (r2 != r4) goto Lb6
            ki.b0 r1 = new ki.b0
            r1.<init>(r0)
            goto Lce
        Lb6:
            if (r2 != 0) goto Lc2
            ki.b0 r0 = new ki.b0
            ki.l r1 = ki.l.o(r1, r5, r7, r7)
            r0.<init>(r1)
            goto Lcb
        Lc2:
            ki.b0 r0 = new ki.b0
            ki.l r1 = ki.l.o(r1, r5, r2, r7)
            r0.<init>(r1)
        Lcb:
            r1 = r0
            goto Lce
        Lcd:
            r1 = 0
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.b0.c():ki.b0");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b0 other = (b0) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f20953b.compareTo(other.f20953b);
    }

    public final b0 d(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        i iVar = new i();
        iVar.Y(child);
        return li.c.b(this, li.c.d(iVar, false), false);
    }

    public final File e() {
        return new File(toString());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b0) && Intrinsics.areEqual(((b0) obj).f20953b, this.f20953b)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r0 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Character g() {
        /*
            r4 = this;
            ki.l r0 = li.c.a
            ki.l r1 = r4.f20953b
            int r0 = ki.l.g(r1, r0)
            r2 = -1
            if (r0 == r2) goto Lc
            goto L3d
        Lc:
            int r0 = r1.d()
            r2 = 2
            if (r0 >= r2) goto L14
            goto L3d
        L14:
            r0 = 1
            byte r2 = r1.i(r0)
            r3 = 58
            if (r2 == r3) goto L1e
            goto L3d
        L1e:
            r2 = 0
            byte r1 = r1.i(r2)
            char r1 = (char) r1
            r3 = 97
            if (r3 > r1) goto L2e
            r3 = 123(0x7b, float:1.72E-43)
            if (r1 >= r3) goto L2e
            r3 = r0
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 != 0) goto L3f
            r3 = 65
            if (r3 > r1) goto L3a
            r3 = 91
            if (r1 >= r3) goto L3a
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 != 0) goto L3f
        L3d:
            r0 = 0
            goto L43
        L3f:
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.b0.g():java.lang.Character");
    }

    public final int hashCode() {
        return this.f20953b.hashCode();
    }

    public final String toString() {
        return this.f20953b.q();
    }
}
