package ei;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class k extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f17430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, t tVar, Object obj, int i10) {
        super(str, true);
        this.f17429e = i10;
        this.f17430f = tVar;
        this.f17431g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.a
    public final long a() {
        switch (this.f17429e) {
            case 0:
                t tVar = this.f17430f;
                tVar.f17457c.a(tVar, (e0) ((Ref.ObjectRef) this.f17431g).element);
                return -1L;
            default:
                try {
                    this.f17430f.f17457c.b((a0) this.f17431g);
                } catch (IOException e2) {
                    gi.l lVar = gi.l.a;
                    gi.l lVar2 = gi.l.a;
                    String stringPlus = Intrinsics.stringPlus("Http2Connection.Listener failure for ", this.f17430f.f17459f);
                    lVar2.getClass();
                    gi.l.i(4, stringPlus, e2);
                    try {
                        ((a0) this.f17431g).c(b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
        }
    }
}
