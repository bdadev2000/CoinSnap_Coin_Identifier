package l0;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends j0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21549a = 0;
    public final WeakReference b;

    public h(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // j0.h
    public void a() {
        switch (this.f21549a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // j0.h
    public final void b() {
        switch (this.f21549a) {
            case 0:
                i.a((EditText) this.b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
