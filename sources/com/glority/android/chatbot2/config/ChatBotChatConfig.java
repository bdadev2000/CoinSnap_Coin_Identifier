package com.glority.android.chatbot2.config;

import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatBotChatConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010!R\u001c\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010!¨\u0006/"}, d2 = {"Lcom/glority/android/chatbot2/config/ChatBotChatConfig;", "", "from", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "(Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "enableMemoryCache", "", "getEnableMemoryCache", "()Z", "setEnableMemoryCache", "(Z)V", Args.extraFields, "", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "getFrom", "itemIds", "", "", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", Args.itemType, "getItemType", "setItemType", "(Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", Args.sessionId, "getSessionId", "()J", "setSessionId", "(J)V", Args.sessionType, "getSessionType", "setSessionType", Args.uid, "getUid", "setUid", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatBotChatConfig {
    private final String countryCode;
    private boolean enableMemoryCache;
    private Map<String, ? extends Object> extraFields;
    private final String from;
    private List<Long> itemIds;
    private String itemType;
    private final LanguageCode languageCode;
    private long sessionId;
    private String sessionType;
    private String uid;

    public ChatBotChatConfig(String from, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.from = from;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final String getFrom() {
        return this.from;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final boolean getEnableMemoryCache() {
        return this.enableMemoryCache;
    }

    public final void setEnableMemoryCache(boolean z) {
        this.enableMemoryCache = z;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final String getSessionType() {
        return this.sessionType;
    }

    public final void setSessionType(String str) {
        this.sessionType = str;
    }

    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final void setItemIds(List<Long> list) {
        this.itemIds = list;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final Map<String, Object> getExtraFields() {
        return this.extraFields;
    }

    public final void setExtraFields(Map<String, ? extends Object> map) {
        this.extraFields = map;
    }
}
