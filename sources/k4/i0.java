package k4;

import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 implements y {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f20242b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", AppLovinEventTypes.USER_VIEWED_CONTENT, "android.resource")));
    public final h0 a;

    public i0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        return f20242b.contains(((Uri) obj).getScheme());
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        Uri uri = (Uri) obj;
        return new x(new v4.d(uri), this.a.k(uri));
    }
}
