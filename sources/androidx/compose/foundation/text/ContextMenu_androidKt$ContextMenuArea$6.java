package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ContextMenu_androidKt$ContextMenuArea$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectionManager f5788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f5789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$6(SelectionManager selectionManager, p pVar, int i2) {
        super(2);
        this.f5788a = selectionManager;
        this.f5789b = pVar;
        this.f5790c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5790c | 1);
        ContextMenu_androidKt.b(this.f5788a, this.f5789b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
