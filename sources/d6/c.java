package D6;

import D6.c;
import F7.l;
import G7.j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import t7.InterfaceC2714c;
import t7.y;
import u6.L;
import u6.N;
import u6.U;
import u6.W;
import x6.AbstractDialogC2927c;

/* loaded from: classes3.dex */
public final class c extends AbstractDialogC2927c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f755c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2714c f756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, E6.d dVar) {
        super(context, R.style.ThemeDialog);
        j.e(context, "context");
        this.f756d = dVar;
    }

    @Override // x6.AbstractDialogC2927c
    public final int b() {
        switch (this.f755c) {
            case 0:
                return R.layout.dialog_premium;
            case 1:
                return R.layout.dialog_camera_permission;
            case 2:
                return R.layout.dialog_confirm_delete_picture;
            default:
                return R.layout.dialog_rate_app;
        }
    }

    @Override // x6.AbstractDialogC2927c
    public final void c() {
        switch (this.f755c) {
            case 0:
                AppCompatImageView appCompatImageView = ((U) a()).f23225q;
                j.d(appCompatImageView, "imvClose");
                final int i9 = 0;
                com.bumptech.glide.d.I(appCompatImageView, new l(this) { // from class: D6.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f754c;

                    {
                        this.f754c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i9) {
                            case 0:
                                c cVar = this.f754c;
                                j.e(cVar, "this$0");
                                cVar.dismiss();
                                return y.f23029a;
                            default:
                                c cVar2 = this.f754c;
                                j.e(cVar2, "this$0");
                                ((F7.a) cVar2.f756d).invoke();
                                cVar2.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatTextView appCompatTextView = ((U) a()).f23226r;
                j.d(appCompatTextView, "tvGetPremium");
                final int i10 = 1;
                com.bumptech.glide.d.I(appCompatTextView, new l(this) { // from class: D6.b

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f754c;

                    {
                        this.f754c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                c cVar = this.f754c;
                                j.e(cVar, "this$0");
                                cVar.dismiss();
                                return y.f23029a;
                            default:
                                c cVar2 = this.f754c;
                                j.e(cVar2, "this$0");
                                ((F7.a) cVar2.f756d).invoke();
                                cVar2.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                return;
            case 1:
                setCancelable(false);
                return;
            case 2:
                setCancelable(false);
                return;
            default:
                ((W) a()).f23234v.setPaintFlags(8);
                return;
        }
    }

    @Override // x6.AbstractDialogC2927c
    public void d() {
        switch (this.f755c) {
            case 1:
                L l = (L) a();
                final int i9 = 0;
                l.f23205q.setOnClickListener(new View.OnClickListener(this) { // from class: E6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ D6.c f1041c;

                    {
                        this.f1041c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                D6.c cVar = this.f1041c;
                                j.e(cVar, "this$0");
                                ((F7.a) cVar.f756d).invoke();
                                cVar.dismiss();
                                return;
                            default:
                                D6.c cVar2 = this.f1041c;
                                j.e(cVar2, "this$0");
                                cVar2.dismiss();
                                return;
                        }
                    }
                });
                L l2 = (L) a();
                final int i10 = 1;
                l2.f23206r.setOnClickListener(new View.OnClickListener(this) { // from class: E6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ D6.c f1041c;

                    {
                        this.f1041c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                D6.c cVar = this.f1041c;
                                j.e(cVar, "this$0");
                                ((F7.a) cVar.f756d).invoke();
                                cVar.dismiss();
                                return;
                            default:
                                D6.c cVar2 = this.f1041c;
                                j.e(cVar2, "this$0");
                                cVar2.dismiss();
                                return;
                        }
                    }
                });
                return;
            case 2:
                N n2 = (N) a();
                final int i11 = 0;
                n2.f23210r.setOnClickListener(new View.OnClickListener(this) { // from class: P6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f2437c;

                    {
                        this.f2437c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                c cVar = this.f2437c;
                                j.e(cVar, "this$0");
                                ((F7.a) cVar.f756d).invoke();
                                cVar.dismiss();
                                return;
                            default:
                                c cVar2 = this.f2437c;
                                j.e(cVar2, "this$0");
                                cVar2.dismiss();
                                return;
                        }
                    }
                });
                N n9 = (N) a();
                final int i12 = 1;
                n9.f23211s.setOnClickListener(new View.OnClickListener(this) { // from class: P6.a

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f2437c;

                    {
                        this.f2437c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                c cVar = this.f2437c;
                                j.e(cVar, "this$0");
                                ((F7.a) cVar.f756d).invoke();
                                cVar.dismiss();
                                return;
                            default:
                                c cVar2 = this.f2437c;
                                j.e(cVar2, "this$0");
                                cVar2.dismiss();
                                return;
                        }
                    }
                });
                return;
            case 3:
                AppCompatImageView appCompatImageView = ((W) a()).f23229q;
                j.d(appCompatImageView, "imgStart1");
                final int i13 = 0;
                com.bumptech.glide.d.I(appCompatImageView, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatImageView appCompatImageView2 = ((W) a()).f23230r;
                j.d(appCompatImageView2, "imgStart2");
                final int i14 = 1;
                com.bumptech.glide.d.I(appCompatImageView2, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatImageView appCompatImageView3 = ((W) a()).f23231s;
                j.d(appCompatImageView3, "imgStart3");
                final int i15 = 2;
                com.bumptech.glide.d.I(appCompatImageView3, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatImageView appCompatImageView4 = ((W) a()).f23232t;
                j.d(appCompatImageView4, "imgStart4");
                final int i16 = 3;
                com.bumptech.glide.d.I(appCompatImageView4, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                AppCompatImageView appCompatImageView5 = ((W) a()).f23233u;
                j.d(appCompatImageView5, "imgStart5");
                final int i17 = 4;
                com.bumptech.glide.d.I(appCompatImageView5, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                TextView textView = ((W) a()).f23234v;
                j.d(textView, "tvLater");
                final int i18 = 5;
                com.bumptech.glide.d.I(textView, new l(this) { // from class: D6.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ c f757c;

                    {
                        this.f757c = this;
                    }

                    @Override // F7.l
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                c cVar = this.f757c;
                                j.e(cVar, "this$0");
                                ((W) cVar.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar.a()).f23230r.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar.f756d).invoke(1);
                                cVar.dismiss();
                                return y.f23029a;
                            case 1:
                                c cVar2 = this.f757c;
                                j.e(cVar2, "this$0");
                                ((W) cVar2.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar2.a()).f23231s.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar2.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar2.f756d).invoke(2);
                                cVar2.dismiss();
                                return y.f23029a;
                            case 2:
                                c cVar3 = this.f757c;
                                j.e(cVar3, "this$0");
                                ((W) cVar3.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar3.a()).f23232t.setImageResource(R.drawable.ic_star_inactive);
                                ((W) cVar3.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar3.f756d).invoke(3);
                                cVar3.dismiss();
                                return y.f23029a;
                            case 3:
                                c cVar4 = this.f757c;
                                j.e(cVar4, "this$0");
                                ((W) cVar4.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar4.a()).f23233u.setImageResource(R.drawable.ic_star_inactive);
                                ((l) cVar4.f756d).invoke(4);
                                cVar4.dismiss();
                                return y.f23029a;
                            case 4:
                                c cVar5 = this.f757c;
                                j.e(cVar5, "this$0");
                                ((W) cVar5.a()).f23229q.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23230r.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23231s.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23232t.setImageResource(R.drawable.ic_star_active);
                                ((W) cVar5.a()).f23233u.setImageResource(R.drawable.ic_star_active);
                                ((l) cVar5.f756d).invoke(5);
                                cVar5.dismiss();
                                return y.f23029a;
                            default:
                                c cVar6 = this.f757c;
                                j.e(cVar6, "this$0");
                                cVar6.dismiss();
                                return y.f23029a;
                        }
                    }
                });
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, C6.a aVar) {
        super(context, R.style.BaseDialog);
        j.e(context, "context");
        this.f756d = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, F7.a aVar) {
        super(context, R.style.ThemeDialog);
        j.e(context, "context");
        this.f756d = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, z6.c cVar) {
        super(context, R.style.ThemeDialog);
        j.e(context, "context");
        this.f756d = cVar;
    }
}
