package com.picturecoin.generatedAPI.kotlinAPI.collection;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: SaveCollectionMessage.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\b\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001d0\u0019H\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'H\u0016¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010*\u001a\u00020\fH\u0016J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0013\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010-\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006/"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/SaveCollectionMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "collection", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "<init>", "(Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;)V", "getCollection", "()Lcom/picturecoin/generatedAPI/kotlinAPI/collection/Collection;", "setCollection", "collectionId", "", "getCollectionId", "()I", "setCollectionId", "(I)V", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class SaveCollectionMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Collection collection;
    private int collectionId;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    public final Collection getCollection() {
        return this.collection;
    }

    public final SaveCollectionMessage copy(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return new SaveCollectionMessage(collection);
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
        return "SaveCollectionMessage(collection=" + this.collection + ")";
    }

    public static /* synthetic */ SaveCollectionMessage copy$default(SaveCollectionMessage saveCollectionMessage, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = saveCollectionMessage.collection;
        }
        return saveCollectionMessage.copy(collection);
    }

    public final Collection getCollection() {
        return this.collection;
    }

    public final void setCollection(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<set-?>");
        this.collection = collection;
    }

    public SaveCollectionMessage(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
    }

    public final int getCollectionId() {
        return this.collectionId;
    }

    public final void setCollectionId(int i) {
        this.collectionId = i;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("collection_id") && !obj.isNull("collection_id")) {
            this.collectionId = obj.getInt("collection_id");
            this._response_at = new Date();
            return;
        }
        throw new ParameterCheckFailException("collection_id is missing in api SaveCollection");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithBinary(byte[] response) throws Exception {
        Intrinsics.checkNotNullParameter(response, "response");
        throw new ParameterCheckFailException("this message does not have binary response");
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, Object> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("collection", this.collection.getJsonMap());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        return other != null && (other instanceof SaveCollectionMessage) && Intrinsics.areEqual(this.collection, ((SaveCollectionMessage) other).collection);
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
        if (other == null || !(other instanceof SaveCollectionMessage)) {
            return false;
        }
        SaveCollectionMessage saveCollectionMessage = (SaveCollectionMessage) other;
        return Intrinsics.areEqual(this.collection, saveCollectionMessage.collection) && this.collectionId == saveCollectionMessage.collectionId;
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + this.collection.hashCode()) * 31) + Integer.hashCode(this.collectionId);
    }

    /* compiled from: SaveCollectionMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/collection/SaveCollectionMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/collection/save_collection";
        }
    }
}
