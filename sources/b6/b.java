package B6;

import F7.l;
import G7.j;
import a.AbstractC0325a;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.d;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j6.f;
import k.AbstractActivityC2417f;
import p1.C2538b;
import q.C2609l;
import r6.h;
import t7.y;
import u6.P;
import u6.S;
import x6.AbstractDialogC2927c;
import z6.c;

/* loaded from: classes3.dex */
public final class b extends AbstractDialogC2927c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f333c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final F7.a f334d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar, f fVar) {
        super(context, R.style.ThemeDialog);
        j.e(context, "context");
        this.f334d = cVar;
        this.f335f = fVar;
    }

    @Override // x6.AbstractDialogC2927c
    public final int b() {
        switch (this.f333c) {
            case 0:
                return R.layout.dialog_exit_action;
            default:
                return R.layout.dialog_exit;
        }
    }

    @Override // x6.AbstractDialogC2927c
    public final void c() {
        switch (this.f333c) {
            case 0:
                setCancelable(false);
                int i9 = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.9d);
                Window window = getWindow();
                if (window != null) {
                    window.setLayout(i9, -2);
                    return;
                }
                return;
            default:
                AppCompatTextView appCompatTextView = ((S) a()).f23220s;
                j.d(appCompatTextView, "tvCancel");
                final int i10 = 0;
                d.I(appCompatTextView, new l(this) { // from class: D6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ B6.b f753c;

                    {
                        this.f753c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                B6.b bVar = this.f753c;
                                j.e(bVar, "this$0");
                                bVar.dismiss();
                                return y.f23029a;
                            default:
                                B6.b bVar2 = this.f753c;
                                j.e(bVar2, "this$0");
                                bVar2.dismiss();
                                bVar2.f334d.invoke();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatTextView appCompatTextView2 = ((S) a()).f23221t;
                j.d(appCompatTextView2, "tvContinue");
                final int i11 = 1;
                d.I(appCompatTextView2, new l(this) { // from class: D6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ B6.b f753c;

                    {
                        this.f753c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i11) {
                            case 0:
                                B6.b bVar = this.f753c;
                                j.e(bVar, "this$0");
                                bVar.dismiss();
                                return y.f23029a;
                            default:
                                B6.b bVar2 = this.f753c;
                                j.e(bVar2, "this$0");
                                bVar2.dismiss();
                                bVar2.f334d.invoke();
                                return y.f23029a;
                        }
                    }
                });
                try {
                    e();
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
        }
    }

    @Override // x6.AbstractDialogC2927c
    public void d() {
        switch (this.f333c) {
            case 0:
                P p2 = (P) a();
                final int i9 = 0;
                p2.f23215r.setOnClickListener(new View.OnClickListener(this) { // from class: B6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ b f332c;

                    {
                        this.f332c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                b bVar = this.f332c;
                                j.e(bVar, "this$0");
                                bVar.dismiss();
                                bVar.f334d.invoke();
                                return;
                            default:
                                b bVar2 = this.f332c;
                                j.e(bVar2, "this$0");
                                bVar2.dismiss();
                                ((F7.a) bVar2.f335f).invoke();
                                return;
                        }
                    }
                });
                P p7 = (P) a();
                final int i10 = 1;
                p7.f23214q.setOnClickListener(new View.OnClickListener(this) { // from class: B6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ b f332c;

                    {
                        this.f332c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                b bVar = this.f332c;
                                j.e(bVar, "this$0");
                                bVar.dismiss();
                                bVar.f334d.invoke();
                                return;
                            default:
                                b bVar2 = this.f332c;
                                j.e(bVar2, "this$0");
                                bVar2.dismiss();
                                ((F7.a) bVar2.f335f).invoke();
                                return;
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    public void e() {
        q6.c a6 = q6.c.f22801e.a();
        boolean z8 = false;
        try {
            if (a6.f22803a) {
                k5.b bVar = a6.f22805d;
                if (bVar != null) {
                    z8 = bVar.c("Native_exit");
                } else {
                    j.k("remoteConfig");
                    throw null;
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (z8) {
            AbstractActivityC2417f abstractActivityC2417f = (AbstractActivityC2417f) this.f335f;
            if (AbstractC0325a.i(abstractActivityC2417f) && !C2538b.a().m) {
                C2609l c2609l = h.f22921e;
                c2609l.i().b(abstractActivityC2417f, "ca-app-pub-6691965685689933/7775077186", true);
                h i9 = c2609l.i();
                FrameLayout frameLayout = ((S) a()).f23218q;
                j.d(frameLayout, "frAds");
                ShimmerFrameLayout shimmerFrameLayout = ((S) a()).f23219r.f23197q;
                j.d(shimmerFrameLayout, "shimmerNativeLarge");
                h.c(i9, abstractActivityC2417f, "ca-app-pub-6691965685689933/7775077186", frameLayout, shimmerFrameLayout);
                return;
            }
        }
        FrameLayout frameLayout2 = ((S) a()).f23218q;
        j.d(frameLayout2, "frAds");
        d.M(frameLayout2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractActivityC2417f abstractActivityC2417f, E6.d dVar) {
        super(abstractActivityC2417f, R.style.ThemeDialog);
        j.e(abstractActivityC2417f, "activity");
        this.f335f = abstractActivityC2417f;
        this.f334d = dVar;
    }
}
