package com.tools.arruler.photomeasure.camera.ruler;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.impl.L;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.tools.arruler.ui.component.protractor.view.ProtractorView;
import com.tools.arruler.ui.component.straight.view.StraightRulerView;
import com.tools.arruler.utils.view.BubbleLevelView;
import d0.AbstractC2154a;
import d0.AbstractC2158e;
import java.util.ArrayList;
import java.util.List;
import u6.AbstractC2784A;
import u6.AbstractC2787c;
import u6.AbstractC2797m;
import u6.AbstractC2799o;
import u6.AbstractC2801q;
import u6.AbstractC2802s;
import u6.AbstractC2804u;
import u6.AbstractC2806w;
import u6.AbstractC2808y;
import u6.B;
import u6.C;
import u6.C2786b;
import u6.C2788d;
import u6.C2790f;
import u6.C2792h;
import u6.C2794j;
import u6.C2796l;
import u6.C2798n;
import u6.C2800p;
import u6.C2803t;
import u6.C2805v;
import u6.C2807x;
import u6.C2809z;
import u6.D;
import u6.E;
import u6.F;
import u6.G;
import u6.H;
import u6.I;
import u6.J;
import u6.K;
import u6.M;
import u6.N;
import u6.O;
import u6.P;
import u6.Q;
import u6.S;
import u6.T;
import u6.U;
import u6.V;
import u6.W;
import u6.X;
import u6.Y;
import u6.Z;
import u6.a0;
import u6.b0;
import u6.c0;
import u6.d0;
import u6.e0;
import u6.f0;
import u6.g0;
import u6.h0;
import u6.i0;
import u6.j0;
import u6.k0;
import u6.l0;
import u6.n0;
import u6.o0;
import u6.p0;
import u6.q0;
import u6.r;
import u6.r0;
import u6.s0;
import u6.t0;
import u6.u0;
import u6.v0;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends AbstractC2154a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f19636a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(39);
        f19636a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_ar_ruler, 1);
        sparseIntArray.put(R.layout.activity_bubble, 2);
        sparseIntArray.put(R.layout.activity_home, 3);
        sparseIntArray.put(R.layout.activity_iap, 4);
        sparseIntArray.put(R.layout.activity_image_detail, 5);
        sparseIntArray.put(R.layout.activity_image_library, 6);
        sparseIntArray.put(R.layout.activity_language, 7);
        sparseIntArray.put(R.layout.activity_onboarding, 8);
        sparseIntArray.put(R.layout.activity_permission, 9);
        sparseIntArray.put(R.layout.activity_protractor, 10);
        sparseIntArray.put(R.layout.activity_setting, 11);
        sparseIntArray.put(R.layout.activity_splash, 12);
        sparseIntArray.put(R.layout.activity_straight, 13);
        sparseIntArray.put(R.layout.activity_tutorial, 14);
        sparseIntArray.put(R.layout.ads_shimmer_native_full_screen, 15);
        sparseIntArray.put(R.layout.ads_shimmer_native_home, 16);
        sparseIntArray.put(R.layout.ads_shimmer_native_large, 17);
        sparseIntArray.put(R.layout.ads_shimmer_native_permission, 18);
        sparseIntArray.put(R.layout.ads_shimmer_native_small, 19);
        sparseIntArray.put(R.layout.dialog_camera_permission, 20);
        sparseIntArray.put(R.layout.dialog_confirm_delete_picture, 21);
        sparseIntArray.put(R.layout.dialog_exit, 22);
        sparseIntArray.put(R.layout.dialog_exit_action, 23);
        sparseIntArray.put(R.layout.dialog_premium, 24);
        sparseIntArray.put(R.layout.dialog_rate_app, 25);
        sparseIntArray.put(R.layout.dialog_rename_file, 26);
        sparseIntArray.put(R.layout.item_ads, 27);
        sparseIntArray.put(R.layout.item_internal_image, 28);
        sparseIntArray.put(R.layout.item_language, 29);
        sparseIntArray.put(R.layout.item_on_boarding, 30);
        sparseIntArray.put(R.layout.item_tool, 31);
        sparseIntArray.put(R.layout.item_unit, 32);
        sparseIntArray.put(R.layout.layout_choose_straight_ruler, 33);
        sparseIntArray.put(R.layout.layout_home, 34);
        sparseIntArray.put(R.layout.layout_item_setting, 35);
        sparseIntArray.put(R.layout.layout_rcv_tool, 36);
        sparseIntArray.put(R.layout.layout_rcv_unit, 37);
        sparseIntArray.put(R.layout.layout_setting, 38);
        sparseIntArray.put(R.layout.shimmer_ads_small, 39);
    }

    @Override // d0.AbstractC2154a
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v213, types: [u6.B, u6.A, d0.e] */
    /* JADX WARN: Type inference failed for: r0v217, types: [u6.D, u6.C, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r0v221, types: [java.lang.Object, u6.F, u6.E, d0.e] */
    /* JADX WARN: Type inference failed for: r0v225, types: [java.lang.Object, d0.e, u6.H, u6.G] */
    /* JADX WARN: Type inference failed for: r0v229, types: [u6.J, u6.I, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r0v233, types: [u6.I, java.lang.Object, u6.K, d0.e] */
    /* JADX WARN: Type inference failed for: r0v237, types: [u6.M, u6.L, d0.e] */
    /* JADX WARN: Type inference failed for: r0v278, types: [u6.Q, u6.P, d0.e] */
    /* JADX WARN: Type inference failed for: r0v282, types: [d0.e, u6.U, u6.V] */
    /* JADX WARN: Type inference failed for: r0v434, types: [u6.n0, d0.e] */
    /* JADX WARN: Type inference failed for: r0v525, types: [u6.q0, u6.I, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r0v529, types: [u6.r0, d0.e] */
    /* JADX WARN: Type inference failed for: r0v533, types: [u6.s0, d0.e] */
    /* JADX WARN: Type inference failed for: r0v576, types: [u6.I, java.lang.Object, u6.v0, d0.e] */
    /* JADX WARN: Type inference failed for: r13v1, types: [u6.c, u6.d, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r15v3, types: [u6.o, u6.p, d0.e] */
    /* JADX WARN: Type inference failed for: r15v4, types: [u6.o0, u6.p0, d0.e] */
    /* JADX WARN: Type inference failed for: r4v32, types: [u6.O, u6.N, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r5v41, types: [u6.e0, java.lang.Object, u6.f0, d0.e] */
    /* JADX WARN: Type inference failed for: r6v13, types: [u6.w, u6.x, d0.e] */
    /* JADX WARN: Type inference failed for: r6v48, types: [u6.b0, u6.a0, java.lang.Object, d0.e] */
    /* JADX WARN: Type inference failed for: r6v58, types: [u6.k0, u6.l0, d0.e] */
    /* JADX WARN: Type inference failed for: r7v18, types: [u6.S, u6.T, d0.e] */
    /* JADX WARN: Type inference failed for: r7v2, types: [u6.m, u6.n, d0.e] */
    /* JADX WARN: Type inference failed for: r7v21, types: [u6.Y, u6.Z, d0.e] */
    /* JADX WARN: Type inference failed for: r8v10, types: [u6.y, u6.z, d0.e] */
    /* JADX WARN: Type inference failed for: r8v16, types: [u6.c0, u6.d0, d0.e] */
    /* JADX WARN: Type inference failed for: r8v19, types: [u6.g0, d0.e, u6.h0] */
    /* JADX WARN: Type inference failed for: r8v20, types: [u6.j0, d0.e, u6.i0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [u6.q, u6.r, d0.e] */
    /* JADX WARN: Type inference failed for: r8v7, types: [u6.s, u6.t, d0.e] */
    /* JADX WARN: Type inference failed for: r8v8, types: [d0.e, u6.u, u6.v] */
    /* JADX WARN: Type inference failed for: r9v10, types: [u6.W, u6.X, d0.e] */
    /* JADX WARN: Type inference failed for: r9v18, types: [u6.u0, u6.t0, d0.e] */
    @Override // d0.AbstractC2154a
    public final AbstractC2158e b(View view, int i9) {
        int i10 = f19636a.get(i9);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i10) {
                    case 1:
                        if ("layout/activity_ar_ruler_0".equals(tag)) {
                            return new C2786b(view);
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_ar_ruler is invalid. Received: "));
                    case 2:
                        if ("layout/activity_bubble_0".equals(tag)) {
                            Object[] K5 = AbstractC2158e.K(view, 11, C2788d.f23283A, C2788d.f23284B);
                            BubbleLevelView bubbleLevelView = (BubbleLevelView) K5[3];
                            FrameLayout frameLayout = (FrameLayout) K5[10];
                            FrameLayout frameLayout2 = (FrameLayout) K5[1];
                            ImageView imageView = (ImageView) K5[4];
                            ImageView imageView2 = (ImageView) K5[7];
                            ?? abstractC2787c = new AbstractC2787c(null, view, bubbleLevelView, frameLayout, frameLayout2, imageView, imageView2, (ConstraintLayout) K5[0], (E) K5[2], (TextView) K5[6], (TextView) K5[9]);
                            abstractC2787c.f23285z = -1L;
                            abstractC2787c.f23270s.setTag(null);
                            abstractC2787c.f23273v.setTag(null);
                            E e4 = abstractC2787c.f23274w;
                            if (e4 != null) {
                                e4.f19792k = abstractC2787c;
                            }
                            view.setTag(R.id.dataBinding, abstractC2787c);
                            abstractC2787c.I();
                            return abstractC2787c;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_bubble is invalid. Received: "));
                    case 3:
                        if ("layout/activity_home_0".equals(tag)) {
                            return new C2790f(view);
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_home is invalid. Received: "));
                    case 4:
                        if ("layout/activity_iap_0".equals(tag)) {
                            return new C2792h(view);
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_iap is invalid. Received: "));
                    case 5:
                        if ("layout/activity_image_detail_0".equals(tag)) {
                            return new C2794j(view);
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_image_detail is invalid. Received: "));
                    case 6:
                        if ("layout/activity_image_library_0".equals(tag)) {
                            return new C2796l(view);
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_image_library is invalid. Received: "));
                    case 7:
                        if ("layout/activity_language_0".equals(tag)) {
                            Object[] K8 = AbstractC2158e.K(view, 8, C2798n.f23360v, C2798n.f23361w);
                            FrameLayout frameLayout3 = (FrameLayout) K8[1];
                            ImageView imageView3 = (ImageView) K8[5];
                            RecyclerView recyclerView = (RecyclerView) K8[6];
                            G g9 = (G) K8[2];
                            ?? abstractC2797m = new AbstractC2797m(null, view, frameLayout3, imageView3, recyclerView, g9);
                            abstractC2797m.f23362u = -1L;
                            abstractC2797m.f23356q.setTag(null);
                            ((ConstraintLayout) K8[0]).setTag(null);
                            G g10 = abstractC2797m.f23359t;
                            if (g10 != null) {
                                g10.f19792k = abstractC2797m;
                            }
                            abstractC2797m.N(view);
                            abstractC2797m.I();
                            return abstractC2797m;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_language is invalid. Received: "));
                    case 8:
                        if ("layout/activity_onboarding_0".equals(tag)) {
                            Object[] K9 = AbstractC2158e.K(view, 12, C2800p.f23387C, C2800p.f23388D);
                            ?? abstractC2799o = new AbstractC2799o(null, view, (FrameLayout) K9[11], (FrameLayout) K9[1], (LinearLayout) K9[4], (LottieAnimationView) K9[10], (G) K9[2], (TextView) K9[5], (AppCompatImageView) K9[6], (AppCompatImageView) K9[7], (AppCompatImageView) K9[8], (AppCompatImageView) K9[9], (ViewPager2) K9[3]);
                            abstractC2799o.f23389B = -1L;
                            abstractC2799o.f23367r.setTag(null);
                            ((ConstraintLayout) K9[0]).setTag(null);
                            G g11 = abstractC2799o.f23370u;
                            if (g11 != null) {
                                g11.f19792k = abstractC2799o;
                            }
                            abstractC2799o.N(view);
                            abstractC2799o.I();
                            return abstractC2799o;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_onboarding is invalid. Received: "));
                    case 9:
                        if ("layout/activity_permission_0".equals(tag)) {
                            Object[] K10 = AbstractC2158e.K(view, 11, r.f23400w, r.f23401x);
                            FrameLayout frameLayout4 = (FrameLayout) K10[10];
                            FrameLayout frameLayout5 = (FrameLayout) K10[1];
                            ImageView imageView4 = (ImageView) K10[8];
                            ImageView imageView5 = (ImageView) K10[4];
                            G g12 = (G) K10[2];
                            ?? abstractC2801q = new AbstractC2801q(null, view, frameLayout4, frameLayout5, imageView4, imageView5, g12);
                            abstractC2801q.f23402v = -1L;
                            abstractC2801q.f23394r.setTag(null);
                            ((ConstraintLayout) K10[0]).setTag(null);
                            G g13 = abstractC2801q.f23397u;
                            if (g13 != null) {
                                g13.f19792k = abstractC2801q;
                            }
                            abstractC2801q.N(view);
                            abstractC2801q.I();
                            return abstractC2801q;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_permission is invalid. Received: "));
                    case 10:
                        if ("layout/activity_protractor_0".equals(tag)) {
                            Object[] K11 = AbstractC2158e.K(view, 6, null, C2803t.f23412w);
                            ?? abstractC2802s = new AbstractC2802s(null, view, (FrameLayout) K11[1], (AppCompatImageView) K11[5], (View) K11[2], (ProtractorView) K11[3], (AppCompatTextView) K11[4]);
                            abstractC2802s.f23413v = -1L;
                            abstractC2802s.f23405q.setTag(null);
                            ((ConstraintLayout) K11[0]).setTag(null);
                            abstractC2802s.N(view);
                            abstractC2802s.I();
                            return abstractC2802s;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_protractor is invalid. Received: "));
                    case 11:
                        if ("layout/activity_setting_0".equals(tag)) {
                            Object[] K12 = AbstractC2158e.K(view, 6, null, C2805v.f23427w);
                            ?? abstractC2804u = new AbstractC2804u(null, view, (AppCompatImageView) K12[1], (LinearLayout) K12[2], (LinearLayout) K12[5], (LinearLayout) K12[3], (LinearLayout) K12[4]);
                            abstractC2804u.f23428v = -1L;
                            ((ConstraintLayout) K12[0]).setTag(null);
                            abstractC2804u.N(view);
                            abstractC2804u.I();
                            return abstractC2804u;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_setting is invalid. Received: "));
                    case 12:
                        if ("layout/activity_splash_0".equals(tag)) {
                            Object[] K13 = AbstractC2158e.K(view, 5, null, C2807x.f23434u);
                            FrameLayout frameLayout6 = (FrameLayout) K13[1];
                            View view2 = (View) K13[2];
                            ?? abstractC2806w = new AbstractC2806w(null, view, frameLayout6, view2, (VideoView) K13[3]);
                            abstractC2806w.f23435t = -1L;
                            abstractC2806w.f23431q.setTag(null);
                            ((ConstraintLayout) K13[0]).setTag(null);
                            abstractC2806w.N(view);
                            abstractC2806w.I();
                            return abstractC2806w;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_splash is invalid. Received: "));
                    case 13:
                        if ("layout/activity_straight_0".equals(tag)) {
                            Object[] K14 = AbstractC2158e.K(view, 6, null, C2809z.f23441w);
                            ?? abstractC2808y = new AbstractC2808y(null, view, (FrameLayout) K14[1], (ImageView) K14[5], (ImageView) K14[4], (View) K14[2], (StraightRulerView) K14[3]);
                            abstractC2808y.f23442v = -1L;
                            abstractC2808y.f23436q.setTag(null);
                            ((ConstraintLayout) K14[0]).setTag(null);
                            abstractC2808y.N(view);
                            abstractC2808y.I();
                            return abstractC2808y;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_straight is invalid. Received: "));
                    case 14:
                        if ("layout/activity_tutorial_0".equals(tag)) {
                            Object[] K15 = AbstractC2158e.K(view, 3, null, B.f23189t);
                            ?? abstractC2784A = new AbstractC2784A(null, view, (ImageView) K15[2], (VideoView) K15[1]);
                            abstractC2784A.f23190s = -1L;
                            ((ConstraintLayout) K15[0]).setTag(null);
                            abstractC2784A.N(view);
                            abstractC2784A.I();
                            return abstractC2784A;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for activity_tutorial is invalid. Received: "));
                    case 15:
                        if ("layout/ads_shimmer_native_full_screen_0".equals(tag)) {
                            Object[] K16 = AbstractC2158e.K(view, 8, null, D.f23192s);
                            ?? c9 = new C(null, view, (ShimmerFrameLayout) K16[0]);
                            c9.f23193r = -1L;
                            c9.f23191q.setTag(null);
                            view.setTag(R.id.dataBinding, c9);
                            c9.I();
                            return c9;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for ads_shimmer_native_full_screen is invalid. Received: "));
                    case 16:
                        if ("layout/ads_shimmer_native_home_0".equals(tag)) {
                            Object[] K17 = AbstractC2158e.K(view, 8, null, F.f23195s);
                            ?? e9 = new E(null, view, (ShimmerFrameLayout) K17[0]);
                            e9.f23196r = -1L;
                            e9.f23194q.setTag(null);
                            view.setTag(R.id.dataBinding, e9);
                            e9.I();
                            return e9;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for ads_shimmer_native_home is invalid. Received: "));
                    case 17:
                        if ("layout/ads_shimmer_native_large_0".equals(tag)) {
                            Object[] K18 = AbstractC2158e.K(view, 8, null, H.f23198s);
                            ?? g14 = new G(null, view, (ShimmerFrameLayout) K18[0]);
                            g14.f23199r = -1L;
                            g14.f23197q.setTag(null);
                            view.setTag(R.id.dataBinding, g14);
                            g14.I();
                            return g14;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for ads_shimmer_native_large is invalid. Received: "));
                    case 18:
                        if ("layout/ads_shimmer_native_permission_0".equals(tag)) {
                            Object[] K19 = AbstractC2158e.K(view, 8, null, J.f23201s);
                            ?? i11 = new I(null, view, (ShimmerFrameLayout) K19[0]);
                            i11.f23202r = -1L;
                            ((ShimmerFrameLayout) i11.f23200q).setTag(null);
                            view.setTag(R.id.dataBinding, i11);
                            i11.I();
                            return i11;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for ads_shimmer_native_permission is invalid. Received: "));
                    case 19:
                        if ("layout/ads_shimmer_native_small_0".equals(tag)) {
                            Object[] K20 = AbstractC2158e.K(view, 8, null, K.f23203s);
                            ?? i12 = new I(null, view, (ShimmerFrameLayout) K20[0]);
                            i12.f23204r = -1L;
                            ((ShimmerFrameLayout) i12.f23200q).setTag(null);
                            view.setTag(R.id.dataBinding, i12);
                            i12.I();
                            return i12;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for ads_shimmer_native_small is invalid. Received: "));
                    case 20:
                        if ("layout/dialog_camera_permission_0".equals(tag)) {
                            Object[] K21 = AbstractC2158e.K(view, 6, null, M.f23207t);
                            TextView textView = (TextView) K21[4];
                            TextView textView2 = (TextView) K21[5];
                            ?? l = new u6.L(null, view, textView, textView2);
                            l.f23208s = -1L;
                            ((ConstraintLayout) K21[0]).setTag(null);
                            l.N(view);
                            l.I();
                            return l;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_camera_permission is invalid. Received: "));
                    case 21:
                        if ("layout/dialog_confirm_delete_picture_0".equals(tag)) {
                            Object[] K22 = AbstractC2158e.K(view, 6, null, O.f23212u);
                            ConstraintLayout constraintLayout = (ConstraintLayout) K22[0];
                            TextView textView3 = (TextView) K22[5];
                            TextView textView4 = (TextView) K22[4];
                            ?? n2 = new N(null, view, constraintLayout, textView3, textView4);
                            n2.f23213t = -1L;
                            n2.f23209q.setTag(null);
                            view.setTag(R.id.dataBinding, n2);
                            n2.I();
                            return n2;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_confirm_delete_picture is invalid. Received: "));
                    case 22:
                        if ("layout/dialog_exit_0".equals(tag)) {
                            Object[] K23 = AbstractC2158e.K(view, 8, T.f23222v, T.f23223w);
                            FrameLayout frameLayout7 = (FrameLayout) K23[1];
                            G g15 = (G) K23[2];
                            ?? s5 = new S(null, view, frameLayout7, g15, (AppCompatTextView) K23[7], (AppCompatTextView) K23[6]);
                            s5.f23224u = -1L;
                            s5.f23218q.setTag(null);
                            ((ConstraintLayout) K23[0]).setTag(null);
                            G g16 = s5.f23219r;
                            if (g16 != null) {
                                g16.f19792k = s5;
                            }
                            s5.N(view);
                            s5.I();
                            return s5;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_exit is invalid. Received: "));
                    case 23:
                        if ("layout/dialog_exit_action_0".equals(tag)) {
                            Object[] K24 = AbstractC2158e.K(view, 6, null, Q.f23216t);
                            TextView textView5 = (TextView) K24[5];
                            TextView textView6 = (TextView) K24[4];
                            ?? p2 = new P(null, view, textView5, textView6);
                            p2.f23217s = -1L;
                            ((ConstraintLayout) K24[0]).setTag(null);
                            p2.N(view);
                            p2.I();
                            return p2;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_exit_action is invalid. Received: "));
                    case 24:
                        if ("layout/dialog_premium_0".equals(tag)) {
                            Object[] K25 = AbstractC2158e.K(view, 6, null, V.f23227t);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) K25[2];
                            ?? u8 = new U(null, view, appCompatImageView, (AppCompatTextView) K25[5]);
                            u8.f23228s = -1L;
                            ((ConstraintLayout) K25[0]).setTag(null);
                            u8.N(view);
                            u8.I();
                            return u8;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_premium is invalid. Received: "));
                    case 25:
                        if ("layout/dialog_rate_app_0".equals(tag)) {
                            Object[] K26 = AbstractC2158e.K(view, 11, null, X.f23235x);
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) K26[5];
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) K26[6];
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) K26[7];
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) K26[8];
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) K26[9];
                            TextView textView7 = (TextView) K26[10];
                            ?? w2 = new W(null, view, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, textView7);
                            w2.f23236w = -1L;
                            ((ConstraintLayout) K26[0]).setTag(null);
                            w2.N(view);
                            w2.I();
                            return w2;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_rate_app is invalid. Received: "));
                    case 26:
                        if ("layout/dialog_rename_file_0".equals(tag)) {
                            Object[] K27 = AbstractC2158e.K(view, 7, null, Z.f23241v);
                            EditText editText = (EditText) K27[3];
                            ImageView imageView6 = (ImageView) K27[4];
                            TextView textView8 = (TextView) K27[6];
                            TextView textView9 = (TextView) K27[5];
                            ?? y4 = new Y(null, view, editText, imageView6, textView8, textView9);
                            y4.f23242u = -1L;
                            ((ConstraintLayout) K27[0]).setTag(null);
                            y4.N(view);
                            y4.I();
                            return y4;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for dialog_rename_file is invalid. Received: "));
                    case 27:
                        if ("layout/item_ads_0".equals(tag)) {
                            Object[] K28 = AbstractC2158e.K(view, 3, b0.f23266v, null);
                            ?? a0Var = new a0(null, view, (FrameLayout) K28[1], (E) K28[2], (ConstraintLayout) K28[0]);
                            a0Var.f23267u = -1L;
                            a0Var.f23261q.setTag(null);
                            E e10 = a0Var.f23262r;
                            if (e10 != null) {
                                e10.f19792k = a0Var;
                            }
                            a0Var.f23263s.setTag(null);
                            view.setTag(R.id.dataBinding, a0Var);
                            a0Var.I();
                            return a0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_ads is invalid. Received: "));
                    case 28:
                        if ("layout/item_internal_image_0".equals(tag)) {
                            Object[] K29 = AbstractC2158e.K(view, 6, null, d0.f23286x);
                            ?? c0Var = new c0(null, view, (ImageView) K29[3], (ShapeableImageView) K29[1], (TextView) K29[4], (TextView) K29[2], (TextView) K29[5]);
                            c0Var.f23287w = -1L;
                            ((ConstraintLayout) K29[0]).setTag(null);
                            c0Var.N(view);
                            c0Var.I();
                            return c0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_internal_image is invalid. Received: "));
                    case 29:
                        if ("layout/item_language_0".equals(tag)) {
                            Object[] K30 = AbstractC2158e.K(view, 5, null, f0.f23298v);
                            RadioButton radioButton = (RadioButton) K30[4];
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) K30[0];
                            ?? e0Var = new e0(null, view, radioButton, constraintLayout2, (ImageView) K30[2], (TextView) K30[3]);
                            e0Var.f23299u = -1L;
                            e0Var.f23293r.setTag(null);
                            view.setTag(R.id.dataBinding, e0Var);
                            e0Var.I();
                            return e0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_language is invalid. Received: "));
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                        if ("layout/item_on_boarding_0".equals(tag)) {
                            Object[] K31 = AbstractC2158e.K(view, 6, h0.f23319w, h0.f23320x);
                            ?? g0Var = new g0(null, view, (FrameLayout) K31[1], (ImageView) K31[3], (C) K31[2], (TextView) K31[5], (TextView) K31[4]);
                            g0Var.f23321v = -1L;
                            g0Var.f23312q.setTag(null);
                            ((RelativeLayout) K31[0]).setTag(null);
                            C c10 = g0Var.f23314s;
                            if (c10 != null) {
                                c10.f19792k = g0Var;
                            }
                            g0Var.N(view);
                            g0Var.I();
                            return g0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_on_boarding is invalid. Received: "));
                    case 31:
                        if ("layout/item_tool_0".equals(tag)) {
                            Object[] K32 = AbstractC2158e.K(view, 6, null, j0.f23334x);
                            ?? i0Var = new i0(null, view, (AppCompatImageView) K32[4], (AppCompatImageView) K32[1], (AppCompatImageView) K32[3], (AppCompatTextView) K32[2], (View) K32[5]);
                            i0Var.f23335w = -1L;
                            ((ConstraintLayout) K32[0]).setTag(null);
                            i0Var.N(view);
                            i0Var.I();
                            return i0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_tool is invalid. Received: "));
                    case 32:
                        if ("layout/item_unit_0".equals(tag)) {
                            Object[] K33 = AbstractC2158e.K(view, 4, null, l0.f23354v);
                            ?? k0Var = new k0(null, view, (RadioButton) K33[2], (TextView) K33[1], (View) K33[3]);
                            k0Var.f23355u = -1L;
                            ((ConstraintLayout) K33[0]).setTag(null);
                            k0Var.N(view);
                            k0Var.I();
                            return k0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for item_unit is invalid. Received: "));
                    case 33:
                        if ("layout/layout_choose_straight_ruler_0".equals(tag)) {
                            Object[] K34 = AbstractC2158e.K(view, 7, null, n0.f23363r);
                            ?? abstractC2158e = new AbstractC2158e(view, 0, null);
                            abstractC2158e.f23364q = -1L;
                            ((LinearLayout) K34[0]).setTag(null);
                            abstractC2158e.N(view);
                            abstractC2158e.I();
                            return abstractC2158e;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_choose_straight_ruler is invalid. Received: "));
                    case 34:
                        if ("layout/layout_home_0".equals(tag)) {
                            Object[] K35 = AbstractC2158e.K(view, 30, p0.f23390C, p0.f23391D);
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) K35[6];
                            FrameLayout frameLayout8 = (FrameLayout) K35[1];
                            FrameLayout frameLayout9 = (FrameLayout) K35[10];
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) K35[5];
                            E e11 = (E) K35[2];
                            ?? o0Var = new o0(null, view, constraintLayout3, frameLayout8, frameLayout9, lottieAnimationView, e11, (View) K35[20], (View) K35[29], (View) K35[16], (View) K35[25], (View) K35[21], (View) K35[11]);
                            o0Var.f23392B = -1L;
                            o0Var.f23378r.setTag(null);
                            ((ConstraintLayout) K35[0]).setTag(null);
                            E e12 = o0Var.f23381u;
                            if (e12 != null) {
                                e12.f19792k = o0Var;
                            }
                            o0Var.N(view);
                            o0Var.I();
                            return o0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_home is invalid. Received: "));
                    case 35:
                        if ("layout/layout_item_setting_0".equals(tag)) {
                            Object[] K36 = AbstractC2158e.K(view, 3, null, q0.f23398s);
                            LinearLayout linearLayout = (LinearLayout) K36[0];
                            ?? i13 = new I(null, view, linearLayout);
                            i13.f23399r = -1L;
                            ((LinearLayout) i13.f23200q).setTag(null);
                            view.setTag(R.id.dataBinding, i13);
                            i13.I();
                            return i13;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_item_setting is invalid. Received: "));
                    case 36:
                        if ("layout/layout_rcv_tool_0".equals(tag)) {
                            Object[] K37 = AbstractC2158e.K(view, 2, null, r0.f23403r);
                            ?? abstractC2158e2 = new AbstractC2158e(view, 0, null);
                            abstractC2158e2.f23404q = -1L;
                            ((ConstraintLayout) K37[0]).setTag(null);
                            abstractC2158e2.N(view);
                            abstractC2158e2.I();
                            return abstractC2158e2;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_rcv_tool is invalid. Received: "));
                    case 37:
                        if ("layout/layout_rcv_unit_0".equals(tag)) {
                            Object[] K38 = AbstractC2158e.K(view, 2, null, s0.f23410r);
                            ?? abstractC2158e3 = new AbstractC2158e(view, 0, null);
                            abstractC2158e3.f23411q = -1L;
                            ((ConstraintLayout) K38[0]).setTag(null);
                            abstractC2158e3.N(view);
                            abstractC2158e3.I();
                            return abstractC2158e3;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_rcv_unit is invalid. Received: "));
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        if ("layout/layout_setting_0".equals(tag)) {
                            Object[] K39 = AbstractC2158e.K(view, 13, null, u0.f23425x);
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) K39[6];
                            ConstraintLayout constraintLayout5 = (ConstraintLayout) K39[4];
                            ConstraintLayout constraintLayout6 = (ConstraintLayout) K39[9];
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) K39[3];
                            RecyclerView recyclerView2 = (RecyclerView) K39[8];
                            TextView textView10 = (TextView) K39[12];
                            ?? t0Var = new t0(null, view, constraintLayout4, constraintLayout5, constraintLayout6, lottieAnimationView2, recyclerView2, textView10);
                            t0Var.f23426w = -1L;
                            ((ConstraintLayout) K39[0]).setTag(null);
                            t0Var.N(view);
                            t0Var.I();
                            return t0Var;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for layout_setting is invalid. Received: "));
                    case 39:
                        if ("layout/shimmer_ads_small_0".equals(tag)) {
                            Object[] K40 = AbstractC2158e.K(view, 7, null, v0.f23429s);
                            ?? i14 = new I(null, view, (ShimmerFrameLayout) K40[0]);
                            i14.f23430r = -1L;
                            ((ShimmerFrameLayout) i14.f23200q).setTag(null);
                            view.setTag(R.id.dataBinding, i14);
                            i14.I();
                            return i14;
                        }
                        throw new IllegalArgumentException(L.i(tag, "The tag for shimmer_ads_small is invalid. Received: "));
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // d0.AbstractC2154a
    public final AbstractC2158e c(View[] viewArr, int i9) {
        if (viewArr.length == 0 || f19636a.get(i9) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
