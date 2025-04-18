package n7;

import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.appevents.m;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f22470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i7.i f22471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22472d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f22473f;

    public /* synthetic */ e(i iVar, i7.i iVar2, int i10, Runnable runnable) {
        this.f22470b = iVar;
        this.f22471c = iVar2;
        this.f22472d = i10;
        this.f22473f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        i7.i iVar = this.f22471c;
        int i10 = this.f22472d;
        Runnable runnable = this.f22473f;
        i iVar2 = this.f22470b;
        l lVar = iVar2.f22488d;
        p7.c cVar = iVar2.f22490f;
        try {
            try {
                o7.d dVar = iVar2.f22487c;
                Objects.requireNonNull(dVar);
                ((o7.j) cVar).q(new androidx.core.app.h(dVar, 9));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    o7.j jVar = (o7.j) cVar;
                    SQLiteDatabase d10 = jVar.d();
                    jVar.p(new androidx.core.app.h(d10, 14), new m(12));
                    try {
                        ((c) lVar).a(iVar, i10 + 1, false);
                        d10.setTransactionSuccessful();
                        d10.endTransaction();
                    } catch (Throwable th2) {
                        d10.endTransaction();
                        throw th2;
                    }
                } else {
                    iVar2.a(iVar, i10);
                }
            } catch (p7.a unused) {
                ((c) lVar).a(iVar, i10 + 1, false);
            }
            runnable.run();
        } catch (Throwable th3) {
            runnable.run();
            throw th3;
        }
    }
}
