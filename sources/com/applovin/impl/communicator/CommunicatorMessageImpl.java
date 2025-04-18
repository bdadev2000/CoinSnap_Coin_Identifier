package com.applovin.impl.communicator;

import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class CommunicatorMessageImpl extends Intent {
    private final String a;
    protected final Bundle data;
    protected final WeakReference<AppLovinCommunicatorPublisher> publisherRef;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.a = UUID.randomUUID().toString();
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    public String getUniqueId() {
        return this.a;
    }

    @Override // android.content.Intent
    public String toString() {
        return "AppLovinCommunicatorMessage{publisherId=" + getPublisherId() + ", topic=" + getTopic() + "', uniqueId='" + this.a + "', data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }
}
