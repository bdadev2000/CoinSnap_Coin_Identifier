package ai;

import ei.t;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10, Object obj) {
        super(str, true);
        this.f491e = i10;
        this.f492f = obj;
    }

    @Override // ai.a
    public final long a() {
        int i10 = this.f491e;
        Object obj = this.f492f;
        switch (i10) {
            case 0:
                ((Function0) obj).invoke();
                return -1L;
            default:
                t tVar = (t) obj;
                tVar.getClass();
                try {
                    tVar.A.p(false, 2, 0);
                } catch (IOException e2) {
                    tVar.g(e2);
                }
                return -1L;
        }
    }
}
