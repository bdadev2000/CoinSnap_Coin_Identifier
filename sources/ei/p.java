package ei;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f17446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, t tVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f17444e = tVar;
        this.f17445f = i10;
        this.f17446g = list;
    }

    @Override // ai.a
    public final long a() {
        y5.f fVar = this.f17444e.f17467n;
        List responseHeaders = this.f17446g;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        try {
            this.f17444e.A.q(this.f17445f, b.CANCEL);
            synchronized (this.f17444e) {
                this.f17444e.C.remove(Integer.valueOf(this.f17445f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
