package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Painter$drawLambda$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Painter f15279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Painter$drawLambda$1(Painter painter) {
        super(1);
        this.f15279a = painter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f15279a.onDraw((DrawScope) obj);
        return b0.f30125a;
    }
}
