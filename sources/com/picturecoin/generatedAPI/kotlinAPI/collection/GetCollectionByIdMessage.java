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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetCollectionByIdMessage.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\n\b\u0086\b\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0&H\u0016J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0&H\u0016J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020\tH\u0016J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020\t03H\u0016¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u00106\u001a\u00020\u0005H\u0016J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J+\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006="}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionByIdMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "collectionId", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "<init>", "(ILcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getCollectionId", "()I", "setCollectionId", "(I)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollection", "()Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "setCollection", "(Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class GetCollectionByIdMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Collection collection;
    private int collectionId;
    private String countryCode;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final GetCollectionByIdMessage copy(int collectionId, LanguageCode languageCode, String countryCode) {
        return new GetCollectionByIdMessage(collectionId, languageCode, countryCode);
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
        return "GetCollectionByIdMessage(collectionId=" + this.collectionId + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ GetCollectionByIdMessage copy$default(GetCollectionByIdMessage getCollectionByIdMessage, int i, LanguageCode languageCode, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getCollectionByIdMessage.collectionId;
        }
        if ((i2 & 2) != 0) {
            languageCode = getCollectionByIdMessage.languageCode;
        }
        if ((i2 & 4) != 0) {
            str = getCollectionByIdMessage.countryCode;
        }
        return getCollectionByIdMessage.copy(i, languageCode, str);
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    public final void setCollectionId(int i) {
        this.collectionId = i;
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public GetCollectionByIdMessage(int i, LanguageCode languageCode, String str) {
        this.collectionId = i;
        this.languageCode = languageCode;
        this.countryCode = str;
    }

    public final Collection getCollection() {
        return this.collection;
    }

    public final void setCollection(Collection collection) {
        this.collection = collection;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("collection") && !obj.isNull("collection")) {
            Object obj2 = obj.get("collection");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            this.collection = new Collection((JSONObject) obj2);
        } else {
            this.collection = null;
        }
        this._response_at = new Date();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("collection_id", Integer.valueOf(this.collectionId));
        LanguageCode languageCode = this.languageCode;
        if (languageCode != null) {
            Intrinsics.checkNotNull(languageCode);
            hashMap.put("language_code", Integer.valueOf(languageCode.getValue()));
        }
        String str = this.countryCode;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("country_code", str);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetCollectionByIdMessage)) {
            return false;
        }
        GetCollectionByIdMessage getCollectionByIdMessage = (GetCollectionByIdMessage) other;
        return this.collectionId == getCollectionByIdMessage.collectionId && this.languageCode == getCollectionByIdMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionByIdMessage.countryCode);
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
        if (other == null || !(other instanceof GetCollectionByIdMessage)) {
            return false;
        }
        GetCollectionByIdMessage getCollectionByIdMessage = (GetCollectionByIdMessage) other;
        return this.collectionId == getCollectionByIdMessage.collectionId && this.languageCode == getCollectionByIdMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionByIdMessage.countryCode) && Intrinsics.areEqual(this.collection, getCollectionByIdMessage.collection);
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Integer.hashCode(this.collectionId)) * 31;
        LanguageCode languageCode = this.languageCode;
        int hashCode2 = (hashCode + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        String str = this.countryCode;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Collection collection = this.collection;
        return hashCode3 + (collection != null ? collection.hashCode() : 0);
    }

    /* compiled from: GetCollectionByIdMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionByIdMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/get_collection_by_id";
        }
    }
}
