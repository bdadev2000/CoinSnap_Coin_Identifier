package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {229}, m = "textInputSession")
/* loaded from: classes.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChainedPlatformTextInputInterceptor f16405b;

    /* renamed from: c, reason: collision with root package name */
    public int f16406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, h0.g gVar) {
        super(gVar);
        this.f16405b = chainedPlatformTextInputInterceptor;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16404a = obj;
        this.f16406c |= Integer.MIN_VALUE;
        this.f16405b.a(null, null, this);
        return i0.a.f30806a;
    }
}
