package androidx.compose.material3;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f9353c;
    public final /* synthetic */ MutableIntState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$3$1(View view, int i2, MutableState mutableState, MutableIntState mutableIntState) {
        super(0);
        this.f9351a = view;
        this.f9352b = i2;
        this.f9353c = mutableState;
        this.d = mutableIntState;
    }

    @Override // q0.a
    public final Object invoke() {
        View rootView = this.f9351a.getRootView();
        float f2 = ExposedDropdownMenu_androidKt.f9345a;
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.geometry.Rect d = RectHelper_androidKt.d(rect);
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f9353c.getValue();
        this.d.b(ExposedDropdownMenu_androidKt.b(this.f9352b, d, layoutCoordinates == null ? androidx.compose.ui.geometry.Rect.e : RectKt.a(layoutCoordinates.M(0L), IntSizeKt.c(layoutCoordinates.a()))));
        return b0.f30125a;
    }
}
