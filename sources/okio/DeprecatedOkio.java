package okio;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@d0.a
/* renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes4.dex */
public final class DeprecatedOkio {

    @NotNull
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @d0.a
    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        p0.a.s(file, ShareInternalUtility.STAGING_PARAM);
        return Okio.appendingSink(file);
    }

    @d0.a
    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @d0.a
    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        p0.a.s(sink, "sink");
        return Okio.buffer(sink);
    }

    @d0.a
    @NotNull
    public final Sink sink(@NotNull File file) {
        Sink sink$default;
        p0.a.s(file, ShareInternalUtility.STAGING_PARAM);
        sink$default = Okio__JvmOkioKt.sink$default(file, false, 1, null);
        return sink$default;
    }

    @d0.a
    @NotNull
    public final Source source(@NotNull File file) {
        p0.a.s(file, ShareInternalUtility.STAGING_PARAM);
        return Okio.source(file);
    }

    @d0.a
    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        p0.a.s(source, "source");
        return Okio.buffer(source);
    }

    @d0.a
    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        p0.a.s(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @d0.a
    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        p0.a.s(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @d0.a
    @NotNull
    public final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        p0.a.s(path, "path");
        p0.a.s(openOptionArr, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @d0.a
    @NotNull
    public final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        p0.a.s(path, "path");
        p0.a.s(openOptionArr, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @d0.a
    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        p0.a.s(socket, "socket");
        return Okio.sink(socket);
    }

    @d0.a
    @NotNull
    public final Source source(@NotNull Socket socket) {
        p0.a.s(socket, "socket");
        return Okio.source(socket);
    }
}
