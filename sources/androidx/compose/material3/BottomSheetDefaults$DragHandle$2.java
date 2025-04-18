package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class BottomSheetDefaults$DragHandle$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f7923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7924b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetDefaults$DragHandle$2(float f2, float f3) {
        super(2);
        this.f7923a = f2;
        this.f7924b = f3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            BoxKt.a(SizeKt.o(Modifier.Companion.f14687a, this.f7923a, this.f7924b), composer, 0);
        }
        return b0.f30125a;
    }
}
