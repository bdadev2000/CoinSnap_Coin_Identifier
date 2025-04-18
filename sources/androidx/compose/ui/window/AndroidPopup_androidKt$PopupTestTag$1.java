package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$PopupTestTag$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$PopupTestTag$1(String str, p pVar, int i2) {
        super(2);
        this.f17653a = str;
        this.f17654b = pVar;
        this.f17655c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f17655c | 1);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f17615a;
        ComposerImpl g2 = ((Composer) obj).g(-498879600);
        int i3 = a2 & 6;
        String str = this.f17653a;
        if (i3 == 0) {
            i2 = (g2.I(str) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = a2 & 48;
        p pVar = this.f17654b;
        if (i4 == 0) {
            i2 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            CompositionLocalKt.a(AndroidPopup_androidKt.f17615a.c(str), pVar, g2, (i2 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidPopup_androidKt$PopupTestTag$1(str, pVar, a2);
        }
        return b0.f30125a;
    }
}
