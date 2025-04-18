package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SearchBar_androidKt$SearchBarImpl$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f11011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f11012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f11013c;
    public final /* synthetic */ MutableState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f11014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f11016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f11017i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f11018j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f11019k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f11020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f11021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11024p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$1(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, p pVar, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, q qVar, int i2, int i3, int i4) {
        super(2);
        this.f11011a = animatable;
        this.f11012b = mutableFloatState;
        this.f11013c = mutableState;
        this.d = mutableState2;
        this.f11014f = modifier;
        this.f11015g = pVar;
        this.f11016h = shape;
        this.f11017i = searchBarColors;
        this.f11018j = f2;
        this.f11019k = f3;
        this.f11020l = windowInsets;
        this.f11021m = qVar;
        this.f11022n = i2;
        this.f11023o = i3;
        this.f11024p = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SearchBar_androidKt.c(this.f11011a, this.f11012b, this.f11013c, this.d, this.f11014f, this.f11015g, this.f11016h, this.f11017i, this.f11018j, this.f11019k, this.f11020l, this.f11021m, (Composer) obj, RecomposeScopeImplKt.a(this.f11022n | 1), RecomposeScopeImplKt.a(this.f11023o), this.f11024p);
        return b0.f30125a;
    }
}
