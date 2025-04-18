package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import b1.d0;
import b1.f0;
import d0.b0;
import e0.u;
import e0.w;
import kotlin.jvm.internal.r;
import q0.l;
import x0.n;

/* loaded from: classes4.dex */
final class DatePickerKt$YearPicker$1$2$1$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f9001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f9003c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f9004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPicker$1$2$1$1$1$1(LazyGridState lazyGridState, int i2, d0 d0Var, String str, String str2) {
        super(1);
        this.f9001a = lazyGridState;
        this.f9002b = i2;
        this.f9003c = d0Var;
        this.d = str;
        this.f9004f = str2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Object v2;
        LazyGridItemInfo lazyGridItemInfo;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        LazyGridState lazyGridState = this.f9001a;
        int g2 = lazyGridState.g();
        int i2 = this.f9002b;
        if (g2 == i2 || ((lazyGridItemInfo = (LazyGridItemInfo) u.M0(lazyGridState.i().h())) != null && lazyGridItemInfo.getIndex() == i2)) {
            float f2 = DatePickerKt.f8765a;
            d0 d0Var = this.f9003c;
            v2 = f0.v(new CustomAccessibilityAction(this.d, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, d0Var)), new CustomAccessibilityAction(this.f9004f, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, d0Var)));
        } else {
            v2 = w.f30218a;
        }
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16812v;
        n nVar = SemanticsPropertiesKt.f16865a[25];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, v2);
        return b0.f30125a;
    }
}
