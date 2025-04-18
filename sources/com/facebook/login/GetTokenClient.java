package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(@NotNull Context context, @NotNull LoginClient.Request request) {
        super(context, 65536, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), request.getNonce());
        p0.a.s(context, "context");
        p0.a.s(request, "request");
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(@NotNull Bundle bundle) {
        p0.a.s(bundle, "data");
    }
}
