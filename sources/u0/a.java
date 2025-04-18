package u0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.v;

/* loaded from: classes.dex */
public final class a extends ContentObserver {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f25408b = bVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        switch (this.a) {
            case 1:
                ((v) this.f25408b).b();
                return;
            default:
                super.onChange(z10, uri);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                b bVar = (b) this.f25408b;
                if (!bVar.f25410c || (cursor = bVar.f25411d) == null || cursor.isClosed()) {
                    return;
                }
                bVar.f25409b = bVar.f25411d.requery();
                return;
            default:
                super.onChange(z10);
                return;
        }
    }
}
