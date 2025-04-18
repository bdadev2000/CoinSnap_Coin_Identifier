package y7;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public interface o {
    default l[] a(Uri uri, Map map) {
        return createExtractors();
    }

    l[] createExtractors();
}
