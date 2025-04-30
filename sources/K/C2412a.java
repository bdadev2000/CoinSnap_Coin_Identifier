package k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2412a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C2415d b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2413b f21261c;

    public C2412a(C2413b c2413b, C2415d c2415d) {
        this.f21261c = c2413b;
        this.b = c2415d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j7) {
        C2413b c2413b = this.f21261c;
        DialogInterface.OnClickListener onClickListener = c2413b.m;
        C2415d c2415d = this.b;
        onClickListener.onClick(c2415d.b, i9);
        if (!c2413b.f21272n) {
            c2415d.b.dismiss();
        }
    }
}
