package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class y extends FunctionReferenceImpl implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, int i10) {
        super(0, zVar, z.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        this.f624b = i10;
        if (i10 != 1) {
        } else {
            super(0, zVar, z.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f624b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        ((z) this.receiver).d();
                        break;
                    default:
                        ((z) this.receiver).d();
                        break;
                }
                return Unit.INSTANCE;
            default:
                switch (i10) {
                    case 0:
                        ((z) this.receiver).d();
                        break;
                    default:
                        ((z) this.receiver).d();
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}
