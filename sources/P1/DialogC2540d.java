package p1;

import B3.n;
import B3.o;
import B3.p;
import B3.q;
import J1.i;
import J1.j;
import J1.l;
import J1.m;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.iap.IAPActivity;
import j5.C2400c;
import java.util.ArrayList;
import k.y;
import u1.AbstractC2748a;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC2540d extends y {

    /* renamed from: h, reason: collision with root package name */
    public BottomSheetBehavior f22189h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f22190i;

    /* renamed from: j, reason: collision with root package name */
    public CoordinatorLayout f22191j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f22192k;
    public boolean l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22193n;

    /* renamed from: o, reason: collision with root package name */
    public q f22194o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22195p;

    /* renamed from: q, reason: collision with root package name */
    public C.c f22196q;

    /* renamed from: r, reason: collision with root package name */
    public p f22197r;

    /* renamed from: s, reason: collision with root package name */
    public m f22198s;

    /* renamed from: t, reason: collision with root package name */
    public int f22199t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f22200u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f22201v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f22202w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f22203x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f22204y;

    /* renamed from: z, reason: collision with root package name */
    public C2400c f22205z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f22189h == null) {
            g();
        }
        super.cancel();
    }

    public final void g() {
        if (this.f22190i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f22190i = frameLayout;
            this.f22191j = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f22190i.findViewById(R.id.design_bottom_sheet);
            this.f22192k = frameLayout2;
            BottomSheetBehavior A8 = BottomSheetBehavior.A(frameLayout2);
            this.f22189h = A8;
            p pVar = this.f22197r;
            ArrayList arrayList = A8.f13935W;
            if (!arrayList.contains(pVar)) {
                arrayList.add(pVar);
            }
            this.f22189h.F(this.l);
            this.f22196q = new C.c(this.f22189h, this.f22192k);
        }
    }

    public final void h(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void i() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f22189h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f13925L == 5) {
            bottomSheetBehavior.H(4);
        }
    }

    public final FrameLayout j(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f22190i.findViewById(R.id.coordinator);
        if (i9 != 0 && view == null) {
            view = getLayoutInflater().inflate(i9, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f22195p) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f22192k, new C2400c(this, 1));
        }
        this.f22192k.removeAllViews();
        if (layoutParams == null) {
            this.f22192k.addView(view);
        } else {
            this.f22192k.addView(view, layoutParams);
        }
        int i10 = 0;
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new B3.m(this, i10));
        ViewCompat.setAccessibilityDelegate(this.f22192k, new n(this, i10));
        this.f22192k.setOnTouchListener(new o(0));
        return this.f22190i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z8;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f22195p && Color.alpha(window.getNavigationBarColor()) < 255) {
                z8 = true;
            } else {
                z8 = false;
            }
            FrameLayout frameLayout = this.f22190i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z8);
            }
            CoordinatorLayout coordinatorLayout = this.f22191j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z8);
            }
            com.bumptech.glide.c.S(window, !z8);
            q qVar = this.f22194o;
            if (qVar != null) {
                qVar.e(window);
            }
        }
        C.c cVar = this.f22196q;
        if (cVar != null) {
            boolean z9 = this.l;
            View view = (View) cVar.f349f;
            M3.e eVar = (M3.e) cVar.f347c;
            if (z9) {
                if (eVar != null) {
                    eVar.b((M3.b) cVar.f348d, view, false);
                }
            } else if (eVar != null) {
                eVar.c(view);
            }
        }
    }

    @Override // k.y, f.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        h(bundle);
        setContentView(R.layout.view_billing_test);
        this.f22200u = (TextView) findViewById(R.id.txtTitle);
        this.f22201v = (TextView) findViewById(R.id.txtDescription);
        this.f22202w = (TextView) findViewById(R.id.txtId);
        this.f22203x = (TextView) findViewById(R.id.txtPrice);
        this.f22204y = (TextView) findViewById(R.id.txtContinuePurchase);
        m mVar = this.f22198s;
        if (mVar == null) {
            if (AbstractC2748a.f23066a.booleanValue()) {
                final int i9 = 0;
                this.f22204y.setOnClickListener(new View.OnClickListener(this) { // from class: p1.c

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ DialogC2540d f22188c;

                    {
                        this.f22188c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DialogC2540d dialogC2540d = this.f22188c;
                        switch (i9) {
                            case 0:
                                dialogC2540d.getClass();
                                C2538b.a().m = true;
                                C2400c c2400c = dialogC2540d.f22205z;
                                if (c2400c != null) {
                                    int i10 = IAPActivity.f19655h;
                                    ((IAPActivity) c2400c.f21107c).t();
                                }
                                dialogC2540d.dismiss();
                                return;
                            case 1:
                                dialogC2540d.dismiss();
                                return;
                            default:
                                dialogC2540d.getClass();
                                C2538b.a().m = true;
                                C2400c c2400c2 = dialogC2540d.f22205z;
                                if (c2400c2 != null) {
                                    String str = dialogC2540d.f22198s.f1529c;
                                    int i11 = IAPActivity.f19655h;
                                    ((IAPActivity) c2400c2.f21107c).t();
                                }
                                dialogC2540d.dismiss();
                                return;
                        }
                    }
                });
                return;
            } else {
                final int i10 = 1;
                this.f22204y.setOnClickListener(new View.OnClickListener(this) { // from class: p1.c

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ DialogC2540d f22188c;

                    {
                        this.f22188c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DialogC2540d dialogC2540d = this.f22188c;
                        switch (i10) {
                            case 0:
                                dialogC2540d.getClass();
                                C2538b.a().m = true;
                                C2400c c2400c = dialogC2540d.f22205z;
                                if (c2400c != null) {
                                    int i102 = IAPActivity.f19655h;
                                    ((IAPActivity) c2400c.f21107c).t();
                                }
                                dialogC2540d.dismiss();
                                return;
                            case 1:
                                dialogC2540d.dismiss();
                                return;
                            default:
                                dialogC2540d.getClass();
                                C2538b.a().m = true;
                                C2400c c2400c2 = dialogC2540d.f22205z;
                                if (c2400c2 != null) {
                                    String str = dialogC2540d.f22198s.f1529c;
                                    int i11 = IAPActivity.f19655h;
                                    ((IAPActivity) c2400c2.f21107c).t();
                                }
                                dialogC2540d.dismiss();
                                return;
                        }
                    }
                });
                return;
            }
        }
        this.f22200u.setText(mVar.f1531e);
        this.f22201v.setText(mVar.f1532f);
        this.f22202w.setText(mVar.f1529c);
        String str = "$2.00";
        if (this.f22199t == 1) {
            i a6 = mVar.a();
            if (a6 != null) {
                str = a6.f1521a;
            }
            this.f22203x.setText(str);
        } else {
            ArrayList arrayList = mVar.f1535i;
            if (arrayList != null && !arrayList.isEmpty()) {
                str = ((j) ((l) arrayList.get(0)).b.f1526a.get(0)).f1524a;
            }
            this.f22203x.setText(str);
        }
        final int i11 = 2;
        this.f22204y.setOnClickListener(new View.OnClickListener(this) { // from class: p1.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DialogC2540d f22188c;

            {
                this.f22188c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC2540d dialogC2540d = this.f22188c;
                switch (i11) {
                    case 0:
                        dialogC2540d.getClass();
                        C2538b.a().m = true;
                        C2400c c2400c = dialogC2540d.f22205z;
                        if (c2400c != null) {
                            int i102 = IAPActivity.f19655h;
                            ((IAPActivity) c2400c.f21107c).t();
                        }
                        dialogC2540d.dismiss();
                        return;
                    case 1:
                        dialogC2540d.dismiss();
                        return;
                    default:
                        dialogC2540d.getClass();
                        C2538b.a().m = true;
                        C2400c c2400c2 = dialogC2540d.f22205z;
                        if (c2400c2 != null) {
                            String str2 = dialogC2540d.f22198s.f1529c;
                            int i112 = IAPActivity.f19655h;
                            ((IAPActivity) c2400c2.f21107c).t();
                        }
                        dialogC2540d.dismiss();
                        return;
                }
            }
        });
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        M3.e eVar;
        q qVar = this.f22194o;
        if (qVar != null) {
            qVar.e(null);
        }
        C.c cVar = this.f22196q;
        if (cVar != null && (eVar = (M3.e) cVar.f347c) != null) {
            eVar.c((View) cVar.f349f);
        }
    }

    @Override // f.m, android.app.Dialog
    public final void onStart() {
        i();
        getWindow().setLayout(-1, -2);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z8) {
        C.c cVar;
        super.setCancelable(z8);
        if (this.l != z8) {
            this.l = z8;
            BottomSheetBehavior bottomSheetBehavior = this.f22189h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z8);
            }
            if (getWindow() != null && (cVar = this.f22196q) != null) {
                boolean z9 = this.l;
                View view = (View) cVar.f349f;
                M3.e eVar = (M3.e) cVar.f347c;
                if (z9) {
                    if (eVar != null) {
                        eVar.b((M3.b) cVar.f348d, view, false);
                    }
                } else if (eVar != null) {
                    eVar.c(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z8) {
        super.setCanceledOnTouchOutside(z8);
        if (z8 && !this.l) {
            this.l = true;
        }
        this.m = z8;
        this.f22193n = true;
    }

    @Override // k.y, f.m, android.app.Dialog
    public final void setContentView(int i9) {
        super.setContentView(j(null, i9, null));
    }

    @Override // k.y, f.m, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // k.y, f.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
