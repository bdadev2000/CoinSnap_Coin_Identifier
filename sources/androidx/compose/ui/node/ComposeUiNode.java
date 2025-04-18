package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import q0.p;

/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion h8 = Companion.f15894a;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f15894a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final q0.a f15895b = LayoutNode$Companion$Constructor$1.f15963a;

        /* renamed from: c, reason: collision with root package name */
        public static final q0.a f15896c = ComposeUiNode$Companion$VirtualConstructor$1.f15907a;
        public static final p d = ComposeUiNode$Companion$SetModifier$1.f15905a;
        public static final p e = ComposeUiNode$Companion$SetDensity$1.f15902a;

        /* renamed from: f, reason: collision with root package name */
        public static final p f15897f = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.f15906a;

        /* renamed from: g, reason: collision with root package name */
        public static final p f15898g = ComposeUiNode$Companion$SetMeasurePolicy$1.f15904a;

        /* renamed from: h, reason: collision with root package name */
        public static final p f15899h = ComposeUiNode$Companion$SetLayoutDirection$1.f15903a;

        /* renamed from: i, reason: collision with root package name */
        public static final p f15900i = ComposeUiNode$Companion$SetCompositeKeyHash$1.f15901a;
    }

    void b(int i2);

    void e(ViewConfiguration viewConfiguration);

    void g(LayoutDirection layoutDirection);

    void i(MeasurePolicy measurePolicy);

    void j(Modifier modifier);

    void k(Density density);

    void l(CompositionLocalMap compositionLocalMap);
}
