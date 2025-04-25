package com.glority.component.generatedAPI.kotlinAPI.item;

import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.definition.APIBase;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UpdateItemCustomNoteMessage.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0016¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0005HÄ\u0003J\t\u0010-\u001a\u00020\u0005HÄ\u0003J\t\u0010.\u001a\u00020\u0005HÄ\u0003J'\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u00062"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemCustomNoteMessage;", "Lcom/glority/android/core/definition/APIBase;", "Lcom/glority/android/core/definition/APIDefinition;", "Ljava/io/Serializable;", "itemUuid", "", Args.uid, "note", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getItemUuid", "()Ljava/lang/String;", "setItemUuid", "(Ljava/lang/String;)V", "getUid", "setUid", "getNote", "setNote", "updateWithJson", "", "obj", "Lorg/json/JSONObject;", "updateWithBinary", "response", "", "getParams", "", "", "getFiles", "Ljava/io/File;", "requestEquals", "", "other", AbtestLogEvent.ARG_API_NAME, "forceHttps", "needAuth", "mustAuth", "binaryResponse", "methods", "", "()[Ljava/lang/String;", "equals", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class UpdateItemCustomNoteMessage extends APIBase implements APIDefinition, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String itemUuid;
    private String note;
    private String uid;

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean binaryResponse() {
        return false;
    }

    /* renamed from: component1, reason: from getter */
    protected final String getItemUuid() {
        return this.itemUuid;
    }

    /* renamed from: component2, reason: from getter */
    protected final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    protected final String getNote() {
        return this.note;
    }

    public final UpdateItemCustomNoteMessage copy(String itemUuid, String uid, String note) {
        Intrinsics.checkNotNullParameter(itemUuid, "itemUuid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(note, "note");
        return new UpdateItemCustomNoteMessage(itemUuid, uid, note);
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
        return "UpdateItemCustomNoteMessage(itemUuid=" + this.itemUuid + ", uid=" + this.uid + ", note=" + this.note + ")";
    }

    public static /* synthetic */ UpdateItemCustomNoteMessage copy$default(UpdateItemCustomNoteMessage updateItemCustomNoteMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateItemCustomNoteMessage.itemUuid;
        }
        if ((i & 2) != 0) {
            str2 = updateItemCustomNoteMessage.uid;
        }
        if ((i & 4) != 0) {
            str3 = updateItemCustomNoteMessage.note;
        }
        return updateItemCustomNoteMessage.copy(str, str2, str3);
    }

    protected final String getItemUuid() {
        return this.itemUuid;
    }

    protected final void setItemUuid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemUuid = str;
    }

    protected final String getUid() {
        return this.uid;
    }

    protected final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    protected final String getNote() {
        return this.note;
    }

    protected final void setNote(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.note = str;
    }

    public UpdateItemCustomNoteMessage(String itemUuid, String uid, String note) {
        Intrinsics.checkNotNullParameter(itemUuid, "itemUuid");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(note, "note");
        this.itemUuid = itemUuid;
        this.uid = uid;
        this.note = note;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public void updateWithJson(JSONObject obj) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
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
        hashMap.put("item_uuid", this.itemUuid);
        hashMap.put(Args.uid, this.uid);
        hashMap.put("note", this.note);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public Map<String, File> getFiles() {
        return new HashMap();
    }

    @Override // com.glority.android.core.definition.APIDefinition
    public boolean requestEquals(Object other) {
        if (other == null || !(other instanceof UpdateItemCustomNoteMessage)) {
            return false;
        }
        UpdateItemCustomNoteMessage updateItemCustomNoteMessage = (UpdateItemCustomNoteMessage) other;
        return Intrinsics.areEqual(this.itemUuid, updateItemCustomNoteMessage.itemUuid) && Intrinsics.areEqual(this.uid, updateItemCustomNoteMessage.uid) && Intrinsics.areEqual(this.note, updateItemCustomNoteMessage.note);
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
        if (other == null || !(other instanceof UpdateItemCustomNoteMessage)) {
            return false;
        }
        UpdateItemCustomNoteMessage updateItemCustomNoteMessage = (UpdateItemCustomNoteMessage) other;
        return Intrinsics.areEqual(this.itemUuid, updateItemCustomNoteMessage.itemUuid) && Intrinsics.areEqual(this.uid, updateItemCustomNoteMessage.uid) && Intrinsics.areEqual(this.note, updateItemCustomNoteMessage.note);
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + this.itemUuid.hashCode()) * 31) + this.uid.hashCode()) * 31) + this.note.hashCode();
    }

    /* compiled from: UpdateItemCustomNoteMessage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemCustomNoteMessage$Companion;", "", "<init>", "()V", AbtestLogEvent.ARG_API_NAME, "", "getApi", "()Ljava/lang/String;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getApi() {
            return "v3/item/update_item_custom_note";
        }
    }
}
