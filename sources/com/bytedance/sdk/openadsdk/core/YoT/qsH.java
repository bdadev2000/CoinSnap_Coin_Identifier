package com.bytedance.sdk.openadsdk.core.YoT;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.YoT;
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
public class qsH {
    @NonNull
    public static DSW YFl(@NonNull View view, @NonNull Set<nc> set) {
        AdSession YFl = YFl(CreativeType.VIDEO, set, Owner.NATIVE);
        return new NjR(YFl, AdEvents.createAdEvents(YFl), view, MediaEvents.createMediaEvents(YFl));
    }

    public static DSW YFl(WebView webView) {
        Partner YFl = wN.YFl();
        if (YFl != null) {
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(YFl, webView, "", ""));
            return new DSW(createAdSession, AdEvents.createAdEvents(createAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession YFl(CreativeType creativeType, Set<nc> set, Owner owner) {
        List<VerificationScriptResource> YFl = YFl(set);
        if (YFl.isEmpty()) {
            YoT.Sg("verificationScriptResources is empty");
        }
        Partner YFl2 = wN.YFl();
        if (YFl2 == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(YFl2, wN.Sg(), YFl, "", ""));
    }

    private static List<VerificationScriptResource> YFl(Set<nc> set) {
        ArrayList arrayList = new ArrayList();
        for (nc ncVar : set) {
            if (!TextUtils.isEmpty(ncVar.YFl()) && !TextUtils.isEmpty(ncVar.Sg())) {
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(ncVar.YFl(), ncVar.tN(), ncVar.Sg()));
            }
            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(ncVar.tN()));
        }
        return arrayList;
    }
}
