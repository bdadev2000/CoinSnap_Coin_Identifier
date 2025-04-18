package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ScaffoldKt$Scaffold$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableWindowInsets f10793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        super(1);
        this.f10793a = mutableWindowInsets;
        this.f10794b = windowInsets;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f10793a.f13029a.setValue(WindowInsetsKt.c(this.f10794b, (WindowInsets) obj));
        return b0.f30125a;
    }
}
