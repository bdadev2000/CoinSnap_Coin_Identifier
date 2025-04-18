package ni;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class u extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f22884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(c cVar, int i10) {
        super(1);
        this.f22883b = i10;
        this.f22884c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f22883b) {
            case 0:
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            case 1:
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            default:
                invoke((Throwable) obj);
                return Unit.INSTANCE;
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f22883b;
        c cVar = this.f22884c;
        switch (i10) {
            case 0:
                cVar.cancel();
                return;
            case 1:
                cVar.cancel();
                return;
            default:
                cVar.cancel();
                return;
        }
    }
}
