package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$TimePickerTextField$1$1$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f12444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12446c;

    /* renamed from: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f12447a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f12448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(2);
            this.f12447a = mutableInteractionSource;
            this.f12448b = textFieldColors;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                OutlinedTextFieldDefaults.f10396a.a(true, false, this.f12447a, null, this.f12448b, ShapesKt.a(TimeInputTokens.d, composer), 0.0f, 0.0f, composer, 100663734, 200);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(3);
        this.f12444a = textFieldValue;
        this.f12445b = mutableInteractionSource;
        this.f12446c = textFieldColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.w(pVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f10396a;
            String str = this.f12444a.f17361a.f16880a;
            androidx.compose.ui.text.input.c cVar = VisualTransformation.Companion.f17394a;
            float f2 = 0;
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, f2, f2, f2);
            MutableInteractionSource mutableInteractionSource = this.f12445b;
            TextFieldColors textFieldColors = this.f12446c;
            outlinedTextFieldDefaults.b(str, pVar, true, true, cVar, mutableInteractionSource, false, null, null, null, null, null, null, null, textFieldColors, paddingValuesImpl, ComposableLambdaKt.c(-833003881, new AnonymousClass1(mutableInteractionSource, textFieldColors), composer), composer, ((intValue << 3) & 112) | 224640, 14352384, 16320);
        }
        return b0.f30125a;
    }
}
