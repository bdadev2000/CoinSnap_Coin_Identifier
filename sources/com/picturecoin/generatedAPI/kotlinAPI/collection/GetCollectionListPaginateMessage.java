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

/* compiled from: GetCollectionListPaginateMessage.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\f\b\u0086\b\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,0+H\u0016J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0+H\u0016J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010,H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0016J\b\u00105\u001a\u000200H\u0016J\b\u00106\u001a\u000200H\u0016J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0016¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010;\u001a\u00020\tH\u0016J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J:\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010AJ\t\u0010B\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006D"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionListPaginateMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "pageSize", "", "lastId", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCountryCode", "()Ljava/lang/String;", "setCountryCode", "(Ljava/lang/String;)V", "getPageSize", "()Ljava/lang/Integer;", "setPageSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLastId", "setLastId", "collections", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "getCollections", "()Ljava/util/List;", "setCollections", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "component2", "component3", "component4", "copy", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionListPaginateMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class GetCollectionListPaginateMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<Collection> collections;
    private String countryCode;
    private LanguageCode languageCode;
    private Integer lastId;
    private Integer pageSize;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLastId() {
        return this.lastId;
    }

    public final GetCollectionListPaginateMessage copy(LanguageCode languageCode, String countryCode, Integer pageSize, Integer lastId) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GetCollectionListPaginateMessage(languageCode, countryCode, pageSize, lastId);
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
        return "GetCollectionListPaginateMessage(languageCode=" + this.languageCode + ", countryCode=" + this.countryCode + ", pageSize=" + this.pageSize + ", lastId=" + this.lastId + ")";
    }

    public static /* synthetic */ GetCollectionListPaginateMessage copy$default(GetCollectionListPaginateMessage getCollectionListPaginateMessage, LanguageCode languageCode, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = getCollectionListPaginateMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = getCollectionListPaginateMessage.countryCode;
        }
        if ((i & 4) != 0) {
            num = getCollectionListPaginateMessage.pageSize;
        }
        if ((i & 8) != 0) {
            num2 = getCollectionListPaginateMessage.lastId;
        }
        return getCollectionListPaginateMessage.copy(languageCode, str, num, num2);
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

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final void setPageSize(Integer num) {
        this.pageSize = num;
    }

    public final Integer getLastId() {
        return this.lastId;
    }

    public final void setLastId(Integer num) {
        this.lastId = num;
    }

    public GetCollectionListPaginateMessage(LanguageCode languageCode, String countryCode, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.languageCode = languageCode;
        this.countryCode = countryCode;
        this.pageSize = num;
        this.lastId = num2;
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
        throw new ParameterCheckFailException("collections is missing in api GetCollectionListPaginate");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("language_code", Integer.valueOf(this.languageCode.getValue()));
        hashMap.put("country_code", this.countryCode);
        Integer num = this.pageSize;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            hashMap.put("page_size", num);
        }
        Integer num2 = this.lastId;
        if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            hashMap.put("last_id", num2);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetCollectionListPaginateMessage)) {
            return false;
        }
        GetCollectionListPaginateMessage getCollectionListPaginateMessage = (GetCollectionListPaginateMessage) other;
        return this.languageCode == getCollectionListPaginateMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionListPaginateMessage.countryCode) && Intrinsics.areEqual(this.pageSize, getCollectionListPaginateMessage.pageSize) && Intrinsics.areEqual(this.lastId, getCollectionListPaginateMessage.lastId);
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
        if (other == null || !(other instanceof GetCollectionListPaginateMessage)) {
            return false;
        }
        GetCollectionListPaginateMessage getCollectionListPaginateMessage = (GetCollectionListPaginateMessage) other;
        return this.languageCode == getCollectionListPaginateMessage.languageCode && Intrinsics.areEqual(this.countryCode, getCollectionListPaginateMessage.countryCode) && Intrinsics.areEqual(this.pageSize, getCollectionListPaginateMessage.pageSize) && Intrinsics.areEqual(this.lastId, getCollectionListPaginateMessage.lastId) && Intrinsics.areEqual(getCollections(), getCollectionListPaginateMessage.getCollections());
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        Integer num = this.pageSize;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.lastId;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + getCollections().hashCode();
    }

    /* compiled from: GetCollectionListPaginateMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionListPaginateMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/get_collection_list_paginate";
        }
    }
}
