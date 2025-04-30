package e0;

import Q7.InterfaceC0244l;
import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class v extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public Object f19997f;

    /* renamed from: g, reason: collision with root package name */
    public G f19998g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0244l f19999h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f20000i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G f20001j;

    /* renamed from: k, reason: collision with root package name */
    public int f20002k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(G g9, w7.f fVar) {
        super(fVar);
        this.f20001j = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f20000i = obj;
        this.f20002k |= Integer.MIN_VALUE;
        return G.b(this.f20001j, null, this);
    }
}
