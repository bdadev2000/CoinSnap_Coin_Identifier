package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetItemDetailMessage.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0&H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0&H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020\tH\u0016J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020\t03H\u0016¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\t\u00108\u001a\u00020\u0005HÄ\u0003J\t\u00109\u001a\u00020\u0007HÄ\u0003J\t\u0010:\u001a\u00020\tHÄ\u0003J'\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010<\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006>"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/GetItemDetailMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemId", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(JLcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getItemId", "()J", "setItemId", "(J)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "item", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "getItem", "()Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "setItem", "(Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class GetItemDetailMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String countryCode;
    public ItemDetail item;
    private long itemId;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getCountryCode() {
        return this.countryCode;
    }

    public final GetItemDetailMessage copy(long itemId, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetItemDetailMessage(itemId, languageCode, countryCode);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return true;
    }

    public String toString() {
        return "GetItemDetailMessage(itemId=" + this.itemId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ GetItemDetailMessage copy$default(GetItemDetailMessage getItemDetailMessage, long j, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getItemDetailMessage.itemId;
        }
        if ((i & 2) != 0) {
            languageCode = getItemDetailMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str = getItemDetailMessage.countryCode;
        }
        return getItemDetailMessage.copy(j, languageCode, str);
    }

    protected final long getItemId() {
        return this.itemId;
    }

    protected final void setItemId(long j) {
        this.itemId = j;
    }

    protected final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    protected final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    protected final String getCountryCode() {
        return this.countryCode;
    }

    protected final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public GetItemDetailMessage(long j, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.itemId = j;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final ItemDetail getItem() {
        ItemDetail itemDetail = this.item;
        if (itemDetail != null) {
            return itemDetail;
        }
        Intrinsics.throwUninitializedPropertyAccessException("item");
        return null;
    }

    public final void setItem(ItemDetail itemDetail) {
        Intrinsics.checkNotNullParameter(itemDetail, "<set-?>");
        this.item = itemDetail;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("item") && !obj.isNull("item")) {
            Object obj2 = obj.get("item");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setItem(new ItemDetail((JSONObject) obj2));
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("item is missing in api GetItemDetail");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.Param.ITEM_ID, Long.valueOf(this.itemId));
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetItemDetailMessage)) {
            return false;
        }
        GetItemDetailMessage getItemDetailMessage = (GetItemDetailMessage) other;
        return this.itemId == getItemDetailMessage.itemId && this.languageCode == getItemDetailMessage.languageCode && Intrinsics.areEqual(this.countryCode, getItemDetailMessage.countryCode);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{LogEvents.exportemptyalert_close_click_type_get};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetItemDetailMessage)) {
            return false;
        }
        GetItemDetailMessage getItemDetailMessage = (GetItemDetailMessage) other;
        return this.itemId == getItemDetailMessage.itemId && this.languageCode == getItemDetailMessage.languageCode && Intrinsics.areEqual(this.countryCode, getItemDetailMessage.countryCode) && Intrinsics.areEqual(getItem(), getItemDetailMessage.getItem());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + Long.hashCode(this.itemId)) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getItem().hashCode();
    }

    /* compiled from: GetItemDetailMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/GetItemDetailMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/get_item_detail";
        }
    }
}
