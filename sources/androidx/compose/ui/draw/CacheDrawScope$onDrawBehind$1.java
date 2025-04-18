package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CacheDrawScope$onDrawBehind$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f14799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(l lVar) {
        super(1);
        this.f14799a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        this.f14799a.invoke(contentDrawScope);
        contentDrawScope.P1();
        return b0.f30125a;
    }
}
