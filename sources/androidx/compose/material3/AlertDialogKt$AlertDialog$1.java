package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes2.dex */
final class AlertDialogKt$AlertDialog$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f7492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f7493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogProperties f7494c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7496g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialog$1(q0.a aVar, Modifier modifier, DialogProperties dialogProperties, p pVar, int i2, int i3) {
        super(2);
        this.f7492a = aVar;
        this.f7493b = modifier;
        this.f7494c = dialogProperties;
        this.d = pVar;
        this.f7495f = i2;
        this.f7496g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        DialogProperties dialogProperties;
        ((Number) obj2).intValue();
        q0.a aVar = this.f7492a;
        p pVar = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f7495f | 1);
        int i3 = this.f7496g;
        float f2 = AlertDialogKt.f7486a;
        ComposerImpl g2 = ((Composer) obj).g(325249497);
        if ((i3 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(aVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = i3 & 2;
        Modifier modifier = this.f7493b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier) ? 32 : 16;
        }
        int i5 = i3 & 4;
        DialogProperties dialogProperties2 = this.f7494c;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(dialogProperties2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.w(pVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 1171) == 1170 && g2.i()) {
            g2.A();
            dialogProperties = dialogProperties2;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            Modifier modifier2 = modifier;
            if (i5 != 0) {
                dialogProperties2 = new DialogProperties(7);
            }
            DialogProperties dialogProperties3 = dialogProperties2;
            AlertDialogKt.d(aVar, modifier2, dialogProperties3, pVar, g2, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168), 0);
            modifier = modifier2;
            dialogProperties = dialogProperties3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AlertDialogKt$AlertDialog$1(aVar, modifier, dialogProperties, pVar, a2, i3);
        }
        return b0.f30125a;
    }
}
