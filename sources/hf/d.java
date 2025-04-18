package hf;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import k8.t;
import kotlin.jvm.internal.Intrinsics;
import y7.l;
import y7.o;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements OnCompleteListener, zb.a, t, o {
    public /* synthetic */ d() {
    }

    @Override // y7.o
    public l[] createExtractors() {
        return new l[0];
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e eVar = f.f19112c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            eVar = null;
        }
        ((SplashActivity) eVar).f16742l = true;
        f.a = true;
    }

    public /* synthetic */ d(androidx.emoji2.text.t tVar) {
    }
}
