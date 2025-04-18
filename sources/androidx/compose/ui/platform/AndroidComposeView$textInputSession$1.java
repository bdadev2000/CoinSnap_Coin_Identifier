package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {592}, m = "textInputSession")
/* loaded from: classes2.dex */
public final class AndroidComposeView$textInputSession$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16263b;

    /* renamed from: c, reason: collision with root package name */
    public int f16264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, h0.g gVar) {
        super(gVar);
        this.f16263b = androidComposeView;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16262a = obj;
        this.f16264c |= Integer.MIN_VALUE;
        this.f16263b.h(null, this);
        return i0.a.f30806a;
    }
}
