package T1;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class H implements u {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final u f2964a;

    public H(u uVar) {
        this.f2964a = uVar;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        return this.f2964a.b(new k(((Uri) obj).toString()), i9, i10, iVar);
    }
}
