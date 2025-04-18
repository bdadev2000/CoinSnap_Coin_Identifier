package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements k.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f916b;

    /* renamed from: c, reason: collision with root package name */
    public Context f917c;

    /* renamed from: d, reason: collision with root package name */
    public k.o f918d;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f919f;

    /* renamed from: g, reason: collision with root package name */
    public k.b0 f920g;

    /* renamed from: j, reason: collision with root package name */
    public k.e0 f923j;

    /* renamed from: k, reason: collision with root package name */
    public l f924k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f925l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f926m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f927n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f928o;

    /* renamed from: p, reason: collision with root package name */
    public int f929p;

    /* renamed from: q, reason: collision with root package name */
    public int f930q;

    /* renamed from: r, reason: collision with root package name */
    public int f931r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f932s;
    public h u;

    /* renamed from: v, reason: collision with root package name */
    public h f934v;

    /* renamed from: w, reason: collision with root package name */
    public j f935w;

    /* renamed from: x, reason: collision with root package name */
    public i f936x;

    /* renamed from: h, reason: collision with root package name */
    public final int f921h = R.layout.abc_action_menu_layout;

    /* renamed from: i, reason: collision with root package name */
    public final int f922i = R.layout.abc_action_menu_item_layout;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f933t = new SparseBooleanArray();

    /* renamed from: y, reason: collision with root package name */
    public final kc.c f937y = new kc.c(this, 3);

    public m(Context context) {
        this.f916b = context;
        this.f919f = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.d0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(k.q qVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = qVar.getActionView();
        int i10 = 0;
        if (actionView == null || qVar.e()) {
            if (view instanceof k.d0) {
                actionMenuItemView = (k.d0) view;
            } else {
                actionMenuItemView = (k.d0) this.f919f.inflate(this.f922i, viewGroup, false);
            }
            actionMenuItemView.c(qVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f923j);
            if (this.f936x == null) {
                this.f936x = new i(this);
            }
            actionMenuItemView2.setPopupCallback(this.f936x);
            actionView = actionMenuItemView;
        }
        if (qVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z10) {
        j();
        h hVar = this.f934v;
        if (hVar != null && hVar.b()) {
            hVar.f20050j.dismiss();
        }
        k.b0 b0Var = this.f920g;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // k.c0
    public final /* bridge */ /* synthetic */ boolean c(k.q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.c0
    public final void d() {
        int i10;
        boolean z10;
        k.q qVar;
        ViewGroup viewGroup = (ViewGroup) this.f923j;
        ArrayList arrayList = null;
        boolean z11 = false;
        if (viewGroup != null) {
            k.o oVar = this.f918d;
            if (oVar != null) {
                oVar.i();
                ArrayList l10 = this.f918d.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    k.q qVar2 = (k.q) l10.get(i11);
                    if (qVar2.f()) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.d0) {
                            qVar = ((k.d0) childAt).getItemData();
                        } else {
                            qVar = null;
                        }
                        View a = a(qVar2, childAt, viewGroup);
                        if (qVar2 != qVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f923j).addView(a, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f924k) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z10 = true;
                }
                if (!z10) {
                    i10++;
                }
            }
        }
        ((View) this.f923j).requestLayout();
        k.o oVar2 = this.f918d;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f20132i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                k.r rVar = ((k.q) arrayList2.get(i12)).A;
            }
        }
        k.o oVar3 = this.f918d;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f20133j;
        }
        if (this.f927n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !((k.q) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f924k == null) {
                this.f924k = new l(this, this.f916b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f924k.getParent();
            if (viewGroup3 != this.f923j) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f924k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f923j;
                l lVar = this.f924k;
                actionMenuView.getClass();
                o oVar4 = new o();
                ((LinearLayout.LayoutParams) oVar4).gravity = 16;
                oVar4.a = true;
                actionMenuView.addView(lVar, oVar4);
            }
        } else {
            l lVar2 = this.f924k;
            if (lVar2 != null) {
                Object parent = lVar2.getParent();
                Object obj = this.f923j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f924k);
                }
            }
        }
        ((ActionMenuView) this.f923j).setOverflowReserved(this.f927n);
    }

    @Override // k.c0
    public final /* bridge */ /* synthetic */ boolean e(k.q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // k.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(k.i0 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            k.o r2 = r0.f20109z
            k.o r3 = r8.f918d
            if (r2 == r3) goto L13
            r0 = r2
            k.i0 r0 = (k.i0) r0
            goto L9
        L13:
            k.e0 r2 = r8.f923j
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof k.d0
            if (r6 == 0) goto L35
            r6 = r5
            k.d0 r6 = (k.d0) r6
            k.q r6 = r6.getItemData()
            k.q r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            k.q r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = r3
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = r1
        L5f:
            androidx.appcompat.widget.h r2 = new androidx.appcompat.widget.h
            android.content.Context r4 = r8.f917c
            r2.<init>(r8, r4, r9, r5)
            r8.f934v = r2
            r2.f20048h = r0
            k.x r2 = r2.f20050j
            if (r2 == 0) goto L71
            r2.n(r0)
        L71:
            androidx.appcompat.widget.h r0 = r8.f934v
            boolean r2 = r0.b()
            if (r2 == 0) goto L7b
        L79:
            r1 = r3
            goto L84
        L7b:
            android.view.View r2 = r0.f20046f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.d(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            k.b0 r0 = r8.f920g
            if (r0 == 0) goto L8d
            r0.i(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m.f(k.i0):boolean");
    }

    @Override // k.c0
    public final void g(k.b0 b0Var) {
        this.f920g = b0Var;
    }

    @Override // k.c0
    public final boolean h() {
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        k.o oVar = this.f918d;
        if (oVar != null) {
            arrayList = oVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = this.f931r;
        int i13 = this.f930q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f923j;
        int i14 = 0;
        boolean z17 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            k.q qVar = (k.q) arrayList.get(i14);
            int i17 = qVar.f20172y;
            if ((i17 & 2) == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i16++;
                } else {
                    z17 = true;
                }
            }
            if (this.f932s && qVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.f927n && (z17 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.f933t;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            k.q qVar2 = (k.q) arrayList.get(i19);
            int i21 = qVar2.f20172y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i22 = qVar2.f20150b;
            if (z11) {
                View a = a(qVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                qVar2.g(z10);
            } else {
                if ((i21 & 1) == z10) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    boolean z18 = sparseBooleanArray.get(i22);
                    if ((i18 > 0 || z18) && i13 > 0) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a10 = a(qVar2, null, viewGroup);
                        a10.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a10.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z13 &= z14;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z18) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i19; i23++) {
                            k.q qVar3 = (k.q) arrayList.get(i23);
                            if (qVar3.f20150b == i22) {
                                if (qVar3.f()) {
                                    i18++;
                                }
                                qVar3.g(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    qVar2.g(z13);
                } else {
                    qVar2.g(false);
                    i19++;
                    i11 = 2;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return z10;
    }

    @Override // k.c0
    public final void i(Context context, k.o oVar) {
        this.f917c = context;
        LayoutInflater.from(context);
        this.f918d = oVar;
        Resources resources = context.getResources();
        j.a aVar = new j.a(context);
        if (!this.f928o) {
            this.f927n = true;
        }
        this.f929p = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f931r = aVar.a();
        int i10 = this.f929p;
        if (this.f927n) {
            if (this.f924k == null) {
                l lVar = new l(this, this.f916b);
                this.f924k = lVar;
                if (this.f926m) {
                    lVar.setImageDrawable(this.f925l);
                    this.f925l = null;
                    this.f926m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f924k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f924k.getMeasuredWidth();
        } else {
            this.f924k = null;
        }
        this.f930q = i10;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        Object obj;
        j jVar = this.f935w;
        if (jVar != null && (obj = this.f923j) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.f935w = null;
            return true;
        }
        h hVar = this.u;
        if (hVar != null) {
            if (hVar.b()) {
                hVar.f20050j.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean k() {
        h hVar = this.u;
        return hVar != null && hVar.b();
    }

    public final boolean l() {
        k.o oVar;
        int i10 = 0;
        if (this.f927n && !k() && (oVar = this.f918d) != null && this.f923j != null && this.f935w == null) {
            oVar.i();
            if (!oVar.f20133j.isEmpty()) {
                j jVar = new j(i10, this, new h(this, this.f917c, this.f918d, this.f924k));
                this.f935w = jVar;
                ((View) this.f923j).post(jVar);
                return true;
            }
        }
        return false;
    }
}
