package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m {
    public final Intent a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f22939b;

    public m(Intent intent, Bundle bundle) {
        this.a = intent;
        this.f22939b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.a;
        intent.setData(uri);
        d0.h.startActivity(context, intent, this.f22939b);
    }
}
