package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TimePickerKt$TimePickerTextField$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f12453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f12454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12455c;
    public final /* synthetic */ TimePickerState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f12457g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f12458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12460j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12461k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$3(Modifier modifier, TextFieldValue textFieldValue, l lVar, TimePickerState timePickerState, int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i3, int i4) {
        super(2);
        this.f12453a = modifier;
        this.f12454b = textFieldValue;
        this.f12455c = lVar;
        this.d = timePickerState;
        this.f12456f = i2;
        this.f12457g = keyboardOptions;
        this.f12458h = keyboardActions;
        this.f12459i = timePickerColors;
        this.f12460j = i3;
        this.f12461k = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        TimePickerKt.p(this.f12453a, this.f12454b, this.f12455c, this.d, this.f12456f, this.f12457g, this.f12458h, this.f12459i, (Composer) obj, RecomposeScopeImplKt.a(this.f12460j | 1), this.f12461k);
        return b0.f30125a;
    }
}
