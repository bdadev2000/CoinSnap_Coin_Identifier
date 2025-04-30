package com.bytedance.sdk.openadsdk.core.QR;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tG;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class ku {
    @NonNull
    public static QR zp(@NonNull View view, @NonNull Set<dT> set) {
        AdSession zp = zp(CreativeType.VIDEO, set, Owner.NATIVE);
        return new YW(zp, AdEvents.createAdEvents(zp), view, MediaEvents.createMediaEvents(zp));
    }

    public static QR zp(WebView webView) {
        Partner zp = COT.zp();
        if (zp != null) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(zp, webView, "", ""));
            return new QR(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession zp(CreativeType creativeType, Set<dT> set, Owner owner) {
        List<VerificationScriptResource> zp = zp(set);
        if (zp.isEmpty()) {
            tG.lMd("verificationScriptResources is empty");
        }
        Partner zp2 = COT.zp();
        if (zp2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(zp2, COT.lMd(), zp, "", ""));
    }

    private static List<VerificationScriptResource> zp(Set<dT> set) {
        ArrayList arrayList = new ArrayList();
        for (dT dTVar : set) {
            if (!TextUtils.isEmpty(dTVar.zp()) && !TextUtils.isEmpty(dTVar.lMd())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(dTVar.zp(), dTVar.KS(), dTVar.lMd()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(dTVar.KS()));
        }
        return arrayList;
    }
}
