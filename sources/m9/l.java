package m9;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public interface l extends i {
    long a(p pVar);

    void c(w0 w0Var);

    void close();

    default Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    Uri getUri();
}
