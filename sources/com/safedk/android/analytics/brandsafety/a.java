package com.safedk.android.analytics.brandsafety;

import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface a extends AppLovinCommunicatorSubscriber, f, com.safedk.android.internal.a {
    BrandSafetyUtils.AdType a();

    c a(String str, RedirectDetails redirectDetails, m mVar, boolean z2, boolean z3);

    List<CreativeInfo> a(String str, String str2);

    void a(String str);

    boolean a(o oVar);

    boolean a(String str, String str2, String str3);

    boolean a(String str, String str2, boolean z2);

    c b(String str);

    List<CreativeInfo> b(String str, String str2);

    void b(String str, String str2, String str3);

    List<CreativeInfo> c(String str, String str2);

    void c(String str);

    boolean c(String str, String str2, String str3);

    void d(String str, String str2, String str3);
}
