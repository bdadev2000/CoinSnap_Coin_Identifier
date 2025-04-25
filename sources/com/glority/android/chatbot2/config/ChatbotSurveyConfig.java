package com.glority.android.chatbot2.config;

import com.glority.chatbot2.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ChatbotSurveyConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/chatbot2/config/ChatbotSurveyConfig;", "", "enableDefaultSurvey", "", "interval", "", "buttonColor", "", "(ZJI)V", "getButtonColor", "()I", "getEnableDefaultSurvey", "()Z", "getInterval", "()J", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotSurveyConfig {
    private final int buttonColor;
    private final boolean enableDefaultSurvey;
    private final long interval;

    public ChatbotSurveyConfig(boolean z, long j, int i) {
        this.enableDefaultSurvey = z;
        this.interval = j;
        this.buttonColor = i;
    }

    public /* synthetic */ ChatbotSurveyConfig(boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, (i2 & 4) != 0 ? R.color.ChatBotSurveyThemeColor : i);
    }

    public final int getButtonColor() {
        return this.buttonColor;
    }

    public final boolean getEnableDefaultSurvey() {
        return this.enableDefaultSurvey;
    }

    public final long getInterval() {
        return this.interval;
    }
}
