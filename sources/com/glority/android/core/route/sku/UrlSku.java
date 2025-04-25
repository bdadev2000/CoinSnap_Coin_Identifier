package com.glority.android.core.route.sku;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlSku.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/sku/UrlSku;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_SKU_GET_TEST_TYPE", "getURL_SKU_GET_TEST_TYPE", "setURL_SKU_GET_TEST_TYPE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlSku {
    public static final UrlSku INSTANCE = new UrlSku();
    private static String MODULE;
    private static String URL_SKU_GET_TEST_TYPE;

    private UrlSku() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), LogEventArguments.ARG_SKU);
        MODULE = stringPlus;
        URL_SKU_GET_TEST_TYPE = Intrinsics.stringPlus(stringPlus, "/get_test_type");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_SKU_GET_TEST_TYPE() {
        return URL_SKU_GET_TEST_TYPE;
    }

    public final void setURL_SKU_GET_TEST_TYPE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_SKU_GET_TEST_TYPE = str;
    }
}
