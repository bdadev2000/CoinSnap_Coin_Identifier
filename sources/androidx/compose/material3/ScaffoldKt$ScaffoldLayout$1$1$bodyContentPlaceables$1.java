package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f10831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubcomposeMeasureScope f10832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f10833c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f10834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f10835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f10836h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, ArrayList arrayList, int i2, ArrayList arrayList2, Integer num, q qVar) {
        super(2);
        this.f10831a = windowInsets;
        this.f10832b = subcomposeMeasureScope;
        this.f10833c = arrayList;
        this.d = i2;
        this.f10834f = arrayList2;
        this.f10835g = num;
        this.f10836h = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            WindowInsets windowInsets = this.f10831a;
            SubcomposeMeasureScope subcomposeMeasureScope = this.f10832b;
            PaddingValues b2 = WindowInsetsKt.b(windowInsets, subcomposeMeasureScope);
            this.f10836h.invoke(new PaddingValuesImpl(PaddingKt.d(b2, subcomposeMeasureScope.getLayoutDirection()), this.f10833c.isEmpty() ? b2.d() : subcomposeMeasureScope.H(this.d), PaddingKt.c(b2, subcomposeMeasureScope.getLayoutDirection()), (this.f10834f.isEmpty() || (num = this.f10835g) == null) ? b2.a() : subcomposeMeasureScope.H(num.intValue())), composer, 0);
        }
        return b0.f30125a;
    }
}
