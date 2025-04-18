package androidx.compose.ui.platform;

import b1.d0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidComposeView$textInputSession$2 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16265a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$2(AndroidComposeView androidComposeView) {
        super(1);
        this.f16265a = androidComposeView;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidComposeView androidComposeView = this.f16265a;
        return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), (d0) obj);
    }
}
