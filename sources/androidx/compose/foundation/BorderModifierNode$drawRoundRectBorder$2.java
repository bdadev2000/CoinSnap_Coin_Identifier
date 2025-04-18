package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class BorderModifierNode$drawRoundRectBorder$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Path f2602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Brush f2603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$2(Path path, Brush brush) {
        super(1);
        this.f2602a = path;
        this.f2603b = brush;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        DrawScope.Y(contentDrawScope, this.f2602a, this.f2603b, 0.0f, null, 60);
        return b0.f30125a;
    }
}
