package u;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2739h {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f23048a;
    public final Bundle b;

    public C2739h(Intent intent, Bundle bundle) {
        this.f23048a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f23048a;
        intent.setData(uri);
        I.h.startActivity(context, intent, this.b);
    }
}
