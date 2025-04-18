package yg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class b extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28216c = new a(0);
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final l f28217b;

    public b(Class cls, l lVar) {
        this.a = cls;
        this.f28217b = lVar;
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        ArrayList arrayList = new ArrayList();
        pVar.d();
        while (pVar.p()) {
            arrayList.add(this.f28217b.fromJson(pVar));
        }
        pVar.j();
        Object newInstance = Array.newInstance((Class<?>) this.a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        sVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f28217b.toJson(sVar, Array.get(obj, i10));
        }
        ((r) sVar).u(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public final String toString() {
        return this.f28217b + ".array()";
    }
}
