package k;

import android.net.Uri;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import d0.p;

/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final d0.h f30874a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.h f30875b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30876c;

    public i(p pVar, p pVar2, boolean z2) {
        this.f30874a = pVar;
        this.f30875b = pVar2;
        this.f30876c = z2;
    }

    @Override // k.f
    public final g a(Object obj, q.n nVar, f.i iVar) {
        Uri uri = (Uri) obj;
        if (p0.a.g(uri.getScheme(), com.safedk.android.analytics.brandsafety.creatives.e.e) || p0.a.g(uri.getScheme(), TournamentShareDialogURIBuilder.scheme)) {
            return new l(uri.toString(), nVar, this.f30874a, this.f30875b, this.f30876c);
        }
        return null;
    }
}
