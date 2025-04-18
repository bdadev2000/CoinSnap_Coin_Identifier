package ei;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f17448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17450h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, t tVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f17447e = i11;
        this.f17448f = tVar;
        this.f17449g = i10;
        this.f17450h = obj;
    }

    @Override // ai.a
    public final long a() {
        switch (this.f17447e) {
            case 0:
                y5.f fVar = this.f17448f.f17467n;
                b errorCode = (b) this.f17450h;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f17448f) {
                    this.f17448f.C.remove(Integer.valueOf(this.f17449g));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            case 1:
                t tVar = this.f17448f;
                try {
                    int i10 = this.f17449g;
                    b statusCode = (b) this.f17450h;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    tVar.A.q(i10, statusCode);
                } catch (IOException e2) {
                    tVar.g(e2);
                }
                return -1L;
            default:
                y5.f fVar2 = this.f17448f.f17467n;
                List requestHeaders = (List) this.f17450h;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f17448f.A.q(this.f17449g, b.CANCEL);
                    synchronized (this.f17448f) {
                        this.f17448f.C.remove(Integer.valueOf(this.f17449g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
        }
    }
}
