package d7;

import b7.b;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a vungleFactory) {
        super(mediationAppOpenAdConfiguration, mediationAdLoadCallback, vungleFactory);
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
    }

    @Override // b7.b
    public final String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        return null;
    }

    @Override // b7.b
    public final void b(d adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
    }
}
