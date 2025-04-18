package androidx.compose.ui.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.node.ComposeUiNode;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutKt$combineAsVirtualLayouts$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$combineAsVirtualLayouts$1(List list) {
        super(2);
        this.f15748a = list;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            List list = this.f15748a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                p pVar = (p) list.get(i2);
                int E = composer.E();
                ComposeUiNode.h8.getClass();
                a aVar = ComposeUiNode.Companion.f15896c;
                if (!(composer.j() instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                p pVar2 = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar2);
                }
                pVar.invoke(composer, 0);
                composer.p();
            }
        }
        return b0.f30125a;
    }
}
