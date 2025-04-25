package com.glority.android.core.route.share;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlShare.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/core/route/share/UrlShare;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_SHARE_INTERNATIONAL", "getURL_SHARE_INTERNATIONAL", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlShare {
    public static final UrlShare INSTANCE = new UrlShare();
    private static final String MODULE;
    private static final String URL_SHARE_INTERNATIONAL;

    private UrlShare() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "com.apps.share");
        MODULE = stringPlus;
        URL_SHARE_INTERNATIONAL = Intrinsics.stringPlus(stringPlus, "/share_international");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_SHARE_INTERNATIONAL() {
        return URL_SHARE_INTERNATIONAL;
    }
}
