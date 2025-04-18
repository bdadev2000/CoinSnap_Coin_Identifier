package s0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public final InputContentInfo f24152b;

    public d(Object obj) {
        this.f24152b = a.d(obj);
    }

    @Override // s0.e
    public final Object e() {
        return this.f24152b;
    }

    @Override // s0.e
    public final Uri f() {
        Uri contentUri;
        contentUri = this.f24152b.getContentUri();
        return contentUri;
    }

    @Override // s0.e
    public final void g() {
        this.f24152b.requestPermission();
    }

    @Override // s0.e
    public final ClipDescription getDescription() {
        ClipDescription description;
        description = this.f24152b.getDescription();
        return description;
    }

    @Override // s0.e
    public final Uri h() {
        Uri linkUri;
        linkUri = this.f24152b.getLinkUri();
        return linkUri;
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        a.e();
        this.f24152b = a.c(uri, clipDescription, uri2);
    }
}
