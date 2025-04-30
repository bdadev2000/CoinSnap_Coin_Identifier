package T1;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f2983a;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i9 = 0; i9 < length; i9++) {
                char charAt = property.charAt(i9);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new n(property)));
        }
        f2983a = Collections.unmodifiableMap(hashMap);
    }
}
