package j6;

import M0.C0219j;
import U4.B;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.InterfaceC0495e;
import androidx.lifecycle.InterfaceC0511v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Iterator;
import o6.C2511a;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import u2.C2750b;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public final class m implements InterfaceC0495e {
    public static final /* synthetic */ int l = 0;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final j f21171c;

    /* renamed from: d, reason: collision with root package name */
    public final z4.c f21172d;

    /* renamed from: f, reason: collision with root package name */
    public final PopupWindow f21173f;

    /* renamed from: g, reason: collision with root package name */
    public final PopupWindow f21174g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21175h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21176i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2717f f21177j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2717f f21178k;

    static {
        AbstractC2712a.d(new f(1));
        AbstractC2712a.d(new f(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, j jVar) {
        AbstractC0505o lifecycle;
        VectorTextView vectorTextView;
        boolean z8;
        Integer num;
        this.b = context;
        this.f21171c = jVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i9 = R.id.balloon_arrow;
        ImageView imageView = (ImageView) C0219j.o(inflate, R.id.balloon_arrow);
        if (imageView != null) {
            i9 = R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) C0219j.o(inflate, R.id.balloon_card);
            if (radiusLayout != null) {
                i9 = R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) C0219j.o(inflate, R.id.balloon_content);
                if (frameLayout2 != null) {
                    i9 = R.id.balloon_text;
                    VectorTextView vectorTextView2 = (VectorTextView) C0219j.o(inflate, R.id.balloon_text);
                    if (vectorTextView2 != null) {
                        i9 = R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) C0219j.o(inflate, R.id.balloon_wrapper);
                        if (frameLayout3 != null) {
                            this.f21172d = new z4.c(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView2, frameLayout3);
                            View inflate2 = LayoutInflater.from(context).inflate(R.layout.balloon_layout_overlay, (ViewGroup) null, false);
                            if (inflate2 != null) {
                                BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) inflate2;
                                PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                                this.f21173f = popupWindow;
                                this.f21174g = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                                jVar.getClass();
                                EnumC2718g enumC2718g = EnumC2718g.f23019d;
                                this.f21177j = AbstractC2712a.c(enumC2718g, new f(0));
                                this.f21178k = AbstractC2712a.c(enumC2718g, new i(this, 0));
                                AbstractC2712a.c(enumC2718g, new i(this, 1));
                                radiusLayout.setAlpha(jVar.f21125F);
                                radiusLayout.setRadius(jVar.f21163u);
                                float f9 = jVar.f21126G;
                                ViewCompat.setElevation(radiusLayout, f9);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(jVar.f21162t);
                                gradientDrawable.setCornerRadius(jVar.f21163u);
                                radiusLayout.setBackground(gradientDrawable);
                                radiusLayout.setPadding(jVar.f21150f, jVar.f21151g, jVar.f21152h, jVar.f21153i);
                                ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                                G7.j.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, jVar.f21154j, jVar.f21155k);
                                popupWindow.setOutsideTouchable(true);
                                popupWindow.setFocusable(jVar.f21143Y);
                                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                                popupWindow.setElevation(f9);
                                popupWindow.setAttachedInDecor(jVar.f21146a0);
                                Integer num2 = jVar.f21127H;
                                if (num2 == null) {
                                    Context context2 = vectorTextView2.getContext();
                                    G7.j.d(context2, "getContext(...)");
                                    C2750b c2750b = new C2750b(context2);
                                    c2750b.f23081h = null;
                                    c2750b.b = jVar.f21121B;
                                    c2750b.f23076c = jVar.f21122C;
                                    c2750b.f23080g = jVar.f21124E;
                                    c2750b.f23077d = jVar.f21123D;
                                    t tVar = jVar.f21120A;
                                    G7.j.e(tVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    c2750b.f23082i = tVar;
                                    Drawable drawable = (Drawable) c2750b.f23081h;
                                    t tVar2 = (t) c2750b.f23082i;
                                    int i10 = c2750b.b;
                                    int i11 = c2750b.f23076c;
                                    int i12 = c2750b.f23077d;
                                    int i13 = c2750b.f23080g;
                                    String str = (String) c2750b.f23079f;
                                    if (drawable != null) {
                                        Integer valueOf = Integer.valueOf(i13);
                                        if (i13 != Integer.MIN_VALUE) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            num = valueOf;
                                        } else {
                                            num = null;
                                        }
                                        C2511a c2511a = new C2511a(null, null, null, null, str, Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), null, num, null, null, null, 238079);
                                        int ordinal = tVar2.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal != 1) {
                                                if (ordinal != 2) {
                                                    if (ordinal == 3) {
                                                        c2511a.f21992g = drawable;
                                                        c2511a.f21988c = null;
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                } else {
                                                    c2511a.f21993h = drawable;
                                                    c2511a.f21989d = null;
                                                }
                                            } else {
                                                c2511a.f21991f = drawable;
                                                c2511a.b = null;
                                            }
                                        } else {
                                            c2511a.f21990e = drawable;
                                            c2511a.f21987a = null;
                                        }
                                        vectorTextView = vectorTextView2;
                                        vectorTextView.setDrawableTextViewParams(c2511a);
                                    } else {
                                        vectorTextView = vectorTextView2;
                                    }
                                    C2511a c2511a2 = vectorTextView.b;
                                    if (c2511a2 != null) {
                                        c2511a2.f21994i = jVar.f21141W;
                                        C0219j.c(vectorTextView, c2511a2);
                                    }
                                    x xVar = jVar.f21168z;
                                    if (xVar != null) {
                                        C0219j.e(vectorTextView, xVar);
                                    } else {
                                        Context context3 = vectorTextView.getContext();
                                        G7.j.d(context3, "getContext(...)");
                                        w wVar = new w(context3);
                                        String str2 = jVar.f21164v;
                                        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                        wVar.b = str2;
                                        wVar.f21197c = jVar.f21166x;
                                        wVar.f21198d = jVar.f21165w;
                                        wVar.f21199e = false;
                                        wVar.f21204j = jVar.f21167y;
                                        wVar.f21200f = 0;
                                        wVar.f21201g = null;
                                        wVar.f21202h = null;
                                        wVar.f21203i = null;
                                        vectorTextView.setMovementMethod(null);
                                        C0219j.e(vectorTextView, new x(wVar));
                                    }
                                    l(vectorTextView, radiusLayout);
                                } else {
                                    if (num2 != null) {
                                        View inflate3 = LayoutInflater.from(context).inflate(num2.intValue(), (ViewGroup) radiusLayout, false);
                                        if (inflate3 != null) {
                                            ViewParent parent = inflate3.getParent();
                                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                            if (viewGroup != null) {
                                                viewGroup.removeView(inflate3);
                                            }
                                            radiusLayout.removeAllViews();
                                            radiusLayout.addView(inflate3);
                                            m(radiusLayout);
                                        }
                                    }
                                    throw new IllegalArgumentException("The custom layout is null.");
                                }
                                k();
                                if (jVar.f21130K) {
                                    final int i14 = 0;
                                    frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: j6.g

                                        /* renamed from: c, reason: collision with root package name */
                                        public final /* synthetic */ m f21117c;

                                        {
                                            this.f21117c = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i14) {
                                                case 0:
                                                    m mVar = this.f21117c;
                                                    G7.j.e(mVar, "this$0");
                                                    if (mVar.f21171c.f21130K) {
                                                        mVar.f();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    m mVar2 = this.f21117c;
                                                    G7.j.e(mVar2, "this$0");
                                                    if (mVar2.f21171c.f21131L) {
                                                        mVar2.f();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                popupWindow.setOnDismissListener(new X6.c(this, 1));
                                popupWindow.setTouchInterceptor(new l(this, 0));
                                final int i15 = 1;
                                balloonAnchorOverlayView.setOnClickListener(new View.OnClickListener(this) { // from class: j6.g

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ m f21117c;

                                    {
                                        this.f21117c = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i15) {
                                            case 0:
                                                m mVar = this.f21117c;
                                                G7.j.e(mVar, "this$0");
                                                if (mVar.f21171c.f21130K) {
                                                    mVar.f();
                                                    return;
                                                }
                                                return;
                                            default:
                                                m mVar2 = this.f21117c;
                                                G7.j.e(mVar2, "this$0");
                                                if (mVar2.f21171c.f21131L) {
                                                    mVar2.f();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                G7.j.d(frameLayout, "getRoot(...)");
                                d(frameLayout);
                                InterfaceC0511v interfaceC0511v = jVar.f21133N;
                                if (interfaceC0511v == null && (context instanceof InterfaceC0511v)) {
                                    InterfaceC0511v interfaceC0511v2 = (InterfaceC0511v) context;
                                    jVar.f21133N = interfaceC0511v2;
                                    interfaceC0511v2.getLifecycle().a(this);
                                    return;
                                } else {
                                    if (interfaceC0511v != null && (lifecycle = interfaceC0511v.getLifecycle()) != null) {
                                        lifecycle.a(this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            throw new NullPointerException("rootView");
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }

    public static void d(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        L7.c t9 = e1.f.t(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(t9, 10));
        Iterator it = t9.iterator();
        while (((L7.b) it).f1833d) {
            arrayList.add(viewGroup.getChildAt(((L7.b) it).a()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                d((ViewGroup) view);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void c(InterfaceC0511v interfaceC0511v) {
        this.f21171c.getClass();
    }

    public final boolean e(View view) {
        if (!this.f21175h && !this.f21176i) {
            Context context = this.b;
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && this.f21173f.getContentView().getParent() == null && ViewCompat.isAttachedToWindow(view)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f21175h) {
            i iVar = new i(this, 2);
            j jVar = this.f21171c;
            if (jVar.f21135Q == o.f21181c) {
                View contentView = this.f21173f.getContentView();
                G7.j.d(contentView, "getContentView(...)");
                contentView.post(new B(contentView, jVar.f21137S, iVar));
                return;
            }
            iVar.invoke();
        }
    }

    public final float g(View view) {
        FrameLayout frameLayout = (FrameLayout) this.f21172d.f24548e;
        G7.j.d(frameLayout, "balloonContent");
        int i9 = r8.k.n(frameLayout).x;
        int i10 = r8.k.n(view).x;
        j jVar = this.f21171c;
        float f9 = 0;
        float f10 = (jVar.f21156n * jVar.f21161s) + f9;
        float j7 = ((j() - f10) - jVar.f21154j) - f9;
        int ordinal = jVar.f21158p.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (view.getWidth() + i10 >= i9) {
                    if (j() + i9 >= i10) {
                        float f11 = i10;
                        float f12 = i9;
                        float width = (((view.getWidth() * jVar.f21157o) + f11) - f12) - (jVar.f21156n * 0.5f);
                        float width2 = (view.getWidth() * jVar.f21157o) + f11;
                        float f13 = width2 - (jVar.f21156n * 0.5f);
                        if (f13 <= f12) {
                            return 0.0f;
                        }
                        if (f13 > f12 && view.getWidth() <= j() - jVar.f21154j) {
                            return (width2 - (jVar.f21156n * 0.5f)) - f12;
                        }
                        if (width > jVar.f21156n * 2) {
                            if (width <= j() - (jVar.f21156n * 2)) {
                                return width;
                            }
                        } else {
                            return f10;
                        }
                    }
                    return j7;
                }
                return f10;
            }
            throw new RuntimeException();
        }
        return (((FrameLayout) r0.f24550g).getWidth() * jVar.f21157o) - (jVar.f21156n * 0.5f);
    }

    public final float h(View view) {
        int i9;
        j jVar = this.f21171c;
        boolean z8 = jVar.f21144Z;
        G7.j.e(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z8) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i9 = rect.top;
        } else {
            i9 = 0;
        }
        FrameLayout frameLayout = (FrameLayout) this.f21172d.f24548e;
        G7.j.d(frameLayout, "balloonContent");
        int i10 = r8.k.n(frameLayout).y - i9;
        int i11 = r8.k.n(view).y - i9;
        float f9 = 0;
        float f10 = (jVar.f21156n * jVar.f21161s) + f9;
        float i12 = ((i() - f10) - f9) - jVar.f21155k;
        int i13 = jVar.f21156n / 2;
        int ordinal = jVar.f21158p.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (view.getHeight() + i11 >= i10) {
                    if (i() + i10 >= i11) {
                        float height = (((view.getHeight() * jVar.f21157o) + i11) - i10) - i13;
                        if (height > jVar.f21156n * 2) {
                            if (height <= i() - (jVar.f21156n * 2)) {
                                return height;
                            }
                        } else {
                            return f10;
                        }
                    }
                    return i12;
                }
                return f10;
            }
            throw new RuntimeException();
        }
        return (((FrameLayout) r2.f24550g).getHeight() * jVar.f21157o) - i13;
    }

    public final int i() {
        int i9 = this.f21171c.f21149e;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        return ((FrameLayout) this.f21172d.f24545a).getMeasuredHeight();
    }

    public final int j() {
        int i9 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        j jVar = this.f21171c;
        float f9 = jVar.f21148d;
        if (f9 == 0.0f) {
            int i10 = jVar.b;
            if (i10 != Integer.MIN_VALUE) {
                if (i10 <= i9) {
                    return i10;
                }
                return i9;
            }
            return e1.f.d(((FrameLayout) this.f21172d.f24545a).getMeasuredWidth(), jVar.f21147c);
        }
        return (int) (i9 * f9);
    }

    public final void k() {
        int i9;
        int i10;
        j jVar = this.f21171c;
        int i11 = jVar.f21156n - 1;
        int i12 = (int) jVar.f21126G;
        FrameLayout frameLayout = (FrameLayout) this.f21172d.f24548e;
        int ordinal = jVar.f21160r.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        frameLayout.setPadding(i11, i12, i11, i12);
                        return;
                    }
                    throw new RuntimeException();
                }
                frameLayout.setPadding(i11, i12, i11, i12);
                return;
            }
            if (i11 < i12) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            frameLayout.setPadding(i12, i11, i12, i10);
            return;
        }
        if (i11 < i12) {
            i9 = i12;
        } else {
            i9 = i11;
        }
        frameLayout.setPadding(i12, i11, i12, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.widget.TextView r7, android.view.View r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.m.l(android.widget.TextView, android.view.View):void");
    }

    public final void m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof TextView) {
                l((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void onDestroy(InterfaceC0511v interfaceC0511v) {
        AbstractC0505o lifecycle;
        this.f21176i = true;
        this.f21174g.dismiss();
        this.f21173f.dismiss();
        InterfaceC0511v interfaceC0511v2 = this.f21171c.f21133N;
        if (interfaceC0511v2 != null && (lifecycle = interfaceC0511v2.getLifecycle()) != null) {
            lifecycle.b(this);
        }
    }
}
