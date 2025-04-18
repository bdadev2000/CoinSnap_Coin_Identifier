package u2;

import v1.f0;
import v1.n0;

/* loaded from: classes.dex */
public final class h extends n0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, f0 f0Var, int i10) {
        super(f0Var);
        this.a = i10;
        this.f25450b = obj;
    }

    @Override // v1.n0
    public final String createQuery() {
        switch (this.a) {
            case 0:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 1:
                return "DELETE FROM WorkProgress";
            default:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }
}
