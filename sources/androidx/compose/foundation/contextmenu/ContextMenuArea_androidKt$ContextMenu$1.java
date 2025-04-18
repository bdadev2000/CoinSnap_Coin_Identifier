package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ContextMenuArea_androidKt$ContextMenu$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2906c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuArea_androidKt$ContextMenu$1(ContextMenuState contextMenuState, a aVar, Modifier modifier, l lVar, int i2, int i3) {
        super(2);
        this.f2904a = contextMenuState;
        this.f2905b = aVar;
        this.f2906c = modifier;
        this.d = lVar;
        this.f2907f = i2;
        this.f2908g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuArea_androidKt.a(this.f2904a, this.f2905b, this.f2906c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f2907f | 1), this.f2908g);
        return b0.f30125a;
    }
}
