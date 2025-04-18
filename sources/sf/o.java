package sf;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f25059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(l lVar, int i10) {
        super(1);
        this.f25058b = i10;
        this.f25059c = lVar;
    }

    public final void a(View view) {
        int i10 = this.f25058b;
        l lVar = this.f25059c;
        switch (i10) {
            case 0:
                lVar.f25046d.invoke();
                lVar.cancel();
                return;
            case 1:
                ((Function0) lVar.f25047f).invoke();
                lVar.cancel();
                return;
            default:
                ((Function0) lVar.f25048g).invoke();
                lVar.cancel();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25058b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
