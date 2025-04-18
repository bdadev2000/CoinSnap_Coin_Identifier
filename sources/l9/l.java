package l9;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import o9.z;
import s7.f2;
import s7.g2;
import s7.h2;
import s7.i0;
import s7.v2;
import s7.x2;
import s7.z2;

/* loaded from: classes3.dex */
public final class l implements f2, View.OnLayoutChangeListener, View.OnClickListener, j {

    /* renamed from: b, reason: collision with root package name */
    public final v2 f21240b = new v2();

    /* renamed from: c, reason: collision with root package name */
    public Object f21241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlayerView f21242d;

    public l(PlayerView playerView) {
        this.f21242d = playerView;
    }

    @Override // s7.f2
    public final void C(z zVar) {
        int i10 = PlayerView.B;
        this.f21242d.h();
    }

    @Override // s7.f2
    public final void F(int i10, g2 g2Var, g2 g2Var2) {
        k kVar;
        int i11 = PlayerView.B;
        PlayerView playerView = this.f21242d;
        if (playerView.b() && playerView.f11520y && (kVar = playerView.f11508l) != null) {
            kVar.b();
        }
    }

    @Override // s7.f2
    public final void G(z2 z2Var) {
        PlayerView playerView = this.f21242d;
        h2 h2Var = playerView.f11511o;
        h2Var.getClass();
        i0 i0Var = (i0) h2Var;
        x2 x10 = i0Var.x();
        if (x10.p()) {
            this.f21241c = null;
        } else {
            i0Var.S();
            boolean isEmpty = i0Var.f24403f0.f24272i.f20527d.f24897b.isEmpty();
            v2 v2Var = this.f21240b;
            if (!isEmpty) {
                this.f21241c = x10.f(i0Var.u(), v2Var, true).f24786c;
            } else {
                Object obj = this.f21241c;
                if (obj != null) {
                    int b3 = x10.b(obj);
                    if (b3 != -1) {
                        if (i0Var.t() == x10.f(b3, v2Var, false).f24787d) {
                            return;
                        }
                    }
                    this.f21241c = null;
                }
            }
        }
        playerView.l(false);
    }

    @Override // s7.f2
    public final void d(int i10) {
        int i11 = PlayerView.B;
        PlayerView playerView = this.f21242d;
        playerView.i();
        playerView.k();
        if (playerView.b() && playerView.f11520y) {
            k kVar = playerView.f11508l;
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        playerView.c(false);
    }

    @Override // s7.f2
    public final void g(a9.c cVar) {
        SubtitleView subtitleView = this.f21242d.f11505i;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f383b);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = PlayerView.B;
        this.f21242d.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        PlayerView.a((TextureView) view, this.f21242d.A);
    }

    @Override // s7.f2
    public final void onRenderedFirstFrame() {
        View view = this.f21242d.f11501d;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // s7.f2
    public final void x(int i10, boolean z10) {
        int i11 = PlayerView.B;
        PlayerView playerView = this.f21242d;
        playerView.i();
        if (playerView.b() && playerView.f11520y) {
            k kVar = playerView.f11508l;
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        playerView.c(false);
    }
}
