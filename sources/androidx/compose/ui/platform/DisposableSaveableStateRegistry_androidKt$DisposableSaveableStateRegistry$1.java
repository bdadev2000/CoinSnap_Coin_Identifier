package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f16477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistry f16478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z2, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.f16477a = z2;
        this.f16478b = savedStateRegistry;
        this.f16479c = str;
    }

    @Override // q0.a
    public final Object invoke() {
        if (this.f16477a) {
            SavedStateRegistry savedStateRegistry = this.f16478b;
            savedStateRegistry.getClass();
            String str = this.f16479c;
            p0.a.s(str, SDKConstants.PARAM_KEY);
            savedStateRegistry.f21432a.c(str);
        }
        return b0.f30125a;
    }
}
