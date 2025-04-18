package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f16339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(MutableState mutableState) {
        super(1);
        this.f16339a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Configuration configuration = new Configuration((Configuration) obj);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16324a;
        this.f16339a.setValue(configuration);
        return b0.f30125a;
    }
}
