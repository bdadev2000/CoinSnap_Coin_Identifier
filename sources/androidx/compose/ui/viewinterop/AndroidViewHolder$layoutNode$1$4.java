package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f17534a = androidViewHolder;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Owner owner = (Owner) obj;
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        AndroidViewHolder androidViewHolder = this.f17534a;
        if (androidComposeView != null) {
            androidComposeView.N(androidViewHolder);
        }
        androidViewHolder.removeAllViewsInLayout();
        return b0.f30125a;
    }
}
