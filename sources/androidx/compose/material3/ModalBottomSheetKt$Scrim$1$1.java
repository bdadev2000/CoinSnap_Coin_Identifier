package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ModalBottomSheetKt$Scrim$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f9919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f9920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$1$1(long j2, State state) {
        super(1);
        this.f9919a = j2;
        this.f9920b = state;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        long j2 = this.f9919a;
        float f2 = ModalBottomSheetKt.f9809a;
        DrawScope.R0(drawScope, j2, 0L, 0L, p0.a.z(((Number) this.f9920b.getValue()).floatValue(), 0.0f, 1.0f), null, Opcodes.FNEG);
        return b0.f30125a;
    }
}
