package com.picturecoin.generatedAPI.kotlinAPI.chatbot.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageDataEventType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "MetaDataEvent", "MessageDataEvent", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MessageDataEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MessageDataEventType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String eventName;
    public static final MessageDataEventType MetaDataEvent = new MessageDataEventType("MetaDataEvent", 0, "meta_data_event");
    public static final MessageDataEventType MessageDataEvent = new MessageDataEventType("MessageDataEvent", 1, "message_data_event");

    private static final /* synthetic */ MessageDataEventType[] $values() {
        return new MessageDataEventType[]{MetaDataEvent, MessageDataEvent};
    }

    @JvmStatic
    public static final MessageDataEventType fromValue(String str) {
        return INSTANCE.fromValue(str);
    }

    public static EnumEntries<MessageDataEventType> getEntries() {
        return $ENTRIES;
    }

    private MessageDataEventType(String str, int i, String str2) {
        this.eventName = str2;
    }

    public final String getEventName() {
        return this.eventName;
    }

    static {
        MessageDataEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MessageDataEventType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/enums/MessageDataEventType;", "value", "", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MessageDataEventType fromValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (MessageDataEventType messageDataEventType : MessageDataEventType.values()) {
                if (Intrinsics.areEqual(messageDataEventType.getEventName(), value)) {
                    return messageDataEventType;
                }
            }
            throw new IllegalArgumentException("incorrect value " + value + " for enum MessageDataEventType");
        }
    }

    public static MessageDataEventType valueOf(String str) {
        return (MessageDataEventType) Enum.valueOf(MessageDataEventType.class, str);
    }

    public static MessageDataEventType[] values() {
        return (MessageDataEventType[]) $VALUES.clone();
    }
}
