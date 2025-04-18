package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class Tooltip_androidKt$drawCaretWithPath$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f12600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Path f12601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tooltip_androidKt$drawCaretWithPath$4(LayoutCoordinates layoutCoordinates, AndroidPath androidPath, long j2) {
        super(1);
        this.f12600a = layoutCoordinates;
        this.f12601b = androidPath;
        this.f12602c = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        if (this.f12600a != null) {
            contentDrawScope.P1();
            DrawScope.N(contentDrawScope, this.f12601b, this.f12602c, 0.0f, null, 60);
        }
        return b0.f30125a;
    }
}
