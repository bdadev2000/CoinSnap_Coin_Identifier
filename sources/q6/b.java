package q6;

import G7.j;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import androidx.cardview.widget.CardView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import s4.InterfaceC2699a;
import w.C2859a;

/* loaded from: classes3.dex */
public final class b implements InterfaceC2699a, SuccessContinuation {
    public synchronized c a() {
        c cVar;
        try {
            if (c.f22802f == null) {
                c.f22802f = new c();
            }
            cVar = c.f22802f;
            j.b(cVar);
        } catch (Throwable th) {
            throw th;
        }
        return cVar;
    }

    public void b(k8.c cVar, float f9) {
        C2859a c2859a = (C2859a) ((Drawable) cVar.b);
        CardView cardView = (CardView) cVar.f21500c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f9 != c2859a.f23650e || c2859a.f23651f != useCompatPadding || c2859a.f23652g != preventCornerOverlap) {
            c2859a.f23650e = f9;
            c2859a.f23651f = useCompatPadding;
            c2859a.f23652g = preventCornerOverlap;
            c2859a.b(null);
            c2859a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            cVar.d(0, 0, 0, 0);
            return;
        }
        C2859a c2859a2 = (C2859a) ((Drawable) cVar.b);
        float f10 = c2859a2.f23650e;
        float f11 = c2859a2.f23647a;
        int ceil = (int) Math.ceil(w.b.a(f10, f11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(w.b.b(f10, f11, cardView.getPreventCornerOverlap()));
        cVar.d(ceil, ceil2, ceil, ceil2);
    }

    @Override // s4.InterfaceC2699a
    public void h(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }
}
