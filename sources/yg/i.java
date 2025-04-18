package yg;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class i extends l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28241b = new a(2);
    public final l a;

    public i(l lVar) {
        this.a = lVar;
    }

    public final AbstractCollection a(p pVar) {
        AbstractCollection linkedHashSet;
        switch (((h) this).f28240c) {
            case 0:
                linkedHashSet = new ArrayList();
                break;
            default:
                linkedHashSet = new LinkedHashSet();
                break;
        }
        pVar.d();
        while (pVar.p()) {
            linkedHashSet.add(this.a.fromJson(pVar));
        }
        pVar.j();
        return linkedHashSet;
    }

    public final String toString() {
        return this.a + ".collection()";
    }
}
