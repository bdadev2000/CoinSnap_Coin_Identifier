package com.glority.abtesting.generatedAPI.kotlinAPI.config;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
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

/* compiled from: GetAbtestingDefinitionsMessage.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B#\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J+\u0010\u001e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010!\u001a\u00020\u001bH\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\u0005H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060(H\u0016¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\u0012\u0010,\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0016J\t\u0010-\u001a\u00020\u0006HÖ\u0001J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00066"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "tags", "", "", "", "productId", "(Ljava/util/Map;Ljava/lang/String;)V", "abtestingGroups", "", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/AbtestingGroup;", "getAbtestingGroups", "()Ljava/util/List;", "setAbtestingGroups", "(Ljava/util/List;)V", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "getTags", "()Ljava/util/Map;", "setTags", "(Ljava/util/Map;)V", AbtestLogEvent.ARG_API_NAME, "binaryResponse", "", "component1", "component2", "copy", "equals", "other", "forceHttps", "getFiles", "Ljava/io/File;", "getParams", "hashCode", "", "methods", "", "()[Ljava/lang/String;", "mustAuth", "needAuth", "requestEquals", "toString", "updateWithBinary", "", "response", "", "updateWithJson", "obj", "Lorg/json/JSONObject;", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class GetAbtestingDefinitionsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<AbtestingGroup> abtestingGroups;
    private String productId;
    private Map<String, ? extends Object> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAbtestingDefinitionsMessage copy$default(GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = getAbtestingDefinitionsMessage.tags;
        }
        if ((i & 2) != 0) {
            str = getAbtestingDefinitionsMessage.productId;
        }
        return getAbtestingDefinitionsMessage.copy(map, str);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    public final Map<String, Object> component1() {
        return this.tags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final GetAbtestingDefinitionsMessage copy(Map<String, ? extends Object> tags, String productId) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new GetAbtestingDefinitionsMessage(tags, productId);
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean forceHttps() {
        return true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean mustAuth() {
        return false;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean needAuth() {
        return false;
    }

    public String toString() {
        return "GetAbtestingDefinitionsMessage(tags=" + this.tags + ", productId=" + this.productId + ")";
    }

    public final Map<String, Object> getTags() {
        return this.tags;
    }

    public final void setTags(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tags = map;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    public GetAbtestingDefinitionsMessage(Map<String, ? extends Object> tags, String productId) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.tags = tags;
        this.productId = productId;
    }

    public final List<AbtestingGroup> getAbtestingGroups() {
        List<AbtestingGroup> list = this.abtestingGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingGroups");
        }
        return list;
    }

    public final void setAbtestingGroups(List<AbtestingGroup> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abtestingGroups = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("abtestingGroups") && !obj.isNull("abtestingGroups")) {
            JSONArray jSONArray = obj.getJSONArray("abtestingGroups");
            this.abtestingGroups = new ArrayList();
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    if (obj2 != null) {
                        AbtestingGroup abtestingGroup = new AbtestingGroup((JSONObject) obj2);
                        List<AbtestingGroup> list = this.abtestingGroups;
                        if (list == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("abtestingGroups");
                        }
                        Intrinsics.checkNotNull(list);
                        list.add(abtestingGroup);
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
            }
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("abtestingGroups is missing in api GetAbtestingDefinitions");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("tags", this.tags);
        hashMap.put("productId", this.productId);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof GetAbtestingDefinitionsMessage)) {
            return false;
        }
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = (GetAbtestingDefinitionsMessage) other;
        return ((Intrinsics.areEqual(this.tags, getAbtestingDefinitionsMessage.tags) ^ true) || (Intrinsics.areEqual(this.productId, getAbtestingDefinitionsMessage.productId) ^ true)) ? false : true;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String api() {
        return INSTANCE.getApi();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public String[] methods() {
        return new String[]{"post"};
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof GetAbtestingDefinitionsMessage)) {
            return false;
        }
        GetAbtestingDefinitionsMessage getAbtestingDefinitionsMessage = (GetAbtestingDefinitionsMessage) other;
        if ((!Intrinsics.areEqual(this.tags, getAbtestingDefinitionsMessage.tags)) || (!Intrinsics.areEqual(this.productId, getAbtestingDefinitionsMessage.productId))) {
            return false;
        }
        List<AbtestingGroup> list = this.abtestingGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingGroups");
        }
        List<AbtestingGroup> list2 = getAbtestingDefinitionsMessage.abtestingGroups;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingGroups");
        }
        return !(Intrinsics.areEqual(list, list2) ^ true);
    }

    public int hashCode() {
        int hashCode = ((((getClass().hashCode() * 31) + this.tags.hashCode()) * 31) + this.productId.hashCode()) * 31;
        List<AbtestingGroup> list = this.abtestingGroups;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("abtestingGroups");
        }
        return hashCode + list.hashCode();
    }

    /* compiled from: GetAbtestingDefinitionsMessage.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage$Companion;", "", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getApi() {
            return "v6/config/get_abtesting_definitions";
        }
    }
}
