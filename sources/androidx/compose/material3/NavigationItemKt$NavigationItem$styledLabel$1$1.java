package androidx.compose.material3;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class NavigationItemKt$NavigationItem$styledLabel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationItemColors f10268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10270c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationItemKt$NavigationItem$styledLabel$1$1(NavigationItemColors navigationItemColors, boolean z2, boolean z3, TextStyle textStyle, p pVar) {
        super(2);
        this.f10268a = navigationItemColors;
        this.f10269b = z2;
        this.f10270c = z3;
        this.d = textStyle;
        this.f10271f = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean z2 = this.f10270c;
            NavigationItemColors navigationItemColors = this.f10268a;
            ProvideContentColorTextStyleKt.a(!z2 ? navigationItemColors.f10234g : this.f10269b ? navigationItemColors.f10231b : navigationItemColors.e, this.d, this.f10271f, composer, 0);
        }
        return b0.f30125a;
    }
}
