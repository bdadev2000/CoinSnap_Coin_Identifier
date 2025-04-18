package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f5401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1(OffsetProvider offsetProvider) {
        super(1);
        this.f5401a = offsetProvider;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((SemanticsPropertyReceiver) obj).b(SelectionHandlesKt.f7187c, new SelectionHandleInfo(Handle.f5964a, this.f5401a.a(), SelectionHandleAnchor.f7180b, true));
        return b0.f30125a;
    }
}
