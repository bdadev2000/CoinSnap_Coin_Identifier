package androidx.compose.ui.draganddrop;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class DragAndDropNodeKt$DragAndDropModifierNode$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DragAndDropTarget f14786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropModifierNode$2(l lVar, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.f14785a = lVar;
        this.f14786b = dragAndDropTarget;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (((Boolean) this.f14785a.invoke((DragAndDropEvent) obj)).booleanValue()) {
            return this.f14786b;
        }
        return null;
    }
}
