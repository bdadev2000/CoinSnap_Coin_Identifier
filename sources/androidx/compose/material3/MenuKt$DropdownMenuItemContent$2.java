package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MenuKt$DropdownMenuItemContent$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f9771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f9772c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9774g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MenuItemColors f9775h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f9776i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9777j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9778k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$2(p pVar, q0.a aVar, Modifier modifier, p pVar2, p pVar3, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2) {
        super(2);
        this.f9770a = pVar;
        this.f9771b = aVar;
        this.f9772c = modifier;
        this.d = pVar2;
        this.f9773f = pVar3;
        this.f9774g = z2;
        this.f9775h = menuItemColors;
        this.f9776i = paddingValues;
        this.f9777j = mutableInteractionSource;
        this.f9778k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MenuKt.b(this.f9770a, this.f9771b, this.f9772c, this.d, this.f9773f, this.f9774g, this.f9775h, this.f9776i, this.f9777j, (Composer) obj, RecomposeScopeImplKt.a(this.f9778k | 1));
        return b0.f30125a;
    }
}
