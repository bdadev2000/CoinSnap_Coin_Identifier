package k4;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j0 implements y {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f20245b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));
    public final y a;

    public j0(y yVar) {
        this.a = yVar;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        return f20245b.contains(((Uri) obj).getScheme());
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        return this.a.b(new p(((Uri) obj).toString()), i10, i11, mVar);
    }
}
