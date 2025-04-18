package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SegmentedButtonKt$SegmentedButton$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11103b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$SegmentedButton$2(p pVar, p pVar2) {
        super(2);
        this.f11102a = pVar;
        this.f11103b = pVar2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SegmentedButtonKt.a(this.f11102a, this.f11103b, composer, 0);
        }
        return b0.f30125a;
    }
}
