package com.glority.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageType;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MessageContent.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u0011HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageType;", "messageType", "getMessageType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageType;", "setMessageType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/MessageType;)V", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class MessageContent extends APIModelBase<MessageContent> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public MessageType messageType;
    public String text;
    private int unused;

    public MessageContent() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ MessageContent copy$default(MessageContent messageContent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageContent.unused;
        }
        return messageContent.copy(i);
    }

    public final MessageContent copy(int unused) {
        return new MessageContent(unused);
    }

    public String toString() {
        return "MessageContent(unused=" + this.unused + ")";
    }

    public MessageContent(int i) {
        this.unused = i;
    }

    public /* synthetic */ MessageContent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final MessageType getMessageType() {
        MessageType messageType = this.messageType;
        if (messageType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageType");
        }
        return messageType;
    }

    public final void setMessageType(MessageType messageType) {
        Intrinsics.checkNotNullParameter(messageType, "<set-?>");
        this.messageType = messageType;
    }

    public final String getText() {
        String str = this.text;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        }
        return str;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageContent(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Constants.MessagePayloadKeys.MESSAGE_TYPE) && !obj.isNull(Constants.MessagePayloadKeys.MESSAGE_TYPE)) {
            this.messageType = MessageType.INSTANCE.fromValue(obj.getInt(Constants.MessagePayloadKeys.MESSAGE_TYPE));
            if (obj.has("text") && !obj.isNull("text")) {
                String string = obj.getString("text");
                Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"text\")");
                this.text = string;
                return;
            }
            throw new ParameterCheckFailException("text is missing in model MessageContent");
        }
        throw new ParameterCheckFailException("messageType is missing in model MessageContent");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        MessageType messageType = this.messageType;
        if (messageType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageType");
        }
        hashMap.put(Constants.MessagePayloadKeys.MESSAGE_TYPE, Integer.valueOf(messageType.getValue()));
        String str = this.text;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        }
        hashMap.put("text", str);
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof MessageContent)) {
            return false;
        }
        MessageType messageType = this.messageType;
        if (messageType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageType");
        }
        MessageContent messageContent = (MessageContent) other;
        MessageType messageType2 = messageContent.messageType;
        if (messageType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageType");
        }
        if (messageType != messageType2) {
            return false;
        }
        String str = this.text;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        }
        String str2 = messageContent.text;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        }
        return !(Intrinsics.areEqual(str, str2) ^ true);
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        MessageType messageType = this.messageType;
        if (messageType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageType");
        }
        int hashCode2 = (hashCode + messageType.hashCode()) * 31;
        String str = this.text;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text");
        }
        return hashCode2 + str.hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        MessageContent messageContent = new MessageContent(0, 1, null);
        cloneTo(messageContent);
        return messageContent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            MessageContent messageContent = (MessageContent) o;
            super.cloneTo(messageContent);
            Enum r0 = this.messageType;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageType");
            }
            Enum cloneField = cloneField(r0);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.messageType)");
            messageContent.messageType = (MessageType) cloneField;
            String str = this.text;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("text");
            }
            String cloneField2 = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.text)");
            messageContent.text = cloneField2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.generatedAPI.kotlinAPI.chatbot.MessageContent");
    }

    /* compiled from: MessageContent.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getMessageContentJsonArrayMap", "", "array", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/MessageContent;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getMessageContentJsonArrayMap(List<MessageContent> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MessageContent) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
