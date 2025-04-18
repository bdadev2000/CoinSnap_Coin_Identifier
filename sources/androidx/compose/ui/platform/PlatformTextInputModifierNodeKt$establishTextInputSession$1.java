package androidx.compose.ui.platform;

import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {Opcodes.D2L}, m = "establishTextInputSession")
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt$establishTextInputSession$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16561a;

    /* renamed from: b, reason: collision with root package name */
    public int f16562b;

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16561a = obj;
        this.f16562b |= Integer.MIN_VALUE;
        PlatformTextInputModifierNodeKt.a(null, null, this);
        return i0.a.f30806a;
    }
}
