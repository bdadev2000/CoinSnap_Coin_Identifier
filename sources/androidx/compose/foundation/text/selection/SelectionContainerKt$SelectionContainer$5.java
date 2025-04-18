package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SelectionContainerKt$SelectionContainer$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Selection f7122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f7123c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$5(Modifier modifier, Selection selection, l lVar, p pVar, int i2, int i3) {
        super(2);
        this.f7121a = modifier;
        this.f7122b = selection;
        this.f7123c = lVar;
        this.d = pVar;
        this.f7124f = i2;
        this.f7125g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SelectionContainerKt.a(this.f7121a, this.f7122b, this.f7123c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f7124f | 1), this.f7125g);
        return b0.f30125a;
    }
}
