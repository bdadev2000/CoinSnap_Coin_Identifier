package y0;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String message) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.datastore.preferences.protobuf.j0 j0Var) {
        super("Unable to parse preferences proto.", j0Var);
        Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", PglCryptUtils.KEY_MESSAGE);
    }
}
