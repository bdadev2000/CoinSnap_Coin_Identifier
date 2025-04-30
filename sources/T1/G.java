package T1;

import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import i2.C2341d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class G implements u {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", AppLovinEventTypes.USER_VIEWED_CONTENT, "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final F f2963a;

    public G(F f9) {
        this.f2963a = f9;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        Uri uri = (Uri) obj;
        return new t(new C2341d(uri), this.f2963a.h(uri));
    }
}
