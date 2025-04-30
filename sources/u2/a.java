package U2;

import com.facebook.ads.AudienceNetworkAds;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f3126d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3127a = false;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3128c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f3127a = false;
        this.b = initResult.isSuccess();
        ArrayList arrayList = this.f3128c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (initResult.isSuccess()) {
                bVar.f3129a.onInitializationSucceeded();
            } else {
                bVar.f3129a.onInitializationFailed(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
            }
        }
        arrayList.clear();
    }
}
