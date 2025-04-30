package x6;

import G7.j;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import d0.AbstractC2155b;
import d0.AbstractC2158e;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractDialogC2927c extends Dialog {
    public final AbstractC2158e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC2927c(Context context, int i9) {
        super(context, i9);
        j.e(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AbstractC2158e b = AbstractC2155b.b(b(), LayoutInflater.from(getContext()), null);
        j.e(b, "<set-?>");
        this.b = b;
        setContentView(a().f19787f);
    }

    public final AbstractC2158e a() {
        AbstractC2158e abstractC2158e = this.b;
        if (abstractC2158e != null) {
            return abstractC2158e;
        }
        j.k("binding");
        throw null;
    }

    public abstract int b();

    public abstract void c();

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
        d();
    }

    public void d() {
    }
}
