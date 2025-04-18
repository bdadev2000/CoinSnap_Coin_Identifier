package r3;

import a4.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f23990c = new e("COMPOSITION");
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public f f23991b;

    public e(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public final boolean a(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        List list = this.a;
        if (i10 >= list.size()) {
            return false;
        }
        if (i10 == list.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = (String) list.get(i10);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((!z10 && (i10 != list.size() - 2 || !((String) list.get(list.size() - 1)).equals("**"))) || !z12) {
                return false;
            }
            return true;
        }
        if (!z10 && ((String) list.get(i10 + 1)).equals(str)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 != list.size() - 2 && (i10 != list.size() - 3 || !((String) list.get(list.size() - 1)).equals("**"))) {
                return false;
            }
            return true;
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i11)).equals(str);
    }

    public final int b(int i10, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (!((String) list.get(i10)).equals("**")) {
            return 1;
        }
        if (i10 == list.size() - 1 || !((String) list.get(i10 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i10 >= list.size()) {
            return false;
        }
        if (((String) list.get(i10)).equals(str) || ((String) list.get(i10)).equals("**") || ((String) list.get(i10)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i10 < list.size() - 1 || ((String) list.get(i10)).equals("**")) {
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
        if (!this.a.equals(eVar.a)) {
            return false;
        }
        f fVar = this.f23991b;
        f fVar2 = eVar.f23991b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.f23991b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.a);
        sb2.append(",resolved=");
        if (this.f23991b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return j.l(sb2, z10, AbstractJsonLexerKt.END_OBJ);
    }

    public e(e eVar) {
        this.a = new ArrayList(eVar.a);
        this.f23991b = eVar.f23991b;
    }
}
