package okio;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* loaded from: classes2.dex */
public final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        p0.a.s(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader) {
        p0.a.s(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink, @NotNull Cipher cipher) {
        p0.a.s(sink, "<this>");
        p0.a.s(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source, @NotNull Cipher cipher) {
        p0.a.s(source, "<this>");
        p0.a.s(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        p0.a.s(sink, "<this>");
        p0.a.s(mac, "mac");
        return new HashingSink(sink, mac);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull Mac mac) {
        p0.a.s(source, "<this>");
        p0.a.s(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        String message;
        p0.a.s(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !m.M0(message, "getsockname failed", false)) ? false : true;
    }

    @NotNull
    public static final FileSystem openZip(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        p0.a.s(fileSystem, "<this>");
        p0.a.s(path, "zipPath");
        return ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
    }

    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        Sink sink$default;
        p0.a.s(file, "<this>");
        sink$default = sink$default(file, false, 1, null);
        return sink$default;
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z2, int i2, Object obj) throws FileNotFoundException {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return Okio.sink(file, z2);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        p0.a.s(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull MessageDigest messageDigest) {
        p0.a.s(sink, "<this>");
        p0.a.s(messageDigest, "digest");
        return new HashingSink(sink, messageDigest);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull MessageDigest messageDigest) {
        p0.a.s(source, "<this>");
        p0.a.s(messageDigest, "digest");
        return new HashingSource(source, messageDigest);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        p0.a.s(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        p0.a.s(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        p0.a.r(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        p0.a.s(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        p0.a.r(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        p0.a.s(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    @NotNull
    public static final Sink sink(@NotNull File file, boolean z2) throws FileNotFoundException {
        p0.a.s(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z2));
    }

    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        p0.a.s(path, "<this>");
        p0.a.s(openOptionArr, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        p0.a.r(newInputStream, "newInputStream(...)");
        return Okio.source(newInputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        p0.a.s(path, "<this>");
        p0.a.s(openOptionArr, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        p0.a.r(newOutputStream, "newOutputStream(...)");
        return Okio.sink(newOutputStream);
    }
}
