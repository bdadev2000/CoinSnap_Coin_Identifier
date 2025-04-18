package ni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class t0 {
    public final o0 a;

    /* renamed from: b, reason: collision with root package name */
    public wh.j f22879b;

    /* renamed from: c, reason: collision with root package name */
    public wh.d0 f22880c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22881d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22882e;

    public t0() {
        o0 o0Var = o0.f22825c;
        this.f22881d = new ArrayList();
        this.f22882e = new ArrayList();
        this.a = o0Var;
    }

    public final void a(String str) {
        char[] cArr = wh.d0.f27032k;
        wh.d0 i10 = wh.c0.i(str);
        if ("".equals(i10.f27037f.get(r0.size() - 1))) {
            this.f22880c = i10;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + i10);
        }
    }

    public final u0 b() {
        List singletonList;
        List emptyList;
        if (this.f22880c != null) {
            wh.j jVar = this.f22879b;
            if (jVar == null) {
                jVar = new wh.l0(new wh.k0());
            }
            wh.j jVar2 = jVar;
            o0 o0Var = this.a;
            Executor a = o0Var.a();
            ArrayList arrayList = new ArrayList(this.f22882e);
            o oVar = new o(a);
            boolean z10 = o0Var.a;
            if (z10) {
                singletonList = Arrays.asList(j.a, oVar);
            } else {
                singletonList = Collections.singletonList(oVar);
            }
            arrayList.addAll(singletonList);
            ArrayList arrayList2 = this.f22881d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z10 ? 1 : 0));
            arrayList3.add(new b());
            arrayList3.addAll(arrayList2);
            if (z10) {
                emptyList = Collections.singletonList(c0.a);
            } else {
                emptyList = Collections.emptyList();
            }
            arrayList3.addAll(emptyList);
            return new u0(jVar2, this.f22880c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), a);
        }
        throw new IllegalStateException("Base URL required.");
    }
}
