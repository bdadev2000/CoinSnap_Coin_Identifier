package ei;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends ai.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ki.i f17442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, t tVar, int i10, ki.i iVar, int i11, boolean z10) {
        super(str, true);
        this.f17440e = tVar;
        this.f17441f = i10;
        this.f17442g = iVar;
        this.f17443h = i11;
    }

    @Override // ai.a
    public final long a() {
        try {
            y5.f fVar = this.f17440e.f17467n;
            ki.i source = this.f17442g;
            int i10 = this.f17443h;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i10);
            this.f17440e.A.q(this.f17441f, b.CANCEL);
            synchronized (this.f17440e) {
                this.f17440e.C.remove(Integer.valueOf(this.f17441f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
