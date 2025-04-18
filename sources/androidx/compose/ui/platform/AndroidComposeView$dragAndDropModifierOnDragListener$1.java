package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.DensityKt;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends kotlin.jvm.internal.o implements q {
    public final Boolean b(DragAndDropTransferData dragAndDropTransferData, long j2, q0.l lVar) {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.C0;
        Resources resources = androidComposeView.getContext().getResources();
        return Boolean.valueOf(AndroidComposeViewStartDragAndDropN.f16319a.a(androidComposeView, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j2, lVar)));
    }

    @Override // q0.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((DragAndDropTransferData) obj, ((Size) obj2).f14923a, (q0.l) obj3);
    }
}
