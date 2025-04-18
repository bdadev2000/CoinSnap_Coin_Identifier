package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import b1.f0;
import d0.b0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {Opcodes.INVOKEINTERFACE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16363a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f16365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, h0.g gVar) {
        super(2, gVar);
        this.f16365c = androidPlatformTextInputSession;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.f16365c, gVar);
        androidPlatformTextInputSession$startInputMethod$3.f16364b = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidPlatformTextInputSession$startInputMethod$3) create((InputMethodSession) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16363a;
        if (i2 == 0) {
            q.m(obj);
            InputMethodSession inputMethodSession = (InputMethodSession) this.f16364b;
            this.f16364b = inputMethodSession;
            AndroidPlatformTextInputSession androidPlatformTextInputSession = this.f16365c;
            this.f16363a = 1;
            b1.l lVar = new b1.l(1, f0.r(this));
            lVar.p();
            TextInputService textInputService = androidPlatformTextInputSession.f16355b;
            PlatformTextInputService platformTextInputService = textInputService.f17366a;
            platformTextInputService.a();
            textInputService.f17367b.set(new TextInputSession(textInputService, platformTextInputService));
            lVar.z(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
            if (lVar.o() == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        throw new RuntimeException();
    }
}
