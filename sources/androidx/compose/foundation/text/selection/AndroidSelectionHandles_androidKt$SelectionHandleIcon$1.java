package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandleIcon$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f7034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f7035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7036c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandleIcon$1(Modifier modifier, q0.a aVar, boolean z2, int i2) {
        super(2);
        this.f7034a = modifier;
        this.f7035b = aVar;
        this.f7036c = z2;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        q0.a aVar = this.f7035b;
        boolean z2 = this.f7036c;
        AndroidSelectionHandles_androidKt.c(this.f7034a, aVar, z2, (Composer) obj, a2);
        return b0.f30125a;
    }
}
