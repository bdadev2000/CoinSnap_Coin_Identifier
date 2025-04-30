package I6;

import G7.j;
import G7.k;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Y;
import f.l;
import f.n;
import f.x;
import t7.y;

/* loaded from: classes3.dex */
public final class e extends k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, int i9) {
        super(0);
        this.b = i9;
        this.f1475c = lVar;
    }

    @Override // F7.a
    public final Object invoke() {
        Bundle bundle;
        switch (this.b) {
            case 0:
                return this.f1475c.getDefaultViewModelProviderFactory();
            case 1:
                return this.f1475c.getViewModelStore();
            case 2:
                return this.f1475c.getDefaultViewModelCreationExtras();
            case 3:
                return this.f1475c.getDefaultViewModelProviderFactory();
            case 4:
                return this.f1475c.getViewModelStore();
            case 5:
                return this.f1475c.getDefaultViewModelCreationExtras();
            case 6:
                return this.f1475c.getDefaultViewModelProviderFactory();
            case 7:
                return this.f1475c.getViewModelStore();
            case 8:
                return this.f1475c.getDefaultViewModelCreationExtras();
            case 9:
                l lVar = this.f1475c;
                Application application = lVar.getApplication();
                if (lVar.getIntent() != null) {
                    bundle = lVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new Y(application, lVar, bundle);
            case 10:
                this.f1475c.reportFullyDrawn();
                return y.f23029a;
            case 11:
                l lVar2 = this.f1475c;
                return new n(l.access$getReportFullyDrawnExecutor$p(lVar2), new e(lVar2, 10));
            case 12:
                l lVar3 = this.f1475c;
                x xVar = new x(new f.d(lVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new com.facebook.appevents.k(10, lVar3, xVar));
                    } else {
                        l.access$addObserverForBackInvoker(lVar3, xVar);
                    }
                }
                return xVar;
            case 13:
                return this.f1475c.getDefaultViewModelProviderFactory();
            case 14:
                return this.f1475c.getViewModelStore();
            default:
                return this.f1475c.getDefaultViewModelCreationExtras();
        }
    }
}
