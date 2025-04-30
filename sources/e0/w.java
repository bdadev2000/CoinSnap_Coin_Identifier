package e0;

import java.io.Serializable;
import java.util.Iterator;
import y7.AbstractC2954c;

/* loaded from: classes.dex */
public final class w extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public G f20003f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20004g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f20005h;

    /* renamed from: i, reason: collision with root package name */
    public Object f20006i;

    /* renamed from: j, reason: collision with root package name */
    public y f20007j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f20008k;
    public /* synthetic */ Object l;
    public final /* synthetic */ G m;

    /* renamed from: n, reason: collision with root package name */
    public int f20009n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(G g9, w7.f fVar) {
        super(fVar);
        this.m = g9;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.l = obj;
        this.f20009n |= Integer.MIN_VALUE;
        return this.m.d(this);
    }
}
