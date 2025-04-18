package com.bytedance.sdk.openadsdk.core.YoT.YFl;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public enum YFl {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int qsH;

    YFl(int i10) {
        this.qsH = i10;
    }

    @NonNull
    public String YFl() {
        return String.valueOf(this.qsH);
    }
}
