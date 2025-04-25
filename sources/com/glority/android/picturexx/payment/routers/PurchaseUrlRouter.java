package com.glority.android.picturexx.payment.routers;

import com.glority.base.routers.UrlRouter;
import kotlin.Metadata;

/* compiled from: PurchaseUrlRouter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/payment/routers/PurchaseUrlRouter;", "", "<init>", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_PURCHASE_DIALOG", "getURL_PURCHASE_DIALOG", "URL_PAGETYPE_CONVERT", "getURL_PAGETYPE_CONVERT", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class PurchaseUrlRouter {
    public static final PurchaseUrlRouter INSTANCE = new PurchaseUrlRouter();
    private static final String MODULE = "picture-xx/purchase/router";
    private static final String URL_PURCHASE_DIALOG = UrlRouter.INSTANCE.getMODULE() + "/purchasedialog";
    private static final String URL_PAGETYPE_CONVERT = UrlRouter.INSTANCE.getMODULE() + "/pagetypeconvert";

    private PurchaseUrlRouter() {
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_PURCHASE_DIALOG() {
        return URL_PURCHASE_DIALOG;
    }

    public final String getURL_PAGETYPE_CONVERT() {
        return URL_PAGETYPE_CONVERT;
    }
}
