package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class SearchBar_androidKt$SearchBarImpl$showContent$2$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f11027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$showContent$2$1(Animatable animatable) {
        super(0);
        this.f11027a = animatable;
    }

    @Override // q0.a
    public final Object invoke() {
        return Boolean.valueOf(((Number) this.f11027a.d()).floatValue() > 0.0f);
    }
}
