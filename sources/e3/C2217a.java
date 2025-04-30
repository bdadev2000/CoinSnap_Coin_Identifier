package e3;

import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.C2073d;
import d3.AbstractC2171b;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2217a extends AbstractC2171b {
    @Override // d3.AbstractC2171b
    public final String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        G7.j.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        G7.j.d(bidResponse, "mediationAppOpenAdConfiguration.bidResponse");
        return bidResponse;
    }

    @Override // d3.AbstractC2171b
    public final void b(C2073d c2073d, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        G7.j.e(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        G7.j.d(watermark, "mediationAppOpenAdConfiguration.watermark");
        if (watermark.length() > 0) {
            c2073d.setWatermark(watermark);
        }
    }
}
