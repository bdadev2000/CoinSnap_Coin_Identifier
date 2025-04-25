package com.picturecoin.generatedAPI.kotlinAPI.chatbot;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ChatbotSendStreamMessageResponse.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001 B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0014J\t\u0010\u001d\u001a\u00020\u0005HÂ\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001f\u001a\u00020\u0013HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessageResponse;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", LogEventArguments.ARG_MESSAGE, "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageModel;", "getMessage", "()Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageModel;", "setMessage", "(Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/MessageModel;)V", "getJsonMap", "", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final /* data */ class ChatbotSendStreamMessageResponse extends APIModelBase<ChatbotSendStreamMessageResponse> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public MessageModel message;
    private final int unused;

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final ChatbotSendStreamMessageResponse copy(int unused) {
        return new ChatbotSendStreamMessageResponse(unused);
    }

    public String toString() {
        return "ChatbotSendStreamMessageResponse(unused=" + this.unused + ")";
    }

    /* synthetic */ ChatbotSendStreamMessageResponse(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ ChatbotSendStreamMessageResponse copy$default(ChatbotSendStreamMessageResponse chatbotSendStreamMessageResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatbotSendStreamMessageResponse.unused;
        }
        return chatbotSendStreamMessageResponse.copy(i);
    }

    private ChatbotSendStreamMessageResponse(int i) {
        this.unused = i;
    }

    public final MessageModel getMessage() {
        MessageModel messageModel = this.message;
        if (messageModel != null) {
            return messageModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException(LogEventArguments.ARG_MESSAGE);
        return null;
    }

    public final void setMessage(MessageModel messageModel) {
        Intrinsics.checkNotNullParameter(messageModel, "<set-?>");
        this.message = messageModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatbotSendStreamMessageResponse(JSONObject obj) {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(LogEventArguments.ARG_MESSAGE) && !obj.isNull(LogEventArguments.ARG_MESSAGE)) {
            JSONObject jSONObject = obj.getJSONObject(LogEventArguments.ARG_MESSAGE);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            setMessage(new MessageModel(jSONObject));
            return;
        }
        throw new ParameterCheckFailException("message is missing in model ChatbotSendStreamMessageResponse");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(LogEventArguments.ARG_MESSAGE, getMessage().getJsonMap(keepNull));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        return other != null && (other instanceof ChatbotSendStreamMessageResponse) && Intrinsics.areEqual(getMessage(), ((ChatbotSendStreamMessageResponse) other).getMessage());
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + getMessage().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ChatbotSendStreamMessageResponse chatbotSendStreamMessageResponse = new ChatbotSendStreamMessageResponse(0, 1, null);
        cloneTo(chatbotSendStreamMessageResponse);
        return chatbotSendStreamMessageResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object other) {
        if (other != null && (other instanceof ChatbotSendStreamMessageResponse)) {
            Object clone = getMessage().clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.picturecoin.generatedAPI.kotlinAPI.chatbot.MessageModel");
            ((ChatbotSendStreamMessageResponse) other).setMessage((MessageModel) clone);
        }
    }

    /* compiled from: ChatbotSendStreamMessageResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/ChatbotSendStreamMessageResponse$Companion;", "", "<init>", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
