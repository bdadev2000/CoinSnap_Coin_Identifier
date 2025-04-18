package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FlowLayoutKt$FlowRow$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Horizontal f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f3923c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FlowRowOverflow f3925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f3926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3928j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$FlowRow$1(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, FlowRowOverflow flowRowOverflow, q qVar, int i4, int i5) {
        super(2);
        this.f3921a = modifier;
        this.f3922b = horizontal;
        this.f3923c = vertical;
        this.d = i2;
        this.f3924f = i3;
        this.f3925g = flowRowOverflow;
        this.f3926h = qVar;
        this.f3927i = i4;
        this.f3928j = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        FlowLayoutKt.a(this.f3921a, this.f3922b, this.f3923c, this.d, this.f3924f, this.f3925g, this.f3926h, (Composer) obj, RecomposeScopeImplKt.a(this.f3927i | 1), this.f3928j);
        return b0.f30125a;
    }
}
