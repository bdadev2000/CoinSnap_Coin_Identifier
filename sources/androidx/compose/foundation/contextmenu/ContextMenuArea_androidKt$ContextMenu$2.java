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
public final class ContextMenuArea_androidKt$ContextMenu$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f2909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2911c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuArea_androidKt$ContextMenu$2(ContextMenuState contextMenuState, a aVar, Modifier modifier, l lVar, int i2, int i3) {
        super(2);
        this.f2909a = contextMenuState;
        this.f2910b = aVar;
        this.f2911c = modifier;
        this.d = lVar;
        this.f2912f = i2;
        this.f2913g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuArea_androidKt.a(this.f2909a, this.f2910b, this.f2911c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f2912f | 1), this.f2913g);
        return b0.f30125a;
    }
}
