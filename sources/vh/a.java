package vh;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;

/* loaded from: classes5.dex */
public final class a {
    public static a a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f26533b = new Object();

    public static AdRequest a(MediationAdConfiguration mediationAdConfiguration) {
        RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
        builder.setTagForChildDirectedTreatment(mediationAdConfiguration.taggedForChildDirectedTreatment());
        builder.setTagForUnderAgeOfConsent(mediationAdConfiguration.taggedForUnderAgeTreatment());
        builder.setMaxAdContentRating(mediationAdConfiguration.getMaxAdContentRating());
        AdRequest.Builder builder2 = new AdRequest.Builder();
        builder2.addNetworkExtrasBundle(AdMobAdapter.class, mediationAdConfiguration.getMediationExtras());
        return builder2.build();
    }

    public static a b() {
        synchronized (f26533b) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }
}
