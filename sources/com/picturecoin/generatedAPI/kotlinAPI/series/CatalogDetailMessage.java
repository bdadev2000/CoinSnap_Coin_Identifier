package com.picturecoin.generatedAPI.kotlinAPI.series;

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

/* compiled from: CatalogDetailMessage.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0016J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.0-H\u0016J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002000-H\u0016J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010.H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u000202H\u0016J\b\u00106\u001a\u000202H\u0016J\b\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070:H\u0016¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\u001d\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010B\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006D"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "catalogUid", "", "<init>", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;Ljava/lang/String;)V", "getLanguageCode", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "setLanguageCode", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;)V", "getCatalogUid", "()Ljava/lang/String;", "setCatalogUid", "(Ljava/lang/String;)V", "detail", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "getDetail", "()Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;", "setDetail", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogInfo;)V", "circulationList", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCoin;", "getCirculationList", "()Ljava/util/List;", "setCirculationList", "(Ljava/util/List;)V", "commemorotiveList", "getCommemorotiveList", "setCommemorotiveList", "collectorList", "getCollectorList", "setCollectorList", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class CatalogDetailMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String catalogUid;
    public List<CatalogCoin> circulationList;
    public List<CatalogCoin> collectorList;
    public List<CatalogCoin> commemorotiveList;
    public CatalogInfo detail;
    private LanguageCode languageCode;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCatalogUid() {
        return this.catalogUid;
    }

    public final CatalogDetailMessage copy(LanguageCode languageCode, String catalogUid) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(catalogUid, "catalogUid");
        return new CatalogDetailMessage(languageCode, catalogUid);
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
        return "CatalogDetailMessage(languageCode=" + this.languageCode + ", catalogUid=" + this.catalogUid + ")";
    }

    public static /* synthetic */ CatalogDetailMessage copy$default(CatalogDetailMessage catalogDetailMessage, LanguageCode languageCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            languageCode = catalogDetailMessage.languageCode;
        }
        if ((i & 2) != 0) {
            str = catalogDetailMessage.catalogUid;
        }
        return catalogDetailMessage.copy(languageCode, str);
    }

    public final LanguageCode getLanguageCode() {
        return this.languageCode;
    }

    public final void setLanguageCode(LanguageCode languageCode) {
        Intrinsics.checkNotNullParameter(languageCode, "<set-?>");
        this.languageCode = languageCode;
    }

    public final String getCatalogUid() {
        return this.catalogUid;
    }

    public final void setCatalogUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.catalogUid = str;
    }

    public CatalogDetailMessage(LanguageCode languageCode, String catalogUid) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(catalogUid, "catalogUid");
        this.languageCode = languageCode;
        this.catalogUid = catalogUid;
    }

    public final CatalogInfo getDetail() {
        CatalogInfo catalogInfo = this.detail;
        if (catalogInfo != null) {
            return catalogInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("detail");
        return null;
    }

    public final void setDetail(CatalogInfo catalogInfo) {
        Intrinsics.checkNotNullParameter(catalogInfo, "<set-?>");
        this.detail = catalogInfo;
    }

    public final List<CatalogCoin> getCirculationList() {
        List<CatalogCoin> list = this.circulationList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("circulationList");
        return null;
    }

    public final void setCirculationList(List<CatalogCoin> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.circulationList = list;
    }

    public final List<CatalogCoin> getCommemorotiveList() {
        List<CatalogCoin> list = this.commemorotiveList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commemorotiveList");
        return null;
    }

    public final void setCommemorotiveList(List<CatalogCoin> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.commemorotiveList = list;
    }

    public final List<CatalogCoin> getCollectorList() {
        List<CatalogCoin> list = this.collectorList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collectorList");
        return null;
    }

    public final void setCollectorList(List<CatalogCoin> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.collectorList = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("detail") && !obj.isNull("detail")) {
            Object obj2 = obj.get("detail");
            if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                obj2 = new JSONObject();
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            setDetail(new CatalogInfo((JSONObject) obj2));
            if (obj.has("circulation_list") && !obj.isNull("circulation_list")) {
                JSONArray jSONArray = obj.getJSONArray("circulation_list");
                setCirculationList(new ArrayList());
                int length = jSONArray.length() - 1;
                int i = 0;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = jSONArray.get(i2);
                        if ((obj3 instanceof JSONArray) && ((JSONArray) obj3).length() == 0) {
                            obj3 = new JSONObject();
                        }
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                        CatalogCoin catalogCoin = new CatalogCoin((JSONObject) obj3);
                        List<CatalogCoin> circulationList = getCirculationList();
                        Intrinsics.checkNotNull(circulationList);
                        circulationList.add(catalogCoin);
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (obj.has("commemorotive_list") && !obj.isNull("commemorotive_list")) {
                    JSONArray jSONArray2 = obj.getJSONArray("commemorotive_list");
                    setCommemorotiveList(new ArrayList());
                    int length2 = jSONArray2.length() - 1;
                    if (length2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            Object obj4 = jSONArray2.get(i3);
                            if ((obj4 instanceof JSONArray) && ((JSONArray) obj4).length() == 0) {
                                obj4 = new JSONObject();
                            }
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                            CatalogCoin catalogCoin2 = new CatalogCoin((JSONObject) obj4);
                            List<CatalogCoin> commemorotiveList = getCommemorotiveList();
                            Intrinsics.checkNotNull(commemorotiveList);
                            commemorotiveList.add(catalogCoin2);
                            if (i3 == length2) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (obj.has("collector_list") && !obj.isNull("collector_list")) {
                        JSONArray jSONArray3 = obj.getJSONArray("collector_list");
                        setCollectorList(new ArrayList());
                        int length3 = jSONArray3.length() - 1;
                        if (length3 >= 0) {
                            while (true) {
                                Object obj5 = jSONArray3.get(i);
                                if ((obj5 instanceof JSONArray) && ((JSONArray) obj5).length() == 0) {
                                    obj5 = new JSONObject();
                                }
                                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                                CatalogCoin catalogCoin3 = new CatalogCoin((JSONObject) obj5);
                                List<CatalogCoin> collectorList = getCollectorList();
                                Intrinsics.checkNotNull(collectorList);
                                collectorList.add(catalogCoin3);
                                if (i == length3) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        this._response_at = new Date();
                        return;
                    }
                    throw new ParameterCheckFailException("collector_list is missing in api CatalogDetail");
                }
                throw new ParameterCheckFailException("commemorotive_list is missing in api CatalogDetail");
            }
            throw new ParameterCheckFailException("circulation_list is missing in api CatalogDetail");
        }
        throw new ParameterCheckFailException("detail is missing in api CatalogDetail");
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
        hashMap.put("catalog_uid", this.catalogUid);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof CatalogDetailMessage)) {
            return false;
        }
        CatalogDetailMessage catalogDetailMessage = (CatalogDetailMessage) other;
        return this.languageCode == catalogDetailMessage.languageCode && Intrinsics.areEqual(this.catalogUid, catalogDetailMessage.catalogUid);
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
        if (other == null || !(other instanceof CatalogDetailMessage)) {
            return false;
        }
        CatalogDetailMessage catalogDetailMessage = (CatalogDetailMessage) other;
        return this.languageCode == catalogDetailMessage.languageCode && Intrinsics.areEqual(this.catalogUid, catalogDetailMessage.catalogUid) && Intrinsics.areEqual(getDetail(), catalogDetailMessage.getDetail()) && Intrinsics.areEqual(getCirculationList(), catalogDetailMessage.getCirculationList()) && Intrinsics.areEqual(getCommemorotiveList(), catalogDetailMessage.getCommemorotiveList()) && Intrinsics.areEqual(getCollectorList(), catalogDetailMessage.getCollectorList());
    }

    public int hashCode() {
        return (((((((((((getClass().hashCode() * 31) + this.languageCode.hashCode()) * 31) + this.catalogUid.hashCode()) * 31) + getDetail().hashCode()) * 31) + getCirculationList().hashCode()) * 31) + getCommemorotiveList().hashCode()) * 31) + getCollectorList().hashCode();
    }

    /* compiled from: CatalogDetailMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/series/catalog_detail";
        }
    }
}
