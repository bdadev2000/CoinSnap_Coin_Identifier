package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidComposeView$viewTreeOwners$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f16266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$viewTreeOwners$2(AndroidComposeView androidComposeView) {
        super(0);
        this.f16266a = androidComposeView;
    }

    @Override // q0.a
    public final Object invoke() {
        AndroidComposeView.ViewTreeOwners viewTreeOwners;
        viewTreeOwners = this.f16266a.get_viewTreeOwners();
        return viewTreeOwners;
    }
}
