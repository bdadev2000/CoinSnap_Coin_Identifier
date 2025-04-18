package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(q qVar, float f2) {
        super(2);
        this.f7932a = qVar;
        this.f7933b = f2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f7932a.invoke(PaddingKt.b(0.0f, 0.0f, 0.0f, this.f7933b, 7), composer, 0);
        }
        return b0.f30125a;
    }
}
