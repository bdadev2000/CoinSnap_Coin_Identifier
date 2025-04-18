package yg;

import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class h extends i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, int i10) {
        super(lVar);
        this.f28240c = i10;
    }

    @Override // yg.l
    public final /* bridge */ /* synthetic */ Object fromJson(p pVar) {
        switch (this.f28240c) {
            case 0:
                return a(pVar);
            default:
                return a(pVar);
        }
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        int i10 = this.f28240c;
        l lVar = this.a;
        switch (i10) {
            case 0:
                sVar.d();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    lVar.toJson(sVar, it.next());
                }
                ((r) sVar).u(1, 2, AbstractJsonLexerKt.END_LIST);
                return;
            default:
                sVar.d();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    lVar.toJson(sVar, it2.next());
                }
                ((r) sVar).u(1, 2, AbstractJsonLexerKt.END_LIST);
                return;
        }
    }
}
