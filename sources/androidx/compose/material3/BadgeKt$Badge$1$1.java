package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class BadgeKt$Badge$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowScope f7887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$1$1(q qVar) {
        super(2);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
        this.f7886a = qVar;
        this.f7887b = rowScopeInstance;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f7886a.invoke(this.f7887b, composer, 0);
        }
        return b0.f30125a;
    }
}
