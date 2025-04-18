package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f7945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$3(q qVar, BottomSheetScaffoldState bottomSheetScaffoldState) {
        super(2);
        this.f7944a = qVar;
        this.f7945b = bottomSheetScaffoldState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f7944a.invoke(this.f7945b.f8033b, composer, 0);
        }
        return b0.f30125a;
    }
}
