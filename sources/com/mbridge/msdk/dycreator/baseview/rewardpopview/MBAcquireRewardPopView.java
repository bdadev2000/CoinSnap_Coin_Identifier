package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes3.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f15172a;
    private AcquireRewardPopViewParameters b;

    /* renamed from: c, reason: collision with root package name */
    private AnimationSet f15173c;

    /* renamed from: d, reason: collision with root package name */
    private float f15174d;

    /* renamed from: e, reason: collision with root package name */
    private float f15175e;

    /* renamed from: f, reason: collision with root package name */
    private float f15176f;

    /* renamed from: g, reason: collision with root package name */
    private float f15177g;

    /* renamed from: h, reason: collision with root package name */
    private int f15178h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15179i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15180j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f15181k;
    private final View.OnClickListener l;
    private Runnable m;

    /* renamed from: n, reason: collision with root package name */
    private Runnable f15182n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f15183o;

    /* renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f15184p;

    /* renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f15185q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f15172a = "MBAcquireRewardPopView";
        this.f15174d = 0.0f;
        this.f15175e = 0.0f;
        this.f15176f = 0.0f;
        this.f15177g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f9;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f9 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f9 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f9);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f15178h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f15179i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.f15182n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f15179i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f15183o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f15176f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f15177g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f15176f > MBAcquireRewardPopView.this.f15174d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f15176f - MBAcquireRewardPopView.this.f15174d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f15177g - MBAcquireRewardPopView.this.f15175e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f15180j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                            MBAcquireRewardPopView.this.f15180j = true;
                            View e4 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e4);
                            }
                            if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f15174d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f15175e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f15184p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                }
            }
        };
        this.f15185q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f15179i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public static /* synthetic */ View e(MBAcquireRewardPopView mBAcquireRewardPopView) {
        String str;
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = mBAcquireRewardPopView.b;
        int i9 = acquireRewardPopViewParameters2.viewType;
        if (i9 == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else if (i9 == 2) {
            str = acquireRewardPopViewParameters2.slideSuccessTitle;
        } else {
            str = "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(" " + str + " ");
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a6 = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = mBAcquireRewardPopView.b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int a9 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a10, a9, a10, a9);
        textView.setBackground(a6);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ View f(MBAcquireRewardPopView mBAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(" " + mBAcquireRewardPopView.b.failTitle + " ");
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a6 = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.b.failTipTextColor);
        textView.setText(String.format(mBAcquireRewardPopView.b.failTip, ""));
        int a9 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a10, a9, a10, a9);
        textView.setBackground(a6);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ int i(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i9 = mBAcquireRewardPopView.f15178h;
        mBAcquireRewardPopView.f15178h = i9 - 1;
        return i9;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        View view;
        if (acquireRewardPopViewParameters == null) {
            ad.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.b = acquireRewardPopViewParameters;
        if (acquireRewardPopViewParameters.viewType == 1) {
            ArrayList<String> arrayList = new ArrayList<>();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.b;
            if (acquireRewardPopViewParameters2 != null) {
                List<String> list = acquireRewardPopViewParameters2.rightAnswerList;
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (this.b.wrongAnswerList != null) {
                    int nextInt = new Random().nextInt(this.b.wrongAnswerList.size());
                    if (nextInt > this.b.wrongAnswerList.size() - 1) {
                        nextInt = 0;
                    }
                    arrayList.add(this.b.wrongAnswerList.get(nextInt));
                }
            }
            view = a(arrayList);
            if (this.b.canClickMaskArea) {
                setOnClickListener(this.f15184p);
            }
        } else {
            view = null;
        }
        if (this.b.viewType == 2) {
            int a6 = ai.a(getContext(), 290.0f);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a6, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.b;
            gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters3.successTitleGradientStartColor;
            gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters3.successTitleGradientEndColor;
            gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters3.successTitleShadowColor;
            gradientAndShadowParameters.textSize = 30;
            MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, ai.a(getContext(), 12.0f));
            layoutParams2.gravity = 1;
            mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
            mBGradientAndShadowTextView.setText(" " + this.b.slideTitle + " ");
            mBGradientAndShadowTextView.setGravity(17);
            linearLayout.addView(mBGradientAndShadowTextView);
            GradientDrawable a9 = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
            this.f15181k = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, 0, 0, ai.a(getContext(), 25.0f));
            this.f15181k.setLayoutParams(layoutParams3);
            this.f15181k.setTextSize(12.0f);
            this.f15181k.setGravity(17);
            this.f15181k.setTextColor(this.b.successTipTextColor);
            TextView textView = this.f15181k;
            AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.b;
            textView.setText(String.format(acquireRewardPopViewParameters4.slideTip, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
            int a10 = ai.a(getContext(), 6.0f);
            int a11 = ai.a(getContext(), 32.0f);
            this.f15181k.setPadding(a11, a10, a11, a10);
            this.f15181k.setBackground(a9);
            linearLayout.addView(this.f15181k);
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            imageView.setLayoutParams(layoutParams4);
            imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.m().g()));
            linearLayout.addView(imageView);
            View imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.m().g()));
            linearLayout.addView(imageView2);
            imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    if (MBAcquireRewardPopView.this.f15173c != null) {
                        MBAcquireRewardPopView.this.f15173c.cancel();
                    }
                }
            });
            linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.this.setLongClickable(true);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f15183o);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            view = linearLayout;
        }
        if (view != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.b.containerBackgroundColor);
            addView(view);
            int i9 = this.b.autoDismissTime;
            if (i9 > 0) {
                this.f15178h = i9;
                post(this.m);
                this.f15179i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.m);
    }

    public void onPause() {
        if (this.f15179i && this.f15178h > 0) {
            removeCallbacks(this.m);
        }
    }

    public void onResume() {
        if (this.f15179i && this.f15178h > 0) {
            post(this.m);
        }
    }

    public void onStop() {
        if (this.f15179i && this.f15178h > 0) {
            removeCallbacks(this.m);
        }
    }

    public void onTimeLessThanReduce(int i9) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.b;
        acquireRewardPopViewParameters.reduceTime = i9;
        TextView textView = this.f15181k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i9)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.b;
        int i9 = acquireRewardPopViewParameters.viewBackLayerTopColor;
        int i10 = acquireRewardPopViewParameters.viewBackLayerBottomColor;
        int i11 = acquireRewardPopViewParameters.viewForegroundTopColor;
        int i12 = acquireRewardPopViewParameters.viewForegroundBottomColor;
        int[] iArr = {i9, i10};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable a6 = a(iArr, orientation);
        a6.setCornerRadius(ai.a(getContext(), 12.0f));
        GradientDrawable a9 = a(new int[]{i11, i12}, orientation);
        a9.setCornerRadius(ai.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a6, a9});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        linearLayout.setBackground(layerDrawable);
        ImageView imageView = new ImageView(getContext());
        int a10 = ai.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a10, a10);
        layoutParams2.gravity = 8388613;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.m().g()));
        imageView.setOnClickListener(this.f15185q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int a11 = ai.a(getContext(), 18.0f);
        layoutParams3.setMargins(a11, 5, a11, ai.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.b.title);
        textView.setTextColor(this.b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int a12 = ai.a(getContext(), 8.0f);
            int a13 = ai.a(getContext(), 24.0f);
            int a14 = ai.a(getContext(), 30.0f);
            int a15 = ai.a(getContext(), 12.0f);
            int a16 = ai.a(getContext(), 40.0f);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                boolean contains = this.b.rightAnswerList.contains(arrayList.get(i13));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(a14, a15, a14, 0);
                textView2.setPadding(a13, a12, a13, a12);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i13));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i13));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.b;
                textView2.setTextColor(contains ? acquireRewardPopViewParameters2.buttonTextLightColor : acquireRewardPopViewParameters2.buttonTextDarkColor);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.b;
                int i14 = contains ? acquireRewardPopViewParameters3.buttonBackgroundLightColor : acquireRewardPopViewParameters3.buttonBackgroundDarkColor;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i14);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(a16);
                textView2.setBackground(gradientDrawable);
                textView2.setOnClickListener(this.l);
                linearLayout.addView(textView2);
            }
        }
        this.f15181k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int a17 = ai.a(getContext(), 16.0f);
        int a18 = ai.a(getContext(), 18.0f);
        layoutParams5.setMargins(a18, a17, a18, a17);
        layoutParams5.gravity = 1;
        this.f15181k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f15181k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.b;
        textView3.setText(String.format(acquireRewardPopViewParameters4.tips, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
        this.f15181k.setTextColor(this.b.tipTextColor);
        this.f15181k.setGravity(17);
        this.f15181k.setTextSize(12.0f);
        linearLayout.addView(this.f15181k);
        return linearLayout;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15172a = "MBAcquireRewardPopView";
        this.f15174d = 0.0f;
        this.f15175e = 0.0f;
        this.f15176f = 0.0f;
        this.f15177g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f9;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f9 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f9 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f9);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f15178h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f15179i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.f15182n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f15179i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f15183o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f15176f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f15177g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f15176f > MBAcquireRewardPopView.this.f15174d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f15176f - MBAcquireRewardPopView.this.f15174d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f15177g - MBAcquireRewardPopView.this.f15175e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f15180j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                            MBAcquireRewardPopView.this.f15180j = true;
                            View e4 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e4);
                            }
                            if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f15174d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f15175e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f15184p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                }
            }
        };
        this.f15185q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f15179i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15172a = "MBAcquireRewardPopView";
        this.f15174d = 0.0f;
        this.f15175e = 0.0f;
        this.f15176f = 0.0f;
        this.f15177g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f9;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f9 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f9 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f9);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f15178h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f15179i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.f15182n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f15179i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f15183o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f15176f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f15177g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f15176f > MBAcquireRewardPopView.this.f15174d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f15176f - MBAcquireRewardPopView.this.f15174d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f15177g - MBAcquireRewardPopView.this.f15175e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f15180j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                            MBAcquireRewardPopView.this.f15180j = true;
                            View e4 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e4);
                            }
                            if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f15174d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f15175e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f15184p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                }
            }
        };
        this.f15185q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f15179i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f15172a = "MBAcquireRewardPopView";
        this.f15174d = 0.0f;
        this.f15175e = 0.0f;
        this.f15176f = 0.0f;
        this.f15177g = 0.0f;
        this.l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f9;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f9 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f9 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f9);
                }
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f15178h <= 0) {
                    if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f15179i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.m, 1000L);
            }
        };
        this.f15182n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f15179i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f15183o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f15176f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f15177g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f15176f > MBAcquireRewardPopView.this.f15174d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f15176f - MBAcquireRewardPopView.this.f15174d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f15177g - MBAcquireRewardPopView.this.f15175e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f15180j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.m);
                            MBAcquireRewardPopView.this.f15180j = true;
                            View e4 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e4);
                            }
                            if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f15182n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f15174d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f15175e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f15184p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f15174d, MBAcquireRewardPopView.this.f15175e);
                }
            }
        };
        this.f15185q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f15179i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        mBAcquireRewardPopView.f15173c = animationSet;
        animationSet.addAnimation(translateAnimation);
        mBAcquireRewardPopView.f15173c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f15173c);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        mBAcquireRewardPopView.f15173c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(mBAcquireRewardPopView.f15173c);
    }

    public static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, View view, View view2) {
        mBAcquireRewardPopView.removeView(view);
        mBAcquireRewardPopView.addView(view2);
    }
}
