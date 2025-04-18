package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class TextLinkScope$textRange$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntRect f6234a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$textRange$1$1(IntRect intRect) {
        super(0);
        this.f6234a = intRect;
    }

    @Override // q0.a
    public final Object invoke() {
        IntRect intRect = this.f6234a;
        return new IntOffset(IntOffsetKt.a(intRect.f17490a, intRect.f17491b));
    }
}
