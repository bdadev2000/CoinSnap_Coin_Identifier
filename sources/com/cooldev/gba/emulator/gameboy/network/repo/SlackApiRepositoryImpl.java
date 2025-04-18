package com.cooldev.gba.emulator.gameboy.network.repo;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.RetrofitClient;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@StabilityInferred
/* loaded from: classes.dex */
public final class SlackApiRepositoryImpl {

    @NotNull
    private final SlackApiRepository slack = RetrofitClient.INSTANCE.getSlack();

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = "SlackApiRepositoryImpl";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public final void sendMessageToSlack(@NotNull SlackMessage slackMessage) {
        a.s(slackMessage, "message");
        this.slack.sendMessageToSlack(slackMessage).enqueue(new Callback<Void>() { // from class: com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl$sendMessageToSlack$1
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<Void> call, @NotNull Throwable th) {
                String str;
                a.s(call, "call");
                a.s(th, "t");
                str = SlackApiRepositoryImpl.TAG;
                Log.e(str, "Error occurred while sending message to Slack: " + th.getMessage());
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<Void> call, @NotNull Response<Void> response) {
                String str;
                String str2;
                a.s(call, "call");
                a.s(response, "response");
                if (response.isSuccessful()) {
                    str2 = SlackApiRepositoryImpl.TAG;
                    Log.d(str2, "Message sent to Slack successfully");
                    return;
                }
                str = SlackApiRepositoryImpl.TAG;
                Log.e(str, "Failed to send message to Slack. Response code: " + response.code() + ", Response message: " + response.errorBody());
            }
        });
    }
}
