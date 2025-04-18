package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {239}, m = "startInputMethod")
/* loaded from: classes4.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 f16414b;

    /* renamed from: c, reason: collision with root package name */
    public int f16415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, h0.g gVar) {
        super(gVar);
        this.f16414b = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16413a = obj;
        this.f16415c |= Integer.MIN_VALUE;
        this.f16414b.a(null, this);
        return i0.a.f30806a;
    }
}
