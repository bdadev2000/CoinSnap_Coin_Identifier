package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import java.util.Collection;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f6605a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1(q0.a aVar) {
        super(1);
        this.f6605a = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ClipDescription clipDescription = ((DragAndDropEvent) obj).f14771a.getClipDescription();
        Iterable<MediaType> iterable = (Iterable) this.f6605a.invoke();
        boolean z2 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (MediaType mediaType : iterable) {
                if (p0.a.g(mediaType, MediaType.f2889c) || clipDescription.hasMimeType(mediaType.f2890a)) {
                    z2 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
