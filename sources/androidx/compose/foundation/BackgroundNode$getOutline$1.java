package androidx.compose.foundation;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class BackgroundNode$getOutline$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackgroundNode f2502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentDrawScope f2503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundNode$getOutline$1(f0 f0Var, BackgroundNode backgroundNode, ContentDrawScope contentDrawScope) {
        super(0);
        this.f2501a = f0Var;
        this.f2502b = backgroundNode;
        this.f2503c = contentDrawScope;
    }

    @Override // q0.a
    public final Object invoke() {
        Shape shape = this.f2502b.f2496r;
        ContentDrawScope contentDrawScope = this.f2503c;
        this.f2501a.f30930a = shape.a(contentDrawScope.b(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        return b0.f30125a;
    }
}
