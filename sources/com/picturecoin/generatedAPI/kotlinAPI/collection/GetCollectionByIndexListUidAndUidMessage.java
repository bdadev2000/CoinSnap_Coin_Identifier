package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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

/* compiled from: GetCollectionByIndexListUidAndUidMessage.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020(0'H\u0016J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0'H\u0016J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020,H\u0016J\b\u00100\u001a\u00020,H\u0016J\b\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016J\u0013\u00103\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0016¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u00107\u001a\u000208H\u0016J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006@"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionByIndexListUidAndUidMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", Args.indexListUid, "", Args.uid, RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getIndexListUid", "()Ljava/lang/String;", "setIndexListUid", "(Ljava/lang/String;)V", "getUid", "setUid", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "setCountryCode", "collections", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollections", "()Ljava/util/List;", "setCollections", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "component4", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class GetCollectionByIndexListUidAndUidMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<Collection> collections;
    private String countryCode;
    private String indexListUid;
    private LanguageCode languageCode;
    private String uid;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final String getIndexListUid() {
        return this.indexListUid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final GetCollectionByIndexListUidAndUidMessage copy(String indexListUid, String uid, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        return new GetCollectionByIndexListUidAndUidMessage(indexListUid, uid, languageCode, countryCode);
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
        return "GetCollectionByIndexListUidAndUidMessage(indexListUid=" + this.indexListUid + ", uid=" + this.uid + ", languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ")";
    }

    public static /* synthetic */ GetCollectionByIndexListUidAndUidMessage copy$default(GetCollectionByIndexListUidAndUidMessage getCollectionByIndexListUidAndUidMessage, String str, String str2, LanguageCode languageCode, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCollectionByIndexListUidAndUidMessage.indexListUid;
        }
        if ((i & 2) != 0) {
            str2 = getCollectionByIndexListUidAndUidMessage.uid;
        }
        if ((i & 4) != 0) {
            languageCode = getCollectionByIndexListUidAndUidMessage.languageCode;
        }
        if ((i & 8) != 0) {
            str3 = getCollectionByIndexListUidAndUidMessage.countryCode;
        }
        return getCollectionByIndexListUidAndUidMessage.copy(str, str2, languageCode, str3);
    }

    public final String getIndexListUid() {
        return this.indexListUid;
    }

    public final void setIndexListUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indexListUid = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
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

    public GetCollectionByIndexListUidAndUidMessage(String indexListUid, String uid, LanguageCode languageCode, String str) {
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.indexListUid = indexListUid;
        this.uid = uid;
        this.languageCode = languageCode;
        this.countryCode = str;
    }

    public final List<Collection> getCollections() {
        return this.collections;
    }

    public final void setCollections(List<Collection> list) {
        this.collections = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("collections") && !obj.isNull("collections")) {
            JSONArray jSONArray = obj.getJSONArray("collections");
            this.collections = new ArrayList();
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
                    List<Collection> list = this.collections;
                    Intrinsics.checkNotNull(list);
                    list.add(collection);
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            this.collections = null;
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
        hashMap.put("index_list_uid", this.indexListUid);
        hashMap.put(Args.uid, this.uid);
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
        if (other == null || !(other instanceof GetCollectionByIndexListUidAndUidMessage)) {
            return false;
        }
        GetCollectionByIndexListUidAndUidMessage getCollectionByIndexListUidAndUidMessage = (GetCollectionByIndexListUidAndUidMessage) other;
        return Intrinsics.areEqual(this.indexListUid, getCollectionByIndexListUidAndUidMessage.indexListUid) && Intrinsics.areEqual(this.uid, getCollectionByIndexListUidAndUidMessage.uid) && this.languageCode == getCollectionByIndexListUidAndUidMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionByIndexListUidAndUidMessage.countryCode);
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
        if (other == null || !(other instanceof GetCollectionByIndexListUidAndUidMessage)) {
            return false;
        }
        GetCollectionByIndexListUidAndUidMessage getCollectionByIndexListUidAndUidMessage = (GetCollectionByIndexListUidAndUidMessage) other;
        return Intrinsics.areEqual(this.indexListUid, getCollectionByIndexListUidAndUidMessage.indexListUid) && Intrinsics.areEqual(this.uid, getCollectionByIndexListUidAndUidMessage.uid) && this.languageCode == getCollectionByIndexListUidAndUidMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionByIndexListUidAndUidMessage.countryCode) && Intrinsics.areEqual(this.collections, getCollectionByIndexListUidAndUidMessage.collections);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + this.indexListUid.hashCode()) * 31) + this.uid.hashCode()) * 31;
        LanguageCode languageCode = this.languageCode;
        int hashCode2 = (hashCode + (languageCode != null ? languageCode.hashCode() : 0)) * 31;
        String str = this.countryCode;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List<Collection> list = this.collections;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* compiled from: GetCollectionByIndexListUidAndUidMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionByIndexListUidAndUidMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/get_collection_by_index_list_uid_and_uid";
        }
    }
}
