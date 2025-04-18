package u7;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class k extends ContentObserver {
    public final ContentResolver a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f25568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f25569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f25569c = lVar;
        this.a = contentResolver;
        this.f25568b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        l lVar = this.f25569c;
        l.a(lVar, h.a(lVar.a));
    }
}
