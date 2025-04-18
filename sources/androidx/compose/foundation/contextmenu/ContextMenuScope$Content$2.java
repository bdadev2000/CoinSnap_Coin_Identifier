package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ContextMenuScope$Content$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuScope f2937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f2938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuScope$Content$2(ContextMenuScope contextMenuScope, ContextMenuColors contextMenuColors, int i2) {
        super(2);
        this.f2937a = contextMenuScope;
        this.f2938b = contextMenuColors;
        this.f2939c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f2939c | 1);
        this.f2937a.a(this.f2938b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
