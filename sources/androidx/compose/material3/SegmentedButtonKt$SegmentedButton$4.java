package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SegmentedButtonKt$SegmentedButton$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$SegmentedButton$4(boolean z2) {
        super(2);
        this.f11117a = z2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SegmentedButtonDefaults.f11083a.b(this.f11117a, null, null, composer, 3072, 6);
        }
        return b0.f30125a;
    }
}
