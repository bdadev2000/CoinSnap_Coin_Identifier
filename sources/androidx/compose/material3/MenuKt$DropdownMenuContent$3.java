package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
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
public final class MenuKt$DropdownMenuContent$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f9748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableTransitionState f9749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f9750c;
    public final /* synthetic */ ScrollState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f9751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f9752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f9753h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f9754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f9755j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f9756k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9757l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$3(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, int i2) {
        super(2);
        this.f9748a = modifier;
        this.f9749b = mutableTransitionState;
        this.f9750c = mutableState;
        this.d = scrollState;
        this.f9751f = shape;
        this.f9752g = j2;
        this.f9753h = f2;
        this.f9754i = f3;
        this.f9755j = borderStroke;
        this.f9756k = qVar;
        this.f9757l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        MenuKt.a(this.f9748a, this.f9749b, this.f9750c, this.d, this.f9751f, this.f9752g, this.f9753h, this.f9754i, this.f9755j, this.f9756k, (Composer) obj, RecomposeScopeImplKt.a(this.f9757l | 1));
        return b0.f30125a;
    }
}
