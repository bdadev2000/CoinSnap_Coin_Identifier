package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AbstractComposeView$ensureCompositionCreated$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f16183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.f16183a = abstractComposeView;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f16183a.a(composer, 0);
        }
        return b0.f30125a;
    }
}
