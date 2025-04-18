package zh;

import ki.q;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class f extends q {

    /* renamed from: b, reason: collision with root package name */
    public boolean f28784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f28785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f28786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ki.d dVar, j jVar, g gVar) {
        super(dVar);
        this.f28785c = jVar;
        this.f28786d = gVar;
    }

    @Override // ki.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f28784b) {
            this.f28784b = true;
            j jVar = this.f28785c;
            g gVar = this.f28786d;
            synchronized (jVar) {
                int i10 = gVar.f28793h - 1;
                gVar.f28793h = i10;
                if (i10 == 0 && gVar.f28791f) {
                    jVar.w(gVar);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
