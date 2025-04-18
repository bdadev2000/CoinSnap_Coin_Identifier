package androidx.compose.material3;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {2031}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public int f7863a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f7864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, g gVar) {
        super(3, gVar);
        this.f7865c = topAppBarScrollBehavior;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(this.f7865c, (g) obj3);
        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.f7864b = floatValue;
        return appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7863a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            float f2 = this.f7864b;
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7865c;
            topAppBarScrollBehavior.getState();
            topAppBarScrollBehavior.b();
            topAppBarScrollBehavior.c();
            this.f7863a = 1;
            if (AppBarKt.j(null, f2, null, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
