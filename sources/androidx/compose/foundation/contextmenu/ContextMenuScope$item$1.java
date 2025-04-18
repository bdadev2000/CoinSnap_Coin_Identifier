package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;
import q0.q;
import z0.m;

/* loaded from: classes4.dex */
final class ContextMenuScope$item$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2942c;
    public final /* synthetic */ q d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f2943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuScope$item$1(Modifier modifier, a aVar, ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1, q qVar, boolean z2) {
        super(3);
        this.f2940a = contextMenu_androidKt$TextItem$1;
        this.f2941b = z2;
        this.f2942c = modifier;
        this.d = qVar;
        this.f2943f = aVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(contextMenuColors) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            String str = (String) this.f2940a.invoke(composer, 0);
            if (!(!m.Z0(str))) {
                throw new IllegalStateException("Label must not be blank".toString());
            }
            ContextMenuUi_androidKt.b(str, this.f2941b, contextMenuColors, this.f2942c, this.d, this.f2943f, composer, (intValue << 6) & 896, 0);
        }
        return b0.f30125a;
    }
}
