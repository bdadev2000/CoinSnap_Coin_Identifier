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
import q0.l;

/* loaded from: classes4.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f9349c;
    public final /* synthetic */ MutableIntState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f9350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1(View view, int i2, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(1);
        this.f9347a = view;
        this.f9348b = i2;
        this.f9349c = mutableState;
        this.d = mutableIntState;
        this.f9350f = mutableIntState2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        float f2 = ExposedDropdownMenu_androidKt.f9345a;
        MutableState mutableState = this.f9349c;
        mutableState.setValue(layoutCoordinates);
        this.d.b((int) (layoutCoordinates.a() >> 32));
        View rootView = this.f9347a.getRootView();
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.geometry.Rect d = RectHelper_androidKt.d(rect);
        LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) mutableState.getValue();
        this.f9350f.b(ExposedDropdownMenu_androidKt.b(this.f9348b, d, layoutCoordinates2 == null ? androidx.compose.ui.geometry.Rect.e : RectKt.a(layoutCoordinates2.M(0L), IntSizeKt.c(layoutCoordinates2.a()))));
        return b0.f30125a;
    }
}
