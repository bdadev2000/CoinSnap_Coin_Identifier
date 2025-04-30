package q5;

import java.util.Iterator;
import java.util.Map;
import w7.f;
import y7.AbstractC2954c;

/* loaded from: classes2.dex */
public final class b extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public Map f22789f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f22790g;

    /* renamed from: h, reason: collision with root package name */
    public d f22791h;

    /* renamed from: i, reason: collision with root package name */
    public Y7.a f22792i;

    /* renamed from: j, reason: collision with root package name */
    public Map f22793j;

    /* renamed from: k, reason: collision with root package name */
    public Object f22794k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c m;

    /* renamed from: n, reason: collision with root package name */
    public int f22795n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        super(fVar);
        this.m = cVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        this.l = obj;
        this.f22795n |= Integer.MIN_VALUE;
        return this.m.b(this);
    }
}
