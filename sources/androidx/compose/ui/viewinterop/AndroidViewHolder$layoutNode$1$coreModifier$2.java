package androidx.compose.ui.viewinterop;

import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, AndroidViewHolder androidViewHolder2) {
        super(1);
        this.f17541a = androidViewHolder;
        this.f17542b = layoutNode;
        this.f17543c = androidViewHolder2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Canvas a2 = ((DrawScope) obj).A1().a();
        AndroidViewHolder androidViewHolder = this.f17541a;
        if (androidViewHolder.getView().getVisibility() != 8) {
            androidViewHolder.f17527v = true;
            Owner owner = this.f17542b.f15950l;
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                android.graphics.Canvas b2 = AndroidCanvas_androidKt.b(a2);
                androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                this.f17543c.draw(b2);
            }
            androidViewHolder.f17527v = false;
        }
        return b0.f30125a;
    }
}
