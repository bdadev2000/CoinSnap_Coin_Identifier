package com.glority.android.core.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.Args;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushMessageBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/glority/android/core/modules/PushMessageBean;", "Ljava/io/Serializable;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "extra", "", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", LogEventArguments.ARG_MESSAGE, "getMessage", "setMessage", "messageId", "getMessageId", "setMessageId", "messageType", "", "getMessageType", "()I", "setMessageType", "(I)V", "notifyId", "getNotifyId", "setNotifyId", "notifyType", "getNotifyType", "setNotifyType", "pushChannel", "getPushChannel", "setPushChannel", Args.title, "getTitle", "setTitle", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PushMessageBean implements Serializable {
    private String content;
    private Map<String, String> extra = new HashMap();
    private String message;
    private String messageId;
    private int messageType;
    private int notifyId;
    private int notifyType;
    private String pushChannel;
    private String title;

    public final String getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(String str) {
        this.messageId = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final int getNotifyType() {
        return this.notifyType;
    }

    public final void setNotifyType(int i) {
        this.notifyType = i;
    }

    public final int getNotifyId() {
        return this.notifyId;
    }

    public final void setNotifyId(int i) {
        this.notifyId = i;
    }

    public final String getPushChannel() {
        return this.pushChannel;
    }

    public final void setPushChannel(String str) {
        this.pushChannel = str;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final void setMessageType(int i) {
        this.messageType = i;
    }

    public final Map<String, String> getExtra() {
        return this.extra;
    }

    public final void setExtra(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extra = map;
    }
}
