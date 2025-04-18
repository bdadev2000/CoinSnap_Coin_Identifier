package n1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1.f[] f31142a = new l1.f[0];

    /* renamed from: b, reason: collision with root package name */
    public static final k1.a[] f31143b = new k1.a[0];

    public static final Set a(l1.f fVar) {
        p0.a.s(fVar, "<this>");
        if (fVar instanceof i) {
            return ((i) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d = fVar.d();
        for (int i2 = 0; i2 < d; i2++) {
            hashSet.add(fVar.e(i2));
        }
        return hashSet;
    }

    public static final l1.f[] b(List list) {
        l1.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (l1.f[]) list.toArray(new l1.f[0])) == null) ? f31142a : fVarArr;
    }

    public static final x0.c c(x0.o oVar) {
        p0.a.s(oVar, "<this>");
        x0.d b2 = ((f0) oVar).b();
        if (b2 instanceof x0.c) {
            return (x0.c) b2;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + b2);
    }

    public static final void d(x0.c cVar) {
        p0.a.s(cVar, "<this>");
        String c2 = ((kotlin.jvm.internal.j) cVar).c();
        if (c2 == null) {
            c2 = "<local class name not available>";
        }
        throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Serializer for class '", c2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
