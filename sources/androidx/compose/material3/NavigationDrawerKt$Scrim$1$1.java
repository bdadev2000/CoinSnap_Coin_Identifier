package androidx.compose.material3;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$Scrim$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f10188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$1$1(long j2, q0.a aVar) {
        super(1);
        this.f10187a = j2;
        this.f10188b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope.R0((DrawScope) obj, this.f10187a, 0L, 0L, ((Number) this.f10188b.invoke()).floatValue(), null, Opcodes.FNEG);
        return b0.f30125a;
    }
}
