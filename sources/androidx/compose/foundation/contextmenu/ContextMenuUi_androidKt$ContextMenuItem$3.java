package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt$ContextMenuItem$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContextMenuColors f2969c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f2970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f2971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2972h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuUi_androidKt$ContextMenuItem$3(String str, boolean z2, ContextMenuColors contextMenuColors, Modifier modifier, q qVar, a aVar, int i2, int i3) {
        super(2);
        this.f2967a = str;
        this.f2968b = z2;
        this.f2969c = contextMenuColors;
        this.d = modifier;
        this.f2970f = qVar;
        this.f2971g = aVar;
        this.f2972h = i2;
        this.f2973i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ContextMenuUi_androidKt.b(this.f2967a, this.f2968b, this.f2969c, this.d, this.f2970f, this.f2971g, (Composer) obj, RecomposeScopeImplKt.a(this.f2972h | 1), this.f2973i);
        return b0.f30125a;
    }
}
