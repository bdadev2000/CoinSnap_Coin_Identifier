package com.cooldev.gba.emulator.gameboy.network.repo;

import com.cooldev.gba.emulator.gameboy.constants.EndPoints;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* loaded from: classes3.dex */
public interface SlackApiRepository {
    @POST(EndPoints.SEND_MESSAGE)
    @NotNull
    Call<Void> sendMessageToSlack(@Body @NotNull SlackMessage slackMessage);
}
