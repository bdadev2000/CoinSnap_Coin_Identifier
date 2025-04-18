package okio.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import okio.TypedOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* renamed from: okio.internal.-BufferedSource, reason: invalid class name */
/* loaded from: classes3.dex */
public final class BufferedSource {
    @Nullable
    public static final <T> T commonSelect(@NotNull okio.BufferedSource bufferedSource, @NotNull TypedOptions<T> typedOptions) {
        a.s(bufferedSource, "<this>");
        a.s(typedOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        int select = bufferedSource.select(typedOptions.getOptions$okio());
        if (select == -1) {
            return null;
        }
        return typedOptions.get(select);
    }
}
