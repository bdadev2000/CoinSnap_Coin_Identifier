package ei;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final w f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f17439c;

    public n(t this$0, w reader) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f17439c = this$0;
        this.f17438b = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable th2;
        b bVar;
        t tVar = this.f17439c;
        w wVar = this.f17438b;
        b bVar2 = b.INTERNAL_ERROR;
        IOException e2 = null;
        try {
            wVar.g(this);
            do {
            } while (wVar.d(false, this));
            bVar = b.NO_ERROR;
        } catch (IOException e10) {
            e2 = e10;
            bVar = bVar2;
        } catch (Throwable th3) {
            th2 = th3;
            bVar = bVar2;
            tVar.d(bVar, bVar2, e2);
            xh.b.c(wVar);
            throw th2;
        }
        try {
            try {
                tVar.d(bVar, b.CANCEL, null);
            } catch (Throwable th4) {
                th2 = th4;
                tVar.d(bVar, bVar2, e2);
                xh.b.c(wVar);
                throw th2;
            }
        } catch (IOException e11) {
            e2 = e11;
            b bVar3 = b.PROTOCOL_ERROR;
            tVar.d(bVar3, bVar3, e2);
            xh.b.c(wVar);
            return Unit.INSTANCE;
        }
        xh.b.c(wVar);
        return Unit.INSTANCE;
    }
}
