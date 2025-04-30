package e0;

import java.io.FileInputStream;
import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class B extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f19926f;

    /* renamed from: g, reason: collision with root package name */
    public FileInputStream f19927g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f19928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f19929i;

    /* renamed from: j, reason: collision with root package name */
    public int f19930j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(G g9, w7.f fVar) {
        super(fVar);
        this.f19929i = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.f19928h = obj;
        this.f19930j |= Integer.MIN_VALUE;
        return this.f19929i.g(this);
    }
}
