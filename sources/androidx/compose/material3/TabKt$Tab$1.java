package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class TabKt$Tab$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$1(ComposableLambdaImpl composableLambdaImpl, p pVar) {
        super(3);
        this.f11750a = composableLambdaImpl;
        this.f11751b = pVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
            composer.A();
        } else {
            TabKt.c(this.f11750a, this.f11751b, composer, 0);
        }
        return b0.f30125a;
    }
}
