package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidCursorHandle_androidKt$DefaultCursorHandle$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f5402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$DefaultCursorHandle$1(Modifier modifier, int i2, int i3) {
        super(2);
        this.f5402a = modifier;
        this.f5403b = i2;
        this.f5404c = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f5403b | 1);
        int i2 = this.f5404c;
        AndroidCursorHandle_androidKt.b(this.f5402a, (Composer) obj, a2, i2);
        return b0.f30125a;
    }
}
