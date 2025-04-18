package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f7023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1(OffsetProvider offsetProvider) {
        super(0);
        this.f7023a = offsetProvider;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(OffsetKt.c(this.f7023a.a()));
    }
}
