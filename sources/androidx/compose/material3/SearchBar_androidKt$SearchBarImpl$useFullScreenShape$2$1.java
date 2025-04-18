package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f11031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1(Animatable animatable) {
        super(0);
        this.f11031a = animatable;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(((Number) this.f11031a.d()).floatValue() == 1.0f);
    }
}
