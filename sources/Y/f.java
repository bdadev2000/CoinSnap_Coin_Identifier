package Y;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {
    public final InputContentInfo b;

    public f(Object obj) {
        this.b = (InputContentInfo) obj;
    }

    @Override // Y.g
    public final Uri d() {
        return this.b.getContentUri();
    }

    @Override // Y.g
    public final void e() {
        this.b.requestPermission();
    }

    @Override // Y.g
    public final Uri f() {
        return this.b.getLinkUri();
    }

    @Override // Y.g
    public final ClipDescription getDescription() {
        return this.b.getDescription();
    }

    @Override // Y.g
    public final Object i() {
        return this.b;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.b = new InputContentInfo(uri, clipDescription, uri2);
    }
}
