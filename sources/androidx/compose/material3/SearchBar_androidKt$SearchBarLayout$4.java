package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SearchBar_androidKt$SearchBarLayout$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f11053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f11054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f11055c;
    public final /* synthetic */ MutableState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f11056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f11057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f11058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f11060j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11061k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarLayout$4(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, p pVar, p pVar2, p pVar3, int i2) {
        super(2);
        this.f11053a = animatable;
        this.f11054b = mutableFloatState;
        this.f11055c = mutableState;
        this.d = mutableState2;
        this.f11056f = modifier;
        this.f11057g = windowInsets;
        this.f11058h = pVar;
        this.f11059i = pVar2;
        this.f11060j = pVar3;
        this.f11061k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SearchBar_androidKt.d(this.f11053a, this.f11054b, this.f11055c, this.d, this.f11056f, this.f11057g, this.f11058h, this.f11059i, this.f11060j, (Composer) obj, RecomposeScopeImplKt.a(this.f11061k | 1));
        return b0.f30125a;
    }
}
