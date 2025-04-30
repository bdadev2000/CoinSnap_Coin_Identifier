package com.tools.arruler.ui.component.straight;

import F7.l;
import G7.j;
import a7.b;
import android.support.v4.media.session.a;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bumptech.glide.d;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.straight.StraightRulerActivity;
import n1.C2475f;
import p1.C2538b;
import q6.c;
import t7.y;
import u6.AbstractC2808y;
import x6.AbstractActivityC2926b;

/* loaded from: classes3.dex */
public final class StraightRulerActivity extends AbstractActivityC2926b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19707k = 0;

    /* renamed from: f, reason: collision with root package name */
    public PopupWindow f19708f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19709g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19710h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19711i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19712j;

    @Override // x6.AbstractActivityC2926b
    public final int m() {
        return R.layout.activity_straight;
    }

    @Override // f.l, android.app.Activity
    public final void onBackPressed() {
        b bVar = b.f4076f;
        if (bVar != null) {
            bVar.A("FIRST_RATE", true);
            if (c.f22801e.a().c() && a.v(this) && !C2538b.a().m) {
                r6.c.f22895g.d().b(this, "ca-app-pub-6691965685689933/3105080728", new T6.a(this, 1));
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        throw new IllegalStateException(b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
    }

    @Override // x6.AbstractActivityC2926b
    public final void p() {
        q6.b bVar = c.f22801e;
        if (bVar.a().c()) {
            r6.c.f22895g.d().a(this, "ca-app-pub-6691965685689933/3105080728");
        }
        if (a.v(this)) {
            c a6 = bVar.a();
            boolean z8 = false;
            try {
                if (a6.f22803a) {
                    k5.b bVar2 = a6.f22805d;
                    if (bVar2 != null) {
                        z8 = bVar2.c("banner_straight_ruler");
                    } else {
                        j.k("remoteConfig");
                        throw null;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            if (z8 && !C2538b.a().m) {
                C2475f p2 = C2475f.p();
                C6.b bVar3 = new C6.b(this, 4);
                p2.getClass();
                C2475f.s(this, "ca-app-pub-6691965685689933/9220020793", bVar3);
                return;
            }
        }
        ((AbstractC2808y) k()).f23436q.removeAllViews();
    }

    @Override // x6.AbstractActivityC2926b
    public final void r() {
        ImageView imageView = ((AbstractC2808y) k()).f23438s;
        j.d(imageView, "imgRuler");
        final int i9 = 0;
        d.I(imageView, new l(this) { // from class: X6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StraightRulerActivity f3701c;

            {
                this.f3701c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                switch (i9) {
                    case 0:
                        int i10 = StraightRulerActivity.f19707k;
                        final StraightRulerActivity straightRulerActivity = this.f3701c;
                        j.e(straightRulerActivity, "this$0");
                        if (straightRulerActivity.f19709g) {
                            straightRulerActivity.f19709g = false;
                            ((AbstractC2808y) straightRulerActivity.k()).f23438s.setImageResource(R.drawable.ic_close_straight);
                            ImageView imageView2 = ((AbstractC2808y) straightRulerActivity.k()).f23438s;
                            j.d(imageView2, "imgRuler");
                            Object systemService = straightRulerActivity.getSystemService("layout_inflater");
                            j.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.layout_choose_straight_ruler, (ViewGroup) null);
                            j.d(inflate, "inflate(...)");
                            straightRulerActivity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                            straightRulerActivity.f19708f = new PopupWindow(inflate, (int) (r7.widthPixels * 0.6d), -2, true);
                            View findViewById = inflate.findViewById(R.id.linear_centimeter);
                            j.d(findViewById, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) findViewById;
                            View findViewById2 = inflate.findViewById(R.id.linear_millimeter);
                            j.d(findViewById2, "findViewById(...)");
                            LinearLayout linearLayout2 = (LinearLayout) findViewById2;
                            View findViewById3 = inflate.findViewById(R.id.linear_inches);
                            j.d(findViewById3, "findViewById(...)");
                            LinearLayout linearLayout3 = (LinearLayout) findViewById3;
                            View findViewById4 = inflate.findViewById(R.id.img_cb_centimeters);
                            j.d(findViewById4, "findViewById(...)");
                            final ImageView imageView3 = (ImageView) findViewById4;
                            View findViewById5 = inflate.findViewById(R.id.img_cb_millimeters);
                            j.d(findViewById5, "findViewById(...)");
                            final ImageView imageView4 = (ImageView) findViewById5;
                            View findViewById6 = inflate.findViewById(R.id.img_cb_inches);
                            j.d(findViewById6, "findViewById(...)");
                            final ImageView imageView5 = (ImageView) findViewById6;
                            imageView3.setActivated(straightRulerActivity.f19710h);
                            imageView4.setActivated(straightRulerActivity.f19711i);
                            imageView5.setActivated(straightRulerActivity.f19712j);
                            final int i11 = 0;
                            d.I(linearLayout, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i12 = i11;
                                    int i13 = StraightRulerActivity.f19707k;
                                    switch (i12) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            final int i12 = 1;
                            d.I(linearLayout2, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i122 = i12;
                                    int i13 = StraightRulerActivity.f19707k;
                                    switch (i122) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            final int i13 = 2;
                            d.I(linearLayout3, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i122 = i13;
                                    int i132 = StraightRulerActivity.f19707k;
                                    switch (i122) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            PopupWindow popupWindow = straightRulerActivity.f19708f;
                            if (popupWindow != null) {
                                popupWindow.showAtLocation(imageView2, 48, (int) (imageView2.getX() * 0.2d), (int) (imageView2.getY() * 0.77d));
                            }
                            PopupWindow popupWindow2 = straightRulerActivity.f19708f;
                            if (popupWindow2 != null) {
                                popupWindow2.setOnDismissListener(new c(straightRulerActivity, 0));
                            }
                        } else {
                            PopupWindow popupWindow3 = straightRulerActivity.f19708f;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            straightRulerActivity.f19709g = true;
                        }
                        return yVar;
                    default:
                        int i14 = StraightRulerActivity.f19707k;
                        StraightRulerActivity straightRulerActivity2 = this.f3701c;
                        j.e(straightRulerActivity2, "this$0");
                        straightRulerActivity2.onBackPressed();
                        return yVar;
                }
            }
        });
        ImageView imageView2 = ((AbstractC2808y) k()).f23437r;
        j.d(imageView2, "imgHome");
        final int i10 = 1;
        d.I(imageView2, new l(this) { // from class: X6.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StraightRulerActivity f3701c;

            {
                this.f3701c = this;
            }

            @Override // F7.l
            public final Object invoke(Object obj) {
                y yVar = y.f23029a;
                switch (i10) {
                    case 0:
                        int i102 = StraightRulerActivity.f19707k;
                        final StraightRulerActivity straightRulerActivity = this.f3701c;
                        j.e(straightRulerActivity, "this$0");
                        if (straightRulerActivity.f19709g) {
                            straightRulerActivity.f19709g = false;
                            ((AbstractC2808y) straightRulerActivity.k()).f23438s.setImageResource(R.drawable.ic_close_straight);
                            ImageView imageView22 = ((AbstractC2808y) straightRulerActivity.k()).f23438s;
                            j.d(imageView22, "imgRuler");
                            Object systemService = straightRulerActivity.getSystemService("layout_inflater");
                            j.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.layout_choose_straight_ruler, (ViewGroup) null);
                            j.d(inflate, "inflate(...)");
                            straightRulerActivity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                            straightRulerActivity.f19708f = new PopupWindow(inflate, (int) (r7.widthPixels * 0.6d), -2, true);
                            View findViewById = inflate.findViewById(R.id.linear_centimeter);
                            j.d(findViewById, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) findViewById;
                            View findViewById2 = inflate.findViewById(R.id.linear_millimeter);
                            j.d(findViewById2, "findViewById(...)");
                            LinearLayout linearLayout2 = (LinearLayout) findViewById2;
                            View findViewById3 = inflate.findViewById(R.id.linear_inches);
                            j.d(findViewById3, "findViewById(...)");
                            LinearLayout linearLayout3 = (LinearLayout) findViewById3;
                            View findViewById4 = inflate.findViewById(R.id.img_cb_centimeters);
                            j.d(findViewById4, "findViewById(...)");
                            final ImageView imageView3 = (ImageView) findViewById4;
                            View findViewById5 = inflate.findViewById(R.id.img_cb_millimeters);
                            j.d(findViewById5, "findViewById(...)");
                            final ImageView imageView4 = (ImageView) findViewById5;
                            View findViewById6 = inflate.findViewById(R.id.img_cb_inches);
                            j.d(findViewById6, "findViewById(...)");
                            final ImageView imageView5 = (ImageView) findViewById6;
                            imageView3.setActivated(straightRulerActivity.f19710h);
                            imageView4.setActivated(straightRulerActivity.f19711i);
                            imageView5.setActivated(straightRulerActivity.f19712j);
                            final int i11 = 0;
                            d.I(linearLayout, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i122 = i11;
                                    int i132 = StraightRulerActivity.f19707k;
                                    switch (i122) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            final int i12 = 1;
                            d.I(linearLayout2, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i122 = i12;
                                    int i132 = StraightRulerActivity.f19707k;
                                    switch (i122) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            final int i13 = 2;
                            d.I(linearLayout3, new l() { // from class: X6.b
                                @Override // F7.l
                                public final Object invoke(Object obj2) {
                                    y yVar2 = y.f23029a;
                                    ImageView imageView6 = imageView5;
                                    ImageView imageView7 = imageView4;
                                    ImageView imageView8 = imageView3;
                                    StraightRulerActivity straightRulerActivity2 = straightRulerActivity;
                                    int i122 = i13;
                                    int i132 = StraightRulerActivity.f19707k;
                                    switch (i122) {
                                        case 0:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = true;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(true);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y.f23440u.setUnit(Y6.a.CM);
                                            return yVar2;
                                        case 1:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = true;
                                            straightRulerActivity2.f19712j = false;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(true);
                                            imageView6.setActivated(false);
                                            AbstractC2808y abstractC2808y2 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y2.f23440u.setUnit(Y6.a.MM);
                                            return yVar2;
                                        default:
                                            j.e(straightRulerActivity2, "this$0");
                                            j.e(imageView8, "$cbCentimeter");
                                            j.e(imageView7, "$cbMillimeter");
                                            j.e(imageView6, "$cbInches");
                                            straightRulerActivity2.f19710h = false;
                                            straightRulerActivity2.f19711i = false;
                                            straightRulerActivity2.f19712j = true;
                                            imageView8.setActivated(false);
                                            imageView7.setActivated(false);
                                            imageView6.setActivated(true);
                                            AbstractC2808y abstractC2808y3 = (AbstractC2808y) straightRulerActivity2.k();
                                            abstractC2808y3.f23440u.setUnit(Y6.a.IN);
                                            return yVar2;
                                    }
                                }
                            });
                            PopupWindow popupWindow = straightRulerActivity.f19708f;
                            if (popupWindow != null) {
                                popupWindow.showAtLocation(imageView22, 48, (int) (imageView22.getX() * 0.2d), (int) (imageView22.getY() * 0.77d));
                            }
                            PopupWindow popupWindow2 = straightRulerActivity.f19708f;
                            if (popupWindow2 != null) {
                                popupWindow2.setOnDismissListener(new c(straightRulerActivity, 0));
                            }
                        } else {
                            PopupWindow popupWindow3 = straightRulerActivity.f19708f;
                            if (popupWindow3 != null) {
                                popupWindow3.dismiss();
                            }
                            straightRulerActivity.f19709g = true;
                        }
                        return yVar;
                    default:
                        int i14 = StraightRulerActivity.f19707k;
                        StraightRulerActivity straightRulerActivity2 = this.f3701c;
                        j.e(straightRulerActivity2, "this$0");
                        straightRulerActivity2.onBackPressed();
                        return yVar;
                }
            }
        });
    }
}
