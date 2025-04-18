package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposerImpl$invokeMovableContentLambda$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MovableContent f13726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$invokeMovableContentLambda$1(MovableContent movableContent, Object obj) {
        super(2);
        this.f13726a = movableContent;
        this.f13727b = obj;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
            return b0.f30125a;
        }
        this.f13726a.getClass();
        throw null;
    }
}
