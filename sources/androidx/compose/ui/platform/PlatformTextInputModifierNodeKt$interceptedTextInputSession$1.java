package androidx.compose.ui.platform;

import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {Opcodes.MONITORENTER, 196}, m = "interceptedTextInputSession")
/* loaded from: classes3.dex */
public final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16563a;

    /* renamed from: b, reason: collision with root package name */
    public int f16564b;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16563a = obj;
        this.f16564b |= Integer.MIN_VALUE;
        PlatformTextInputModifierNodeKt.b(null, null, null, this);
        return i0.a.f30806a;
    }
}
