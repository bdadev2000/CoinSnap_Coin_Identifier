package okhttp3;

import androidx.compose.ui.platform.j;
import com.applovin.sdk.AppLovinEventParameters;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class Credentials {

    @NotNull
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2) {
        a.s(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        a.s(str2, "password");
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            a.r(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        a.s(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        a.s(str2, "password");
        a.s(charset, "charset");
        return j.b("Basic ", ByteString.Companion.encodeString(str + ':' + str2, charset).base64());
    }
}
