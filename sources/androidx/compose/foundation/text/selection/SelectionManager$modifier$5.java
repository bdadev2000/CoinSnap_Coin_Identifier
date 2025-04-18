package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.ui.input.key.KeyEvent;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SelectionManager$modifier$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f7249a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$5(SelectionManager selectionManager) {
        super(1);
        this.f7249a = selectionManager;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean z2;
        if (KeyMapping_androidKt.f6005a.a(((KeyEvent) obj).f15514a) == KeyCommand.COPY) {
            this.f7249a.b();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
