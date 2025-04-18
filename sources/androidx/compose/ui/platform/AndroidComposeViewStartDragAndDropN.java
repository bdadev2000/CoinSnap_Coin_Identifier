package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidComposeViewStartDragAndDropN {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewStartDragAndDropN f16319a = new Object();

    @DoNotInline
    @RequiresApi
    public final boolean a(@NotNull View view, @NotNull DragAndDropTransferData dragAndDropTransferData, @NotNull ComposeDragShadowBuilder composeDragShadowBuilder) {
        dragAndDropTransferData.getClass();
        return view.startDragAndDrop(null, composeDragShadowBuilder, null, 0);
    }
}
