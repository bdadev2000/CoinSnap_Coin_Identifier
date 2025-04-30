package u;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2734c implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f23035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23036d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f23037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BinderC2735d f23038g;

    public RunnableC2734c(BinderC2735d binderC2735d, int i9, Uri uri, boolean z8, Bundle bundle) {
        this.f23038g = binderC2735d;
        this.b = i9;
        this.f23035c = uri;
        this.f23036d = z8;
        this.f23037f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23038g.f23039c.onRelationshipValidationResult(this.b, this.f23035c, this.f23036d, this.f23037f);
    }
}
