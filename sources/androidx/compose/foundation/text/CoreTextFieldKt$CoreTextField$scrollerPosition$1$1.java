package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Orientation f5903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.f5903a = orientation;
    }

    @Override // q0.a
    public final Object invoke() {
        return new TextFieldScrollerPosition(this.f5903a, 0.0f);
    }
}
