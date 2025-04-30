package B1;

import java.util.List;
import y1.j;
import y1.n;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i9) {
        super(list, 0);
        this.f262d = i9;
    }

    @Override // B1.e
    public final y1.e g() {
        switch (this.f262d) {
            case 0:
                return new y1.f((List) this.f273c, 0);
            case 1:
                return new j((List) this.f273c, 0);
            case 2:
                return new y1.f((List) this.f273c, 1);
            case 3:
                return new j((List) this.f273c, 1);
            case 4:
                return new j((List) this.f273c, 2);
            case 5:
                return new n((List) this.f273c);
            default:
                return new y1.f((List) this.f273c, 2);
        }
    }
}
