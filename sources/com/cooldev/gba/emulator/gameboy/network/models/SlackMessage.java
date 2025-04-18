package com.cooldev.gba.emulator.gameboy.network.models;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.text.input.a;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import e0.q;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.n;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SlackMessage {

    @NotNull
    private final List<Block> blocks;

    @NotNull
    private final String text;

    @NotNull
    public static final Factory Factory = new Factory(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(k kVar) {
            this();
        }

        private final Block createDividerBlock() {
            return new Block("divider", null, null, null, null, 30, null);
        }

        private final Block createErrorDetailsBlock(String str, String str2, StackTraceElement stackTraceElement) {
            String str3 = "section";
            StringBuilder t2 = a.t("\n                    *Error Message:* ", str, "\n                    *Error Type:* ", str2, "\n                    *Class Name:* ");
            t2.append(stackTraceElement != null ? stackTraceElement.getClassName() : null);
            t2.append("\n                    *Method Name:* ");
            t2.append(stackTraceElement != null ? stackTraceElement.getMethodName() : null);
            t2.append("\n                    *File Name:* ");
            t2.append(stackTraceElement != null ? stackTraceElement.getFileName() : null);
            t2.append("\n                    *Line Number:* ");
            t2.append(stackTraceElement != null ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
            t2.append("\n                ");
            return new Block(str3, new BlockText("mrkdwn", p0.a.D0(t2.toString())), null, new Accessory("image", "https://bitbucket-assetroot.s3.amazonaws.com/c/photos/2024/Aug/30/3262874746-5-gba-emulator-logo_avatar.png", "App Logo"), null, 20, null);
        }

        private final Block createExceptionAlertBlock() {
            return new Block("section", new BlockText("mrkdwn", "*:rotating_light: :boom: *EXCEPTION ALERT!* :boom: :rotating_light:*"), null, null, null, 28, null);
        }

        private final Block createReferencesBlock(String str) {
            return new Block("section", null, null, null, f0.v(new BlockText("mrkdwn", "*Timestamp:* " + SlackMessageKt.getFormattedCurrentTime()), new BlockText("mrkdwn", "*References:* <" + SlackMessageKt.generateStackOverflowSearchLink(str) + "|Stack Overflow> | <" + SlackMessageKt.generateGoogleSearchLink(str) + "|Google>")), 14, null);
        }

        private final Block createStackTraceBlock(String str) {
            return new Block("section", new BlockText("mrkdwn", a.A("*Stack Trace:* ``` ", str, " ```")), null, null, null, 28, null);
        }

        private final Block createSystemInfoBlock(Context context) {
            return new Block("section", null, null, null, f0.v(new BlockText("mrkdwn", p0.a.D0("\n                        *App Version:* 1.0.35 (54)\n                        *App Name:* " + SlackMessageKt.getApplicationName(context) + "\n                        *Package Name:* com.cooldev.gba.emulator.gameboy\n                            ")), new BlockText("mrkdwn", SlackMessageKt.getDeviceInfo()), new BlockText("mrkdwn", "*Disk Free Space: * " + SlackMessageKt.getDiskFreeSpace() + '\n' + SlackMessageKt.getMemoryInfo(context)), new BlockText("mrkdwn", SlackMessageKt.getNetworkInfo(context)), new BlockText("mrkdwn", "*Orientation:* " + SlackMessageKt.getOrientationString(context))), 14, null);
        }

        @NotNull
        public final SlackMessage template(@NotNull Throwable th) {
            p0.a.s(th, "exception");
            Context context = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController().f20345a;
            StackTraceElement[] stackTrace = th.getStackTrace();
            p0.a.r(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) q.b0(stackTrace);
            String handleThrowable = SlackMessageKt.handleThrowable(th);
            String message = th.getMessage();
            String A1 = message != null ? n.A1(50, message) : "No message";
            String stackTraceString = Log.getStackTraceString(th);
            p0.a.r(stackTraceString, "getStackTraceString(...)");
            return new SlackMessage("An exception occurred in the app.", f0.v(createExceptionAlertBlock(), createErrorDetailsBlock(A1, handleThrowable, stackTraceElement), createStackTraceBlock(SlackMessageKt.truncateLog$default(stackTraceString, 0, 2, null)), createReferencesBlock(A1), createSystemInfoBlock(context), createDividerBlock()));
        }
    }

    public SlackMessage(@NotNull String str, @NotNull List<Block> list) {
        p0.a.s(str, "text");
        p0.a.s(list, "blocks");
        this.text = str;
        this.blocks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlackMessage copy$default(SlackMessage slackMessage, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = slackMessage.text;
        }
        if ((i2 & 2) != 0) {
            list = slackMessage.blocks;
        }
        return slackMessage.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final List<Block> component2() {
        return this.blocks;
    }

    @NotNull
    public final SlackMessage copy(@NotNull String str, @NotNull List<Block> list) {
        p0.a.s(str, "text");
        p0.a.s(list, "blocks");
        return new SlackMessage(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlackMessage)) {
            return false;
        }
        SlackMessage slackMessage = (SlackMessage) obj;
        return p0.a.g(this.text, slackMessage.text) && p0.a.g(this.blocks, slackMessage.blocks);
    }

    @NotNull
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.blocks.hashCode() + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SlackMessage(text=" + this.text + ", blocks=" + this.blocks + ')';
    }
}
