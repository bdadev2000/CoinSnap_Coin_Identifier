package B3;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b3.C0566k;
import k.C2415d;
import p.C2535n;
import p1.DialogC2540d;
import q.T0;

/* loaded from: classes2.dex */
public final class m implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f298c;

    public /* synthetic */ m(Object obj, int i9) {
        this.b = i9;
        this.f298c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        C2535n c2535n;
        switch (this.b) {
            case 0:
                DialogC2540d dialogC2540d = (DialogC2540d) this.f298c;
                if (dialogC2540d.l && dialogC2540d.isShowing()) {
                    if (!dialogC2540d.f22193n) {
                        TypedArray obtainStyledAttributes = dialogC2540d.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        dialogC2540d.m = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        dialogC2540d.f22193n = true;
                    }
                    if (dialogC2540d.m) {
                        dialogC2540d.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((C0566k) this.f298c).f5309j.showPrivacyActivity();
                return;
            case 2:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f298c;
                int i9 = jVar.f14029g;
                if (i9 == 2) {
                    jVar.c(1);
                    return;
                } else {
                    if (i9 == 1) {
                        jVar.c(2);
                        return;
                    }
                    return;
                }
            case 3:
                C2415d c2415d = (C2415d) this.f298c;
                if (view == c2415d.f21289h && (message4 = c2415d.f21291j) != null) {
                    message = Message.obtain(message4);
                } else if (view == c2415d.l && (message3 = c2415d.f21293n) != null) {
                    message = Message.obtain(message3);
                } else if (view == c2415d.f21295p && (message2 = c2415d.f21297r) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                c2415d.f21281H.obtainMessage(1, c2415d.b).sendToTarget();
                return;
            case 4:
                ((o.b) this.f298c).a();
                return;
            case 5:
                T0 t02 = ((Toolbar) this.f298c).f4290N;
                if (t02 == null) {
                    c2535n = null;
                } else {
                    c2535n = t02.f22594c;
                }
                if (c2535n != null) {
                    c2535n.collapseActionView();
                    return;
                }
                return;
            default:
                G7.j.e(view, "v");
                if (SystemClock.elapsedRealtime() - com.bumptech.glide.d.f12808k >= 300) {
                    ((F7.l) this.f298c).invoke(view);
                    com.bumptech.glide.d.f12808k = SystemClock.elapsedRealtime();
                    return;
                }
                return;
        }
    }
}
