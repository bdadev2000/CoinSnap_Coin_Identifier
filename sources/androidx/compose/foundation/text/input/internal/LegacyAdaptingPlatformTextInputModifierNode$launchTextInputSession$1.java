package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {Opcodes.I2D}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyAdaptingPlatformTextInputModifierNode f6429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f6430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode, p pVar, g gVar) {
        super(2, gVar);
        this.f6429b = legacyAdaptingPlatformTextInputModifierNode;
        this.f6430c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this.f6429b, this.f6430c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6428a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            throw new RuntimeException();
        }
        q.m(obj);
        this.f6428a = 1;
        PlatformTextInputModifierNodeKt.a(this.f6429b, this.f6430c, this);
        return aVar;
    }
}
