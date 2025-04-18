package w;

import ic.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l extends e {

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f26664q0 = new ArrayList();

    @Override // w.e
    public void D() {
        this.f26664q0.clear();
        super.D();
    }

    @Override // w.e
    public final void G(t tVar) {
        super.G(tVar);
        int size = this.f26664q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f26664q0.get(i10)).G(tVar);
        }
    }

    public abstract void R();
}
