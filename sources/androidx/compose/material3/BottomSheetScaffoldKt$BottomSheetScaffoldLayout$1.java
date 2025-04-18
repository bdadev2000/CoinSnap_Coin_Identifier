package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7968c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1(Modifier modifier, long j2, long j3, p pVar) {
        super(2);
        this.f7966a = modifier;
        this.f7967b = j2;
        this.f7968c = j3;
        this.d = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SurfaceKt.a(this.f7966a, null, this.f7967b, this.f7968c, 0.0f, 0.0f, null, this.d, composer, 0, Opcodes.FREM);
        }
        return b0.f30125a;
    }
}
