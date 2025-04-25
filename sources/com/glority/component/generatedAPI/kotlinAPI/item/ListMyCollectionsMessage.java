package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.LogEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* compiled from: ListMyCollectionsMessage.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020#0\u001fH\u0016J\u0012\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010!H\u0016J\b\u0010&\u001a\u00020 H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020 0,H\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00104J\t\u00105\u001a\u00020 HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00067"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ListMyCollectionsMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "returnFirstItemInBatch", "", "signImageUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getReturnFirstItemInBatch", "()Ljava/lang/Boolean;", "setReturnFirstItemInBatch", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSignImageUrl", "setSignImageUrl", FirebaseAnalytics.Param.ITEMS, "", "Lcom/glority/component/generatedAPI/kotlinAPI/item/SimpleItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/glority/component/generatedAPI/kotlinAPI/item/ListMyCollectionsMessage;", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class ListMyCollectionsMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<SimpleItem> items;
    private Boolean returnFirstItemInBatch;
    private Boolean signImageUrl;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getReturnFirstItemInBatch() {
        return this.returnFirstItemInBatch;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getSignImageUrl() {
        return this.signImageUrl;
    }

    public final ListMyCollectionsMessage copy(Boolean returnFirstItemInBatch, Boolean signImageUrl) {
        return new ListMyCollectionsMessage(returnFirstItemInBatch, signImageUrl);
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
        return "ListMyCollectionsMessage(returnFirstItemInBatch=" + this.returnFirstItemInBatch + ", signImageUrl=" + this.signImageUrl + ")";
    }

    public static /* synthetic */ ListMyCollectionsMessage copy$default(ListMyCollectionsMessage listMyCollectionsMessage, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = listMyCollectionsMessage.returnFirstItemInBatch;
        }
        if ((i & 2) != 0) {
            bool2 = listMyCollectionsMessage.signImageUrl;
        }
        return listMyCollectionsMessage.copy(bool, bool2);
    }

    public final Boolean getReturnFirstItemInBatch() {
        return this.returnFirstItemInBatch;
    }

    public final void setReturnFirstItemInBatch(Boolean bool) {
        this.returnFirstItemInBatch = bool;
    }

    public final Boolean getSignImageUrl() {
        return this.signImageUrl;
    }

    public final void setSignImageUrl(Boolean bool) {
        this.signImageUrl = bool;
    }

    public ListMyCollectionsMessage(Boolean bool, Boolean bool2) {
        this.returnFirstItemInBatch = bool;
        this.signImageUrl = bool2;
    }

    public final List<SimpleItem> getItems() {
        List<SimpleItem> list = this.items;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.ITEMS);
        return null;
    }

    public final void setItems(List<SimpleItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(FirebaseAnalytics.Param.ITEMS) && !obj.isNull(FirebaseAnalytics.Param.ITEMS)) {
            JSONArray jSONArray = obj.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            setItems(new ArrayList());
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    Object obj2 = jSONArray.get(i);
                    if ((obj2 instanceof JSONArray) && ((JSONArray) obj2).length() == 0) {
                        obj2 = new JSONObject();
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    SimpleItem simpleItem = new SimpleItem((JSONObject) obj2);
                    List<SimpleItem> items = getItems();
                    Intrinsics.checkNotNull(items);
                    items.add(simpleItem);
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
        throw new ParameterCheckFailException("items is missing in api ListMyCollections");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.returnFirstItemInBatch;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            hashMap.put("return_first_item_in_batch", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        Boolean bool2 = this.signImageUrl;
        if (bool2 != null) {
            Intrinsics.checkNotNull(bool2);
            hashMap.put("sign_image_url", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof ListMyCollectionsMessage)) {
            return false;
        }
        ListMyCollectionsMessage listMyCollectionsMessage = (ListMyCollectionsMessage) other;
        return Intrinsics.areEqual(this.returnFirstItemInBatch, listMyCollectionsMessage.returnFirstItemInBatch) && Intrinsics.areEqual(this.signImageUrl, listMyCollectionsMessage.signImageUrl);
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
        if (other == null || !(other instanceof ListMyCollectionsMessage)) {
            return false;
        }
        ListMyCollectionsMessage listMyCollectionsMessage = (ListMyCollectionsMessage) other;
        return Intrinsics.areEqual(this.returnFirstItemInBatch, listMyCollectionsMessage.returnFirstItemInBatch) && Intrinsics.areEqual(this.signImageUrl, listMyCollectionsMessage.signImageUrl) && Intrinsics.areEqual(getItems(), listMyCollectionsMessage.getItems());
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        Boolean bool = this.returnFirstItemInBatch;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.signImageUrl;
        return ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + getItems().hashCode();
    }

    /* compiled from: ListMyCollectionsMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/ListMyCollectionsMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/list_my_collections";
        }
    }
}
