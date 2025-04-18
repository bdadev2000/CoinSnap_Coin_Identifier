package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.OwnerSnapshotObserver;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidViewHolder$runUpdate$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.f17555a = androidViewHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        OwnerSnapshotObserver snapshotObserver;
        AndroidViewHolder androidViewHolder = this.f17555a;
        if (androidViewHolder.f17511f && androidViewHolder.isAttachedToWindow() && androidViewHolder.getView().getParent() == androidViewHolder) {
            snapshotObserver = androidViewHolder.getSnapshotObserver();
            snapshotObserver.b(androidViewHolder, AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.f17528a, androidViewHolder.getUpdate());
        }
        return b0.f30125a;
    }
}
