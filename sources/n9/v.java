package n9;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes3.dex */
public final class v extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z10;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        w wVar = this.a;
        if (z10) {
            i10 = 10;
        }
        w.a(i10, wVar);
    }
}
