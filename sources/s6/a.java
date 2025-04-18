package s6;

import com.facebook.ads.AudienceNetworkAds;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f24242d;
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24243b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24244c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.a = false;
        this.f24243b = initResult.isSuccess();
        ArrayList arrayList = this.f24244c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (initResult.isSuccess()) {
                bVar.a.onInitializationSucceeded();
            } else {
                bVar.a.onInitializationFailed(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
            }
        }
        arrayList.clear();
    }
}
