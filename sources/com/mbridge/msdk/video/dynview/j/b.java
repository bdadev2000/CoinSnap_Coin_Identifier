package com.mbridge.msdk.video.dynview.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f18682a = "mbridge_top_play_bg";
    private String b = "mbridge_top_finger_bg";

    /* renamed from: c, reason: collision with root package name */
    private String f18683c = "mbridge_bottom_play_bg";

    /* renamed from: d, reason: collision with root package name */
    private String f18684d = "mbridge_bottom_finger_bg";

    /* renamed from: e, reason: collision with root package name */
    private String f18685e = "mbridge_tv_count";

    /* renamed from: f, reason: collision with root package name */
    private String f18686f = "mbridge_sound_switch";

    /* renamed from: g, reason: collision with root package name */
    private String f18687g = "mbridge_top_control";

    /* renamed from: h, reason: collision with root package name */
    private String f18688h = "mbridge_tv_title";

    /* renamed from: i, reason: collision with root package name */
    private String f18689i = "mbridge_tv_desc";

    /* renamed from: j, reason: collision with root package name */
    private String f18690j = "mbridge_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private String f18691k = "mbridge_sv_starlevel";
    private String l = "mbridge_sv_heat_count_level";
    private String m = "mbridge_tv_cta";

    /* renamed from: n, reason: collision with root package name */
    private String f18692n = "mbridge_native_ec_controller";

    /* renamed from: o, reason: collision with root package name */
    private String f18693o = "mbridge_reward_shape_choice_rl";

    /* renamed from: p, reason: collision with root package name */
    private String f18694p = "#FFFFFF";

    /* renamed from: q, reason: collision with root package name */
    private String f18695q = "#FF000000";

    /* renamed from: r, reason: collision with root package name */
    private String f18696r = "#40000000";

    /* renamed from: s, reason: collision with root package name */
    private String f18697s = "#CAEF79";

    /* renamed from: t, reason: collision with root package name */
    private String f18698t = "#2196F3";

    /* renamed from: u, reason: collision with root package name */
    private String f18699u = "#402196F3";

    /* renamed from: v, reason: collision with root package name */
    private String f18700v = "#8FC31F";

    /* renamed from: w, reason: collision with root package name */
    private String f18701w = "#03A9F4";

    /* renamed from: x, reason: collision with root package name */
    private String f18702x = "#FF89C120";

    /* renamed from: y, reason: collision with root package name */
    private String f18703y = "#FF2BAE5D";

    /* renamed from: z, reason: collision with root package name */
    private boolean f18704z = false;

    public final void a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f18704z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f18704z) {
                imageView = (ImageView) view.findViewById(b(this.f18682a));
                imageView2 = (ImageView) view.findViewById(b(this.b));
                imageView3 = (ImageView) view.findViewById(b(this.f18683c));
                imageView4 = (ImageView) view.findViewById(b(this.f18684d));
            } else {
                imageView = (ImageView) view.findViewById(a(this.f18682a));
                imageView2 = (ImageView) view.findViewById(a(this.b));
                imageView3 = (ImageView) view.findViewById(a(this.f18683c));
                imageView4 = (ImageView) view.findViewById(a(this.f18684d));
            }
            ObjectAnimator a6 = imageView != null ? new com.mbridge.msdk.video.dynview.h.b().a(imageView) : null;
            ObjectAnimator b = imageView2 != null ? new com.mbridge.msdk.video.dynview.h.b().b(imageView2) : null;
            ObjectAnimator a9 = imageView3 != null ? new com.mbridge.msdk.video.dynview.h.b().a(imageView3) : null;
            ObjectAnimator b8 = imageView4 != null ? new com.mbridge.msdk.video.dynview.h.b().b(imageView4) : null;
            if (a6 == null || a9 == null || b == null || b8 == null) {
                return;
            }
            animatorSet.playTogether(a6, a9, b, b8);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public final void b(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        LinearLayout linearLayout;
        View findViewById;
        if (view == null || cVar == null) {
            return;
        }
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f18704z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f18704z) {
                linearLayout = (LinearLayout) view.findViewById(b(this.f18691k));
                findViewById = view.findViewById(b(this.m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(a(this.f18691k));
                findViewById = view.findViewById(a(this.m));
            }
            View view2 = findViewById;
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (cVar.e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f18692n));
            if (relativeLayout != null) {
                if (cVar.e() == 1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(layoutParams.leftMargin + com.mbridge.msdk.video.dynview.a.a.f18564a, layoutParams.topMargin + com.mbridge.msdk.video.dynview.a.a.f18565c, layoutParams.rightMargin + com.mbridge.msdk.video.dynview.a.a.b, layoutParams.bottomMargin + com.mbridge.msdk.video.dynview.a.a.f18566d);
                    relativeLayout.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + com.mbridge.msdk.video.dynview.a.a.f18564a, layoutParams2.topMargin + com.mbridge.msdk.video.dynview.a.a.f18565c, layoutParams2.rightMargin + com.mbridge.msdk.video.dynview.a.a.b, layoutParams2.bottomMargin + com.mbridge.msdk.video.dynview.a.a.f18566d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            if (view2 != null) {
                if (view2 instanceof TextView) {
                    TextView textView = (TextView) view2;
                    textView.setTextColor(Color.parseColor(this.f18694p));
                    textView.setTextSize(22.0f);
                    com.mbridge.msdk.video.dynview.i.b.a.a(view2, 1.0f, cVar.i() == 1302 ? 25 : 5, this.f18697s, new String[]{this.f18702x, this.f18703y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                int i9 = cVar.i();
                if (i9 == 404 || i9 == 704 || i9 == 1402) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new com.mbridge.msdk.video.dynview.h.b().c(view2));
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.mbridge.msdk.video.dynview.j.b.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
        }
        new com.mbridge.msdk.video.dynview.h.b().c(view, 500L);
    }

    public final void a(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        RelativeLayout relativeLayout;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            boolean booleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
            this.f18704z = booleanValue;
            if (booleanValue) {
                textView = (TextView) view.findViewById(b(this.f18685e));
                textView2 = (TextView) view.findViewById(b("mbridge_reward_click_tv"));
            } else {
                textView = (TextView) view.findViewById(a(this.f18685e));
                textView2 = (TextView) view.findViewById(a("mbridge_reward_click_tv"));
            }
        } else {
            textView = (TextView) view.findViewById(a(this.f18685e));
            textView2 = (TextView) view.findViewById(a("mbridge_reward_click_tv"));
        }
        if (textView != null) {
            textView.setBackgroundResource(v.a(context, "mbridge_reward_shape_progress", "drawable"));
            textView.setTextColor(Color.parseColor(this.f18694p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof MBridgeTextView) {
                ((MBridgeTextView) textView2).setObjectAnimator(new com.mbridge.msdk.video.dynview.h.b().c(textView2));
            }
            if (textView2 instanceof MBTextView) {
                ((MBTextView) textView2).setAnimator(new com.mbridge.msdk.video.dynview.h.b().c(textView2));
            }
        }
        String str3 = this.f18695q;
        String str4 = this.f18697s;
        int i9 = cVar.i();
        float f9 = 10.0f;
        float f10 = 1.0f;
        if (i9 == 302) {
            str = this.f18698t;
            str2 = this.f18701w;
            str3 = this.f18694p;
            str4 = this.f18699u;
        } else if (i9 == 802) {
            str = this.f18694p;
            str3 = this.f18695q;
            str4 = this.f18696r;
            f9 = 25.0f;
            f10 = 0.5f;
            str2 = str;
        } else if (i9 != 5002010) {
            str = this.f18700v;
            str2 = this.f18697s;
            f9 = 5.0f;
        } else {
            str = this.f18700v;
            str3 = this.f18694p;
            str4 = str;
            str2 = str4;
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str3));
            com.mbridge.msdk.video.dynview.i.b.a.a(textView2, f10, f9, str4, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.f() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f().getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            cVar.f().setLayoutParams(layoutParams);
        }
        if (this.f18704z) {
            relativeLayout = (RelativeLayout) view.findViewById(b(this.f18687g));
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(a(this.f18687g));
        }
        if (relativeLayout != null) {
            if (com.mbridge.msdk.video.dynview.a.a.f18564a == 0 && com.mbridge.msdk.video.dynview.a.a.b == 0 && com.mbridge.msdk.video.dynview.a.a.f18565c == 0 && com.mbridge.msdk.video.dynview.a.a.f18566d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public final void a(View view, com.mbridge.msdk.video.dynview.c cVar) {
        Context context;
        int a6;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackground(context.getResources().getDrawable(v.a(context, this.f18693o, "drawable")));
            TextView textView = (TextView) view.findViewById(a(this.f18688h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f18695q));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.f18689i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f18695q));
            }
            a6 = ai.a(context, 2.0f);
        } else {
            a6 = ai.a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int a9 = ai.a(context, 8.0f);
        View findViewById = view.findViewById(a(this.f18690j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) cVar.f()).setObjectAnimator(new com.mbridge.msdk.video.dynview.h.b().c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.f18694p));
                textView3.setTextSize(15.0f);
                String str = this.f18700v;
                String str2 = this.f18697s;
                com.mbridge.msdk.video.dynview.i.b.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(a6, a6, a6, a9);
            layoutParams.height = ai.a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    private int a(String str) {
        return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
    }
}
