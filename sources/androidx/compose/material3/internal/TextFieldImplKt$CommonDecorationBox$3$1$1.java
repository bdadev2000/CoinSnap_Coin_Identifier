package androidx.compose.material3.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f13042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(MutableState mutableState, float f2) {
        super(1);
        this.f13041a = f2;
        this.f13042b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Size) obj).f14923a;
        float d = Size.d(j2);
        float f2 = this.f13041a;
        float f3 = d * f2;
        float b2 = Size.b(j2) * f2;
        MutableState mutableState = this.f13042b;
        if (Size.d(((Size) mutableState.getValue()).f14923a) != f3 || Size.b(((Size) mutableState.getValue()).f14923a) != b2) {
            mutableState.setValue(new Size(SizeKt.a(f3, b2)));
        }
        return b0.f30125a;
    }
}
