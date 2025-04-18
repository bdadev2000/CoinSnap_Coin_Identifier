package androidx.compose.ui.platform;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$2 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputMethodRequest f16360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f16361b;

    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidPlatformTextInputSession f16362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
            super(0);
            this.f16362a = androidPlatformTextInputSession;
        }

        @Override // q0.a
        public final Object invoke() {
            p0.a.m(this.f16362a.f16356c, null);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$2(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.f16360a = platformTextInputMethodRequest;
        this.f16361b = androidPlatformTextInputSession;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new InputMethodSession(this.f16360a, new AnonymousClass1(this.f16361b));
    }
}
