package sf;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f25061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(g gVar, int i10) {
        super(1);
        this.f25060b = i10;
        this.f25061c = gVar;
    }

    public final void a(View view) {
        int i10 = this.f25060b;
        g gVar = this.f25061c;
        switch (i10) {
            case 0:
                gVar.f25034d.invoke();
                gVar.dismiss();
                return;
            default:
                gVar.f25035f.invoke();
                gVar.dismiss();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25060b) {
            case 0:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
