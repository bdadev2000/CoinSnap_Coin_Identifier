package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExposedDropdownMenuBoxScope f9279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f9280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9281c;
    public final /* synthetic */ MutableTransitionState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableState f9282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ScrollState f9283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f9284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9285i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f9286j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f9287k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f9288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9289m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z2, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar) {
        super(2);
        this.f9279a = exposedDropdownMenuBoxScope;
        this.f9280b = modifier;
        this.f9281c = z2;
        this.d = mutableTransitionState;
        this.f9282f = mutableState;
        this.f9283g = scrollState;
        this.f9284h = shape;
        this.f9285i = j2;
        this.f9286j = f2;
        this.f9287k = f3;
        this.f9288l = borderStroke;
        this.f9289m = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            MenuKt.a(this.f9279a.b(this.f9280b, this.f9281c), this.d, this.f9282f, this.f9283g, this.f9284h, this.f9285i, this.f9286j, this.f9287k, this.f9288l, this.f9289m, composer, 384);
        }
        return b0.f30125a;
    }
}
