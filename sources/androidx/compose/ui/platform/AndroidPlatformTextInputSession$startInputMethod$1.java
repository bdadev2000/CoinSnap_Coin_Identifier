package androidx.compose.ui.platform;

import org.objectweb.asm.TypeReference;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m = "startInputMethod")
/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f16358b;

    /* renamed from: c, reason: collision with root package name */
    public int f16359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, h0.g gVar) {
        super(gVar);
        this.f16358b = androidPlatformTextInputSession;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16357a = obj;
        this.f16359c |= Integer.MIN_VALUE;
        this.f16358b.a(null, this);
        return i0.a.f30806a;
    }
}
