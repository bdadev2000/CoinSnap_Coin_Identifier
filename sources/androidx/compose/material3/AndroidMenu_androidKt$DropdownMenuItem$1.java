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
public final class AndroidMenu_androidKt$DropdownMenuItem$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f7639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f7640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f7641c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MenuItemColors f7644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f7645i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f7646j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7647k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7648l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenuItem$1(p pVar, q0.a aVar, Modifier modifier, p pVar2, p pVar3, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(2);
        this.f7639a = pVar;
        this.f7640b = aVar;
        this.f7641c = modifier;
        this.d = pVar2;
        this.f7642f = pVar3;
        this.f7643g = z2;
        this.f7644h = menuItemColors;
        this.f7645i = paddingValues;
        this.f7646j = mutableInteractionSource;
        this.f7647k = i2;
        this.f7648l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidMenu_androidKt.b(this.f7639a, this.f7640b, this.f7641c, this.d, this.f7642f, this.f7643g, this.f7644h, this.f7645i, this.f7646j, (Composer) obj, RecomposeScopeImplKt.a(this.f7647k | 1), this.f7648l);
        return b0.f30125a;
    }
}
