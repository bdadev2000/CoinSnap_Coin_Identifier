package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetCollectionsByIdsMessage.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\n\b\u0086\b\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020&0%H\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020(0%H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010&H\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00020\n02H\u0016¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u00105\u001a\u00020\u0006H\u0016J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J-\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006<"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsByIdsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "collectionIds", "", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getCollectionIds", "()Ljava/util/List;", "setCollectionIds", "(Ljava/util/List;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "collections", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollections", "setCollections", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class GetCollectionsByIdsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<Integer> collectionIds;
    public List<Collection> collections;
    private String countryCode;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    public final List<Integer> component1() {
        return this.collectionIds;
    }

    /* renamed from: component2, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final GetCollectionsByIdsMessage copy(List<Integer> collectionIds, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetCollectionsByIdsMessage(collectionIds, languageCode, countryCode);
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
        return "GetCollectionsByIdsMessage(collectionIds=" + this.collectionIds + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCollectionsByIdsMessage copy$default(GetCollectionsByIdsMessage getCollectionsByIdsMessage, List list, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCollectionsByIdsMessage.collectionIds;
        }
        if ((i & 2) != 0) {
            languageCode = getCollectionsByIdsMessage.languageCode;
        }
        if ((i & 4) != 0) {
            str = getCollectionsByIdsMessage.countryCode;
        }
        return getCollectionsByIdsMessage.copy(list, languageCode, str);
    }

    public final List<Integer> getCollectionIds() {
        return this.collectionIds;
    }

    public final void setCollectionIds(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.collectionIds = list;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public GetCollectionsByIdsMessage(List<Integer> collectionIds, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.collectionIds = collectionIds;
        this.languageCode = languageCode;
        this.countryCode = countryCode;
    }

    public final List<Collection> getCollections() {
        List<Collection> list = this.collections;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collections");
        return null;
    }

    public final void setCollections(List<Collection> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.collections = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("collections") && !obj.isNull("collections")) {
            JSONArray jSONArray = obj.getJSONArray("collections");
            setCollections(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    Collection collection = new Collection((JSONObject) obj2);
                    List<Collection> collections = getCollections();
                    Intrinsics.checkNotNull(collections);
                    collections.add(collection);
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("collections is missing in api GetCollectionsByIds");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("collection_ids", this.collectionIds);
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
        if (other == null || !(other instanceof GetCollectionsByIdsMessage)) {
            return false;
        }
        GetCollectionsByIdsMessage getCollectionsByIdsMessage = (GetCollectionsByIdsMessage) other;
        return Intrinsics.areEqual(this.collectionIds, getCollectionsByIdsMessage.collectionIds) && this.languageCode == getCollectionsByIdsMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionsByIdsMessage.countryCode);
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
        if (other == null || !(other instanceof GetCollectionsByIdsMessage)) {
            return false;
        }
        GetCollectionsByIdsMessage getCollectionsByIdsMessage = (GetCollectionsByIdsMessage) other;
        return Intrinsics.areEqual(this.collectionIds, getCollectionsByIdsMessage.collectionIds) && this.languageCode == getCollectionsByIdsMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionsByIdsMessage.countryCode) && Intrinsics.areEqual(getCollections(), getCollectionsByIdsMessage.getCollections());
    }

    public int hashCode() {
        return (((((((getClass().hashCode() * 31) + this.collectionIds.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + getCollections().hashCode();
    }

    /* compiled from: GetCollectionsByIdsMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionsByIdsMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/get_collections_by_ids";
        }
    }
}
