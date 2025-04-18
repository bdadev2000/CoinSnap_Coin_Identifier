package okhttp3;

import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i2, @NotNull String str) {
        a.s(webSocket, "webSocket");
        a.s(str, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i2, @NotNull String str) {
        a.s(webSocket, "webSocket");
        a.s(str, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th, @Nullable Response response) {
        a.s(webSocket, "webSocket");
        a.s(th, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String str) {
        a.s(webSocket, "webSocket");
        a.s(str, "text");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        a.s(webSocket, "webSocket");
        a.s(response, "response");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
        a.s(webSocket, "webSocket");
        a.s(byteString, "bytes");
    }
}
