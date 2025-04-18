package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BorderModifierNode$drawGenericBorder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Outline.Generic f2590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Brush f2591b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$1(Outline.Generic generic, Brush brush) {
        super(1);
        this.f2590a = generic;
        this.f2591b = brush;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        DrawScope.Y(contentDrawScope, this.f2590a.f15000a, this.f2591b, 0.0f, null, 60);
        return b0.f30125a;
    }
}
