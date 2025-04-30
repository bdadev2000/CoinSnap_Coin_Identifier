package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final S.c f2410a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2411c;

    public z(Class cls, Class cls2, Class cls3, List list, C.c cVar) {
        this.f2410a = cVar;
        if (!list.isEmpty()) {
            this.b = list;
            this.f2411c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final B a(int i9, int i10, B3.g gVar, N1.i iVar, com.bumptech.glide.load.data.g gVar2) {
        S.c cVar = this.f2410a;
        Object g9 = cVar.g();
        j2.g.c(g9, "Argument must not be null");
        List list = (List) g9;
        try {
            List list2 = this.b;
            int size = list2.size();
            B b = null;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    b = ((k) list2.get(i11)).a(i9, i10, gVar, iVar, gVar2);
                } catch (x e4) {
                    list.add(e4);
                }
                if (b != null) {
                    break;
                }
            }
            if (b != null) {
                return b;
            }
            throw new x(this.f2411c, new ArrayList(list));
        } finally {
            cVar.b(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
