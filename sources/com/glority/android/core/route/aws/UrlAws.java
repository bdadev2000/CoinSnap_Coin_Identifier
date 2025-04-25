package com.glority.android.core.route.aws;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlAws.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/glority/android/core/route/aws/UrlAws;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_GET_LOCATION", "getURL_GET_LOCATION", "setURL_GET_LOCATION", "URL_GET_USER_ID", "getURL_GET_USER_ID", "setURL_GET_USER_ID", "URL_IS_CAN_RUN", "getURL_IS_CAN_RUN", "setURL_IS_CAN_RUN", "URL_UPDATE_ITEM_DISEASE_IMAGE", "getURL_UPDATE_ITEM_DISEASE_IMAGE", "setURL_UPDATE_ITEM_DISEASE_IMAGE", "URL_UPDATE_ITEM_HIGH_QUALITY", "getURL_UPDATE_ITEM_HIGH_QUALITY", "setURL_UPDATE_ITEM_HIGH_QUALITY", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlAws {
    public static final UrlAws INSTANCE = new UrlAws();
    private static String MODULE;
    private static String URL_GET_LOCATION;
    private static String URL_GET_USER_ID;
    private static String URL_IS_CAN_RUN;
    private static String URL_UPDATE_ITEM_DISEASE_IMAGE;
    private static String URL_UPDATE_ITEM_HIGH_QUALITY;

    private UrlAws() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "aws");
        MODULE = stringPlus;
        URL_UPDATE_ITEM_DISEASE_IMAGE = Intrinsics.stringPlus(stringPlus, "/UpdateItemDiseaseImage");
        URL_UPDATE_ITEM_HIGH_QUALITY = Intrinsics.stringPlus(MODULE, "/UpdateItemHighQuality");
        URL_GET_LOCATION = Intrinsics.stringPlus(MODULE, "/GetLocation");
        URL_GET_USER_ID = Intrinsics.stringPlus(MODULE, "/GetUserId");
        URL_IS_CAN_RUN = Intrinsics.stringPlus(MODULE, "/IsCanRun");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_UPDATE_ITEM_DISEASE_IMAGE() {
        return URL_UPDATE_ITEM_DISEASE_IMAGE;
    }

    public final void setURL_UPDATE_ITEM_DISEASE_IMAGE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_UPDATE_ITEM_DISEASE_IMAGE = str;
    }

    public final String getURL_UPDATE_ITEM_HIGH_QUALITY() {
        return URL_UPDATE_ITEM_HIGH_QUALITY;
    }

    public final void setURL_UPDATE_ITEM_HIGH_QUALITY(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_UPDATE_ITEM_HIGH_QUALITY = str;
    }

    public final String getURL_GET_LOCATION() {
        return URL_GET_LOCATION;
    }

    public final void setURL_GET_LOCATION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_LOCATION = str;
    }

    public final String getURL_GET_USER_ID() {
        return URL_GET_USER_ID;
    }

    public final void setURL_GET_USER_ID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_GET_USER_ID = str;
    }

    public final String getURL_IS_CAN_RUN() {
        return URL_IS_CAN_RUN;
    }

    public final void setURL_IS_CAN_RUN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_IS_CAN_RUN = str;
    }
}
