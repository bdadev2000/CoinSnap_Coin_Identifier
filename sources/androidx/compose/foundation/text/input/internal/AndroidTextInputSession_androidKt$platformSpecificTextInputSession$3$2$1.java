package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import b1.d0;
import d0.b0;
import e1.l0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {Opcodes.DREM, 116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f6356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComposeInputMethodManager f6357c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f6358a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(l0 l0Var, ComposeInputMethodManager composeInputMethodManager, g gVar) {
        super(2, gVar);
        this.f6356b = l0Var;
        this.f6357c = composeInputMethodManager;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.f6356b, this.f6357c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6355a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.f6358a;
            this.f6355a = 1;
            if (MonotonicFrameClockKt.a(getContext()).b0(new MonotonicFrameClockKt$withFrameMillis$2(anonymousClass1), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                throw new RuntimeException();
            }
            q.m(obj);
        }
        final ComposeInputMethodManager composeInputMethodManager = this.f6357c;
        e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.2
            @Override // e1.i
            public final Object emit(Object obj2, g gVar) {
                ComposeInputMethodManager.this.e();
                return b0.f30125a;
            }
        };
        this.f6355a = 2;
        if (this.f6356b.collect(iVar, this) == aVar) {
            return aVar;
        }
        throw new RuntimeException();
    }
}
