package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextFieldKt$DefaultTextFieldDecorator$1$Decoration$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicTextFieldKt$DefaultTextFieldDecorator$1 f5618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f5619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$DefaultTextFieldDecorator$1$Decoration$1(BasicTextFieldKt$DefaultTextFieldDecorator$1 basicTextFieldKt$DefaultTextFieldDecorator$1, p pVar, int i2) {
        super(2);
        this.f5618a = basicTextFieldKt$DefaultTextFieldDecorator$1;
        this.f5619b = pVar;
        this.f5620c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5620c | 1);
        this.f5618a.a(this.f5619b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
