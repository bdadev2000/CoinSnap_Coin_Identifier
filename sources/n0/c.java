package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public final ContentInfo.Builder f22251b;

    public c(ClipData clipData, int i10) {
        com.google.android.gms.internal.ads.b.D();
        this.f22251b = com.google.android.gms.internal.ads.b.j(clipData, i10);
    }

    @Override // n0.d
    public final void a(Uri uri) {
        this.f22251b.setLinkUri(uri);
    }

    @Override // n0.d
    public final void b(int i10) {
        this.f22251b.setFlags(i10);
    }

    @Override // n0.d
    public final g build() {
        ContentInfo build;
        build = this.f22251b.build();
        return new g(new v3.c(build));
    }

    @Override // n0.d
    public final void setExtras(Bundle bundle) {
        this.f22251b.setExtras(bundle);
    }
}
