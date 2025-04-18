package f2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends u {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17661c;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f17661c = obj;
        this.f17660b = obj2;
    }

    @Override // f2.r
    public final void f(t tVar) {
        int i10 = this.a;
        Object obj = this.f17660b;
        switch (i10) {
            case 0:
                ((ArrayList) ((r.b) obj).getOrDefault(((w) this.f17661c).f17663c, null)).remove(tVar);
                tVar.z(this);
                return;
            default:
                ((t) obj).C();
                tVar.z(this);
                return;
        }
    }
}
