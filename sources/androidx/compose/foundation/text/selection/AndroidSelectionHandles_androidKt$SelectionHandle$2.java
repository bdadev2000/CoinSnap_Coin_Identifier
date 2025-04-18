package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f7024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f7026c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Modifier f7028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$2(OffsetProvider offsetProvider, boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3, long j2, Modifier modifier, int i2, int i3) {
        super(2);
        this.f7024a = offsetProvider;
        this.f7025b = z2;
        this.f7026c = resolvedTextDirection;
        this.d = z3;
        this.f7027f = j2;
        this.f7028g = modifier;
        this.f7029h = i2;
        this.f7030i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidSelectionHandles_androidKt.b(this.f7024a, this.f7025b, this.f7026c, this.d, this.f7027f, this.f7028g, (Composer) obj, RecomposeScopeImplKt.a(this.f7029h | 1), this.f7030i);
        return b0.f30125a;
    }
}
