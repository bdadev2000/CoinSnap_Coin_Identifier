package C1;

import v1.v;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f446a;
    public final boolean b;

    public g(String str, int i9, boolean z8) {
        this.f446a = i9;
        this.b = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        if (!vVar.f23549n) {
            H1.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new x1.l(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i9 = this.f446a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
