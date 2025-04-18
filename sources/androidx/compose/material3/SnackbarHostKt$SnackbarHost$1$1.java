package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SnackbarHostKt$SnackbarHost$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f11522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, g gVar) {
        super(2, gVar);
        this.f11521a = snackbarData;
        this.f11522b = accessibilityManager;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.f11521a, this.f11522b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        SnackbarData snackbarData = this.f11521a;
        q.m(obj);
        if (snackbarData == null) {
            return b0.f30125a;
        }
        snackbarData.a().getDuration();
        snackbarData.a().a();
        throw null;
    }
}
