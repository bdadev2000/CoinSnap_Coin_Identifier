package com.glority.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddMessageParam.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001@B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00103\u001a\u00020\rH\u0016J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\rH\u0014J\t\u00107\u001a\u00020\bHÂ\u0003J\u0013\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0016\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0016J\u001c\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010=\u001a\u00020:J\b\u0010>\u001a\u00020\bH\u0016J\t\u0010?\u001a\u00020\fHÖ\u0001RF\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R6\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020%8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R&\u0010+\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u0004\u0018\u00010\f2\b\u0010\n\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "", "", Args.extraFields, "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;", "from", "getFrom", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;", "setFrom", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageFrom;)V", "", "", "itemIds", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", Args.itemType, "getItemType", "()Ljava/lang/String;", "setItemType", "(Ljava/lang/String;)V", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent;", "messageContent", "getMessageContent", "()Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent;", "setMessageContent", "(Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent;)V", Args.sessionId, "getSessionId", "()J", "setSessionId", "(J)V", Args.uid, "getUid", "setUid", "clone", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class AddMessageParam extends APIModelBase<AddMessageParam> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Map<String, ? extends Object> extraFields;
    public MessageFrom from;
    private List<Long> itemIds;
    private String itemType;
    public MessageContent messageContent;
    private long sessionId;
    private String uid;
    private int unused;

    public AddMessageParam() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ AddMessageParam copy$default(AddMessageParam addMessageParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addMessageParam.unused;
        }
        return addMessageParam.copy(i);
    }

    public final AddMessageParam copy(int unused) {
        return new AddMessageParam(unused);
    }

    public String toString() {
        return "AddMessageParam(unused=" + this.unused + ")";
    }

    public AddMessageParam(int i) {
        this.unused = i;
    }

    public /* synthetic */ AddMessageParam(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final MessageFrom getFrom() {
        MessageFrom messageFrom = this.from;
        if (messageFrom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        return messageFrom;
    }

    public final void setFrom(MessageFrom messageFrom) {
        Intrinsics.checkNotNullParameter(messageFrom, "<set-?>");
        this.from = messageFrom;
    }

    public final MessageContent getMessageContent() {
        MessageContent messageContent = this.messageContent;
        if (messageContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        }
        return messageContent;
    }

    public final void setMessageContent(MessageContent messageContent) {
        Intrinsics.checkNotNullParameter(messageContent, "<set-?>");
        this.messageContent = messageContent;
    }

    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public final void setItemIds(List<Long> list) {
        this.itemIds = list;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final Map<String, Object> getExtraFields() {
        return this.extraFields;
    }

    public final void setExtraFields(Map<String, ? extends Object> map) {
        this.extraFields = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AddMessageParam(org.json.JSONObject r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.generatedAPI.kotlinAPI.chatbot.AddMessageParam.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        MessageFrom messageFrom = this.from;
        if (messageFrom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        hashMap.put("from", Integer.valueOf(messageFrom.getValue()));
        MessageContent messageContent = this.messageContent;
        if (messageContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        }
        hashMap.put("message_content", messageContent.getJsonMap());
        List<Long> list = this.itemIds;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            hashMap.put("item_ids", list);
        } else if (keepNull) {
            hashMap.put("item_ids", null);
        }
        String str = this.itemType;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            hashMap.put("item_type", str);
        } else if (keepNull) {
            hashMap.put("item_type", null);
        }
        String str2 = this.uid;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            hashMap.put(Args.uid, str2);
        } else if (keepNull) {
            hashMap.put(Args.uid, null);
        }
        Map<String, ? extends Object> map = this.extraFields;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            hashMap.put("extra_fields", map);
        } else if (keepNull) {
            hashMap.put("extra_fields", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof AddMessageParam)) {
            return false;
        }
        AddMessageParam addMessageParam = (AddMessageParam) other;
        if (this.sessionId != addMessageParam.sessionId) {
            return false;
        }
        MessageFrom messageFrom = this.from;
        if (messageFrom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        MessageFrom messageFrom2 = addMessageParam.from;
        if (messageFrom2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        if (messageFrom != messageFrom2) {
            return false;
        }
        MessageContent messageContent = this.messageContent;
        if (messageContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        }
        MessageContent messageContent2 = addMessageParam.messageContent;
        if (messageContent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        }
        return ((Intrinsics.areEqual(messageContent, messageContent2) ^ true) || (Intrinsics.areEqual(this.itemIds, addMessageParam.itemIds) ^ true) || (Intrinsics.areEqual(this.itemType, addMessageParam.itemType) ^ true) || (Intrinsics.areEqual(this.uid, addMessageParam.uid) ^ true) || (Intrinsics.areEqual(this.extraFields, addMessageParam.extraFields) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((getClass().hashCode() * 31) + Long.hashCode(this.sessionId)) * 31;
        MessageFrom messageFrom = this.from;
        if (messageFrom == null) {
            Intrinsics.throwUninitializedPropertyAccessException("from");
        }
        int hashCode2 = (hashCode + messageFrom.hashCode()) * 31;
        MessageContent messageContent = this.messageContent;
        if (messageContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        }
        int hashCode3 = (hashCode2 + messageContent.hashCode()) * 31;
        List<Long> list = this.itemIds;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.itemType;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.uid;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.extraFields;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        AddMessageParam addMessageParam = new AddMessageParam(0, 1, null);
        cloneTo(addMessageParam);
        return addMessageParam;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            AddMessageParam addMessageParam = (AddMessageParam) o;
            super.cloneTo(addMessageParam);
            Long cloneField = cloneField(Long.valueOf(this.sessionId));
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.sessionId)");
            addMessageParam.sessionId = cloneField.longValue();
            Enum r0 = this.from;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("from");
            }
            Enum cloneField2 = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.from)");
            addMessageParam.from = (MessageFrom) cloneField2;
            APIModelBase aPIModelBase = this.messageContent;
            if (aPIModelBase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageContent");
            }
            APIModelBase cloneField3 = cloneField(aPIModelBase);
            Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(this.messageContent)");
            addMessageParam.messageContent = (MessageContent) cloneField3;
            if (this.itemIds == null) {
                addMessageParam.itemIds = null;
            } else {
                addMessageParam.itemIds = new ArrayList();
                List<Long> list = this.itemIds;
                Intrinsics.checkNotNull(list);
                Iterator<Long> it = list.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    List<Long> list2 = addMessageParam.itemIds;
                    Intrinsics.checkNotNull(list2);
                    Long cloneField4 = cloneField(Long.valueOf(longValue));
                    Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                    list2.add(cloneField4);
                }
            }
            String str = this.itemType;
            addMessageParam.itemType = str != null ? cloneField(str) : null;
            String str2 = this.uid;
            addMessageParam.uid = str2 != null ? cloneField(str2) : null;
            Map<String, Object> map = this.extraFields;
            addMessageParam.extraFields = map != null ? cloneField(map) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.generatedAPI.kotlinAPI.chatbot.AddMessageParam");
    }

    /* compiled from: AddMessageParam.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getAddMessageParamJsonArrayMap", "", "array", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getAddMessageParamJsonArrayMap(List<AddMessageParam> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AddMessageParam) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("itemIds", Long.TYPE);
            return hashMap;
        }
    }
}
