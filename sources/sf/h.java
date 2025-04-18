package sf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f25037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i10) {
        super(1);
        this.f25036b = i10;
        this.f25037c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j jVar = this.f25037c;
        int i10 = this.f25036b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        jVar.f25041d.invoke();
                        jVar.cancel();
                        break;
                    default:
                        jVar.cancel();
                        break;
                }
                return Unit.INSTANCE;
            default:
                switch (i10) {
                    case 0:
                        jVar.f25041d.invoke();
                        jVar.cancel();
                        break;
                    default:
                        jVar.cancel();
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}
