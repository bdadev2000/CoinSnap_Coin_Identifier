package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import d0.b0;
import java.util.HashMap;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidComposeView$removeAndroidView$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f16256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.f16255a = androidComposeView;
        this.f16256b = androidViewHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        AndroidComposeView androidComposeView = this.f16255a;
        AndroidViewsHandler androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
        AndroidViewHolder androidViewHolder = this.f16256b;
        androidViewsHandler$ui_release.removeViewInLayout(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        LayoutNode remove = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder);
        kotlin.jvm.internal.e.e(layoutNodeToHolder);
        layoutNodeToHolder.remove(remove);
        androidViewHolder.setImportantForAccessibility(0);
        return b0.f30125a;
    }
}
