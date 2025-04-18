package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6191a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.f6191a = textFieldScrollerPosition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        TextFieldScrollerPosition textFieldScrollerPosition = this.f6191a;
        float c2 = textFieldScrollerPosition.f6198a.c() + floatValue;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = textFieldScrollerPosition.f6199b;
        float c3 = parcelableSnapshotMutableFloatState.c();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = textFieldScrollerPosition.f6198a;
        if (c2 > c3) {
            floatValue = parcelableSnapshotMutableFloatState.c() - parcelableSnapshotMutableFloatState2.c();
        } else if (c2 < 0.0f) {
            floatValue = -parcelableSnapshotMutableFloatState2.c();
        }
        parcelableSnapshotMutableFloatState2.n(parcelableSnapshotMutableFloatState2.c() + floatValue);
        return Float.valueOf(floatValue);
    }
}
