package o;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f22913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22914d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f22915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f22916g;

    public d(g gVar, int i10, Uri uri, boolean z10, Bundle bundle) {
        this.f22916g = gVar;
        this.f22912b = i10;
        this.f22913c = uri;
        this.f22914d = z10;
        this.f22915f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22916g.f22930c.onRelationshipValidationResult(this.f22912b, this.f22913c, this.f22914d, this.f22915f);
    }
}
