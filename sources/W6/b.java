package W6;

import G7.j;
import android.util.Log;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.tools.arruler.ui.component.splash.SplashActivity;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements OnInitializationCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3625a;

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        switch (this.f3625a) {
            case 0:
                int i9 = SplashActivity.l;
                j.e(initializationStatus, "it");
                return;
            default:
                Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
                for (String str : adapterStatusMap.keySet()) {
                    AdapterStatus adapterStatus = adapterStatusMap.get(str);
                    if (adapterStatus != null) {
                        Log.d("MiaStudio", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
                    }
                }
                return;
        }
    }
}
