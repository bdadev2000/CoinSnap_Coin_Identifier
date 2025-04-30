package A1;

import Q7.n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f21c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f22a;
    public f b;

    public e(String... strArr) {
        this.f22a = Arrays.asList(strArr);
    }

    public final boolean a(int i9, String str) {
        boolean z8;
        boolean z9;
        List list = this.f22a;
        if (i9 >= list.size()) {
            return false;
        }
        if (i9 == list.size() - 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = (String) list.get(i9);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z9 = false;
            } else {
                z9 = true;
            }
            if ((!z8 && (i9 != list.size() - 2 || !((String) list.get(list.size() - 1)).equals("**"))) || !z9) {
                return false;
            }
            return true;
        }
        if (!z8 && ((String) list.get(i9 + 1)).equals(str)) {
            if (i9 != list.size() - 2 && (i9 != list.size() - 3 || !((String) list.get(list.size() - 1)).equals("**"))) {
                return false;
            }
            return true;
        }
        if (z8) {
            return true;
        }
        int i10 = i9 + 1;
        if (i10 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i10)).equals(str);
    }

    public final int b(int i9, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f22a;
        if (!((String) list.get(i9)).equals("**")) {
            return 1;
        }
        if (i9 == list.size() - 1 || !((String) list.get(i9 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i9, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f22a;
        if (i9 >= list.size()) {
            return false;
        }
        if (((String) list.get(i9)).equals(str) || ((String) list.get(i9)).equals("**") || ((String) list.get(i9)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i9, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f22a;
        if (i9 < list.size() - 1 || ((String) list.get(i9)).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f22a.equals(eVar.f22a)) {
            return false;
        }
        f fVar = this.b;
        f fVar2 = eVar.b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f22a.hashCode() * 31;
        f fVar = this.b;
        if (fVar != null) {
            i9 = fVar.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    public final String toString() {
        boolean z8;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f22a);
        sb.append(",resolved=");
        if (this.b != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        return n0.n(sb, z8, '}');
    }

    public e(e eVar) {
        this.f22a = new ArrayList(eVar.f22a);
        this.b = eVar.b;
    }
}
