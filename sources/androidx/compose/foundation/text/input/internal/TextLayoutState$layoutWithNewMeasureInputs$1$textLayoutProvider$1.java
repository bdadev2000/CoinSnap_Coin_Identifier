package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f6650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(TextLayoutState textLayoutState) {
        super(0);
        this.f6650a = textLayoutState;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldLayoutStateCache.MeasureInputs measureInputs;
        TextFieldLayoutStateCache textFieldLayoutStateCache = this.f6650a.f6644a;
        TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = (TextFieldLayoutStateCache.NonMeasureInputs) textFieldLayoutStateCache.f6616a.getValue();
        if (nonMeasureInputs == null || (measureInputs = (TextFieldLayoutStateCache.MeasureInputs) textFieldLayoutStateCache.f6617b.getValue()) == null) {
            return null;
        }
        return textFieldLayoutStateCache.a(nonMeasureInputs, measureInputs);
    }
}
