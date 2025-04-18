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
public final class ContextMenuUi_androidKt$ContextMenuPopup$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f2984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f2986c;
    public final /* synthetic */ ContextMenuColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f2987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuPopup$3(PopupPositionProvider popupPositionProvider, a aVar, Modifier modifier, ContextMenuColors contextMenuColors, l lVar, int i2, int i3) {
        super(2);
        this.f2984a = popupPositionProvider;
        this.f2985b = aVar;
        this.f2986c = modifier;
        this.d = contextMenuColors;
        this.f2987f = lVar;
        this.f2988g = i2;
        this.f2989h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuUi_androidKt.c(this.f2984a, this.f2985b, this.f2986c, this.d, this.f2987f, (Composer) obj, RecomposeScopeImplKt.a(this.f2988g | 1), this.f2989h);
        return b0.f30125a;
    }
}
