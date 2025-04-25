package com.glority.base.config;

import androidx.webkit.ProxyConfig;
import com.glority.android.core.app.AppContext;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: ConfigConstants.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/glority/base/config/ConfigConstants;", "", "<init>", "()V", "QUESTIONNAIRE_LINK", "", "getQUESTIONNAIRE_LINK", "()Ljava/lang/String;", "IS_QUESTIONNAIRE_LINK_VALID", "", "getIS_QUESTIONNAIRE_LINK_VALID", "()Z", "FAQ_JSON_LINK", "getFAQ_JSON_LINK", "ENABLE_FAQ_SETTING_OPTION", "getENABLE_FAQ_SETTING_OPTION", "ENABLE_SEARCH_SPECIES", "getENABLE_SEARCH_SPECIES", "GOOGLE_WEB_CLIENT_ID", "getGOOGLE_WEB_CLIENT_ID", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ConfigConstants {
    public static final int $stable = 0;
    private static final boolean ENABLE_FAQ_SETTING_OPTION;
    private static final boolean ENABLE_SEARCH_SPECIES;
    private static final String FAQ_JSON_LINK;
    private static final String GOOGLE_WEB_CLIENT_ID;
    public static final ConfigConstants INSTANCE = new ConfigConstants();
    private static final boolean IS_QUESTIONNAIRE_LINK_VALID;
    private static final String QUESTIONNAIRE_LINK;

    private ConfigConstants() {
    }

    static {
        String config = AppContext.INSTANCE.getConfig("QUESTIONNAIRE_LINK");
        QUESTIONNAIRE_LINK = config;
        IS_QUESTIONNAIRE_LINK_VALID = config.length() > 0 && StringsKt.startsWith$default(config, ProxyConfig.MATCH_HTTP, false, 2, (Object) null);
        String config2 = AppContext.INSTANCE.getConfig("FAQ_JSON_LINK");
        FAQ_JSON_LINK = config2;
        ENABLE_FAQ_SETTING_OPTION = config2.length() > 0 && StringsKt.startsWith$default(config2, ProxyConfig.MATCH_HTTP, false, 2, (Object) null);
        String config3 = AppContext.INSTANCE.getConfig("SEARCH_HOST");
        ENABLE_SEARCH_SPECIES = config3.length() > 0 && !StringsKt.equals(config3, "null", true);
        GOOGLE_WEB_CLIENT_ID = AppContext.INSTANCE.getConfig("GOOGLE_LOGIN_TOKEN");
    }

    public final String getQUESTIONNAIRE_LINK() {
        return QUESTIONNAIRE_LINK;
    }

    public final boolean getIS_QUESTIONNAIRE_LINK_VALID() {
        return IS_QUESTIONNAIRE_LINK_VALID;
    }

    public final String getFAQ_JSON_LINK() {
        return FAQ_JSON_LINK;
    }

    public final boolean getENABLE_FAQ_SETTING_OPTION() {
        return ENABLE_FAQ_SETTING_OPTION;
    }

    public final boolean getENABLE_SEARCH_SPECIES() {
        return ENABLE_SEARCH_SPECIES;
    }

    public final String getGOOGLE_WEB_CLIENT_ID() {
        return GOOGLE_WEB_CLIENT_ID;
    }
}
