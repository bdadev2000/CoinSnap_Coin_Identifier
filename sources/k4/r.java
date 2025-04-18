package k4;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f20260b;
    public final Map a = f20260b;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            property = sb2.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put(Command.HTTP_HEADER_USER_AGENT, Collections.singletonList(new s(property)));
        }
        f20260b = Collections.unmodifiableMap(hashMap);
    }
}
