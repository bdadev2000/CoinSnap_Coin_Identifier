package q;

import android.content.Context;
import android.view.View;
import com.tools.arruler.photomeasure.camera.ruler.R;
import k.C2426o;
import p.MenuC2533l;
import p.SubMenuC2521D;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597f extends p.v {
    public final /* synthetic */ int m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2605j f22653n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597f(C2605j c2605j, Context context, MenuC2533l menuC2533l, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, menuC2533l, true);
        this.f22653n = c2605j;
        this.f22163g = 8388613;
        C2426o c2426o = c2605j.f22679y;
        this.f22165i = c2426o;
        p.t tVar = this.f22166j;
        if (tVar != null) {
            tVar.e(c2426o);
        }
    }

    @Override // p.v
    public final void c() {
        switch (this.m) {
            case 0:
                this.f22653n.f22676v = null;
                super.c();
                return;
            default:
                C2605j c2605j = this.f22653n;
                MenuC2533l menuC2533l = c2605j.f22661d;
                if (menuC2533l != null) {
                    menuC2533l.c(true);
                }
                c2605j.f22675u = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597f(C2605j c2605j, Context context, SubMenuC2521D subMenuC2521D, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC2521D, false);
        this.f22653n = c2605j;
        if (!subMenuC2521D.f22049C.f()) {
            View view2 = c2605j.f22667k;
            this.f22162f = view2 == null ? (View) c2605j.f22666j : view2;
        }
        C2426o c2426o = c2605j.f22679y;
        this.f22165i = c2426o;
        p.t tVar = this.f22166j;
        if (tVar != null) {
            tVar.e(c2426o);
        }
    }
}
