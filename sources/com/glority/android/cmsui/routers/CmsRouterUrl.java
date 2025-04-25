package com.glority.android.cmsui.routers;

import kotlin.Metadata;

/* compiled from: CmsRouterUrl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/cmsui/routers/CmsRouterUrl;", "", "()V", "MODULE", "", "URL_GET_DEFAULT_DRAWABLE_IMAGE", "getURL_GET_DEFAULT_DRAWABLE_IMAGE", "()Ljava/lang/String;", "URL_GET_DEFAULT_HEADER_DRAWABLE_IMAGE", "getURL_GET_DEFAULT_HEADER_DRAWABLE_IMAGE", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsRouterUrl {
    private static final String MODULE = "cnglorityscanner://cms";
    public static final CmsRouterUrl INSTANCE = new CmsRouterUrl();
    private static final String URL_GET_DEFAULT_DRAWABLE_IMAGE = "cnglorityscanner://cms/getDefaultDrawableImage";
    private static final String URL_GET_DEFAULT_HEADER_DRAWABLE_IMAGE = "cnglorityscanner://cms/getDefaultHeaderDrawableImage";

    private CmsRouterUrl() {
    }

    public final String getURL_GET_DEFAULT_DRAWABLE_IMAGE() {
        return URL_GET_DEFAULT_DRAWABLE_IMAGE;
    }

    public final String getURL_GET_DEFAULT_HEADER_DRAWABLE_IMAGE() {
        return URL_GET_DEFAULT_HEADER_DRAWABLE_IMAGE;
    }
}
