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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidMenu_androidKt$DropdownMenu$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f7601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f7602c;
    public final /* synthetic */ ScrollState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f7603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f7604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f7605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f7606i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f7607j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f7608k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$1(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar) {
        super(2);
        this.f7600a = modifier;
        this.f7601b = mutableTransitionState;
        this.f7602c = mutableState;
        this.d = scrollState;
        this.f7603f = shape;
        this.f7604g = j2;
        this.f7605h = f2;
        this.f7606i = f3;
        this.f7607j = borderStroke;
        this.f7608k = qVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            MenuKt.a(this.f7600a, this.f7601b, this.f7602c, this.d, this.f7603f, this.f7604g, this.f7605h, this.f7606i, this.f7607j, this.f7608k, composer, 384);
        }
        return b0.f30125a;
    }
}
