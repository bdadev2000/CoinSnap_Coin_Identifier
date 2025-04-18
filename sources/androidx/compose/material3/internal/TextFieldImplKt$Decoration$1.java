package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldImplKt$Decoration$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f13096c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$1(long j2, TextStyle textStyle, p pVar, int i2) {
        super(2);
        this.f13094a = j2;
        this.f13095b = textStyle;
        this.f13096c = pVar;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TextFieldImplKt.c(this.f13094a, this.f13095b, this.f13096c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1));
        return b0.f30125a;
    }
}
