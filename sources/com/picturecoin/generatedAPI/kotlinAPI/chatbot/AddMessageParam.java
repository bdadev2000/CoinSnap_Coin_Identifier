package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums.MessageFrom;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u00103\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u00104\u001a\u000205J\u0016\u00103\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010.0-H\u0016J\u0013\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u00108\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020.H\u0016J\u0012\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010.H\u0014J\t\u0010=\u001a\u00020\u0005HÂ\u0003J\u0013\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010?\u001a\u00020$HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006A"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.sessionId, "", "getSessionId", "()J", "setSessionId", "(J)V", "from", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "getFrom", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;", "setFrom", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageFrom;)V", "messageContent", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;", "getMessageContent", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;", "setMessageContent", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageContent;)V", "itemIds", "", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", Args.itemType, "", "getItemType", "()Ljava/lang/String;", "setItemType", "(Ljava/lang/String;)V", Args.uid, "getUid", "setUid", Args.extraFields, "", "", "getExtraFields", "()Ljava/util/Map;", "setExtraFields", "(Ljava/util/Map;)V", "getJsonMap", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
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

    public static /* synthetic */ AddMessageParam copy$default(AddMessageParam addMessageParam, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addMessageParam.unused;
        }
        return addMessageParam.copy(i);
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final MessageFrom getFrom() {
        MessageFrom messageFrom = this.from;
        if (messageFrom != null) {
            return messageFrom;
        }
        Intrinsics.throwUninitializedPropertyAccessException("from");
        return null;
    }

    public final void setFrom(MessageFrom messageFrom) {
        Intrinsics.checkNotNullParameter(messageFrom, "<set-?>");
        this.from = messageFrom;
    }

    public final MessageContent getMessageContent() {
        MessageContent messageContent = this.messageContent;
        if (messageContent != null) {
            return messageContent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageContent");
        return null;
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
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.picturecoin.generatedAPI.kotlinAPI.chatbot.AddMessageParam.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", Long.valueOf(this.sessionId));
        hashMap.put("from", Integer.valueOf(getFrom().getValue()));
        hashMap.put("message_content", getMessageContent().getJsonMap());
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
        return this.sessionId == addMessageParam.sessionId && getFrom() == addMessageParam.getFrom() && Intrinsics.areEqual(getMessageContent(), addMessageParam.getMessageContent()) && Intrinsics.areEqual(this.itemIds, addMessageParam.itemIds) && Intrinsics.areEqual(this.itemType, addMessageParam.itemType) && Intrinsics.areEqual(this.uid, addMessageParam.uid) && Intrinsics.areEqual(this.extraFields, addMessageParam.extraFields);
    }

    public int hashCode() {
        int hashCode = ((((((getClass().hashCode() * 31) + Long.hashCode(this.sessionId)) * 31) + getFrom().hashCode()) * 31) + getMessageContent().hashCode()) * 31;
        List<Long> list = this.itemIds;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.itemType;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.uid;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.extraFields;
        return hashCode4 + (map != null ? map.hashCode() : 0);
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
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.AddMessageParam");
        AddMessageParam addMessageParam = (AddMessageParam) o;
        super.cloneTo(addMessageParam);
        addMessageParam.sessionId = cloneField(Long.valueOf(this.sessionId)).longValue();
        addMessageParam.setFrom((MessageFrom) cloneField(getFrom()));
        addMessageParam.setMessageContent((MessageContent) cloneField(getMessageContent()));
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
                Long cloneField = cloneField(Long.valueOf(longValue));
                Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(...)");
                list2.add(cloneField);
            }
        }
        String str = this.itemType;
        addMessageParam.itemType = str != null ? cloneField(str) : null;
        String str2 = this.uid;
        addMessageParam.uid = str2 != null ? cloneField(str2) : null;
        Map<String, Object> map = this.extraFields;
        addMessageParam.extraFields = map != null ? cloneField(map) : null;
    }

    /* compiled from: AddMessageParam.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/AddMessageParam$Companion;", "", "<init>", "()V", "getAddMessageParamJsonArrayMap", "", "", "", "array", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
