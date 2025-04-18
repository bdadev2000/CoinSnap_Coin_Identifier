package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextKt$ProvideTextStyle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$ProvideTextStyle$1(TextStyle textStyle, p pVar, int i2) {
        super(2);
        this.f12206a = textStyle;
        this.f12207b = pVar;
        this.f12208c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f12208c | 1);
        TextKt.a(this.f12206a, this.f12207b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
