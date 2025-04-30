package H0;

import J1.r;
import com.applovin.impl.L;

/* loaded from: classes.dex */
public final class a implements e {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1343c;

    public /* synthetic */ a(r rVar) {
        this.b = 1;
        this.f1343c = rVar.f1539a;
    }

    @Override // H0.e
    public String b() {
        return this.f1343c;
    }

    public String toString() {
        switch (this.b) {
            case 2:
                return L.k(new StringBuilder("<"), this.f1343c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(String str, int i9) {
        this.b = i9;
        this.f1343c = str;
    }

    @Override // H0.e
    public void a(I0.b bVar) {
    }
}
