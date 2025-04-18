package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f3819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BoxWithConstraintsScopeImpl f3820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(q qVar, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl) {
        super(2);
        this.f3819a = qVar;
        this.f3820b = boxWithConstraintsScopeImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f3819a.invoke(this.f3820b, composer, 0);
        }
        return b0.f30125a;
    }
}
