package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ContextMenuArea_androidKt$ContextMenuArea$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContextMenuState f2914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2916c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f2918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuArea_androidKt$ContextMenuArea$2(ContextMenuState contextMenuState, a aVar, l lVar, Modifier modifier, boolean z2, p pVar, int i2, int i3) {
        super(2);
        this.f2914a = contextMenuState;
        this.f2915b = aVar;
        this.f2916c = lVar;
        this.d = modifier;
        this.f2917f = z2;
        this.f2918g = pVar;
        this.f2919h = i2;
        this.f2920i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuArea_androidKt.b(this.f2914a, this.f2915b, this.f2916c, this.d, this.f2917f, this.f2918g, (Composer) obj, RecomposeScopeImplKt.a(this.f2919h | 1), this.f2920i);
        return b0.f30125a;
    }
}
