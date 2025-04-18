package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ContextMenuUi_androidKt$ContextMenuPopup$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f2974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2976c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$1(PopupPositionProvider popupPositionProvider, a aVar, Modifier modifier, l lVar, int i2, int i3) {
        super(2);
        this.f2974a = popupPositionProvider;
        this.f2975b = aVar;
        this.f2976c = modifier;
        this.d = lVar;
        this.f2977f = i2;
        this.f2978g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuUi_androidKt.d(this.f2974a, this.f2975b, this.f2976c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f2977f | 1), this.f2978g);
        return b0.f30125a;
    }
}
